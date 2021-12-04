package lab3
import org.scalatest._
import chiseltest._
import chisel3._

// class lab3Test extends FreeSpec with ChiselScalatestTester{
//     "Decoder2to4 test" in {
//         test(new Decoder2to4()){ c=>
//         c.io.in.poke("b00".U)
//         c.io.out.expect("b0001".U)   
//         }
//     }
// } 

// class lab3Test extends FreeSpec with ChiselScalatestTester{
//     "Encoder4to2 test" in {
//         test(new Encoder4to2()){ c=>
//         c.io.in.poke("b0001".U)
//         c.io.out.expect("b00".U)   
//         }
//     }
// }

// class lab3Test extends FreeSpec with ChiselScalatestTester{
//     "AlU test" in{
//         test(new alu()){ c=>
//         c.io.A.poke(15.U)
//         c.io.B.poke(15.U)
//         c.io.selec.poke(0.U)
//         c.io.ins.poke("b01000000011000101000001110110011".U)
//         c.io.out.expect(0.B)
//         c.io.output.expect(0.U)
//         }
//     }
// }

// class lab3Test extends FreeSpec with ChiselScalatestTester{
//     "Branch Control Test" in{
//         test(new Branch()){c=>
//         c.io.A.poke(1.S)
//         c.io.B.poke(1.S)
//         c.io.branch.poke(1.B)
//         c.io.selec.poke(0.U)
//         c.io.br_taken.expect(0.B)
//         c.io.output.expect(1.S)
//         }
//     }
// }

// class lab3Test extends FreeSpec with ChiselScalatestTester{
//     "Immediate Extension test" in {
//         test(new ImmediateExtension()){c=>
//         c.io.ins.poke("b1000101000001101101111".U)
//         c.io.immediate_Se.expect(163842.S)
//         }
//     }
// }

// class lab3Test extends FreeSpec with ChiselScalatestTester{
//     "Valid Decoder2to4" in {
//         test(new Decoder2to4Valid()){c=>
//         c.io.in.poke("b00".U)
//         c.io.out.bits.expect("b0001".U)
//         }
//     }
// }