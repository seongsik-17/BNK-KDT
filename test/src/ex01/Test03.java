package ex01;

public class Test03 {

	public static void main(String[] args) {
		int j = 0;
		//arr[10] 배열 생성
		int[] arr = new int [] {1,2,3,4,5,6,7,8,9,10};
		
		
		int[] a = new int[10];//홀수를 저장할 배열 a 생성(0~9)
		int[] b = new int[10];//짝수를 저장할 배열 b 생성(0~9)
		//arr배열 요소의 홀/짝 판별 후 저장
		for(int i = 0; i < 10; i++) {
			if(arr[i]%2!=0){
				a[j] = arr[i];
				j++;//i케이스(0,2,4,6,8)
				//System.out.println(a[i]);
			}
			else {
				b[j] = arr[i];
				j++;
				//System.out.println(b[i]);
			}
		
			
		}
		
		
	

		

	}

}
