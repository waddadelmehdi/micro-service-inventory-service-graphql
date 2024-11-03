package ma.wem.inventoryservice.service;

import ma.wem.inventoryservice.dao.entities.Creator;
import ma.wem.inventoryservice.dao.entities.Video;
import ma.wem.inventoryservice.dao.repositories.VideoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements VideoManager{
    public final VideoRepository videoRepository;
    public VideoService(VideoRepository videoRepository){
        this.videoRepository=videoRepository;
    }
    @Override
    public Video addVideo(Video video) {
        return videoRepository.save(video);
    }

    @Override
    public boolean deleteVideo(Video video) {
        videoRepository.delete(video);
        return true;
    }

    @Override
    public Video updateVideo(Video video) {
        return videoRepository.save(video);
    }

    @Override
    public List<Video> getAllVideo() {
        return videoRepository.findAll();
    }

    @Override
    public Video getVideoById(Long id) {
        return videoRepository.findById(id).get();
    }
}
