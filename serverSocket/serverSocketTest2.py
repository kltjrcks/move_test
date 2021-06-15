#-*- coding:utf-8 -*-

import socket, threading

def binder(client_socket, addr):
    print('connected by', addr)

    try:
        while(True):
            data = client_socket.recv(32)

            msg = data.decode()

            print('Received from', addr, msg)

            msg = "echo : " + msg
            data = msg.encode()
            length = len(data)

            client_socket.sendall(data)

    except Exception as e:
        print(e)
        print("except")

    finally:
        client_socket.close()

server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind(('',8099))
server_socket.listen()

try:
    while(True):
        client_socket, addr = server_socket.accept()
        th = threading.Thread(target=binder, args=(client_socket, addr))
        th.start()

except Exception as e:
    print("server")

finally:
    server_socket.close()
