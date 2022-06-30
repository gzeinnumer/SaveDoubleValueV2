package com.gzeinnumer.savedoublevaluev2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GblFunction {

    public static String saveDoubleText(String value){
        if (value.contains(".")){
            value = value.substring(0, value.indexOf("."));
        }
        String pola = "#0,00000000";
        if (!pola.contains(","))
            return "0";
        if (value.equals("0,0")){
            return "0";
        }
        if (Double.parseDouble(value)==0){
            return "0";
        }
        NumberFormat format = new DecimalFormat(pola);
        String finalData = String.valueOf((double) Double.parseDouble(format.format((double) Double.parseDouble(value))));

        String[] split = pola.split("\\.",-1);
        if (split.length==0){
            return "0";
        }

        String[] formatDecimal =split[1].split("");
        if (formatDecimal.length==0){
            return "0";
        } else {
            for (String d : formatDecimal) {
                if (finalData.endsWith(","+d))
                    finalData = finalData.replace(","+d,"");
            }
            for (String d : formatDecimal) {
                if (finalData.endsWith(d))
                    finalData = finalData.replace(d,"");
            }
            if (finalData.endsWith(",0")){
                finalData = finalData.replace(",0","");
            }
            return  finalData;
        }
    }
}
