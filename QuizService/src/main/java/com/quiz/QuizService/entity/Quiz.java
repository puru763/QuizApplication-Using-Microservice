package com.quiz.QuizService.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    transient  private List<Question> questions;
}
