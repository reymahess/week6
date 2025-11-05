import java.util.Scanner;

public class tugas_week_6{

    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);
        double strukturData, pemograman, basisData, algoritma, rpl;
        
        System.out.println("Masukkan Nilai Struktur Data:");
        strukturData = go.nextDouble();
        System.out.println("Masukkan Nilai Pemograman :");
        pemograman = go.nextDouble  ();
        System.out.println("Masukkan Nilai Basis Data :");
        basisData = go.nextDouble();
        System.out.println("Masukkan Nilai Algoritma :");
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
    }
}