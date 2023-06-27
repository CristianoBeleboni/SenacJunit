package com.company;

import java.util.Scanner;

public class PossitvoNegativo {

    public static String avalia(double n1){
        if (n1 > 0){
            return "positivo";
        }else if (n1 < 0){
            return "negativo";
        }else{
            return "Zero";
        }

    }

}

