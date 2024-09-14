package view;

import model.Evento;
import model.Palestrante;
import model.Participante;
import model.Sessao;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Evento evento = new Evento();
        evento.setId(1);
        evento.setNome("Startup");
        evento.setDatainicial("13/09/2024");
        evento.setDatafinal("14/09/2024");
        evento.setLocal("Unisep");

        Participante participante = new Participante();
        participante.setId(2);
        participante.setNome("Demitre Andrejov");
        participante.setCpf("123.456.789-10");
        participante.setNumero("(46) 999000000");

        Palestrante palestrante = new Palestrante();
        palestrante.setId(3);
        palestrante.setNome("Ariel Guareschi");
        palestrante.setEspecialidade("Garoto de Programa: Senior em grandes empresas");

        Sessao sessao = new Sessao();
        sessao.setHorariodasessao("14:00 - 18:00");
        sessao.setNomesessao("Sala 03");
        sessao.setPalestrante(palestrante);
        sessao.setParticipante(participante);

        evento.setSessao(sessao);

        JOptionPane.showMessageDialog(null, evento);
    }

}
