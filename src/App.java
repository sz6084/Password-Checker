import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password:");
        String pass = scan.nextLine();
        
        
        System.out.println(ifUpperCase(pass) == true && ifLowerCase(pass) == true && ifSpecial(pass) == true && ifNumber(pass) == true);
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
        boolean U = false;
        for(int i=0;i<pass.length();i++) {
            String chr = pass.substring(i,i+1);
            int compare = ("Z").compareTo(chr);
            if (compare>=0 && compare<=25){
                U = true; // get rid of flag?
            }
        }
        return U;
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
            int compare = (chr).compareTo(" "); //unable to use null
            if (compare>=123 && compare<=126){
                return true;
            } else if (compare>=91 && compare<=96) {
                return true;
            } else if (compare>=58 && compare<=61) {
                return true;
            } else if (compare>=33 && compare<=47) {
                return true;
            }
        }
        return false;
    }
    public static boolean ifNumber(String pass) {
        for(int i=0;i<pass.length();i++) {
            String chr = pass.substring(i,i+1);
            int compare = (chr).compareTo(null);
            if (compare>=48 && compare<=57){
                return true;
            }
        }
        return false;
    }
}

