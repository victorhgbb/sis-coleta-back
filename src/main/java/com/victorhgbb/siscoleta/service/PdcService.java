package com.victorhgbb.siscoleta.service;

import com.victorhgbb.siscoleta.dto.PdcDTO;
import com.victorhgbb.siscoleta.entity.PdcEntity;
import com.victorhgbb.siscoleta.mapper.PdvMapper;
import com.victorhgbb.siscoleta.repository.PdcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PdcService {

    private final PdcRepository pdcRepository;
    private final PdvMapper pdvMapper;

    @Autowired
    public PdcService(PdcRepository pdcRepository, PdvMapper pdvMapper){
        this.pdcRepository = pdcRepository;
        this.pdvMapper = pdvMapper;
    }

    public void save(PdcDTO pdcDTO){
        PdcEntity pdv = this.pdvMapper.toEntity(pdcDTO);
        this.pdcRepository.save(pdv);
    }

    public List<PdcDTO> getPdc(){
        List<PdcEntity> pdcList = this.pdcRepository.findAll();
        return pdvMapper.toListDto(pdcList);
    }

    public void delete(Integer id){
        PdcEntity pdv = this.pdcRepository.findById(id).orElseThrow(() -> new RuntimeException("PDV not found"));
        this.pdcRepository.delete(pdv);
    }

}
