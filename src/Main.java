import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Player Abby = new Player("Abby");
        Player Adam = new Player("Adam");
        Player AJ = new Player("AJ");
        Player Alex = new Player("Alex");
        Player AndrewC = new Player("AndrewC");
        Player AndrewM = new Player("AndrewM");
        Player Ashten = new Player("Ashten");
        Player Bam = new Player("Bam");
        Player Billy = new Player("Billy");
        Player Blake = new Player("Blake");
        Player Brad = new Player("Brad");
        Player Brandon = new Player("Brandon");
        Player Britney = new Player("Britney");
        Player Carly = new Player("Carly");
        Player Cary = new Player("Cary");
        Player Chester = new Player("Chester");
        Player Christian = new Player("Christian");
        Player Cody = new Player("Cody");
        Player Cole = new Player("Cole");
        Player Colin = new Player("Colin");
        Player Colton = new Player("Colton");
        Player Conor = new Player("Conor");
        Player Cooper = new Player("Cooper");
        Player Danny = new Player("Danny");
        Player Doug = new Player("Doug");
        Player Emma = new Player("Emma");
        Player Eric = new Player("Eric");
        Player Evan = new Player("Evan");
        Player Gabby = new Player("Gabby");
        Player Gabe = new Player("Gabe");
        Player Grant = new Player("Grant");
        Player GrantJ = new Player("GrantJ");
        Player Hakeem = new Player("Hakeem");
        Player Hayley = new Player("Hayley");
        Player Hunter = new Player("Hunter");
        Player Ian = new Player("Ian");
        Player JacobF = new Player("JacobF");
        Player JacobC = new Player("JacobC");
        Player James = new Player("James");
        Player Jeremiah = new Player("Jeremiah");
        Player Joel = new Player("Joel");
        Player John = new Player("John");
        Player Justin = new Player("Justin");
        Player Kaitlyn = new Player("Kaitlyn");
        Player Kolby = new Player("Kolby");
        Player Mason = new Player("Mason");
        Player Megan = new Player("Megan");
        Player NathanM = new Player("NathanM");
        Player NathanW = new Player("NathanW");
        Player Nick = new Player("Nick");
        Player Noah = new Player("Noah");
        Player Rob = new Player("Rob");
        Player Sam = new Player("Sam");
        Player Scott = new Player("Scott");
        Player Sherene = new Player("Sherene");
        Player Steve = new Player("Steve");
        Player Steven = new Player("Steven");
        Player Tabitha = new Player("Tabitha");
        Player Turner = new Player("Turner");
        Player Tyler = new Player("Tyler");
        Player Vince = new Player("Vince");
        Player VincentT = new Player("VincentT");
        Player Wesley = new Player("Wesley");
        Player Zach = new Player("Zach");


        ArrayList<Player> players = new ArrayList<Player>();
        players.add(Abby);
        players.add(Adam);
        players.add(AJ);
        players.add(Alex);
        players.add(AndrewC);
        players.add(AndrewM);
        players.add(Ashten);
        players.add(Bam);
        players.add(Billy);
        players.add(Blake);
        players.add(Brad);
        players.add(Brandon);
        players.add(Britney);
        players.add(Carly);
        players.add(Cary);
        players.add(Chester);
        players.add(Christian);
        players.add(Cody);
        players.add(Cole);
        players.add(Colin);
<<<<<<< HEAD
        players.add(Colton);
