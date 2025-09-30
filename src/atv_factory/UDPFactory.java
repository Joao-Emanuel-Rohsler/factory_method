package atv_factory;

public class UDPFactory 
implements ChannelFactory {
	
    public Channel createChannel() {
        return new UDPChannel();
    }
}
