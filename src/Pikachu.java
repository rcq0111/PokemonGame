public class Pikachu extends Pokemon {
    public Pikachu(int hp, int level, String name, Flyable flyable){
        super(hp, level, name, flyable);

    }

    @Override
    public void attack(Pokemon target) {
        System.out.println(this.getName()+"이(가)" + target.getName()
                + "에게 전기 공격을 합니다.");
    }
}
// is-a관계