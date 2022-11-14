package com.coditas.L3EvaluationCode.Service;

import com.coditas.L3EvaluationCode.Entity.MatchEntity;
import com.coditas.L3EvaluationCode.Entity.PlayerEntity;
import com.coditas.L3EvaluationCode.Exception.PositionOccupiedException;
import com.coditas.L3EvaluationCode.Model_DTO.GameDTO;
import com.coditas.L3EvaluationCode.Model_DTO.PlayerMoveDTO;
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
    PlayerMoveDTO playerMoveDto;
    @Autowired
    GameDTO gameDTO;
    @Autowired
    MatchEntity matchEntity;
    @Autowired
    StartMatchDTO startMatchDTO;



    @Autowired
    MatchRepository matchRepository;

    @Override
    public MatchEntity createNewMatch(StartMatchDTO startMatchDto){
        PlayerEntity playerOne = playerRepository.findById(startMatchDTO.getPlayerOneId()).orElse(null);
        PlayerEntity playerTwo = playerRepository.findById(startMatchDTO.getPlayerTwoId()).orElse(null);


        playerOne.setPlayerStatus("In a game");
        playerTwo.setPlayerStatus("in a game");
        List<PlayerEntity> playersEnrolled = new ArrayList<>();
        playersEnrolled.add(playerOne);
        playersEnrolled.add(playerTwo);
        matchEntity.setPlayers(playersEnrolled);
        matchEntity.setMatchName(startMatchDTO.getMatchName());
        playerRepository.save(playerOne);
        playerRepository.save(playerTwo);
        return matchRepository.save(matchEntity);
    }


    public PlayerMoveDTO playerMove (int playerOneMove, int playerTwoMove){
        if (playerOneMove == playerTwoMove){
            throw  new PositionOccupiedException();
        }
        playerMoveDto.setPlayerOneMove(playerOneMove);
        playerMoveDto.setPlayerTwoMove(playerTwoMove);
    }
     
}
