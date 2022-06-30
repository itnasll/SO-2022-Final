require 'socket'

server = TCPServer.new 4000 # Server bound to port 2000

loop do
  client = server.accept
  puts "comunicacion esitosa"    # Wait for a client to connect
  
  loop do
    mensajecliente = client.gets
    puts mensajecliente
    sms = gets
    client.puts "servidor dice: " + sms	
  end
  
  client.close
end
