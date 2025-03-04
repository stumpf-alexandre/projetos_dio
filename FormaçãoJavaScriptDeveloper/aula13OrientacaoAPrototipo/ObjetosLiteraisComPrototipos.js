const pessoa = {
    genero: 'Masculino'
}

const alexandre = Object.create(pessoa)

alexandre.nome = 'Alexandre'

alexandre.idade = 45

console.log(alexandre.genero) // Masculino

console.log(alexandre)