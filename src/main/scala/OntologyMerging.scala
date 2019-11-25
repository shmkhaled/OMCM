import org.apache.jena.graph
import org.apache.spark.rdd.RDD

class OntologyMerging {
  def Merge(ontology1: RDD[graph.Triple], ontology2: RDD[graph.Triple])={
    val mergedOntology = ontology1.union(ontology2)
  }

}
