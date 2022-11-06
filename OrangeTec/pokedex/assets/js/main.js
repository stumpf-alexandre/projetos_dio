function convertPokemonTypeHtml(pokemonTypes) {
    return pokemonTypes.map((typeSlot) => `<li class="type type${typeSlot.type.name}">${typeSlot.type.name}</li>`)
}

function convertPokemonHtml(pokemon) {
    return `
        <li class="pokemon">
            <span class="number">#${pokemon.order}</span>
            <span class="name">${pokemon.name}</span>
            <div class="detail">
                <ol class="types">
                    ${convertPokemonTypeHtml(pokemon.types).join('')}
                </ol>
                <img src="${pokemon.sprites.other.dream_world.front_default}" alt="Imagem ${pokemon.name}">
            </div>
        </li>
    `
}

const pokemonList = document.getElementById('pokemonList');

pokeApi.getPokemons().then((pokemons = []) => {
    const newHtml = pokemons.map(convertPokemonHtml).join('');
    pokemonList.innerHTML = newHtml;
})