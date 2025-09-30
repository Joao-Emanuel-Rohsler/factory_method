package atv_factory;

public class Teste1 {
    private Channel channel;

    public Teste1(ChannelFactory factory) {
        this.channel = factory.createChannel();
    }

    public void getMessage() {
        channel.getMessage();
    }
}
