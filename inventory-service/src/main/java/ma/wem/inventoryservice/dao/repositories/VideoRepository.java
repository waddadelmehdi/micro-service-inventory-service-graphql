package ma.wem.inventoryservice.dao.repositories;

import ma.wem.inventoryservice.dao.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
}
