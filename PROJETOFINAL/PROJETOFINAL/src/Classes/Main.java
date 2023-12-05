package Classes;

import Classes.Enfermeiro;
import Exception.SinaisVItaisException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        try {
            Enfermeiro enfermeiro = new Enfermeiro("Enfermeira Fernanda Costa", 30, "Enfermeira geriátrica");
            Medico medico = new Medico("Doutor Jonas Damasceno", 50, "Cardiologista");


            Paciente paciente1 = new Paciente("Carlos", 50, 36, 80, 120);
            Paciente paciente2 = new Paciente("Julia", 30, 37.5, 95, 115);
            Pacientes listaP = new Pacientes();
            ProfissionaisSaude listPS = new ProfissionaisSaude();
            //saidas
            System.out.println(" ");
            System.out.println("Olá, sejam bem-vindos ao site de controle dos profissionais e pacientes do Hospital Antônio Moreira da Costa!");
            System.out.println("Abaixo você receberá as informações relacionadas aos nossos plantonistas e funcionários do dia:");
            System.out.println(" ");

            System.out.println("Lista dos Profissionais de Saúde do Hospital: ");

            Path Arquivo = Paths.get("Profissionais.txt");

            try {
                List<String> conteudo = Files.readAllLines(Arquivo);
                Map<String, String> profissionais = new HashMap<>();

                conteudo.forEach((linha) -> {
                    String[] linhaQuebrada = linha.split("=");
                    profissionais.put(linhaQuebrada[0], linhaQuebrada[1].strip());
                });

                profissionais.forEach((nome, profissao) -> {
                    System.out.println("Nome: " + nome);
                    System.out.println("Profissão: " + profissao);
                    System.out.println("");
                });

            } catch (IOException e) {
                e.printStackTrace();
            }

            listPS.addProfissional(medico);
            listPS.addProfissional(enfermeiro);

            listPS.mostraInfos();

            System.out.println(" ");


            //System.out.println(" ");

            listaP.addPaciente(paciente1);
            listaP.addPaciente(paciente2);

            listaP.mostraInfos();

            System.out.println(" ");

            enfermeiro.realizarAtendimento(paciente1);
            enfermeiro.monitorarSinaisVitais(paciente1);

            medico.realizarAtendimento(paciente2);
            medico.monitorarSinaisVitais(paciente2);



            System.out.println(" ");

        } catch (SinaisVItaisException e) {

            System.out.print("Todos os funcionários pararam de atender para ajudar na situação crítica:  " + e.getMessage());

        }

    }
}