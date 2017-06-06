package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.RandomQuestionSet;
import org.springframework.data.repository.CrudRepository;

public interface RandomQuestionSetRepository extends CrudRepository<RandomQuestionSet, Long> {
}
