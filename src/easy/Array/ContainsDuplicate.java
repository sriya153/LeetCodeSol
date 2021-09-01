package easy.Array;

import java.util.HashSet;

public class ContainsDuplicate {
	 public boolean containsDuplicate(int[] nums) {
	        HashSet set = new HashSet();
	        for(int num : nums){
	            if(!set.add(num)){
	               return true; 
	            }
	        }
	        return false;
	    }
}
