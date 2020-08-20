package com.pcschool.ocp.d09.case1;

public class MyOuter {
    static int x = 200;
    int y = 100;

    MyStaticInner MyStaticInner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    class MyInner {
    // 一般內部類別
        public void print() {
            System.out.println("Print MyInner" + MyOuter.this.y + ", " + MyOuter.x);
        }
    }
    // 靜態內部類別
     static class MyStaticInner {
        public static void print() {
            System.out.println("Print MyStaticInner: " + MyOuter.x);
        }
    }
}
