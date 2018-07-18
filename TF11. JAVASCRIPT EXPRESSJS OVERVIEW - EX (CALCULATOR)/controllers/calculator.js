const Calculator = require('../models/calculator');
module.exports = {
    indexGet: (req, res) => {
        res.render('home/indexCalculator');
    },
    indexPost: (req, res) => {
        let calculatorBody = req.body;

        let calculatorParams = calculatorBody['calculator'];

        let calculator = new Calculator();
        calculator.leftOperand = Number(calculatorParams.leftOperand);
        calculator.operator = calculatorParams.operator;
        calculator.rightOperand = Number(calculatorParams.rightOperand);
        let result = calculator.calculateResult();
        res.render('home/indexCalculator', {'calculator': calculator, 'result': result});
    },
};