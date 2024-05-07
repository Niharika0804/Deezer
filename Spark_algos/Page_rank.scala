import org.apache.spark.graphx.GraphLoader
import org.apache.spark.graphx._
import org.apache.spark.sql.functions._

val graph = GraphLoader.edgeListFile(sc, "hdfs://nn.xxxxxxxxx:port_no/deezer_network.txt")
val pageRank = graph.pageRank(0.85).vertices
val top10 = pageRank.top(10)(Ordering.by(_._2))
top10 foreach {case (cc, size) => println(s"Component ID: $cc, Score: $size")}
