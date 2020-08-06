package sample;

public class Calculator {
    private final static Calculator instance = new Calculator();
    private double numberToCalculate = 0;

    private Calculator() {}

    public static Calculator getInstance() {
        return instance;
    }

    public void setNumberToCalculate(int numberToCalculate) {
        this.numberToCalculate = numberToCalculate;
    }

    public double tonToGram() {
        return numberToCalculate * 1000000;
    }

    public double meterToMillimeter() {
        return numberToCalculate * 1000;
    }

    public double kilometerToNauticalMile() {
        return numberToCalculate * 0.6214;
    }

    public double celsiusToFahrenheit() {
        return numberToCalculate * 33.8;
    }

    public double gallonToLiter() {
        return numberToCalculate * 4.54609188;
    }

    public double poundToKilogram() {
        return numberToCalculate * 0.45359237;
    }
}
