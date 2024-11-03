package ma.wem.inventoryservice.service;

import ma.wem.inventoryservice.dao.entities.Creator;
import ma.wem.inventoryservice.dao.entities.Video;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VideoManager {
    public Video addVideo(Video video);

    public boolean deleteVideo(Video video);
    public Video updateVideo(Video video);
    public List<Video> getAllVideo();
    public Video getVideoById(Long id);
}
