package Bogang304._06_Class;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {

		Student[] stu = new Student[50];
	      String[] names = { "정윤지", "이성훈", "추은주", "김성도", "주현주", "신동민", "이준수", "장수연", "임승환", "길도연", "추석준", "김용호", "양학균",
	            "장민", "정보규", "황혜원", "김은혜", "조현준", "" };
	      int lengthadd = names.length;
	      
	      for (int i = 0; i < names.length; i++) {

	         Student str1 = new Student(); // 이름
	         str1.setName(names[i]);
	         stu[i] = str1;

	         int age = (int) (Math.random() * 10) + 20; // 나이
	         stu[i].setAge(age); 
  
	         stu[i].setGender(i%2==0 ? "남" : "여");

	         stu[i].setEmail("ddit" + (i + 1) + "@naver.com");

	         stu[i].setTel("010-1111-1111");

	         stu[i].setClas("304호");
	      }

	      while (true) {
	         Scanner sc = new Scanner(System.in);
	         System.out.println("1. 학생 추가");
	         System.out.println("2. 학생 조회");
	         System.out.println("3. 학생 변경");
	         System.out.println("4. 학생 삭제");
	         System.out.println("5. 전체 조회");
	         System.out.println("6. 학급반 조회");
	         System.out.println("7. 종료");
	         System.out.println("번호를 입력하세요 : ");
	         int num = sc.nextInt();

	         if (num == 1) {
	        	 ++lengthadd;
	        	names = new String[lengthadd];
	            System.out.println("추가할 정보를 입력하세요(이름, 나이, 성별, 전화번호, 이메일)");
	            System.out.print("1. 이름 : ");
	            String nam1 = sc.next();
	            System.out.print("2. 나이 : ");
	            int ag = sc.nextInt();
	            System.out.print("3. 성별 : ");
	            String nam2 = sc.next();
	            System.out.print("4. 전화번호 : ");
	            String nam3 = sc.next();
	            System.out.print("5. 이메일 : ");
	            String nam4 = sc.next();
	            System.out.print("6. 클래스 : ");
	            String nam5 = sc.next();
	            for(int i = 0; i<names.length; i++) {
	               if(i==names.length-2){ //배열 마지막 부분에 입력값을 기입해야함
	               stu[i].setName(nam1);
	               stu[i].setAge(ag);
	               stu[i].setGender(nam2);
	               stu[i].setTel(nam3);
	               stu[i].setEmail(nam4);
	               System.out.println("변경 후 내역  : " + (i+1) + "\t" + stu[i].getName() + "\t" + stu[i].getAge() + "\t" + stu[i].getGender()
	                     + "\t" + stu[i].getEmail() + "   " + stu[i].getTel());
	            }
	            }
			}

	         else if (num == 2) {
	            System.out.println("학생 번호를 선택해주세요 : ");
	            int num3 = sc.nextInt();
	            for(int i=0; i<names.length+1; i++) {
	               if(num3-1 == i) {               
	                  System.out.println(stu[i].getName());
	                  System.out.println();
	               }     
	            }
	         }

	         else if (num == 3) {
	            System.out.println("변경하실 학생번호를 입력하세요 : ");
	            int num4 = sc.nextInt();
	            for(int i=0; i<names.length; i++) {
	               if(num4-1 == i) {
	                  System.out.println(names[i]);
	                  System.out.println("변경할 정보를 입력하세요(이름, 나이, 성별, 전화번호, 이메일)");
	                  System.out.print("1. 이름 : ");
	                  String nam1 = sc.next();
	                  System.out.print("2. 나이 : ");
	                  int ag = sc.nextInt();
	                  System.out.print("3. 성별 : ");
	                  String nam2 = sc.next();
	                  System.out.print("4. 전화번호 : ");
	                  String nam3 = sc.next();
	                  System.out.print("5. 이메일 : ");
	                  String nam4 = sc.next();
	                  System.out.println("6. 클래스 : ");
	                  String nam5 = sc.next();
	                  stu[i].setName(nam1);
	                  stu[i].setAge(ag);
	                  stu[i].setGender(nam2);
	                  stu[i].setTel(nam3);
	                  stu[i].setEmail(nam4);
	                  stu[i].setClas(nam5);
	                  System.out.println("변경 후 내역  : " + i + "\t" + stu[i].getName() + "\t" + stu[i].getAge() + "\t" + stu[i].getGender()
	                           + "\t" + stu[i].getEmail() + "   " + stu[i].getTel()+"   " + stu[i].getClas());
	               }
	            }
	            
	         }

	         else if (num == 4) {
	            System.out.println("==========================================================================");
	            System.out.println("\t\t\t\t학생 전체 명단\t\t");
	            System.out.println();
	            for (int i = 0; i <= names.length-2; i++) {
	               System.out.println(
	                     (i + 1) + "\t" + stu[i].getName() + "\t" + stu[i].getAge() + "\t" + stu[i].getGender()
	                           + "\t" + stu[i].getEmail() + "   " + stu[i].getTel() + "   " + stu[i].getClas());
	            }
	            System.out.println("==========================================================================");
	            System.out.println("삭제하실 학생번호를입력하세요 : ");
	            int del = sc.nextInt();
	            for (int i = 0; i < names.length-2; i++) {
	               if (del - 1 == i) {
	                  stu[i].setName(" ");
	                  stu[i].setAge(0);
	                  stu[i].setGender(" ");
	                  stu[i].setEmail(" ");
	                  stu[i].setTel(" ");
	                  stu[i].setClas(" ");
	               }
	            }
	            System.out.println("==========================================================================");
	            System.out.println("\t\t\t\t삭제 후 명단\t\t");
	            for (int i = 0; i < names.length-1; i++) {
	               System.out.println(
	                     (i + 1) + "\t" + stu[i].getName() + "\t" + stu[i].getAge() + "\t" + stu[i].getGender()
	                           + "\t" + stu[i].getEmail() + "   " + stu[i].getTel() + "   " + stu[i].getClas());
	            }
	            System.out.println("==========================================================================");
	         } 
	         else if (num == 5) {
	            System.out.println("==========================================================================");
	            System.out.println("\t\t\t\t학생 전체 명단\t\t");
	            System.out.println();
	            for (int i = 0; i < names.length-1; i++) {
	               System.out.println(
	                     (i + 1) + "\t" + stu[i].getName() + "\t" + stu[i].getAge() + "\t" + stu[i].getGender()
	                           + "\t" + stu[i].getEmail() + "   " + stu[i].getTel() + "   " + stu[i].getClas());
	            }
	            System.out.println("==========================================================================");
	            System.out.println();

	         }
	         else if (num == 6) {
	            System.out.println("찾고자 하는 학급반을 입력하세요 : ");
	            String cla = sc.next();
	            {
	               
	               if (cla.equals("304호")) { 
	                  System.out
	                        .println("==========================================================================");
	                  System.out.println("\t\t\t\t해당 반 학생 \t\t");
	                  System.out.println();
	                  for (int j = 0; j < names.length-1; j++) {
	                     System.out.println((j + 1) + "\t" + stu[j].getName() + "\t" + stu[j].getAge() + "\t"
	                           + stu[j].getGender() + "\t" + stu[j].getEmail() + "   " + stu[j].getTel() + "   "
	                           + stu[j].getClas());
	                  }
	                  System.out
	                        .println("==========================================================================");
	               } else {
	                  System.out.println("원하는 학급반에 학생이 없습니다.");
	               }
	            }

	         }
	         else {
	            System.out.println("종료 되었습니다.");
	            break;
	         }
	      }
	}
}

class Student {
	private String name;
	private int age;
	private String gender;
	private String tel;
	private String email;
	private String clas;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String classNum(String key) {
		for (int i = 0;;) {
		}
	}
}
