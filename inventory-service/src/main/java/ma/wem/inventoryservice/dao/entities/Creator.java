package ma.wem.inventoryservice.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@Entity
@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class Creator {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "creator")
    private List<Video> videos ;
}
