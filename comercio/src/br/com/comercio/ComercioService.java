package br.com.comercio;

import java.math.BigDecimal;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;

import br.gov.to.palmas.notafiscal.DadosNF;
import br.gov.to.palmas.notafiscal.NFService;

public class ComercioService {
    Map<String,Integer> estoque = new HashMap<String,Integer>();
    
    public BigDecimal vender(String cod, int qtd) throws RemoteException, NotBoundException{
        Date data = new Date();
        DadosNF dados = new DadosNF("00000000501010", "TULIO", data, new BigDecimal(10));
        
        Registry registry = LocateRegistry.getRegistry();
        NFService service = (NFService) registry.lookup("NFService");

        return service.calcularISSEEmitirNF(dados);
    };

    public void gerarEstoque(){
        estoque.put("IPHONE", 4);
        estoque.put("XIAOMI", 15);
        estoque.put("IPAD", 1);
    }
}
