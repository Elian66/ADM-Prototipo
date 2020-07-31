package com.nightprowler.termos;

import android.graphics.Bitmap;

public class Common {
    public static String USER_NAME;
    public static String USER_CPF;
    public static String USER_MATRICULA;
    public static Bitmap USER_SIGNATURE;

    public static String convertMonth(String model){
        if (model.equals("1")){
            return "janeiro";
        }
        if (model.equals("2")){
            return "fevereiro";
        }
        if (model.equals("3")){
            return "março";
        }
        if (model.equals("4")){
            return "abril";
        }
        if (model.equals("5")){
            return "maio";
        }
        if (model.equals("6")){
            return "junho";
        }
        if (model.equals("7")){
            return "julho";
        }
        if (model.equals("8")){
            return "agosto";
        }
        if (model.equals("9")){
            return "setembro";
        }
        if (model.equals("10")){
            return "outubro";
        }
        if (model.equals("11")){
            return "novembro";
        }
        if (model.equals("12")){
            return "dezembro";
        }
        else {
            return "X";
        }
    }
}
