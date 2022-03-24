## Inleiding

In de les hebben we het gehad over relaties, overerven en abstracte klassen. Het is in de develop wereld standaard om dit uit te leggen aan de hand van dieren.

In deze opdracht gaan we deze punten toepassen op het onderwerp `Pokemons`

## Java

Je gaat een applicatie maken die meerdere nieuwe `Pokemons` kan aanmaken. Voor degene die bekend zijn met `Pokemon` weten dat deze altijd een type hebben (eigenlijk zijn er meerdere types mogelijk, maar om het niet te moeilijk te maken, maken we gebruik van 1 type per pokemon)

Ondanks dat deze natuurlijk een type hebben zijn het `Pokemons`, en hebben deze ook bepaalde dingen gemeen met elkaar. Daarom gaan we ook gebruik maken van een `Super klasse`

![Pokemon!](./assets/pokemon.JPG)

## Opdracht voorwaarden

In de uitgewerkte opdracht moeten minimaal zitten:

- 1 `super klasse` welke minimaal 2 `private variabeles`, `constructors`, 2 `methodes` en `getters & setters`
- 4 `sub klassen` welke minimaal 4 `private variabeles`, `constructors`, 2 `methodes`, 1 `Override methode` en `getters & setters`
- 1 `main klasse` met 1 `main methode`
- In de `main methode` worden 4 verschillende `Pokemons` geïnstantieerd en gedeclareerd en wordt voor iedere `Pokemon` methodes aangeroepen

`Deze methodes mogen void returnen en een system.out.println uitvoeren`


## Stappenplan

1. Maak een `Main klasse` aan in de `src` map

2. Maak binnen de `Main klasse` een main methode aan (om je applicatie te kunnen draaien)

3. Maak een `Pokemon klasse` aan

4. Laat deze klassen voldoen aan de voorwaarden van de `super klasse` zoals hierboven vermeld is

5. Maak de volgende klassen aan en laat deze voldoen aan de `sub klassen` zoals hierboven vermeld is: 
- `FirePokemon`
- `WaterPokemon`
- `GrassPokemon`
- `ElectricPokemon`

5. Instantieer in de `main methode` 4 verschillende `Pokemons` met de verschillende `attributen`

6. Voer in de `main methode` verschillende `methodes` uit van verschillende `Pokemons`, uit zowel de `subklassen` als van de `super klasse`


## Mogelijke Variabelen (geen verplichte)

- name
- level
- hp
- food
- sound

## Mogelijke Methodes (geen verplichte)

- eats()
- speaks()
- thunderPunch()
- surf()
- leafStorm()
- inferno()
- electroBall()
- pyroBall*()
- solarBeam()
- hydroPump()
- thunder()
- hydroCanon()
- fireLash()
- leechSeed()
- voltTackle()
- rainDance()
- leaveBlade()
- flameThrower()


## Moeilijkere vragen

Zijn er in deze opdracht mogelijkheden voor een `abstracte klasse`? 
Zijn er in deze opdracht mogelijkheden voor `abstracte methodes`?
Is het mogelijk om een `Pokemon` 2 types mee te geven?
