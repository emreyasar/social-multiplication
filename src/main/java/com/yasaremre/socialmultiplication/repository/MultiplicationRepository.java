package com.yasaremre.socialmultiplication.repository;

import com.yasaremre.socialmultiplication.domain.Multiplication;
import org.springframework.data.repository.CrudRepository;

/**
 * This interface allows us to save and retrieve Multiplications
 */
public interface MultiplicationRepository extends CrudRepository<Multiplication, Long> {
}
