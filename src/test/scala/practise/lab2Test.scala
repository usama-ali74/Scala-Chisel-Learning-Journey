package practise

import org.scalatest._
import chiseltest._
import chisel3._

// // Example Q
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

// // Ex2
// class lab2Test extends FreeSpec with ChiselScalatestTester{
//     "new1 Test" in {
//         test(new Ex2()){ c=>
//         c.io.in0.poke(0.B)
//         c.io.in1.poke(0.B)
//         c.io.in2.poke(0.B)
//         c.io.in3.poke(0.B)
//         c.io.in4.poke(0.B)
//         c.io.in5.poke(0.B)
//         c.io.in6.poke(0.B)
//         c.io.in7.poke(1.B)
//         c.io.sel.poke("b111".U)
//         c.clock.step(100)
//         c.io.out.expect(1.B)
//         }
//     }
// }

// // Ex3
// class lab2Test extends FreeSpec with ChiselScalatestTester{
//     "new3 Test" in {
//         test(new mux_onehot_4to1){ c=>
//         c.io.in0.poke(1.U)
//         c.io.in1.poke(1.U)
//         c.io.in2.poke(1.U)
//         c.io.in3.poke(1.U)
//         c.io.sel.poke("b0000".U)
//         c.io.out1.expect(1.U)
//         c.io.out2.expect(0.U)
//         }
//     }
// }


// // Task1
// class lab2Test extends FreeSpec with ChiselScalatestTester{
//     "new2 Test" in {
//     test(new Mux_5to1){ c=>
//     c.io.s0.poke(1.B)
//     c.io.s1.poke(1.B)
//     c.io.s2.poke(0.B)
//     c.io.inp.poke("b10000000100000011000000010000000".U)
//     c.io.out.expect("b100000011000000010000000".U)
//         }
//     }
// }