package calc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    Calculator calculator = Calculator.getInstance();
    Operation operation;
    boolean isTypingFirstNumber = true;
    String promptFirstNumber = "";
    String promptSecondNumber = "";

    @FXML
    Label label_result;

    private void displayRightNumberInResultLabel() {
        label_result.setText(isTypingFirstNumber ? promptFirstNumber : promptSecondNumber);
    }

    private void promptNumberToRightNumber(int number) {
        if (isTypingFirstNumber) {
            promptFirstNumber = promptFirstNumber.concat(String.valueOf(number));
        } else {
            promptSecondNumber = promptSecondNumber.concat(String.valueOf(number));
        }

        displayRightNumberInResultLabel();
    }

    private void displayFirstNumber() {
        label_result.setText(promptFirstNumber);
    }

    private boolean isSecondNumberExist() {
        return promptSecondNumber.length() > 0;
    }

    private boolean isOperationDefined() {
        return operation != null;
    }

    private int callCalculatorAction() {
        switch (operation) {
            case ADD:
                return calculator.add();
            case SUBTRACT:
                return calculator.subtract();
            case MULTIPLY:
                return calculator.multiply();
            case DIVIDE:
                return calculator.divide();
            default:
                return 0;
        }
    }

    private void switchToSecondNumber() {
        isTypingFirstNumber = false;
        displayFirstNumber();
    }

    public void clickButtonResult() {
        if (isSecondNumberExist() && isOperationDefined()) {
            calculator.setFirstNumber(Integer.valueOf(promptFirstNumber));
            calculator.setSecondNumber(Integer.valueOf(promptSecondNumber));
            int result = callCalculatorAction();

            isTypingFirstNumber = false;
            promptFirstNumber = String.valueOf(result);
            promptSecondNumber = "";
            displayFirstNumber();
        }
    }

    public void clickButtonClear() {
        label_result.setText("");
        promptFirstNumber = "";
        promptSecondNumber = "";
        isTypingFirstNumber = true;
        operation = null;
    }

    public void clickButtonAdd() {
        operation = Operation.ADD;
        switchToSecondNumber();
    }

    public void clickButtonSubtract() {
        operation = Operation.SUBTRACT;
        switchToSecondNumber();
    }

    public void clickButtonMultiply() {
        operation = Operation.MULTIPLY;
        switchToSecondNumber();
    }

    public void clickButtonDivide() {
        operation = Operation.DIVIDE;
        switchToSecondNumber();
    }

    public void clickButtonOne() {
        promptNumberToRightNumber(1);
    }

    public void clickButtonTwo() {
        promptNumberToRightNumber(2);
    }

    public void clickButtonThree() {
        promptNumberToRightNumber(3);
    }

    public void clickButtonFour() {
        promptNumberToRightNumber(4);
    }

    public void clickButtonFive() {
        promptNumberToRightNumber(5);
    }

    public void clickButtonSix() {
        promptNumberToRightNumber(6);
    }

    public void clickButtonSeven() {
        promptNumberToRightNumber(7);
    }

    public void clickButtonEight() {
        promptNumberToRightNumber(8);
    }

    public void clickButtonNine() {
        promptNumberToRightNumber(9);
    }

    public void clickButtonZero() {
        promptNumberToRightNumber(0);
    }
}
