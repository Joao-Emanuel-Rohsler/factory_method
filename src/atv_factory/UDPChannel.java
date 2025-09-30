package atv_factory;

public class UDPChannel 
        implements Channel{
    public void getMessage(){
        System.out.println(
            "Envia mensagem UDP"
        );
    }
}