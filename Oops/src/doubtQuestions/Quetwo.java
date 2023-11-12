package doubtQuestions;
public class Quetwo {
		   
	    // Function for finding maximum and value pair
	    public static long sumXOR (int arr[], int n) {
	        //Complete the function
	     /*   long sum=0;
	        int xor;
	        for(int i=0;i<arr.length;i++){
	        	int j=0;
	            for(j=j+i+1;j<arr.length;j++){
	               System.out.println(arr[i]+","+arr[j]);
	                xor=(arr[i]^arr[j]);
	                sum+=xor;
	            }
	        //sum=sum^arr[i];
	        }
	        return sum;
	    }*/
	    	 int start=0;
	         int end=n-1;
	         long sum=0;
	         System.out.println(arr[start]+","+arr[end]);
	         long sum1=arr[start]^arr[end];
	         for(int i=0;i<n;i++){
	                 System.out.println(arr[i]+","+arr[i+1]);
	                 sum+=(arr[i]^arr[i+1]);
	               //  System.out.println("sum"+sum);
	             }
	              sum=sum+sum1;
	         return sum;
	    }
	    public static void main(String[] args) {
	    	int arr[]= {7,3,5,3,5};
	    	int n=arr.length;
			System.out.println(sumXOR(arr,n));
		}
	    
	    
	}

