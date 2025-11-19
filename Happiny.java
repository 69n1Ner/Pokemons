import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends Pokemon {
    public Happiny(String name, int level){
        super(name, level);
        pokemonStat();
    }

    protected void pokemonStat(){
        addType(Type.BUG);
        // setMove(new Facade(), new WorkUp());
        if (getLevel() >= 42){
            addMove(new Facade());
        }
        if (getLevel() >= 10){
            addMove(new WorkUp());
        }
        evoChangableStat();
    }
    protected void evoChangableStat(){
        setStats(100, 5, 5, 15, 65, 30);
    }
}
//lvl 42
    

