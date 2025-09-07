// Strategy Design Pattern Example

// interface for walkable robots

interface WalkableRobot{
    void walk();
}
class NormalWalk implements WalkableRobot{
    public void walk(){
        System.out.println("I can walk normally.");
    }
}
class NoWalk implements WalkableRobot{
    public void walk(){
        System.out.println("I cannot walk.");
    }
}

// interface for talkable robots

interface TalkableRobot{
    void talk();
}
class NormalTalk implements TalkableRobot{
    public void talk(){
        System.out.println("I can talk normally.");
    }
}
class NoTalk implements TalkableRobot{
    public void talk(){
        System.out.println("I cannot talk.");
    }
}

// interface for flyable robots

interface FlyableRobot{
    void fly();
}
class NormalFly implements FlyableRobot{
    public void fly(){
        System.out.println("I can fly normally.");
    }
}
class NoFly implements FlyableRobot{
    public void fly(){
        System.out.println("I cannot fly.");
    }
}

//  robot base class
abstract class Robot{
    WalkableRobot walkbehaviour;
    TalkableRobot talkbehaviour;
    FlyableRobot flybehaviour;
    public Robot(WalkableRobot w, TalkableRobot t, FlyableRobot f){
        this.walkbehaviour =w;
        this.talkbehaviour = t;
        this.flybehaviour = f;
    }   
    public void walk(){
        walkbehaviour.walk();
    }
    public void talk(){
        talkbehaviour.talk();
    }
    public void fly(){
        flybehaviour.fly();
    }
    public abstract void projection();//abstract method for subclasses to implement
}

// Concrete robot types

// 1.companion robot
class CompanionRobot extends Robot{
    public CompanionRobot(WalkableRobot w, TalkableRobot t, FlyableRobot f) {
        super(w,t,f);
    }
    public void projection(){
        System.out.println("Displaying friendly companion features.");
    }
}

// 2.worker robot

class WorkerRobot extends Robot {
    public WorkerRobot(WalkableRobot w, TalkableRobot t, FlyableRobot f) {
        super(w, t, f);
    }

    public void projection() {
        System.out.println("Displaying worker efficiency stats...");
    }
}


//Main class to demonstrate the Strategy Design Pattern
public class StrategyDesignPattern {
public static void main(String args[]){
    Robot robot1=new CompanionRobot(new NormalWalk(), new NormalTalk(),new NoFly());
    robot1.walk();
    robot1.talk();
    robot1.fly();
    robot1.projection();
    System.out.println();
    Robot robot2=new WorkerRobot(new NoWalk(), new NoTalk(),new NormalFly());
    robot2.walk();
    robot2.talk();
    robot2.fly();
    robot2.projection();

}
}