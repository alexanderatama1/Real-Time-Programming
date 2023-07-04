/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task04;

/**
 *
 * @author TripleA679
 */
abstract class StockItem {
    protected String name;
    protected String code;
    protected double unitPrice;
    protected long numberOfUnits;

    public StockItem(String name, String code, double unitPrice, long numberOfUnits) {
        this.name = name;
        this.code = code;
        this.unitPrice = unitPrice;
        this.numberOfUnits = numberOfUnits;
    }

    public abstract double stockValue();
}

interface Foodstuff {
    long totalVolume();
}

class Beverage extends StockItem implements Foodstuff {
    private long volumeInML;

    public Beverage(String name, String code, double unitPrice, long numberOfUnits, long volumeInML) {
        super(name, code, unitPrice, numberOfUnits);
        this.volumeInML = volumeInML;
    }

    @Override
    public double stockValue() {
        return unitPrice * numberOfUnits;
    }

    @Override
    public long totalVolume() {
        return numberOfUnits * volumeInML;
    }
}
