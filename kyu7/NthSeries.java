#https://www.codewars.com/kata/sum-of-the-first-nth-term-of-series/train/java

public class NthSeries {
	
	public static String seriesSum(int n) {
  double sum = 1;
  
  for(int i=2;i<=n;i++){
    sum +=  1.00 / ( 4+ ( 3* (i-2) ) ) ;
  }
  
  String result =  String.format( "%.2f", Math.round( sum * 100d) / 100d ) ;

  return result;
  
		// Happy Coding ^_^		
	}
}