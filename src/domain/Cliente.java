package domain;

public class Cliente extends Pessoa{
    private String email;
    private String senha;
    private String horario;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "horario='" + horario + '\'' +
                '}';
    }
}
