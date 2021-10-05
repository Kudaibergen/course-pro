package com.kay.pro;

public class JavaTest {
    static int i0;
    static long l0;
    static float f0;
    static double d0;
    static String s0;
    static boolean b0;

    public static void main(String[] args) {

//        System.out.println("i0 -> " + i0);
//        System.out.println("l0 -> " + l0);
//        System.out.println("f0 -> " + f0);
//        System.out.println("d0 -> " + d0);
//        System.out.println("s0 -> " + s0);
//        System.out.println("b0 -> " + b0);

        int i1 = 5;
        int i2 = new Integer(5);
        Integer i3 = new Integer(5);
        int i4 = 127;
        int i5 = new Integer(127);
        int i6 = new Integer(129);
        int i7 = new Integer(129);
        Integer i8 = new Integer(3008);
        Integer i9 = new Integer(3008);
        long l1 = 5L;
        long l2 = new Long(5);
        boolean boo = false;

//        System.out.println("i1 == i2 -> " + (i1 == i2));
//        System.out.println("i1 == i3 -> " + (i1 == i3));
//        System.out.println("i4 == i5 -> " + (i4 == i5));
//        System.out.println("i6 == i7 -> " + (i6 == i7));
//        System.out.println("i8 == i9 -> " + (i8 == i9));
//        System.out.println("i8 eq i9 -> " + (i8.equals(i9)));

        String s1 = "xxx";
        String s2 = "xxx";
        String s3 = new String("xxx").intern();
        String s4 = new String("xxx3").intern();
        System.out.println("s1 == s2 -> " + (s1 == s2));
        System.out.println("s3 == s4 -> " + (s3 == s4));
        System.out.println("s1 == s3 -> " + (s1 == s3));
        System.out.println("s3 eq s4 -> " + (s3.equals(s4)));

        // преобразование
        byte b = 3;
        int i10 = b;

        int i11 = 100_000;
        byte b1 = (byte) i11;

        // nullable
        String s5 = "null";
        String msg;
        if (s5 != null) {
            msg = s5.length() + "";
        } else {
            msg = "variable is null";
        }
        System.out.println(msg);

    }
}