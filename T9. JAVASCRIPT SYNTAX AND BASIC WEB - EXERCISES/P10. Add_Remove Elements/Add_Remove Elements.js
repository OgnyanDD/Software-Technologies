function solve(input) {
    let arr = [];

    for (let i = 0; i < input.length; i++) {
        let inputLine = input[i].split(' ');
        let command = inputLine[0];
        let argument = Number(inputLine[1]);

        if (command == 'add') {
            arr.push(argument);
        } else {
            arr.splice(argument, 1);
        }
    }
    console.log(arr.join('\r\n'));
}

// solve(['add 3',
//     'add 5',
//     'remove 1',
//     'add 2',
// ]);