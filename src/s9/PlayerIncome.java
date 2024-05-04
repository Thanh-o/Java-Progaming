package s9;

public class PlayerIncome extends Player implements Tax {
    public int income;

    public PlayerIncome(String name, int income) {
        super(name);
        this.income = income;
    }

    @Override
    public void displayDetails() {
        System.out.println("Player name: " + name);
    }

    @Override
    public double calculateTax() {
        return income*TAX_PERCENT;
    }

    @Override
    public String toString() {
        return "PlayerIncome: " +
                "\n name = " + name +
                "\n income = " + income

               ;
    }
}
