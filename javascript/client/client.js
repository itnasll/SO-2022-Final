var net = require('net');
const readline = require('readline-sync')
const options = {
    port : 4000,
    host: 'localhost'
}
const client = net.createConnection(options)

client.on('connect',()=>{
    console.log('conexcion esitosa')
    sendLine()
})

client.on('error',(err)=>{
    console.log(err.message)
})
client.on('data',(data)=>{
    console.log('el servidor dice: \t'+ data)
    sendLine()
})

function sendLine(){
    var line = readline.question('digite algo\t')
    if (line == "0"){
        client.end()
    }else{
        client.write(line)
    }

}