package com.victorhgbb.siscoleta.repository;

import com.victorhgbb.siscoleta.entity.PdvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PdvRepository extends JpaRepository<PdvEntity, Integer> {

}
