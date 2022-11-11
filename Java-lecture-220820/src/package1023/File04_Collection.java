package package1023;

import java.util.ArrayList;
import java.util.HashMap;

public class File04_Collection {
	public static void main(String[] args) {
		// 컬렉션 프레임워크(Collection Framework)
		//  - 데이터 군(group)을 다루고 표현하기 위한 단일화된 구조
		//  - 데이터 그룹을 다루기 위한 클래스와 인터페이스를 표준화한 설계
		//  - 다수의 데이터들을 어떻게 저장하며 관리하느냐에 따라
		//    사용되는 클래스가 달라지면 원하는 클래스를 만들 수 도 있다.
		
		//  - 컬렉션(Collection)
		//		- 같은 타입의 객체들의 저장소
		//  - 제네릭 기법과 같이 사용하여 타입 체크와 형 변환을 생략
		//		- 제네릭 : 특정 타입을 가리지 않고 여러 타입을
		//				   다룰 수 있도록 일반화시키는 기법
		
		// 컬렉션은 객체들만 다루기 때문에 기본 자료형은 다룰 수 없다.
		// 때문에 기본 자료형을 객체처럼 다루기 위해 Wrapper 클래스를 정의
		
		
		// ArrayList
		//  - 다수의 객체를 순차적으로 저장하기 위한 컬렉션
		
		ArrayList list = new ArrayList();
		
		list.add(30);
		// = list.add(Integer.valueOf(30));
		list.add(50);
		list.add(60);
		System.out.println("list = " + list);
		
		list.add("Hello");
		System.out.println("list = " + list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(100);
		list2.add(200);
		list2.add(300);
		System.out.println("lsit2 = " + list2);
		System.out.println(list2.size());
		int n = list2.remove(0);
		System.out.println(n);
		System.out.println("lsit2 = " + list2);
		System.out.println(list2.size());
		// list2.add("Hello"); // 오류 발생
		
		// HashMap
		
		// HashMap<KEY, VALUE> hashMap = new HashMap<>();
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("USER_ID01", 102010);
		hashMap.put("USER_ID02", 111020);
		hashMap.put("USER_ID03", 122010);
		hashMap.put("USER_ID04", 111101);
		
		System.out.println(hashMap);
		
		String id = "USER_ID03";
		
		int data = hashMap.get(id);
		System.out.println("id → " + data);
		
		// put		: 추가 / 수정이 가능
		hashMap.put("USER_ID03", 0);
		System.out.println(hashMap);
		
		// replace  : 수정만 가능
		hashMap.replace("USER_ID06", 0);
		System.out.println(hashMap);
		
		// Collections : 컬렉션을 복사, 정렬, 탐색 등의 기능을 제공하는 클래스
		
		// 객체의 크기 비교 또는 정렬을 하기 위한 인터페이스
		// Comparable : 기본 정렬 기준을 구현하는데 사용
		// Comparator : 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할 때 사용
		
		// 컬렉션
		// Iterator : Collection 타입들의 요소를 반복문을 통해 하나씩 사용하고자 할때 사용.
		
	}
}
