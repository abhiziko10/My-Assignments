package com.coditas.L3EvaluationCode.Controller;

import com.coditas.L3EvaluationCode.Entity.PlayerEntity;
import com.coditas.L3EvaluationCode.Service.PlayerServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    PlayerServiceImplementation playerServiceImplementation;

    @PostMapping("/registerPlayer")
    public ResponseEntity registerPlayer(@RequestBody PlayerEntity player){
        HashMap map=new HashMap();
  try{
      PlayerEntity player1=playerServiceImplementation.registerPlayer(player);
      if(player1!=null){
      map.put("Registered Successfully",player1);
          System.out.println("Hiiiiiiiiiiiiiiiiiiii");
      return  new ResponseEntity(map, HttpStatus.CREATED);
      }else{
          System.out.println("Byeeeeeeeeeeeeeeeeeeeeeee");
          return  new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
      }
  } catch (Exception e) {
      System.out.println(e.getMessage());
      return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
  }
    }
}
