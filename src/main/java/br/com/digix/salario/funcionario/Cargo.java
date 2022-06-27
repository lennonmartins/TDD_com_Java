package br.com.digix.salario.funcionario;

public enum Cargo {
    DESENVOLVEDOR ("Desenvolvedor"), DBA("Data Base Admin"), TESTER("Testador");

    private String descricao;

    private Cargo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
