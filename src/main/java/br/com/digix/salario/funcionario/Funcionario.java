package br.com.digix.salario.funcionario;

public class Funcionario {
    private Cargo cargo;
    private double salario = 0;

    public Funcionario(Cargo desenvolvedor, double salarioAtual) {
        this.cargo = desenvolvedor;
        this.salario = salarioAtual;
    }

    public Double getSalario() {
        if (cargo == Cargo.DESENVOLVEDOR) {
            if (salario > 5000) {
                salario = salario + (salario * 0.25);
            } else {
                salario = salario + (salario * 0.15);
            }
        } else if(cargo == cargo.DBA || cargo == cargo.TESTER){
            if(salario > 4500){
                salario = salario + (salario * 0.20);
            }else{
                salario = salario + (salario * 0.10); 
            }

        } 
        return salario;
    }
}
