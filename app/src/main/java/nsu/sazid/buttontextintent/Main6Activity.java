package nsu.sazid.buttontextintent;

import android.app.ActionBar;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener {
    private static int PICK_CONTACT=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button button101 = (Button) findViewById(R.id.button101);
        Button button102 = (Button) findViewById(R.id.button102);
        Button button103 = (Button) findViewById(R.id.button103);
        Button button104 = (Button) findViewById(R.id.button104); // website
        Button button105 = (Button) findViewById(R.id.button105);// telephone


        button101.setOnClickListener(this);
        button102.setOnClickListener(this);
        button103.setOnClickListener(this);
        button104.setOnClickListener(this);
        button105.setOnClickListener(this);

    }
    @Override

    public void onClick(View v){
        switch (v.getId()){
            case R.id.button104:
                Intent web= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
                startActivity(web);
                break;
            case R.id.button105:
                Intent telephone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+8801973001727"));
                startActivity(telephone);
                break;
            case R.id.button102:
                //Intent phonebook = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                //startActivityForResult(phonebook, PICK_CONTACT);
                //break;
                Intent phonebook = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                startActivity(phonebook);
                break;
            case R.id.button101:
            Intent camera = new Intent("android.media.action.IMAGE_CAPTURE");
            startActivity(camera);
                break;
            case R.id.button103:
                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                //startActivity(emailIntent);
                startActivity(Intent.createChooser(emailIntent, "Send your email in:"));
                break;
        }
    }

    /*@Override
    // code of opening contact list

    protected void onActivityResult(int reqCode, int resultCode, Intent data){
        super.onActivityResult(reqCode, resultCode, data);

        if(reqCode== PICK_CONTACT){
            if (resultCode== AppCompatActivity.RESULT_OK)
            {
                Uri contactData= data.getData();
                Cursor c= getContentResolver().query(contactData, null, null, null, null);

                if(c.moveToFirst()){
                    String name= c.getString(c.getColumnIndexOrThrow(ContactsContract.Contacts.DISPLAY_NAME));
                    Toast.makeText(this, "You have picked: "+ name, Toast.LENGTH_LONG).show();
                }
            }
        }
    }*/
}



