package domain;

public class Barbeiro extends Funcionario{
    private String[][] horarios;

    public Barbeiro(String nome, String cpf, double salario, int cargaHoraria) {
        super(nome, cpf, salario, cargaHoraria);
        horarios = new String[][]
                {{"7","8","9","10","13","14","15","16"},{"0","0","0","0","0","0","0","0"}};
    }

    public String[][] getHorarios() {
        return horarios;
    }

    public void setHorarios(String[][] horarios) {
        this.horarios = horarios;
    }
}
