import java.util.Scanner;

public class tugas_week_6{

    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);
        double strukturData, pemograman, basisData, algoritma, rpl, ipk;
        
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
    }
}