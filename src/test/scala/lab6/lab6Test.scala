package lab6
import chisel3._
import org.scalatest._
import chiseltest._

// class lab6Test extends FreeSpec with ChiselScalatestTester{
//     "Reg File test" in {
//         test(new RegFile()){c=>
//         c.io.raddr1.poke(1.U)
//         c.io.raddr2.poke(2.U)
//         c.io.wen.poke(1.B)
//         c.io.waddr.poke(1.U)
//         c.io.wdata.poke(20.U)
//         c.clock.step(100)
//         }
//     }
// }

// class lab6Test extends FreeSpec with ChiselScalatestTester{
//     "Pipe test" in {
//         test(new Pipe()){c=>
//         c.io.in.bits.poke(25.U)
//         c.io.in.valid.poke(1.B)
//         c.clock.step(100)
//         c.io.out.bits.expect(25.U)
//         c.io.out.valid.expect(1.B)
//         }
//     }
// }


// class lab6Test extends FreeSpec with ChiselScalatestTester{
//     "shift register test" in {
//         test(new shift_register()){c=>
//         c.io.in.poke(31.U)
//         c.clock.step(500)
//         c.io.out.expect(32.U)
//         }
//     }
// }


// class lab6Test extends FreeSpec with ChiselScalatestTester{
//     "Modified Counter test" in {
//         test(new counter(125)){c=>
//         c.io.out.expect(2.U)
//         }
//     }
// }

// class lab6Test extends FreeSpec with ChiselScalatestTester{
//     "My_Queue test" in {
//         test(new My_Queue()){c=>
//         c.io.in0.bits.poke(2.U)
//         c.io.in0.valid.poke(1.B)
//         c.io.out.ready.poke(1.B)
//         c.clock.step(100)
//         }
//     }
// }


// class lab6Test extends FreeSpec with ChiselScalatestTester{
//     "CounterWithXor test" in {
//         test(new counter_with_xor()){c=>
//         c.io.out.expect(0.U)
//         c.clock.step(200)
//         }
//     }
// }


// class lab6Test extends FreeSpec with ChiselScalatestTester{
//     "shift_Register_with_parallel_load test" in {
//         test(new shift_reg_with_parallel_load()){c=>
//         c.io.load.poke(0.B)
//         c.io.in.poke(1.B)
//         c.io.load_in(0).poke(1.B)
//         c.io.load_in(1).poke(0.B)
//         c.io.load_in(2).poke(1.B)
//         c.io.out(0).expect(1.B)
//         c.io.out(1).expect(0.B)
//         c.io.out(2).expect(1.B)
//         c.clock.step(200)
//         }
//     }
// }


// class lab6Test extends FreeSpec with ChiselScalatestTester{
//     "up_down_counter test" in {
//         test(new up_down_counter()){c=>
//         c.io.up_down.poke(1.B)
//         c.clock.step(200)
//         c.io.out.expect(8.U)
//         }
//     }
// }

