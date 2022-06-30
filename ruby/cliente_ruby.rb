require 'socket'

s = TCPSocket.new '0.0.0.0', 4000

loop do
  sms = gets
  s.puts "cliente dice: " + sms 
  line = s.gets
  puts  line    
  
  
end
s.close        
