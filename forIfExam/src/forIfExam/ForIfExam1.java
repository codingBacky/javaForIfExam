package forIfExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ForIfExam1 {

		public static void main(String[] args) {
			//중복되는 정수를 배열로 출력하기
		Scanner scan = new Scanner(System.in);
		String inner = scan.nextLine();
		String[] input = inner.split(",");  
		List<Integer> list = new ArrayList<>();
//	    int w =input.length-1;
//	    System.out.println(input[0]+","+input[w]);
//	    if( input[0].equals(input[w]) ) {
//			System.out.println(input[0] +"," + input[w]);
//	    }
		
		
		
		for( int i = 0; i < input.length; i++) {
			int total = Integer.parseInt(input[i]);
			int[] inputInt = new int[input.length];
			inputInt[i] = Integer.parseInt(input[i]);
				list.add(inputInt[i]);
				
			
			for( int n = i+1; n < input.length; n++) {
				total += Integer.parseInt(input[n]);
				list.add(total);
			}
		}
	    scan.close();
	    System.out.println(list);
		System.out.println(Collections.max(list));
	}
}