=======
>>>>>>> 6b29f9ebafba50f0be91f8511cb8e71c7c5e398d
        players.add(Conor);
        players.add(Cooper);
        players.add(Danny);
        players.add(Doug);
        players.add(Emma);
        players.add(Eric);
        players.add(Evan);
        players.add(Gabby);
        players.add(Gabe);
        players.add(Grant);
        players.add(GrantJ);
        players.add(Hakeem);
        players.add(Hayley);
        players.add(Hunter);
        players.add(Ian);
        players.add(JacobC);
        players.add(JacobF);
        players.add(James);
        players.add(Jeremiah);
        players.add(Joel);
        players.add(Justin);
        players.add(Kaitlyn);
        players.add(Kolby);
        players.add(Mason);
        players.add(Megan);
        players.add(NathanM);
        players.add(NathanW);
        players.add(Nick);
        players.add(Noah);
        players.add(Rob);
        players.add(Sam);
        players.add(Scott);
        players.add(Sherene);
        players.add(Steve);
        players.add(Steven);
        players.add(Tabitha);
        players.add(Turner);
        players.add(Tyler);
        players.add(Vince);
        players.add(VincentT);
        players.add(Wesley);
        players.add(Zach);

        //SMA1
        match(Brad, Cary);
        match(JacobF, Gabby);
        match(Danny, Sherene);
        match(Scott, NathanM);
        match(Carly, AndrewC);
        match(Sherene, Gabby);
        match(Noah, Brad);
        match(JacobF, Danny);
        match(Blake, Scott);
        match(Jeremiah, Carly);
        match(Brad, AndrewC);
        match(NathanM, Danny);
        match(Sherene, Scott);
        match(Carly, Cary);
        match(Brad, NathanM);
        match(Carly, Sherene);
        match(Noah, JacobF);
        match(Blake, Jeremiah);
        match(Noah, Blake);

<<<<<<< HEAD
        finishTournament(players, true);
=======
        finishTournament(players);
>>>>>>> 6b29f9ebafba50f0be91f8511cb8e71c7c5e398d

        //SMA3
        teamMatch(Zach, Joel, Mason, Chester);
        teamMatch(Brad, Ian, Conor, Britney);
        teamMatch(NathanM, Carly, Vince, Cody);
        teamMatch(Steven, Kaitlyn, NathanW, Evan);
        teamMatch(Turner, Megan, Tabitha, Emma);
        teamMatch(Conor, Britney, Vince, Cody);
        teamMatch(Noah, Sherene, Zach, Joel);
        teamMatch(Brad, Ian, NathanM, Carly);
        teamMatch(JacobF, Cary, Steven, Kaitlyn);
        teamMatch(Jeremiah, Scott, Turner, Megan);
        teamMatch(Zach, Joel, Tabitha, Emma);
        teamMatch(NathanM, Carly, NathanW, Evan);
        teamMatch(Steven, Kaitlyn, Conor, Britney);
        teamMatch(Turner, Megan, Mason, Chester);
        teamMatch(Zach, Joel, NathanM, Carly);
        teamMatch(Turner, Megan, Steven, Kaitlyn);
        teamMatch(Brad, Ian, Noah, Sherene);
        teamMatch(Jeremiah, Scott, JacobF, Cary);
        teamMatch(Noah, Sherene, Turner, Megan);
        teamMatch(JacobF, Cary, Zach, Joel);
        teamMatch(JacobF, Cary, Noah, Sherene);
        teamMatch(Brad, Ian, Jeremiah, Scott);
        teamMatch(Jeremiah, Scott, JacobF, Cary);
        teamMatch(Jeremiah, Scott, Brad, Ian);
        teamMatch(Jeremiah, Scott, Brad, Ian);

<<<<<<< HEAD
        finishTournament(players, false);
=======
        finishTournament(players);
