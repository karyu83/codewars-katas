#http://www.codewars.com/kata/take-a-ten-minute-walk/train/java

import java.util.ArrayList;
import java.util.List;

// �ʹ� �ڵ尡 ��� ��Ȳ��. �����丵�� �ʿ�. �÷��� 2���� �� ������ �� �� �־���.
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
   List<Character> l = new ArrayList<Character>();
	    if( walk.length == 10 ){
	      for (char c : walk) {
	        switch(c) {
	          case 'n':
	            if( l.indexOf('s') != -1 ){
	            	l.remove(l.indexOf('s'));
	            } else {
	            	l.add('n');
	            };
	            break;
	          case 's' :
	        	  if( l.indexOf('n') != -1 ){
		            	l.remove(l.indexOf('n'));
		            } else {
		            	l.add('s');
		            };
	        	  break;
	          case 'w' :
	        	  if( l.indexOf('e') != -1 ){
		            	l.remove(l.indexOf('e'));
		            } else {
		            	l.add('w');
		            };
	        	  break;
	          case 'e' :
	        	  if( l.indexOf('w') != -1 ){
		            	l.remove(l.indexOf('w'));
		            } else {
		            	l.add('e');
		            };
	        	  break; 
	        	 default: break;
	        }
	      }
	    } else {
	      return false;
	    }
	    if(l.isEmpty()) {
	    	 return true;
	    } else {
	    	return false;
	    }
  }

 


}


