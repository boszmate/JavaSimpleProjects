package sample;

import javafx.fxml.FXML;

import java.awt.*;

public class Controller {
    Calculator calculator = Calculator.getInstance();
    Operation operation;

    @FXML
    Label ton_gram_label, meter_millimeter_label,
            kilometer_mile_label, gallon_liter_label,
            celsius_fahrenheit_label, pound_kilogram_label;

    private double callCalculatorAction() {
        switch (operation) {
            case TON_TO_GRAM:
                return calculator.tonToGram();
            case METER_TO_MILLIMETER:
                return calculator.meterToMillimeter();
            case KILOMETER_TO_NAUTICAL_MILE:
                return calculator.kilometerToNauticalMile();
            case GALLON_TO_LITER:
                return calculator.gallonToLiter();
            case CELSIUS_TO_FAHRENHEIT:
                return calculator.celsiusToFahrenheit();
            case POUND_TO_KILOGRAM:
                return calculator.poundToKilogram();
            default:
                return 0;
        }
    }

    public void clickButtonTonToGram() {}
}
