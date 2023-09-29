package implementation1;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private final Map<String, Prototype> prototypes = new HashMap<>();

    public void addPrototype(String nome, Prototype prototype) {
        this.prototypes.put(nome, prototype);
    }
    public Prototype getPrototype(String nome) {
        return prototypes.get(nome).clonar();
    }

}
