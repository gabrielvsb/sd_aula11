package br.gov.to.palmas.notafiscal;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DadosNF implements Serializable{
    private String cnpj, razaosocial;
    private Date data;
    BigDecimal valorTotal;

    public DadosNF(String cnpj, String razaosocial, Date data, BigDecimal valorTotal){
        this.cnpj = cnpj;
        this.razaosocial = razaosocial;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
