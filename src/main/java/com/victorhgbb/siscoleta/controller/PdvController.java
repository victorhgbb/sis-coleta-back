package com.victorhgbb.siscoleta.controller;

import com.victorhgbb.siscoleta.dto.PdvDTO;
import com.victorhgbb.siscoleta.service.PdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pdv")
public class PdvController {

    private final PdvService pdvService;

    @Autowired
    public PdvController(PdvService pdvService){
        this.pdvService = pdvService;
    }

    @PostMapping
    public ResponseEntity<Void> save(PdvDTO pdvDTO){
        this.pdvService.save(pdvDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<PdvDTO>> getPdv(@RequestParam(required = false) String nome,
                                                  @RequestParam(required = false) Integer idade,
                                                  @RequestParam(required = false) Integer cpf){
        List<PdvDTO> pdvList = this.pdvService.getPdv();
        return ResponseEntity.ok(pdvList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        this.pdvService.delete(id);
        return ResponseEntity.ok().build();
    }

}
