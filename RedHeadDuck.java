public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        quackBehaviour=new Quack();
        swimBehaviour=new SwimWithLegs();
        flyingBehaviour=new CanFly();
    }
