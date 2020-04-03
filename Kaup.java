package com.jse.app;
/* 개발자님 키와 몸무게를 이용하여
카우푸지수를 구하고
그결과 저상, 저체중, 비만등으로 몸의 상태만
알려주는 프로그램을 만들어 주세요 */

public class Kaup {
	private double userWeight;
	private double userHight;


	
	public void setUserWeight(double userWeight) {
		this.userWeight = userWeight;
	}
	public double getUserWeight() {
		return userWeight;
	}
	public void setUserHight(double userHight) {
		this.userHight = userHight;
	}
	public double getuserHight() {
		return userHight;
	}
	
	

		
    public String calculate() {
    	String result = "";
    	double kaupIndex = ((userWeight*1000) / (userHight *userHight) * 10);
    	System.out.println();
    	if (kaupIndex <= 13) {
    		result = "고도수척";
    	}
    	else if (13<kaupIndex&&kaupIndex<=15) {
    		result = "수척";
       }
    	else if (15<kaupIndex&&kaupIndex<=19) {
    		result = "정상";
    	}			
        else if (19<kaupIndex&&kaupIndex<=22) {
    		result = "체중과다";
        }
    	else if (kaupIndex>22) {
    		result = "비만";
    	}
        return result;	
    }
    }


	


