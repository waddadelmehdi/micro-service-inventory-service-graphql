package ma.wem.inventoryservice.dtos;

import jakarta.persistence.*;
import lombok.*;
import ma.wem.inventoryservice.dao.entities.Video;

import java.util.List;



@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CreatorDtoInput {
    private Long id;
    private String name;

    @OneToMany(mappedBy = "creator")
    private List<Video> videos ;
}
