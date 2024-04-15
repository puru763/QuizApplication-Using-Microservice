package com.quiz.QuizService.controller;


import com.quiz.QuizService.entity.Quiz;
import com.quiz.QuizService.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class QuizController {


    @Autowired
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz)
    {
        return quizService.add(quiz);
    }


    @GetMapping("/getall")
    public List<Quiz> get() {
        return quizService.get();
    }

    @GetMapping("/{:id}")
    public Quiz getOne(@PathVariable Long id)
    {
        return quizService.get(id);
    }


}
