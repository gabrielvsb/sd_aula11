package br.com.comercio;

import java.math.BigDecimal;
import java.util.*;

import br.com.comercio.prefeitura.DadosNF;

public class ComercioService {
    Map<String,Integer> estoque = new HashMap<String,Integer>();
    
    public BigDecimal vender(String cod, int qtd){
        Date data = new Date();
        DadosNF dados = new DadosNF("00000000501010", "GABRIEL", data, new BigDecimal(10));
        return null;
    };

    public void gerarEstoque(){
        estoque.put("IPHONE", 4);
        estoque.put("XIAOMI", 15);
        estoque.put("IPAD", 1);
    }
}
