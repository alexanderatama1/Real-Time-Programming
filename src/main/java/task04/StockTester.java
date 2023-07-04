/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task04;

/**
 *
 * @author TripleA679
 */
public class StockTester {
    public static void main(String[] args) {
        Beverage beverage = new Beverage("Coffee in a Can", "P48575", 3.5, 40, 200);

        System.out.println("Name: " + beverage.name);
        System.out.println("Code: " + beverage.code);
        System.out.println("Stock Value: $" + beverage.stockValue());
        System.out.println("Total Volume: " + beverage.totalVolume() + " mL");
    }
}

