import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPasswrdCheck {

  public static boolean StringChallenge(String str) {

    Pattern textPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=\\\\?@#|/'<>.^*()%!-]).+$",Pattern.CASE_INSENSITIVE);
    int str_len = str.length();
    if (str_len >=7 && str_len <=31 ) {
      if(textPattern.matcher(str).matches()){
        String[] a = str.toLowerCase().split("password");
        if(a.length>1 ){
          return false;
        }else {
          return true;
        }
      }
    }
    return false;
  }

  public static StringBuffer encrypt(String text, int s)
  {
    StringBuffer result= new StringBuffer();
    for (int i=0; i<text.length(); i++)
    {
      if (Character.isUpperCase(text.charAt(i)))
      {
        char ch = (char)(((int)text.charAt(i) +
            s - 65) % 26 + 65);
        result.append(ch);
      }
      else
      {
        char ch = (char)(((int)text.charAt(i) +
            s - 97) % 26 + 97);
        result.append(ch);
      }
    }
    return result;
  }

  public static void main(String[] args) {

    boolean a = StringChallenge("Vin#1");
    System.out.println(a);
    String text = "ATTACKATONCE";
    int s = 3;
    System.out.println("Cipher: " + encrypt(text, s));
  }

}
