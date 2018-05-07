package Application.Domain;

public class Usuario {
    private int id;
    private String name;

    public Usuario() {}

    public Usuario(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }
}
