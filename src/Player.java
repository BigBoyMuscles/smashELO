import java.util.ArrayList;

//Tool for calculating player ELO for SMA tournaments
//change to test push
public class Player {

    private String name;
    private double assFactor;
    private int totalGamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private double bestRank;
    private double publishedRank;
    ArrayList<Double> opponentAssFactor;
    ArrayList<Double> legacyAssFactor;

    public Player() {
        name = "noname";
        assFactor = 800;
        totalGamesPlayed = 0;
        gamesWon = 0;
        gamesLost = 0;
        bestRank = assFactor;
        opponentAssFactor = new ArrayList<Double>();
        legacyAssFactor = new ArrayList<Double>();
        publishedRank = 800;
        legacyAssFactor.add(publishedRank);
    }

    public Player(String name) {
        super();
        this.name = name;
        opponentAssFactor = new ArrayList<Double>();
        legacyAssFactor = new ArrayList<Double>();
        assFactor = 800;
        publishedRank = 800;
        legacyAssFactor.add(publishedRank);
    }

    public Player(String name, double assFactor, double publishedRank, int gamesWon, int gamesLost, int totalGamesPlayed) {
        super();
        this.name = name;
        this.assFactor = assFactor;
        this.publishedRank = publishedRank;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.totalGamesPlayed = totalGamesPlayed;
        this.opponentAssFactor = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void gameWon() {
        this.totalGamesPlayed += 1;
        this.gamesWon += 1;
    }

    public void gameLost() {
        this.totalGamesPlayed += 1;
        this.gamesLost += 1;
    }

    public double getAssFactor() {
        return this.assFactor;
    }

    public void keepOpponentRating(double oppAssFactor) {
        this.opponentAssFactor.add(oppAssFactor);
    }

    public void calculateInitialRating() {
        // To be called at the end of a tournament if a player has fewer than 25 games played;

      //  if(totalGamesPlayed <= 25) {
            // Should be called once for each provisional player, at the end of a tournament;

            double averageOpponentRank = 0;

            for(double opp : opponentAssFactor) {
                averageOpponentRank += opp;
            }
            if(opponentAssFactor.size() != 0) {
                averageOpponentRank = averageOpponentRank / opponentAssFactor.size();
            }

            int gamesThisTournament = gamesWon + gamesLost;

            double initialRating = (totalGamesPlayed * publishedRank + gamesThisTournament * averageOpponentRank +
                    (gamesWon - gamesLost) * 400) / (totalGamesPlayed + gamesThisTournament);

            assFactor = initialRating;
        }
   // }

    public void calculateStandardRating() {

        //To be called at the end of a tournament. Gathers the ratings of all opponents played during a tournament, and
        //Calculates an updated rating. Currently published ratings are updated every tournament.

        int score = gamesWon;

        double Nr = 50;

        if(publishedRank < 2200) {
            Nr = 50 / Math.sqrt(1 + Math.pow((2200 - publishedRank),2) / 100000);
        }

        double effectiveGames = totalGamesPlayed;

        if(totalGamesPlayed > Nr) {
            effectiveGames = Nr;
        }

        double winExpectancy =0;
        for(double Ropp : opponentAssFactor) {

            double e = 1 / Math.pow(10, -(publishedRank - Ropp) / 350) + 1;
            winExpectancy += e;

        }

        double k = 800 /(effectiveGames + (gamesWon + gamesLost));

        double bonus = 0;

        if(gamesWon + gamesLost > 3) {
            double b1 = k * (score - winExpectancy);
            double b2 = 10 * Math.sqrt(gamesWon + gamesLost + 1);
            if(b1 < b2) {
                bonus = b2 - b1;
            }
        }

        double rankAdjustment = k * (gamesWon - winExpectancy) + bonus;
        double newRank = publishedRank + rankAdjustment;

        assFactor = newRank;

    }

    public double getPublishedAssFactor() {
        return publishedRank;
    }

    public double getUnplublishedAssFactor() {
        return assFactor;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void resetTournament() {
        if(gamesWon > 0 || gamesLost > 0) {
            publishAssFactor();
        }else {
            legacyAssFactor.add(0.0);
        }
        this.gamesWon = 0;
        this.gamesLost = 0;
        this.opponentAssFactor.clear();
    }

    public void setName(String s) {
        this. name = s;
    }

    public boolean isProvisional() {

        if(totalGamesPlayed < 10) {
            return true;
        }
        return false;
    }

    public void publishAssFactor() {
        publishedRank = assFactor;
        legacyAssFactor.add(publishedRank);
    }

    public void printLegacyAssFactor() {
        System.out.print(name);
        for(double d : legacyAssFactor) {
            System.out.print("," + d);
        }
        System.out.print("\n");
    }

    public void printGamesPlayed() {
        System.out.println(totalGamesPlayed);
    }
}




