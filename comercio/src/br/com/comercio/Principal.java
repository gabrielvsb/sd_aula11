package br.com.comercio;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.comercio.autenticacao.Autenticacao;

public class Principal {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry();
        
        Autenticacao auth = (Autenticacao) registry.lookup("Autenticacao");
        if(auth.logar("root", "1234") != null){
            //vender
        }
    }
}
