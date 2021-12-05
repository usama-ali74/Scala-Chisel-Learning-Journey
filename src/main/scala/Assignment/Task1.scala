sk#1
import scala.util.Random
object Main {
  def main(args: Array[String]): Unit = {
    def helperFunc(arr:List[Int],start:Int, end:Int,size:Int):List[Int]={
      if (size==arr.length)
        arr
      else
      helperFunc(arr :+ Random.between(start,end),start,end,size)
    }
    
    
    def RandomGenerator(start:Int, end:Int,size:Int):List[Int]={
            helperFunc(List(),start,end,size)
    }
    val randomGen = RandomGenerator(50,100,15)
    println(randomGen)
    def quickSort(list: List[Int]): List[Int] = {
    list match {
      case Nil        => Nil
      case a :: Nil   => List(a)
      case a :: tail  => quickSort(tail.filter(x=> x <= a)) ::: List(a) ::: quickSort(tail.filter(x => x > a))
        }
      }
    print(quickSort(randomGen))

  }
}