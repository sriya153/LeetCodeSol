package easy.Math;

import java.util.ArrayList;

public class CountPrimes {
	public int countPrimes(int n) {
	       int count=0;
	        ArrayList list = new ArrayList();
	        for(int i = 0 ; i < n ;i++){
	            if(isPrime(i)){
	              count++  ;
	            }
	        }
	       return count; 
	    }
    public boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
             }
         }

        return true;
        }

}
