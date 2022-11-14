package com.coditas.L3EvaluationCode.Controller;

import com.coditas.L3EvaluationCode.Entity.MatchEntity;
import com.coditas.L3EvaluationCode.Model_DTO.GameDTO;
import com.coditas.L3EvaluationCode.Model_DTO.StartMatchDTO;
import com.coditas.L3EvaluationCode.Service.GameService;
import com.coditas.L3EvaluationCode.Service.GameServiceImplementation;
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
@RequestMapping("/game")
public class GameController {
    @Autowired
    GameService matchService;

    @PostMapping("/startMatch")
    public ResponseEntity createNewMatch(@RequestBody StartMatchDTO startMatchDto) {

        try {
            return new ResponseEntity(Optional.of(matchService.createNewMatch(startMatchDto)), HttpStatus.CREATED);
        }catch(Exception exception){
            exception.printStackTrace();
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
