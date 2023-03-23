package Student;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	StudentRepository sr = new StudentRepository();
	String loginsno = null;
	String loginpw = null;
	
//	public void scoreon() {
//		System.out.print("점수를 작성할 아이디을 입력해주세요 :");
//		String id = sc.next();
//		StudentDTO s = sr.findById(id);
//		if(s == null) {
//			System.out.println("찾을수 없는 아이디입니다");
//		}else {
//			StudentDTO studentDTO = new StudentDTO();
//			System.out.print("입력할 국어점수 :");
//			studentDTO.setKor(sc.nextInt());
//			System.out.print("입력할 영어점수 :");
//			studentDTO.setEng(sc.nextInt());
//			System.out.print("입력할 수학점수 :");
//			studentDTO.setMat(sc.nextInt());
//			System.out.print("입력할 사회점수 :");
//			studentDTO.setSoc(sc.nextInt());
//			System.out.print("입력할 과학점수 :");
//			studentDTO.setSci(sc.nextInt());
//			if(sr.scoreon(studentDTO, id)) {
//				System.out.println("해당 학번의 점수가 입력되었습니다");
//			}else {
//				System.out.println("입력에 실패하였습니다");
//			}
//		}
//		
//	}

	public void findAll() {
		List<StudentDTO> list = sr.findAll();
		for(StudentDTO s : list) {
			System.out.println("학번\t이름\t전화번호\t\t학과\t국어\t영어\t수학\t사회\t과학\t합계\t평균");
			System.out.println();
			System.out.println("──────────────────────────────────────────────────────────────────");
			System.out.println();
			System.out.println(s.toString());
		}
	}
	public void update() { 
		System.out.print("수정하고 싶은 학번 >");
		String sno = sc.next(); sc.nextLine();
		StudentDTO s = sr.findById(sno);
			if(s == null) {
				System.out.println("조회할 수 없는 학번입니다");
			}else {
				StudentDTO studentDTO = new StudentDTO(); 
				System.out.print("수정할 국어점수 >");
				studentDTO.setKor(sc.nextInt());
				System.out.print("수정할 영어점수 >");
				studentDTO.setEng(sc.nextInt());
				System.out.print("수정할 수학점수 >");
				studentDTO.setMat(sc.nextInt());
				System.out.print("수정할 사회점수 >");
				studentDTO.setSoc(sc.nextInt());
				System.out.print("수정할 과학점수 >");
				studentDTO.setSci(sc.nextInt());  
				if(sr.update(studentDTO, sno)) {
					System.out.println("수정완료");
				}else {
					System.out.println("수정실패");
				}
			}	
	}
	public void save() {
		StudentDTO studentDTO = new StudentDTO();
		System.out.print("이름 :");
		studentDTO.setName(sc.next());
		System.out.print("PW :");
		studentDTO.setPw(sc.next());
		System.out.print("핸드폰번호 :");
		studentDTO.setPhonemunber(sc.next());
		System.out.print("전공 :");
		studentDTO.setMajor(sc.next());
		System.out.print("국어 >");
		studentDTO.setKor(sc.nextInt());
		System.out.print("영어 >");
		studentDTO.setEng(sc.nextInt());
		System.out.print("수학 >");
		studentDTO.setMat(sc.nextInt());
		System.out.print("사회 >");
		studentDTO.setSoc(sc.nextInt());
		System.out.print("과학 >");
		studentDTO.setSci(sc.nextInt());
		studentDTO.setGrade();
		if(sr.save(studentDTO)) {
			System.out.println("학생등록에 성공하셨습니다");
		}else {
			System.out.println("다시 작성하여 주세요");
		}
	}
	public boolean loginCheck() {
		System.out.print("학번 :");
		String sno = sc.next();
		System.out.print("PW :");
		String pw = sc.next();
		if(sr.loginCheck(sno, pw)) {
			System.out.println("로그인 성공");
			
			loginsno = sno;
			loginpw = pw;
			return true;
		}else {
			System.out.println("다시 확인해주세요");
			return false;
		}
	}
	
	public void findById() {
		System.out.print("검색할 학번 :");
		String sno = sc.next();
		StudentDTO studentDTO = sr.findById(sno);
		System.out.println("학번\t이름\t전화번호\t\t학과\t국어\t영어\t수학\t사회\t과학\t합계\t평균");
		System.out.println();
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.println();
		if(studentDTO == null) {
			System.out.println("존재하지 않는 ID입니다");
		}else {
			
			System.out.println(studentDTO);
		}
		
	}
	public void update1() {
		System.out.print("수정하고 싶은 학번 :");
		String sno  = sc.next();
		if(sno == null) {
			System.out.print("조회할 수 없는 학번입니다");
		}else {
			StudentDTO studentDTO = new StudentDTO();
			System.out.print("PW :");
			studentDTO.setPw(sc.next());
			System.out.print("핸드폰번호 :");
			studentDTO.setPhonemunber(sc.next());
			if(sr.update1(studentDTO, sno)) {
				System.out.println("수정완료");
			}else {
				System.out.println("수정실패");
			}
		}
		
	}
//	public void scorecheck() {
//		System.out.print("비밀번호를 입력해주세요 >");
//		String pw = sc.next();
//		StudentDTO studentDTO = sr.findById(pw);
//		if(studentDTO == null) {
//			System.out.println("올바르지 않는 비밀번호입니다");
//		}else {
//			System.out.println("학번\t이름\t전화번호\t\t학과\t국어\t영어\t수학\t사회\t과학\t합계\t평균");
//			System.out.println();
//			System.out.println("──────────────────────────────────────────────────────────────────");
//			System.out.println();
//			System.out.println(studentDTO.toString());
//		}
//	}
	public void logout() {
		 loginsno = null;
		 loginpw = null;
		 System.out.println("로그아웃");
	}
}
