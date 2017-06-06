package com.greenfox.exam.spring.controller;
import com.greenfox.exam.spring.model.RandomQuestionSet;
import com.greenfox.exam.spring.repository.RandomQuestionSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  private RandomQuestionSetRepository questionSetRepo;

  @GetMapping("/questions")
  public RandomQuestionSet getFiveRandomQuestions() {
    return new RandomQuestionSet();
  }
}
