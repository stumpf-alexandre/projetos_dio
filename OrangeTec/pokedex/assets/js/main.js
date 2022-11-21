const pokemonList = document.getElementById('pokemonList');
const loadMoreButton = document.getElementById('loadMoreButton');
const limit = 12;
let offset = 0;
const maxCard = 231;
let offId = 0;

function loadPokemonsItens(offset, limit) {
    pokeApi.getPokemons(offset, limit).then((pokemons = []) => {
        const newHtml = pokemons.map((pokemon) =>
        `
            <li class="pokemon ${pokemon.type}">
                <a class="pokemonLink" alt="card do pokemon ${pokemon.name}" onclick="selectPokemon('${pokemon.number}');">
                    <span class="number">#${pokemon.number}</span>
                    <span class="name">${pokemon.name}</span>
                    <div class="detail">
                        <ol class="types">
                            ${pokemon.types.map((type) => `<li class="type type${type}">${type}</li>`).join('')}
                        </ol>
                        <img src="${pokemon.photo}" alt="Imagem ${pokemon.name}">
                    </div>
                </a>
            </li>
        `).join('');
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

function selectPokemon(id) {
    pokeApi.getPokemons(0, id).then((pokePopups = []) => {
        const newPopup = pokePopups.map((pokePopup) =>
        `
            <div id="${pokePopup.number}" class="popup ${pokePopup.type}">
                <button id="closeBtn" onclick="closePopup();">Fechar</button>
                <div class="card">
                    <img src="${pokePopup.photo}" alt="Imagem do pokemon ${pokePopup.name}">
                    <h2 class="card-title name">${pokePopup.number}. ${pokePopup.name}</h2>
                    <p><small>Altura: </small>${(pokePopup.height / 10).toFixed(2)} m | <small>Peso: </small>${(pokePopup.weight / 10).toFixed(2)} Kg | <small>Tipo: </small>${pokePopup.types.map((type) => type).join(', ')}
                    <p><small>Habilidades: </small>${pokePopup.abilities.map((ability) => ability).join(', ')}
                </div>
            </div>
        `
        ).join('');
        pokemonList.innerHTML += newPopup;
    })
}

function closePopup () {
    const popup = document.querySelector('.popup');
    popup.parentElement.removeChild(popup);
}