>>>>>>> 6b29f9ebafba50f0be91f8511cb8e71c7c5e398d

        //SMA4 Doubles
        teamMatch(Cooper, Gabby, Billy, Mason);
        teamMatch(Adam, Tyler, Tabitha, Emma);
        teamMatch(Christian, Colin, John, Wesley);
        teamMatch(Noah, Sherene, JacobF, Hunter);
        teamMatch(Brandon, Nick, Zach, Megan);
        teamMatch(Doug, James, Gabe, Cary);
        teamMatch(Brad, Ian, NathanM, Carly);
        teamMatch(Jeremiah, Joel, Danny, AndrewC);
        teamMatch(Blake, Turner, Cooper, Gabby);
        teamMatch(Sam, Scott, Adam, Tyler);
        teamMatch(JacobC, VincentT, Christian, Colin);
        teamMatch(JacobF, Hunter, John, Wesley);
        teamMatch(Gabe, Cary, Tabitha, Emma);
        teamMatch(Danny, AndrewC, Billy, Mason);
        teamMatch(NathanM, Carly, Adam, Tyler);
        teamMatch(JacobF, Hunter, Cooper, Gabby);
        teamMatch(Zach, Megan, Gabe, Cary);
        teamMatch(Christian, Colin, Danny, AndrewC);
        teamMatch(Doug, James, Brandon, Nick);
        teamMatch(Noah, Sherene, Blake,Turner);
        teamMatch(Sam, Scott, Brad, Ian);
        teamMatch(JacobC, VincentT, Jeremiah, Joel);
        teamMatch(Brandon, Nick, Christian, Colin);
        teamMatch(NathanM, Carly, Blake, Turner);
        teamMatch(JacobF, Hunter, Brad, Ian);
        teamMatch(Jeremiah, Joel, Zach, Megan);
        teamMatch(NathanM, Carly, Brandon, Nick);
        teamMatch(JacobF, Hunter, Jeremiah, Joel);
        teamMatch(Noah, Sherene, Doug, James);
        teamMatch(Sam, Scott, JacobC, VincentT);
        teamMatch(JacobF, Hunter, Doug, James);
        teamMatch(JacobC, VincentT, NathanW, Carly);
        teamMatch(JacobF, Hunter, JacobC, VincentT);
        teamMatch(Noah, Sherene, Sam, Scott);
        teamMatch(Noah, Sherene, JacobF, Hunter);

<<<<<<< HEAD
        finishTournament(players, false);
=======
        finishTournament(players);
>>>>>>> 6b29f9ebafba50f0be91f8511cb8e71c7c5e398d

        //SMA4 Singles
        match(Colin, Scott);
        match(NathanM, Megan);
        match(Carly, Billy);
        match(Hunter, Danny);
        match(Nick, Hayley);
        match(Zach, Gabby);
        match(Wesley, John);
        match(Brad, Tyler);
        match(Joel, Emma);
        match(Sherene, Cary);
        match(JacobC, Mason);
        match(Brandon, Turner);
        match(JacobF, Colin);
        match(NathanM, Carly);
        match(James, Hunter);
        match(Nick, Zach);
        match(Blake, Wesley);
        match(Brad, Joel);
        match(Doug, Sherene);
        match(JacobC, Brandon);
        match(JacobF, NathanM);
        match(Nick, James);
        match(Blake, Brad);
        match(Doug, JacobC);
        match(JacobF, Nick);
        match(Blake, Doug);
        match(JacobF, Blake);

<<<<<<< HEAD
        finishTournament(players, true);

=======
>>>>>>> 6b29f9ebafba50f0be91f8511cb8e71c7c5e398d
        //SMA5
        teamMatch(Jeremiah, Cary, NathanM, Carly);
        teamMatch(JacobF, Emma, NathanW, Cole);
        teamMatch(AJ, Turner, Mason, Tyler);
        teamMatch(Blake, Hakeem, Rob, Colin);
        teamMatch(Noah, Joel, Adam, Bam);
        teamMatch(VincentT, Ian, Zach, Billy);
        teamMatch(NathanW, Cole, Mason, Tyler);
        teamMatch(Zach, Billy, Adam,Bam);
        teamMatch(Jeremiah, Cary, Doug, James);
        teamMatch(AJ, Turner, JacobF, Emma);
        teamMatch(Brad, JacobC, Blake, Hakeem);
        teamMatch(Noah, Joel, VincentT, Ian);
        teamMatch(Doug, James, Zach, Billy);
        teamMatch(JacobF, Emma, Rob, Colin);
        teamMatch(Blake, Hakeem, NathanW, Cole);
        teamMatch(VincentT, Ian, NathanM, Carly);
        teamMatch(JacobF, Emma, Doug, James);
        teamMatch(Blake, Hakeem, VincentT, Ian);
        teamMatch(AJ, Turner, Jeremiah, Cary);
        teamMatch(Brad, JacobC, Noah, Joel);
        teamMatch(Blake, Hakeem, Jeremiah, Cary);
        teamMatch(Noah, Joel, JacobF, Emma);
        teamMatch(Noah, Joel, Blake, Hakeem);
        teamMatch(AJ, Turner, Brad, JacobC);
        teamMatch(Brad, JacobC, Noah, Joel);
        teamMatch(Brad, JacobC, AJ, Turner);
        teamMatch(AJ, Turner, Brad, JacobC);

