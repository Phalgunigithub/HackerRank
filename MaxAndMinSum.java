import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MaxAndMinSum {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		List<Integer> arr= new ArrayList<>();
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		
		long sum1=0;
		long sum2=0;
		
		for(int i=0;i<n-1;i++) {
			System.out.print(arr.get(i));
			sum1=sum1+arr.get(i);
		}
		System.out.println();
		
		for(int i=1;i<n;i++) {
			System.out.print(arr.get(i));
			sum2=sum2+arr.get(i);
		}
		
		System.out.println();
		
		System.out.println(sum1+" "+sum2);
	}

}
