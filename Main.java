package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       int[] nums = new int[10];
       Scanner teclado = new Scanner(System.in);
       for (int i = 0; i < nums.length; i++) {
           System.out.println("Dime un numero");
           nums[i] = teclado.nextInt();
       }
       Arrays.sort(nums);
       System.out.println("El més petit és "+nums[0]+" i el més gran "+nums[nums.length]));
   }
}

