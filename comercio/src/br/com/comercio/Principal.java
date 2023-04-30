package br.com.comercio;

import java.math.BigDecimal;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.gov.auth.Autenticacao;

public class Principal {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry();
        
        Autenticacao auth = (Autenticacao) registry.lookup("Autenticacao");
        if(auth.logar("root", "1234") != null){
            ComercioService comercio = new ComercioService();
            BigDecimal venda = comercio.vender("IPHONE", 1);
            
            System.out.println("Venda Concluída. - " + venda);
        }
    }
}
