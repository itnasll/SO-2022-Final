require 'socket'

server = TCPServer.new 2000 # Server bound to port 2000

loop do
  client = server.accept    # Wait for a client to connect
  
  loop do
    mensajecliente = client.gets
    puts mensajecliente
    sms = gets
    client.puts sms	
  end
  
  client.close
end
