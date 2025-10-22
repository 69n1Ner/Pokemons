import ru.ifmo.se.pokemon.*;
public class MudBomb extends PhysicalMove{
    public MudBomb(){
        super(Type.GROUND, 65 ,85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().chance(0.3).turns(-1); 
        eff.stat(Stat.ACCURACY, -1);
        p.setCondition(eff);
        System.out.println(p.getStat(Stat.ACCURACY));
        //как реализовать это
    }
    @Override
    protected String describe(){
        return "use Mud Bomb";
    }
}
//Этой атаки нет у Chansey(