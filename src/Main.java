import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password,question,newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("Hadwyn") && password.equals("Morales")) {
            System.out.println("Başarıyla Giriş Yaptınız !");
        }else{
            System.out.println("Kullanıcı adınız veya şifreniz hatalı.");

            System.out.println("Şifrenizi yenilemek isterseniz \"Evet\" yazınız.");
            question = inp.nextLine();

            if (question.equals("Evet")) {
                System.out.println("Yeni Şifrenizi Giriniz :");
                newPassword = inp.nextLine();

                if (userName.equals("Hadwyn") && password.equals(newPassword)) ;
                System.out.println("Şifreniz Başarıyla Yenilendi");

                System.out.print("Kullanıcı Adınız : ");
                userName = inp.nextLine();

                System.out.print("Şifreniz : ");
                newPassword = inp.nextLine();
                if (userName.equals("Hadwyn") && password.equals(newPassword)) {
                    System.out.println("Başarıyla Giriş Yaptınız !");

            }else{
                System.out.println("Kullanıcı adınız veya şifreniz hatalı.");

            }

            }



        else{
                System.out.println("Hatalı şekilde yazdınız.");
            }
        }


    }
}
