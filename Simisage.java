import ru.ifmo.se.pokemon.*;
public final class Simisage extends Pansage {
    public Simisage(String name, int level){
        super(name,level);
        pokemonStat();
    }
    @Override
    protected void evoChangableStat(){
        setStats(75, 98, 63, 98, 63, 101);
        addMove(new DoubleTeam());
    }
}
//lvl 65