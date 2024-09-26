package _13_ArrayList;

import java.util.ArrayList;
public class ListSample {
	ArrayList<String> a = new ArrayList<>();
	public ListSample() {
		System.out.println("리스트이 길이 "+a.size());
		a.add("apple");
		System.out.println("리스트이 길이 "+a.size());
		a.add("banana");
		a.add("abc초코렛");
		a.add("샌드");
		System.out.println("리스트이 길이 "+a.size());
		System.out.println(a.get(1));
		for(int i=0; i< a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("------------");
		for(int i=0; i< a.size(); i++) {
			if(a.get(i).charAt(0)!='a') {
				System.out.println(a.get(i));
			}
		}
		System.out.println("------------");
		a.add(1,"쭈구미");   // 특정 인덱스 위치에 추가**
							// 원래 있던 애들은 하나씩 뒤로 밀린다
		for(int i=0; i< a.size(); i++) {
			System.out.println(i+":"+ a.get(i));
		}
		System.out.println("-------------");
		a.remove(3);  // 특정 인덱스 삭제
						// 있던 애들이 하나씩 앞으로 당겨진다
		for(int i=0; i< a.size(); i++) {
			System.out.println(i+":"+ a.get(i));
		}
		System.out.println("-------------");
		a.set(1,"갑오징어");  // 특정 인덱스 수정**
							// 그 부분만 바뀐다
		for(int i=0; i< a.size(); i++) {
			System.out.println(i+":"+ a.get(i));
		}
		a.clear();  // 리스트 전체 삭제
					// 안에 리스트만 삭제, ArrayList는 남아있다
		System.out.println(a.size());
		
		
		
		
		/*
		 * ArrayList 인덱스가 있다 > 순서가 있다는 의미
            가변길이다.

			사용 가능한 메서드
			add(value)   -- 맨뒤에 추가
			add(index,  value)  - index 위치에 추가하고 뒤로 밀림
			size()   -- 리스트의 전체 사이즈
			get( index)   -- index위치의 값 가져오기
			remove(index)  - index위치 값 제거
			clear()  - 리스트 전체 값 제거
			set(index,value)   - index위치 값 수정
		 */
		
		
		
		
	
	}
}