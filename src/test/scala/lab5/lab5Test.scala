package lab5
import chisel3._
import org.scalatest._
import chiseltest._

// class lab5Test extends FreeSpec with ChiselScalatestTester{
//     "eMux Test" in{
//         test(new eMux(SInt(32.W))){c=>
//         c.io.in1.poke(1.S)
//         c.io.in2.poke(2.S)
//         c.io.sel.poke(1.B)
//         c.io.out.expect(1.S)
//         }
//     }
// }


// class lab5Test extends FreeSpec with ChiselScalatestTester{
//     "ALU Test" in{
//         test(new ALU_stat()){c=>
//         c.io.a.poke(5.U)
//         c.io.b.poke(6.U)
//         c.io.sel.poke(0.U)
//         c.io.out.expect(1.U)
//         c.io.ins.poke("b00100000010100110000001110110011".U)
//         }
//     }
// }

// class lab5Test extends FreeSpec with ChiselScalatestTester{
//     "Mux Bundle Test" in {
//         test(new Mux_Module()){c=>
//         c.io.in01.poke(1.U)
//         c.io.in02.poke(2.U)
//         c.io.out.expect(2.U)
//         c.io.sel.poke(1.B)
//         }
//     }
// }


// class lab5Test extends FreeSpec with ChiselScalatestTester{
//     "Vector example test" in{
//         test(new Operator(4,UInt(4.W))(_ + _)){c=>
//         c.io.in(0).poke(1.U)
//         c.io.in(1).poke(2.U)
//         c.io.in(2).poke(3.U)
//         c.io.in(3).poke(4.U)
//         c.io.out(0).expect(1.U)
//         c.clock.step(100)
//         }
//     }
// }

// class lab5Test extends FreeSpec with ChiselScalatestTester{
//     "Adder_para test" in{
//         test(new Adder(32)){c=>
//         c.io.in_0.poke(1.U)
//         c.io.in_1.poke(2.U)
//         c.io.sum.expect(3.U)
//         c.clock.step(10)
//         }
//     }
// }


// class lab5Test extends FreeSpec with ChiselScalatestTester{
//     "Router test" in{
//         test(new Router()){c=>
//         c.io.in.databits.poke(12.U)
//         c.io.in.addressbits.poke("b101".U)
//         c.io.out.databits.expect(12.U)
//         c.io.out.addressbits.expect(5.U)
//         }
//     }
// }