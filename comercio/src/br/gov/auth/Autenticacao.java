package br.gov.auth;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Autenticacao extends Remote {
    Usuario logar(String login, String senha) throws RemoteException;
}
