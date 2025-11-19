import ru.ifmo.se.pokemon.*;

public class Main{
    public static void main(String[] args) {
        Battle b = new Battle();
        Heracross p1 = new Heracross("Broke",50);
        Simisage p2 = new Simisage("Greeny",80);
        Pansage p3 = new Pansage("Onion", 65);
        Chansey p4 = new Chansey("Sweety", 42);
        Blissey p5 = new Blissey("Shiny", 42);
        Happiny p6 = new Happiny("Luck", 42);
        
        // b.addAlly(p1);
        // b.addFoe(p2);
        // b.addAlly(p3);
        // b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }

}