package oop;

import java.util.ArrayList;
import java.util.Scanner;

class MyGenerics<T1>{
    int val =344;
    private T1 t1;

    public MyGenerics(int val,T1 t1){
        this.val=val;
        this.t1=t1;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

public class Generics_110 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);
//        arrayList.add(new Scanner((System.in)));
        int a = arrayList.get(0);
//        System.out.println(a);
        MyGenerics<String> g1 = new MyGenerics(23 ,"Mystring is my string");
        String str = g1.getT1();
        System.out.println(str);
    }
}
