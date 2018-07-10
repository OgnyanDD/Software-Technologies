function solve(input) {
    let student = {};

    for (let line of input) {
        let studentList = line.split(' -> ');
        let info = studentList[0];
        let value = isNaN(studentList[1]) ? studentList[1] : Number(studentList[1]);

        student[info] = value;
    }
    console.log(JSON.stringify(student));
}

// solve(['name -> Angel',
//     'surname -> Georgiev',
//     'age -> 20',
//     'grade -> 6.00',
//     'date -> 23/05/1995',
//     'town -> Sofia',
// ]);