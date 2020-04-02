package com.jse.app;
import java.util.Random;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();
		Calculator calculator = new Calculator();
		Dice dice = new Dice();
		RPSGame rPSGame = new RPSGame();
		Random random = new Random();
		
		while(true) {
			System.out.println("0. 종료 "
					+ "1. 회원가입 "
					+ "2. 로그인 "
					+ "3. 계산기 "
					+ "4. 주사위 홀짝 맞추기 "
					+ "5. 1부터 100까지의 합"
					+ "4. 가위바위보");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("회원가입");
				System.out.println("아이디 입력");
				String userid = scanner.next();
				member.setId(userid);
			
			break;
			
			
			case 2: 
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = scanner.next();
				String returnId = member.getId();
				System.out.println("로그인된 아이디: "+ returnId);
				if(id2.equals(returnId)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
				break;
				
				
			case 3:
				System.out.println("계산기");
				System.out.println("첫번째 수 입력");
				int a = scanner.nextInt();
				calculator.setNum1(a);
				System.out.println("두번째 수 입력");
				int b = scanner.nextInt();
				calculator.setNum2(b);
				int c = calculator.calculate();
				System.out.println("두수의 합"+c);
				break;
				
				
			case 4: 
				System.out.println("가위바위보 게임");
				System.out.println("1. 가위, 2.바위 3.보 숫자를 입력하세요.");
				int expect  = scanner.nextInt();
				System.out.println("사용자가 입력한 값: ", user);
				rPSGame.setUservalue(user);
				int computervalue = random.nextInt(4);
				System.out.println(String.format("컴퓨터의 값은: %d", computervalue));
			

				
				break;
				
			case 5: 
				System.out.println("주사위 홀짝 맞추기 게임");
				System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
				String expect =scanner.next();
				System.out.println(String.format("사용자가 입력한 값: %s ", expect));
				
				dice.setExpect(expect);
				int diceNumber = random.nextInt(6)+1;
				System.out.println(String.format("컴퓨터가 생성한 값: %d", diceNumber));
				dice.setDiceNumber(diceNumber);
				String result = dice.switchDice();
				System.out.println(result);
				break;
			}
			
		}
	}
	

}