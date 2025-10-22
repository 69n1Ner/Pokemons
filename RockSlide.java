import ru.ifmo.se.pokemon.*;
public class RockSlide extends PhysicalMove{
    public RockSlide(){
        super(Type.ROCK, 75, 90);
        //почему покемон бьет сам себя?
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().chance(0.3);
        eff.flinch(p);
        
    }
    
    @Override
    protected String describe(){
        return "use Rock Slide";
    }
}