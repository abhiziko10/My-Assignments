package com.coditas.L3EvaluationCode.Controller;

import com.coditas.L3EvaluationCode.Entity.PlayerEntity;
import com.coditas.L3EvaluationCode.Model_DTO.RegisterPlayerDTO;
import com.coditas.L3EvaluationCode.Service.GameService;
import com.coditas.L3EvaluationCode.Service.PlayerService;
import com.coditas.L3EvaluationCode.Service.PlayerServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Optional;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @Autowired
    GameService matchService;


    @PostMapping("/register")
    public ResponseEntity registerPlayer(@RequestBody RegisterPlayerDTO registerPlayerDto) {
        try {
            return new ResponseEntity(Optional.of(playerService.registerPlayer(registerPlayerDto)), HttpStatus.CREATED);
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
    }

}

