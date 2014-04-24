/**
 * My Solutions to coding bat Logic-1 Problems
 */
public class Logic1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if ((cigars >= 40)&&(cigars <= 60) || ((cigars > 60)&&(isWeekend == true)) ) {
            return true;
        }else {
            return false;
        }
    }

    public int dateFashion(int you, int date) {
        if ((you <= 2) || (date <= 2))  {
            return 0;
        }else if ((you >= 8)||(date >= 8)){
            return 2;
        }else {
            return 1;
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if ((temp >= 60 && temp <= 100)&&(isSummer == true)) {
            return true;
        }else if ((temp >= 60 && temp <= 90)&&(isSummer == false)) {
            return true;
        }else {
            return false;
        }
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if((speed <= 60)|| (((speed <= 65))&&(isBirthday == true)) ) {
            return 0;
        }else if ((speed > 60)&& (speed <= 80)||((speed <= 85)&&(isBirthday == true))) {
            return 1;
        }else {
            return 2;
        }
    }

    public int sortaSum(int a, int b) {
        if (a + b < 10){
            return a + b;
        }else if (a + b < 20){
            return 20;
        }else{
            return a + b;
        }
    }


    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if(day >= 1 && day != 6) {
                return "10:00";
            }else {
                return "off";
            }
        }else if (day >=1 && day!= 6) {
            return "7:00";
        }else {
            return "10:00";
        }

    }

    public boolean love6(int a, int b) {
        int sum = a + b;
        int diff = a - b;

        diff = Math.abs(diff);

        if ((sum == 6 )|| (diff == 6)) {
            return true;
        }else if (a == 6 || b == 6) {
            return true;
        }else {
            return false;
        }


    }

    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode){
            return ( n <= 1 || n >= 10);
        }else {
            return (n >= 1 && n <= 10);
        }


    }

    public boolean specialEleven(int n) {
        if (n % 11 == 0 || (n-1) % 11 == 0) return true;
        return false;
    }

    public boolean more20(int n) {
        if ((n-1) % 20 == 0 || (n-2) % 20 == 0) return true;
        return false;
    }

    public boolean old35(int n) {
        if(n % 3 == 0 && n % 5 == 0) return false;
        if(n % 3 == 0 || n % 5 == 0) return true;
        return false;
    }

    public boolean less20(int n) {
        if((n+1) % 20 == 0 || (n+2) % 20 == 0)return true;
        return false;
    }

    public boolean nearTen(int num) {
        int a = num  % 10;
        int b = 10 - a;

        if (a <= 2 || b <= 2) {
            return true;
        }else {
            return false;
        }
    }

    public int teenSum(int a, int b) {
        int sum = a + b;
        if ( (a >= 13 && a <= 19)|| (b >=13 && b <=19)) {
            return 19;
        }else {
            return sum;
        }

    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }else if(isMorning && isMom) {
            return true;
        }else if (isMorning){
            return false;
        }else {
            return true;
        }
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }else if (tea >= candy*2 || candy >= tea*2) {
            return 2;
        }else {
            return 1;
        }
    }

    public String fizzString(String str) {
        if(str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b') return "FizzBuzz";
        if(str.charAt(0) == 'f') return "Fizz";
        if(str.charAt(str.length()-1) == 'b') return "Buzz";
        return str;
    }


    public String fizzString2(int n) {
        if (n % 5 == 0 && n % 3 == 0){
            return "FizzBuzz!";
        }else if (n % 3 == 0) {
            return "Fizz!";
        }else if (n % 5 == 0)  {
            return "Buzz!";
        }else {
            return ""+n+"!";
        }
    }

    public boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || b + c == a || c + a == b) {
            return true;
        }else {
            return false;
        }
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(!bOk){
            if (b > a && c > b) {
                return true;
            }else {
                return false;
            }
        }else {
            if (c > b){
                return true;
            }else {
                return false;
            }
        }
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            if(a <= b && b <= c) {
                return true;
            }else {
                return false;
            }
        }else{
            if(a < b && b < c) {
                return true;
            }else {
                return false;
            }
        }
    }


}
