package com.example.spokestudy.java

import spock.lang.Specification

class Calculator2Test extends Specification {
    def "sum"() {
        given:
//        def a  = 10
//        def b  = 20
//        def expected  = 30
        def calculator = new Calculator2()

        when:
        def actual = calculator.sum(a, b)

        then:
        actual == expected

        where:
        a   | b    | expected
        10  | 20   | 30
        100 | 1000 | 1100
    }

    def "exception"() {
        given:
        def a = -1
        def b = 10
        def calculator = new Calculator2()

        when:
        def actual = calculator.sum(a, b)

        then:
        thrown(RuntimeException.class)
    }
}
