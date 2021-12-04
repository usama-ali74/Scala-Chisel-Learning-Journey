package practise
import chisel3._
import chisel3.util._

// class lab2practise extends Module {
//     val io = IO(new Bundle{
//         val x = Input(UInt(1.W))
//         val y = Input(UInt(30.W))
//         val sum = Output(UInt(2.W))
//     })
//     io.sum := io.x +& io.y
// }

// class Bitfield_Manipulation extends Module {
//     val io = IO(new Bundle{
//         val x = Input(UInt(32.W))
//         val y = Input(UInt(32.W))
//         val output = Output(UInt(32.W))
//     })
//     // Bitfield manipulations
//     val xMSB = io.x(31) // when x is 32 - bit
//     val yLowByte = io.y(7 , 0) // y is atleat 8 - bit
//     // concatenates bitfields with first operand on left
//     val address = Cat(xMSB , yLowByte)
//     io.output := address
// }

// class duplicate extends Module {
//     val io = IO(new Bundle{
//         val output = Output(UInt(32.W))
//     })
//     // replicate a string multiple times
//     // val duplicate = Fill(2 , "b1010".U ) // " b10101010 ".U
//     // val allOnes = duplicate.orR // performs AND reduction
//     def opCode_BEQ = BitPat ("b000?????1100011")
//     def opCode_BLT = BitPat ("b100?????1100011")
//     val data = "b00111010".U
//     var opcode = 0.U
//     // opcode matching with don 't care bits
//     when ( opCode_BEQ === "b000110001100011".U ) {
//         // above comparison evaluates to true .B
//         opcode = data(6,0)
// }
//     io.output := opcode
// }

// Mux IO interface class
// class Mux_2to1_IO extends Bundle {
//     val in_A = Input ( Bool () )
//     val in_B = Input ( Bool () )
//     val select = Input ( Bool () )
//     val out = Output ( Bool () )
// }
// // 2 to 1 Mux implementation

// class Mux_2to1 extends Module {
// val io = IO (new Mux_2to1_IO )
// // update the output
// io.out := io.in_A & io.select | io.in_B & (~io.select )
// }

// Mux IO interface class
// class Mux_2to1_IO extends Bundle {
//     val in_A = Input(UInt(32.W))
//     val in_B = Input(UInt(32.W))
//     val select = Input(Bool())
//     val out = Output(UInt())
// }
// // 2 to 1 Mux implementation

// class Mux_2to1 extends Module {
//     val io = IO(new Mux_2to1_IO)
// // update the output
//     io.out := Mux(io.select , io.in_A , io.in_B)
// }

// An 8 -to -1 Mux example
// import chisel3 . _
// class LM_IO_Interface extends Bundle {
//     val in = Input (UInt(8.W))
//     val s0 = Input (Bool())
//     val s1 = Input (Bool())
//     val s2 = Input (Bool())
//     val out = Output (Bool()) // UInt (1. W))
// }

// class Mux_8to1 extends Module {
//     val io = IO (new LM_IO_Interface )
//     val Mux4_to_1_a = Mux( io . s1 , Mux( io . s0 , io . in (3) , io . in (2) ) ,
//     Mux( io . s0 , io . in (1) , io . in (0) ) )
//         val Mux4_to_1_b = Mux( io . s1 , Mux( io . s0 , io . in (7) , io . in (6) ) ,
//     Mux( io . s0 , io . in (5) , io . in (4) ) )
//         val Mux2_to_1 = Mux( io . s2 , Mux4_to_1_b , Mux4_to_1_a )
// // Connecting output of 2 _to_1 Mux with the output port .
//     io . out := Mux2_to_1
// }

