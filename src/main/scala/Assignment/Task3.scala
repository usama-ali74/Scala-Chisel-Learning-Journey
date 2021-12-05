// Task#3
import scala.util.Random
object Main {
  def main(args: Array[String]): Unit = {
    def helperFunc(arr1:Array[Double],arr2:Array[Double],pointer:Int,ResultantArray:Array[Double]):Array[Double]={
      if (pointer == arr1.length) ResultantArray
      else
      helperFunc(arr1,arr2,pointer+1,ResultantArray:+arr1(pointer)+arr2(pointer))
    }
  def main(arr1:Array[Double],arr2:Array[Double]):Array[Double] ={   
    helperFunc(arr1,arr2,0,Array())
  }
  println(main(Array(1, 2, 3), Array(4, 5, 6)).mkString(","))      
    }
  }