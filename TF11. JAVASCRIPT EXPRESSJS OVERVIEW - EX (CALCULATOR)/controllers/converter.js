const Converter = require('../models/converter');
module.exports = {
    indexGet: (req, res) => {
        res.render('home/indexConverter');
    },
    indexPost: (req, res) => {
        let converterBody = req.body;

        let converterParams = converterBody['converter'];

        let converter = new Converter();
        converter.input = Number(converterParams.input);
        converter.unit = converterParams.unit;
        let result = converter.converterResult();
        res.render('home/indexConverter', {'converter': converter, 'result': result});
    },
};