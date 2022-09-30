package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private enum Operator {none,add,minus,multiply,divide}
    private double data1=0, data2=0;
    private Operator optr = Operator.none;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void btn0Click(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText(newText.getText()+"0");
    }
    public void btn1Click(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText(newText.getText()+"1");
    }
    public void btn2Click(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText(newText.getText()+"2");
    }
    public void btn3Click(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText(newText.getText()+"3");
    }
    public void btn4Click(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText(newText.getText()+"4");
    }
    public void btn5Click(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText(newText.getText()+"5");
    }
    public void btn6Click(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText(newText.getText()+"6");
    }
    public void btn7Click(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText(newText.getText()+"7");
    }
    public void btn8Click(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText(newText.getText()+"8");
    }
    public void btn9Click(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText(newText.getText()+"9");
    }
    public void btnDotClick(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText(newText.getText()+".");
    }
    public void btnAddClick(View view){
        optr = Operator.add;
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(newText.getText().toString());
        newText.setText("");
    }
    public void btnSubtractClick(View view){
        optr = Operator.minus;
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(newText.getText().toString());
        newText.setText("");

    }
    public void btnMultiplyClick(View view){
        optr = Operator.multiply;
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(newText.getText().toString());
        newText.setText("");

    }
    public void btnDivideClick(View view){
        optr = Operator.divide;
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(newText.getText().toString());
        newText.setText("");

    }
    public void btnClearClick(View view){
        EditText newText = (EditText)findViewById(R.id.resultEdit);
        newText.setText("");
    }
    public void btnResultClick(View view){
        if (optr != Operator.none) {
            EditText newText = (EditText) findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(newText.getText().toString());
            double result = 0;
            if (optr == Operator.add) {
                result = data1 + data2;
            } else if (optr == Operator.minus) {
                result = data1 - data2;
            } else if (optr == Operator.multiply) {
                result = data1 * data2;
            } else if (optr == Operator.divide) {
                result = data1 / data2;
            }
            optr = Operator.none;
            data1 = result;
            if (result - (int) result == 0) {
                newText.setText(String.valueOf((int) result));
            } else {
                newText.setText(String.valueOf(result));
            }

        }
    }
   /**public void btnNumberClick(View view){}
       int buttonId = view.getId();
       EditText newText = (EditText)findViewById(R.id.resultEdit);
       newText.setText(newText.getText()+(Button)findViewById(buttonId).text);
   }**/

}