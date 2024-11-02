package com.example.pooheranca;

public class Gerente extends Funcionario{

    private double comissao;
    private Integer totalFuncionarios;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public Integer getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setTotalFuncionarios(Integer totalFuncionarios) {
        this.totalFuncionarios = totalFuncionarios;
    }
}
