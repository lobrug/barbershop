package service;

import domain.Barbeiro;
import domain.Cliente;
import domain.Servico;

public class ClienteAcoes {

    public void agendarServico(Cliente cliente, Barbeiro barbeiro, String horario, Servico servico) {
        String[][] aux = barbeiro.getHorarios();

        for(int i = 0; i < aux.length; i++){
            for(int j = 0; j < aux[i].length; j++){
                if(horario.equals(aux[0][j])){
                    if(barbeiro.getHorarios()[1][j].equals("1")){
                        System.out.println("Este horario ja esta ocupado, tente outro");
                        break;
                    }
                    barbeiro.getHorarios()[1][j] = "1";
                    cliente.setHorario(aux[0][j]);
                    System.out.println("Horario marcado as: " + cliente.getHorario() + " no valor de: " + servico.getValor() + " reais");
                    break;
                }
            }
            return;
        }

    }

    public void cancelarAgendamento(Cliente cliente, Barbeiro barbeiro) {
        for(int i = 0; i < barbeiro.getHorarios().length; i++){
            for(int j = 0; j < barbeiro.getHorarios()[i].length; j++){
                if(barbeiro.getHorarios()[1][j].equals("1")){
                    cliente.setHorario(null);
                    barbeiro.getHorarios()[1][j] = "0";
                    System.out.println("Horario cancelado com sucesso");
                    break;
                }
            }
        }
    }

    public void listarHorariosDisponiveis(Barbeiro barbeiro) {
        String[][] aux = barbeiro.getHorarios();

        System.out.println("Horarios disponiveis: ");

        for(int i = 0; i < 1; i++){
            for(int j = 0; j < aux[i].length; j++){
                if(aux[1][j].equals("0")){
                    System.out.println(aux[0][j]);
                }
            }
        }
    }
}
