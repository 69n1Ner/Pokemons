import ru.ifmo.se.pokemon.*;
public class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL, 0, 1);
        }
    @Override
    protected void applySelfEffects(Pokemon self){
        self.setMod(Stat.EVASION, +1);
        System.out.println(self.getStat(Stat.EVASION));
        //почему появляются отрицательные и бесконечные значения

    }
    @Override
    protected String describe(){
        return "use DoubleTeam";
        //почему нужна хотя бы единица в точности?
    }
}