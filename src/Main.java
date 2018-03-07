import java.io.IOException;

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



        double Ravg = 0;

        Ravg = (Brad.getAssFactor() + Cary.getAssFactor() + JacobF.getAssFactor() + Gabby.getAssFactor() + Danny.getAssFactor() +
                Sherene.getAssFactor() + Scott.getAssFactor() + NathanM.getAssFactor() + Carly.getAssFactor() + AndrewC.getAssFactor() +
                Noah.getAssFactor() + Blake.getAssFactor() + Jeremiah.getAssFactor()) / 13;

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

        Brad.resetTournament(Ravg);
        Cary.resetTournament(Ravg);
        JacobF.resetTournament(Ravg);
        Gabby.resetTournament(Ravg);
        Danny.resetTournament(Ravg);
        Sherene.resetTournament(Ravg);
        Scott.resetTournament(Ravg);
        NathanM.resetTournament(Ravg);
        Carly.resetTournament(Ravg);
        AndrewC.resetTournament(Ravg);
        Noah.resetTournament(Ravg);
        Blake.resetTournament(Ravg);
        Jeremiah.resetTournament(Ravg);

        System.out.println("###### SMASH MY ASS 1 ######");
        System.out.println(Brad.getName() + ": " + Brad.getAssFactor());
        System.out.println(Cary.getName() + ": " + Cary.getAssFactor());
        System.out.println(JacobF.getName() + ": " + JacobF.getAssFactor());
        System.out.println(Gabby.getName() + ": " + Gabby.getAssFactor());
        System.out.println(Danny.getName() + ": " + Danny.getAssFactor());
        System.out.println(Sherene.getName() + ": " + Sherene.getAssFactor());
        System.out.println(Scott.getName() + ": " + Scott.getAssFactor());
        System.out.println(NathanM.getName() + ": " + NathanM.getAssFactor());
        System.out.println(Carly.getName() + ": " + Carly.getAssFactor());
        System.out.println(AndrewC.getName() + ": " + AndrewC.getAssFactor());
        System.out.println(Noah.getName() + ": " + Noah.getAssFactor());
        System.out.println(Blake.getName() + ": " + Blake.getAssFactor());
        System.out.println(Jeremiah.getName() + ": " + Jeremiah.getAssFactor());

        //Smash My Ass 3
        Team zachJoel = new Team(Zach, Joel);
        Team masChest = new Team(Mason, Chester);
        Team bradIan = new Team(Brad, Ian);
        Team conBrit = new Team(Conor, Britney);
        Team natMCar = new Team(NathanM, Carly);
        Team vinceCody = new Team(Vince, Cody);
        Team natWEvan = new Team(NathanW, Evan);
        Team stevenKait = new Team(Steven, Kaitlyn);
        Team turnMeg = new Team(Turner, Megan);
        Team tabiEmma = new Team(Tabitha, Emma);
        Team noahShere = new Team(Noah, Sherene);
        Team jacFCary = new Team(JacobF, Cary);
        Team jeremScott = new Team(Jeremiah, Scott);

        Ravg = (zachJoel.getAssFactor() + masChest.getAssFactor() + bradIan.getAssFactor() + conBrit.getAssFactor() +
            natMCar.getAssFactor() + vinceCody.getAssFactor() + natWEvan.getAssFactor() + stevenKait.getAssFactor() +
            turnMeg.getAssFactor() + tabiEmma.getAssFactor() + noahShere.getAssFactor() + jacFCary.getAssFactor() +
            jeremScott.getAssFactor()) / 13;

        teamMatch(zachJoel, masChest);
        teamMatch(bradIan, conBrit);
        teamMatch(natMCar, vinceCody);
        teamMatch(stevenKait, natWEvan);
        teamMatch(turnMeg, tabiEmma);
        teamMatch(conBrit, vinceCody);
        teamMatch(noahShere, zachJoel);
        teamMatch(bradIan, natMCar);
        teamMatch(jacFCary, stevenKait);
        teamMatch(jeremScott, turnMeg);
        teamMatch(zachJoel, tabiEmma);
        teamMatch(natMCar, natWEvan);
        teamMatch(stevenKait,conBrit);
        teamMatch(turnMeg, masChest);
        teamMatch(zachJoel, natMCar);
        teamMatch(turnMeg, stevenKait);
        teamMatch(bradIan, noahShere);
        teamMatch(jeremScott, jacFCary);
        teamMatch(noahShere, turnMeg);
        teamMatch(jacFCary, zachJoel);
        teamMatch(jacFCary, noahShere);
        teamMatch(bradIan, jeremScott);
        teamMatch(jeremScott, jacFCary);
        teamMatch(jeremScott, bradIan);
        teamMatch(jeremScott, bradIan);

        zachJoel.resetTournament(Ravg);
        masChest.resetTournament(Ravg);
        bradIan.resetTournament(Ravg);
        conBrit.resetTournament(Ravg);
        natMCar.resetTournament(Ravg);
        vinceCody.resetTournament(Ravg);
        stevenKait.resetTournament(Ravg);
        natWEvan.resetTournament(Ravg);
        turnMeg.resetTournament(Ravg);
        tabiEmma.resetTournament(Ravg);
        noahShere.resetTournament(Ravg);
        jeremScott.resetTournament(Ravg);
        jacFCary.resetTournament(Ravg);

        System.out.println("\n");
        System.out.println("###### SMASH MY ASS 3 ######");
        System.out.println(Brad.getName() + ": " + Brad.getAssFactor());
        System.out.println(Cary.getName() + ": " + Cary.getAssFactor());
        System.out.println(JacobF.getName() + ": " + JacobF.getAssFactor());
        System.out.println(Sherene.getName() + ": " + Sherene.getAssFactor());
        System.out.println(Scott.getName() + ": " + Scott.getAssFactor());
        System.out.println(NathanM.getName() + ": " + NathanM.getAssFactor());
        System.out.println(Carly.getName() + ": " + Carly.getAssFactor());
        System.out.println(Noah.getName() + ": " + Noah.getAssFactor());
        System.out.println(Jeremiah.getName() + ": " + Jeremiah.getAssFactor());
        System.out.println(Zach.getName() + ": " + Zach.getAssFactor());
        System.out.println(Joel.getName() + ": " + Joel.getAssFactor());
        System.out.println(Mason.getName() +  ": " + Mason.getAssFactor());
        System.out.println((Chester.getName() + ": " + Chester.getAssFactor()));
        System.out.println(Ian.getName() + ": " + Ian.getAssFactor() );
        System.out.println(Conor.getName() + ": " + Conor.getAssFactor());
        System.out.println((Britney.getName() + ": " + Britney.getAssFactor()));
        System.out.println(Vince.getName() + ": " + Vince.getAssFactor());
        System.out.println((Cody.getName() + ": " + Cody.getAssFactor()));
        System.out.println(Steven.getName() + ": " + Steven.getAssFactor());
        System.out.println(Kaitlyn.getName() + ": " + Kaitlyn.getAssFactor());
        System.out.println(NathanW.getName() + ": " + NathanW.getAssFactor());
        System.out.println(Evan.getName() + ": " + Evan.getAssFactor());
        System.out.println(Turner.getName() + ": " + Turner.getAssFactor());
        System.out.println(Megan.getName() + ": " + Megan.getAssFactor());
        System.out.println(Tabitha.getName() + ": " + Tabitha.getAssFactor());
        System.out.println(Emma.getName() + ": " + Emma.getAssFactor());


        // SMASH MY ASS 4
        Team coopGab = new Team(Cooper, Gabby);
        Team billMas = new Team(Billy, Mason);
        Team adamTy = new Team(Adam, Tyler);
        Team johnWes = new Team(John, Wesley);
        Team chrisCol = new Team(Christian, Colin);
        Team blakeTurn = new Team(Blake, Turner);
        Team jacFHunt = new Team(JacobF, Hunter);
        Team brandNick = new Team(Brandon, Nick);
        Team zachMeg = new Team(Zach, Megan);
        Team dougJames = new Team(Doug, James);
        Team gabeCary = new Team(Gabe, Cary);
        Team samScott = new Team(Sam, Scott);
        Team jacCVin = new Team(JacobC, VincentT);
        Team danAndrew = new Team(Danny, AndrewC);
        Team jeremJoel =  new Team(Jeremiah, Joel);

        Ravg = (coopGab.getAssFactor() + billMas.getAssFactor() + adamTy.getAssFactor() + johnWes.getAssFactor() + chrisCol.getAssFactor() +
                blakeTurn.getAssFactor() + jacFHunt.getAssFactor() + brandNick.getAssFactor() + zachMeg.getAssFactor() + dougJames.getAssFactor() +
                gabeCary.getAssFactor() + samScott.getAssFactor() + jacCVin.getAssFactor() + danAndrew.getAssFactor() + jeremJoel.getAssFactor() +
                noahShere.getAssFactor() + bradIan.getAssFactor() + natMCar.getAssFactor() + tabiEmma.getAssFactor()) / 19;

        teamMatch(coopGab, billMas);
        teamMatch(adamTy, tabiEmma);
        teamMatch(chrisCol, johnWes);
        teamMatch(noahShere, jacFHunt);
        teamMatch(brandNick, zachMeg);
        teamMatch(dougJames, gabeCary);
        teamMatch(bradIan, natMCar);
        teamMatch(jeremJoel, danAndrew);
        teamMatch(blakeTurn, coopGab);
        teamMatch(samScott, adamTy);
        teamMatch(jacCVin, chrisCol);
        teamMatch(jacFHunt, johnWes);
        teamMatch(gabeCary, tabiEmma);
        teamMatch(danAndrew, billMas);
        teamMatch(natMCar, adamTy);
        teamMatch(jacFHunt, coopGab);
        teamMatch(zachMeg, gabeCary);
        teamMatch(chrisCol, danAndrew);
        teamMatch(dougJames, brandNick);
        teamMatch(noahShere, blakeTurn);
        teamMatch(samScott, bradIan);
        teamMatch(jacCVin, jeremJoel);
        teamMatch(brandNick, chrisCol);
        teamMatch(natMCar, blakeTurn);
        teamMatch(jacFHunt, bradIan);
        teamMatch(jeremJoel, zachMeg);
        teamMatch(natMCar, brandNick);
        teamMatch(jacFHunt, jeremJoel);
        teamMatch(noahShere, dougJames);
        teamMatch(samScott, jacCVin);
        teamMatch(jacFHunt, dougJames);
        teamMatch(jacCVin, natMCar);
        teamMatch(jacFHunt, jacCVin);
        teamMatch(noahShere, samScott);
        teamMatch(noahShere, jacFHunt);

        coopGab.resetTournament(Ravg);
        billMas.resetTournament(Ravg);
        adamTy.resetTournament(Ravg);
        johnWes.resetTournament(Ravg);
        chrisCol.resetTournament(Ravg);
        blakeTurn.resetTournament(Ravg);
        jacFHunt.resetTournament(Ravg);
        brandNick.resetTournament(Ravg);
        zachMeg.resetTournament(Ravg);
        dougJames.resetTournament(Ravg);
        gabeCary.resetTournament(Ravg);
        samScott.resetTournament(Ravg);
        jacCVin.resetTournament(Ravg);
        danAndrew.resetTournament(Ravg);
        jeremJoel.resetTournament(Ravg);
        noahShere.resetTournament(Ravg);
        bradIan.resetTournament(Ravg);
        natMCar.resetTournament(Ravg);
        tabiEmma.resetTournament(Ravg);

        System.out.println("\n");
        System.out.println(("###### SMA4 DOUBLES ######"));
        coopGab.print();
        billMas.print();
        adamTy.print();
        johnWes.print();
        chrisCol.print();
        blakeTurn.print();
        jacFHunt.print();
        brandNick.print();
        zachMeg.print();
        dougJames.print();
        gabeCary.print();
        samScott.print();
        jacCVin.print();
        danAndrew.print();
        jeremJoel.print();
        noahShere.print();
        bradIan.print();
        natMCar.print();
        tabiEmma.print();

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

        Ravg = (Colin.getAssFactor() + Scott.getAssFactor() + NathanM.getAssFactor() + Megan.getAssFactor() + Carly.getAssFactor() +
                Billy.getAssFactor() + Hunter.getAssFactor() + Danny.getAssFactor() + Nick.getAssFactor() + Hayley.getAssFactor() +
                Zach.getAssFactor() + Gabby.getAssFactor() + Wesley.getAssFactor() + John.getAssFactor() + Brad.getAssFactor() +
                Tyler.getAssFactor() + Joel.getAssFactor() + Emma.getAssFactor() + Sherene.getAssFactor() + Cary.getAssFactor() +
                JacobC.getAssFactor() + Mason.getAssFactor() + Blake.getAssFactor() + Mason.getAssFactor() + Brandon.getAssFactor() +
                Turner.getAssFactor() + JacobF.getAssFactor() + James.getAssFactor()) / 28;

        Carly.resetTournament(Ravg);
        Colin.resetTournament(Ravg);
        Scott.resetTournament(Ravg);
        NathanM.resetTournament(Ravg);
        Megan.resetTournament(Ravg);
        Billy.resetTournament(Ravg);
        Hunter.resetTournament(Ravg);
        Danny.resetTournament(Ravg);
        Nick.resetTournament(Ravg);
        Hayley.resetTournament(Ravg);
        Zach.resetTournament(Ravg);
        Gabby.resetTournament(Ravg);
        Wesley.resetTournament(Ravg);
        John.resetTournament(Ravg);
        Brad.resetTournament(Ravg);
        Tyler.resetTournament(Ravg);
        Joel.resetTournament(Ravg);
        Emma.resetTournament(Ravg);
        Sherene.resetTournament(Ravg);
        Cary.resetTournament(Ravg);
        JacobC.resetTournament(Ravg);
        Mason.resetTournament(Ravg);
        Turner.resetTournament(Ravg);
        Brandon.resetTournament(Ravg);
        James.resetTournament(Ravg);
        Blake.resetTournament(Ravg);
        Doug.resetTournament(Ravg);
        JacobF.resetTournament(Ravg);


        System.out.println("\n ###### SMA4 SINGLES ######");
        Carly.printAssFactor();
        Colin.printAssFactor();
        Scott.printAssFactor();
        NathanM.printAssFactor();
        Megan.printAssFactor();
        Billy.printAssFactor();
        Hunter.printAssFactor();
        Danny.printAssFactor();
        Nick.printAssFactor();
        Hayley.printAssFactor();
        Zach.printAssFactor();
        Gabby.printAssFactor();
        Wesley.printAssFactor();
        John.printAssFactor();
        Brad.printAssFactor();
        Tyler.printAssFactor();
        Joel.printAssFactor();
        Emma.printAssFactor();
        Sherene.printAssFactor();
        Cary.printAssFactor();
        JacobC.printAssFactor();
        Mason.printAssFactor();
        Turner.printAssFactor();
        Brandon.printAssFactor();
        James.printAssFactor();
        Blake.printAssFactor();
        Doug.printAssFactor();
        JacobF.printAssFactor();

        //SMA5



        // Team natMCar = new Team(NathanM, Carly);
        Team jeremCary = new Team(Jeremiah,Cary);
        Team jacFEmma = new Team(JacobF, Emma);
        Team natWCole = new Team(NathanW, Cole);
        Team ajTurner = new Team(AJ, Turner);
        Team masTy = new Team(Mason, Tyler);
        Team blakeHak = new Team(Blake, Hakeem);
        Team robColin = new Team(Rob, Colin);
        Team noahJoel = new Team(Noah, Joel);
        Team adamBam = new Team(Adam, Bam);
        Team vinTIan = new Team(VincentT, Ian);
        Team zachBill = new Team(Zach, Billy);
        //Team dougJames = new Team(Cooper, Gabby);
        Team bradJacC = new Team(Brad, JacobC);

        Ravg = (jeremCary.getAssFactor() + jacFEmma.getAssFactor() + natWCole.getAssFactor() + ajTurner.getAssFactor() +
                masTy.getAssFactor() + blakeHak.getAssFactor() + robColin.getAssFactor() + noahJoel.getAssFactor() +
                adamBam.getAssFactor() + vinTIan.getAssFactor() + zachBill.getAssFactor() + bradJacC.getAssFactor() +
                dougJames.getAssFactor() + natMCar.getAssFactor()) / 14;

        teamMatch(jeremCary, natMCar);
        teamMatch(jacFEmma, natWCole);
        teamMatch(ajTurner, masTy);
        teamMatch(blakeHak, robColin);
        teamMatch(noahJoel, adamBam);
        teamMatch(vinTIan, zachBill);
        teamMatch(natWCole, masTy);
        teamMatch(zachBill, adamBam);
        teamMatch(jeremCary, dougJames);
        teamMatch(ajTurner, jacFEmma);
        teamMatch(bradJacC, blakeHak);
        teamMatch(noahJoel, vinTIan);
        teamMatch(dougJames, zachBill);
        teamMatch(jacFEmma, robColin);
        teamMatch(blakeHak, natWCole);
        teamMatch(vinTIan, natMCar);
        teamMatch(jacFEmma, dougJames);
        teamMatch(blakeHak, vinTIan);
        teamMatch(ajTurner, jeremCary);
        teamMatch(bradJacC, noahJoel);
        teamMatch(blakeHak, jeremCary);
        teamMatch(noahJoel, jacFEmma);
        teamMatch(noahJoel, blakeHak);
        teamMatch(ajTurner, bradJacC);
        teamMatch(bradJacC, noahJoel);
        teamMatch(bradJacC, ajTurner);
        teamMatch(ajTurner, bradJacC);

        jeremCary.resetTournament(Ravg);
        natMCar.resetTournament(Ravg);
        jacFEmma.resetTournament(Ravg);
        natWCole.resetTournament(Ravg);
        ajTurner.resetTournament(Ravg);
        masTy.resetTournament(Ravg);
        blakeHak.resetTournament(Ravg);
        robColin.resetTournament(Ravg);
        noahJoel.resetTournament(Ravg);
        adamBam.resetTournament(Ravg);
        vinTIan.resetTournament(Ravg);
        zachBill.resetTournament(Ravg);
        dougJames.resetTournament(Ravg);
        bradJacC.resetTournament(Ravg);

        System.out.println("\n ###### SMA5 ######");
        jeremCary.print();
        natMCar.print();
        jacFEmma.print();
        natWCole.print();
        ajTurner.print();
        masTy.print();
        blakeHak.print();
        robColin.print();
        noahJoel.print();
        adamBam.print();
        vinTIan.print();
        zachBill.print();
        dougJames.print();
        bradJacC.print();


        //SMA6
        Team caryAsh = new Team(Ashten,Cary);
        //Team adamBam = new Team(Jeremiah,Cary);
        //Team masTy = new Team(Jeremiah,Cary);
        Team tabiJust = new Team(Tabitha, Justin);
        Team steveJoel = new Team(Steve,Joel);
        Team andCGrant = new Team(AndrewC, Grant);
        Team kolbyNatM = new Team(Kolby, NathanM);
        Team jacCAndM = new Team(JacobC, AndrewM);
        //Team zachMeg = new Team(Zach, Megan);
        Team turnNatW = new Team(Turner,NathanW);
        Team bradVinT = new Team(Brad, VincentT);
        Team scottShere = new Team(Scott, Sherene);
        //Team robColin = new Team(Rob, Colin);
        //Team jacFEmma = new Team(JacobF, Emma);
        Team billNick = new Team(Billy, Nick);
        Team blake = new Team(Blake,Blake);
        Team jeremIan = new Team(Jeremiah, Ian);
        Team chrisAbby = new Team(Christian, Abby);
        Team dougGrantJ = new Team(Doug, GrantJ);
        Team carlDan = new Team(Carly, Danny);

        Ravg = (caryAsh.getAssFactor() +
                adamBam.getAssFactor() +
                masTy.getAssFactor() +
                tabiJust.getAssFactor() +
                steveJoel.getAssFactor() +
                andCGrant.getAssFactor() +
                kolbyNatM.getAssFactor() +
                jacCAndM.getAssFactor() +
                zachMeg.getAssFactor() +
                turnNatW.getAssFactor() +
                bradVinT.getAssFactor() +
                scottShere.getAssFactor() +
                robColin.getAssFactor() +
                jacFEmma.getAssFactor() +
                billNick.getAssFactor() +
                blake.getAssFactor() +
                jeremIan.getAssFactor() +
                chrisAbby.getAssFactor() +
                dougGrantJ.getAssFactor() +
                carlDan.getAssFactor()) / 10;

        teamMatch(adamBam, caryAsh);
        teamMatch(masTy, tabiJust);
        teamMatch(andCGrant, steveJoel);
        teamMatch(kolbyNatM, chrisAbby);
        teamMatch(turnNatW, zachMeg);
        teamMatch(scottShere, robColin);
        teamMatch(billNick, blake);
        teamMatch(dougGrantJ, carlDan);
        teamMatch(jacCAndM, adamBam);
        teamMatch(bradVinT, masTy);
        teamMatch(andCGrant, jacFEmma);
        teamMatch(jeremIan, kolbyNatM);
        teamMatch(zachMeg, chrisAbby);
        teamMatch(robColin, steveJoel);
        teamMatch(blake, tabiJust);
        teamMatch(carlDan, caryAsh);
        teamMatch(adamBam, zachMeg);
        teamMatch(robColin, masTy);
        teamMatch(jacFEmma, blake);
        teamMatch(carlDan, kolbyNatM);
        teamMatch(jacCAndM, turnNatW);
        teamMatch(bradVinT, scottShere);
        teamMatch(billNick, andCGrant);
        teamMatch(dougGrantJ, jeremIan);
        teamMatch(turnNatW, jacFEmma);
        teamMatch(carlDan, scottShere);
        teamMatch(andCGrant, adamBam);
        teamMatch(jeremIan, robColin);
        teamMatch(carlDan, turnNatW);
        teamMatch(jeremIan, andCGrant);
        teamMatch(jacCAndM, bradVinT);
        teamMatch(dougGrantJ, billNick);
        teamMatch(jeremIan, bradVinT);
        teamMatch(billNick, carlDan);
        teamMatch(jeremIan, billNick);
        teamMatch(jacCAndM, dougGrantJ);
        teamMatch(jeremIan, dougGrantJ);
        teamMatch(jacCAndM, jeremIan);

        caryAsh.resetTournament(Ravg);
        adamBam.resetTournament(Ravg);
        masTy.resetTournament(Ravg);
        tabiJust.resetTournament(Ravg);
        steveJoel.resetTournament(Ravg);
        andCGrant.resetTournament(Ravg);
        kolbyNatM.resetTournament(Ravg);
        jacCAndM.resetTournament(Ravg);
        zachMeg.resetTournament(Ravg);
        turnNatW.resetTournament(Ravg);
        bradVinT.resetTournament(Ravg);
        scottShere.resetTournament(Ravg);
        robColin.resetTournament(Ravg);
        jacFEmma.resetTournament(Ravg);
        billNick.resetTournament(Ravg);
        blake.resetTournament(Ravg);
        jeremIan.resetTournament(Ravg);
        chrisAbby.resetTournament(Ravg);
        dougGrantJ.resetTournament(Ravg);
        carlDan.resetTournament(Ravg);

        System.out.println("\n###### SMA6 ######");
        caryAsh.print();
        adamBam.print();
        masTy.print();
        tabiJust.print();
        steveJoel.print();
        andCGrant.print();
        kolbyNatM.print();
        jacCAndM.print();
        zachMeg.print();
        turnNatW.print();
        bradVinT.print();
        scottShere.print();
        robColin.print();
        jacFEmma.print();
        billNick.print();
        blake.print();
        jeremIan.print();
        chrisAbby.print();
        dougGrantJ.print();
        carlDan.print();


        Adam.printGames();
        AJ.printGames();
        Alex.printGames();
        AndrewC.printGames();
        AndrewM.printGames();
        Ashten.printGames();
        Bam.printGames();
        Billy.printGames();
        Blake.printGames();
        Brad.printGames();
        Brandon.printGames();
        Britney.printGames();
        Carly.printGames();
        Cary.printGames();
        Chester.printGames();
        Christian.printGames();
        Cody.printGames();
        Cole.printGames();
        Colin.printGames();
        Conor.printGames();
        Cooper.printGames();
        Danny.printGames();
        Doug.printGames();
        Emma.printGames();
        Eric.printGames();
        Evan.printGames();
        Gabby.printGames();
        Gabe .printGames();
        Grant.printGames();
        GrantJ.printGames();
        Hakeem.printGames();
        Hayley.printGames();
        Hunter.printGames();
        Ian.printGames();
        JacobF.printGames();
        JacobC.printGames();
        James.printGames();
        Jeremiah.printGames();
        Joel.printGames();
        John.printGames();
        Justin.printGames();
        Kaitlyn.printGames();
        Kolby.printGames();
        Mason.printGames();
        Megan.printGames();
        NathanM.printGames();
        NathanW.printGames();
        Nick.printGames();
        Noah.printGames();
        Rob.printGames();
        Sam.printGames();
        Scott.printGames();
        Sherene.printGames();
        Steve.printGames();
        Steven.printGames();
        Tabitha.printGames();
        Turner.printGames();
        Tyler.printGames();
        Vince.printGames();
        VincentT.printGames();
        Wesley.printGames();
        Zach.printGames();

        System.out.println("\n ###### SMA LEGACY RANKS ######");
        Adam.printLegacyFactor();
        AJ.printLegacyFactor();
        Alex.printLegacyFactor();
        AndrewC.printLegacyFactor();
        AndrewM.printLegacyFactor();
        Ashten.printLegacyFactor();
        Bam.printLegacyFactor();
        Billy.printLegacyFactor();
        Blake.printLegacyFactor();
        Brad.printLegacyFactor();
        Brandon.printLegacyFactor();
        Britney.printLegacyFactor();
        Carly.printLegacyFactor();
        Cary.printLegacyFactor();
        Chester.printLegacyFactor();
        Christian.printLegacyFactor();
        Cody.printLegacyFactor();
        Cole.printLegacyFactor();
        Colin.printLegacyFactor();
        Conor.printLegacyFactor();
        Cooper.printLegacyFactor();
        Danny.printLegacyFactor();
        Doug.printLegacyFactor();
        Emma.printLegacyFactor();
        Eric.printLegacyFactor();
        Evan.printLegacyFactor();
        Gabby.printLegacyFactor();
        Gabe .printLegacyFactor();
        Grant.printLegacyFactor();
        GrantJ.printLegacyFactor();
        Hakeem.printLegacyFactor();
        Hayley.printLegacyFactor();
        Hunter.printLegacyFactor();
        Ian.printLegacyFactor();
        JacobF.printLegacyFactor();
        JacobC.printLegacyFactor();
        James.printLegacyFactor();
        Jeremiah.printLegacyFactor();
        Joel.printLegacyFactor();
        John.printLegacyFactor();
        Justin.printLegacyFactor();
        Kaitlyn.printLegacyFactor();
        Kolby.printLegacyFactor();
        Mason.printLegacyFactor();
        Megan.printLegacyFactor();
        NathanM.printLegacyFactor();
        NathanW.printLegacyFactor();
        Nick.printLegacyFactor();
        Noah.printLegacyFactor();
        Rob.printLegacyFactor();
        Sam.printLegacyFactor();
        Scott.printLegacyFactor();
        Sherene.printLegacyFactor();
        Steve.printLegacyFactor();
        Steven.printLegacyFactor();
        Tabitha.printLegacyFactor();
        Turner.printLegacyFactor();
        Tyler.printLegacyFactor();
        Vince.printLegacyFactor();
        VincentT.printLegacyFactor();
        Wesley.printLegacyFactor();
        Zach.printLegacyFactor();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void match(Player winner, Player loser) {
        winner.gameWon();
        loser.gameLost();

        double lAF = loser.getAssFactor();
        double wAF = winner.getAssFactor();

        loser.updateRating(wAF);
        winner.updateRating(lAF);
    }

    private static void teamMatch(Team winner, Team loser) {
        winner.gameWon();
        loser.gameLost();

        double lAF = loser.getAssFactor();
        double wAF = winner.getAssFactor();

        loser.updateRating(wAF);
        winner.updateRating(lAF);
    }
}
