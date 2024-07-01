import java.io.Serializable;

public class Material implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    public Material(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Material: " + name;
    }
}
