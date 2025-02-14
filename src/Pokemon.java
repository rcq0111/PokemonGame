public abstract class Pokemon {
    private int hp;
    private int level;
    private  String name;
    public Flyable flyable; // has-a 상속X 상관관계 표시
    public Swimable swimable;

    public Pokemon(int hp, int level, String name, Flyable flyable, Swimable swimable){
        this.hp= hp;
        this.level = level;
        this.name = name;
        this.flyable =flyable;
        this.swimable =swimable;
    }

    public void performSwimable(){
        swimable.swim();
    }

    public void performFlyable(){
        flyable.fly();
    }

    public void setFlyable(Flyable f){
        this.flyable = f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public abstract void attack(Pokemon target);
}
// is-a 관계 <<abstract>>

