import ru.ifmo.se.pokemon.*;
public final class Heracross extends Pokemon {
    public Heracross(String name, int level){
            super(name,level);
            setType(Type.BUG,Type.FIGHTING);
            setStats(80, 125, 75,  40, 95, 85);
            setMove(new DoubleTeam(), new RockSlide(), new Leer(), new CloseCombat());
        }
    }
//lvl 50
