package com.greenfox.exam.spring.controller;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.RandomQuestionSet;
import com.greenfox.exam.spring.repository.QuestionRepository;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  private QuestionRepository questionRepo;
  private RandomQuestionSet randomQuestionSet;

  @GetMapping("/questions")
  public RandomQuestionSet getFiveRandomQuestions() {
    }
    return new RandomQuestionSet();
  }
}
