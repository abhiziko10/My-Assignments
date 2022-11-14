package com.coditas.L3EvaluationCode.Service;

import com.coditas.L3EvaluationCode.Entity.MatchEntity;
import com.coditas.L3EvaluationCode.Model_DTO.GameDTO;
import com.coditas.L3EvaluationCode.Model_DTO.StartMatchDTO;

public interface GameService {


        public MatchEntity createNewMatch(StartMatchDTO startMatchDTO);
    }