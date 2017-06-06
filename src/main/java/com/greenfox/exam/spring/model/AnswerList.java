package com.greenfox.exam.spring.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@Setter
public class AnswerList {
  private Long id;
  private List<Answer> answers;

  public AnswerList() {
    this.answers = new ArrayList<>();
  }

  public AnswerList(Long id, List<Answer> answers) {
    this.id = id;
    this.answers = answers;
  }

  public void addElement(Answer answer) {
    answers.add(answer);
  }

  public void changeId(int i) {
    answers.get(i).setId((long) i + 1);
  }
}
