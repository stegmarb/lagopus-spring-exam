package com.greenfox.exam.spring.controller;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  private QuestionRepository questionSetRepo;

  @GetMapping("/questions")
  public QuestionRepository getFiveRandomQuestions() {
    for (int i = 0; i < 5; i++) {
      questionSetRepo.save(new Question());
    }
    return questionSetRepo;
  }
}
