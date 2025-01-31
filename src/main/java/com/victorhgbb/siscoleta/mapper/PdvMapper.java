package com.victorhgbb.siscoleta.mapper;

import com.victorhgbb.siscoleta.dto.PdcDTO;
import com.victorhgbb.siscoleta.entity.PdcEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PdvMapper {

    PdcDTO toDto(PdcEntity pdv);

    PdcEntity toEntity(PdcDTO pdv);

    List<PdcDTO> toListDto(List<PdcEntity> pdv);
}
