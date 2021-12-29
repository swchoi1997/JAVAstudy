import java.sql.SQLOutput;

public class RepairableTest {
    public static void main(String[] args){
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
        scv.repair(marine);
    }
}

interface Repairable{ }

class Unit {
    int hitPoint;
    final int MAX_HP;
    public Unit(int hp) {
        MAX_HP = hp;
    }
}
class GroundUnit extends Unit{
    GroundUnit(int hp){
        super(hp);
    }
}
class AirUnit extends Unit{
    AirUnit(int hp){
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150);
        hitPoint = 100;
    }
    public String tostring(){
        return "Tank";
    }
}
class Dropship extends AirUnit implements Repairable{
    Dropship(){
        super(200);
        hitPoint = MAX_HP;
    }
    public String tostring(){
        return "Dropship";
    }
}
class Marine extends AirUnit implements Repairable{
    Marine(){
        super(100);
        hitPoint = MAX_HP;
    }
    public String tostring(){
        return "Marine";
    }
}
class SCV extends GroundUnit implements Repairable{
    SCV(){
        super(50);
        hitPoint = MAX_HP;
    }
    void repair(Repairable r){
        if (r instanceof Unit){
            Unit u = (Unit) r;
            System.out.println(u.hitPoint+ " " + u.MAX_HP);
            while(u.hitPoint != u.MAX_HP){
                u.hitPoint++;
                System.out.println("체력차는 중 현재체력 : " + u.hitPoint);
            }
            System.out.println(u.toString() + "수리가 끝났습니다.");
        }
    }
}

