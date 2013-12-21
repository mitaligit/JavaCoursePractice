import java.util.*;
public class bigtest implements Comparable<bigtest>{
	 private String s;
	    private int n;
	   
	    
	    public bigtest(String s, int n) {
	        this.s = s;
	        this.n = n;
	    }
	    
	    public String getKey() {
	        return s;
	    }
	    
	    public int getValue() {
	        return n;
	    }
	    public String toString() {
	        String result = s + "=";
	        
	        result += n + "";
	       return result;
	    } 
	    public int compareTo(bigtest other)
	    {
	    	int num = s.compareTo(other.s);
	    	if(n != other.n)
	    	{
	    		return n - other.n;
	    		
	    	}
	    	else 
	    	{
	    		
	    		return -num;
	    	}
	    	
	    }
	    
}
