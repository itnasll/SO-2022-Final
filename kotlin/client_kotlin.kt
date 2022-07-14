import java.net.ServerSocket
import java.net.Socket
import java.io.PrintWriter
import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    client()
    
}

fun client() {
    val client = Socket("localhost", 2000)

    val output = PrintWriter(client.getOutputStream(), true)
    val input = BufferedReader(InputStreamReader(client.inputStream))

    //println("Client sending [Hello]")
    //output.println("Hello")
    //println("Client receiving [${input.readLine()}]")
    while(true){
        //val output = PrintWriter(client.getOutputStream(), true)
        //val input = BufferedReader(InputStreamReader(client.inputStream))
        
        val sms = readLine()
        output.println("cliente dice: ${sms}")
        val input = BufferedReader(InputStreamReader(client.inputStream))
        println(input.readLine())
    }

}

fun serverd() {
    val server = ServerSocket(9999)
    val client = server.accept()
    while (true){
        val output = PrintWriter(client.getOutputStream(), true)
        val input = BufferedReader(InputStreamReader(client.inputStream))

        output.println("${input.readLine()} back")
    }
    
}