package ma.wem.inventoryservice.dtos;

import jakarta.persistence.*;
import lombok.*;
import ma.wem.inventoryservice.dao.entities.Creator;

import java.util.Date;
@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class VideoDto {

    private Long id;
    private String name;
    private Date datePublication;

    @ManyToOne
    private Creator creator;
}
