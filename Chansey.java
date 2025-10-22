import ru.ifmo.se.pokemon.*;
public class Chansey extends Happiny {
    public Chansey(String name, int level){
        super(name, level);
    }
    @Override
    protected void evoChangableStat(){
        setStats(250, 5, 5, 35, 105, 50);
        setMove(new MudBomb());
        }
    }
//lvl 42