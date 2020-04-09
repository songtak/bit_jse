package com.jse.app;
import java.util.Scanner;
import java.util.Random;
//import java.util.Random
public class RTS {
	public static void main(String[] args) {
		game();
		
	}
	static void game() {
		Scanner scanner=new Scanner(System.in);
		Random random = new Random();
		System.out.println("가위1, 바위2, 보3을 입력하세요.");
		int expect = scanner.nextInt();
 		
		System.out.println("사용자의 값"+expect);
		int rts = random.nextInt(3)+1;
		
		System.out.println(String.format("컴퓨터의 값: %d", rts));
	
		String result = "";
		if(expect ==1) {
			switch (rts) {
			case 1:result = "무승부";break;
			case 2:result = "승리";break;
			case 3:result = "패배";break;
			}
		}else if (expect ==2)
			switch (rts) {
			case 1:result ="패배";break;
			case 2:result="무승부";break;
			case 3:result="승리";break;
			}
		
		else if (expect==3) {
			switch (rts) {
			case 1:result="승리";break;
			case 2:result="패배";break;
			case 3:result="무승부";break;
		}
		}
		System.out.println("결과는 "+result+"입니다.");
		
		/*switch(game) {
		case 1: result = "가위"; break;
		case 2: result = "바위"; break;
		case 3: result = "보"; break;
		default: result = "다시"; break;
		}*/

		



	}
}
