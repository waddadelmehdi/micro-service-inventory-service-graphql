package ma.wem.inventoryservice.service;

import ma.wem.inventoryservice.dao.entities.Creator;
import ma.wem.inventoryservice.dao.repositories.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatorService implements CreatorManager{

    public final CreatorRepository creatorRepository;
    

    public CreatorService(CreatorRepository creatorRepository) {
        this.creatorRepository = creatorRepository;
    }

    @Override
    public Creator addCreator(Creator creator) {
        return creatorRepository.save(creator);
    }

    @Override
    public boolean deleteCreator(Creator creator) {
         creatorRepository.delete(creator);
        return true;
    }

    @Override
    public Creator updateCreator(Creator creator) {
        return creatorRepository.save(creator);
    }

    @Override
    public List<Creator> getAllCreator() {
        return creatorRepository.findAll();
    }

    @Override
    public Creator getCreatorById(Long id) {
        return creatorRepository.findById(id).get();
    }
}
