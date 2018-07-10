function solve(input) {
    let index = 0;

    while (true) {
        let line = input[index++];

        if (line == 'Stop') {
            break;
        } else {
            console.log(line);
        }
    }
}

// solve(['Line 1',
//     'Line 2',
//     'Line 3',
//     'Stop',
// ]);