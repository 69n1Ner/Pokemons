import ru.ifmo.se.pokemon.*;
public class Leer extends StatusMove{
    public Leer(){
        super(Type.NORMAL, 0, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, -1);
        System.out.println(p.getStat(Stat.DEFENSE));
    }
    protected String describe(){
        return "use Leer";
    }
}

