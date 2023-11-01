
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	static ArrayList<Student> studentList = new ArrayList<Student>();
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		do{
			menu();
			System.out.println("Choose: ");
			choose = Integer.parseInt(scan.nextLine());
			switch(choose){
			case 1:	//입력
				inputStudent();
				break;
			case 2:		//보기
				
//				for(int i = 0; i < studentList.size(); i++){
//					studentList.get(i).display();
//				}
				showStudent();
				break;
			case 3:	//수정
				editStudent();
				break;

			case 4:	//삭제
				deleteStudent();
				break;
			case 5:
				saveFile();
				break;
			case 6:
				readFile();
				break;
			case 0:
				System.err.println("종료");
				break;
			default:
				System.err.println("Invalid");
			}
		}while(choose != 0);
		
	}
	
	public static void inputStudent(){
			Student std = new Student();
			std.input(studentList);
			studentList.add(std);
	}
	
	public static void showStudent() {
		for(int i = 0; i < studentList.size(); i++){
			studentList.get(i).display();
		}
	}
	
	public static void editStudent(){
		System.out.println("수정할 학번 입력: ");
		String id = scan.nextLine();
		for(int i = 0; i < studentList.size(); i++){
			if(studentList.get(i).getId().equalsIgnoreCase(id)){
				studentList.get(i).edit();
				break;
			}else{
				System.out.println("없는 학번");
			}
		}
	}
	
	public static void deleteStudent(){
		System.out.println("삭제할 학번 입력: ");
		String id = scan.nextLine();
		for(int i = 0; i < studentList.size(); i++){
			if(studentList.get(i).getId().equalsIgnoreCase(id)){
				studentList.remove(i);
				System.out.println("삭제 성공");
				break;
			}else{
				System.out.println("찾을 수 없음.");
			}
		}
	}
	
	
	public static void saveFile(){
		System.out.println("파일 세이브");
		FileOutputStream fos = null; 
		
		try {
			fos = new FileOutputStream("student.txt");
			for(Student std : studentList){
				std.getFile().getBytes();
				fos.write(std.getFile().getBytes("UTF-8"));
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e){		
		}finally{
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void readFile(){
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader bis = null;
		
		try {
			fis = new FileInputStream("student.txt");
			isr = new InputStreamReader(fis,StandardCharsets.UTF_8);
			bis = new BufferedReader(isr);
			String line = null;
			
			while((line = bis.readLine()) != null){
				
				if(line.isEmpty()){
					continue;
				}
				
				Student std = new Student();
				std.parse(line);
				
				studentList.add(std);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e){	
		}
		
	}
	
	public static void menu(){
		System.out.println("1. 입력");
		System.out.println("2. 보기");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("5. 세이브");
		System.out.println("6. 로드");
		System.out.println("0. 종료");
	}
}
