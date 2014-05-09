/**
 * one loop
 */
public class String2 {

    public String doubleChar(String str) {
        String out = "";
        for(int i = 0; i < str.length(); i++) {
            out += str.charAt(i)+ ""+str.charAt(i);
        }
        return out;
    }

    public int countHi(String str) {
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i') {
               x++;
            }
        }
        return x;
    }

    public boolean catDog(String str) {
          int cat = 0;
          int dog = 0;
          for(int i = 0; i < str.length()-2; i++) {
              if (str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't') {
                cat++;
              }
              if (str.charAt(i) == 'd' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g') {
                  dog++;
              }
          }
        return dog == cat;
    }

    public int countCode(String str) {
        int code = 0;
        for(int i = 0; i < str.length()-3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e') {
                code++;
            }
        }
        return code;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() < b.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }

        return a.substring(a.length()-b.length(),a.length()).equals(b);
    }




}
