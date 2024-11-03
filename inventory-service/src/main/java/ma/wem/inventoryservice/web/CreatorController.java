package ma.wem.inventoryservice.web;


import ma.wem.inventoryservice.dao.entities.Creator;
import ma.wem.inventoryservice.service.CreatorService;
import ma.wem.inventoryservice.service.VideoService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CreatorController {
    private CreatorService creatorService;

    public CreatorController(CreatorService creatorService){
        this.creatorService=creatorService;
    }

    @MutationMapping
    public Creator addCreator(@Argument Creator creator){
        return creatorService.addCreator(creator);
    }


}
