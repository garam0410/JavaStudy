// 이진 탐색 트리 알고리즘

public class Test1 {
	
	public static void main(String[] args) {
		int array[] = {11,13,17,19,23,29,31};
		int head = 0, tail = 6; // head, tail의 인덱스
		int center = (head + tail) / 2; // 중간 값
		
		if(head <= tail) {
			while(head <= tail) {

				center = (head + tail) / 2;
					if(array[center] == 17) {
						System.out.println("'" + (center+1) + "번째의 요소가 일치' 라고 출력한다.");
						break;
					}
					else if(array[center] < 17) {
						head = center + 1;
					}
					
					else
						tail = center - 1;
				}
			
			}
		
		else
			System.out.println("'찾지 못했습니다.' 라고  출력한다.");
		}

	}

