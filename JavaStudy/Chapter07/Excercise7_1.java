class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for (int i = 0; i < cards.length; i++) {
            int num = i%10+1;
            boolean isKwang = (i<10) && (num==1 || num==3 || num==8);
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    void shuffle(){
        SutdaCard temp = new SutdaCard();
        
        for (int i = 0; i < cards.length; i++) {
            double rand = Math.random();
            int index = (int) (rand*20);
            temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
    }

    SutdaCard pick(int index){
        return cards[index];
    }

    SutdaCard pick(){
        double rand = Math.random();
        int index = (int) (rand*20);
        return cards[index];
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num+(isKwang?"K":"");
    }
}
public class Excercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+", ");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
