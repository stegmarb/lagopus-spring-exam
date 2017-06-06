package com.greenfox.exam.spring.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
public class RandomQuestionSet {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Question questions;

  public RandomQuestionSet() {
    this.questions = new Question();
  }
}
