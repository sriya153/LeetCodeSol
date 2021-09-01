package easy.String;

public class Reverse {
	public void reverseString(char[] s) {
	     int i=0;
	     int j= s.length-1;
	     while(i<j){
	         swap(s , i ,j);
	         i++;
	         j--;
	     }
	    }
	    public void swap(char [] str , int i , int j){
	        char temp = str[i];
	        str[i] = str[j];
	        str[j]= temp;
	    }
	}

