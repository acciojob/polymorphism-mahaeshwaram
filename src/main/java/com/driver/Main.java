package com.driver;

public class Main {
    public static class Product {
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public int product(int x,int y){
            return x*y;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(44,90));
        System.out.println(p.product(23,3445,67));
        System.out.println(p.product(23.3,34.7));

    }

}