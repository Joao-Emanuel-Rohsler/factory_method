package atv_factory;

public class Teste3 {
    private Channel channel;

    public Teste3(ChannelFactory factory) {
        this.channel = factory.createChannel();
    }

    public void getMessage() {
        channel.getMessage();
    }
}