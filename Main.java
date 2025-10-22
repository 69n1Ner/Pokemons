import ru.ifmo.se.pokemon.*;
public class Main{
    public static void main(String[] args) {
        Battle b = new Battle();
        //Pokemon p1 = new Pokemon("Alien", 1);
        Heracross p1 = new Heracross("Broke",50);
        Simisage p2 = new Simisage("Greeny",80);
        Pansage p3 = new Pansage("Onion", 65);
        b.addAlly(p1);
        //b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }

}