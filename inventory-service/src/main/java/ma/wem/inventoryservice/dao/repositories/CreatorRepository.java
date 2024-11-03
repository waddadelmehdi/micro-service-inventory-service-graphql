package ma.wem.inventoryservice.dao.repositories;

import ma.wem.inventoryservice.dao.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creator,Long> {
}
