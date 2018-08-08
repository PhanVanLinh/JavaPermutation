package com.toong;

public class Permutation {

    public static void main(String[] args) {
        char[] str = new char[]{'1', '2', '3'};
        int len = str.length;

        Permutation permutation = new Permutation();
        permutation.permute(str, 0, len - 1);
    }

    private void permute(char[] str, int start, int end) {
        if (start == end)
            System.out.println(str);
        else {
            for (int i = start; i <= end; i++) {
                swap(str, start, i);
                permute(str, start + 1, end);
                swap(str, start, i);
            }
        }
    }

    private void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
