public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehaviour=new Squeak();
        swimBehaviour=new Floating();
        flyingBehaviour=new Cannotfly();
    }

