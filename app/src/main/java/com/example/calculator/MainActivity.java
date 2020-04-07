package com.example.calculator;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;


public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMult;
    Button buttonDiv;
    Button buttonClear;
    Button buttonDelete;
    Button buttonDot;
    Button buttonSign;
    Button buttonEqual;
    Calculator calc = new Calculator();
    double firstNum = 0;
    double secNum = 0;
    static double result = 0;
    String operation = "";
    boolean Flag = false;
    boolean decFlag = false;
    boolean oprFlag = false;
    boolean equalPressed = false;
    boolean zeroPressed = true;
    boolean contFlag = false;
    boolean operationButtonClikedBefore = false;
    boolean mathErrorFlag = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSubtract);
        buttonMult = (Button) findViewById(R.id.buttonMultiply);
        buttonDiv = (Button) findViewById(R.id.buttonDivision);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonSign = (Button) findViewById(R.id.buttonSign);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        textView.setText("0");


        try {

            View.OnClickListener numbersButtonListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // put condition as per id of view
                    operationButtonClikedBefore = false;
                    InputFilter[] filterArray = new InputFilter[1];
                    filterArray[0] = new InputFilter.LengthFilter(9);
                    textView.setFilters(filterArray);
                    if (!mathErrorFlag) {
                        switch (v.getId()) {

                            case R.id.button0: {


                                if (!Flag) {
                                    if (!zeroPressed) {
                                        String num = textView.getText() + "0";
                                        textView.setText(num);
                                    }


                                } else {
                                    Flag = false;
                                    textView.setText("");
                                    String num = textView.getText() + "0";
                                    textView.setText(num);
                                }

                                oprFlag = true;
                                if (!textView.getText().toString().contains("."))
                                    decFlag = false;
                                if (textView.getText().toString().charAt(0) != '0')
                                    zeroPressed = false;
                                else if (textView.getText().toString().charAt(0) == '0')
                                    zeroPressed = true;
                                break;
                            }


                            case R.id.button1: {

                                if (!Flag) {
                                    if (zeroPressed) {
                                        textView.setText("");
                                        textView.setText("1");
                                        zeroPressed = false;
                                    } else {
                                        String num = textView.getText() + "1";
                                        textView.setText(num);
                                    }
                                } else {

                                    Flag = false;
                                    textView.setText("");
                                    String num = textView.getText() + "1";
                                    textView.setText(num);
                                }

                                oprFlag = true;
                                if (!textView.getText().toString().contains("."))
                                    decFlag = false;
                                break;
                            }
                            case R.id.button2: {
                                //call textToSpeech for exercise two

                                if (!Flag) {
                                    if (zeroPressed) {
                                        textView.setText("");
                                        textView.setText("2");
                                        zeroPressed = false;
                                    } else {
                                        String num = textView.getText() + "2";
                                        textView.setText(num);
                                    }

                                } else {
                                    Flag = false;
                                    textView.setText("");
                                    String num = textView.getText() + "2";
                                    textView.setText(num);
                                }

                                oprFlag = true;
                                if (!textView.getText().toString().contains("."))
                                    decFlag = false;
                                break;
                            }
                            case R.id.button3:
                                //call textToSpeech for exercise two

                            {
                                if (!Flag) {
                                    if (zeroPressed) {
                                        textView.setText("");
                                        textView.setText("3");
                                        zeroPressed = false;
                                    } else {
                                        String num = textView.getText() + "3";
                                        textView.setText(num);
                                    }
                                } else {
                                    Flag = false;
                                    textView.setText("");
                                    String num = textView.getText() + "3";
                                    textView.setText(num);
                                }

                                oprFlag = true;
                                if (!textView.getText().toString().contains("."))
                                    decFlag = false;
                                break;
                            }

                            case R.id.button4:
                                //call textToSpeech for exercise two

                            {
                                if (!Flag) {
                                    if (zeroPressed) {
                                        textView.setText("");
                                        textView.setText("4");
                                        zeroPressed = false;
                                    } else {
                                        String num = textView.getText() + "4";
                                        textView.setText(num);
                                    }
                                } else {
                                    Flag = false;
                                    textView.setText("");
                                    String num = textView.getText() + "4";
                                    textView.setText(num);
                                }

                                oprFlag = true;
                                if (!textView.getText().toString().contains("."))
                                    decFlag = false;

                                break;
                            }
                            case R.id.button5:
                                //call textToSpeech for exercise two

                            {
                                if (!Flag) {
                                    if (zeroPressed) {
                                        textView.setText("");
                                        textView.setText("5");
                                        zeroPressed = false;
                                    } else {
                                        String num = textView.getText() + "5";
                                        textView.setText(num);
                                    }
                                } else {
                                    Flag = false;
                                    textView.setText("");
                                    String num = textView.getText() + "5";
                                    textView.setText(num);
                                }

                                oprFlag = true;
                                if (!textView.getText().toString().contains("."))
                                    decFlag = false;
                                break;
                            }
                            case R.id.button6:
                                //call textToSpeech for exercise two

                            {
                                if (!Flag) {
                                    if (zeroPressed) {
                                        textView.setText("");
                                        textView.setText("6");
                                        zeroPressed = false;
                                    } else {
                                        String num = textView.getText() + "6";
                                        textView.setText(num);
                                    }
                                } else {
                                    Flag = false;
                                    textView.setText("");
                                    String num = textView.getText() + "6";
                                    textView.setText(num);
                                }

                                oprFlag = true;
                                if (!textView.getText().toString().contains("."))
                                    decFlag = false;
                                break;
                            }
                            case R.id.button7:
                                //call textToSpeech for exercise two

                            {
                                if (!Flag) {
                                    if (zeroPressed) {
                                        textView.setText("");
                                        textView.setText("7");
                                        zeroPressed = false;
                                    } else {
                                        String num = textView.getText() + "7";
                                        textView.setText(num);
                                    }

                                } else {
                                    Flag = false;
                                    textView.setText("");
                                    String num = textView.getText() + "7";
                                    textView.setText(num);
                                }

                                oprFlag = true;
                                if (!textView.getText().toString().contains("."))
                                    decFlag = false;
                                break;
                            }
                            case R.id.button8:
                                //call textToSpeech for exercise two

                            {
                                if (!Flag) {
                                    if (zeroPressed) {
                                        textView.setText("");
                                        textView.setText("8");
                                        zeroPressed = false;
                                    } else {
                                        String num = textView.getText() + "8";
                                        textView.setText(num);
                                    }
                                } else {
                                    Flag = false;
                                    textView.setText("");
                                    String num = textView.getText() + "8";
                                    textView.setText(num);
                                }

                                oprFlag = true;
                                if (!textView.getText().toString().contains("."))
                                    decFlag = false;
                                break;
                            }
                            case R.id.button9:
                                //call textToSpeech for exercise two

                            {
                                if (!Flag) {
                                    if (zeroPressed) {
                                        textView.setText("");
                                        textView.setText("9");
                                        zeroPressed = false;
                                    } else {
                                        String num = textView.getText() + "9";
                                        textView.setText(num);
                                    }
                                } else {
                                    Flag = false;
                                    textView.setText("");
                                    String num = textView.getText() + "9";
                                    textView.setText(num);
                                }

                                oprFlag = true;
                                if (!textView.getText().toString().contains("."))
                                    decFlag = false;
                                break;
                            }

                            case R.id.buttonDot:
                                //call textToSpeech for exercise two
                            {
                                if (!decFlag) {
                                    textView.setText(textView.getText() + ".");
                                    decFlag = true;
                                }
                                break;
                            }
                            default:
                                break;
                        }
                        equalPressed = false;
                    }
                }
            };

            button0.setOnClickListener(numbersButtonListener);
            button1.setOnClickListener(numbersButtonListener);
            button2.setOnClickListener(numbersButtonListener);
            button3.setOnClickListener(numbersButtonListener);
            button4.setOnClickListener(numbersButtonListener);
            button5.setOnClickListener(numbersButtonListener);
            button6.setOnClickListener(numbersButtonListener);
            button7.setOnClickListener(numbersButtonListener);
            button8.setOnClickListener(numbersButtonListener);
            button9.setOnClickListener(numbersButtonListener);
            buttonDot.setOnClickListener(numbersButtonListener);

            View.OnClickListener operationButtonsListener = new View.OnClickListener() {
                public void onClick(View v) {
                    // do something when the button is clicked
                    if (!mathErrorFlag) {
                        switch (v.getId()) {
                            case R.id.buttonAdd:
                                //call textToSpeech for exercise one
                            {
                                String answer;
                                if (!contFlag) {
                                    if (oprFlag) {
                                        firstNum = Double.parseDouble(textView.getText().toString());
                                        operation = "+";
                                        Flag = true;
                                        decFlag = false;
                                        operationButtonClikedBefore = true;
                                        contFlag = true;
                                    }
                                } else {
                                    if (!operationButtonClikedBefore) {

                                        if ("+".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.add(firstNum, secNum);
                                            BigDecimal bd = new BigDecimal(result);
                                            String ans = String.valueOf(bd);
                                            //answer = String.valueOf(result);
                                            textView.setText(ans);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "+";
                                            operationButtonClikedBefore = true;
                                        } else if ("-".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.subtract(firstNum, secNum);


                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "+";
                                            operationButtonClikedBefore = true;
                                        } else if ("*".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.multiply(firstNum, secNum);


                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "+";
                                            operationButtonClikedBefore = true;
                                        } else if ("/".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.divide(firstNum, secNum);


                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "+";
                                            operationButtonClikedBefore = true;
                                        }
                                    }
                                }
                                break;
                            }
                            case R.id.buttonSubtract:
                                //call textToSpeech for exercise two
                            {
                                String answer;
                                if (!contFlag) {
                                    if (oprFlag) {
                                        firstNum = Double.parseDouble(textView.getText().toString());
                                        operation = "-";
                                        Flag = true;
                                        decFlag = false;
                                        contFlag = true;
                                        operationButtonClikedBefore = true;
                                    }
                                } else {
                                    if (!operationButtonClikedBefore) {

                                        if ("+".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.add(firstNum, secNum);


                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "-";
                                            operationButtonClikedBefore = true;
                                        } else if ("-".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.subtract(firstNum, secNum);


                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "-";
                                            operationButtonClikedBefore = true;
                                        } else if ("*".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.multiply(firstNum, secNum);


                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "-";
                                            operationButtonClikedBefore = true;
                                        } else if ("/".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.divide(firstNum, secNum);
                                            result = calc.subtract(firstNum, secNum);

                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "-";
                                            operationButtonClikedBefore = true;
                                        }
                                    }
                                }
                                break;
                            }
                            case R.id.buttonMultiply:
                                //call textToSpeech for exercise two
                            {
                                String answer;
                                if (!contFlag) {
                                    if (oprFlag) {
                                        firstNum = Double.parseDouble(textView.getText().toString());
                                        operation = "*";
                                        Flag = true;
                                        decFlag = false;
                                        operationButtonClikedBefore = true;
                                        contFlag = true;
                                    }
                                } else {
                                    if (!operationButtonClikedBefore) {

                                        if ("+".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.add(firstNum, secNum);


                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "*";
                                            operationButtonClikedBefore = true;
                                        } else if ("-".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.subtract(firstNum, secNum);


                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "*";
                                            operationButtonClikedBefore = true;
                                        } else if ("*".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.multiply(firstNum, secNum);

                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "*";
                                            operationButtonClikedBefore = true;
                                        } else if ("/".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.divide(firstNum, secNum);


                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "*";
                                            operationButtonClikedBefore = true;
                                        }
                                    }
                                }
                                break;
                            }
                            case R.id.buttonDivision:
                                //call textToSpeech for exercise two
                            {
                                String answer;
                                if (!contFlag) {

                                    if (oprFlag) {
                                        firstNum = Double.parseDouble(textView.getText().toString());
                                        operation = "/";
                                        Flag = true;
                                        decFlag = false;
                                        operationButtonClikedBefore = true;
                                        contFlag = true;
                                    }
                                } else {
                                    if (!operationButtonClikedBefore) {

                                        if ("+".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.add(firstNum, secNum);


                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "/";
                                            operationButtonClikedBefore = true;
                                        } else if ("-".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.subtract(firstNum, secNum);

                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "/";
                                            operationButtonClikedBefore = true;
                                        } else if ("*".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.multiply(firstNum, secNum);
                                            BigDecimal bd = new BigDecimal(result);
                                            String ans = String.valueOf(bd);
                                            //answer = String.valueOf(result);
                                            textView.setText(ans);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "/";
                                            operationButtonClikedBefore = true;
                                        } else if ("/".equals(operation)) {
                                            secNum = Double.parseDouble(textView.getText().toString());
                                            result = calc.divide(firstNum, secNum);

                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = result;
                                            secNum = 0;
                                            result = 0;
                                            Flag = true;
                                            operation = "/";
                                            operationButtonClikedBefore = true;
                                        }
                                    }
                                }
                                break;
                            }
                            case R.id.buttonEqual:
                                //call textToSpeech for exercise two
                            {

                                try {

                                    if (oprFlag) {
                                        String answer;
                                        secNum = Double.parseDouble(textView.getText().toString());
                                        equalPressed = true;
                                        contFlag = false;
                                        if ("+".equals(operation)) {
                                            result = calc.add(firstNum, secNum);

                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = 0;
                                            secNum = 0;
                                            result = 0;
                                            operation = "";
                                            Flag = true;
                                            contFlag = false;
                                        } else if ("-".equals(operation)) {
                                            result = calc.subtract(firstNum, secNum);
                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = 0;
                                            secNum = 0;
                                            result = 0;
                                            operation = "";
                                            Flag = true;
                                        } else if ("*".equals(operation)) {
                                            result = calc.multiply(firstNum, secNum);
                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);
                                            firstNum = 0;
                                            secNum = 0;
                                            result = 0;
                                            operation = "";
                                            Flag = true;
                                        } else if ("/".equals(operation)) {

                                            result = calc.divide(firstNum, secNum);

                                            answer = String.valueOf(result);
                                            int len = 0;
                                            len = answer.length();
                                            InputFilter[] filterArray = new InputFilter[1];
                                            filterArray[0] = new InputFilter.LengthFilter(len);
                                            textView.setFilters(filterArray);
                                            textView.setText(answer);

                                            firstNum = 0;
                                            secNum = 0;
                                            result = 0;
                                            operation = "";
                                            Flag = true;
                                        }


                                    }

                                    if (textView.getText().toString().contains("."))
                                        decFlag = true;

                                    else
                                        decFlag = false;
                                } catch (RuntimeException e) {
                                    InputFilter[] filterArray = new InputFilter[1];
                                    filterArray[0] = new InputFilter.LengthFilter(10);
                                    textView.setFilters(filterArray);
                                    textView.setText("Math Error");
                                    mathErrorFlag = true;
                                }
                                ;
                                break;
                            }
                            default:
                                break;
                        }
                    }
                }
            };
            buttonAdd.setOnClickListener(operationButtonsListener);
            buttonSub.setOnClickListener(operationButtonsListener);
            buttonDiv.setOnClickListener(operationButtonsListener);
            buttonMult.setOnClickListener(operationButtonsListener);
            buttonEqual.setOnClickListener(operationButtonsListener);


            View.OnClickListener ButtonsListener3 = new View.OnClickListener() {
                public void onClick(View v) {
                    // do something when the button is clicked
                    switch (v.getId()) {
                        case R.id.buttonClear: {
                            textView.setText("0");
                            zeroPressed = true;
                            contFlag = false;
                            equalPressed = false;
                            oprFlag = false;
                            operationButtonClikedBefore = false;
                            mathErrorFlag = false;
                            break;
                        }
                        case R.id.buttonDelete: {
                            if (!mathErrorFlag) {
                                if (!equalPressed) {
                                    String text = textView.getText().toString();
                                    if (text.length() > 1) {

                                        text = text.substring(0, text.length() - 1);
                                        textView.setText(text);
                                    } else if (text.length() <= 1)
                                        textView.setText("0");
                                    zeroPressed = true;
                                    contFlag = false;
                                    equalPressed = false;
                                    oprFlag = false;
                                    operationButtonClikedBefore = false;
                                }

                                break;
                            }
                        }
                        case R.id.buttonSign: {
                            if (!mathErrorFlag) {
                                if (oprFlag) {
                                    InputFilter[] filterArray = new InputFilter[1];
                                    if (!textView.getText().toString().contains("-")) {

                                        filterArray[0] = new InputFilter.LengthFilter(10);
                                        textView.setFilters(filterArray);
                                    } else {
                                        filterArray[0] = new InputFilter.LengthFilter(9);
                                        textView.setFilters(filterArray);
                                    }

//                            firstNum = Double.parseDouble(textView.getText().toString().replaceAll(",", ""))*-1 ;
//                            BigDecimal bd = new BigDecimal(firstNum);
//                            DecimalFormat formatter = new DecimalFormat("#,###,###");
//                            String yourFormattedAnswer = formatter.format(bd);
//                            textView.setText(yourFormattedAnswer);
                                    firstNum = Double.parseDouble(textView.getText().toString()) * -1;
                                    BigDecimal bd = new BigDecimal(firstNum);
                                    String answer = String.valueOf(bd);
                                    textView.setText(answer);


                                }
                                break;
                            }
                        }
                        //call textToSpeech for exercise one

                        default:
                            break;
                    }
                }
            };

            buttonClear.setOnClickListener(ButtonsListener3);
            buttonDelete.setOnClickListener(ButtonsListener3);
            buttonSign.setOnClickListener(ButtonsListener3);

        } catch (Exception e) {
            InputFilter[] filterArray = new InputFilter[1];
            filterArray[0] = new InputFilter.LengthFilter(10);
            textView.setFilters(filterArray);
            textView.setText("Math Error");
        }
    }
}
