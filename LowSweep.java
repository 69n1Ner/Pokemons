
import ru.ifmo.se.pokemon.*;
public class LowSweep extends PhysicalMove{
    public LowSweep(){
        super(Type.ELECTRIC, 65 ,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe(){
        return "use Low Sweep";
    }
}