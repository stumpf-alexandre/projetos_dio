//array dos alunos
const aluno = [
    {
        nome: 'João',
        nota: 5,
        turma: '1B',
    },
    {
        nome: 'sofia',
        nota: 9,
        turma: '1B',
    },
    {
        nome: 'Paulo',
        nota: 6,
        turma: '2C',
    },
    {
        nome: 'Miguel',
        nota: 3,
        turma: '2C',
    },
];

//função para percorrer um array e de alunos e um numero que ira representar a media final
function alunosAprovados(arr, media){
    //popular um novo array com os alunos que tiverem a nota final maior ou igual a media
    let aprovados = [];

    //para percorrer o array
    for (let i = 0; i < arr.length; i++) {

        //utilizando o object destructi
        const {nota, nome} = arr[i];

        //if(arr[i].nota >= media){
            //aprovados.push(arr[i].nome);
        //}
        //por utilizar o object destructi este metodo não podera ser mais usado

        if(nota >= media){
            aprovados.push(nome);
        }
    }
    return aprovados;
}

console.log(alunosAprovados(aluno, 5))