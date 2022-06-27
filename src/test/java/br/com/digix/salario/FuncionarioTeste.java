package br.com.digix.salario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.digix.salario.funcionario.Cargo;
import br.com.digix.salario.funcionario.Funcionario;

public class FuncionarioTeste {
    String funcionario = "Desenvolvedor";

    @Test
    public void deve_verificar_o_funcionario() {

        Assertions.assertEquals(funcionario, Cargo.DESENVOLVEDOR.getDescricao());
    }

    @Test
    public void deve_verificar_o_salario_do_desenvolverdor_abaixo_do_limite() {
        double salarioAtual = 3500.0;
        double salarioEsperado = salarioAtual + (salarioAtual*0.15);

        Funcionario desenvolvedor = new Funcionario(Cargo.DESENVOLVEDOR, salarioAtual);

        Assertions.assertEquals(salarioEsperado,desenvolvedor.getSalario());
    }

    @Test
    public void deve_verificar_o_salario_do_desenvolverdor_acima_do_limite() {
        double salarioAtual = 6500.0;
        double salarioEsperado = salarioAtual + (salarioAtual*0.25);

        Funcionario desenvolvedor = new Funcionario(Cargo.DESENVOLVEDOR, salarioAtual);

        Assertions.assertEquals(salarioEsperado,desenvolvedor.getSalario());
    }

    @Test
    public void deve_verificar_o_salario_do_dba_abaixo_do_limite() {
        double salarioAtual = 2500.0;
        double salarioEsperado = salarioAtual + (salarioAtual*0.10);

        Funcionario dba = new Funcionario(Cargo.DBA, salarioAtual);

        Assertions.assertEquals(salarioEsperado,dba.getSalario());
    }

    @Test
    public void deve_verificar_o_salario_do_dba_acima_do_limite() {
        double salarioAtual = 5500.0;
        double salarioEsperado = salarioAtual + (salarioAtual*0.20);

        Funcionario dba = new Funcionario(Cargo.DBA, salarioAtual);

        Assertions.assertEquals(salarioEsperado,dba.getSalario());
    }

    @Test
    public void deve_verificar_o_salario_do_tester_abaixo_do_limite() {
        double salarioAtual = 3500.0;
        double salarioEsperado = salarioAtual + (salarioAtual*0.10);

        Funcionario tester = new Funcionario(Cargo.TESTER, salarioAtual);

        Assertions.assertEquals(salarioEsperado,tester.getSalario());
    }

    @Test
    public void deve_verificar_o_salario_do_tester_acima_do_limite() {
        double salarioAtual = 5500.0;
        double salarioEsperado = salarioAtual + (salarioAtual*0.20);

        Funcionario tester = new Funcionario(Cargo.TESTER, salarioAtual);

        Assertions.assertEquals(salarioEsperado,tester.getSalario());
    }

    
}

