package pkgCore;

import java.util.ArrayList;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {


	
	ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck(int numDeck) {
		
		for (int i = 0; i < numDeck; i++) {
			
			for (eRank rank : eRank.values()) {
				
				for (eSuit suit : eSuit.values()) {
					
					deck.add(new Card(rank, suit));

				}
				
			}
			
		}
		
		
	}
	
	public int getRemaining(Object eNum) {
		int remainder = 0;
		if(eNum instanceof eSuit) {
			for (Card c : this.deck) {
				if (c.getSuit() == eNum) {
					remainder += 1;
				}
			}
		}
		else {
			for (Card c : this.deck) {
				if (c.getRank() == eNum) {
					remainder += 1;
				}
			}
		}	
		return remainder;
	}
	
	public Card Draw() {
		return this.deck.remove(0);
	}

	
	
}
