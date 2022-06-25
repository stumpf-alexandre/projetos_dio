const form = document.getElementById('task-form');
const taskList = document.getElementById('tasks');
var itemId;

form.onsubmit = function (e) {
	e.preventDefault();
	const inputField = document.getElementById('task-input');
	if(document.getElementById('task-input').value.trim() != ""){
		addTask(inputField.value);
	}else{
		alert("Preenchimento de campo obrigatório");
	}
	form.reset();
};

function addTask(description) {
	const taskContainer = document.createElement('div');
	const newTask1 = document.createElement('input');
	const taskLabel = document.createElement('label');
	const newTask2 = document.createElement('input');
	const taskDescriptionNode = document.createTextNode(description);
	itemId = taskList.childElementCount;

	newTask1.setAttribute('type', 'checkbox');
	newTask1.setAttribute('name', description);
	newTask1.setAttribute('id', 'taskCheckbox');

	newTask2.setAttribute('type', 'button');
	newTask2.setAttribute('value', 'X');
	newTask2.setAttribute('onclick', 'removeTask(' + itemId + ')');
	newTask2.setAttribute('id','taskButton');

	taskLabel.setAttribute('for', description);
	taskLabel.setAttribute('id', 'label');
	taskLabel.appendChild(taskDescriptionNode);

	taskContainer.classList.add('task-item');
	taskContainer.appendChild(newTask1);
	taskContainer.appendChild(taskLabel);
	taskContainer.appendChild(newTask2);
	

	taskList.appendChild(taskContainer);
}

function removeTask(itemId){
	for(i = 0; i < taskList.children.length; i++){
		if(taskList.children[i].getAtribute('taskButton') == itemId){
			taskList.children[i].remove();
		}
	}
}