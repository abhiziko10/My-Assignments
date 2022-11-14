package com.coditas.L3EvaluationCode.Service;

import com.coditas.L3EvaluationCode.Entity.MatchEntity;
import com.coditas.L3EvaluationCode.Entity.PlayerEntity;
import com.coditas.L3EvaluationCode.Model_DTO.RegisterPlayerDTO;
import com.coditas.L3EvaluationCode.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImplementation implements PlayerService{
    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerEntity playerEntity;

    @Autowired
    MatchEntity matchEntity;

    @Override
    public PlayerEntity registerPlayer(RegisterPlayerDTO playerDto) {
        playerEntity.setPlayerFirstName(playerDto.getPlayerFirstName());
        playerEntity.setPlayerLastName(playerDto.getPlayerLastName());
        playerEntity.setPlayerEmail(playerDto.getPlayerEmail());
        playerEntity.setPlayerPassword(playerDto.getPassword());
        return playerRepository.save(playerEntity);
    }


}
