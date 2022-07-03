//sintaxe do fetch
fetch(url, Options)
    .then(response => response.json())
    .then(json => console.log(json))
//um fetch retorna uma promise

//utilizando para operações no banco(POST, GET, PUT, DELETE, etc)
//recebendo dados de um banco de dados
fetch('https://endereco-api.com', {
    method: 'GET',
    cache: 'no-cache',
}).then(response => response.json()).then(json => console.log(json))
//retorna uma promise

//ou

//mandando dados para um banco de dados
fetch('https://endereco-api.com', {
    method: 'POST',
    cache: 'no-cache',
    body: JSON.stringify(data)
}).then(response => response.json()).then(json => console.log(json))
//retorna uma promise