// Mux with input priority
// class IO_Interface extends Bundle {
//     val in = Input ( UInt (4. W ) )
//     val s1 = Input ( Bool () )
//     val s2 = Input ( Bool () )
//     val s3 = Input ( Bool () )
//     val out = Output ( Bool () ) // UInt (1. W))
// }
// class Mux_Tree extends Module {
//     val io = IO (new IO_Interface )
//     io.out := Mux ( io.s3 , io.in (3) , Mux( io.s2 , io.in (2) ,
//         Mux( io.s1 , io.in (1) , io.in (0) ) ) )
// }

// class MuxCase_ex extends Module {
//     val io = IO (new Bundle {
//     val in0 = Input ( Bool())
//     val in1 = Input ( Bool())
//     val in2 = Input ( Bool())
//     val in3 = Input ( Bool())
//     val in4 = Input ( Bool())
//     val in5 = Input ( Bool())
//     val in6 = Input ( Bool())
//     val in7 = Input ( Bool())
//     val sel = Input ( UInt(3.W))
//     val out = Output ( Bool())
// })
//     io.out := MuxCase(false.B, Array(
//         (io.sel === 0.U) -> io.in0,
//         (io.sel === 1.U) -> io.in1,
//         (io.sel === 2.U) -> io.in2,
//         (io.sel === 3.U) -> io.in3,
//         (io.sel === 4.U) -> io.in4,
//         (io.sel === 5.U) -> io.in5,
//         (io.sel === 6.U) -> io.in6,
//         (io.sel === 7.U) -> io.in7,
//     ))
// }

// class mux_onehot_4to1 extends Module {
//     val io = IO (new Bundle {
//     val in0 = Input ( UInt(32.W))
//     val in1 = Input ( UInt(32.W))
//     val in2 = Input ( UInt(32.W))
//     val in3 = Input ( UInt(32.W))
//     val sel = Input ( UInt(4.W))
//     val out = Output ( UInt(32.W))
// })
//     io.out := Mux1H ( io.sel , Array(io.in0 , io.in1 , io.in2 , io.in3))
// }

// class LM_IO_Interface extends Bundle {
//     // Make an input from a Vector of 4 values
//     val data_in = Input(Vec(4,(UInt(32.W))))
//     // Signal to control which vector is selected
//     val data_selector = Input (UInt(2.W))
//     val data_out = Output(UInt(32.W))
//     val addr = Input(UInt(5.W))
//     // The signal is high for write
//     val wr_en = Input(Bool())
// }

// class Mem_bundle_intf extends Module {
//     val io = IO (new LM_IO_Interface )
//     io.data_out := 0.U
//     // Make a memory of 32 X32
//     val memory = Mem(32,UInt(32.W))
//     when(io.wr_en) {
//     // Write for wr_en = 1
//     // Write at memory location addr , with selected data from data_in (Vector )
//         memory.write(io.addr , io.data_in(io.data_selector))
//         io.data_out := memory.read(io.addr)
// }   
//     .otherwise{
//     // Asyncronous read from addr location
//         io.data_out := memory.read(io.addr)
// }
// }

// Ex2
// // 8 to 1 mux using MuxLookup
// class Ex2 extends Module {
//     val io = IO (new Bundle {
//     val in0 = Input ( Bool())
//     val in1 = Input ( Bool())
//     val in2 = Input ( Bool())
//     val in3 = Input ( Bool())
//     val in4 = Input ( Bool())
//     val in5 = Input ( Bool())
//     val in6 = Input ( Bool())
//     val in7 = Input ( Bool())
//     val sel = Input ( UInt(3.W))
//     val out = Output ( Bool())
// })
//     val out1 = MuxLookup (io.sel(1,0), false.B , Array(
//     (0.U ) -> io.in0,
//     (1.U ) -> io.in1,
//     (2.U ) -> io.in2,
//     (3.U ) -> io.in3,
// ))
//     val out2 = MuxLookup(io.sel(1,0), false.B, Array(
//     (4.U ) -> io.in4,
//     (5.U ) -> io.in5,
//     (6.U ) -> io.in6,
//     (7.U ) -> io.in7,
// ))
//     io.out := MuxLookup(io.sel(2), false.B, Array(
//         (0.U) -> out1,
//         (1.U) -> out2,
//     ))
// }

