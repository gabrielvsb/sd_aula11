package br.gov.to.palmas.notafiscal;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NFService extends Remote {
    BigDecimal calcularISSEEmitirNF(DadosNF dados) throws RemoteException;
}