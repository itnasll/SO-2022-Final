require 'socket'

s = TCPSocket.new 'localhost', 2000

loop do
  sms = gets
  s.puts "cliente dice: " + sms 
  line = s.gets
  puts  line    
  
  
end
s.close   
