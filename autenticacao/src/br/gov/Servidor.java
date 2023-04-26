package br.gov;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import br.gov.auth.Autenticacao;
import br.gov.auth.AutenticacaoImpl;

public class Servidor {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);

        Autenticacao autenticacao = new AutenticacaoImpl();
        Autenticacao stubMsgService = (Autenticacao) UnicastRemoteObject
                .exportObject((Autenticacao) autenticacao, 0);
        registry.rebind("Autenticacao", stubMsgService);
    }
}
