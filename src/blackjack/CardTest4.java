package blackjack;

public class CardTest4 {
    public static void main(String[] args) {
        //JUnit( 테스트 도구 )
        Rule rule = new Rule();
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();

        dealer.receiveCArd(cd.getCard());
        dealer.receiveCArd(cd.getCard());
        dealer.moreCard(cd);
        dealer.showAllMyCards();
        System.out.println("---------");
        gamer.receiveCArd(cd.getCard());
        gamer.receiveCArd(cd.getCard());
        gamer.receiveCArd(cd.getCard());
        gamer.showAllMyCards();

        rule.getWinner(dealer, gamer);
    }
}
