package s9;

public abstract class Player {
    public String name;

    public Player(String name) {
        this.name = name;
    }
    public abstract void displayDetails();
}
