var currentNumberWrapper = document.querySelector("#currentNumber");
var currentNumber = 0;
document.getElementById("currentNumber").style.color = 'red';
document.getElementById("menos").disabled = true;
document.getElementById("menos").style.opacity = 0.5;

function mais(){
    currentNumber++;
    if(currentNumber == 10){
        document.getElementById("mais").disabled = true;
        document.getElementById("mais").style.opacity = 0.5;
        currentNumberWrapper.innerHTML = currentNumber;
    }else{
        document.getElementById("currentNumber").style.color = 'black';
        document.getElementById("mais").disabled = false;
        document.getElementById("mais").style.opacity = 1;
        document.getElementById("menos").disabled = false;
        document.getElementById("menos").style.opacity = 1;
        currentNumberWrapper.innerHTML = currentNumber;
    }
}

function menos(){
    currentNumber--;
    if(currentNumber == 0){
        document.getElementById("currentNumber").style.color = 'red';
        document.getElementById("menos").disabled = true;
        document.getElementById("menos").style.opacity = 0.5;
        currentNumberWrapper.innerHTML = currentNumber;
    }else{
        document.getElementById("currentNumber").style.color = 'black';
        document.getElementById("mais").disabled = false;
        document.getElementById("mais").style.opacity = 1;
        currentNumberWrapper.innerHTML = currentNumber;
    }
}    