public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        quackBehaviour=new Quack();
        swimBehaviour=new SwimWithLegs();
        flyingBehaviour=new CanFly();
    }
    @Override
    public void display() {
        System.out.println(" I am RedHead Duck...");


    }
}
