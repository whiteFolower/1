package kr.or.ddit.Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Homework18 {
	public static void main(String[] args) {
		Homework18 hw = new Homework18();
		hw.process();
	}
		public void process() {
			List<Map> list = dataInput();
			//1. 제일 높은 월급 구하기
			int max = maxSalary(list);
			System.out.println("제일 높은 월급 : "+ max);
			
			//2. 각 부서별 월급 총합 구하기
			getDeptsalsum(list);
			
			//3. empno를 파라미터로 모든 정로를 출력하는 메소드 만들기.
			printAll(7369);
		}
		
		
		
		
		public int maxSalary(List<Map> list) {
			int max = 0;
			for (Map m : list) {
				int sal = (int) m.get("sal");
				if (sal > max)
					max = sal;

				System.out.println(sal);
			}
			return max;
		}
		
		
		public Map<String, Integer> getDeptsalsum(List<Map> list) {
			int sum1 = 0, sum2 =0, sum3 = 0;
			for (Map s : list) {
				int sal = (int) s.get("sal");
				String dept = (String) s.get("dept");
				if(dept.equals("조사부")) {
					sum1 += sal;
				}
				if(dept.equals("영업부")) {
					sum2 += sal;
				}
				if(dept.equals("관리부")) {
					sum3 += sal;
				}
			}
			System.out.println("조사부 총 급여 : "+sum1);
			System.out.println("영업부 총 급여 : "+sum2);
			System.out.println("관리부 총 급여 : "+sum3);
			return null;
		}//부서별 월급 더하기
		// 또 하나의 방법
//		Map<String, Integer> result = new HashMap();
////		for(Map map : list)
//			int sal = (int)map.get("sal");
//			String dname = (Strind)map.get("DNAME");
//			if(result.containsKey(dname)) 
//				sal+=result.get(dname);	
//			}
//			result.put(dname, sal);
//		}
//			return result;		
//		}
		public void printAll(int empno, List<Map> list) {
			for (Map map : list) {
				int eno = (int)map.get("empno");
				if(eno != empno) continue;
				
//				Iterator it = map.keySet().iterator();
//				while(it.hasNext()) {
//					String ket = (String)it.next();
//					Object value = map.get(key);
//					System.out.println(key+" : "+value);
				
				System.out.println("empno : "+map.get("empno"));
				System.out.println("empno : "+map.get("empno"));
				System.out.println("empno : "+map.get("empno"));
				System.out.println("empno : "+map.get("empno"));
				System.out.println("empno : "+map.get("empno"));
				}
			}
			//3. empno를 파라미터로 모든 정로를 출력하는 메소드 만들기.

				
			
			
			

		
		
		
		public List<Map> dataInput() {
			List<Map> list = new ArrayList();
			Map<String, Object> map = new HashMap();
//			7369	장길동	프로그래머	650	조사부
			Map map1 = new HashMap();
			map1.put("empno", 7369);
			map1.put("ename", "장길동");
			map1.put("job", "프로그래머");
			map1.put("sal", 650);
			map1.put("dept", "조사부");
//			7499	고영우	영업사원	340	영업부
			Map map2 = new HashMap();
			map2.put("empno", 7499);
			map2.put("ename", "고영우");
			map2.put("job", "영업사원");
			map2.put("sal", 340);
			map2.put("dept", "영업부");
//			7521	구기현	영업사원	250	영업부
			Map map3 = new HashMap();
			map3.put("empno", 7521);
			map3.put("ename", "구기현");
			map3.put("job", "영업사원");
			map3.put("sal", 250);
			map3.put("dept", "영업부");
//			7566	김동혁	관리자	295	관리부
			Map map4 = new HashMap();
			map4.put("empno", 7566);
			map4.put("ename", "김동혁");
			map4.put("job", "관리자");
			map4.put("sal", 295);
			map4.put("dept", "관리부");
//			7654	김민욱	영업사원	950	관리부
			Map map5 = new HashMap();
			map5.put("empno", 7654);
			map5.put("ename", "김민욱");
			map5.put("job", "영업사원");
			map5.put("sal", 950);
			map5.put("dept", "관리부");

			list.add(map1);
			list.add(map2);
			list.add(map3);
			list.add(map4);
			list.add(map5);
			return list;
			
			
			
			
		}
		
		
		
		
	}


