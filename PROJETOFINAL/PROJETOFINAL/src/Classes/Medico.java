package Classes;

import Abstratas.ProfissionalSaude;
import Exception.SinaisVItaisException;
import Interface.Monitoramento;

public class Medico extends ProfissionalSaude implements Monitoramento {
    public Medico(String nome, int idade, String especialidade) {
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
        else System.out.println("Sinais vitais do paciente "+ paciente.getNome()+" fora da faixa normal !! Classes.Paciente entrando em estado de sofrimento.");
    }

    public void mostraInfo() {
        System.out.println(getNome() + " sua especialidade é como " + getEspecialidade() + ".Trabalhando a 20 anos no hospital.");
    }


}
