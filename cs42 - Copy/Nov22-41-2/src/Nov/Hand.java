package Nov;

public class Hand {
	private Card[] Cards = new Card[9];
	private int firstCard;
	private int numberCards;
	Hand player2;
	
	
	public Hand(Card card1, Card card2, Card card3, Card card4, Card card5) {
		Cards[0] = card1;
		Cards[1] = card2;
		Cards[2] = card3;
		Cards[3] = card4;
		Cards[4] = card5;
		firstCard = 0;
		numberCards = 5;
	}
	
	

	public int getNumberCards() {
		return numberCards;
	}

	public void setNumberCards(int numberCards) {
		this.numberCards = numberCards;
	}

	public int getFirstCard() {
		return firstCard;
	}

	public void setFirstCard(int firstCard) {
		this.firstCard = firstCard;
	}



	public Card getCard(int x) {
		return Cards[x];
	}
}
