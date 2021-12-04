package lab3
import chisel3._
import chisel3.util._

// // Exercise#1
// class EncoderIO extends Bundle {
//     val in = Input ( UInt (4.W ) )
//     val out = Output ( UInt (2.W ) )
// }

// class Encoder4to2 extends Module {
//     val io = IO (new EncoderIO )
//     io.out := 0.U
//     switch( io.in ) {
//         is("b0001".U ) {
//     io.out := "b00".U
// }
//     is("b0010".U ) {
//         io.out := "b01".U
//     }
//     is("b0100".U ) {
//         io.out := "b10".U
// }
//     is ("b1000".U ) {
//     io.out := "b11".U
//         }
//     }   
// }


// // Exercise#2
// class alu extends Module{
//     val io = IO(new Bundle{
//     val A = Input(UInt(32.W))
//     val B = Input(UInt(32.W))
//     val selec = Input(UInt(5.W))
//     val output = Output(UInt(32.W))
//     val out = Output(Bool())
//     val ins = Input(UInt(32.W))
//     })

//     io.output := 0.U
//     switch(io.selec){
//         is (0.U){
//             io.output :=  io.A + Mux( io.ins (30) , -io.B , io.B )
//         }

//     //sll
//     is (1.U){
//         io.output := io.A << io.B(4,0)
//     }

//     //SLT
//     is (2.U){
//         when(io.A < io.B){
//             io.output:= 1.U
//         }.otherwise{
//             io.output:=0.U
//         }    
//     }

//     //BLT
//     is (3.U){
//         when(io.A < io.B){
//             io.output:= 1.U
//         }.otherwise{
//             io.output:=0.U
//         }
//     }

//     //xor
//     is(4.U){
//         io.output:=io.A^io.B
//     }

//     //slr
//     is(5.U){
//         io.output:=io.A >> io.B(4,0)
//     }

//     //or
//     is(6.U){
//         io.output:=io.A | io.B
//     }

//     //AND
//     is(7.U){
//         io.output:=io.A & io.B
//     }

//     // //SRA
//     // is(13.U){
//     //     when (A(31.U)===1.U){
//     //         var minus := io.A >> io.B(4,0)
//     //     }
//     // }

//     //BEQ
//     is(8.U){
//         when(io.A === io.B){
//             io.output:= 1.U
//         }.otherwise{
//             io.output:=0.U
//         }
//     }

//     //bne
//     is(9.U){
//         when(io.A =/= io.B){
//             io.output:= 1.U
//         }.otherwise{
//             io.output:=0.U
//         }
//     }

//     //bge
//     is(10.U){
//         when(io.A >= io.B){
//             io.output:= 1.U
//         }.otherwise{
//             io.output:=0.U
//         }
//     }

//     //blt
//     is(11.U){
//         when(io.A < io.B){
//             io.output:= 1.U
//         }.otherwise{
//             io.output:=0.U
//         }
//     }
//     }

    
//     when (io.output === 1.U & io.selec(4,3) === "b10".U){
//         io.out := 1.U
//     }.otherwise{
//         io.out := 0.U
//     }

//         }

