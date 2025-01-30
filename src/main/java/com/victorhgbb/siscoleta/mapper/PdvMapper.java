package com.victorhgbb.siscoleta.mapper;

import com.victorhgbb.siscoleta.dto.PdvDTO;
import com.victorhgbb.siscoleta.entity.PdvEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PdvMapper {

    PdvDTO toDto(PdvEntity pdv);

    PdvEntity toEntity(PdvDTO pdv);

    List<PdvDTO> toListDto(List<PdvEntity> pdv);
}
