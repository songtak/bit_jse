package com.jse.app;
import java.util.Scanner;
import java.util.Random;

public class RTS {
	public static void main(String[] args) {
		game();
		
	}
	static void game() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("가위1, 바위2, 보3을 입력하세요.");
		String expect = scanner.next();
		System.out.println(String.format("사용자의 값: %s", expect));
		
		Random random = new Random();
		int game = random.nextInt(3)+1;
		System.out.println(String.format("컴퓨터의 값: %d", game));
		
		String result = "";
		switch(game) {
		case 1: result = "가위"; break;
		case 2: result = "바위"; break;
		case 3: result = "보"; break;
		}
		
		

	}
}
