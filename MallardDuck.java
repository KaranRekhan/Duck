public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour=new Quack();
        swimBehaviour=new SwimWithLegs();
        flyingBehaviour=new CanFly();
    }
