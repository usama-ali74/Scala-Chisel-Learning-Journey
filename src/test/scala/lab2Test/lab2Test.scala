package practise

import org.scalatest._
import chiseltest._
import chisel3._

// class lab2Test extends FreeSpec with ChiselScalatestTester{
//     "new1 Test" in {
//         test(new Mem_bundle_intf()){ c=>
//         c.io.data_in(0).poke(15.U)
//         c.io.data_in(1).poke(16.U)
//         c.io.data_in(2).poke(17.U)
//         c.io.data_in(3).poke(18.U)
//         c.io.addr.poke("b00010".U)
//         c.io.wr_en.poke(1.B)
//         c.clock.step(100)
//         c.io.data_selector.poke("b01".U)
//         c.clock.step(100)
//         c.io.wr_en.poke(0.B)
//         c.io.data_out.expect(15.U)
//         }
//     }
// }