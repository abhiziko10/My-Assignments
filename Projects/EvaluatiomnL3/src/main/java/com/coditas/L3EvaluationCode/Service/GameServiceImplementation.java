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
        PlayerEntity player1 = playerRepository.findById(startMatchDTO.getPlayer1Id()).orElse(null);
        PlayerEntity player2 = playerRepository.findById(startMatchDTO.getPlayer2Id()).orElse(null);


        player1.setPlayerStatus("Playing already");
        player2.setPlayerStatus("Playing already");
        List<PlayerEntity> playersEnrolled = new ArrayList<>();
        playersEnrolled.add(player1);
        playersEnrolled.add(player2);
        matchEntity.setPlayers(playersEnrolled);
        matchEntity.setMatchName(startMatchDTO.getMatchName());
        playerRepository.save(player1);
        playerRepository.save(player2);
        return matchRepository.save(matchEntity);
    }


    public PlayerMoveDTO playerMove (int player1Move, int player2Move){
        if (player1Move == player2Move){
            throw  new  SamePositionOccupiedException();
        }
        playerMoveDto.setPlayer1Move(player1Move);
        playerMoveDto.setPlayerTwoMove(player2Move);
    }
     
}
