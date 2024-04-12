package org.example.exercise3;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    public String inputNumber = "";
    public String symbol;
    public String savedNumber = "";

    @FXML
    public TextField textField;

    @FXML
    protected void clickButton1() {
        addNumber("1");
    }

    @FXML
    protected void clickButton2() {
        addNumber("2");
    }

    @FXML
    protected void clickButton3() {
        addNumber("3");
    }

    @FXML
    protected void clickButton4() {
        addNumber("4");
    }

    @FXML
    protected void clickButton5() {
        addNumber("5");
    }

    @FXML
    protected void clickButton6() {
        addNumber("6");
    }

    @FXML
    protected void clickButton7() {
        addNumber("7");
    }

    @FXML
    protected void clickButton8() {
        addNumber("8");
    }

    @FXML
    protected void clickButton9() {
        addNumber("9");
    }

    @FXML
    protected void clickButton0() {
        if (!inputNumber.equals("")){
            addNumber("0");
        }
    }

    public void addNumber(String number) {
        textField.setText("");
        inputNumber = inputNumber + number;
        textField.setText(inputNumber);
    }

    @FXML
    protected void add() {
        countingProcess("+");
    }

    @FXML
    protected void minus() {
        countingProcess("-");
    }

    @FXML
    protected void multiply() {
        countingProcess("*");
    }

    @FXML
    protected void divide() {
        countingProcess("/");
    }

    public void countingProcess(String symbol) {
        this.symbol = symbol;
        savedNumber = inputNumber;
        inputNumber = "";
    }

    @FXML
    protected void clear() {
        inputNumber = "";
        savedNumber = "";
        textField.setText("");
    }

    @FXML
    protected void calculate() {
        int intInputNumber = Integer.parseInt(inputNumber);
        int intSavedNumber = Integer.parseInt(savedNumber);

        switch (symbol) {
            case "+" :
                int addResult = intInputNumber + intSavedNumber;
                inputNumber = "";
                savedNumber = "";
                textField.setText(String.valueOf(addResult));
                break;
            case "-" :
                int minusResult = intSavedNumber - intInputNumber;
                inputNumber = "";
                savedNumber = "";
                textField.setText(String.valueOf(minusResult));
                break;
            case "*" :
                int multiplyResult = intSavedNumber * intInputNumber;
                inputNumber = "";
                savedNumber = "";
                textField.setText(String.valueOf(multiplyResult));
                break;
            case "/" :
                double divideResult = (double) intSavedNumber / (double) intInputNumber;
                inputNumber = "";
                savedNumber = "";
                textField.setText(String.valueOf(divideResult));
                break;
        }
    }
}