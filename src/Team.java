public class Team {

    String name;
    Player member1;
    Player member2;
    double assFactor;

    public Team() {
        member1 = new Player();
        member2 = new Player();
        name = member1.getName() + " " + member2.getName();
        assFactor = (member1.getAssFactor() + member2.getAssFactor()) / 2;
    }

    public Team(Player p1, Player p2) {
        member1 = p1;
        member2 = p2;
        name = p1.getName() + " " + p2.getName();
        assFactor = (member1.getAssFactor() + member2.getAssFactor()) / 2;
    }

    public void gameWon() {
        member1.gameWon();
        member2.gameWon();
    }

    public void gameLost() {
        member1.gameLost();
        member2.gameLost();
    }

    public void updateRating(double Ropp) {
   /*     member1.updateRating(Ropp);
        member2.updateRating(Ropp);*/
    }

    public double getAssFactor() {
        return assFactor;
    }

    public void resetTournament(double Ravg) {
       /* member1.resetTournament(Ravg);
        member2.resetTournament(Ravg);*/
    }

    public void print() {
        System.out.println(member1.getName() + ": " + member1.getAssFactor());
        System.out.println(member2.getName() + ": " + member2.getAssFactor());
    }

}
