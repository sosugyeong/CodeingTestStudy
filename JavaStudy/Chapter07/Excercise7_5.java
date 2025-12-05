class Product1{
    int price;
    int bonusPoint;

    Product1(){}

    Product1(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product1{
    Tv1(){}

    public String toString(){
        return "Tv";
    }
}
public class Excercise7_5 {
    public static void main(String[] args) {
        Tv1 t1 = new Tv1();
    }
}
