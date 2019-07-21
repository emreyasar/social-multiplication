package com.yasaremre.socialmultiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * This class represents a Multiplication in our application.
 */

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
@Entity
public final class Multiplication {

    @Id
    @GeneratedValue
    @Column(name = "MULTIPLICATION_ID")
    private Long id;

    // Both factors
    private final int factorA;
    private final int factorB;

    // Empty constructor for JSON (de)serialization and JPA
    Multiplication() {
        this(0, 0);
    }

}
