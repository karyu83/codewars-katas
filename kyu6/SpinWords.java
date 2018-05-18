#https://www.codewars.com/kata/stop-gninnips-my-sdrow/train/java

public class SpinWords {

  public String spinWords(String sentence) {
    //TODO: Code stuff here
    String[] arr = sentence.split(" ");
    String result = "";
    for( String s : arr ) {
      if ( s.length() > 4 ) {
       result += " " + new StringBuilder(s).reverse().toString();
      } else {
        result += (" " + s) ;
      }
    }
    return result.trim();
  }
}