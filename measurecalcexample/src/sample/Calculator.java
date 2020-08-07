package sample;

public class Calculator {
    private final static Calculator instance = new Calculator();
    private double numberToCalculate = 0;

    private Calculator() {}

    public static Calculator getInstance() {
        return instance;
    }

    public void setNumberToCalculate(double numberToCalculate) {
        this.numberToCalculate = numberToCalculate;
    }

    public double tonToGram() {
        return numberToCalculate * 1000000;
    }

    public double meterToMillimeter() {
        return numberToCalculate * 1000;
    }

    public double kilometerToNauticalMile() {
        return numberToCalculate * 0.539956803;
    }

    public double celsiusToFahrenheit() {
        return numberToCalculate * 9/5 + 32;
    }

    public double gallonToLiter() {
        return numberToCalculate * 4.54609188;
    }

    public double poundToKilogram() {
        return numberToCalculate * 0.45359237;
    }
}
