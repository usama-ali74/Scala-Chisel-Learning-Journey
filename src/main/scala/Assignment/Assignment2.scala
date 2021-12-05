// // Exercise Question
// object MyModule {
//   def fib (n:Int):Int = {
//     def help(n: Int, a: Int, b: Int): Int ={
//       if (n == 0) a
//       else {
//         println(n)
// //        println(b)
//         help(n-1,b, a+b)
//       }
//     }
//     help(n,0,1)
//   }
            
//     private def formatAbs(x:Int) = {
//       val msg = "The absolute value of %d is %d"
//       msg.format(x, fib(x))
//     }
//     def main(args: Array[String]): Unit = 
//     println(formatAbs(7))
//   }


// // Question#1
// import scala.util.Random
// object Main {
//   def main(args: Array[String]): Unit = {

//     ///Question 1
//       var myList = Array(1, 2, 3, 3)
    
//       Print all the array elements
//       for ( x <- myList ) {
//          println( x )
//     }
//   }
// }


// // Question#2
// object Main {
//   def main(args: Array[String]): Unit = {
// //using val the map and set is immutable but using var set and map is mutable
//     val map1 = Map(1 -> "Hello",2 -> "world")
//     // map1 += (3 -> "Usama") 
//     println(map1)
//     var map2 = Map(1 -> "Hello",2 -> "world")
//     map2 += (3 -> "Usama")
//     println(map2)
//     val set1=Set(1,2,3)
//     // set1+=(5)
//     println(set1)
//     var set2=Set(2,8,9)
//     set2+=(6)
//     println(set2)
//   }
// }


// // Question#3
// import scala.util.Random
// object Main {
//   def main(args: Array[String]): Unit = {
//   def Optionfunc(p1: Option[Int]): Unit = {
//   println(p1)
//   }
//   Optionfunc(Some(6))
//   }
// }


// Question#4
import scala.util.Random
object Main {
  def main(args: Array[String]): Unit = {

var x=List(1,5,6,7,8,9)
  println(x.head)
  println(x.tail)
  println(x.length)
  val array = Array(1,2,3,4,2,2,2)
    println(array.head)
    println(array.tail)
    println(array.length)
  }
}


// // Assignments
// Task#1
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





// Task#2
import scala.util.Random
object Main {
  def main(args: Array[String]): Unit = {

  def helper(list:List[Char], s:Int, e:Int):List[Char] = {
      if(s == e) 
      list.reverse
      else helper(s.toChar :: list, s + 1, e)
    }
   def charArray(start:Int,end:Int):List[Char] = {
   
    helper(List(), start, end)
  }
  println(charArray(97,100))}
}


// // Task#3
// import scala.util.Random
// object Main {
//   def main(args: Array[String]): Unit = {
//     def helperFunc(arr1:Array[Double],arr2:Array[Double],pointer:Int,ResultantArray:Array[Double]):Array[Double]={
//       if (pointer == arr1.length) ResultantArray
//       else
//       helperFunc(arr1,arr2,pointer+1,ResultantArray:+arr1(pointer)+arr2(pointer))
//     }
//   def main(arr1:Array[Double],arr2:Array[Double]):Array[Double] ={   
//     helperFunc(arr1,arr2,0,Array())
//   }
//   println(main(Array(1, 2, 3), Array(4, 5, 6)).mkString(","))      
//     }
//   }



// // Task#4
// import scala.util.Random
// object Main {
//   def main(args: Array[String]): Unit = {

//   def helperFunc(arr:Array[Int],ResultantArray:Array[Int],pointer:Int):Array[Int]={
//      if (pointer==arr.length)
//       ResultantArray
     
//      else
//       helperFunc(arr,if(arr(pointer)%2==0) ResultantArray :+ arr(pointer) else ResultantArray,pointer+1)
//    }
    
//   def even(arr:Array[Int]):Array[Int]={
//       helperFunc(arr,Array(),0)
 
//  }
//   println((Array.fill(100)(util.Random.nextInt(100)).count(_%2 == 0))) 
//   println(even(Array.fill(100)(util.Random.nextInt(100))).mkString(","))
  
//   }
// }

