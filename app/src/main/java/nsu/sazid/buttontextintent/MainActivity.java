package nsu.sazid.buttontextintent;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main);
        }
        else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_main);
        }
        //Toast.makeText(MainActivity.this, "from create", Toast.LENGTH_SHORT).show();
        //finish(); to destroy a screen just after starting it
        //Button bt= (Button)findViewById(R.id.button1);

        Button button1 = (Button) findViewById(R.id.button1);// dhaka
        Button button2 = (Button) findViewById(R.id.button2);// Sylhet
        Button button3 = (Button) findViewById(R.id.button3);// Khulna
        Button button4 = (Button) findViewById(R.id.button4);// barisal
        Button button5 = (Button) findViewById(R.id.button5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent dhaka = new Intent("nsu.sazid.buttontextintent.Main2Activity");// Dhaka
                startActivity(dhaka);
                break;
            case R.id.button2:
                Intent sylhet = new Intent("nsu.sazid.buttontextintent.Main3Activity");// Sylhet
                startActivity(sylhet);
                break;
            case R.id.button3:
                Intent khulna = new Intent("nsu.sazid.buttontextintent.Main4Activity");// Khulna
                startActivity(khulna);
                break;
            case R.id.button4:
                Intent barisal = new Intent("nsu.sazid.buttontextintent.Main5Activity");// Barisal
                startActivity(barisal);
                break;
            case R.id.button5:
                Intent contact = new Intent("nsu.sazid.buttontextintent.Main6Activity");// contact
                startActivity(contact);
                break;
            }
        }
    }

