package lab3
import chisel3._
import chisel3.util._


// // Task#1
// class Branch extends Module{
//     val io = IO(new Bundle{
//         val A = Input(SInt(32.W))
//         val B = Input(SInt(32.W))
//         val branch = Input(Bool())
//         val selec = Input(UInt(5.W))
//         val output = Output(SInt(32.W))
//         val br_taken = Output(Bool())
//         })
//     io.output := 0.S
//     switch(io.selec){
//         //BEQ
//         is(0.U){
//             when(io.A === io.B){
//                 io.output:= 1.S
//             }.otherwise{
//                 io.output:=0.S
//             }
//         }

//         //bne
//         is(1.U){
//             when(io.A =/= io.B){
//                 io.output:= 1.S
//             }.otherwise{
//                 io.output:=0.S
//             }
//         }

//         //blt
//         is(3.U){
//             when(io.A < io.B){
//                  io.output:= 1.S
//             }.otherwise{
//                 io.output:=0.S
//             }
//         }

//         //bge
//         is(21.U){
//             when(io.A >= io.B){
//                 io.output:= 1.S
//             }.otherwise{
//                 io.output:=0.S
//             }
//         }

//         //bltu
//         is(22.U){
//             when(io.A.asUInt < io.B.asUInt){
//                 io.output:= 1.S
//             }.otherwise{
//                 io.output:=0.S
//             }
//         }

//         //bgtu
//         is(23.U){
//             when(io.A.asUInt > io.B.asUInt){
//                 io.output:= 1.S
//             }.otherwise{
//                 io.output:=0.S
//             }
//         }

//     }

//     when (io.output === 1.S & io.selec(4,3) === "b10".U & io.branch === 1.B){
//         io.br_taken := 1.B
//     }.otherwise{
//         io.br_taken := 0.B
//     }

// }


// // Task # 2
// class ImmediateExtension extends Module{
//     val io = IO(new Bundle{
//         val ins = Input(UInt(32.W))
//         val immediate_Se = Output(SInt(32.W))
//     })
//     val op_code = io.ins(6,0)
//     var immediate = Wire(SInt(32.W))
//     immediate := 0.S
//     var imm1 = 0.S
//     var imm2 = 0.S
//     var imm3 = 0.S
//     var imm4 = 0.S

//     switch(op_code){
//         // I type
//         is("b0010011".U){
//           immediate := io.ins(31,20).asSInt
//         }
//         // L type
//         is("b0000011".U){
//             immediate := io.ins(31,20).asSInt         
//         } 
//         //  S type
//         is("b0100011".U){
//             imm1 = io.ins(11,7).asSInt
//             imm2 = io.ins(31,25).asSInt
//             immediate := Cat(imm2,imm1).asSInt        
//         }
//         //  B type
//         is("b1100011".U){
//             imm1 = io.ins(7).asSInt
//             imm2 = io.ins(11,8).asSInt
//             imm3 = io.ins(30,25).asSInt
//             imm4 = io.ins(31).asSInt
//             immediate := Cat(imm4,imm1,imm3,imm2,0.U).asSInt         
//         }
//         // U type lui
//         is("b0110111".U){
//             immediate := io.ins(31,12).asSInt         
//         } 
//         // U type auipc
//         is("b0010111".U){
//             immediate := io.ins(31,12).asSInt         
//         } 
//         // UJ type JAL
//         is("b1101111".U){
//             imm1 = io.ins(19,12).asSInt // 10:1
//             imm2 = io.ins(20).asSInt // 11
//             imm3 = io.ins(30,21).asSInt // 19:12
//             imm4 = io.ins(31).asSInt // 20
//             immediate := Cat(imm4,imm1,imm2,imm3,0.S).asSInt         
//         }                    
//         // UJ type JALR
//         is("b1100111".U){
//             immediate := io.ins(31,20).asSInt         
//         } 
        
//     }
    
//         io.immediate_Se := immediate
    
// }


// Task # 3
class Decoder2to4Valid extends Module{
    val io = IO(new Bundle{
        val in = Input(UInt(2.W))
        val out = Valid(Output(UInt(4.W)))
    })
    when(io.in === "b00".U){
        io.out.bits := "b0001".U
        io.out.valid := 1.B
    }.elsewhen(io.in === "b01".U){
        io.out.bits := "b0010".U
        io.out.valid := 1.B
    }.elsewhen(io.in === "b10".U){
        io.out.bits := "b0100".U
        io.out.valid := 1.B
    }.otherwise{
        io.out.bits := "b1000".U
        io.out.valid := 1.B
    }
}


