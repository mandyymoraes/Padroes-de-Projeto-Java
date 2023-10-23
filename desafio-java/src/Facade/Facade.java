package Facade;

import Facade.subSistema1.Sistema1;
import Facade.subSistema2.Sistema2;

public class Facade {
    public void migrarCliente(String nome, String cep){
        
        String cidade = Sistema2.getInstancia().recuperarCidade(cep);
        
        
        Sistema1.gravarCliente(nome, cep, cidade);
        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(cep);
    }
}
