import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String pilihan;
        Scanner input = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Pilih menu yang ingin anda lakukan");
        System.out.println("1. Termo Gun");
        System.out.println("2. Harga Baju");
        System.out.println("3. Kata");
        System.out.println("==================================================");

        switch (pilihan = input.nextLine()) {
            case "1":
                System.out.println("==================================================");
                System.out.println("Matrix Transpose");
                System.out.println("==================================================");
                System.out.println("Suhu dalam celcius : ");
                System.out.println("==================================================");
                int suhu_awal = input.nextInt();
                System.out.println("==================================================");
                if(suhu_awal < 37){
                    System.out.println("Normal");
                }else{
                    System.out.println("Panas");
                }
                
                break;
            case "2":
                String Merek;
                String Ukuran;
                System.out.println("==================================================");
                System.out.println("Harga Baju");
                System.out.println("==================================================");
                System.out.println("Merek : ");
                Merek = input.nextLine();
                System.out.println("Ukuran : ");
                Ukuran = input.nextLine();
                System.out.println("==================================================");
                if(Merek.equals("A") && Ukuran.equals("S")){
                    System.out.println("Rp. 50.000");
                }else if(Merek.equals("A") && Ukuran.equals("M")){
                    System.out.println("Rp. 75.000");
                }else if(Merek.equals("A") && Ukuran.equals("XL")){
                    System.out.println("Rp. 100.000");
                }else if(Merek.equals("B") && Ukuran.equals("S")){
                    System.out.println("Rp. 100.000");
                }else if(Merek.equals("B") && Ukuran.equals("M")){
                    System.out.println("Rp. 200.000");
                }else if(Merek.equals("B") && Ukuran.equals("XL")){
                    System.out.println("Rp. 300.000");
                }
            
                break;
            case "3":
                System.out.println("==================================================");
                System.out.println("kata");
                System.out.println("==================================================");
                String kalimat ="Saya Adalah Mahasiswa Universitas Terbuka";
                String ubah;
                int jumlahkata;
                System.out.println("kalimat sebelum :" + kalimat);
                ubah = kalimat.replace('a','A');
                System.out.println("kalimat setelah :" + ubah);
                jumlahkata = ubah.length();
                System.out.println("jumlah kata :" + jumlahkata);
                if(jumlahkata % 2 == 0){
                    System.out.println("jumlah kata genap");
                }else{
                    System.out.println("jumlah kata ganjil");
                }
                System.out.println("==================================================");

                break;

        }
        
    }
}
