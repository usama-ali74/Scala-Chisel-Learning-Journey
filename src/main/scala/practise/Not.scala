package practise
import chisel3._

class Not extends Module{
val io = IO(new Bundle{

    val c = Input(UInt(1.W))
    val output = Output(UInt(1.W))

    })
    io.output := ~(io.c)
}
