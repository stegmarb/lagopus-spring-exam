package com.greenfox.exam.spring.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Component
public class RandomQuestionSet {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private List<Question> questions;

  public RandomQuestionSet() {
    questions = new ArrayList<>();
  }

  public void addElement(Question question) {
    questions.add(question);
  }

  public void changeId(int i) {
    questions.get(i).setId((long) i+1);
  }
}
