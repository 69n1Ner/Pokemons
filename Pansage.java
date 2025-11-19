import ru.ifmo.se.pokemon.*;
public class  Pansage extends Pokemon {
    public Pansage(String name, int level){
            super(name,level);
            pokemonStat();
        }
    protected void pokemonStat(){
        addType(Type.GRASS);
        setMove(new ShadowClaw(), new LowSweep(), new DoubleTeam());
        evoChangableStat();
    }
    protected void evoChangableStat(){
        setStats(50, 53, 48, 53, 48, 64);
    }
    }

//lvl 65 