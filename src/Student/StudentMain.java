package Student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		Util util = new Util();
		
		while(true) {
			System.out.println("──────────────────────학사관리 시스템──────────────────────");
			System.out.println("");
			System.out.println("                    1.교수 2.학생 0.종료");
			System.out.println("");
			System.out.println("───────────────────────────────────────────────────────");
			System.out.print("메뉴 선택 >");
			int menu = util.numberCheck();
			
				if(menu == 1) {
					while(true) {
						System.out.println("───────────────────────교직원 관리시스템──────────────────────");
						System.out.println("");
						System.out.println("           1.학생등록 2.학생리스트 3.점수수정 0.돌아가기");
						System.out.println("");
						System.out.println("─────────────────────────────────────────────────────────");
						System.out.print("메뉴 선택 >");
						int menu1 = util.numberCheck();
						if(menu1 == 1) {
							ss.save();
						}else if(menu1 ==2) {
							ss.findAll();
						}else if(menu1 ==3) {
							ss.update();
						}else if(menu1 ==0) {
							break;
						}else {
							System.out.println("");
							System.out.println(">>> 잘못된 입력입니다");
							System.out.println(">>> 다시 입력해주세요");
						}
						
					}
				}
				else if(menu == 2) {
					Loop:
						while(true) {
							System.out.println("───────────────────────학생 포탈 시스템──────────────────────");
							System.out.println("");
							System.out.println(" 1.로그인 2.본인정보확인 3.정보수정 4.로그아웃 0.돌아가기");
							System.out.println("");
							System.out.println("─────────────────────────────────────────────────────────");
							System.out.print("메뉴 선택 >");
							int menu2 = util.numberCheck();
							if(menu2 == 1) {
								ss.loginCheck();
							}else if(menu2 ==2) {
								ss.findById();
							}else if(menu2 ==3) {
								ss.update1();
							}else if(menu2 ==4) {
								ss.logout();
								break;
							}else if(menu2 ==0) {
								break;
							}else {
								System.out.println("");
								System.out.println(">>> 잘못된 입력입니다");
								System.out.println(">>> 다시 입력해주세요");
								continue;
							}
						}
						
				} else if(menu == 0) {
					System.out.println("종료되었습니다");
					break;
				}else {
					System.out.println("번호를 다시 입력해주세요");
					continue;
				}
			
		}

	}

}
