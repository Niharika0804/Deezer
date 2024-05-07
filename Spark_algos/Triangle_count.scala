import org.apache.spark.graphx.{GraphLoader, PartitionStrategy}
import org.apache.spark.graphx._
import org.apache.spark.sql.functions._
import org.apache.spark.graphx.lib._

val graph = GraphLoader.edgeListFile(sc, "hdfs://nn.xxxxxxxxx:port_no/Deezer_network.txt", true).partitionBy(PartitionStrategy.RandomVertexCut)
val triCounts = graph.triangleCount().vertices
val users = sc.textFile("hdfs://nn.xxxxxxxxx:port_no/Deezer_id_HR.txt").map { line =>
  line.split(" ") match { case Array(id, name) => (id.toLong, name.toInt) } }
val triCountByUsername = users.join(triCounts).map { case (id, (username, tc)) => (username, tc) }
val top10 = triCountByUsername.top(10)(Ordering.by(_._2))
top10.foreach { case (id, tri) => println(s"User Id: $deezer_id, Number of triangles: $tri_count") }
