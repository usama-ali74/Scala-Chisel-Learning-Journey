// Question#2
object Main {
  def main(args: Array[String]): Unit = {
//using val the map and set is immutable but using var set and map is mutable
    val map1 = Map(1 -> "Hello",2 -> "world")
    // map1 += (3 -> "Usama") 
    println(map1)
    var map2 = Map(1 -> "Hello",2 -> "world")
    map2 += (3 -> "Usama")
    println(map2)
    val set1=Set(1,2,3)
    // set1+=(5)
    println(set1)
    var set2=Set(2,8,9)
    set2+=(6)
    println(set2)
  }
}
