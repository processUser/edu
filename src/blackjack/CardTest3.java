package blackjack;

public class CardTest3 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();

        Card c1 = new Card("테스트", "7");
        Card c2 = new Card("테스트", "10");

        dealer.receiveCArd(c1);
        dealer.receiveCArd(c2);

        dealer.moreCard(cd);
        dealer.showAllMyCards();
    }
}
