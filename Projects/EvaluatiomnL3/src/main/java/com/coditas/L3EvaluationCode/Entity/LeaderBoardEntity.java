package com.coditas.L3EvaluationCode.Entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Component
public class LeaderBoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long leaderBoardId;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "player_Id")
    private PlayerEntity playerEntity;

    private int totalScores;

}