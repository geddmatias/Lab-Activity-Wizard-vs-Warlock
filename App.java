public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("UPCOMING MATCH:");
        System.out.println("Invoker as Wizard versus ShadowFiend as Warlock");
        System.out.println("Both heroes are lvl 6 and has 200 HP and 200 Mana");
        System.out.println("The winner will be rewarded 10 levels!");
        System.out.println("Let the battle begin!!!");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Wizard Invoker = new Wizard("Invoker");
        Warlock ShadowFiend = new Warlock("ShadowFiend");
        Invoker.Tornado(ShadowFiend);
        Invoker.Sunstrike(ShadowFiend);
        ShadowFiend.ShadowRazeNear(Invoker);
        Invoker.DeafiningBlast(ShadowFiend);
        ShadowFiend.ShadowRazeMedium(Invoker);
        ShadowFiend.ShadowRazeFar(Invoker);
        Invoker.Satanic(Invoker);
        Invoker.EMP(ShadowFiend);
        Invoker.Meteor(ShadowFiend);
        ShadowFiend.RequimOfSouls(Invoker);
        Invoker.ColdSnap(ShadowFiend);
        // This is the sequence of their skills to be used in their fight.
        

    }
}