import Facade.Facade;
import Singleton.Singleton;
import Singleton.SingletonEager;
import Singleton.SingletonLazyHolder;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Testes {
    public static void main(String [] args){

        // Padrão de projeto -> Singleton 

        Singleton lazy = Singleton.getInstancia();
        System.out.println(lazy);
        lazy = Singleton.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Padrão de projeto Strategy 

        Comportamento normal = (Comportamento) new ComportamentoNormal();
        Comportamento defensivo = (Comportamento) new ComportamentoDefensivo();
        Comportamento agressivo = (Comportamento) new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Usuario 1", "123456");


    }
}
