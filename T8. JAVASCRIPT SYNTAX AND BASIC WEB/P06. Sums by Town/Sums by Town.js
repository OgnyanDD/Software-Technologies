function solve(input) {
    let allTowns = {};

    for (let i = 0; i < input.length; i++) {
        let obj = JSON.parse(input[i]);
        if ((obj.town in allTowns) == false) {
            allTowns[obj.town] = 0;
        }
        allTowns[obj.town] += obj.income;
    }
    let towns = Object.keys(allTowns).sort();

    for (let town of towns) {
        console.log(`${town} -> ${allTowns[town]}`);
    }
}

// solve([
//     '{"town":"Sofia","income":200}',
//     '{"town":"Varna","income":120}',
//     '{"town":"Pleven","income":60}',
//     '{"town":"Varna","income":70}'
// ]);