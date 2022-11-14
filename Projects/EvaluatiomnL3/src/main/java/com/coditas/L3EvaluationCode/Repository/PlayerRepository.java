package com.coditas.L3EvaluationCode.Repository;

import com.coditas.L3EvaluationCode.Entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity,Integer> {

}
