package Kalkulator;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean Continue = true;
        int a;
        float a1, a2, hasil;
        String text;
        while (Continue) {
            System.out.println("-- KALKULATOR SEDERHANA --");
            System.out.println("");
            System.out.println("1. (+) Tambah");
            System.out.println("2. (-) Kurang");
            System.out.println("3. (x) Kali");
            System.out.println("4. (/) Bagi");
            System.out.println("5. (%) Sisa Hasil Bagi");
            System.out.print("Masukkan pilihan anda : ");
            a = input.nextInt();

            if (a == 1) {
                text = "+";
            } else if (a == 2) {
                text = "-";
            } else if (a == 3) {
                text = "x";
            } else if (a == 4) {
                text = "/";
            } else if (a == 5) {
                text = "%";
            } else {
                text = "Tidak ada";
                System.out.println("tidak ada pilihannya");
                System.exit(0);
            }

            System.out.println("anda memilih aritmatika " + text);

            System.out.print("Masukkan angka pertama : ");
            a1 = input.nextFloat();
            System.out.print("Masukkan angka kedua : ");
            a2 = input.nextFloat();

            if (text.equals("+")) {
                hasil = a1 + a2;
            } else if (text.equals("-")) {
                hasil = a1 - a2;
            } else if (text.equals("x")) {
                hasil = a1 * a2;
            } else if (text.equals("/")) {
                hasil = a1 / a2;
            } else if (text.equals("%")) {
                hasil = a1 % a2;
            } else {
                hasil = 0;
            }

            System.out.println(a1 + " " + text + " " + a2 + " = " + hasil);

            System.out.print("apakah ingin kembali lagi (y/n) : ");
            char pilih = input.next().charAt(0);
            if (pilih != 'y') { 
                Continue = false;
            }
        }
        
        input.close();
    }
}