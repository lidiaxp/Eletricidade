package com.example.lidiaxp.eletricidade;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class Verde extends Activity {
    private final double somamasterverde = 0;
    private final double somamasterazul = 0;
    private double somamaster = 0;
    private ArrayAdapter<String> adaptador;
    private AutoCompleteTextView autoCompTxtView;
    String bandeira[] = {"verde", "amarela", "vermelha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verde);

        Button calcular = (Button) findViewById(R.id.button2);
        final EditText edt = (EditText) findViewById(R.id.editText);
        final EditText edt2 = (EditText) findViewById(R.id.bandeiras);
        final EditText edt3 = (EditText) findViewById(R.id.editText3);
        final EditText edt4 = (EditText) findViewById(R.id.editText4);
        final EditText edt5 = (EditText) findViewById(R.id.editText5);
        final EditText edt6 = (EditText) findViewById(R.id.editText6);
        final EditText edt7 = (EditText) findViewById(R.id.editText7);
        final EditText edt8 = (EditText) findViewById(R.id.editText8);
        final EditText edt9 = (EditText) findViewById(R.id.editText9);
        final EditText edt10 = (EditText) findViewById(R.id.editText10);
        final EditText edt11 = (EditText) findViewById(R.id.editText11);
        final EditText edt12 = (EditText) findViewById(R.id.editText12);
        final EditText edt13 = (EditText) findViewById(R.id.editText13);
        final EditText edt14 = (EditText) findViewById(R.id.editText14);
        final EditText edt15 = (EditText) findViewById(R.id.editText15);
        final EditText edt16 = (EditText) findViewById(R.id.editText16);
        final EditText edt17 = (EditText) findViewById(R.id.editText17);
        final EditText edt18 = (EditText) findViewById(R.id.editText18);
        final EditText edt19 = (EditText) findViewById(R.id.editText19);
        final EditText edt20 = (EditText) findViewById(R.id.editText20);
        final EditText edt21 = (EditText) findViewById(R.id.editText21);
        final EditText edt22 = (EditText) findViewById(R.id.editText22);
        final EditText edt23 = (EditText) findViewById(R.id.editText23);
        final EditText edt24 = (EditText) findViewById(R.id.editText24);
        final EditText edt25 = (EditText) findViewById(R.id.editText25);
        final EditText edt26 = (EditText) findViewById(R.id.editText26);
        final EditText edt27 = (EditText) findViewById(R.id.editText27);
        final EditText edt28 = (EditText) findViewById(R.id.editText28);
        final EditText edt29 = (EditText) findViewById(R.id.editText29);
        final EditText edt30 = (EditText) findViewById(R.id.editText30);
        final EditText edt31 = (EditText) findViewById(R.id.editText31);
        final EditText edt32 = (EditText) findViewById(R.id.editText32);
        final EditText edt33 = (EditText) findViewById(R.id.editText33);
        final EditText edt34 = (EditText) findViewById(R.id.editText34);
        final EditText edt35 = (EditText) findViewById(R.id.editText35);
        final EditText edt36 = (EditText) findViewById(R.id.editText36);
        final EditText edt37 = (EditText) findViewById(R.id.editText37);
        final EditText edt38 = (EditText) findViewById(R.id.editText38);

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, bandeira);
        autoCompTxtView = (AutoCompleteTextView) findViewById(R.id.bandeiras);
        autoCompTxtView.setAdapter(adaptador);

        calcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String dc = edt.getText().toString();
                String bv = edt2.getText().toString();
                String d = edt3.getText().toString();
                String cfp = edt4.getText().toString();
                String cp = edt5.getText().toString();
                String d2 = edt6.getText().toString();
                String cfp2 = edt7.getText().toString();
                String cp2 = edt8.getText().toString();
                String d3 = edt9.getText().toString();
                String cfp3 = edt10.getText().toString();
                String cp3 = edt11.getText().toString();
                String d4 = edt12.getText().toString();
                String cfp4 = edt13.getText().toString();
                String cp4 = edt14.getText().toString();
                String d5 = edt15.getText().toString();
                String cfp5 = edt16.getText().toString();
                String cp5 = edt17.getText().toString();
                String d6 = edt18.getText().toString();
                String cfp6 = edt19.getText().toString();
                String cp6 = edt20.getText().toString();
                String d7 = edt21.getText().toString();
                String cfp7 = edt22.getText().toString();
                String cp7 = edt23.getText().toString();
                String d8 = edt24.getText().toString();
                String cfp8 = edt25.getText().toString();
                String cp8 = edt26.getText().toString();
                String d9 = edt27.getText().toString();
                String cfp9 = edt28.getText().toString();
                String cp9 = edt29.getText().toString();
                String d10 = edt30.getText().toString();
                String cfp10 = edt31.getText().toString();
                String cp10 = edt32.getText().toString();
                String d11 = edt33.getText().toString();
                String cfp11 = edt34.getText().toString();
                String cp11 = edt35.getText().toString();
                String d12 = edt36.getText().toString();
                String cfp12 = edt37.getText().toString();
                String cp12 = edt38.getText().toString();

                Double demandafp = Double.parseDouble(dc)*0.8;
                String dfp = demandafp.toString();

                if (bv.equals("verde")) {
                    double tdemanda = 18.16;
                    double tconsumoponta = 2.066280;
                    double tconsumoforadeponta = 0.267890;
                    double tdemandapontaA = 15.56;
                    double tdemandaforadepontaA = 4.37;
                    double tconsumopontaA = 0.355620;
                    double tconsumoforadepontaA = 0.236650;

                    double somamasterverde = mes1(dc,d,cfp,cp,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes2(dc,d2,cfp2,cp2,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes3(dc,d3,cfp3,cp3,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes4(dc,d4,cfp4,cp4,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes5(dc,d5,cfp5,cp5,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes6(dc,d6,cfp6,cp6,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes7(dc,d7,cfp7,cp7,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes8(dc,d8,cfp8,cp8,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes9(dc,d9,cfp9,cp9,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes10(dc,d10,cfp10,cp10,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes11(dc,d11,cfp11,cp11,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes12(dc,d12,cfp12,cp12,tdemanda,tconsumoponta,tconsumoforadeponta);

                    double somamasterazul = Azul.mes1(dfp, dfp, d, cp, cfp, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes2(dfp, dfp, d2, cp2, cfp2, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes3(dfp, dfp, d3, cp3, cfp3, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes4(dfp, dfp, d4, cp4, cfp4, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes5(dfp, dfp, d5, cp5, cfp5, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes6(dfp, dfp, d6, cp6, cfp6, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes7(dfp, dfp, d7, cp7, cfp7, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes8(dfp, dfp, d8, cp8, cfp8, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes9(dfp, dfp, d9, cp9, cfp9, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes10(dfp, dfp, d10, cp10, cfp10, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes11(dfp, dfp, d11, cp11, cfp11, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes12(dfp, dfp, d12, cp12, cfp12, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) ;

                    if(somamasterazul > somamasterverde){
                        somamaster = somamasterazul - somamasterverde;

                        AlertDialog alertDialog = new AlertDialog.Builder(Verde.this).create();
                        alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                "\nCom a tarifa azul gastaria: " + somamasterazul +
                                "\nEntão você está economizando: " + somamaster + " por ano.");
                        alertDialog.show();
                    }else{
                        somamaster = somamasterverde - somamasterazul;

                        AlertDialog alertDialog = new AlertDialog.Builder(Verde.this).create();
                        alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                "\nCom a tarifa azul gastaria: " + somamasterazul +
                                "\nEntão você está pagando: " + somamaster + " a mais por ano.");
                        alertDialog.show();
                    }
                }

                if (bv.equals("amarela") || bv.equals("amarelo")){
                    double tdemanda = 18.16;
                    double tconsumoponta = 2.091280;
                    double tconsumoforadeponta = 0.292890;
                    double tdemandapontaA = 15.56;
                    double tdemandaforadepontaA = 4.37;
                    double tconsumopontaA = 0.380620;
                    double tconsumoforadepontaA = 0.261650;

                    double somamasterverde = mes1(dc,d,cfp,cp,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes2(dc,d2,cfp2,cp2,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes3(dc,d3,cfp3,cp3,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes4(dc,d4,cfp4,cp4,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes5(dc,d5,cfp5,cp5,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes6(dc,d6,cfp6,cp6,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes7(dc,d7,cfp7,cp7,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes8(dc,d8,cfp8,cp8,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes9(dc,d9,cfp9,cp9,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes10(dc,d10,cfp10,cp10,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes11(dc,d11,cfp11,cp11,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes12(dc,d12,cfp12,cp12,tdemanda,tconsumoponta,tconsumoforadeponta);

                    double somamasterazul = Azul.mes1(dfp, dfp, d, cp, cfp, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes2(dfp, dfp, d2, cp2, cfp2, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes3(dfp, dfp, d3, cp3, cfp3, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes4(dfp, dfp, d4, cp4, cfp4, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes5(dfp, dfp, d5, cp5, cfp5, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes6(dfp, dfp, d6, cp6, cfp6, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes7(dfp, dfp, d7, cp7, cfp7, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes8(dfp, dfp, d8, cp8, cfp8, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes9(dfp, dfp, d9, cp9, cfp9, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes10(dfp, dfp, d10, cp10, cfp10, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes11(dfp, dfp, d11, cp11, cfp11, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes12(dfp, dfp, d12, cp12, cfp12, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) ;

                    if(somamasterazul > somamasterverde){
                        somamaster = somamasterazul - somamasterverde;

                        AlertDialog alertDialog = new AlertDialog.Builder(Verde.this).create();
                        alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                               "\nCom a tarifa azul gastaria: " + somamasterazul +
                                               "\nEntão você está economizando: " + somamaster + " por ano.");
                        alertDialog.show();
                    }else{
                        somamaster = somamasterverde - somamasterazul;

                        AlertDialog alertDialog = new AlertDialog.Builder(Verde.this).create();
                        alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                "\nCom a tarifa azul gastaria: " + somamasterazul +
                                "\nEntão você está pagando: " + somamaster + " a mais por ano.");
                        alertDialog.show();
                    }
                }

                if (bv.equals("vermelha") || bv.equals("vermelho")) {
                    double tdemanda = 18.16;
                    double tconsumoponta = 2.11128;
                    double tconsumoforadeponta = 0.312890;
                    double tdemandapontaA = 15.56;
                    double tdemandaforadepontaA = 4.37;
                    double tconsumopontaA = 0.400620;
                    double tconsumoforadepontaA = 0.400620;

                    double somamasterverde = mes1(dc,d,cfp,cp,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes2(dc,d2,cfp2,cp2,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes3(dc,d3,cfp3,cp3,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes4(dc,d4,cfp4,cp4,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes5(dc,d5,cfp5,cp5,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes6(dc,d6,cfp6,cp6,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes7(dc,d7,cfp7,cp7,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes8(dc,d8,cfp8,cp8,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes9(dc,d9,cfp9,cp9,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes10(dc,d10,cfp10,cp10,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes11(dc,d11,cfp11,cp11,tdemanda,tconsumoponta,tconsumoforadeponta) +
                            mes12(dc,d12,cfp12,cp12,tdemanda,tconsumoponta,tconsumoforadeponta);

                    double somamasterazul = Azul.mes1(dfp, dfp, d, cp, cfp, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes2(dfp, dfp, d2, cp2, cfp2, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes3(dfp, dfp, d3, cp3, cfp3, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes4(dfp, dfp, d4, cp4, cfp4, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes5(dfp, dfp, d5, cp5, cfp5, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes6(dfp, dfp, d6, cp6, cfp6, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes7(dfp, dfp, d7, cp7, cfp7, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes8(dfp, dfp, d8, cp8, cfp8, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes9(dfp, dfp, d9, cp9, cfp9, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes10(dfp, dfp, d10, cp10, cfp10, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes11(dfp, dfp, d11, cp11, cfp11, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) +
                            Azul.mes12(dfp, dfp, d12, cp12, cfp12, dc, tdemandapontaA, tdemandaforadepontaA, tconsumopontaA, tconsumoforadepontaA) ;

                    if(somamasterazul > somamasterverde){
                        somamaster = somamasterazul - somamasterverde;

                        AlertDialog alertDialog = new AlertDialog.Builder(Verde.this).create();
                        alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                "\nCom a tarifa azul gastaria: " + somamasterazul +
                                "\nEntão você está economizando: " + somamaster + " por ano.");
                        alertDialog.show();
                    }else{
                        somamaster = somamasterverde - somamasterazul;

                        AlertDialog alertDialog = new AlertDialog.Builder(Verde.this).create();
                        alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                "\nCom a tarifa azul gastaria: " + somamasterazul +
                                "\nEntão você está pagando: " + somamaster + " a mais por ano.");
                        alertDialog.show();
                    }
                }

            }
        });
    }

    static double mes1(String dc, String d, String cfp, String cp, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d)) { //normal
            soma = Double.parseDouble(d) * tdemanda + Double.parseDouble(cfp) * tconsumoforadeponta +
                    Double.parseDouble(cp) * tconsumoponta ;

        } else  {
            soma = Double.parseDouble(d) * tdemanda + Double.parseDouble(cfp) * tconsumoforadeponta +
                    Double.parseDouble(cp) * tconsumoponta + (Double.parseDouble(d) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma;
    }

    static double mes2(String dc, String d2, String cfp2, String cp2, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma2 = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d2)) { //normal
            soma2 = Double.parseDouble(d2) * tdemanda + Double.parseDouble(cfp2) * tconsumoforadeponta +
                    Double.parseDouble(cp2) * tconsumoponta ;

        } else  {
            soma2 = Double.parseDouble(d2) * tdemanda + Double.parseDouble(cfp2) * tconsumoforadeponta +
                    Double.parseDouble(cp2) * tconsumoponta + (Double.parseDouble(d2) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma2;
    }

    static double mes3(String dc, String d3, String cfp3, String cp3, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma3 = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d3)) { //normal
            soma3 = Double.parseDouble(d3) * tdemanda + Double.parseDouble(cfp3) * tconsumoforadeponta +
                    Double.parseDouble(cp3) * tconsumoponta ;

        } else  {
            soma3 = Double.parseDouble(d3) * tdemanda + Double.parseDouble(cfp3) * tconsumoforadeponta +
                    Double.parseDouble(cp3) * tconsumoponta + (Double.parseDouble(d3) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma3;
    }

    static double mes4(String dc, String d4, String cfp4, String cp4, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma4 = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d4)) { //normal
            soma4 = Double.parseDouble(d4) * tdemanda + Double.parseDouble(cfp4) * tconsumoforadeponta +
                    Double.parseDouble(cp4) * tconsumoponta ;

        } else  {
            soma4 = Double.parseDouble(d4) * tdemanda + Double.parseDouble(cfp4) * tconsumoforadeponta +
                    Double.parseDouble(cp4) * tconsumoponta + (Double.parseDouble(d4) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma4;
    }

    static double mes5(String dc, String d5, String cfp5, String cp5, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma5 = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d5)) { //normal
            soma5 = Double.parseDouble(d5) * tdemanda + Double.parseDouble(cfp5) * tconsumoforadeponta +
                    Double.parseDouble(cp5) * tconsumoponta ;

        } else  {
            soma5 = Double.parseDouble(d5) * tdemanda + Double.parseDouble(cfp5) * tconsumoforadeponta +
                    Double.parseDouble(cp5) * tconsumoponta + (Double.parseDouble(d5) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma5;
    }

    static double mes6(String dc, String d6, String cfp6, String cp6, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma6 = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d6)) { //normal
            soma6 = Double.parseDouble(d6) * tdemanda + Double.parseDouble(cfp6) * tconsumoforadeponta +
                    Double.parseDouble(cp6) * tconsumoponta ;

        } else  {
            soma6 = Double.parseDouble(d6) * tdemanda + Double.parseDouble(cfp6) * tconsumoforadeponta +
                    Double.parseDouble(cp6) * tconsumoponta + (Double.parseDouble(d6) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma6;
    }

    static double mes7(String dc, String d7, String cfp7, String cp7, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma7 = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d7)) { //normal
            soma7 = Double.parseDouble(d7) * tdemanda + Double.parseDouble(cfp7) * tconsumoforadeponta +
                    Double.parseDouble(cp7) * tconsumoponta ;

        } else  {
            soma7 = Double.parseDouble(d7) * tdemanda + Double.parseDouble(cfp7) * tconsumoforadeponta +
                    Double.parseDouble(cp7) * tconsumoponta + (Double.parseDouble(d7) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma7;
    }

    static double mes8(String dc, String d8, String cfp8, String cp8, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma8 = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d8)) { //normal
            soma8 = Double.parseDouble(d8) * tdemanda + Double.parseDouble(cfp8) * tconsumoforadeponta +
                    Double.parseDouble(cp8) * tconsumoponta ;

        } else  {
            soma8 = Double.parseDouble(d8) * tdemanda + Double.parseDouble(cfp8) * tconsumoforadeponta +
                    Double.parseDouble(cp8) * tconsumoponta + (Double.parseDouble(d8) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma8;
    }

    static double mes9(String dc, String d9, String cfp9, String cp9, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma9 = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d9)) { //normal
            soma9 = Double.parseDouble(d9) * tdemanda + Double.parseDouble(cfp9) * tconsumoforadeponta +
                    Double.parseDouble(cp9) * tconsumoponta ;

        } else  {
            soma9 = Double.parseDouble(d9) * tdemanda + Double.parseDouble(cfp9) * tconsumoforadeponta +
                    Double.parseDouble(cp9) * tconsumoponta + (Double.parseDouble(d9) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma9;
    }

    static double mes10(String dc, String d10, String cfp10, String cp10, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma10 = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d10)) { //normal
            soma10 = Double.parseDouble(d10) * tdemanda + Double.parseDouble(cfp10) * tconsumoforadeponta +
                    Double.parseDouble(cp10) * tconsumoponta ;

        } else  {
            soma10 = Double.parseDouble(d10) * tdemanda + Double.parseDouble(cfp10) * tconsumoforadeponta +
                    Double.parseDouble(cp10) * tconsumoponta + (Double.parseDouble(d10) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma10;
    }

    static double mes11(String dc, String d11, String cfp11, String cp11, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma11 = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d11)) { //normal
            soma11 = Double.parseDouble(d11) * tdemanda + Double.parseDouble(cfp11) * tconsumoforadeponta +
                    Double.parseDouble(cp11) * tconsumoponta ;

        } else  {
            soma11 = Double.parseDouble(d11) * tdemanda + Double.parseDouble(cfp11) * tconsumoforadeponta +
                    Double.parseDouble(cp11) * tconsumoponta + (Double.parseDouble(d11) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma11;
    }

    static double mes12(String dc, String d12, String cfp12, String cp12, double tdemanda,
                double tconsumoponta, double tconsumoforadeponta) {

        double soma12 = 0;

        if (Double.parseDouble(dc) * 1.05 > Double.parseDouble(d12)) { //normal
            soma12 = Double.parseDouble(d12) * tdemanda + Double.parseDouble(cfp12) * tconsumoforadeponta +
                    Double.parseDouble(cp12) * tconsumoponta ;

        } else  {
            soma12 = Double.parseDouble(d12) * tdemanda + Double.parseDouble(cfp12) * tconsumoforadeponta +
                    Double.parseDouble(cp12) * tconsumoponta + (Double.parseDouble(d12) - Double.parseDouble(dc)) * 2 * tdemanda;
        }

        return soma12;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_verde, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
