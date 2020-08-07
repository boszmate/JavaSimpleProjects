package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class Controller {
    Calculator calculator = Calculator.getInstance();
    Operation operation;
    String promptNumber = "";

    @FXML
    Label ton_gram_label, meter_millimeter_label,
            kilometer_mile_label, gallon_liter_label,
            celsius_fahrenheit_label, pound_kilogram_label;

    @FXML
    TextArea ton_gram_text, meter_millimeter_text,
            kilometer_mile_text, gallon_liter_text,
            celsius_fahrenheit_text, pound_kilogram_text;


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

    private boolean isOperationDefined() {
        return operation != null;
    }

    private void displayResult(double result) {
        switch (operation) {
            case TON_TO_GRAM:
                ton_gram_label.setText(String.valueOf(result));
                break;
            case METER_TO_MILLIMETER:
                meter_millimeter_label.setText(String.valueOf(result));
                break;
            case KILOMETER_TO_NAUTICAL_MILE:
                kilometer_mile_label.setText(String.valueOf(result));
                break;
            case GALLON_TO_LITER:
                gallon_liter_label.setText(String.valueOf(result));
                break;
            case CELSIUS_TO_FAHRENHEIT:
                celsius_fahrenheit_label.setText(String.valueOf(result));
                break;
            case POUND_TO_KILOGRAM:
                pound_kilogram_label.setText(String.valueOf(result));
                break;
            default:
                break;
        }
    }

    private void computeResult() {
        if (isOperationDefined()) {
            calculator.setNumberToCalculate(Double.valueOf(promptNumber));
            double result = callCalculatorAction();

            displayResult(result);
        }
    }

    public void clickButtonTonToGram() {
        operation = Operation.TON_TO_GRAM;
        promptNumber = ton_gram_text.getText();
        computeResult();
    }

    public void clickButtonMeterToMillimeter() {
        operation = Operation.METER_TO_MILLIMETER;
        promptNumber = meter_millimeter_text.getText();
        computeResult();
    }

    public void clickButtonKilometerToNauticalMile() {
        operation = Operation.KILOMETER_TO_NAUTICAL_MILE;
        promptNumber = kilometer_mile_text.getText();
        computeResult();
    }

    public void clickButtonCelsiusToFahrenheit() {
        operation = Operation.CELSIUS_TO_FAHRENHEIT;
        promptNumber = celsius_fahrenheit_text.getText();
        computeResult();
    }

    public void clickButtonGallonToLiter() {
        operation = Operation.GALLON_TO_LITER;
        promptNumber = gallon_liter_text.getText();
        computeResult();
    }

    public void clickButtonPoundToKilogram() {
        operation = Operation.POUND_TO_KILOGRAM;
        promptNumber = pound_kilogram_text.getText();
        computeResult();
    }
}
