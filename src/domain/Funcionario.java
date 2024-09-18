package domain;

public class Funcionario extends Pessoa{
    private double salario;
    private int cargaHoraria;

    public Funcionario(String nome, String cpf, double salario, int cargaHoraria) {
        super(nome, cpf);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }
}
