function Calculator(leftOperand, operator, rightOperand) {
    this.leftOperand = leftOperand;
    this.operator = operator;
    this.rightOperand = rightOperand;

    this.calculateResult = function () {
        let result = 0;

        switch (this.operator) {
            case "+": {
                result = this.leftOperand + this.rightOperand;
                break;
            }
            case "-": {
                result = this.leftOperand - this.rightOperand;
                break;
            }
            case "*": {
                result = this.leftOperand * this.rightOperand;
                break;
            }
            case "/": {
                result = this.leftOperand / this.rightOperand;
                break;
            }
            case '^':
                result = Math.pow(this.leftOperand, this.rightOperand);
                break;
            case'√':
                result = Math.sqrt(this.leftOperand);
                break;
            case'mod':
                result = this.leftOperand % this.rightOperand;
                break;
            case'sin':
                result = (Math.sin(this.leftOperand / (180 / Math.PI))).toFixed(4);
                break;
            case'cos':
                result = (Math.cos(this.leftOperand / (180 / Math.PI))).toFixed(4);
                break;
            case'tan':
                result = (Math.tan(this.leftOperand / (180 / Math.PI))).toFixed(4);
                break;
            case'!':

            function factorialize(num) {
                if (num < 0) {
                    return NaN;
                } else if (num == 0) {
                    return '1';
                } else {
                    return (num * factorialize(num - 1));
                }
            }

                result = factorialize(this.leftOperand);
                break;
            case'ln':
                result = Math.log(this.leftOperand);
                break;
        }
        return result;
    }
}

module.exports = Calculator;