package br.gov.to.palmas.notafiscal;

import java.math.BigDecimal;
import java.rmi.RemoteException;

public class NFServiceImpl implements NFService{
    
    public BigDecimal calcularISSEEmitirNF(DadosNF dados) throws RemoteException{
        return dados.valorTotal.multiply(new BigDecimal(0.05));
    }
}
