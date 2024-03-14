package kr.or.ddit.Homework.Home11;

import java.util.Random;

public class Deck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.process();
    }

    public void process() {
        // 카드 리스트 호출
        Card[] cardList = cardList();

        // 카드 섞기 (메소드생성)
        suffle(cardList);

        // 승패 비교(메소드)
        compareHands(cardList);
    }

    public Card[] cardList() {
        Card[] cardList = new Card[52];
        String[] types = {"♠", "◆", "♥", "♣"};
        int cur = 0;
        for (String type : types) {
            for (int i = 1; i <= 13; i++) {
                cardList[cur++] = new Card(i, type);
            }
        }
        return cardList;
    }
    
    public void suffle(Card[] cardList) {
    	for(int i= 0; i<1000; i++ ) {
    		int ran = new Random().nextInt(cardList.length);
    		Card temp = cardList[0];
    		cardList[0] = cardList[ran];
    		cardList[ran] = temp;
    	}
    }
    public String result(Card[] cardList) {
    	int ran = new Random().nextInt(51)+1;
    	Card myCard = cardList[ran];
    	Card comCard = cardList[0];
    	
    	String result = "";
    	if(myCard.num > comCard.num) result = "이겼다";
    	else result = "졌다";
    }
    


    public void compareHands(Card[] cards) {
        // 랜덤한 카드 뽑기(내 카드), 맨 위 카드(컴퓨터)
        Card myCard = cards[(int) (Math.random() * cards.length)];
        Card computerCard = cards[0];

        // 출력
        System.out.println("내 카드: " + myCard);
        System.out.println("컴퓨터 카드: " + computerCard);

        // 내 카드 숫자가 높을 경우 승리
        if (myCard.num > computerCard.num) {
            System.out.println("나의 승리!");
        } else if (myCard.num < computerCard.num) {
            System.out.println("컴퓨터의 승리!");
        } else {
            System.out.println("무승부!");
        }
    }
}