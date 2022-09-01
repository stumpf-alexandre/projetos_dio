import {subscribeToHellfireClub} from './firebase/hellfire-clube.js'

const music = document.getElementById('music');

//inverte o mundo
const btnTheme = document.getElementById('switch-theme-button');
btnTheme.addEventListener('click', () => {

    document.body.classList.toggle('dark-theme');
    document.body.classList.toggle('light-theme');

    const theme = document.body.classList[0];

    const audio = document.getElementById('sourceMusic');
    audio.removeAttribute('src');
    const musica = theme === 'light-theme' ? 'normal-world.mpeg' : 'inverted-world.mpeg';
    audio.setAttribute('src', 'assets/musics/${musica}');
    enableAutoplay();

    const newAttribute = document.querySelector('body');
    newAttribute.removeAttribute('aria-label');
    const ariaLabelTheme = theme === 'light-theme' ? 'ligth' : 'dark';
    newAttribute.setAttribute('aria-label', 'O site está utilizando o tema ${ariaLabelTheme}');
});

function enableAutoplay() {
    music.setAttribute('autoplay', true);
    music.load();
}

const txtName = document.getElementById('txtName');
const txtEmail = document.getElementById('txtEmail');
const txtLevel = document.getElementById('txtLevel');
const txtCharacter = document.getElementById('txtCharacter');

const btnSubscribe = document.getElementById('btnSubscribe');

function clearInput() {
    document.getElementById('txtName').value = '';
    document.getElementById('txtEmail').value = '';
    document.getElementById('txtLevel').value = '';
    document.getElementById('txtCharacter').value = '';
}

btnSubscribe.addEventListener('click', async () => {
    if(txtName.value === '' || txtEmail.value === '' || txtLevel.value == '' || txtCharacter.value === ''){
        alert('Preenchimento de campo obrigatório!!!');
        clearInput();    
    }else{
        //criando um objeto
        const subscription = {
            name:txtName.value,
            email:txtEmail.value,
            level:txtLevel.value,
            character:txtCharacter.value
        }

        //salvando no banco de dados
        await subscribeToHellfireClub(subscription);
        alert('Inscrito com sucesso!!!');
        clearInput();
    }
});