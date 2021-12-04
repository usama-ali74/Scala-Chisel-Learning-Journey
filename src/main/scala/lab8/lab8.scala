package lab8
import chisel3._
import chisel3.util._
import chisel3.util.experimental.loadMemoryFromFile
import scala.io.Source

// class WMaskedReadWriteSmem extends Module {
//     val width : Int = 32
//     val io = IO ( new Bundle {
//         val enable = Input (Bool())
//         val write = Input (Bool())
//         val addr = Input (UInt(10.W))
//         val mask = Input (UInt(3.W))
//         val dataIn = Input (UInt(width.W)) 
//         val dataOut = Output (UInt(width.W)) 
//     })
//     // Create a 32 - bit wide memory that is byte - masked
//     val mem = SyncReadMem(1024,UInt(width.W))
//     // write with mask
//     mem.write(io.addr,io.dataIn)
//     switch(io.mask){
//         is(1.U){
//             mem.write(io.addr,io.dataIn(7,0))
//         }
//         is(2.U){
//             mem.write(io.addr,io.dataIn(15,0))
//         }
//         // is(3.U){
//         //     mem.write(io.addr,io.dataIn(23,0))
//         // }is(4.U){
//         //     mem.write(io.addr,io.dataIn(31,0))
//         // }
//     }
//     io.dataOut := mem.read(io.addr,io.enable)
// }

// class Forwarding extends Module {
//     val width : Int = 32
//     val io = IO ( new Bundle {
//         val write = Input ( Bool () )
//         val Raddrs = Input ( UInt (10. W ) )
//         val Waddrs = Input ( UInt (10. W ) )
//         val dataIn = Input (UInt ( width . W )) 
//         val dataOut = Output (UInt ( width . W )) 
//     })
//     val memory = SyncReadMem (32 , UInt ( width . W ) )
//     val wrDataReg = RegNext ( io .dataIn)
//     val doForwardReg = RegNext ( io.Raddrs === io .Waddrs && io .write )
//     val memData = memory . read ( io . Raddrs )
//     when ( io .write)
//     {
//     memory . write ( io . Waddrs , io .dataIn)
//     }
//     io .dataOut := Mux ( doForwardReg , wrDataReg , memData )

// }


// class InstMemIO extends Bundle{
//     val addr = Input (UInt(32.W))
//     val inst = Output (UInt(32.W))
// }

// class InstMem (initFile:String) extends Module{
//     val io = IO(new InstMemIO)
//     val INST_MEM_LEN = 1024
//     // INST_MEM_LEN in Bytes or INST_MEM_LEN / 4 in words
    
//     val imem = Mem(INST_MEM_LEN,UInt(32.W))
//     loadMemoryFromFile(imem,initFile)
//     io.inst := imem(io.addr)
// }

