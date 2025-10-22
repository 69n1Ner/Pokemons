import ru.ifmo.se.pokemon.*;
public final class Blissey extends Chansey {
    public Blissey(String name, int level){
        super(name, level);
    }
    @Override
    protected void evoChangableStat(){
        setStats(255, 10, 10, 75, 135, 55);
        setMove(new DoubleTeam());
        }
    }
//lvl 42  