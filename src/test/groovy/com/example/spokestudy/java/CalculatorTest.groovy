package com.example.spokestudy.java

import spock.lang.Specification

class CalculatorTest extends Specification {
    def "sum"() {
        given:
//        def a  = 10
//        def b  = 20
//        def expected  = 30
        def calculator = new Calculator()

        when:
        def actual = calculator.sum(a, b)

        then:
        actual == expected

        where:
        a   | b    | expected
        10  | 20   | 30
        -1  | 1    | 0
        1   | -1   | 0
        0   | 0    | 0
        100 | 1000 | 1100
//        100 | 1000 | 100 <- fail
    }
}
