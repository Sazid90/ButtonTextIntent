package nsu.sazid.buttontextintent;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv1 = (TextView) findViewById(R.id.dhaka);
        AssetManager am = getAssets();
        try {
            InputStream is = am.open("dhaka.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String st = "";
            StringBuilder sb = new StringBuilder();
            while ((st = br.readLine()) != null)
                sb.append(st + "\n");
            tv1.setText(sb.toString());
            br.close();

        }
        catch (IOException e) {
            tv1.setText(e.toString());
        }

    }
}
