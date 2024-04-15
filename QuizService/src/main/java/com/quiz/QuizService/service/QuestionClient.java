package com.quiz.QuizService.service;


import com.quiz.QuizService.entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "https://localhost:8082" , value = "Question-Client")
public interface QuestionClient {


    @GetMapping("/quiz/question/{quizId}")
    List<Question> getQuestionOfQuiz(@PathVariable Long quidId);
}
