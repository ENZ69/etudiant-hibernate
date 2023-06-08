package sn.dev.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "etudiants_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "matricule", unique = true, length = 200, nullable = false)
    private String matricule;
    @Column(name = "nom", length = 200)
    private String nom;
    @Column(name = "prenom", length = 250)
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @ManyToOne
    @JoinColumn(name = "classe")
    private Classe classe;
}
