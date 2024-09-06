//12S24008 - Rospika Sarah Yosefin Siregar
//12S24013 - Adryan Julianto Panjaitan

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        String judul;
        String namaPenulis;
        int tahunterbit;
        String penerbit;
        String formatbukupaperback;
        double hargapembelian;
        double minimummargin;
        int stok;
        double rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        namaPenulis = input.nextLine();
        tahunterbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbukupaperback = input.nextLine();
        hargapembelian = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + judul + "|" + namaPenulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukupaperback + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating);
    }
}

