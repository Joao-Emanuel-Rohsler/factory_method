package atv_factory;

public class Main {
    public static void main(String[] args) {
        
    	ChannelFactory tcpFactory = new TCPFactory();
        ChannelFactory udpFactory = new UDPFactory();

        Teste1 t1 = new Teste1(tcpFactory);
        Teste2 t2 = new Teste2(udpFactory);
        Teste3 t3 = new Teste3(tcpFactory);

        t1.getMessage();
        t2.getMessage();
        t3.getMessage(); 

    }
}
