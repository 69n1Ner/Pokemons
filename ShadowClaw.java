
import ru.ifmo.se.pokemon.*;
public class ShadowClaw extends PhysicalMove{
    public ShadowClaw(){
        super(Type.GHOST, 70, 100);
    }
    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        if (1/8 > Math.random()) {
         System.out.println("critical");
         return 2.0D;
      } else {
         return 1.0D;
      }
    }
    @Override
    protected String describe(){
        return "use Shadow Claw";
    }
}