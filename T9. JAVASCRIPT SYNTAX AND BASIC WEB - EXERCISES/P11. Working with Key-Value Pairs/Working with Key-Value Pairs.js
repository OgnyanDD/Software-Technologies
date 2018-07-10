function solve(input) {
    let keyWord = input[input.length - 1];
    let dictionary = {};

    for (let i = 0; i < input.length - 1; i++) {
        let inputLine = input[i].split(' ');
        let key = inputLine[0];
        let value = inputLine[1];

        dictionary[key] = value;
    }
    if (keyWord in dictionary) {
        console.log(dictionary[keyWord]);
    } else {
        console.log('None');
    }
}

// solve(['3 test',
//     '3 test1',
//     '4 test2',
//     '4 test3',
//     '4 test5',
//     '4',
// ]);