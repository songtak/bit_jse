package com.jse.card;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class CardController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService service = new CardServiceImpl();
		Card card =null;
		while(true) {			
			switch(JOptionPane.showInputDialog(Constants.CARD_MENU)) {
			case "0":return;
			case "1": 
			for (int i=0;i<1;i++) {
            	String[] values =  JOptionPane.showInputDialog(Constants.CARD_INPUT).split(",");
				card = new Card();
				card.setKind(values[0]);
				card.setNumber(Integer.parseInt(values[1]));
				cardService.add(card);
			}	
            break;
			case "2":
				Card[] cards = service.getCards();
				for(int i=0; i<3; i++) {
					System.out.println(String.format("카드 모양 %s 카드 넘버 %d", 
							cards[i].getKind(), cards[i].getNumber()));
				}
				break;
			
			}
		}
	}

}

