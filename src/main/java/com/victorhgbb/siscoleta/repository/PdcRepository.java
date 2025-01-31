package com.victorhgbb.siscoleta.repository;

import com.victorhgbb.siscoleta.entity.PdcEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PdcRepository extends JpaRepository<PdcEntity, Integer> {

}
