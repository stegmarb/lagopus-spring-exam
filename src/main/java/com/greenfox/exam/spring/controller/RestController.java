package com.greenfox.exam.spring.controller;
import com.greenfox.exam.spring.model.Answer;
import com.greenfox.exam.spring.model.AnswerList;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.RandomQuestionSet;
import com.greenfox.exam.spring.repository.AnswerRepository;
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

  @Autowired
  private AnswerRepository answerRepo;

  @Autowired
  private RandomQuestionSet randomQuestionSet;

  @Autowired
  private AnswerList answerList;

  @GetMapping("/questions")
  public RandomQuestionSet getFiveRandomQuestions() {
    questionRepo.save(new Question("When did your course start? (yyyy.mm.dd)"));
    questionRepo.save(new Question("What type of dog Barbi has?"));
    questionRepo.save(new Question("What is HerrNorbert's favourite color?"));
    questionRepo.save(new Question("How many classes are learning at Green Fox Academy at this moment?"));
    questionRepo.save(new Question("How many mentors teach at Green Fox at this moment?"));
    questionRepo.save(new Question("What was the name of the first Green Fox class?"));
    questionRepo.save(new Question("How many likes do we have on facebook?"));
    questionRepo.save(new Question("What is Tojas's horoscope?"));
    answerRepo.save(new Answer("2017.03.13"));
    answerRepo.save(new Answer("Whippet"));
    answerRepo.save(new Answer("Green"));
    answerRepo.save(new Answer("4"));
    answerRepo.save(new Answer("16"));
    answerRepo.save(new Answer("Vulpes"));
    answerRepo.save(new Answer("~3300"));
    answerRepo.save(new Answer("Libra"));
    for (int i = 0; i < 5; i++) {
      randomQuestionSet.addElement(questionRepo.findOne((long) (Math.random() * questionRepo.count())));
      answerList.addElement(answerRepo.findOne(randomQuestionSet.getQuestions().get(i).getId()));
      randomQuestionSet.changeId(i);
      answerList.changeId(i);
    }
    randomQuestionSet.setId((long)1);
    answerList.setId((long) 1);
    return randomQuestionSet;
  }

  @GetMapping("/answers")
  public AnswerList getAnswers() {
    return answerList;
  }

  @PostMapping("/answers")
  public void receiveAnswer(@RequestBody Answer answer) {}
}
