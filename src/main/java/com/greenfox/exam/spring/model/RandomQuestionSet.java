package com.greenfox.exam.spring.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Entity
@Getter
@Setter
public class RandomQuestionSet {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private List<Question> questions;

  public RandomQuestionSet() {
    for (int i = 0; i < 5; i++) {
      questions.add(new Question());
    }
  }
}
