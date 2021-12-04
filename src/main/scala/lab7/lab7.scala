package lab7
import chisel3._
import chisel3.util._
// import chisel3.experimental.ChiselEnum

// // Sequence to detect is 110
// class Detect_Seq extends Module {
//     val io = IO (new Bundle {
//         val in = Input ( Bool () )
//         val out = Output ( Bool () )
// })
//     val s0 :: s1 :: s2 :: Nil = Enum (3) // Enumeration type
//     val state = RegInit ( s0 ) // state = s0
//     io . out := ( state === s2 ) & (! io . in ) // Mealy type state machine
//     switch ( state ) {
//     is ( s0 ) {
//     when ( io . in ) {
//     // move to next state when input is 1
//     state := s1
//     }
//     }
//     is ( s1 ) {
//     when ( io . in ) {
//     // move to next state when input is 1
//     state := s2
//     } .otherwise {
//     state := s0
//     }
//     }
//     is ( s2 ) {
//     when (! io . in ) {
//     // move to default state when input is zero
//     // otherwise stay here because input sequence is 111
//     state := s0
//                 }
//             }
//         }   
//     }


// // Exercise#1
// class Arbiter extends Module {
//     val io = IO ( new Bundle {
//         val in = Flipped(Vec(2,Decoupled(UInt(16.W))))// valid = Input , ready = Output , bits = Input
//         val out = Decoupled(UInt(16.W))   // valid = Output , ready =Input , bits = Output
//     })

//     val queue0 = Queue(io.in(0),2)
//     val queue1 = Queue(io.in(1),2)
//     queue0.nodeq()
//     queue1.nodeq()
//     io.out.bits:= 0.U
//     // io.out.valid:=0.U
//     io.out.valid (1.B)
//     // switch ( queue1.valid && io.out.ready){
//     //    is(1.B) {
//     //     io.out.enq(queue1.deq())
//     // }}
//     val arbi = Module (new Arbiter(UInt(),2))
//         arbi.io.in(0)<>queue1
//         arbi.io.in(1)<>queue0
//         io.out <> arbi.io.out
// }



// // Assignments
// // Task#1
// class My_Queue extends Module {
//     val io = IO (new Bundle{
//         val f1 = Input(Bool())
//         val f2 = Input(Bool())
//         val r1 = Input(Bool())
//         val r2 = Input(Bool())
//         val out = Output(UInt(8.W))
//     })

//     val s0 :: s1 :: s2 :: s3 :: s4 :: s5 :: Nil = Enum(6)
//     val state = RegInit ( s0 ) 
//     io.out := 0.U
//     switch(state){
//         is(s0){
//             when(!io.f1 & !io.f2){
//                 state := s0
//             }.elsewhen(io.f1){
//                 state := s1
//             }.otherwise{
//                 state:= s5
//             }
//         }    

//     is (s1){
//         when(!io.r1 & !io.f1){
//             state := s1
//         }
//         .elsewhen(io.r1){
//             state := s0
//         }
//         .otherwise{
//             state :=s2
//         }
//     }
//     is(s2){
//         when(!io.r1 & !io.f1){
//             state := s2
//             io.out := 3.U
//         }
//         .elsewhen(io.r1){
//             state := s1
//             io.out := 3.U
//         }
//          .otherwise{
//             state :=s3
//             io.out := 3.U
//         }

//     }
//     is (s3){
//         state := s0
//     }
//     is (s4){
//         when(!io.r2 & !io.f2){
//             state := s4
//             io.out := 7.U
//         }.elsewhen(io.r2){
//             state :=s5
//             io.out := 7.U
//         }.otherwise{
//             state := s3
//             io.out := 7.U
//         }}
//     is(s5){
//         when(!io.r2 & !io.f2){
//             state := s5
//         }.elsewhen(io.f2){
//             state:=s4

//         }.elsewhen(io.r2){
//             state:=s4
//                 }
//             }
//         }
//     }



// // Task#2
// class Manchester_Encoding extends Module {
//     val io = IO (new Bundle {
//     val in = Input ( UInt(1.W) )
//     val start = Input ( Bool () )
//     val out = Output ( UInt (8. W ) )
//     val flag = Output ( UInt (1. W ) )
//     })
//     io.flag := 0.U
//     val s0 :: s1 :: Nil = Enum (2)
//     val state = RegInit(s0)
//     val M_Reg= RegInit(0.U(8.W))
//     io.out := 0.U
//     switch (state){
//         is (s0){
//             when (io.start){
//                 state := s1
//                 io.out := M_Reg
//                 io.flag := 1.U
//             }.otherwise{
//                 io.out := M_Reg
//                 io.flag := 1.U
//             }
//         }
//         is(s1){
//             when(!io.start){
//                 state := s0
//             }.otherwise{
//                 M_Reg := (M_Reg << 1) | io.in
//                 io.out := M_Reg
//                 io.flag := 1.U
//                 }
//             }
//         }
//     }