<<<<<<< HEAD
        finishTournament(players, false);

        //SMA6
        teamMatch(Adam,Bam, Cary,Ashten);
        teamMatch(Mason, Tyler, Tabitha, Justin);
        teamMatch(AndrewC, Grant, Steven, Joel);
        teamMatch(Kolby, NathanM, Christian, Abby);
        teamMatch(Turner, NathanW, Zach, Megan);
        teamMatch(Scott, Sherene, Rob, Colin);
        teamMatch(Billy, Nick, Blake, Blake);
        teamMatch(Doug, GrantJ, Carly, Danny);
        teamMatch(JacobC, AndrewM, Adam, Bam);
        teamMatch(Brad, VincentT, Mason, Tyler);
        teamMatch(AndrewC, Grant, JacobF, Emma);
        teamMatch(Jeremiah, Ian, Kolby, NathanM);
        teamMatch(Zach, Megan, Christian, Abby);
        teamMatch(Rob, Colin, Steve, Joel);
        teamMatch(Blake, Blake, Tabitha, Justin);
        teamMatch(Carly, Danny, Cary, Ashten);
        teamMatch(Adam, Bam, Zach, Megan);
        teamMatch(Rob, Colin, Mason, Tyler);
        teamMatch(JacobF, Emma, Blake, Blake);
        teamMatch(Carly, Danny, Kolby, NathanM);
        teamMatch(JacobC, AndrewM, Turner, NathanW);
        teamMatch(Brad, VincentT, Scott, Sherene);
        teamMatch(Billy, Nick, AndrewC, Grant);
        teamMatch(Doug, GrantJ, Jeremiah, Ian);
        teamMatch(Turner, NathanW, JacobF, Emma);
        teamMatch(Carly,Danny, Scott, Sherene);
        teamMatch(AndrewC, Grant, Adam, Bam);
        teamMatch(Jeremiah, Ian, Rob, Colin);
        teamMatch(Carly, Danny, Turner, NathanW);
        teamMatch(Jeremiah, Ian, AndrewC, Grant);
        teamMatch(JacobC, AndrewM, Brad, VincentT);
        teamMatch(Doug, GrantJ, Billy, Nick);
        teamMatch(Jeremiah, Ian, Brad, VincentT);
        teamMatch(Billy, Nick, Carly, Danny);
        teamMatch(Jeremiah, Ian, Billy, Nick);
        teamMatch(JacobC, AndrewM, Doug, GrantJ);
        teamMatch(Jeremiah, Ian, Doug, GrantJ);
        teamMatch(JacobC, AndrewM, Jeremiah, Ian);

        finishTournament(players, false);

        match(Tyler, Rob);
        match(Bam, Mason);
        match(Adam, Scott);
        match(Noah, Tyler);
        match(Doug, Megan);
        match(Zach, Colton);
        match(Blake, Colin);
        match(James, Bam);
        match(Bam, Sherene);
        match(JacobF, Billy);
        match(Nick, Adam);
        match(Scott, Bam);
        match(Mason, Colton);
        match(Colin, Rob);
        match(Tyler, Scott);
        match(Megan, Sherene);
        match(Billy, Mason);
        match(Colin, Adam);
        match(Noah, James);
        match(Doug, Bam);
        match(JacobF, Zach);
        match(Nick, Blake);
        match(James, Billy);
        match(Colin, Bam);
        match(Zach, Tyler);
        match(Blake, Megan);
        match(Colin, James);
        match(Blake, Zach);
        match(Noah, Doug);
        match(Nick, JacobF);
        match(Blake, Doug);
        match(JacobF, Colin);

        finishTournament(players, true);


        System.out.print("Name,InitialRank,SMA1,SMA3,SMA4D,SMA4S,SMA5,SMA6,SMAIW,CurrentRank,TotalGames,TotalWins,TotalLosses,SinglesGames,SinglesWins\n");
        for(Player p : players) {
            p.printLegacyAssFactor();
        }
