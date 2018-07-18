const homeCalculator = require('../controllers/calculator');
const homeConverter = require('../controllers/converter');

module.exports = (app) => {
    app.get('/', homeCalculator.indexGet);
    app.post('/', homeCalculator.indexPost);

    app.get('/home/indexConverter', homeConverter.indexGet);
    app.post('/home/indexConverter', homeConverter.indexPost);
};
