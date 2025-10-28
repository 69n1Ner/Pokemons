import ru.ifmo.se.pokemon.*;
public class Happiny extends Pokemon{
    public Happiny(String name, int level){
        super(name, level);
    }
    protected void pokemonStat(){
        addType(Type.NORMAL);
        if (getLevel() >= 42){
            addMove(new Facade());
        }
        if (getLevel() >= 10){
            addMove(new WorkUp());
        }
    }
    protected void evoChangableStat(){
        setStats(100, 5, 5, 15, 65, 30);
    }
}
//lvl 42