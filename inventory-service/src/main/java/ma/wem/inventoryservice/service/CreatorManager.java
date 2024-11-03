package ma.wem.inventoryservice.service;

import ma.wem.inventoryservice.dao.entities.Creator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CreatorManager {
    public Creator addCreator(Creator creator);

    public boolean deleteCreator(Creator creator);
    public Creator updateCreator(Creator creator);
    public List<Creator> getAllCreator();
    public Creator getCreatorById(Long id);

}
