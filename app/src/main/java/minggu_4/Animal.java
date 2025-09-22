package minggu_4;

public abstract class Animal {
    String name;
    int age;
    String food;
    Gender gender;
    Alive alive;
    boolean isAlive;

    public String printSound() {
        return "";
    }

    public abstract String move();
    public abstract String move(int jarak);

    public Animal(String name, int age, String food, Gender gender, Alive alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }
    
    public boolean isAlive() {
        if (this.alive == Alive.ALIVE) {
            return true;
        } else {
            return false;
        }
    }

    public abstract String printData();
}





    


