function solve(arr) {
    let num1 = Number(arr[0]);
    let num2 = Number(arr[1]);

    let result = 0;

    if (num1 <= num2) {
        result = num1 * num2;
    } else {
        result = num1 / num2;
    }
    console.log(result);
}

// solve(['144', '12']);