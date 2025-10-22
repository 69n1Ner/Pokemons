import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        if (def.getCondition() == Status.BURN ||
            def.getCondition() == Status.POISON ||
            def.getCondition() == Status.PARALYZE){
        def.setMod(Stat.HP, ((int) Math.round(damage)*2));
        }
        else{
            def.setMod(Stat.HP, ((int) Math.round(damage)));
        }
    }
    @Override
    protected String describe(){
        return "use Facade";
    }
}

//42 lvl