function solve(input) {
    let result = [];

    for (let i = 0; i < input.length; i++) {
        let info = input[i].split(' -> ');
        let name = info[0];
        let age = Number(info[1]);
        let grade = Number(info[2]);

        let student = {};
        student.name = name;
        student.age = age;
        student.grade = grade;
        result.push(student);
    }
    for (let student of result) {
        console.log(`Name: ${student.name}`);
        console.log(`Age: ${student.age}`);
        console.log(`Grade: ${student.grade.toFixed(2)}`);
    }
}

// solve(['Pesho -> 13 -> 6.00',
//     'Ivan -> 12 -> 5.57',
//     'Toni -> 13 -> 4.90',
// ]);