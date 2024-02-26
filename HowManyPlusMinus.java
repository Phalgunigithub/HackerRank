package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HowManyPlusMinus {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		List<Integer> li=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			li.add(sc.nextInt());
			
		}
		
		System.out.println(li);
		
		double zeroCount=0;
		double pcount=0;
		double ncount=0;
		
		for(int i=0;i<n;i++) {
			if(li.get(i)==0) {
				zeroCount++;
			}
			
			if(li.get(i)>0) {
				pcount++;
			}
			
			if(li.get(i)<0) {
				ncount++;
			}
		}
		 // System.out.format("%.6f",(pcount/arr.size()));
        // System.out.format("%.6f",(ncount/arr.size()));
        // System.out.format("%.6f",(zeroCount/arr.size()));
        
        System.out.println(String.format("%.6f",(pcount/li.size())));
        System.out.println(String.format("%.6f",(ncount/li.size())));
        System.out.println(String.format("%.6f",(zeroCount/li.size())));
        

    }
		
		
	}
	
	
	


