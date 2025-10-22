
import ru.ifmo.se.pokemon.*;
public class CloseCombat extends PhysicalMove{
    public CloseCombat(){
        super(Type.FIGHTING, 120, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, -1);
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
        System.out.println(p.getStat(Stat.DEFENSE));
    }
    @Override
    protected String describe(){
        return "use Close Combat";
    }
}