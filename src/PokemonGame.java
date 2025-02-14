public class PokemonGame {
    public static void main(String[] args) {
        //Pokemon pokemon = new Pokemon(100, 1);
        Pikachu pikachu = new Pikachu(100, 10, "츄르 학살자", new None());
        Charizard charizard = new Charizard(200, 20, "도마뱀", new Wings());
        pikachu.attack(charizard);

        charizard.performFlyable();
        pikachu.performFlyable();
    }
}