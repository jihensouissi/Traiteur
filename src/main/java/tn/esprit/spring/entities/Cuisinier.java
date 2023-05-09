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
public class Cuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idCuisinier;
    String nom;
    String prenom;
    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Plat> plats;


}
