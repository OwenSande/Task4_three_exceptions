package com.company;

public class Main {
    public static void g(int x) throws Exception1, Exception2, Exception3{
        if (x <  0) throw new Exception1("x <  0");
        if (x == 0) throw new Exception2("x == 0");
        if (x >  0) throw new Exception2("x >  0");

    }

    public static void main(String[] args) {
        try {
            g(-2);

        }catch (Exception1|Exception2|Exception3 e){
            e.printStackTrace(System.out);
            
        }

    }
}
