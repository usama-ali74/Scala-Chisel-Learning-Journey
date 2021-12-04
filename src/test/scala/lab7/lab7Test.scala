package lab7
import chisel3._
import org.scalatest._
import chiseltest._


// class lab7Test extends FreeSpec with ChiselScalatestTester{
//     "Detect seq test" in {
//         test(new Detect_Seq()){c=>
//         c.io.in.poke(1.B)
//         c.clock.step(2)
//         c.io.in.poke(0.B)
//         // c.io.out.expect(0.B)
//         c.clock.step(100)
//         }
//     }
// }



// class lab7Test extends FreeSpec with ChiselScalatestTester{
//     "FSM task1 test" in {
//         test(new My_Queue()){c=>
//         c.io.f1.poke(0.B)
//         c.io.f2.poke(1.B)
//         c.io.r1.poke(0.B)
//         c.io.r2.poke(1.B)
//         c.io.out.expect(3.U)
//         c.clock.step(50)
//         }
//     }    
// }


// class lab7Test extends FreeSpec with ChiselScalatestTester{
//     "manchester wave" in  {
//         test (new Manchester_Encoding()){c=>
//         c.io.in.poke(1.U)
//         c.io.start.poke(1.B)
//         c.io.flag.expect(1.U)
//         c.io.out.expect(0.U)
//         c.clock.step(50)
//         }
//     }
// }