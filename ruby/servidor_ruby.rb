require 'socket'

server = TCPServer.open('localhost', 2000)  # Server bound to port 2000

loop do
  client = server.accept    # Wait for a client to connect
  
  loop do
    mensajecliente = client.gets
    puts mensajecliente
    sms = gets
    client.puts "servidor dice: " + sms	
  end
  
  client.close
end
