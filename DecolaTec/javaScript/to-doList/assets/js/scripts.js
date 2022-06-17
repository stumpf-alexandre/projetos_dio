'use strict';

let banco = [
    {'tarefa' : 'Estudar JS' , 'status' : ''},
    {'tarefa' : 'programar' , 'status' : 'checked'},
    {'tarefa' : 'teste1' , 'status' : 'checked'}
];

const criarItem = (tarefa, status = '') => {
    const item = document.createElement('label');
    item.classList.add('item');
    item.innerHTML = `
        <input type="checkbox" ${status}>
        <div>${tarefa}</div>
        <input type="button" value="x"> 
    `
    document.getElementById('list').appendChild(item);
}

const limparTarefas = () => {
    const todoList = document.getElementById('list');
    while(todoList.firstChild){
        todoList.removeChild(todoList.lastChild);
    }
}

const atualizarTela = () => {
    limparTarefas();
    banco.forEach(item => criarItem(item.tarefa, item.status));
}

atualizarTela();
atualizarTela();