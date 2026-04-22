package Projeto_Biblioteca.MuralDeAvisos;

// Bibliotecas utilizadas
import java.util.List;
import java.util.ArrayList;

public class Sujeito {
    // Atributos da classe Sujeito
    private List<Observador> observadores = new ArrayList<>();

    // Construtor sujeito
    public Sujeito() {
    }

    // Método para adicionar Observadores
    public void addObserver(Observador o) {
        this.observadores.add(o);
    }

    // Método para remover Observadores
    public void removeObserver(Observador o) {
        this.observadores.remove(o);
    }

    // Método para notificar os Observadores
    public void NotificaObservadores() {
        for (int i = 0; i < this.observadores.size(); i++) {
            this.observadores.get(i).update(this);
        }
    }
}
