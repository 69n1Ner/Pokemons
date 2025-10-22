import ru.ifmo.se.pokemon.*;
public class Simisage extends Pansage {
    public Simisage(String name, int level){
            super(name,level);
            addType(Type.GRASS);
            setStats(75, 98, 63, 98, 63, 101);
            setMove(new RockSlide(), new ShadowClaw(), new LowSweep(), new DoubleTeam());
        }
    }

