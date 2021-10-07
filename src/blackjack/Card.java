package blackjack;

public class Card {
    private String pattern; // 무늬
    private String denomination; // 숫자, 값

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }
    // 생성자가 하나라도 있는 경우 기본생성자는 자동생성 안된다.

    public String getPattern() {
        return this.pattern;
    }
    public String getDenomination() {
        return this.denomination;
    }

    public int getPoint() {
        // denomination 값이 "A" > 1
        // "2" >2
        // ...
        // "10","J","Q","K"  > 10
        switch (this.denomination) {
            case "A":
                return 1;
            case "J":
            case "Q":
            case "K":
                return 10;
            default: // "2" ~ "10" > 문자열 정수형으로 parsing(파싱)
                return Integer.parseInt(this.denomination);
        }
    }

    @Override
    public String toString() {
//        String str = String.valueOf(1); // 값을 그대로 문자열로 변환
//        String str2 = String.format("%s - %s", this.pattern, this.denomination); // 값을 자유롭게 받아... 문자열로..

        return String.format("%s - %s", this.pattern, this.denomination);
        //format()은 printf() 랑 기능은 동일하나, format()은 값을 리턴 하며, printf()은 콘솔에 출력.
    }
}
