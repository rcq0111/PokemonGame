public class PokemonGameMain {
    public static void main(String[] args) {
        //Pokemon pokemon = new Pokemon(100, 1);
        Pikachu pikachu = new Pikachu(100, 10, "츄르 학살자", new NoneFly(), new NoneSwim());
        Charizard charizard = new Charizard(200, 20, "도마뱀", new Wings(), new NoneSwim());
        Gyarados gyarados = new Gyarados(300, 30, "바다 지렁이",new NoneFly(), new Fins());
        pikachu.attack(charizard);

        charizard.performFlyable();
        pikachu.performFlyable();
        pikachu.setFlyable(new JetPack());
        pikachu.performFlyable();

        gyarados.attack(pikachu);
        gyarados.performSwimable();
    }
}