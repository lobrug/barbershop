import domain.Barbeiro;
import domain.Cliente;
import domain.Servico;
import service.ClienteAcoes;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Lorenzo", "112.187.234-76");
        Barbeiro barbeiro1 = new Barbeiro("Gabriel", "213.234.345-54", 1500.0, 8);
        ClienteAcoes servico = new ClienteAcoes();
        Cliente cliente2 = new Cliente("loucoabreu", "23423423423");

        servico.agendarServico(cliente1, barbeiro1, "10", Servico.CORTE);
        servico.agendarServico(cliente2, barbeiro1, "12", Servico.BARBA);

        servico.listarHorariosDisponiveis(barbeiro1);

        servico.cancelarAgendamento(cliente1, barbeiro1);


        //testa se o horario volta a lista
        servico.listarHorariosDisponiveis(barbeiro1);

    }
}