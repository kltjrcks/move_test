# -*- coding : utf-8 -*-

from twisted.internet import reactor, protocol, endpoints

class Proto(protocol.Protocol):
    def connectionMade(self):
        self.factory.conn_num += 1
        print("Connection #", self.factory.conn_num)

    def dataReceived(self, data):
        self.transport.write(data)


class ProtoFactory(protocol.ServerFactory):
    protocol = Proto
    conn_num = 0


reactor.listenTCP(8199, ProtoFactory())
reactor.run()


