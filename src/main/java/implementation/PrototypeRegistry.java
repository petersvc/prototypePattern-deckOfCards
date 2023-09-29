package implementation;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private final Map<String, CardGame> prototypes = new HashMap<>();

    public void addPrototype(String nome, CardGame prototype) {
        this.prototypes.put(nome, prototype);
    }
    public CardGame getPrototype(String nome) {
        return prototypes.get(nome).clonar();
    }

}
