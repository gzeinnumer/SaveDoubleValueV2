package com.gzeinnumer.savedoublevaluev2;

import static com.gzeinnumer.savedoublevaluev2.GblFunction.saveDoubleText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "afafafasfaasf";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
//        Log.d(TAG, "onCreate: "+saveDoubleText("0,00040000")); //4.0E-4
//        Log.d(TAG, "onCreate: "+saveDoubleText("0,00005000")); //#0.00000000 change pola 5.0E-5
//        Log.d(TAG, "onCreate: "+saveDoubleText("0,00000600")); //#0.00000000 change pola 6.0E-6
//        Log.d(TAG, "onCreate: "+saveDoubleText("0,00000070")); //#0.00000000 change pola 7.0E-7
//        Log.d(TAG, "onCreate: "+saveDoubleText("0,00000008")); //#0.00000000 change pola 8.0E-8

        Log.d(TAG, "onCreate: "+saveDoubleText("1234,5678")); //1234.5678

        Log.d(TAG, "onCreate: "+saveDoubleText("1234,5678.00")); //1234.5678
        Log.d(TAG, "onCreate: "+saveDoubleText("1234,5678.1")); //1234.5678
        Log.d(TAG, "onCreate: "+saveDoubleText("1234,5678.01")); //1234.5678

    }
}