package com.coditas.L3EvaluationCode.Repository;

import com.coditas.L3EvaluationCode.Entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<MatchEntity,Integer> {
}
