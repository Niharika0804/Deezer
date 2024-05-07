Information regarding the team members:
1. Niharika 22bds050
2. Dhrithi 22bds018
3. Pakhi 22bds042
# Deezer
In the dataset folder, all the data for each country Hungary, Croatia and Romania are included.
The data is from the music streaming service Deezer (November 2017) which we have collected SNAP. These datasets represent friendhips networks of users from 3 European countries Romania, Croatia and Hungary. Nodes represent the users and edges are the mutual friendships. We reindexed the nodes in order. The txt files contain the edges -- nodes are indexed from 0. 

Country #Nodes   #Edges
--------------------------	
RO	41,773	 125,826
HR	54,573	 498,202
HU	47,538	 222,887

# Algorithms that are used: 
(Executed on single-node Hadoop and Spark)
1. Page_Rank Algorithm 
2. Connected_Components Algorithm
3. Triangle_Count Algorithm

# Dataset Information
1. Romania:
   user connections => RO_edges.txt
   user ids => deezer_id_RO.txt
2. Croatia:
   user connections => HR_edges.txt
   user ids => deezer_id_HR.txt
3. Hungary:
   user connections => HU_edges.txt
   user ids => deezer_id_HU.txt
   
**IMPORTANT NOTE**
Please set the Apache Hadoop and Spark environment before executing the algorithms.
Make sure to upload the data into the Hadoop HDFS.
The link our report: 
