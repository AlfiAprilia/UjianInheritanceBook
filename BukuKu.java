import java.util.Scanner;

public class BukuKu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih \n1. TextBook \n2. Novel");
        int pilihan = in.nextInt();
        in.nextLine();
        
        if(pilihan==1){
            System.out.println("Title : ");
            String title = in.nextLine();
            System.out.println("Subject : ");
            String subject = in.nextLine();
            System.out.println("Year : ");
            int year = in.nextInt();
            System.out.println("Price : ");
            double price = in.nextDouble();
            textBook TB1 = new textBook(title, year, price, subject);
            TB1.print();
            System.out.println("Tambah Biography? (1. ya 2. tidak)");
            int pilih2 = in.nextInt();
            in.nextLine();

            switch (pilih2) {
                case 1:
                    System.out.println("About: ");
                    String about = in.next();
                    Biography b1 = new Biography(title, year, price, about, subject);
                    b1.print();
                    break;

                case 2:
                    System.out.println("Tidak mau menambahkan Biography");
                    break;

                default:
                    System.out.println("Tidak ada pilihan");
                    break;
            }

        } else if(pilihan==2) {
            System.out.println("Title : ");
            String title = in.nextLine();
            System.out.println("Genre : ");
            String genre = in.nextLine();
            System.out.println("Year : ");
            int year = in.nextInt();
            System.out.println("Price : ");
            double price = in.nextDouble();
            in.nextLine();
            
            Novel NV1 = new Novel(title, year, price, genre);
            NV1.print();

        }else {
            System.out.println("Input salah");
        }

        in.close();
    }
}