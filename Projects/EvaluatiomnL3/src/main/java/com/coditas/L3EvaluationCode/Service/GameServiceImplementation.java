package com.coditas.L3EvaluationCode.Service;

import com.coditas.L3EvaluationCode.Entity.MatchEntity;
import com.coditas.L3EvaluationCode.Entity.PlayerEntity;
import com.coditas.L3EvaluationCode.Model_DTO.StartMatchDTO;
import com.coditas.L3EvaluationCode.Repository.MatchRepository;
import com.coditas.L3EvaluationCode.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameServiceImplementation implements GameService {
    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerEntity playerEntity;

    @Autowired
    MatchEntity matchEntity;

    @Autowired
    MatchRepository matchRepository;

    @Override
    public MatchEntity createNewMatch(StartMatchDTO startMatchDto) {
        PlayerEntity playerOne = playerRepository.findById((int) startMatchDto.getPlayerOneId()).orElse(null);
        PlayerEntity playerTwo = playerRepository.findById((int) startMatchDto.getPlayerTwoId()).orElse(null);

        List<PlayerEntity> playersEnrolled = new ArrayList<>();
        playersEnrolled.add(playerOne);
        playersEnrolled.add(playerTwo);
        matchEntity.setPlayers(playersEnrolled);
        matchEntity.setMatchName(startMatchDto.getMatchName());
        playerRepository.save(playerOne);
        playerRepository.save(playerTwo);
        return matchRepository.save(matchEntity);
    }


}