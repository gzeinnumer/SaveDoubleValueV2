# SaveDoubleValueV2

```java
Log.d(TAG, "onCreate: "+saveDoubleText("5,0000")); //5
Log.d(TAG, "onCreate: "+saveDoubleText("5,1000")); //5.1
Log.d(TAG, "onCreate: "+saveDoubleText("5,1200")); //5.12
Log.d(TAG, "onCreate: "+saveDoubleText("5,1230")); //5.123
Log.d(TAG, "onCreate: "+saveDoubleText("5,1234")); //5.1234
Log.d(TAG, "onCreate: "+saveDoubleText("5,0004")); //5.0004
Log.d(TAG, "onCreate: "+saveDoubleText("5,0034")); //5.0034

Log.d(TAG, "onCreate: "+saveDoubleText("0,0000")); //0
Log.d(TAG, "onCreate: "+saveDoubleText("0,1000")); //0.1
Log.d(TAG, "onCreate: "+saveDoubleText("0,1200")); //0.12
Log.d(TAG, "onCreate: "+saveDoubleText("0,1230")); //0.123
Log.d(TAG, "onCreate: "+saveDoubleText("0,1234")); //0.1234

Log.d(TAG, "onCreate: "+saveDoubleText("0,00000000")); //0
Log.d(TAG, "onCreate: "+saveDoubleText("0,10000000")); //0.1
Log.d(TAG, "onCreate: "+saveDoubleText("0,02000000")); //0.02
Log.d(TAG, "onCreate: "+saveDoubleText("0,00300000")); //0.003
//  Log.d(TAG, "onCreate: "+saveDoubleText("0,00040000")); //4.0E-4
//  Log.d(TAG, "onCreate: "+saveDoubleText("0,00005000")); //#0.00000000 change pola 5.0E-5
//  Log.d(TAG, "onCreate: "+saveDoubleText("0,00000600")); //#0.00000000 change pola 6.0E-6
//  Log.d(TAG, "onCreate: "+saveDoubleText("0,00000070")); //#0.00000000 change pola 7.0E-7
//  Log.d(TAG, "onCreate: "+saveDoubleText("0,00000008")); //#0.00000000 change pola 8.0E-8

Log.d(TAG, "onCreate: "+saveDoubleText("1234,5678")); //1234.5678

Log.d(TAG, "onCreate: "+saveDoubleText("1234,5678.00")); //1234.5678
Log.d(TAG, "onCreate: "+saveDoubleText("1234,5678.1")); //1234.5678
Log.d(TAG, "onCreate: "+saveDoubleText("1234,5678.01")); //1234.5678
```

```java
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
```

---

```
Copyright 2022 M. Fadli Zein
```