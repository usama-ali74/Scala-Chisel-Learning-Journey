// package practise
// import chisel3._

// class Counter ( counterBits : UInt ) extends Module {
//     val io = IO (new Bundle {
//         val result = Output ( Bool () )
//     })
//     val max = (1.S << counterBits) - 1.S
//     val count = RegInit (0.S (16.W ) )
//     when ( count === max ) {
//         count := 0.S
//     } .otherwise {
//         count := count.asSInt + 1.S
// }
// io.result := count (15.U)
// }

// class AdderWithOffset extends Module {
//     val io = IO (new Bundle {
//         val x = Input ( SInt (16.W ) )
//         val y = Input ( UInt (16.W ) )
//         val z = Output ( UInt (16.W ) )
//     })
//     // Initialized as UInt and casted to SInt
//     val y1 = (23.U).asSInt
//     val in1 = io.x + y1
//     io.z := in1.asUInt + io.y // Typecast SInt to UInt
// }


// import chisel3 . _
// class Counter ( size : Int , maxValue : UInt ) extends Module {
// val io = IO (new Bundle {
// val result = Output ( Bool () )
// })
// // 'genCounter ' with counter size 'n'
// def genCounter ( n : Int , max : UInt ) = {
// val count = RegInit (0. U ( n . W ) )
// when ( count === max ) {
// count := 0. U
// } .otherwise {
// count := count + 1. U
// }
// count
// }
// // genCounter instantiation
// val counter1 = genCounter ( size , maxValue )
// io . result := counter1 ( size -1)
// }


// Task 2
// class Counter ( counterBits : UInt ) extends Module {
//     val io = IO (new Bundle {
//         val result = Output ( Bool () )
//     })
//     val max = (1.S << counterBits) - 1.S
//     val count = RegInit (0.S (16.W ) )
//     val check = count(3.U)
//     when ( check === 1.U ) {
//         count := 0.S
//     } .otherwise {
//         count := count.asSInt + 1.S
// }
// io.result := count (15.U)
// }

//Task 3
// class Counter ( size : Int , maxValue : Int ) extends Module {
// val io = IO (new Bundle {
// val result = Output ( Bool () )
// })
// // 'genCounter ' with counter size 'n'
// def genCounter ( n : Int , max : Int ) = {
// val count = RegInit (0.U ( n.W ) )
// when ( count === max.asUInt ) {
// count := 0. U
// } .otherwise {
// count := count + 1. U
// }
// count
// }
// // genCounter instantiation
// val counter1 = genCounter ( size , maxValue )
// io . result := counter1 ( size -1)
// }

//Assignment Task 2
// package practise
// import chisel3._
// import chisel3.util._
// import java.io.File
// class counter_up_down ( n : Int ) extends Module {
// val io = IO (new Bundle {
// val data_in = Input ( UInt ( n.W ) )
// val reload = Input ( Bool () )
// val out = Output ( Bool () )
// })
// val counter = RegInit (0.U ( n.W ) )
// val max_count = RegInit (6.U ( n.W ) )
//     when ( counter === max_count ) {
//         counter := counter - 1.U
// } 
// io.out := 1.U
// .elsewhen (counter < max_count){
// counter := counter + 1.U
// }
// // io.out := 1.U
// .otherwise{
//     counter := 0.U
// }
// }