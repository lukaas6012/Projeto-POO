package Classes;

import Abstratas.Pessoa;

public class Paciente extends Pessoa {

    private double temperatura;
    private int frequenciaCardiaca;
    private int pressaoArterial;

    public Paciente(String nome, int idade, double temperatura, int frequenciaCardiaca, int pressaoArterial) {
        super(nome, idade);
        this.temperatura = temperatura;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.pressaoArterial = pressaoArterial;
    }

    public void mostraInfo()
    {
        System.out.println("O(A) paciente " + getNome() + " de " + getIdade() + " anos deu entrada no hospital.");
        System.out.println("Seus sinais vitais estavam em: ");
        System.out.println("Temperatura: " + getTemperatura());
        System.out.println("Frequência Cardíaca: "+ getFrequenciaCardiaca());
        System.out.println("Pressão Arterial: " + getPressaoArterial());
    }

    public double getTemperatura() {
        return temperatura;
    }

    public int getPressaoArterial() {
        return pressaoArterial;
    }

    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }
}
