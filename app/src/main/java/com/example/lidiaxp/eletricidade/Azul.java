package com.example.lidiaxp.eletricidade;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Azul extends Activity {
    private final double somamasterverde = 0;
    private final double somamasterazul = 0;
    private double somamaster = 0;
    private ArrayAdapter<String> adaptador;
    private AutoCompleteTextView autoCompTxtView;
    String bandeira[] = {"verde", "amarela", "vermelha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azul);

        Button calcular = (Button) findViewById(R.id.button);
        final EditText edt = (EditText) findViewById(R.id.editText);
        final EditText edt1 = (EditText) findViewById(R.id.editText1);
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
        final EditText edt39 = (EditText) findViewById(R.id.editText39);
        final EditText edt40 = (EditText) findViewById(R.id.editText40);
        final EditText edt41 = (EditText) findViewById(R.id.editText41);
        final EditText edt42 = (EditText) findViewById(R.id.editText42);
        final EditText edt43 = (EditText) findViewById(R.id.editText43);
        final EditText edt44 = (EditText) findViewById(R.id.editText44);
        final EditText edt45 = (EditText) findViewById(R.id.editText45);
        final EditText edt46 = (EditText) findViewById(R.id.editText46);
        final EditText edt47 = (EditText) findViewById(R.id.editText47);
        final EditText edt48 = (EditText) findViewById(R.id.editText48);
        final EditText edt49 = (EditText) findViewById(R.id.editText49);
        final EditText edt50 = (EditText) findViewById(R.id.editText50);

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, bandeira);
        autoCompTxtView = (AutoCompleteTextView) findViewById(R.id.bandeiras);
        autoCompTxtView.setAdapter(adaptador);

        calcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String dcfp = edt.getText().toString();
                String dcp = edt1.getText().toString();
                String bv = edt2.getText().toString();
                String dfp = edt3.getText().toString();
                String dp = edt4.getText().toString();
                String cfp = edt5.getText().toString();
                String cp = edt6.getText().toString();
                String dfp2 = edt7.getText().toString();
                String dp2 = edt8.getText().toString();
                String cfp2 = edt9.getText().toString();
                String cp2 = edt10.getText().toString();
                String dfp3 = edt11.getText().toString();
                String dp3 = edt12.getText().toString();
                String cfp3 = edt13.getText().toString();
                String cp3 = edt14.getText().toString();
                String dfp4 = edt15.getText().toString();
                String dp4 = edt16.getText().toString();
                String cfp4 = edt17.getText().toString();
                String cp4 = edt18.getText().toString();
                String dfp5 = edt19.getText().toString();
                String dp5 = edt20.getText().toString();
                String cfp5 = edt21.getText().toString();
                String cp5 = edt22.getText().toString();
                String dfp6 = edt23.getText().toString();
                String dp6 = edt24.getText().toString();
                String cfp6 = edt25.getText().toString();
                String cp6 = edt26.getText().toString();
                String dfp7 = edt27.getText().toString();
                String dp7 = edt28.getText().toString();
                String cfp7 = edt29.getText().toString();
                String cp7 = edt30.getText().toString();
                String dfp8 = edt31.getText().toString();
                String dp8 = edt32.getText().toString();
                String cfp8 = edt33.getText().toString();
                String cp8 = edt34.getText().toString();
                String dfp9 = edt35.getText().toString();
                String dp9 = edt36.getText().toString();
                String cfp9 = edt37.getText().toString();
                String cp9 = edt38.getText().toString();
                String dfp10 = edt39.getText().toString();
                String dp10 = edt40.getText().toString();
                String cfp10 = edt41.getText().toString();
                String cp10 = edt42.getText().toString();
                String dfp11 = edt43.getText().toString();
                String dp11 = edt44.getText().toString();
                String cfp11 = edt45.getText().toString();
                String cp11 = edt46.getText().toString();
                String dfp12 = edt47.getText().toString();
                String dp12 = edt48.getText().toString();
                String cfp12 = edt49.getText().toString();
                String cp12 = edt50.getText().toString();

                if (bv.equals("verde")) {
                    double tdemandaV = 18.16;
                    double tconsumopontaV = 2.066280;
                    double tconsumoforadepontaV = 0.267890;
                    double tdemandaponta = 15.56;
                    double tdemandaforadeponta = 4.37;
                    double tconsumoponta = 0.355620;
                    double tconsumoforadeponta = 0.236650;

                    double somamasterazul = mes1(dcfp, dfp, dp, cp, cfp, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes2(dcfp, dfp2, dp2, cp2, cfp2, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes3(dcfp, dfp3, dp3, cp3, cfp3, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes4(dcfp, dfp4, dp4, cp4, cfp4, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes5(dcfp, dfp5, dp5, cp5, cfp5, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes6(dcfp, dfp6, dp6, cp6, cfp6, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes7(dcfp, dfp7, dp7, cp7, cfp7, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes8(dcfp, dfp8, dp8, cp8, cfp8, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes9(dcfp, dfp9, dp9, cp9, cfp9, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes10(dcfp, dfp10, dp10, cp10, cfp10, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes11(dcfp, dfp11, dp11, cp11, cfp11, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes12(dcfp, dfp12, dp12, cp12, cfp12, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta);

                    if (Double.parseDouble(dp)>Double.parseDouble(dfp)){
                        double somamasterverde = Verde.mes1(dcp, dp, cfp, cp, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes2(dcp, dp2, cfp2, cp2, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes3(dcp, dp3, cfp3, cp3, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes4(dcp, dp4, cfp4, cp4, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes5(dcp, dp5, cfp5, cp5, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes6(dcp, dp6, cfp6, cp6, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes7(dcp, dp7, cfp7, cp7, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes8(dcp, dp8, cfp8, cp8, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes9(dcp, dp9, cfp9, cp9, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes10(dcp, dp10, cfp10, cp10, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes11(dcp, dp11, cfp11, cp11, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes12(dcp, dp12, cfp12, cp12, tdemandaV, tconsumopontaV, tconsumoforadepontaV);

                        if(somamasterazul > somamasterverde){
                            somamaster = somamasterazul - somamasterverde;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está pagando: " + somamaster + " a mais por ano.");
                            alertDialog.show();
                        }else{
                            somamaster = somamasterverde - somamasterazul;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está economizando: " + somamaster + " por ano.");
                            alertDialog.show();
                        }

                    }else{
                        double somamasterverde = Verde.mes1(dcp, dfp, cfp, cp, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes2(dcp, dfp2, cfp2, cp2, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes3(dcp, dfp3, cfp3, cp3, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes4(dcp, dfp4, cfp4, cp4, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes5(dcp, dfp5, cfp5, cp5, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes6(dcp, dfp6, cfp6, cp6, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes7(dcp, dfp7, cfp7, cp7, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes8(dcp, dfp8, cfp8, cp8, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes9(dcp, dfp9, cfp9, cp9, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes10(dcp, dfp10, cfp10, cp10, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes11(dcp, dfp11, cfp11, cp11, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes12(dcp, dfp12, cfp12, cp12, tdemandaV, tconsumopontaV, tconsumoforadepontaV);

                        if(somamasterazul > somamasterverde){
                            somamaster = somamasterazul - somamasterverde;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está pagando: " + somamaster + " a mais por ano.");
                            alertDialog.show();
                        }else{
                            somamaster = somamasterverde - somamasterazul;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está economizando: " + somamaster + " por ano.");
                            alertDialog.show();
                        }
                    }
                }

                if (bv.equals("amarelo") || bv.equals("amarela")) {
                    double tdemandaV = 18.16;
                    double tconsumopontaV = 2.091280;
                    double tconsumoforadepontaV = 0.292890;
                    double tdemandaponta = 15.56;
                    double tdemandaforadeponta = 4.37;
                    double tconsumoponta = 0.380620;
                    double tconsumoforadeponta = 0.261650;

                    double somamasterazul = mes1(dcfp, dfp, dp, cp, cfp, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes2(dcfp, dfp2, dp2, cp2, cfp2, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes3(dcfp, dfp3, dp3, cp3, cfp3, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes4(dcfp, dfp4, dp4, cp4, cfp4, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes5(dcfp, dfp5, dp5, cp5, cfp5, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes6(dcfp, dfp6, dp6, cp6, cfp6, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes7(dcfp, dfp7, dp7, cp7, cfp7, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes8(dcfp, dfp8, dp8, cp8, cfp8, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes9(dcfp, dfp9, dp9, cp9, cfp9, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes10(dcfp, dfp10, dp10, cp10, cfp10, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes11(dcfp, dfp11, dp11, cp11, cfp11, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes12(dcfp, dfp12, dp12, cp12, cfp12, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta);

                    if (Double.parseDouble(dp)>Double.parseDouble(dfp)){
                        double somamasterverde = Verde.mes1(dcp, dp, cfp, cp, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes2(dcp, dp2, cfp2, cp2, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes3(dcp, dp3, cfp3, cp3, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes4(dcp, dp4, cfp4, cp4, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes5(dcp, dp5, cfp5, cp5, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes6(dcp, dp6, cfp6, cp6, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes7(dcp, dp7, cfp7, cp7, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes8(dcp, dp8, cfp8, cp8, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes9(dcp, dp9, cfp9, cp9, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes10(dcp, dp10, cfp10, cp10, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes11(dcp, dp11, cfp11, cp11, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes12(dcp, dp12, cfp12, cp12, tdemandaV, tconsumopontaV, tconsumoforadepontaV);

                        if(somamasterazul > somamasterverde){
                            somamaster = somamasterazul - somamasterverde;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está pagando: " + somamaster + " a mais por ano.");
                            alertDialog.show();
                        }else{
                            somamaster = somamasterverde - somamasterazul;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está economizando: " + somamaster + " por ano.");
                            alertDialog.show();
                        }

                    }else{
                        double somamasterverde = Verde.mes1(dcp, dfp, cfp, cp, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes2(dcp, dfp2, cfp2, cp2, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes3(dcp, dfp3, cfp3, cp3, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes4(dcp, dfp4, cfp4, cp4, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes5(dcp, dfp5, cfp5, cp5, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes6(dcp, dfp6, cfp6, cp6, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes7(dcp, dfp7, cfp7, cp7, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes8(dcp, dfp8, cfp8, cp8, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes9(dcp, dfp9, cfp9, cp9, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes10(dcp, dfp10, cfp10, cp10, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes11(dcp, dfp11, cfp11, cp11, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes12(dcp, dfp12, cfp12, cp12, tdemandaV, tconsumopontaV, tconsumoforadepontaV);

                        if(somamasterazul > somamasterverde){
                            somamaster = somamasterazul - somamasterverde;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está pagando: " + somamaster + " a mais por ano.");
                            alertDialog.show();
                        }else{
                            somamaster = somamasterverde - somamasterazul;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está economizando: " + somamaster + " por ano.");
                            alertDialog.show();
                        }
                    }
                }

                if (bv.equals("vermelho") || bv.equals("vermelha")) {
                    double tdemandaV = 18.16;
                    double tconsumopontaV = 2.11128;
                    double tconsumoforadepontaV = 0.312890;
                    double tdemandaponta = 15.56;
                    double tdemandaforadeponta = 4.37;
                    double tconsumoponta = 0.400620;
                    double tconsumoforadeponta = 0.400620;

                    double somamasterazul = mes1(dcfp, dfp, dp, cp, cfp, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes2(dcfp, dfp2, dp2, cp2, cfp2, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes3(dcfp, dfp3, dp3, cp3, cfp3, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes4(dcfp, dfp4, dp4, cp4, cfp4, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes5(dcfp, dfp5, dp5, cp5, cfp5, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes6(dcfp, dfp6, dp6, cp6, cfp6, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes7(dcfp, dfp7, dp7, cp7, cfp7, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes8(dcfp, dfp8, dp8, cp8, cfp8, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes9(dcfp, dfp9, dp9, cp9, cfp9, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes10(dcfp, dfp10, dp10, cp10, cfp10, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes11(dcfp, dfp11, dp11, cp11, cfp11, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta) +
                            mes12(dcfp, dfp12, dp12, cp12, cfp12, dcp, tdemandaponta, tdemandaforadeponta, tconsumoponta, tconsumoforadeponta);

                    if (Double.parseDouble(dp)>Double.parseDouble(dfp)){
                        double somamasterverde = Verde.mes1(dcp, dp, cfp, cp, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes2(dcp, dp2, cfp2, cp2, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes3(dcp, dp3, cfp3, cp3, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes4(dcp, dp4, cfp4, cp4, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes5(dcp, dp5, cfp5, cp5, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes6(dcp, dp6, cfp6, cp6, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes7(dcp, dp7, cfp7, cp7, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes8(dcp, dp8, cfp8, cp8, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes9(dcp, dp9, cfp9, cp9, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes10(dcp, dp10, cfp10, cp10, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes11(dcp, dp11, cfp11, cp11, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes12(dcp, dp12, cfp12, cp12, tdemandaV, tconsumopontaV, tconsumoforadepontaV);

                        if(somamasterazul > somamasterverde){
                            somamaster = somamasterazul - somamasterverde;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está pagando: " + somamaster + " a mais por ano.");
                            alertDialog.show();
                        }else{
                            somamaster = somamasterverde - somamasterazul;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está economizando: " + somamaster + " por ano.");
                            alertDialog.show();
                        }

                    }else{
                        double somamasterverde = Verde.mes1(dcp, dfp, cfp, cp, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes2(dcp, dfp2, cfp2, cp2, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes3(dcp, dfp3, cfp3, cp3, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes4(dcp, dfp4, cfp4, cp4, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes5(dcp, dfp5, cfp5, cp5, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes6(dcp, dfp6, cfp6, cp6, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes7(dcp, dfp7, cfp7, cp7, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes8(dcp, dfp8, cfp8, cp8, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes9(dcp, dfp9, cfp9, cp9, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes10(dcp, dfp10, cfp10, cp10, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes11(dcp, dfp11, cfp11, cp11, tdemandaV, tconsumopontaV, tconsumoforadepontaV) +
                                Verde.mes12(dcp, dfp12, cfp12, cp12, tdemandaV, tconsumopontaV, tconsumoforadepontaV);

                        if(somamasterazul > somamasterverde){
                            somamaster = somamasterazul - somamasterverde;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está pagando: " + somamaster + " a mais por ano.");
                            alertDialog.show();
                        }else{
                            somamaster = somamasterverde - somamasterazul;

                            AlertDialog alertDialog = new AlertDialog.Builder(Azul.this).create();
                            alertDialog.setMessage("Com a tarifa verde gastaria: " + somamasterverde +
                                    "\nCom a tarifa azul gastaria: " + somamasterazul +
                                    "\nEntão você está economizando: " + somamaster + " por ano.");
                            alertDialog.show();
                        }
                    }
                }
            }
        });
    }


    public static double mes1(String dcfp, String dfp, String dp, String cp, String cfp, String dcp,
                double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp)) { //normal
            soma = Double.parseDouble(dp) * tdemandaponta + Double.parseDouble(dfp) * tdemandaforadeponta +
                    Double.parseDouble(cp) * tconsumoponta + Double.parseDouble(cfp) * tconsumoforadeponta;

        }  else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp)) {//os dois passaram
            soma = Double.parseDouble(dp) * tdemandaponta + Double.parseDouble(dfp) * tdemandaforadeponta +
                    Double.parseDouble(cp) * tconsumoponta + Double.parseDouble(cfp) * tconsumoforadeponta +
                    (Double.parseDouble(dp) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp)) {//so um passou
            soma = Double.parseDouble(dp) * tdemandaponta + Double.parseDouble(dfp) * tdemandaforadeponta +
                    Double.parseDouble(cp) * tconsumoponta + Double.parseDouble(cfp) * tconsumoforadeponta +
                    (Double.parseDouble(dp) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp)) { //so um passou
            soma = Double.parseDouble(dp) * tdemandaponta + Double.parseDouble(dfp) * tdemandaforadeponta +
                    Double.parseDouble(cp) * tconsumoponta + Double.parseDouble(cfp) * tconsumoforadeponta +
                    (Double.parseDouble(dfp) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;
        }

        return soma;
    }

    public static double mes2(String dcfp, String dfp2, String dp2, String cp2, String cfp2, String dcp,
                double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma2 = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp2)) { //normal
            soma2 = Double.parseDouble(dp2) * tdemandaponta + Double.parseDouble(dfp2) * tdemandaforadeponta +
                    Double.parseDouble(cp2) * tconsumoponta + Double.parseDouble(cfp2) * tconsumoforadeponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp2) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp2)) {//os dois passaram
            soma2 = Double.parseDouble(dp2) * tdemandaponta + Double.parseDouble(dfp2) * tdemandaforadeponta +
                    Double.parseDouble(cp2) * tconsumoponta + Double.parseDouble(cfp2) * tconsumoforadeponta +
                    (Double.parseDouble(dp2) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp2) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp2)) {//so um passou
            soma2 = Double.parseDouble(dp2) * tdemandaponta + Double.parseDouble(dfp2) * tdemandaforadeponta +
                    Double.parseDouble(cp2) * tconsumoponta + Double.parseDouble(cfp2) * tconsumoforadeponta +
                    (Double.parseDouble(dp2) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp2)) { //so um passou
            soma2 = Double.parseDouble(dp2) * tdemandaponta + Double.parseDouble(dfp2) * tdemandaforadeponta +
                    Double.parseDouble(cp2) * tconsumoponta + Double.parseDouble(cfp2) * tconsumoforadeponta +
                    (Double.parseDouble(dfp2) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;
        }

        return soma2;
    }

    public static double mes3(String dcfp, String dfp3, String dp3, String cp3, String cfp3, String dcp,
                double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma3 = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp3)) { //normal
            soma3 = Double.parseDouble(dp3) * tdemandaponta + Double.parseDouble(dfp3) * tdemandaforadeponta +
                    Double.parseDouble(cp3) * tconsumoponta + Double.parseDouble(cfp3) * tconsumoforadeponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp3) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp3)) {//os dois passaram
            soma3 = Double.parseDouble(dp3) * tdemandaponta + Double.parseDouble(dfp3) * tdemandaforadeponta +
                    Double.parseDouble(cp3) * tconsumoponta + Double.parseDouble(cfp3) * tconsumoforadeponta +
                    (Double.parseDouble(dp3) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp3) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp3)) {//so um passou
            soma3 = Double.parseDouble(dp3) * tdemandaponta + Double.parseDouble(dfp3) * tdemandaforadeponta +
                    Double.parseDouble(cp3) * tconsumoponta + Double.parseDouble(cfp3) * tconsumoforadeponta +
                    (Double.parseDouble(dp3) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp3)) { //so um passou
            soma3 = Double.parseDouble(dp3) * tdemandaponta + Double.parseDouble(dfp3) * tdemandaforadeponta +
                    Double.parseDouble(cp3) * tconsumoponta + Double.parseDouble(cfp3) * tconsumoforadeponta +
                    (Double.parseDouble(dfp3) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;
        }

        return soma3;
    }

    public static double mes4(String dcfp, String dfp4, String dp4, String cp4, String cfp4, String dcp,
                double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma4 = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp4)) { //normal
            soma4 = Double.parseDouble(dp4) * tdemandaponta + Double.parseDouble(dfp4) * tdemandaforadeponta +
                    Double.parseDouble(cp4) * tconsumoponta + Double.parseDouble(cfp4) * tconsumoforadeponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp4) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp4)) {//os dois passaram
            soma4 = Double.parseDouble(dp4) * tdemandaponta + Double.parseDouble(dfp4) * tdemandaforadeponta +
                    Double.parseDouble(cp4) * tconsumoponta + Double.parseDouble(cfp4) * tconsumoforadeponta +
                    (Double.parseDouble(dp4) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp4) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp4)) {//so um passou
            soma4 = Double.parseDouble(dp4) * tdemandaponta + Double.parseDouble(dfp4) * tdemandaforadeponta +
                    Double.parseDouble(cp4) * tconsumoponta + Double.parseDouble(cfp4) * tconsumoforadeponta +
                    (Double.parseDouble(dp4) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp4)) { //so um passou
        soma4 = Double.parseDouble(dp4) * tdemandaponta + Double.parseDouble(dfp4) * tdemandaforadeponta +
                Double.parseDouble(cp4) * tconsumoponta + Double.parseDouble(cfp4) * tconsumoforadeponta +
                (Double.parseDouble(dfp4) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;
        }

        return soma4;
    }

    public static double mes5(String dcfp, String dfp5, String dp5, String cp5, String cfp5, String dcp,
                double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma5 = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp5)) { //normal
            soma5 = Double.parseDouble(dp5) * tdemandaponta + Double.parseDouble(dfp5) * tdemandaforadeponta +
                    Double.parseDouble(cp5) * tconsumoponta + Double.parseDouble(cfp5) * tconsumoforadeponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp5) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp5)) {//os dois passaram
            soma5 = Double.parseDouble(dp5) * tdemandaponta + Double.parseDouble(dfp5) * tdemandaforadeponta +
                    Double.parseDouble(cp5) * tconsumoponta + Double.parseDouble(cfp5) * tconsumoforadeponta +
                    (Double.parseDouble(dp5) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp5) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp5)) {//so um passou
            soma5 = Double.parseDouble(dp5) * tdemandaponta + Double.parseDouble(dfp5) * tdemandaforadeponta +
                    Double.parseDouble(cp5) * tconsumoponta + Double.parseDouble(cfp5) * tconsumoforadeponta +
                    (Double.parseDouble(dp5) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp5)) { //so um passou
            soma5 = Double.parseDouble(dp5) * tdemandaponta + Double.parseDouble(dfp5) * tdemandaforadeponta +
                    Double.parseDouble(cp5) * tconsumoponta + Double.parseDouble(cfp5) * tconsumoforadeponta +
                    (Double.parseDouble(dfp5) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;
        }

        return soma5;
    }

    public static double mes6(String dcfp, String dfp6, String dp6, String cp6, String cfp6, String dcp,
                double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma6 = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp6)) { //normal
            soma6 = Double.parseDouble(dp6) * tdemandaponta + Double.parseDouble(dfp6) * tdemandaforadeponta +
                    Double.parseDouble(cp6) * tconsumoponta + Double.parseDouble(cfp6) * tconsumoforadeponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp6) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp6)) {//os dois passaram
            soma6 = Double.parseDouble(dp6) * tdemandaponta + Double.parseDouble(dfp6) * tdemandaforadeponta +
                    Double.parseDouble(cp6) * tconsumoponta + Double.parseDouble(cfp6) * tconsumoforadeponta +
                    (Double.parseDouble(dp6) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp6) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp6)) {//so um passou
            soma6 = Double.parseDouble(dp6) * tdemandaponta + Double.parseDouble(dfp6) * tdemandaforadeponta +
                    Double.parseDouble(cp6) * tconsumoponta + Double.parseDouble(cfp6) * tconsumoforadeponta +
                    (Double.parseDouble(dp6) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp6)) { //so um passou
            soma6 = Double.parseDouble(dp6) * tdemandaponta + Double.parseDouble(dfp6) * tdemandaforadeponta +
                    Double.parseDouble(cp6) * tconsumoponta + Double.parseDouble(cfp6) * tconsumoforadeponta +
                    (Double.parseDouble(dfp6) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;
        }

        return soma6;
    }

    public static double mes7(String dcfp, String dfp7, String dp7, String cp7, String cfp7, String dcp,
                double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma7 = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp7)) { //normal
            soma7 = Double.parseDouble(dp7) * tdemandaponta + Double.parseDouble(dfp7) * tdemandaforadeponta +
                    Double.parseDouble(cp7) * tconsumoponta + Double.parseDouble(cfp7) * tconsumoforadeponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp7) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp7)) {//os dois passaram
            soma7 = Double.parseDouble(dp7) * tdemandaponta + Double.parseDouble(dfp7) * tdemandaforadeponta +
                    Double.parseDouble(cp7) * tconsumoponta + Double.parseDouble(cfp7) * tconsumoforadeponta +
                    (Double.parseDouble(dp7) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp7) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp7)) {//so um passou
            soma7 = Double.parseDouble(dp7) * tdemandaponta + Double.parseDouble(dfp7) * tdemandaforadeponta +
                    Double.parseDouble(cp7) * tconsumoponta + Double.parseDouble(cfp7) * tconsumoforadeponta +
                    (Double.parseDouble(dp7) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp7)) { //so um passou
            soma7 = Double.parseDouble(dp7) * tdemandaponta + Double.parseDouble(dfp7) * tdemandaforadeponta +
                    Double.parseDouble(cp7) * tconsumoponta + Double.parseDouble(cfp7) * tconsumoforadeponta +
                    (Double.parseDouble(dfp7) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;
        }

        return soma7;
    }

    public static double mes8(String dcfp, String dfp8, String dp8, String cp8, String cfp8, String dcp,
                double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma8 = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp8)) { //normal
            soma8 = Double.parseDouble(dp8) * tdemandaponta + Double.parseDouble(dfp8) * tdemandaforadeponta +
                    Double.parseDouble(cp8) * tconsumoponta + Double.parseDouble(cfp8) * tconsumoforadeponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp8) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp8)) {//os dois passaram
            soma8 = Double.parseDouble(dp8) * tdemandaponta + Double.parseDouble(dfp8) * tdemandaforadeponta +
                    Double.parseDouble(cp8) * tconsumoponta + Double.parseDouble(cfp8) * tconsumoforadeponta +
                    (Double.parseDouble(dp8) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp8) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp8)) {//so um passou
            soma8 = Double.parseDouble(dp8) * tdemandaponta + Double.parseDouble(dfp8) * tdemandaforadeponta +
                    Double.parseDouble(cp8) * tconsumoponta + Double.parseDouble(cfp8) * tconsumoforadeponta +
                    (Double.parseDouble(dp8) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp8)) { //so um passou
        soma8 = Double.parseDouble(dp8) * tdemandaponta + Double.parseDouble(dfp8) * tdemandaforadeponta +
                Double.parseDouble(cp8) * tconsumoponta + Double.parseDouble(cfp8) * tconsumoforadeponta +
                (Double.parseDouble(dfp8) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        }

        return soma8;
    }

    public static double mes9(String dcfp, String dfp9, String dp9, String cp9, String cfp9, String dcp,
                double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma9 = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp9)) { //normal
            soma9 = Double.parseDouble(dp9) * tdemandaponta + Double.parseDouble(dfp9) * tdemandaforadeponta +
                    Double.parseDouble(cp9) * tconsumoponta + Double.parseDouble(cfp9) * tconsumoforadeponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp9) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp9)) {//os dois passaram
            soma9 = Double.parseDouble(dp9) * tdemandaponta + Double.parseDouble(dfp9) * tdemandaforadeponta +
                    Double.parseDouble(cp9) * tconsumoponta + Double.parseDouble(cfp9) * tconsumoforadeponta +
                    (Double.parseDouble(dp9) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp9) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp9)) {//so um passou
            soma9 = Double.parseDouble(dp9) * tdemandaponta + Double.parseDouble(dfp9) * tdemandaforadeponta +
                    Double.parseDouble(cp9) * tconsumoponta + Double.parseDouble(cfp9) * tconsumoforadeponta +
                    (Double.parseDouble(dp9) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp9)) { //so um passou
        soma9 = Double.parseDouble(dp9) * tdemandaponta + Double.parseDouble(dfp9) * tdemandaforadeponta +
                Double.parseDouble(cp9) * tconsumoponta + Double.parseDouble(cfp9) * tconsumoforadeponta +
                (Double.parseDouble(dfp9) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;
        }

        return soma9;
    }

    public static double mes10(String dcfp, String dfp10, String dp10, String cp10, String cfp10, String dcp,
                 double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma10 = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp10)) { //normal
            soma10 = Double.parseDouble(dp10) * tdemandaponta + Double.parseDouble(dfp10) * tdemandaforadeponta +
                    Double.parseDouble(cp10) * tconsumoponta + Double.parseDouble(cfp10) * tconsumoforadeponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp10) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp10)) {//os dois passaram
            soma10 = Double.parseDouble(dp10) * tdemandaponta + Double.parseDouble(dfp10) * tdemandaforadeponta +
                    Double.parseDouble(cp10) * tconsumoponta + Double.parseDouble(cfp10) * tconsumoforadeponta +
                    (Double.parseDouble(dp10) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp10) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp10)) {//so um passou
            soma10 = Double.parseDouble(dp10) * tdemandaponta + Double.parseDouble(dfp10) * tdemandaforadeponta +
                    Double.parseDouble(cp10) * tconsumoponta + Double.parseDouble(cfp10) * tconsumoforadeponta +
                    (Double.parseDouble(dp10) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp10)) { //so um passou
            soma10 = Double.parseDouble(dp10) * tdemandaponta + Double.parseDouble(dfp10) * tdemandaforadeponta +
                    Double.parseDouble(cp10) * tconsumoponta + Double.parseDouble(cfp10) * tconsumoforadeponta +
                    (Double.parseDouble(dfp10) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;
        }

        return soma10;
    }

    public static double mes11(String dcfp, String dfp11, String dp11, String cp11, String cfp11, String dcp,
                 double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma11 = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp11)) { //normal
            soma11 = Double.parseDouble(dp11) * tdemandaponta + Double.parseDouble(dfp11) * tdemandaforadeponta +
                    Double.parseDouble(cp11) * tconsumoponta + Double.parseDouble(cfp11) * tconsumoforadeponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp11) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp11)) {//os dois passaram
            soma11 = Double.parseDouble(dp11) * tdemandaponta + Double.parseDouble(dfp11) * tdemandaforadeponta +
                    Double.parseDouble(cp11) * tconsumoponta + Double.parseDouble(cfp11) * tconsumoforadeponta +
                    (Double.parseDouble(dp11) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp11) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp11)) {//so um passou
            soma11 = Double.parseDouble(dp11) * tdemandaponta + Double.parseDouble(dfp11) * tdemandaforadeponta +
                    Double.parseDouble(cp11) * tconsumoponta + Double.parseDouble(cfp11) * tconsumoforadeponta +
                    (Double.parseDouble(dp11) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp11)) { //so um passou
            soma11 = Double.parseDouble(dp11) * tdemandaponta + Double.parseDouble(dfp11) * tdemandaforadeponta +
                    Double.parseDouble(cp11) * tconsumoponta + Double.parseDouble(cfp11) * tconsumoforadeponta +
                    (Double.parseDouble(dfp11) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;
        }

        return soma11;
    }

    public static double mes12(String dcfp, String dfp12, String dp12, String cp12, String cfp12, String dcp,
                 double tdemandaponta, double tdemandaforadeponta, double tconsumoponta, double tconsumoforadeponta) {
        double soma12 = 0;

        if (Double.parseDouble(dcfp) * 1.05 > Double.parseDouble(dfp12)) { //normal
            soma12 = Double.parseDouble(dp12) * tdemandaponta + Double.parseDouble(dfp12) * tdemandaforadeponta +
                    Double.parseDouble(cp12) * tconsumoponta + Double.parseDouble(cfp12) * tconsumoforadeponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp12) && Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp12)) {//os dois passaram
            soma12 = Double.parseDouble(dp12) * tdemandaponta + Double.parseDouble(dfp12) * tdemandaforadeponta +
                    Double.parseDouble(cp12) * tconsumoponta + Double.parseDouble(cfp12) * tconsumoforadeponta +
                    (Double.parseDouble(dp12) - Double.parseDouble(dcp)) * 2 * tdemandaponta +
                    (Double.parseDouble(dfp12) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;

        } else if (Double.parseDouble(dcp) * 1.05 < Double.parseDouble(dp12)) {//so um passou
            soma12 = Double.parseDouble(dp12) * tdemandaponta + Double.parseDouble(dfp12) * tdemandaforadeponta +
                    Double.parseDouble(cp12) * tconsumoponta + Double.parseDouble(cfp12) * tconsumoforadeponta +
                    (Double.parseDouble(dp12) - Double.parseDouble(dcp)) * 2 * tdemandaponta;

        } else if (Double.parseDouble(dcfp) * 1.05 < Double.parseDouble(dfp12)) { //so um passou
            soma12 = Double.parseDouble(dp12) * tdemandaponta + Double.parseDouble(dfp12) * tdemandaforadeponta +
                    Double.parseDouble(cp12) * tconsumoponta + Double.parseDouble(cfp12) * tconsumoforadeponta +
                    (Double.parseDouble(dfp12) - Double.parseDouble(dcfp)) * 2 * tdemandaforadeponta;
        }

        return soma12;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_azul, menu);
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

