package com.toong;

public class Main {

    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j > i){
                    System.out.println(""+i+" "+j);
                }
            }
        }
    }
}
