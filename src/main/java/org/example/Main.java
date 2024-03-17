package org.example;
/*
Klavyeden sol alt ve sağ üst köşesinin koordinatları girilen dikdörtgene göre verilen nokta koordinatlarının bunun içinde olup olmadığını
kontrol eden program.
Sol alt köşenin koordinatlarını girin:          Sağ üst köşenin koordinatlarını girin:          Noktanın koordinatlarını girin:
Sol alt köşe x: -3                              Sağ üst köşe x: 3                               Nokta x: 0
Sol alt köşe y: -3                              Sağ üst köşe y: 3                               Nokta y: 0

Nokta dikdörtgenin içindedir.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y;
        double x1, x2; // <-- x1 ve x2 yer değiştirdi
        double y1, y2; // <-- y1 ve y2 yer değişti

        Scanner scanner = new Scanner(System.in);

        // Sol alt köşenin koordinatlarını alıyoruz
        System.out.println("Sol alt köşenin koordinatlarını girin:");
        System.out.print("Sol alt köşe x: ");
        x1 = scanner.nextDouble();
        System.out.print("Sol alt köşe y: ");
        y1 = scanner.nextDouble();

        // Sağ üst köşenin koordinatlarını alıyoruz
        System.out.println("Sağ üst köşenin koordinatlarını girin:");
        System.out.print("Sağ üst köşe x: ");
        x2 = scanner.nextDouble();
        System.out.print("Sağ üst köşe y: ");
        y2 = scanner.nextDouble();

        // Noktanın koordinatlarını alıyoruz
        System.out.println("Noktanın koordinatlarını girin:");
        System.out.print("Nokta x: ");
        x = scanner.nextDouble();
        System.out.print("Nokta y: ");
        y = scanner.nextDouble();

        if (isPointInRectangle(x1, y1, x2, y2, x, y)) {
            System.out.println("Nokta dikdörtgenin içindedir.");
        } else {
            System.out.println("Nokta dikdörtgenin dışındadır.");
        }
    }

    // Noktanın dikdörtgen içinde olup olmadığını kontrol et
    public static boolean isPointInRectangle(double x1, double y1, double x2, double y2, double x, double y) {
        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }
}