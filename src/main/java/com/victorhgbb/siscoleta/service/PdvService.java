package com.victorhgbb.siscoleta.service;

import com.victorhgbb.siscoleta.dto.PdvDTO;
import com.victorhgbb.siscoleta.entity.PdvEntity;
import com.victorhgbb.siscoleta.mapper.PdvMapper;
import com.victorhgbb.siscoleta.repository.PdvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PdvService {

    private final PdvRepository pdvRepository;
    private final PdvMapper pdvMapper;

    @Autowired
    public PdvService(PdvRepository pdvRepository, PdvMapper pdvMapper){
        this.pdvRepository = pdvRepository;
        this.pdvMapper = pdvMapper;
    }

    public void save(PdvDTO pdvDTO){
        PdvEntity pdv = this.pdvMapper.toEntity(pdvDTO);
        this.pdvRepository.save(pdv);
    }

    public List<PdvDTO> getPdv(){
        List<PdvEntity> pdvList = this.pdvRepository.findAll();
        return pdvMapper.toListDto(pdvList);
    }

    public void delete(Integer id){
        PdvEntity pdv = this.pdvRepository.findById(id).orElseThrow(() -> new RuntimeException("PDV not found"));
        this.pdvRepository.delete(pdv);
    }

}
