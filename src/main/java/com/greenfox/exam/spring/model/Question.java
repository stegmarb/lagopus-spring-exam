package com.greenfox.exam.spring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Getter
@Setter
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String question;

  public Question() {
    this.question = selectRandomQuestion();
  }

  public String selectRandomQuestion() {
    List<String> variousQuestons = new ArrayList<>(Arrays.asList("When did your course start? (yyyy.mm.dd)",
        "What type of dog Barbi has?",
        "What is HerrNorbert's favourite color?",
        "How many classes are learning at Green Fox Academy at this moment?",
        "How many mentors teach at Green Fox at this moment?",
        "What was the name of the first Green Fox class?",
        "How many likes do we have on facebook?",
        "What is Tojas's horoscope?"));
    return variousQuestons.get(((int) (Math.random()*variousQuestons.size()))+1);
  }
}
