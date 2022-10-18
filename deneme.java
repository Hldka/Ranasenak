import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("gecerli sifrenzi giriniz");
        String psw = scan.next();
        if (psw.length()>7 &&
                psw.replaceAll("[\\w]","").length()>0 &&
                psw.replaceAll("[^a-z]", "").length()>0 &&
                psw.replaceAll("[^A-Z]","").length()>0)
        {
            System.out.println("SIFERNIZ GECERLI");
        }else
        {
            System.out.println("gecerli gir didim");
        }

        do
        {
            System.out.println("gecerli sifrenzi giriniz");
            psw = scan.next();
        }
        while(!(psw.length()>7 &&
                psw.replaceAll("[\\w]","").length()>0 &&
                psw.replaceAll("[^a-z]", "").length()>0 &&
                psw.replaceAll("[^A-Z]","").length()>0));
        System.out.println("gecerli");
    }
}
