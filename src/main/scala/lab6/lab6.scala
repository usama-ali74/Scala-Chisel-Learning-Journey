package lab6
import chisel3._
import chisel3.util._
// import Config._

// class RegFileIO extends Bundle with Config {
//     val raddr1 = Input ( UInt (5. W ) )
//     val raddr2 = Input ( UInt (5. W ) )
//     val rdata1 = Output ( UInt ( XLEN . W ) )
//     val rdata2 = Output ( UInt ( XLEN . W ) )
//     val wen = Input ( Bool () )
//     val waddr = Input ( UInt (5. W ) )
//     val wdata = Input ( UInt ( XLEN . W ) )
// }

// class RegFile extends Module with Config {
//     val io = IO (new RegFileIO )
//     val regs = Reg(Vec(REGFILE_LEN ,UInt(XLEN.W)))
//     io . rdata1 := Mux (( io . raddr1 . orR ) , regs ( io . raddr1 ) , 0. U )
//     io . rdata2 := Mux (( io . raddr2 . orR ) , regs ( io . raddr2 ) , 0. U )
//     when ( io . wen & io . waddr . orR ) {
//     regs ( io . waddr ) := io . wdata
//     }
// }


// trait Config {
//     // word length configuration parameter
//     val XLEN = 32
//     val REGFILE_LEN = 4
// }



// class Pipe extends Module {
//     val io = IO ( new Bundle {
//     val in = Flipped ( Valid ( UInt (8. W ) ) ) // valid = Input , bits = Input
//     val out = Valid ( UInt (8. W ) ) // valid = Output , bits = Output
// })
//     io . out := Pipe ( io . in ,5)
// }


// // Exercise#1
// class shift_register( val init : Int = 1) extends Module {
//     val io = IO (new Bundle {
//     val in = Input (UInt(5.W))
//     val out = Output (UInt(5.W))
// })
//     val state = RegInit (init.U(5.W)) // register initialization
//     // parallel data in at LSB

//     state := io.in
//     io.out := state
// }

// // Exercise#2
// class counter (val max : Int , val min : Int = 0) extends Module {
//     val io = IO (new Bundle {
//     val out = Output(UInt(log2Ceil(max).W))
//     // val out = Output(UInt(32.W))
// })
//     val counter = RegInit(min.U(log2Ceil(max).W))
//     // If the max count is of power 2 and the min value = 0 ,
//     // then we can skip the comparator and the Mux
//     val count_buffer = Mux((isPow2(max) && (min==0)).B,counter +1.U ,
//     Mux(counter===max.U , min.U ,counter+1.U))
//     counter := count_buffer
//     io.out := counter
//     // val temp = log2Ceil(max).asUInt
//     // io.out := temp
// }


// // Exercise#4
// class My_Queue extends Module {
//     val io = IO ( new Bundle {
//         val in0 = Flipped ( Decoupled ( UInt (8. W ) ) ) // valid = Input , ready = Output , bits = Input
//         val out = Decoupled ( UInt (8. W ) )   // valid = Output , ready =Input , bits = Output
//     })

//     val queue0 = Queue (io.in0)
//     val queue1 = Queue (queue0)
//     queue0.nodeq()
//     queue1.nodeq()
//     io.out.bits:=0.U
//     io.out.valid:=0.U
//     io.out.valid:=(1.B)
//     switch ( queue1.valid && io.out.ready){
//        is(1.B) {
//         io.out.enq(queue1.deq())
//     }}

// }


// // Assignments

// // Task#2
// class counter_with_xor ( val max : Int = 7,val min : Int = 0) extends Module {
//     val io = IO (new Bundle {
//     val out = Output (UInt((log2Ceil(max).W)))
//     })
//     val counter = RegInit(min.U(log2Ceil(max).W))

//     val count_buffer = Mux((1.B^counter((log2Ceil(max)-1))),counter+1.U,min.U)
//     counter := count_buffer
//     io.out := counter

// }


// // Task#3
// class shift_reg_with_parallel_load (val len : Int = 3, max : Int = 5 ,min : Int = 0 ) extends Module {
//     val io = IO (new Bundle {
//     val out = Vec(len,Output(Bool()))
//     val load_in = Vec(len,Input(Bool()))
//     val in = Input(Bool())
//     val load = Input(Bool())
//     })

//     val mux1 = Mux(io.load,io.load_in(0),io.in)
//     val mux2 = Mux(io.load,io.load_in(1),mux1)
//     val mux3 = Mux(io.load,io.load_in(2),mux2)
//     val reg_1 =  RegInit(min.U(log2Ceil(max).W))
//     val reg_2 = RegInit(min.U(log2Ceil(max).W))
//     val reg_3 = RegInit(min.U(log2Ceil(max).W))
//     reg_1 := mux1
//     reg_2 := mux2
//     reg_3 := mux3
//     io.out(0) := reg_1
//     io.out(1) := reg_2
//     io.out(2) := reg_3
//     }



// // Task#4
// // Up - down counter example
// class up_down_counter ( val max : Int = 10) extends Module {
//     val io = IO (new Bundle {
//     val out = Output (UInt(log2Ceil(max).W))
//     val up_down = Input(Bool())
// })
//     val counter = RegInit(0.U(log2Ceil(max).W))
//     switch(io.up_down){
//         is(1.B){
//             counter := counter + 1.U       
//         }
//         is(0.B){
//             counter := counter - 1.U
//         }
//     }
//     io.out := counter
// }


