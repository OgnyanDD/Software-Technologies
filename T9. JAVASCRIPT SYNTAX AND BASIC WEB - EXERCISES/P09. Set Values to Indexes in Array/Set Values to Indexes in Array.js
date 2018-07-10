function solve(input) {
    let length = Number(input[0]);
    let array = new Array(length).fill(0);

    for (let i = 1; i < input.length; i++) {
        let tokens = input[i].split(' - ');
        let index = Number(tokens[0]);
        let number = Number(tokens[1]);

        array[index] = number;
    }
    for (let print of array) {
        console.log(print);
    }
}

// solve(['5',
//     '0 - 3',
//     '3 - -1',
//     '4 - 2',
// ]);