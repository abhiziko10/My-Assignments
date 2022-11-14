package com.coditas.L3EvaluationCode.Controller;

import com.coditas.L3EvaluationCode.Entity.MatchEntity;
import com.coditas.L3EvaluationCode.Model_DTO.GameDTO;
import com.coditas.L3EvaluationCode.Service.GameServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired
    GameServiceImplementation gameServiceImplementation;
    @PostMapping("/createGame")
    public ResponseEntity createGame(@RequestBody GameDTO gameDTO){
        HashMap map=new HashMap();
        try{
            MatchEntity game=gameServiceImplementation.registerGame(gameDTO);
            if(game!=null){
                System.out.println("Byeeeeeeeeeeeeeeeeeeeeeee");
                map.put("Ready to start the game",game);
                return new ResponseEntity(map, HttpStatus.CREATED);

            }else{
                System.out.println("HIIIIIIIIIIIIIII");
                return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
