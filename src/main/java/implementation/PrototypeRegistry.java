package implementation;

import java.util.HashMap;
import java.util.Map;

// Classe que registra os prototipos
public class PrototypeRegistry {
    private final Map<String, Deck> prototypes = new HashMap<>(); // Mapa que associa o nome do prototipo ao objeto

    public void addPrototype(String nome, Deck prototype) {
        this.prototypes.put(nome, prototype);
    }
    public Deck getPrototype(String nome) {
        return prototypes.get(nome).clonar();
    }

}