=======
        finishTournament(players);

        //SMA6
        teamMatch(Adam,Bam, Cary,Ashten);
        teamMatch(Mason, Tyler, Tabitha, Justin);
        teamMatch(AndrewC, Grant, Steven, Joel);
        teamMatch(Kolby, NathanM, Christian, Abby);
        teamMatch(Turner, NathanW, Zach, Megan);
        teamMatch(Scott, Sherene, Rob, Colin);
        teamMatch(Billy, Nick, Blake, Blake);
        teamMatch(Doug, GrantJ, Carly, Danny);
        teamMatch(JacobC, AndrewM, Adam, Bam);
        teamMatch(Brad, VincentT, Mason, Tyler);
        teamMatch(AndrewC, Grant, JacobF, Emma);
        teamMatch(Jeremiah, Ian, Kolby, NathanM);
        teamMatch(Zach, Megan, Christian, Abby);
        teamMatch(Rob, Colin, Steve, Joel);
        teamMatch(Blake, Blake, Tabitha, Justin);
        teamMatch(Carly, Danny, Cary, Ashten);
        teamMatch(Adam, Bam, Zach, Megan);
        teamMatch(Rob, Colin, Mason, Tyler);
        teamMatch(JacobF, Emma, Blake, Blake);
        teamMatch(Carly, Danny, Kolby, NathanM);
        teamMatch(JacobC, AndrewM, Turner, NathanW);
        teamMatch(Brad, VincentT, Scott, Sherene);
        teamMatch(Billy, Nick, AndrewC, Grant);
        teamMatch(Doug, GrantJ, Jeremiah, Ian);
        teamMatch(Turner, NathanW, JacobF, Emma);
        teamMatch(Carly,Danny, Scott, Sherene);
        teamMatch(AndrewC, Grant, Adam, Bam);
        teamMatch(Jeremiah, Ian, Rob, Colin);
        teamMatch(Carly, Danny, Turner, NathanW);
        teamMatch(Jeremiah, Ian, AndrewC, Grant);
        teamMatch(JacobC, AndrewM, Brad, VincentT);
        teamMatch(Doug, GrantJ, Billy, Nick);
        teamMatch(Jeremiah, Ian, Brad, VincentT);
        teamMatch(Billy, Nick, Carly, Danny);
        teamMatch(Jeremiah, Ian, Billy, Nick);
        teamMatch(JacobC, AndrewM, Doug, GrantJ);
        teamMatch(Jeremiah, Ian, Doug, GrantJ);
        teamMatch(JacobC, AndrewM, Jeremiah, Ian);

        finishTournament(players);
        legacyAssFactorSummary(players);

/*        for(Player p : players) {
            p.printGamesPlayed();
        }*/
