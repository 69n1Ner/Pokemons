import ru.ifmo.se.pokemon.*;
public class WorkUp extends StatusMove{
    public WorkUp(){
        super(Type.NORMAL, 0 ,1);
    }
    @Override
    protected void applySelfEffects(Pokemon self){
        self.setMod(Stat.ATTACK, +1);
        self.setMod(Stat.SPECIAL_ATTACK, +1);
    }
    @Override
    protected String describe(){
        return "use Work Up";
    }
}
//Этой атаки у Happiny нет(