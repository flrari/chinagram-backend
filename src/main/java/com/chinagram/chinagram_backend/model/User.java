package com.chinagram.chinagram_backend.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nome;
    @Column(nullable = false)
    private String username;
    private String biografia;
    @Column(nullable = false)
    private String immagine_profilo;

    @OneToMany
    private List<Post> post;

    public User() {
    }

    public User(Long id, String nome, String username, String biografia, String immagine_profilo) {
        this.id = id;
        this.nome = nome;
        this.username = username;
        this.biografia = biografia;
        this.immagine_profilo = immagine_profilo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getImmagine_profilo() {
        return immagine_profilo;
    }

    public void setImmagine_profilo(String immagine_profilo) {
        this.immagine_profilo = immagine_profilo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", username='" + username + '\'' +
                ", biografia='" + biografia + '\'' +
                ", immagine_profilo='" + immagine_profilo + '\'' +
                '}';
    }
}
