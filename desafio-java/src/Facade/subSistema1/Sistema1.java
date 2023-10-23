package Facade.subSistema1;

public class Sistema1 {

    private Sistema1(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade){
        System.out.println("Cliente gravado");
    }
}
