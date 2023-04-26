package br.gov.to.palmas.notafiscal;

import java.math.BigDecimal;

public class NFServiceImpl implements NFService{
    
    public BigDecimal calcularISSEEmitirNF(DadosNF dados){
        return dados.valorTotal.multiply(new BigDecimal(0.5));
    }
}
