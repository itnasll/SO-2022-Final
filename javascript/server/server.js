var net = require('net');
const readline = require('readline-sync')

const server = net.createServer()

server.on('connection',(socket)=>{
    socket.on('data', data =>{
        console.log(''+ data)
        sendLine()
    })
    
    socket.on('close',()=>{
        console.log("comunicacion finalizada")
    })
    socket.on('error', (err)=>{
        console.log(err.message)
    })
    
    function sendLine(){
        var line = readline.question('digite algo\t')
        socket.write("servidor dice: " + line + "\n")
        /*
        if (line == "0"){
            socket.end()
        }else{
            socket.write(line)
        }
        */
    
    }

})



server.listen(2000, ()=>{
    console.log("el servidor esta escuchando en la puerta", server.address().port)
})