function solve(arr) {
    let num1 = Number(arr[0]);
    let num2 = Number(arr[1]);
    let num3 = Number(arr[2]);

    let minusCounter = 0;

    if (num1 == 0 || num2 == 0 || num3 == 0) {
        console.log('Positive');

    } else {
        if (num1 < 0) {
            minusCounter++;
        }
        if (num2 < 0) {
            minusCounter++;
        }
        if (num3 < 0) {
            minusCounter++;
        }
        if (minusCounter == 0 || minusCounter == 2) {
            console.log('Positive');
        } else {
            console.log('Negative');
        }
    }
}

//solve(['0', '-4', '5']);