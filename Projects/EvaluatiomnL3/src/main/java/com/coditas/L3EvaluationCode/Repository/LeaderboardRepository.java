package com.coditas.L3EvaluationCode.Repository;

import com.coditas.L3EvaluationCode.Entity.LeaderBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderboardRepository extends JpaRepository<LeaderBoardEntity, Integer> {
}
