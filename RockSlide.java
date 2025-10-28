import ru.ifmo.se.pokemon.*;
public class RockSlide extends PhysicalMove{
    public RockSlide(){
        super(Type.ROCK, 75, 90);
        
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().chance(0.3);
        eff.flinch(p);        
        //Нет команды на наличие у покемона атаки -> нельзя полностью реализовать
    }
    
    @Override
    protected String describe(){
        return "use Rock Slide";
    }
}