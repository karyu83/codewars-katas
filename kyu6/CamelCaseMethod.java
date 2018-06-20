#https://www.codewars.com/kata/camelcase-method/java

public class CamelCaseMethod {

   public static String camelCase(String str) {
      StringBuffer sb = new StringBuffer();
      if(str != null && str != ""){
          String[] s = str.split(" ");
          for(String t : s) {
            if(t.length() > 0){
              char c = t.charAt(0);
              sb.append( (String.valueOf(c)).toUpperCase() );
              sb.append(t.substring(1, t.length()));
            }
          }
        }
        return sb.toString();
    }
}