>>>>>>> 6b29f9ebafba50f0be91f8511cb8e71c7c5e398d

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void match(Player winner, Player loser) {
        winner.gameWon(true);
        loser.gameLost(true);

        loser.keepOpponentRating(winner.getPublishedAssFactor());
        winner.keepOpponentRating(loser.getPublishedAssFactor());
    }

    private static void finishTournament(ArrayList<Player> players, boolean isSingles) {

        for (Player p : players) {
            if(p.getGamesWon() > 0 || p.getGamesLost() > 0) {
                if (p.isProvisional()) {
                    p.calculateRating(isSingles);
                } else {
                    p.calculateRating(isSingles);
                }

                p.attendTournament();
            }else {
                if (p.getPublishedAssFactor() > 900) {
                    p.decayAssFactor();
                }
                p.tournamentAbsence();
            }
            p.resetTournament();
        }

<<<<<<< HEAD
    }

    private static void legacyAssFactorSummary(ArrayList<Player> players) {
        for (Player p : players) {
            p.printLegacyAssFactor();
        }
    }

    private static void teamMatch(Player w1, Player w2, Player l1, Player l2) {
        w1.gameWon(false);
        w2.gameWon(false);
        l1.gameLost(false);
        l2.gameLost(false);

        l1.keepOpponentRating(w1.getPublishedAssFactor());
        l1.keepOpponentRating(w2.getPublishedAssFactor());
        l2.keepOpponentRating(w1.getPublishedAssFactor());
        l2.keepOpponentRating(w2.getPublishedAssFactor());


        w1.keepOpponentRating(l1.getPublishedAssFactor());
        w1.keepOpponentRating(l2.getPublishedAssFactor());
        w2.keepOpponentRating(l1.getPublishedAssFactor());
        w2.keepOpponentRating(l2.getPublishedAssFactor());
=======
        loser.keepOpponentRating(winner.getPublishedAssFactor());
        winner.keepOpponentRating(loser.getPublishedAssFactor());



/*        if(loser.isProvisional()){
            loser.calculateInitialRating();
        } else {
            loser.calculateStandardRating();
        }*/
    }

    private static void finishTournament(ArrayList<Player> players) {
        for (Player p : players) {
            if(p.getGamesWon() > 0 || p.getGamesLost() > 0) {
                if (p.isProvisional()) {
                    p.calculateInitialRating();
                } else {
                    p.calculateInitialRating();
                }
            }

            p.resetTournament();
        }
    }

    private static void legacyAssFactorSummary(ArrayList<Player> players) {
        System.out.print("Name,SMA1,SMA3,SMA4D,SMA4S,SMA5,SMA6,TotalGames,TotalWins,TotalLosses\n");
        for (Player p : players) {
            p.printLegacyAssFactor();
        }
    }

    private static void teamMatch(Player w1, Player w2, Player l1, Player l2) {
        w1.gameWon();
        w2.gameWon();
        l1.gameLost();
        l2.gameLost();

        double winnerAvgAssFactor = (w1.getPublishedAssFactor() + w2.getPublishedAssFactor()) / 2;
        double loserAvgAssFactor = (l1.getPublishedAssFactor() + l2.getPublishedAssFactor()) / 2;

        l1.keepOpponentRating(winnerAvgAssFactor);
        //l1.keepOpponentRating(w2.getPublishedAssFactor());
        l2.keepOpponentRating(winnerAvgAssFactor);
        //l2.keepOpponentRating(w2.getPublishedAssFactor());


        w1.keepOpponentRating(loserAvgAssFactor);
        //w1.keepOpponentRating(l2.getPublishedAssFactor());
        w2.keepOpponentRating(loserAvgAssFactor);
        //w2.keepOpponentRating(l2.getPublishedAssFactor());




/*        if(l1.isProvisional()){
            l1.calculateInitialRating();
        } else {
            l1.calculateStandardRating();
        }

        if(l2.isProvisional()){
            l2.calculateInitialRating();
        } else {
            l2.calculateStandardRating();
        }

        if(w1.isProvisional()){
            w1.calculateInitialRating();
        } else {
            w1.calculateStandardRating();
        }*/
>>>>>>> 6b29f9ebafba50f0be91f8511cb8e71c7c5e398d
    }
}
