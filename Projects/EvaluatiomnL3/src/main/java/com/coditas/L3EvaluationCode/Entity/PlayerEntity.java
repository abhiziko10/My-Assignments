package com.coditas.L3EvaluationCode.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private long playerId;
    private String playerFirstName;
    private String playerLastName;
    private String playerScore;
     private String playerEmail;
     private String playerPassword;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_id")
    private MatchEntity matchEntity;

    @OneToMany(mappedBy = "playerEntity", cascade = CascadeType.ALL)
    private List<LeaderBoard> leaderBoardEntities = new ArrayList<>();

}


