
public class Charizard extends Pokemon {
    public Charizard(int hp, int level, String name){
        super(hp, level, name);

    }

    @Override
    public void attack(Pokemon target) {
        System.out.println(this.getName()+"이(가)" + target.getName()
                + "에게 불 공격을 합니다.");
    }
}
