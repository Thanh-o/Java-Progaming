package s9;

class PlayerTest {
    public static void main(String[] args){
        PlayerIncome income = new PlayerIncome("Hien",333);
        TournamentIncome tour = new TournamentIncome("Ha",666,4,0.2);
        System.out.println(income);
        System.out.println("*******************");
        System.out.println(tour);
    }
}