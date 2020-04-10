package com.jse.card;

public class CardServiceImpl implements CardService{
	
	private Card[] cards;
	public int count;
	public CardServiceImpl() {
		cards = new Card[3];
		count = 0;
	}
	@Override
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	@Override
	public Card[] getCards() {
		return cards;
    }
	@Override
	public void add(Card card) {
		cards[count] = card;
		count++;	
    }
@Override
public void setCount (int count) {
	this.count = count;	
}
@Override
public int getCount() {
	return count;
}
	
}



