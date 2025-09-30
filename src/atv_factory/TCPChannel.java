package atv_factory;

public class TCPChannel 
        implements Channel{
    public void getMessage(){
        System.out.println(
            "Envia mensagem TCP"
        );
    }
}
