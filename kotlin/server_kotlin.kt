import java.net.ServerSocket
import java.net.Socket
import java.io.PrintWriter
import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    Thread{ server() }.start()
    
}

fun cliente () {
    val client = Socket("localhost", 2000)
    val output = PrintWriter(client.getOutputStream(), true)
    val input = BufferedReader(InputStreamReader(client.inputStream))

    println("Client sending [Hello]")
    output.println("Hello")
    println("Client receiving [${input.readLine()}]")
    client.close()
}

fun server () {
    val server = ServerSocket(2000)
    val client = server.accept()
    val output = PrintWriter(client.getOutputStream(), true)
    val input = BufferedReader(InputStreamReader(client.inputStream))
    while (true){
        
        println(input.readLine())

        val sms = readLine()

        

        output.println("servidor dice: ${sms} \n")
    }
    
}