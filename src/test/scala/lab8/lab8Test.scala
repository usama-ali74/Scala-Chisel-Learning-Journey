package lab8
import chisel3._
import chiseltest._
import org.scalatest._

// class lab8Test extends FreeSpec with ChiselScalatestTester{
//     "WMaskedReadWriteSmem test" in {
//         test(new WMaskedReadWriteSmem()){c=>
//         c.io.dataIn.poke(15.U)
//         c.io.write.poke(1.B)
//         c.io.addr.poke(5.U)
//         c.io.mask.poke(1.U)
//         c.io.enable.poke(1.B)
//         c.clock.step(10)
//         c.io.dataOut.expect(15.U)
//         c.clock.step(100)
//         }
//     }
// }

// class lab8Test extends FreeSpec with ChiselScalatestTester{
//     "Forwarding test" in {
//         test(new Forwarding()){c=>
//         c.io.write.poke(0.B)
//         c.clock.step(50)
//         c.io.Raddrs.poke("b100111000".U)
//         c.clock.step(50)
//         c.io.dataIn.poke(25.U)
//         c.clock.step(50)
//         c.io.Waddrs.poke("b100111000".U)
//         c.clock.step(50)
//         c.io.dataOut.expect(0.U)
//         c.clock.step(50)
//         }
//     }
// }



// class lab8Test extends FreeSpec with ChiselScalatestTester{
//     "Inst Mem test" in  {
//         test(new InstMem("C:/Users/Usama Ali/Downloads/Scala-Chisel-Learning-Journey-main/Scala-Chisel-Learning-Journey-main/src/main/scala/instruction.txt")){c=>
//         c.io.addr.poke(1.U)
//         c.clock.step(50)
//         // c.io.inst.expect(400293.U)
//         c.clock.step(50)
//         }
//     }
// }