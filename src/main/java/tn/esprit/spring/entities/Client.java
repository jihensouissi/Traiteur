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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idClient;
    String nom;
    String prenom;
    @Enumerated(EnumType.STRING)
    IMC imc;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Plat> plats;

}
