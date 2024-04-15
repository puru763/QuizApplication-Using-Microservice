package com.question.QuestionService.service;

import com.question.QuestionService.entity.Question;

import java.util.List;

public interface QuestionService {
        Question create(Question question);
        List<Question> get();
        Question getOne(Long id);


        List<Question> GetQuestionsOfQuiz(Long quidId);
}
