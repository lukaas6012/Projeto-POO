package Interface;

import Classes.Paciente;
import Exception.SinaisVItaisException;

public interface Monitoramento {
    void monitorarSinaisVitais(Paciente paciente) throws SinaisVItaisException;
}
