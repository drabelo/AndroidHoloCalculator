package com.drabelo.holocalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Calculator calc = new Calculator();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	

	}

	// Listener object to handle the click events

	public void ButtonOnClick(View v) {
		TextView textBox = (TextView) findViewById(R.id.previous);
		TextView answer = (TextView) findViewById(R.id.textView);
		TextView bucket = (TextView) findViewById(R.id.bucket);
		switch (v.getId()) {
		case R.id.button1:
			textBox.setText(textBox.getText() + "1");
			bucket.setText(bucket.getText() + "1");
			break;
		case R.id.button2:
			textBox.setText(textBox.getText() + "2");
			bucket.setText(bucket.getText() + "2");
			break;

		case R.id.button3:
			textBox.setText(textBox.getText() + "3");
			bucket.setText(bucket.getText() + "3");
			break;
		case R.id.button4:
			textBox.setText(textBox.getText() + "4");
			bucket.setText(bucket.getText() + "4");
			break;

		case R.id.button5:
			textBox.setText(textBox.getText() + "5");
			bucket.setText(bucket.getText() + "5");
			break;
		case R.id.button6:
			textBox.setText(textBox.getText() + "6");
			bucket.setText(bucket.getText() + "6");
			break;

		case R.id.button7:
			textBox.setText(textBox.getText() + "7");
			bucket.setText(bucket.getText() + "7");
			break;
		case R.id.button8:
			textBox.setText(textBox.getText() + "8");
			bucket.setText(bucket.getText() + "8");
			break;

		case R.id.button9:
			textBox.setText(textBox.getText() + "9");
			bucket.setText(bucket.getText() + "9");
			break;
		case R.id.button0:
			textBox.setText(textBox.getText() + "0");
			bucket.setText(bucket.getText() + "0");
			break;

		case R.id.buttonSum:
			calc.add(Double.parseDouble(String.valueOf(bucket.getText())));
			bucket.setText("");
			textBox.setText(textBox.getText() + " + ");
			calc.sum();
			break;
		case R.id.buttonMultiply:
			calc.add(Double.parseDouble(String.valueOf(bucket.getText())));
			bucket.setText("");
			textBox.setText(textBox.getText() + " x ");
			calc.multiply();
			break;
		case R.id.buttonDivide:
			calc.add(Double.parseDouble(String.valueOf(bucket.getText())));
			bucket.setText("");
			textBox.setText(textBox.getText() + " Ö ");
			calc.divide();
			break;
		case R.id.buttonMinus:
			calc.add(Double.parseDouble(String.valueOf(bucket.getText())));
			bucket.setText("");
			textBox.setText(textBox.getText() + " - ");
			calc.subtract();
			break;
		case R.id.buttonEquals:
			calc.add(Double.parseDouble(String.valueOf(bucket.getText())));
			answer.setText("= " + calc.equals());
			setEnabled(false);
			break;

		case R.id.buttonClear:
			bucket.setText("");
			textBox.setText("");
			answer.setText("");
			setEnabled(true);
		default:
			break;
		}
	}
	
	public void setEnabled(Boolean state)
	{

		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button3 = (Button) findViewById(R.id.button3);
		Button button4 = (Button) findViewById(R.id.button4);
		Button button5 = (Button) findViewById(R.id.button5);
		Button button6 = (Button) findViewById(R.id.button6);
		Button button7 = (Button) findViewById(R.id.button7);
		Button button8 = (Button) findViewById(R.id.button8);
		Button button9 = (Button) findViewById(R.id.button9);
		Button button0 = (Button) findViewById(R.id.button0);
		Button buttonSum = (Button) findViewById(R.id.buttonSum);
		Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
		Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
		Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
		Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
		if(state == false)
		{
			button0.setEnabled(false);
			button1.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
			button4.setEnabled(false);
			button5.setEnabled(false);
			button6.setEnabled(false);
			button7.setEnabled(false);
			button8.setEnabled(false);
			button9.setEnabled(false);
			buttonSum.setEnabled(false);
			buttonMultiply.setEnabled(false);
			buttonDivide.setEnabled(false);
			buttonMinus.setEnabled(false);
			buttonEquals.setEnabled(false);
		}else if(state == true)
		{
			button0.setEnabled(true);
			button1.setEnabled(true);
			button2.setEnabled(true);
			button3.setEnabled(true);
			button4.setEnabled(true);
			button5.setEnabled(true);
			button6.setEnabled(true);
			button7.setEnabled(true);
			button8.setEnabled(true);
			button9.setEnabled(true);
			buttonSum.setEnabled(true);
			buttonMultiply.setEnabled(true);
			buttonDivide.setEnabled(true);
			buttonMinus.setEnabled(true);
			buttonEquals.setEnabled(true);
		}else{}
	}
	

}
