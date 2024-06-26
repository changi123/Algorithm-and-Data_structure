package data_structure.basic_7;

public class Linked_list_4 {

	public static void main(String[] args) {
		/*
		  연결 리스트 (Linked List)
		  (1) 연결 리스트 구조는 메모리에 있는 데이터의 물리적 배치를 
		  	  사용하지 않는 데이터 구조이다.
		  (2) index나 위치보다 참조 시스템? 을 사용한다.
		  (3) 각 요소는 노드라는 것에 저장되는데, 다음 노드 연결에 대한 포인터 또는
		  	  주소가 포함된 또 다른 노드에 저장된다.
			  -> 즉, 모든 요소가 연결된 자료구조이다
			  	ㄴ 데이터 추가 및 삭제 시 재구성이 필요 없어 효율적이다.
		  (4) 단일 연결 리스트와 이중 연결 리스트 등이 있다
		  
		  		시작							끝
		  		 ▽							▽
		  		[값 | *] --> [값 | *] --> [값 | x]
		  
		   
		  
		  (5) 시간 복잡도
		   		ㄴ 값 가져오기 -> O(n)
		   		ㄴ 값 추가하기 -> O(1)
		   		ㄴ 값 삭제하기 -> O(1)
		  (6) 장점
		  	ㄴ 새로운 요소들의 추가 및 삭제가 용이하고 효율적이다
		  	ㄴ 배열처럼 메모리에 연속적으로 위치하지 않는다
		  	ㄴ 배열처럼 구조의 재구성이 필요없다
		  	ㄴ 동적인 메모리 크기
		  	ㄴ 메모리를 더 효율적으로 쓸 수 있기 때문에 대용량 데이터 처리에 적합하다
		  (7) 단점
		  	ㄴ 배열보다 메모리를 더 사용한다
		  	ㄴ 처음부터 끝까지 순회하기 때문에 원하는 값을 비요율적으로 검색/가져온다 (잘못된 그리디..?)
		  	ㄴ 노드를 반대 방향으로 검색할 때 비효율적이다 ( 이중 연결 리스트의 경우 )
		  (8) 사용하는 경우
		  	ㄴ 메모리 크기가 정해져 있지 않을 때
		  	ㄴ 데이터를 연속적으로 빠르게 삽입/제거가 필요할 때
		  	
		 */
	}

}
