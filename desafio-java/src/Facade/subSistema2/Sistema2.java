package Facade.subSistema2;

public class Sistema2 {
    private static Sistema2 instancia = new Sistema2();
    
    private Sistema2(){
        super();
    }

    public static Sistema2 getInstancia(){
        return instancia;
    }

    public String recuperarCidade( String cep){
        return "SP";
    }
}
