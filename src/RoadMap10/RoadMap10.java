package RoadMap10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RoadMap10 {
    public static void main(String[] args) {
        int massiv[] = new int[99];
        ArrayList myVar = new ArrayList();

        for (int i = 0; i < 99; i++) {
            massiv[i] = i + 2;
        }


        for (int i =0; i<99;i++) {
            Prostoe_method one = new Prostoe_method();
            if (one.isprime(massiv[i])==1){
                myVar.add(massiv[i]);

            }
        }

        System.out.println(myVar);
    }}

