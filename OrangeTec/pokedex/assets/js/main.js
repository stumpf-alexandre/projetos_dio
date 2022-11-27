const pokemonList = document.getElementById('pokemonList');
const loadMoreButton = document.getElementById('loadMoreButton');
const sectionPokemon = document.querySelector('.content');
const openDetails = document.querySelector('.content-detail')
const limit = 12;
let offset = 0;
const maxCard = 231;

function convertPokemonHtml(pokemons) {
    return `
        <li class="pokemon ${pokemons.type}">
            <a class="pokemonLink" alt="card do pokemon ${pokemons.name}" onclick="selectPokemon('${pokemons.number}');">
                <span class="number">#${pokemons.number}</span>
                <span class="name">${pokemons.name}</span>
                <div class="detail">
                    <ol class="types">
                        ${pokemons.types.map((type) => `<li class="type type${type}">${type}</li>`).join('')}
                    </ol>
                    <img src="${pokemons.photo}" alt="Imagem ${pokemons.name}">
                </div>
            </a>
        </li>
    `
}

function loadPokemonsItens(offset, limit) {
    pokeApi.getPokemons(offset, limit).then((pokemons = []) => {
        const newHtml = pokemons.map(convertPokemonHtml).join('');
        pokemonList.innerHTML += newHtml;
    })
}

loadMoreButton.addEventListener('click', () => {
    offset += limit;
    const qtdCard = offset + limit;
    if (qtdCard >= maxCard) {
        const newLimit = maxCard - offset;
        loadPokemonsItens(offset, newLimit);
        loadMoreButton.parentElement.removeChild(loadMoreButton);
    } else {
        loadPokemonsItens(offset, limit);
    }
})

loadPokemonsItens(offset, limit);

function convertPokeDetailsHtml(pokeDetail) {
    openDetails.getElementsByClassName.display = 'block';
    return `
        <div class="popup ${pokeDetail.type}">
            <button id="closeBtn" onclick="closePopup();">Fechar</button>
            <div class="card">
                <img src="${pokeDetail.gif}" alt="Imagem animada do pokemon ${pokeDetail.name}">
                <h2 class="card-title name">${pokeDetail.number}. ${pokeDetail.name}</h2>
                <p><small>Altura: </small>${pokeDetail.height} m | <small>Peso: </small>${pokeDetail.weight} Kg | <small>Tipo: </small>${pokeDetail.types.map((type) => type).join(', ')}
                <p><small>Habilidades: </small>${pokeDetail.abilities.map((ability) => ability).join(', ')}
                ${pokeDetail.stats.map((stat) => `
                    <div class="card-details">
                        <span class="detail-name-stat">${stat['stat']['name']}</span>
                        <div class="card-container">         
                            <div class="progress-bar progress-bar-${pokeDetail.type}" data-anime="left" role="progressbar" style="width: ${stat['base_stat']}%;" aria-valuenow="${stat['base_stat']}" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </div>
                `).join(' ')}
            
            </div>
        </div>
    `
}

function selectPokemon(numId) {
    pokeApi.getDetailsPokemon(numId).then((pokeDetail = []) => {
        const newPopup = convertPokeDetailsHtml(pokeDetail);
        pokemonList.innerHTML += newPopup;
        sectionPokemon.classList.add("open-modal")
    })
}

function closePopup () {
    const popup = document.querySelector('.popup');
    popup.parentElement.removeChild(popup);
}