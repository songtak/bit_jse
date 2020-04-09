package com.jse.app;

import java.util.Random;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Member member = new Member();
		Calculator calculator = null;
		Dice dice = null;
		RPSGame rPSGame = null;
		Kaup kaup = null;

		while (true) {
			System.out.println(
					"0. 종료 " + "1. 회원가입 " + "2. 로그인 " + "3. 계산기 " + "4. 가위바위보 " + "5. 랜덤다이스" + "6. 카우프 비만지수 구하기");
			int flag = scanner.nextInt();
			switch (flag) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("회원가입");
				System.out.println("아이디 입력");
				String userid = scanner.next();
				member.setId(userid);

				break;

			case 2:
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = scanner.next();
				String returnId = member.getId();
				System.out.println("로그인된 아이디: " + returnId);
				if (id2.equals(returnId)) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				break;

			case 3:
				calculator = new Calculator();
				System.out.println("계산기");
				
				System.out.println("첫번째 수 입력");
				int a = scanner.nextInt();
				calculator.setNum1(a);
				
				System.out.println("두번째 수 입력");				
				int b = scanner.nextInt();			
				calculator.setNum2(b);
				
				int c = calculator.calculate();
				System.out.println("두수의 합" + c);
				break;

	/*		case 4:
				rpsGame = new RPSGame();
				System.out.println("가위바위보 게임");
				System.out.println("1. 가위, 2.바위 3.보 숫자를 입력하세요.");
				int user = scanner.nextInt();
				System.out.println("사용자가 입력한 값: " + user);
				rPSGame.setUserValue(user);

				int com = random.nextInt(3) + 1;
				System.out.println(String.format("컴퓨터의 값: ", com));
				
				rPSGame.setComputerValue = rPSGame.game();
				String gameResult = rPSGame.game();
				System.out.println("결과" + Result);

				break; */

			case 5:
				dice = new Dice();
				System.out.println("주사위 홀짝 맞추기 게임");
				System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
				String expect = scanner.next();
				System.out.println(String.format("사용자가 입력한 값: %s ", expect));
				dice.setExpect(expect);			
				int diceNumber = random.nextInt(6) + 1;
				System.out.println(String.format("컴퓨터가 생성한 값: %d", diceNumber));
				dice.setDiceNumber(diceNumber);
				String result = dice.switchDice();
				System.out.println(result);
				break; 

			case 6:
				kaup = new Kaup();
				System.out.println("카우프 계산");
				System.out.println("몸무게를 입력하세요.");
				kaup.setUserWeight(scanner.nextDouble());
				System.out.println("키를 입력하세요.");
				double hight = scanner.nextDouble();
				kaup.setUserHight(hight);
				
				/*rPSGame.setComputerValue = rPSGame.game();
				String gameResult = rPSGame.game();
				System.out.println("결과" + Result);*/

				
				//kaup.setKaupResult (kaupIndex);//
				String kaupResult = kaup.calculate();
				System.out.println("당신은 " + kaupResult + "입니다.");
				
				break;

			}

		}
	}

}