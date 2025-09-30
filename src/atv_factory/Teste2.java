package atv_factory;

public class Teste2 {
    private Channel channel;

    public Teste2(ChannelFactory factory) {
        this.channel = factory.createChannel();
    }

    public void getMessage() {
        channel.getMessage();
    }
}