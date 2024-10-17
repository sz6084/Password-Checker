import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password:");
        String pass = scan.nextLine();
        
        //System.out.println(ifUpperCase(pass)+""+ ifLowerCase(pass) +ifSpecial(pass) +ifNumber(pass));
        if(ifUpperCase(pass)&&ifLowerCase(pass)&&ifSpecial(pass)&&ifNumber(pass)&&true) {
            if(pass.length()>=12) {
                System.out.println("Strong password");
            } else if (pass.length()>=8) {
                System.out.println("Medium password");
            } else {
                System.out.println("Weak password");
            }
        } else {
            System.out.println("Weak password");
        }
    }
        
    public static boolean ifUpperCase(String pass) {
        for(int i=0;i<pass.length();i++) {
            String chr = pass.substring(i,i+1);
            int compare = ("Z").compareTo(chr);
            if (compare>=0 && compare<=25){
                return true;
            }
        }
        return false;
    }
    public static boolean checkRange(String a, String b, String test) {
        int compare_a = test.compareTo(a);
        int compare_b = test.compareTo(b);
        return compare_a >= 0 && compare_b <= 0;
    }
    public static boolean ifLowerCase(String pass) {
        boolean L = false;
        for(int i=0;i<pass.length();i++) {
            String chr = pass.substring(i,i+1);
            int compare = ("z").compareTo(chr);
            if (compare>=0 && compare<=25){
                L = true;
            }

        }
        return L;
    }
    public static boolean ifSpecial(String pass) {
        for(int i=0;i<pass.length();i++) {
            String chr = pass.substring(i,i+1);
            int compare = ("~").compareTo(chr); //unable to use null
            if (compare>=0 && compare<=3){
                return true;
            } else if (compare>=30 && compare<=35) {
                return true;
            } else if (compare>=70 && compare<=65) {
                return true;
            } else if (compare>=79 && compare<=93) {
                return true;
            }
        }
        return false;
    }
    public static boolean ifNumber(String pass) {
        for(int i=0;i<pass.length();i++) {
            String chr = pass.substring(i,i+1);
            int compare = (chr).compareTo(" ");
            if (compare>=16 && compare<=25){
                return true;
            }
        }
        return false;
    }
}

