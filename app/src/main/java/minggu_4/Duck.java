package minggu_4;

public class Duck extends Animal {
    public Duck(String name, int age, String food, Gender gender, Alive alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Quack";
    }

    @Override
    public String move() {
        return "Duck is swimming";
    }

    @Override
    public String move(int jarak) {
        return "The duck name " + this.name + " swims for " + jarak + " meters";
    }

    @Override
    public String printData(){
        return "Name: " + this.name + 
                "\n" + "Age: " + this.age  + 
                "\n" + "Food: " + this.food  + 
                "\n" + "Gender: " + this.gender +
                "\n" + "Sound: " + this.printSound() +
                "\n" + "Alive: " + this.isAlive;
    }
}
