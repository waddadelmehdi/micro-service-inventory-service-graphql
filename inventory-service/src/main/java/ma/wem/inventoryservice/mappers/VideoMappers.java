package ma.wem.inventoryservice.mappers;

import ma.wem.inventoryservice.dao.entities.Creator;
import ma.wem.inventoryservice.dao.entities.Video;
import ma.wem.inventoryservice.dtos.CreatorDto;
import ma.wem.inventoryservice.dtos.CreatorDtoInput;
import ma.wem.inventoryservice.dtos.VideoDto;
import ma.wem.inventoryservice.dtos.VideoDtoInput;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VideoMappers {
    final ModelMapper modelMapper = new ModelMapper();

    public Video fromVideotDtoToVideo(VideoDto videoDto) {
        return this.modelMapper.map(videoDto, Video.class);
    }

    public VideoDto fromCreatorToCreatorDto(Video video) {
        return this.modelMapper.map(video, VideoDto.class);
    }

    public VideoDto fromVideoDtoInputToVideoDto(VideoDtoInput videoDtoInput) {
        return this.modelMapper.map(videoDtoInput, VideoDto.class);
    }

    public VideoDtoInput fromVideoDtoToVideoDtoInput(VideoDto videoDto) {
        return this.modelMapper.map(videoDto, VideoDtoInput.class);
    }

    public Video fromVideoDtoInputToVideo(VideoDtoInput videoDtoInput) {
        return this.modelMapper.map(videoDtoInput, Video.class);
    }
}
