package pk.edu.pucit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity {
    TextView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn00, btnBack, btnReset, btnDot, btnEqual, btnAdd, btnSub, btnMultiply, btnPercent, btnDivide, equation, result;
    String input,lastChar;
    boolean isDotExixtForValue=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);

        btn0 = findViewById(R.id.oneZero);
        btn00 = findViewById(R.id.twoZero);
        btnDot = findViewById(R.id.dot);

        btnBack = findViewById(R.id.back);
        btnReset = findViewById(R.id.reset);
        btnEqual = findViewById(R.id.equal);

        btnPercent = findViewById(R.id.percent);

        btnDivide = findViewById(R.id.divide);
        btnMultiply = findViewById(R.id.multiply);
        btnAdd = findViewById(R.id.add);
        btnSub = findViewById(R.id.sub);

        equation = findViewById(R.id.tv_equation);
        result = findViewById(R.id.tv_result);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText("");
                result.setText("0");
                isDotExixtForValue=false;
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText().toString() + "9");
            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText().toString() + "00");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!equation.getText().toString().equals(""))
                {
                    input = equation.getText().toString();
                    lastChar = input.substring(input.length()-1);
                    if (!lastChar.equals("+") && !lastChar.equals("-") && !lastChar.equals("*") && !lastChar.equals("/") && !lastChar.equals("%")){
                        equation.setText(equation.getText().toString() + "+");
                        isDotExixtForValue=false;
                    }
                }
                else
                {
                    equation.setText("");
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!equation.getText().toString().equals(""))
                {
                    input = equation.getText().toString();
                    lastChar = input.substring(input.length()-1);
                    if (!lastChar.equals("+") && !lastChar.equals("-") && !lastChar.equals("*") && !lastChar.equals("/") && !lastChar.equals("%")){
                        equation.setText(equation.getText().toString() + "-");
                        isDotExixtForValue=false;
                    }
                }
                else
                {
                    equation.setText("");
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!equation.getText().toString().equals(""))
                {
                    input = equation.getText().toString();
                    lastChar = input.substring(input.length()-1);
                    if (!lastChar.equals("+") && !lastChar.equals("-") && !lastChar.equals("*") && !lastChar.equals("/") && !lastChar.equals("%")){
                        equation.setText(equation.getText().toString() + "*");
                        isDotExixtForValue=false;
                    }
                }
                else
                {
                    equation.setText("");
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!equation.getText().toString().equals(""))
                {
                    input = equation.getText().toString();
                    lastChar = input.substring(input.length()-1);
                    if (!lastChar.equals("+") && !lastChar.equals("-") && !lastChar.equals("*") && !lastChar.equals("/") && !lastChar.equals("%")){
                        equation.setText(equation.getText().toString() + "/");
                        isDotExixtForValue=false;
                    }
                }
                else
                {
                    equation.setText("");
                }
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!equation.getText().toString().equals(""))
                {
                    input = equation.getText().toString();
                    lastChar = input.substring(input.length()-1);
                    if (!lastChar.equals("+") && !lastChar.equals("-") && !lastChar.equals("*") && !lastChar.equals("/") && !lastChar.equals("%")){
                        equation.setText(equation.getText().toString() + "%");
                        isDotExixtForValue=false;
                    }
                }
                else
                {
                    equation.setText("");
                }
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!equation.getText().toString().equals("")) {
                    if(!isDotExixtForValue)
                    {
                        input = equation.getText().toString();
                        lastChar = input.substring(input.length()-1);
                        if (lastChar.equals("+") || lastChar.equals("-") || lastChar.equals("*") || lastChar.equals("/") || lastChar.equals("%"))
                        {
                            equation.setText(equation.getText().toString() + "0.");
                            isDotExixtForValue=true;
                        }
                        else
                        {
                            equation.setText(equation.getText().toString() + ".");
                            isDotExixtForValue=true;
                        }
                    }
                }
                else
                {
                    equation.setText(equation.getText().toString() + "0.");
                    isDotExixtForValue=true;
                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!equation.getText().toString().equals("")) {
                    input = equation.getText().toString();
                    lastChar = input.substring(input.length()-1);
                    if(lastChar.equals("."))
                    {
                        isDotExixtForValue=false;
                    }
                    input = input.substring(0, input.length() - 1);
                    equation.setText(input + "");
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!equation.getText().toString().equals("")) {
                    input = equation.getText().toString();
                    lastChar = input.substring(input.length()-1);
                    if (!lastChar.equals("+") && !lastChar.equals("-") && !lastChar.equals("*") && !lastChar.equals("/") && !lastChar.equals("%") && !lastChar.equals(".")){
                        input = equation.getText().toString();
                        input = input.replaceAll("%","/100*");

                        Expression expression = new ExpressionBuilder(input).build();
                        try {
                            // Calculate the result and display
                            double res = expression.evaluate();
                            result.setText(Double.toString(res));
                        } catch (ArithmeticException ex) {
                            // Display an error message
                            result.setText("Error");
                        }
                    }
                }
            }
        });
    }
}