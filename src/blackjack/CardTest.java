package blackjack;

import java.util.List;
import java.util.ArrayList;

public class CardTest {
    public static void main(String[] args) {
        // 스페이드,A 를 가지는 카드객체
        Card c1 = new Card("스페이드", "A");
        Card c2 = new Card("스페이드", "2");

        System.out.println(c1.getPattern());
        System.out.println(c1.getDenomination());

        //배열
        //ArrayList

        List<Card> cards = new ArrayList();
        cards.add(c1);
        cards.add(new Card("스페이드", "2"));

        Card ccc = cards.get(0);

        System.out.println(c1.toString());
        System.out.println(c2);

        CardDeck cd = new CardDeck();
        cd.showAllCards();

        //52장의 카드가 "스페이드" - A~k
        // 하트, 클럽, 다이아몬드, 스페이드

    }
}
