public class DecoyDuck extends Duck {

    public DecoyDuck(){
        quackBehaviour=new MuteQuack();
        swimBehaviour=new Floating();
        flyingBehaviour=new Cannotfly();
    }

