package com.victorhgbb.siscoleta.controller;

import com.victorhgbb.siscoleta.dto.PdcDTO;
import com.victorhgbb.siscoleta.service.PdcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pdc")
public class PdcController {

    private final PdcService pdcService;

    @Autowired
    public PdcController(PdcService pdcService){
        this.pdcService = pdcService;
    }

    @PostMapping
    public ResponseEntity<Void> save(PdcDTO pdcDTO){
        this.pdcService.save(pdcDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<PdcDTO>> getPdc(@RequestParam(required = false) String nome,
                                               @RequestParam(required = false) Integer idade,
                                               @RequestParam(required = false) Integer cpf){
        List<PdcDTO> pdvList = this.pdcService.getPdc();
        return ResponseEntity.ok(pdvList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        this.pdcService.delete(id);
        return ResponseEntity.ok().build();
    }

}
