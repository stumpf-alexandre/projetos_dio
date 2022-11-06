function convertPokemonHtml(pokemon) {
    const name = pokemon.name;
    const concName = name[0].toUpperCase() + name.substring(1);

    return `
        <li class="pokemon ${pokemon.type}">
            <span class="number">#${pokemon.number}</span>
            <span class="name">${pokemon.name}</span>
            <div class="detail">
                <ol class="types">
                    ${pokemon.types.map((type) => `<li class="type type${type}">${type}</li>`).join('')}
                </ol>
                <img src="${pokemon.photo}" alt="Imagem ${pokemon.name}">
            </div>
        </li>
    `
}

const pokemonList = document.getElementById('pokemonList');

pokeApi.getPokemons().then((pokemons = []) => {
    const newHtml = pokemons.map(convertPokemonHtml).join('');
    pokemonList.innerHTML = newHtml;
})