import java.util.Scanner;

public class tugas_week_6{

    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);
        double strukturData, pemograman, basisData, algoritma, rpl;
        
        System.out.println("Masukkan Nilai Struktur Data:");
        strukturData = go.nextDouble();
        System.out.println("Masukkan Nilai Pemograman Berorientasi Objek :");
        pemograman = go.nextDouble  ();
        System.out.println("Masukkan Nilai Basis Data :");
        basisData = go.nextDouble();
        System.out.println("Masukkan Nilai Algoritma dan Pemograman :");
        algoritma = go.nextDouble();
        System.out.println("Masukkan Nilai Rekayasa Perangkat Lunak :");
        rpl = go.nextDouble();

        double ipkSD, ipkPemograman, ipkBasisData, ipkAlgoritma, ipkRpl,rataipk;
        ipkSD = strukturData * 4 / 100;
        ipkPemograman = pemograman * 4 / 100;
        ipkBasisData = basisData * 4 / 100;
        ipkAlgoritma = algoritma * 4 /100;
        ipkRpl = rpl * 4 /100;
        rataipk = (ipkSD + ipkPemograman + ipkBasisData + ipkAlgoritma + ipkRpl) / 5;
        System.out.println("IPK Anda Adalah :" + rataipk);

        String predikat;
        if(rataipk >= 3.75){
            predikat = "A(Sangat Baik)";
            System.out.println("Predikat Anda Adalah :" + predikat);
        } else if (rataipk >= 3.50 && rataipk < 3.75){
            predikat = "AB(Baik Sekali)";
            System.out.println("Predikat Anda Adalah :" + predikat);
        } else if (rataipk >= 2.5 && rataipk < 3.50){
            predikat = "B(Baik)";
            System.out.println("Predikat Anda Adalah :" + predikat);
        } else if (rataipk >= 2.0 && rataipk < 2.5){
            predikat = "BC(Cukup Baik)";
            System.out.println("Predikat Anda Adalah :" + predikat);
        } else {
            predikat = "C(Kurang)";
            System.out.println("Predikat Anda Adalah :" + predikat);
        }

        if (predikat.equals("A(Sangat Baik)") || predikat.equals("AB(Baik Sekali)")) {
            System.out.println("Selamat Anda layak melanjutkan proses seleksi");
            System.out.println("Untuk melanjutkan proses seleksi, silahkan pilih mata kuliah yang ingin anda ambil:");
            System.out.println("1. Struktur Data");
            System.out.println("2. Pemograman Berorientasi Objek");
            System.out.println("3. Basis Data");
            System.out.println("4. Algoritma dn Pemograman");
            System.out.println("5. Rekayasa Perangkat Lunak");
            System.out.println("Silahkan Pilih Mata Kuliah dengan Nilai Diatas 75");
            System.out.println("Masukkan Pilihan Mata Kuliah Anda:(1/2/3/4/5)");
            int pilihan = go.nextInt();
            go.nextLine()

            switch (pilihan) {
                case 1:
                    if(strukturData >= 75){
                        System.out.println("Anda Lulus Seleksi Asisten Dosen Mata Kuliah Struktur Data");
                    } else {
                        System.out.println("Anda Tidak Lulus Seleksi Asisten Dosen Mata Kuliah Struktur Data");
                    }
                    break;
                case 2:
                    if(pemograman >= 75){
                        System.out.println("Anda Lulus Seleksi Asisten Dosen Mata Kuliah Pemograman Berorientasi Objek");
                    } else {
                        System.out.println("Anda Tidak Lulus Seleksi Asisten Dosen Mata Kuliah Pemograman Berorientasi Objek");
                    }
                    break;
                case 3:
                    if(basisData >= 75){       
                        System.out.println("Anda Lulus Seleksi Asisten Dosen Mata Kuliah Basis Data");
                    } else {
                        System.out.println("Anda Tidak Lulus Seleksi Asisten Dosen Mata Kuliah Basis Data");
                    }
                    break;
                case 4:
                    if(algoritma >= 75){
                        System.out.println("Anda Lulus Seleksi Asisten Dosen Mata Kuliah Algoritma dan Pemograman");
                    } else {
                        System.out.println("Anda Tidak Lulus Seleksi Asisten Dosen Mata Kuliah Algoritma dan Pemograman");
                    }
                    break;
                case 5:
                    if(rpl >= 75){
                        System.out.println("Anda Lulus Seleksi Asisten Dosen Mata Kuliah Rekayasa Perangkat Lunak");
                    } else {
                        System.out.println("Anda Tidak Lulus Seleksi Asisten Dosen Mata Kuliah Rekayasa Perangkat Lunak");
                    }
                default:
                    break;
            }

        } else {
            System.out.println("Anda Tidak lolos proses seleksi");
        }
    }
}