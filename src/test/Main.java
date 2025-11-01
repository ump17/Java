package test;

public class Main {
	
	public static void main(String[] args) {
		int[] firstOne = {1,2,7,8};
		int[] secondOne = {3,4,5,6};
		
		int n1 = firstOne.length;
		int n2 = secondOne.length;
		
		int[] result = new int[ n1 + n2]; //8
		
		int i = 0;    //1
		int j = 0;  //3
		int k =0;
				
			while(i< n1 && j< n2) {
				if(firstOne[i]<secondOne[j]) {
					result[k] = firstOne[i]; // res = [ 1,2,3,4,5,4]
					i++;   // i=1,2
					k++;
				}else {
					result[k] = secondOne[j];
					j++;  // j=0,1,2,3,4
					k++;
				}
			}
			
			if(j>=n2) {          // j=4,  n2=4 , i=3,4     k=7
				while(i<n1) {
					result[k] = firstOne[i]; // res = [ 1,2,3,4,5,4]
					i++;   // i=1,2
					k++;
				}
			}else {
				while(j<n2) {
					result[k] = firstOne[j]; // res = [ 1,2,3,4,5,6,xx]
					j++;   // i=1,2
					k++;
				}
			}
			
			
			for(int  l =0;l < result.length; l++) {
				System.out.println(result[l]);
			}
	
	}

}
