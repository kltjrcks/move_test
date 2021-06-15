#-*- coding:utf-8 -*-
from socket import *

serverIP = '127.0.0.1'
port = 8099

serverSock = socket(AF_INET, SOCK_STREAM)
serverSock.bind((serverIP, port))
serverSock.listen(1)

connectionSock, addr = serverSock.accept()

print("접속 ip : {}" .format(str(addr)))

data = connectionSock.recv(1024)
print("IP {}의 메세지 : {}" .format(str(addr), data))


connectionSock.send("Hello I am Server.".encode("utf-8"))

print("Complete Sending Message")



