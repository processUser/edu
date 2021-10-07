package blackjack;

import java.util.List;

public class Rule {
    /*
    멤버필드 없다.
    static 으로 만들기 가능.
     */

    public int getScore(List<Card> cards) {
        int sumPoint = 0;
        for (int i=0; i < cards.size(); i++) {
            Card c = cards.get(i);
            sumPoint += c.getPoint();
        }
        return sumPoint;
    }

    public void getWinner(Dealer dealer, Gamer gamer) {
        int dealerScore = getScore(dealer.openCards());
        int gamerScore = getScore(gamer.openCards());

        System.out.println("dealerScore : " + dealerScore);
        System.out.println("gamerScore : " + gamerScore);

        // 경우의 수 3 (비긴경우 (점수가 같음, 둘다 21점 넘김), 딜러 승, 게이머 승)
        final int STAND_SCORE = 21;
        if (dealerScore > STAND_SCORE && gamerScore > STAND_SCORE || dealerScore == gamerScore){
            System.out.println("비겼습니다.");
        } else if(gamerScore < dealerScore && dealerScore <= STAND_SCORE || gamerScore > STAND_SCORE ){
            System.out.println("딜러 승!");
        } else {
            System.out.println("게이머 승!!");
        }

    }
}
