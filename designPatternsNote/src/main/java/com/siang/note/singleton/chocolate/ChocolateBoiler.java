package com.siang.note.singleton.chocolate;

public class ChocolateBoiler {
    private  boolean empty;
    private boolean boiled;
    // volatile 可讓其他執行緒讀取的值為正確，不必等待synchromized
    private volatile static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // double
    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