// Ex3
class mux_onehot_4to1 extends Module {
    val io = IO ( new Bundle {
    val in0 = Input ( UInt (32.W))
    val in1 = Input ( UInt (32.W))
    val in2 = Input ( UInt (32.W))
    val in3 = Input ( UInt (32.W))
    val sel = Input ( UInt (4.W))
    val out1 = Output ( UInt (16.W))
    val out2 = Output ( UInt (16.W))
    val out = Output(UInt (32.W ))
})
    io.out :=  Mux1H ( io.sel , Array( io.in0 , io.in1 , io.in2 , io.in3))
    io.out1 := io.out(15,0)
    io.out2 := io.out(31,16) 
}

// // Task 1
// class LM_IO_Interface extends Bundle {
//     val s0 = Input ( Bool())
//     val s1 = Input ( Bool())
//     val s2 = Input ( Bool())
//     val inp = Input (UInt(32.W))
//     val out = Output ( UInt(32.W))
// }

// class Mux_5to1 extends Module {
//     val io = IO (new LM_IO_Interface)
//     val sel = Cat(io.s2,io.s1,io.s0)
//     val temp = MuxLookup(sel, false.B, Array(
//         ("b000".U) -> io.inp(0),
//         ("b001".U) -> io.inp(7,0),
//         ("b010".U) -> io.inp(15,0),
//         ("b011".U) -> io.inp(23,0),
//         ("b100".U) -> io.inp(31,0),
//    ))
//    io.out := temp
// }

// // Task2
// class MuxLookup1 extends Module {
//     val io = IO ( new Bundle {
//     val in0 = Input ( Bool () )
//     val in1 = Input ( Bool () )
//     val in2 = Input ( Bool () )
//     val in3 = Input ( Bool () )
//     val sel = Input ( UInt(2.W) )
//     val shifter = Input ( Bool ())
//     val out1 = Output ( Bool () )
//     val out2 = Output ( Bool () )
//     val out3 = Output ( Bool () )
//     val out4 = Output ( Bool () )
// })

//     io.out1 := MuxLookup ( io.sel , false .B , Array (
//         (0. U ) ->io . in0 ,
//         (1. U ) ->io . in1 ,
//         (2. U ) ->io . in2 ,
//         (3. U ) ->io . in3))


//     io.out2 := MuxLookup ( io.sel , false .B , Array (
//         (0. U ) ->io . in1 ,
//         (1. U ) ->io . in2 ,
//         (2. U ) ->io . in3 ,
//         (3. U ) -> MuxLookup(io.shifter , false .B , Array ((0. U ) ->0.U ,
//         (1. U ) ->io . in0 )))) 

//     io.out3 := MuxLookup ( io.sel , false .B , Array (
//         (0. U ) ->io . in2 ,
//         (1. U ) ->io . in3 ,
//         (2. U ) ->MuxLookup(io.shifter , false .B , Array ((0. U ) ->0.U ,
//         (1. U ) ->io . in0 )) ,
//         (3. U ) -> MuxLookup(io.shifter , false .B , Array ((0. U ) ->0.U ,
//         (1. U ) ->io . in1 ))))

//     io.out4 := MuxLookup ( io.sel , false .B , Array (
//         (0. U ) ->io . in3 ,
//         (1. U ) ->MuxLookup(io.shifter , false .B , Array ((0. U ) ->0.U ,
//         (1. U ) ->io . in0 )) ,
//         (2. U ) ->MuxLookup(io.shifter , false .B , Array ((0. U ) ->0.U ,
//         (1. U ) ->io . in1 )) ,
//         (3. U ) -> MuxLookup(io.shifter , false .B , Array ((0. U ) ->0.U ,
//         (1. U ) ->io . in2 ))))
//         }
