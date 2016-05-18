package nsu.sazid.buttontextintent;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main4Activity extends AppCompatActivity {
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView tv3 = (TextView) findViewById(R.id.khulna);
        AssetManager am = getAssets();
        try {
            InputStream is = am.open("khulna.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String st = "";
            StringBuilder sb = new StringBuilder();
            while ((st = br.readLine()) != null)
                sb.append(st + "\n");
            tv3.setText(sb.toString());
            br.close();

        }
        catch (IOException e) {
            tv3.setText(e.toString());
        }

    }
}
