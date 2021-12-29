import java.util.Vector;

class Product{
    int price;
    int point;
    Product(int price){
        this.price = price;
        point = (int)(price * 0.1);
    }
    public Product() {}
}
class TV extends Product{
    TV(){super(100);}
    public String toString(){return "TV";}
}
class Computer extends Product{
    Computer() {super(150); }
    public String toString(){return "Computer";}
}
class Radio extends Product{
    public Radio() {super(200);}
    public String toString(){return "Radio";}
}

class House extends Product{
    public House() {super(1500);}
    public String toString(){return "House";}
}

class Buyer{
    int money = 1000;
    int point = 0;
    Vector item = new Vector();

    void buy(Product p){
        if(money < p.price) {
            System.out.println("돈이없어서 " + p +" 못삼 ㅅㄱ");
            return;
        }
        money -= p.price;
        point += p.point;
        item.add(p);
        System.out.println(p + "를 구매하셨습니다.");
        System.out.println("남은돈은 : " + money + " 누적 포인트는 : " + point + " 입니다.");
        System.out.println();
    }
    void refund(Product p){
        if(item.remove(p)){
            money += p.price;
            point -= p.point;
            System.out.println(p + " 를 반품하셨습니다.");
        } else{
            System.out.println("구입하신 제품충 해당 제품이 없습니다.");
            System.out.println();
        }
    }
    void Summary(){
        int sum_price = 0;
        String items = "";

        if(item.isEmpty()){
            System.out.println("구입하신 제품이 없습니다.");
            System.out.println();
            return;
        }
        for(int i = 0; i < item.size(); i ++){
            Product p = (Product)item.get(i);
            sum_price += p.price;
            System.out.println(i + "번째 인덱스에 있는 물건은 " + p + "이고 가격은 : " + p.price + "입니다.");
            items += (i == 0) ? "" + p :", " + p;
        }

        System.out.println("전제 상품을 구입하는데 " + sum_price + " 원 사용했습니다.");
        System.out.println("구입하신 상품 목록은 : " + items + "입니다.");
    }
}

public class PolyArgumentTest3 {
    public static void main(String args[]){
        Buyer b = new Buyer();
        TV t = new TV();
        Computer c = new Computer();
        Radio r = new Radio();
        House h = new House();

        b.buy(h);
        b.buy(t);
        b.buy(c);
        b.buy(r);
        b.Summary();
        System.out.println();
        b.refund(r);
        b.Summary();


    }
}
