*****Wil004****
Om mijn kennis te testen en meer uitdaging voor mezelf te creëeren
Heb ik de applicatie iets complexer gemaakt dan hierboven omschreven.
Ik heb het mogelijk gemaakt om 2 spelers tegen elkaar te laten battlen of 1 speler tegen
de computer (gymleader) te laten battelen.
Iedere speler kan max 6 pokemons hebben.

Ook heb ik een systeem toegevoegd waarmee pokemons kunnen levelen op basis van xp.
Op basis van hun level wordt hun kracht, snelheid def etc. bepaald.
Aan de hand van kracht, type en defense wordt de damage berekent in een aparte klasse.

Het pokemongevecht speelt zich af in de terminal clone het project druk op play en probeer het uit!

Omdat ik verder met de leerlijn moest had ik geen tijd de applicatie nog meer uit te breiden.
Mocht ik hier tijd voor hebben dan zullen pokemons in de volgende update kunnen evolueren.
****************************************************

## Inleiding

Je hebt inmiddels geleerd hoe je relaties, overerving en abstracte klassen moet toepassen. In het backend landschap
worden deze concepten vaak uitgelegd aan de hand van dieren of andere levende wezens. Dus in plaats van de standaard
hond of kat te kiezen, passen wij deze concepten toe op het onderwerp Pokèmon!

## Opdrachtbeschrijving

Je gaat een applicatie programmeren die meerdere nieuwe Pokèmon kan aanmaken. Degenen die bekend zijn met Pokèmon weten
dat deze altijd een _type_ hebben (sterker nog: Pokèmon kunnen meerdere types tegelijk zijn, maar om het niet te moeilijk
te maken, maken we gebruik van één type per Pokèmon). Voorbeelden van deze typen zijn: Fire 🔥, Water 🌊, Grass 🌿 en
Electric ⚡.

Naast hun type, hebben Pokèmon natuurlijk bepaalde eigenschappen met elkaar gemeen. Daarom maken we gebruik van een
Super klasse.

![Pokemon.Pokemon!](./assets/pokemon.JPG)

## Randvoorwaarden

De applicatie moet voldoen aan het volgende:

- Een Super klasse waarvan minimaal 2 `private` variabelen, 1 constructor, 2 methodes, 2 getters en 2 setters;
- 4 subklassen die, naast alles dat ze erfen, zelf ook minimaal 4 `private` variabelen, 1 constructor, 2 methodes, 1 `override` methode, 2 getters en 2
  setters bevatten. _Tip_: wil je wat inspiratie bij het bedenken van variabelen en methodes op het gebied van Pokèmon? Bekijk de
  inspiratie-sectie hieronder eens.
- Een `main`-klasse met een `main`-methode;
- In de `main`-methode worden vier verschillende Pokèmon-objecten van verschillende klassen geïnstantieerd- en gedeclareerd. Met behulp van deze objectnamen kunnen de methodes van de verschillende klassen worden uitgevoerd;

Deze methodes mogen `void` teruggeven en een `system.out.println` uitvoeren.

### Inspiratie en tips

Weet je niet wat voor variabelen je jouw klassen kunt meegeven? Denk eens aan:

- `name`
- `level`
- `hp`
- `food`
- `sound`

Pokèmon kunnen ook ontzettend veel verschillende acties uitvoeren. Zo kun je denken aan de volgende methodes:

- `eats()`
- `speaks()`
- `thunderPunch()`
- `surf()`
- `leafStorm()`
- `inferno()`
- `electroBall()`
- `pyroBall*()`
- `solarBeam()`
- `hydroPump()`
- `thunder()`
- `hydroCanon()`
- `fireLash()`
- `leechSeed()`
- `voltTackle()`
- `rainDance()`
- `leaveBlade()`
- `flameThrower()`
