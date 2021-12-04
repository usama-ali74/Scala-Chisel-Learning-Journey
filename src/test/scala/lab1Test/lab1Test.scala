// package practise

// import org.scalatest._
// import chiseltest._
// import chisel3._

// class lab1Test extends FreeSpec with ChiselScalatestTester{
//     "Counter Test" in {
//         test(new counter_up_down(5)){ c=>
//         c.io.data_in.poke(5.U)
//         c.io.reload.poke(1)
//         c.clock.step(100)
//         }
//     }
// }

// class lab1Test extends FreeSpec with ChiselScalatestTester{
//     "Adder With Offset Test" in {
//         test(new Counter(5,32.U)){ c=>
//         c.clock.step(35)
//         // c.io.x.poke(1.S)
//         // c.io.y.poke(2.U)
//         // c.io.z.expect(27.U)
//         }
//     }
// }
