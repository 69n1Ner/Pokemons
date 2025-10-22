import ru.ifmo.se.pokemon.*;
public final class  Pansage extends Pokemon {
    public Pansage(String name, int level){
            super(name,level);
            addType(Type.GRASS);
            setStats(50, 53, 48, 53, 48, 64);
            setMove(new ShadowClaw(), new LowSweep(), new DoubleTeam());
        }
    }

