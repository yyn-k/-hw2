package ch04.sec05;

import java.util.Scanner;


public class KetControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed=0;
		
		while(run) {
			System.out.println("-------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고");
			System.out.println("-------------------");
			System.out.print("선택: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if(strNum.equals("3")) {
				run=false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
	

}
