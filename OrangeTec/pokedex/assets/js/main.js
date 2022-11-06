function convertPokemonHtml(pokemon) {
    return `
        <li class="pokemon">
            <span class="number">#001</span>
            <span class="name">${pokemon.name}</span>
            <div class="detail">
                <ol class="types">
                    <li class="type typeGrass">Grass</li>
                    <li class="type typePoison">Poison</li>
                </ol>
                <img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/1.svg" alt="Imagem ${pokemon.name}">
            </div>
        </li>
    `
}

const pokemonList = document.getElementById('pokemonList');

pokeApi.getPokemons().then((pokemons = []) => {
    pokemonList.innerHTML += pokemons.map(convertPokemonHtml).join('')
})