package com.jse.app;

public class RPSGame {
	private int userValue;
	private int computerValue;

	
	public void setUserValue(int userValue) {
		this.userValue = userValue;
	}
	public int getUserValue() {
		return userValue;
	}
	public void setComputerValue(int computerValue) {
		this.computerValue = computerValue;
	}
	public int getComputerValue() {
		return computerValue;
	}
	
	public String game() {
		String result = "";
		if (userValue == 1) {
			if (computerValue == 1) {
				result = "비김";
			} else if (computerValue == 2) {
				result = "컴퓨터 승리";
			} else if (computerValue == 3) {
				result = "사용자 승리";
			}
		} else if (userValue == 2) {
			if (computerValue == 2) {
				result = "비김";
			} else if (computerValue == 1) {
				result = "사용자 승리";
			} else if (computerValue == 3) {
				result = "컴퓨터 승리";
			}
		} else if (userValue == 3) {
			if (computerValue == 3) {
				result = "비김";
			} else if (computerValue == 1) {
				result = "컴퓨터 승리";
			} else if (computerValue == 2) {
				result = "사용자 승리";
			}
		}
		return result;
	}
	
	
}
	

	
	//System.out.println("결과는 " + result + " 입니다");
	
	//public String game( ) 
		//System.out.println("컴퓨터의 값은 2 입니다.");
		//System.out.println("컴퓨터 승리");
		
	
	


