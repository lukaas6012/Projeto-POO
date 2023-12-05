package Classes;

import Abstratas.ProfissionalSaude;
import Exception.SinaisVItaisException;
import Interface.Monitoramento;

public class Enfermeiro extends ProfissionalSaude implements Monitoramento {
    public Enfermeiro(String nome, int idade, String especialidade) {
        super(nome, idade, especialidade);
    }

    @Override
    public void realizarAtendimento(Paciente paciente) throws SinaisVItaisException {
        System.out.println(getNome() + " esta realizando atendimento para o paciente "+paciente.getNome()+".");

    }

    @Override
    public void monitorarSinaisVitais(Paciente paciente) throws SinaisVItaisException {
        if (paciente.getTemperatura() > 37.0 || paciente.getFrequenciaCardiaca() > 90 || paciente.getPressaoArterial() > 130)
            throw new SinaisVItaisException("Sinais vitais do paciente "+ paciente.getNome()+" fora da faixa normal !! "+ paciente.getNome()+" entrando em estado de sofrimento.");
        else
            System.out.println("Sinais Vitais do paciente "+ paciente.getNome()+" excelentes !!");

    }

    //criar uma informacao de mostra info
    public void mostraInfo() {
        System.out.println(getNome() + " sua especialidade é como " + getEspecialidade() + ".Trabalhando a 10 anos no hospital.");
    }


}
