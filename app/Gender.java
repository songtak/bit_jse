package com.jse.app;
import java.util.Scanner;
public class Gender {
     public static void main(String[] args) {
     find();
}
 static void find() {
	 System.out.println("주민번호를 입력하세요.");
     Scanner scanner = new Scanner(System.in);
	 String ssn = scanner.next();
	 System.out.println(ssn);
	 //System.out.println(String.format("성별"));
	 char ch =ssn.charAt(7);
	 //String a = "";
	 // char c = '';
	 //case '1'
	 //char c =0;
		String result = "";
		switch(ch) {
		case '1': case '3': result = "남성"; break;
		case '2': case '4': result = "여성"; break;
		case '5': case '6': result = "외국인"; break;
		default: result = "없음"; break; //=case 0: case 7: case 8: case 9: result = "잘못 입력한 값"; break;
		}
		System.out.println(result);

	 //System.out.println("남성"); //1,3
	 //System.out.println("여성"); //2,4
	 //System.out.println("외국인"); //5,6
	 //System.out.println("잘못 입력한 값"); //0,7,8,9

 }
 }