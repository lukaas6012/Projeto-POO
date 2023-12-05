package Classes;

import Abstratas.ProfissionalSaude;

import java.util.ArrayList;

public class ProfissionaisSaude {
    ArrayList<ProfissionalSaude> ListaProfissionais = new ArrayList<ProfissionalSaude>();

    public void addProfissional(ProfissionalSaude profissionalSaude) {
        ListaProfissionais.add(profissionalSaude);
    }

    public void mostraInfos() {

        for (int i = 0; i < ListaProfissionais.size(); i++) {
            if (ListaProfissionais.get(i) != null) {
                System.out.println("\n       Profissional Disponível: " + (i + 1));
                ListaProfissionais.get(i).mostraInfo();
            }
        }
    }
}
