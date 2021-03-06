package oop2.module03.abcd;

class Box<T> {
    private T val;

    public void setValue(T val) {
        this.val = val;
    }

    public T getValue() {
        return val;
    }
}