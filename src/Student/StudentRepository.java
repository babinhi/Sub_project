package Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	List<StudentDTO> list = new ArrayList<>();
	
	public List<StudentDTO> findAll(){
		return list;
	}
	
//	public boolean scoreon(StudentDTO studentDTO, String id) {
//		for(StudentDTO no : list) {
//			if(no.getSno().equals(id)) {
//				no.setKor(studentDTO.getKor());
//				no.setEng(studentDTO.getEng());
//				no.setMat(studentDTO.getMat());
//				no.setSoc(studentDTO.getSoc());
//				no.setSci(studentDTO.getSci());
//				no.setGrade();
//				return true;
//			}
//			
//		}return false;
//	}
	public boolean update(StudentDTO studentDTO, String sno) {
		for (StudentDTO no : list) {
			if (no.getSno().equals(sno)) {
				no.setName(studentDTO.getName());
				no.setKor(studentDTO.getKor());
				no.setEng(studentDTO.getEng());
				no.setMat(studentDTO.getMat());
				no.setSoc(studentDTO.getSoc());
				no.setSci(studentDTO.getSci());
				no.setGrade();
				return true;
			}
		}
		return false;
	}
	
	public boolean save(StudentDTO studentDTO) {
		boolean result = list.add(studentDTO);
		return result;
	}
	public boolean loginCheck(String sno, String pw) {
		for(StudentDTO s : list ) {
			if(sno.equals(s.getSno())&& pw.equals(s.getPw())){
				return true;
			}
		}return false;
	}
	
	public StudentDTO findById(String sno) {
		for(StudentDTO no : list) {
			if(no.getSno().equals(sno)) {
				return no;
			}
		}return null;
	}
	public boolean update1(StudentDTO studentDTO, String sno) {
		for (StudentDTO no : list) {
			if(no.getSno().equals(sno)) {
				no.setPw(studentDTO.getPw());
				no.setPhonemunber(studentDTO.getPhonemunber());
				return true;
			}
		}return false;
	}
	
//	public StudentDTO scorecheck(String pw) {
//		for(StudentDTO no : list) {
//			if(no.getPw().equals(pw)) {
//				return no;
//			}
//		}return null;
//	}
}
