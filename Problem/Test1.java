// ���� Ž�� Ʈ�� �˰���

public class Test1 {
	
	public static void main(String[] args) {
		int array[] = {11,13,17,19,23,29,31};
		int head = 0, tail = 6; // head, tail�� �ε���
		int center = (head + tail) / 2; // �߰� ��
		
		if(head <= tail) {
			while(head <= tail) {

				center = (head + tail) / 2;
					if(array[center] == 17) {
						System.out.println("'" + (center+1) + "��°�� ��Ұ� ��ġ' ��� ����Ѵ�.");
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
			System.out.println("'ã�� ���߽��ϴ�.' ���  ����Ѵ�.");
		}

	}

