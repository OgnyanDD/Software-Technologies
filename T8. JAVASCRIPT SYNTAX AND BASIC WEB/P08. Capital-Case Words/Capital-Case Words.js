function solve(input) {

    let result = [];

    for (let str of input) {

        let capitalCaseWords = str.match(/\b[A-Z]+\b/g);
        result.push(capitalCaseWords.join(", "));
    }

    console.log(result.join(", "));
}

solve(['We start by HTML, CSS, JavaScript, JSON and REST.',
    'Later we touch some PHP, MySQL and SQL.',
    'Later we play with C#, EF, SQL Server and ASP.NET MVC.',
    'Finally, we touch some Java, Hibernate and Spring.MVC.'
]);