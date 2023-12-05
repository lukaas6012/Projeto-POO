package Abstratas;

import Abstratas.Pessoa;
import Classes.Paciente;
import Exception.SinaisVItaisException;

public abstract class ProfissionalSaude extends Pessoa {

    private String especialidade;

    public ProfissionalSaude(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public abstract void realizarAtendimento(Paciente paciente) throws SinaisVItaisException;

    public void mostraInfo() {
        System.out.println(getNome() + " sua especialidade é como " + getEspecialidade() + ".Trabalhando a 10 anos no hospital.");
    }
}
