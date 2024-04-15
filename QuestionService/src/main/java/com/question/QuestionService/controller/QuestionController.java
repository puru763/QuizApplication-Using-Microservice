package com.question.QuestionService.controller;


import com.question.QuestionService.entity.Question;
import com.question.QuestionService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/question")
public class QuestionController {




    @Autowired
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @PostMapping("/create")
    public Question craete(@RequestBody Question question)
    {
        return questionService.create(question);
    }

    @GetMapping("/allquestions")
    public List<Question> getALl()
    {
        return questionService.get();
    }

    @GetMapping("/{questionid}")
    public Question getOne(@PathVariable Long id)
    {
        return questionService.getOne(id);
    }


    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId)
    {
        return questionService.GetQuestionsOfQuiz(quizId);
    }








}
