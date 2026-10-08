import java.util.Scanner;

public class StudiKasus222 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

     System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine();

         // Pilihan bercabang ( nested IF ) sesuai jenis kegiatan
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();

            System.out.print("Peringkat juara : ");
            int juara = sc.nextInt();

            // Pengecekan kelengkapan dokumen
            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                // Dokumen lengkap, cek peringkat juara
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (Juara Harapan / peserta tidak mendapat dana).");
                }
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusLolos = sc.nextInt();

            // Pengecekan kelengkapan dokumen
            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                // Dokumen lengkap, cek status lolos pendanaan
                if (statusLolos == 1) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.");
                }
            }

        } else {
            // Jenis kegiatan Lainnya / tidak terdaftar
            System.out.println("Status : Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan.");
        }

        sc.close();
    }
}
    
       

    

