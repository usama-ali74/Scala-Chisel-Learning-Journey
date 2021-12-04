package lab5
import chisel3._
import chisel3.util._
// import chisel3.iotesters.{ChiselFlatSpec,Driver,PeekPokeTester}


// // practise
// class eMux [ T <: Data ]( gen : T ) extends Module {
//     val io = IO (new Bundle {
//     val out = Output (gen)
//     val in1 = Input (gen)
//     val in2 = Input (gen)
//     val sel = Input (Bool())
//     })

//     io . out := Mux2_to_1 ( io . in2 , io . in1 , io . sel )
//     def Mux2_to_1 [ T <: Data ]( in_0 :T , in_1 :T , sel : Bool ) : T = {
//     Mux( sel , in_1 , in_0 )
//     }
// }


// // Exercise#1
// class ALU_stat extends Module {
//     val io = IO(new Bundle{
//         val a = Input(UInt(32.W))
//         val b = Input(UInt(32.W))
//         val sel = Input(UInt(5.W))
//         val out = Output(UInt(32.W))
//         val ins = Input(UInt(32.W))     
//     })

//     io.out := 0.U

//     when(io.sel==="b00000".U & io.ins(0)===0.U){
//         io.out := io.a + io.b
//     }
//     .elsewhen(io.sel==="b00000".U & io.ins(30)===1.U){
//         io.out := io.a - io.b
//     }
//     .elsewhen(io.sel === "b00001".U){
//         io.out := io.a << io.b(4,0)
//     }
//     .elsewhen(io.sel === "b00010".U){
//         when(io.a < io.b){
//             io.out := 1.U
//         }.otherwise{
//             io.out := 0.U
//         }
//     }

//     // .elsewhen(io.sel === "b00011".U){
//     //     var temp1 = io.a.asSInt
//     //     var temp2 = io.b.asSInt
//     //     when(temp1<temp2){
//     //         io.out := 1.U
//     //     }.elsewhen{
//     //         io.out := 0.U
//     //     }
//     // }

//     .elsewhen(io.sel === "b00100".U){
//         io.out := io.a ^ io.b
//     }
//     .elsewhen(io.sel==="b00101".U & io.ins(31)===0.U){
//         io.out := io.a >> io.b(4,0)
//     }
//     .elsewhen(io.sel==="b00101".U & io.ins(31)===1.U){
//         when(io.ins(31)===1.U){
//             io.out := io.a >> io.b(4,0)
//         }.otherwise{
//             io.out := 0.U
//         }
//     }.elsewhen(io.sel==="b00110".U){
//         io.out := io.a | io.b
//     }.elsewhen(io.sel==="b00111".U){
//         io.out := io.a & io.b
//     }.otherwise{
//         io.out := 0.U
//     }
// }

// // Exercise#2
// class Mux_Bundle[ T <: Data](gen:T) extends Bundle{
//         val in01 = Input(gen)
//         val in02 = Input(gen)
//         val sel = Input(Bool())
//         val out = Output(gen)
// }

// class Mux_Module extends Module{
//     val io = IO(new Mux_Bundle(UInt(32.W)))
//     io.out := Mux(io.sel, io.in01, io.in02)
// }


// // Exercise#3
// class Operator [ T <: Data ]( n : Int , generic : T ) ( op : (T , T ) => T ) extends
//     Module {require ( n > 0)   // " reduce only works on non - empty Vecs "
//     val io = IO ( new Bundle {
//         val in = Input (Vec(n,generic) )
//         val out = Output (Vec(n,generic))
// })
//     io.out(0) :=io.in.reduce(op)
//     io.out(1) :=io.in.reduce(op)
//     io.out(2) :=io.in.reduce(op)
//     io.out(3) :=io.in.reduce(op)

// }


// // Assignment Questionz

// // Task#1
// class Adder ( Width : Int ) extends Module {
//     require ( Width >= 0)
//     val io = IO (new Bundle{
//     val in_0 = Input(UInt(Width.W))
//     val in_1 = Input(UInt(Width.W))
//     val sum = Output(UInt(Width.W))
//     })
//     io.sum := io.in_0 + io.in_1
// }


// // Task#2
// class DataPacket [T<:Data](generic:T) extends Bundle{
//     val databits = generic
//     val addressbits = UInt(5.W)
// }
// class Router extends Module {
//     val io = IO ( new Bundle {
//         val in = Input(new DataPacket(UInt(32.W))) 
//         val out = Output(in)    
//     })
    
//     io.out := io.in
// }


