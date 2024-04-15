package com.quiz.QuizService.service;


import com.quiz.QuizService.entity.Question;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(url = "https://localhost:8082" , value = "Question-Client")
public interface QuestionClient {

    List<Question> getQuestionOfQuiz();
}
