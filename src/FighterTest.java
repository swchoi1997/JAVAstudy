public class FighterTest {
    public static void main(String[] args){
        Fighter f = new Fighter();
        if (f instanceof Unit1)
            System.out.println("F is Unit's child");
        if ( f instanceof Fightable)
            System.out.println("f는 fightable 구현했다");
        if (f instanceof Movable)
            System.out.println("f는 movable 구현했다");
        if (f instanceof Attackable)
            System.out.println("f는 Attackable 구현했다");
        if (f instanceof Object)
            System.out.println("F is Object's child");
    }
}

class Unit1{
    int currentHP; // 유닛의 체력
    // 유닛의 좌표
    int x;
    int y;
}
class Fighter extends Unit1 implements Fightable{ // implements 는 Fightable을 구현한다는 의미이따
    public void move(int x, int y){
        //
    }
    public void attack(Unit1 u){

    }
}

interface Fightable extends Movable, Attackable{}
interface Movable{ void move(int x, int y);}
interface Attackable{ void attack(Unit1 u);}
