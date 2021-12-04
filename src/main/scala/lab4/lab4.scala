package lab4
import chisel3._
import chisel3.util._


// // Task#Bugged_Alu
// object ALUOP {
//     val ALU_ADD = 0.U(4.W)
//     val ALU_SUB = 1.U(4.W)
//     val ALU_AND = 2.U(4.W)
//     val ALU_OR  = 3.U(4.W)
//     val ALU_XOR = 4.U(4.W)
//     val ALU_SLT = 5.U(4.W)
//     val ALU_SLL = 6.U(4.W)
//     val ALU_SLTU= 7.U(4.W)
//     val ALU_SRL = 8.U(4.W)
//     val ALU_SRA = 9.U(4.W)
//     val ALU_COPY_A = 10.U(4.W)
//     val ALU_COPY_B = 11.U(4.W)
//     val ALU_XXX = 12.U(4.W) 
//     }

// trait Config{
//     val WLEN = 32
//     val ALUOP_SIG_LEN = 4
// }

// import ALUOP._

// class ALUIO extends Bundle with Config {
//     val in_A = Input(UInt(WLEN.W))
//     val in_B = Input(UInt(WLEN.W))
//     val alu_Op = Input(UInt(ALUOP_SIG_LEN.W))
//     val out = Output(UInt(WLEN.W))
//     val sum = Output(UInt(WLEN.W))
// }

// class ALU extends Module with Config {
//     val io = IO(new ALUIO)
//     val sum = io.in_A + Mux(io.alu_Op(0), -io.in_B, io.in_B)
//     val cmp = Mux(io.in_A(WLEN-1) === io.in_B(WLEN-1), sum(WLEN-1),
//                 Mux(io.alu_Op(1), io.in_A(WLEN-1), io.in_B(WLEN-1)))
//     val shamt = io.in_A(4,0).asUInt
//     val shin = Mux(io.alu_Op(3), Reverse(io.in_A), io.in_A)
//     val shiftr = (Cat(io.alu_Op(0) & shin, shin(WLEN-1)).asSInt >> shamt)(WLEN-1,0)
//     val shiftl = Reverse(shiftr)
//     val out = Mux(io.alu_Op === ALU_ADD || io.alu_Op === ALU_SUB, sum, 
//     Mux(io.alu_Op === ALU_SLT || io.alu_Op === ALU_SLTU, cmp, 
//     Mux(io.alu_Op === ALU_SRA || io.alu_Op === ALU_SRL, shiftl,
//     Mux(io.alu_Op === ALU_SLL, shiftr, 
//     Mux(io.alu_Op === ALU_AND, (io.in_A & io.in_B),
//     Mux(io.alu_Op === ALU_OR, (io.in_A | io.in_B),
//     Mux(io.alu_Op === ALU_XOR, (io.in_A ^ io.in_B),
//     Mux(io.alu_Op === ALU_COPY_A, io.in_A, 
//     Mux(io.alu_Op === ALU_COPY_B, io.in_A, 0.U)))))))))

//     io.out := out
//     io.sum := sum

// }


// Assignment
// Task 1
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

// object BALUOP {
//     val BEQ = 16.U(5.W)
//     val BNE = 17.U(5.W)
//     val BLT = 20.U(5.W)
//     val BGE = 21.U(5.W)
//     val BLTU= 22.U(5.W)
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
