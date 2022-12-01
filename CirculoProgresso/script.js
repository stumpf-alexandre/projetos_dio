function go() {
    var circle = document.querySelector('#circleProgress');
    var number = document.querySelector('#numberProgress').value;
    if (!number || number < 0) {
        alert("Digite um número válido!")
    } else {
        document.querySelector('.number').innerHTML = number + '%';
        circle.style.strokeDashoffset = 440 - (440 * number) / 100;
    }
}