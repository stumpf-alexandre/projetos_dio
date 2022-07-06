function changeMode(){
    changeClasses();
    changeText();
}

//mudando as classes das tag para dark-mode
function changeClasses(){
    btn.classList.toggle(darkModeClass);
    h1.classList.toggle(darkModeClass);
    body.classList.toggle(darkModeClass);
    footer.classList.toggle(darkModeClass);
}

//mudando o texto da h1 e button
function changeText(){
    const lightMode = "Light Mode";
    const darkMode = "Dark Mode";

    if (btn.classList.contains(darkModeClass)){
        btn.innerHTML = lightMode;
        h1.innerHTML = darkMode + " ON";
    }else{
        btn.innerHTML = darkMode;
        h1.innerHTML = lightMode + " ON";
    }
}

const darkModeClass = 'dark-mode';
const btn = document.getElementById('mode-selector');
const h1 = document.getElementById('page-title');
const body = document.getElementsByTagName('body')[0];
const footer = document.getElementsByTagName('footer')[0];

btn.addEventListener('click', changeMode);