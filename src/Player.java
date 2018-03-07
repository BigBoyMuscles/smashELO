import java.util.ArrayList;

public class Player {

    private String name;
    private double assFactor;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private double bestRank;
    private double skillFloor;
    ArrayList<Double> legacyFactor;

    public Player() {
        name = "noname";
        assFactor = 1000;
        gamesPlayed = 0;
        gamesWon = 0;
        gamesLost = 0;
        bestRank = assFactor;
        legacyFactor = new ArrayList<Double>();

        legacyFactor.add(assFactor);
    }

    public Player(String name) {
        this.name = name;
        this.assFactor = 1000;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.gamesLost = 0;
        bestRank = assFactor;
        legacyFactor = new ArrayList<Double>();
        legacyFactor.add(assFactor);
    }

    public Player(String name, double assFactor) {
        this.name = name;
        this.assFactor = assFactor;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.gamesLost = 0;
        bestRank = assFactor;
        legacyFactor = new ArrayList<Double>();

    }

    public String getName() {
        return name;
    }

    private double calculateNr() {
        double Nr = 50 / Math.sqrt(1 + Math.pow((2200 - this.assFactor), 2) / 100000);

        if(Nr > this.gamesPlayed) {
            Nr = this.gamesPlayed;
        }

        return Nr;
    }

    private double calculateK() {
        double K = 800 / (calculateNr() + this.gamesWon);
        return K;
    }

    private double calculateE(double Ropp) {
        double E = 1 / (10 - (this.assFactor - Ropp) / 400 + 1);
        return E;
    }

    private double  calculateS() {
        return(this.gamesWon - this.gamesLost);
    }

    public void updateRating(double Ropp) {

        double newRank;
            if(gamesPlayed >= 8) {
                newRank = this.assFactor + calculateK() * (calculateS() - calculateE(Ropp));

                if (newRank > bestRank) {
                    bestRank = newRank;
                    if (bestRank - 200 > 100 && bestRank - 200 < 1400) {
                        skillFloor = 100;
                    }
                }


                this.assFactor = newRank;

                if (assFactor != 1000) {
                    legacyFactor.add(this.assFactor);
                }
            }
    }

    public void gameWon() {
        this.gamesPlayed += 1;
        this.gamesWon += 1;
    }

    public void gameLost() {
        this.gamesPlayed += 1;
        this.gamesLost += 1;
    }

    public double getAssFactor() {
        return this.assFactor;
    }

    public void resetTournament(double Ravg) {

        if(gamesPlayed < 8) {

            double newRank = (gamesPlayed * assFactor + (gamesWon + gamesLost) * Ravg + (gamesWon - gamesLost) * 400) / gamesPlayed + (gamesWon - gamesLost);
            legacyFactor.add(newRank);
            assFactor = newRank;
            //System.out.println("Uncalibrated ratings adjustment: " + newRank);
        }

        this.gamesWon = 0;
        this.gamesLost = 0;
    }

    public void printAssFactor() {
        System.out.println(name + ": " + assFactor);
    }

    public void printGames() {
        System.out.println(name + ": " + gamesPlayed);
    }

    public void printLegacyFactor() {

        System.out.print(name + ",");

        for (double rank : this.legacyFactor) {
            System.out.print(rank + ",");
        }

        System.out.print("\n");
    }




}
