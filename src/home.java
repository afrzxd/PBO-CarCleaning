

import java.util.ArrayList;
import java.util.Scanner;

public class home {
    //static ArrayList<Pemesanan> Pemesanan = new ArrayList<Pemesanan>();
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        Pemesanan Pemesanan = new Pemesanan();
        Transaksi Transaksi = new Transaksi();
        
        System.out.println("---------------------------------------");
        System.out.println("CarCleaning.... Anda pesan kami datang");
        System.out.println("------------------|||-------------------\n");
        

        System.out.print("Masukkan Nama : ");
        //Pemesanan.nama = sc.nextLine();
        Pemesanan.setNama(sc.nextLine());
        System.out.print("Masukkan Alamat : ");
        Pemesanan.setAlamat(sc.nextLine());
        System.out.print("Masukkan No. Tlp : ");
        Pemesanan.setTelpon(sc.nextLine());
        System.out.print("Masukkan Email : ");
        Pemesanan.setEmail(sc.nextLine());

        
        /*
         *@author muhamad afriza
         */
        Transaksi.viewjasa();

        do{
            System.out.print("\nPilih Jasa : ");
            int jasa = sc.nextInt();
            if( jasa >= 1 && jasa <=3){
                Transaksi.setJasa(jasa);
                break;
            }else{

            }
        }while(true);

        Transaksi.viewteam();
        do{
            System.out.print("\nPilih Team : ");
            int team = sc.nextInt();
            if(team >= 1 && team <=3){
                Transaksi.team = team;
                break;
            }else{

            }
        }while(true);
        sc.nextLine();
        System.out.println("\nBerikan Keterangan Pemesanan : ");
        Pemesanan.setKeterangan(sc.nextLine());
        

        System.out.print("\n\nMasukkan Biaya Penyedia Jasa     : Rp.");
        int bPenyedia = sc.nextInt();
        System.out.print("Masukkan Biaya Jasa Alat         : Rp.");
        int bJasa = sc.nextInt();
        System.out.print("Masukkan Bahan Jasa              : Rp.");
        int bBahan = sc.nextInt();
        System.out.print("Masukkan Biaya Transportasi      : Rp.");
        int bTrans = sc.nextInt();

        //fungsinya
        String cust = Pemesanan.getNama();
        String alamat = Pemesanan.getAlamat();
        String telpon = Pemesanan.getTelpon();
        String email = Pemesanan.getEmail();
        Double biayajasa = Transaksi.getBiayaJasa();
        Double biayateam = Transaksi.getBiayaTim();
        String pesanjasa = Transaksi.getJasa();
        String potong = Transaksi.getTeam();
        String[] dipotong = potong.split("\\[");
        String tim = dipotong[0].trim();
        String keterangan = Pemesanan.getKeterangan();
        int total = bBahan+bJasa+bPenyedia+bTrans;

        //ouput
        System.out.println("\n------------------|||-------------------");
        System.out.println("========================================\n");
        
        System.out.println("Informasi Pemesan");
        System.out.println("Nama Pemesan       :     "+cust);
        System.out.println("Alamat Pemesan     :     "+alamat);
        System.out.println("Telpon Pemesan     :     "+telpon);
        System.out.println("Email Pemesan      :     "+email);
        System.out.println("Biaya Jasa         :     "+biayajasa);
        System.out.println("Biaya Team         :     "+biayateam);
        
        System.out.println("\nJasa yang dipesan  :     "+pesanjasa);
        System.out.println("Nama Penyedia Jasa :     "+tim);
        System.out.println("Keterangan         :     "+keterangan);
        System.out.println("\nTotal biaya yang di bayar pemesan : Rp."+total);
        
        System.out.println("\n===== Salam Bersih "+cust+" Terimakasih =====");
    }
}
