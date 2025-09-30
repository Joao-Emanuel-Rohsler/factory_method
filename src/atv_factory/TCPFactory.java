package atv_factory;

public class TCPFactory 
implements ChannelFactory {
    
    public Channel createChannel() {
        return new TCPChannel();
    }
}
