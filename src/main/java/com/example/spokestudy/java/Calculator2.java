package com.example.spokestudy.java;

public class Calculator2 {
    public int sum(int a, int b) {
        if (a < 0 || b < 0) {
            throw new RuntimeException();
        }
        return a + b;
    }
}
