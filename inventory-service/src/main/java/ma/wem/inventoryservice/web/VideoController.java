package ma.wem.inventoryservice.web;

import ma.wem.inventoryservice.dao.entities.Video;
import ma.wem.inventoryservice.service.VideoService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VideoController {
    private VideoService videoService;

    public VideoController(VideoService videoService){
        this.videoService=videoService;
    }

    @QueryMapping
    public List<Video> getAllVideo(){
        return videoService.getAllVideo();
    }
    @QueryMapping
    public Video getVideoById(@Argument Long id){
        return videoService.getVideoById(id);
    }
}
