package s9;

public class TournamentIncome extends PlayerIncome implements GradeBonus  {
    public int grade;
    public double rate;

    public TournamentIncome(String name, int income, int grade, double rate) {
        super(name, income);
        this.grade = grade;
        this.rate = rate;
    }


    @Override
    public double calculateGradeBonus() {
        return income*rate*GRADE_BONUS_PERCENT;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Income of the player: " +( income +calculateGradeBonus()));
    }

    @Override
    public String toString() {
        return "TournamentIncome: " +
                "\n name = " + name +
                "\n grade = " + grade  +
                "\n rate = " + rate +
                "\n income = " + income

                ;
    }
}
