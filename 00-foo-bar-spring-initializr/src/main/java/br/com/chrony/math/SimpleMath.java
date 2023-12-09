package br.com.chrony.math;

import static br.com.chrony.converters.NumberConverter.convertToDouble;
import static br.com.chrony.converters.NumberConverter.isNumeric;
import static java.lang.Math.sqrt;

import br.com.chrony.exception.UnsuportedMathOperationException;

public class SimpleMath {

    public static Double sum(Double firstNnumber, Double secondNumber) {
        return firstNnumber + secondNumber;
    }

    public static Double subtraction(Double firstNnumber, Double secondNumber) {
        return firstNnumber - secondNumber;
    }

    public static Double multiplication(Double firstNnumber, Double secondNumber) {
        return firstNnumber * secondNumber;
    }

    public static Double division(Double firstNnumber, Double secondNumber) {
        return firstNnumber / secondNumber;
    }

    public static Double mean(Double firstNnumber, Double secondNumber) {
        return (firstNnumber + secondNumber) / 2;
    }

    public static Double squareRoot(Double number) {
        return sqrt(number);
    }

}
