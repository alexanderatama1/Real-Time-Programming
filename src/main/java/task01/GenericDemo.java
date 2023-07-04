/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task01;

/**
 *
 * @author TripleA679
 */
abstract class Number {
    // Abstract class definition is not required for this task
}

class GenericDemo<T> {
    private T obj;

    public GenericDemo(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static <V extends Number> void genericMethod(double value) {
        System.out.println("Number is " + value);
    }
}
