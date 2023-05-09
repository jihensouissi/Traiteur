package tn.esprit.spring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idPlat;
    String label;
    Float prix;
    Float calories;

    @Enumerated(EnumType.STRING)
    Categorie categorie;
    @ManyToOne
    @JsonIgnore
   Client client;
    @ManyToMany(mappedBy = "plats")
    @JsonIgnore
    private Set<Cuisinier> cuisiniers;



}
