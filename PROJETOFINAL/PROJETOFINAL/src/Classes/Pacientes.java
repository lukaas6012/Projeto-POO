package Classes;

import Classes.Paciente;

import java.util.ArrayList;

public class Pacientes {

    ArrayList<Paciente> ListaPaciente = new ArrayList<Paciente>();

    public void addPaciente(Paciente paciente) {
        ListaPaciente.add(paciente);
    }

    public void mostraInfos() {

        for (int i = 0; i < ListaPaciente.size(); i++) {
            if (ListaPaciente.get(i) != null) {
                System.out.println("\n       Classes.Paciente: " + (i + 1));
                ListaPaciente.get(i).mostraInfo();
            }
        }
    }
}
