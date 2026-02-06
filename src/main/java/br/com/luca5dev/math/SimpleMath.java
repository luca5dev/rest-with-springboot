package br.com.luca5dev.math;


import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(Double numberOne, Double numberTwo) {
        return (numberOne) + (numberTwo);
    }

    // http://localhost:8080/math/subtraction/3/5
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(Double numberOne, Double numberTwo) {
        return (numberOne) - (numberTwo);
    }

    // http://localhost:8080/math/multiplication/3/5
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(Double numberOne, Double numberTwo) {
        return (numberOne) * (numberTwo);
    }

    // http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(Double numberOne, Double numberTwo) {
        return (numberOne) / (numberTwo);
    }

    // http://localhost:8080/math/mean/3/5
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(Double numberOne, Double numberTwo) {
        return ((numberOne) + (numberTwo)) /2;
    }

    // http://localhost:8080/math/squareroot/3
    public Double squareroot(Double numberOne) {
        return Math.sqrt(numberOne);
    }
}
