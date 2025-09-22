package minggu_4;

public class Horse extends Animal {
    public Horse(String name, int age, String food, Gender gender, Alive alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Hee Haw";
    }

    @Override
    public String move() {
        return "Horse is running";
    }

    @Override
    public String move(int jarak) {
        return "The horse name " + this.name + " runs for " + jarak + " meters";
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
