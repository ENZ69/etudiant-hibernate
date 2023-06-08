package sn.dev.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity // annotation pour dire que la classe est une table de la base
@Table(name = "classes_tb") // annotation pour donner un nom a la table avec ça on peut donner a la table un nom different de celui de la classe
@Getter //generer des getters avec lombok
@Setter //generer des setters avec lombok
@AllArgsConstructor //generer le constructeur avec arguments avec lombok
@NoArgsConstructor //generer le constructeur sans arguments avec lombok
//@Data permet d'ajouter toute les methodes de bases d'une classe comme les getter, setter, la methode toString,...
public class Classe implements Serializable {
    @Id // annotation qui designe la clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // annotation qui designe l'auto incremente
    private int id;
    @Column(name = "nom", length = 100, unique = true, nullable = false) // annotation qui permet de manipuler une colonne (donner le nom, la taille si c'est une chaine de caractere, dire si la valeur est NULL ou pas,...)
    private String libelle;
    @Column(name = "nbEtudiants", columnDefinition = "integer default 0")
    private int effectif;
    @OneToMany(mappedBy = "classe")
    private List<Etudiant> etudiants;
}
