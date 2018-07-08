function solve(arr) {
    let numbers = arr.map(Number);
    let sortedNumbs = numbers.sort((a, b) => b - a);
    let count = Math.min(3, arr.length);

    for (let i = 0; i < count; i++) {
        console.log(sortedNumbs[i]);
    }
}
// solve(['10', '30', '15', '20', '50', '5']);