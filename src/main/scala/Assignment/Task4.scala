// Task#4
import scala.util.Random
object Main {
  def main(args: Array[String]): Unit = {

  def helperFunc(arr:Array[Int],ResultantArray:Array[Int],pointer:Int):Array[Int]={
     if (pointer==arr.length)
      ResultantArray
     
     else
      helperFunc(arr,if(arr(pointer)%2==0) ResultantArray :+ arr(pointer) else ResultantArray,pointer+1)
   }
    
  def even(arr:Array[Int]):Array[Int]={
      helperFunc(arr,Array(),0)
 
 }
  println((Array.fill(100)(util.Random.nextInt(100)).count(_%2 == 0))) 
  println(even(Array.fill(100)(util.Random.nextInt(100))).mkString(","))
  
  }
}

