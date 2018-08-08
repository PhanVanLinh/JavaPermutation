package com.toong;

public class Permutation {

    public static void main(String[] args) {
        char[] str = new char[]{'1', '2'};
        int len = str.length;

        permute(str, 0, len - 1);
    }

    private static void permute(char[] str, int start, int end) {
        if (start == end) {
            System.out.print("result = ");
            System.out.println(str);
        } else {
            for (int i = start; i <= end; i++) {
//                System.out.print("before swap = start:" + start + " i=" + i + " end = " + end+ " ");
//                System.out.println(str);
                swap(str, start, i);
                System.out.print("before permute = start:" + start + " i=" + i + " end = " + end + " arr=");
                System.out.println(str);
                permute(str, start + 1, end);
//                System.out.print("after permute = start:" + start + " i=" + i + " end = " + end);
//                System.out.println(str);
                swap(str, start, i);
//                System.out.print("after swap = start:" + start + " i=" + i + " end = " + end);
//                System.out.println(str);
            }
        }
    }

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
