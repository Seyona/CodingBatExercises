/**
 * Contains all my solutions with coding bat
 */
public class String1 {

    public String helloName(String name) {
        return "Hello "+name+"!";
    }

    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+ word + out.substring(2,4);
    }

    public String extraEnd(String str) {
        String pie = ""+str.charAt(str.length()-2)+str.charAt(str.length()-1)+"";
        return pie+pie+pie;
    }

    public String firstTwo(String str) {
        if(str.length() > 2)return ""+str.charAt(0)+str.charAt(1)+"";return str;
    }

    public String firstHalf(String str) {
        return ""+str.substring(0,str.length()/2)+"";
    }

    public String withoutEnd(String str) {
        return ""+str.substring(1,(str.length()-1));
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()) return a+b+a;
        return b+a+b;
    }

    public String nonStart(String a, String b) {
        return a.substring(1,a.length())+b.substring(1,b.length());
    }

    public String left2(String str) {
        String holdStr = str;
        if(str.length() > 2){
            str =""+ str.substring(2,str.length());
            return str+holdStr.substring(0,2);
        }

        return str;
    }

    public String right2(String str) {
        String holdStr = str;
        if(str.length() > 2) {
            str = ""+str.substring(0,str.length()-2);
            return holdStr.substring(holdStr.length()-2, holdStr.length())+str;
        }
        return  str;
    }

    public String theEnd(String str, boolean front) {
        if(front) return str.substring(0,1);return str.substring(str.length()-1);

    }

    public String withouEnd2(String str) {
        if(str.length()>2)return str.substring(1,str.length()-1);
        return "";
    }

    public String middleTwo(String str) {
        return str.substring((str.length()/2)-1,(str.length()/2)+1);
    }

    public boolean endsLy(String str) {
        if(str.length() > 1)return(str.substring(str.length()-2,str.length()).equals("ly"));
        return false;
    }

    public String nTwice(String str, int n) {
        return (str.substring(0,n)+str.substring(str.length()-n,str.length()));
    }

    public String twoChar(String str, int index) {
        if (index > str.length()-2 || index < 0) return str.substring(0,2);
        return str.substring(index,index+2);
    }

    public String middleThree(String str) {
        while (str.length() != 3) {
            str=str.substring(1,str.length()-1);
        }
        return str;
    }

    public boolean hasBad(String str) {
        if(!(str.length() >2)) {
            return false;
        }

        if(str.length() == 3) {
            return str.substring(0,3).equals("bad");
        }
        return str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad");
    }

    public String atFirst(String str) {
        if(str.equals("")) return "@@";
        if(str.length() <= 1) return str+"@";
        return str.substring(0,2);
    }

    public String lastChars(String a, String b) {
        if (!(a.equals("") || b.equals("")))return ""+a.charAt(0)+b.charAt(b.length()-1);
        if(a.equals("") && b.equals("")) return "@@";
        if(a.equals("")) return "@"+b.charAt(b.length()-1);
        return ""+a.charAt(0)+"@";
    }

    public String conCat(String a, String b) {
        if(a.equals(""))return b;
        if(b.equals("")) return a;
        if(a.charAt(a.length()-1) == b.charAt(0)) return a.substring(0,a.length()-1)+b;
        return a+b;
    }

    public String lastTwo(String str) {
        if(str.length() <= 1) return str;
        char holdLastChar = str.charAt(str.length()-1);
        char hold2ndLastChar = str.charAt((str.length()-2));
        return  str.substring(0,str.length()-2) +holdLastChar +hold2ndLastChar;
    }

    public String seeColor(String str) {
        if(str.length() < 3) return"";
        if(str.substring(0,3).equals("red")) return "red";
        if(str.length() < 4) return"";
        if(str.substring(0,4).equals("blue")) return "blue";
        return "";
    }

    public boolean frontAgain(String str) {
        if(str.length() < 2) return false;
        String start = ""+str.charAt(0)+str.charAt(1);
        String end = ""+str.charAt(str.length()-2)+str.charAt(str.length()-1);
        return start.equals(end);
    }

    public String minCat(String a, String b) {
        if(a.length() > b.length()) return a.substring(a.length()-b.length(), a.length()) + b;
        return a+b.substring(b.length()-a.length(),b.length());
    }

    public String extraFront(String str) {
        if(str.length() >= 2) return str.substring(0,2) +str.substring(0,2) +str.substring(0,2);
        return str+str+str;
    }

    public String without2(String str) {
        if(str.length() == 2) return "";
        if(str.length() <= 1) return  str;
        if(str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) return str.substring(2,str.length());
        return str;
    }

    public String deFront(String str) {
        if(str.charAt(0) == 'a'){
            if(str.charAt(1) == 'b') return str;
            return ""+str.charAt(0)+str.substring(2,str.length());
        }
        if (str.charAt(1) == 'b') return str.substring(1,str.length());
        return str.substring(2,str.length());
    }

    public String startWord(String str, String word) {
        if(str.equals("")) return "";

        if(str.length() >= word.length())if(str.substring(1,word.length()).equals(word.substring(1,word.length()))) return str.substring(0,word.length());
        return "";
    }

    public String withoutX(String str) {

        if(str.length() == 1 && str.charAt(0) == 'x') {
            return "";
        }
        if(str.equals("")) return str;

        if(str.charAt(0) == 'x' || str.charAt(str.length()-1) == 'x') {
            if(str.startsWith("x")&&str.endsWith("x")) {
                return str.substring(1,str.length()-1);
            }  else if(str.startsWith("x")) {
                return str.substring(1,str.length());
            }else {
                return str.substring(0,str.length()-1);
            }
        }else {
            return str;
        }
    }

    public String withoutX2(String str) {
        if(str.length() >1) {
            if(str.charAt(0) == 'x' && str.charAt(1) != 'x' ) {
                return str.substring(1,str.length());
            }else if(str.charAt(0) == 'x' || str.charAt(1) =='x') return str.replace("x","");
            return str;
        }else {
            return "";
        }
    }



}
