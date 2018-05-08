package Application.Model;

import javax.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String username;

    public Usuario() {}

    public Usuario(String username) {
        this.username = username;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return username;
    }
}
