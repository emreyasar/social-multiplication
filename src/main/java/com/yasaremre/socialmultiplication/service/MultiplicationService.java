package com.yasaremre.socialmultiplication.service;

import com.yasaremre.socialmultiplication.domain.Multiplication;

public interface MultiplicationService {
    /**
     * Creates a Multiplication object with two randomly- generated factors
     * between 11 and 99.
     *
     * @return a Multiplication object with random factors */
    Multiplication createRandomMultiplication();
}
