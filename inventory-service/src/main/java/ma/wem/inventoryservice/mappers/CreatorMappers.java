package ma.wem.inventoryservice.mappers;

import ma.wem.inventoryservice.dao.entities.Creator;
import ma.wem.inventoryservice.dtos.CreatorDto;
import ma.wem.inventoryservice.dtos.CreatorDtoInput;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMappers {
    final ModelMapper modelMapper = new ModelMapper();

    public Creator fromCreatortDtoToCreator(CreatorDto creatorDto) {
        return this.modelMapper.map(creatorDto, Creator.class);
    }

    public CreatorDto fromCreatorToCreatorDto(Creator creator) {
        return this.modelMapper.map(creator, CreatorDto.class);
    }

    public CreatorDto fromCreatorDtoInputToCreatorDto(CreatorDtoInput creatorDtoInput) {
        return this.modelMapper.map(creatorDtoInput, CreatorDto.class);
    }

    public CreatorDtoInput fromCreatorDtoToCreatorDtoInput(CreatorDto creatorDto) {
        return this.modelMapper.map(creatorDto, CreatorDtoInput.class);
    }

    public Creator fromCreatorDtoInputToCreator(CreatorDtoInput creatorDtoInput) {
        return this.modelMapper.map(creatorDtoInput, Creator.class);
    }


}
