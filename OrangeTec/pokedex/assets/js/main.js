const pokemonList = document.getElementById('pokemonList');
const loadMoreButton = document.getElementById('loadMoreButton');
const limit = 12;
let offset = 0;
const maxCard = 231;

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

function selectPokemon(id) {
    console.log(id);
    pokeCache.getDetailPokemon(id).then((pokePopups = []) => {
        const newPopup = pokePopups.map((pokePopup) =>
        `
            <div id="pokemonPopup" class="popup">
                <button id="closeBtn" onclick="closePopup();">Fechar</button>
                <div class="card">
                    <img src="${pokePopup.photo}" alt="Imagem ${pokePopup.name}">
                    <h2 class="card-title">${pokePopup.number}. ${pokePopup.name}</h2>
                    <p><small>Altura: </small>${(pokePopup.height * 2.54).toFixed(2)} cm | <small>Peso: </small>${(pokePopup.weight / 2.205).toFixed(2)} Kg | <small>Tipo: </small>${pokePopup.types.map((type) => type).join(', ')}
                    <p><small>HP: </small>${pokePopup.statHp} | <small>Habilidades: </small>${pokePopup.abilities.map((ability) => ability).join(', ')}
                </div>
            </div>
        `).join('');
        pokemonList.innerHTML += newPopup;
    })
}

const closePopup = () => {
    const popup = document.getElementById('pokemonPopup');
    popup.parentElement.removeChild(popup.firstChild);
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