const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    const Article = sequelize.define('Article', {
        link: {
            type: Sequelize.TEXT,
            allowNull: true,
            required: false
        },
        publicationType: {
            type: Sequelize.STRING,
            allowNull: false,
            required: true
        },
        title: {
            type: Sequelize.STRING,
            allowNull: false,
            required: true,
        },
        content: {
            type: Sequelize.TEXT,
            allowNull: false,
            required: true
        },
        date: {
            type: Sequelize.DATE,
            allowNull: false,
            required: true,
            defaultValue: Sequelize.NOW,
        },

    });

    Article.associate = function (models) {
        Article.belongsTo(models.User, {
            foreignKey: 'authorId',
            targetKey: 'id'
        });
    };

    return Article;
};