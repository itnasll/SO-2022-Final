require 'socket'

s = TCPSocket.new '0.0.0.0', 4000

loop do
  sms = gets
  s.puts sms
  line = s.gets
  puts line    
  sms = gets
  s.puts sms
  
end
s.close        
