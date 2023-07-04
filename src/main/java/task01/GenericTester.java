/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task01;

/**
 *
 * @author TripleA679
 */
public class GenericTester {
    public static void main(String[] args) {
        // Create an instance of GenericDemo with String type
        GenericDemo<String> testString = new GenericDemo<>("Test String");
        System.out.println("Value of testString: " + testString.getObj());

        // Create an instance of GenericDemo with Integer type
        GenericDemo<Integer> testInteger = new GenericDemo<>(32);
        System.out.println("Value of testInteger: " + testInteger.getObj());

        // Call the static genericMethod with a Double value
        GenericDemo.genericMethod(55.7);
    }
}
