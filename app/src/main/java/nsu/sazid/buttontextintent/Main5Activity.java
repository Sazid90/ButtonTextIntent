package nsu.sazid.buttontextintent;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main5Activity extends AppCompatActivity {
    TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        TextView tv4 = (TextView) findViewById(R.id.bari);
        AssetManager am = getAssets();
        try {
            InputStream is = am.open("barisal.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String st = "";
            StringBuilder sb = new StringBuilder();
            while ((st = br.readLine()) != null)
                sb.append(st + "\n");
            tv4.setText(sb.toString());
            br.close();

        }
        catch (IOException e) {
            tv4.setText(e.toString());
        }
    }
}
