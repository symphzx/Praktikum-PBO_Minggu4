package minggu_4;

public class Dog extends Animal {
    public Dog(String name, int age, String food, Gender gender, Alive alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Woof";
    }

    @Override
    public String move() {
        return "Dog is walking";
    }

    @Override
    public String move(int jarak) {
        return "The dog name " + this.name + " walks for " + jarak + " meters";
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
