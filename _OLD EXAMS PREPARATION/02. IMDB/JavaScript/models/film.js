const Sequelize = require('sequelize');

module.exports = function(sequelize){
    let Film = sequelize.define ('Film', {
        name: {
            type: Sequelize.TEXT,
            required: true,
            allowNull: false
        },
        genre: {
            type: Sequelize.TEXT,
            required: true,
            allowNull: false
        },
        director: {
            type: Sequelize.TEXT,
            required: true,
            allowNull: false
        },
        year: {
            type: Sequelize.INTEGER,
            required: true,
            allowNull: false
        }
    }, {
        timestamps: false // remove datetime from database!
    });
    return Film;
};