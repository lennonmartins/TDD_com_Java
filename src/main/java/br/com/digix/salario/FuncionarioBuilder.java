package br.com.digix.salario;

import br.com.digix.salario.funcionario.Funcionario;

public class FuncionarioBuilder {
    
    private double salario;

    public FuncionarioBuilder comSalario(double salario){
        this.salario = salario;
        return this;
    }

    public Funcionario construir(){
        Funcionario funcionario = new Funcionario();
        return funcionario;
    }
}
