package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.Answer;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRepository extends CrudRepository<Answer, Long>{
}
