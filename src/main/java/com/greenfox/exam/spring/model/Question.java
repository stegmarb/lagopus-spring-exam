package com.greenfox.exam.spring.model;

import com.greenfox.exam.spring.repository.QuestionRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String question;

  public Question() {
  }

  public Question(String question) {
    this.question = question;
  }
}
