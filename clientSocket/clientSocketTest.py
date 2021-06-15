#-*- coding:utf-8 -*-
from socket import *

#serverIP = "192.168.219.104"
serverIP = "127.0.0.1"
port = 8099

clientSock = socket(AF_INET, SOCK_STREAM)
clientSock.connect((serverIP, port))


print("Connected to {}:{}" .format(serverIP, port))

mesg = input("Message 입력 : ")

clientSock.send(mesg.encode("utf-8"))

data = clientSock.recv(1024)

print("Recieved {}" .format(data.decode("utf-8")))

