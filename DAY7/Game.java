package DAY7;

abstract class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    abstract void attack();
}

class Warrior extends Character {
    Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " is attacking with a sword");
    }
}

class Archer extends Character {
    Archer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " is attacking with a bow");
    }
}

class Mage extends Character {
    Mage(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " is attacking with a magic");
    }
}

public class Game {
    public static void main(String[] args) {
        Character C[] = { new Warrior("abc"), new Archer("hehe"), new Mage("wow") };
        for (Character character : C) {
            character.attack();
        }
    }
}
