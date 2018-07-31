package com.softuni.entity;

public class Calculator {
    private double leftOperand;
    private double rightOperand;
    private String operator;

    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculateResult() {
        double result = 0.0;

        switch (this.operator) {
            case "+": {
                result = this.leftOperand + this.rightOperand;
            }
            break;
            case "-": {
                result = this.leftOperand - this.rightOperand;
            }
            break;
            case "*": {
                result = this.leftOperand * this.rightOperand;
            }
            break;
            case "/": {
                result = this.leftOperand / this.rightOperand;
            }
            break;
            case "^": {
                result = Math.pow(this.leftOperand, this.rightOperand);
            }
            break;
            case "mod": {
                result = this.leftOperand % this.rightOperand;
            }
            break;
            case "√": {
                result = Math.sqrt(this.leftOperand);
            }
            break;
            case "sin": {
                result = Math.sin(this.leftOperand / (180 / Math.PI));
            }
            break;
            case "cos": {
                result = Math.cos(this.leftOperand / (180 / Math.PI));
            }
            break;
            case "tan": {
                result = Math.tan(this.leftOperand / (180 / Math.PI));
            }
            break;
            case "!": {
                result = factorial(this.leftOperand);
            }
            break;
            case "ln": {
                result = Math.log(this.leftOperand);
            }
            break;

            default: {
                result = 0;
            }
            break;
        }
        return result;
    }


    private double factorial(double num) {
        if (num < 0) {
            return Double.NaN;
        } else if (num == 0) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }
}