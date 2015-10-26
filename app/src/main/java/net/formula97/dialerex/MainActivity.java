package net.formula97.dialerex;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText dialBox = (EditText) findViewById(R.id.dialBox);
        Button callBtn = (Button) findViewById(R.id.callBtn);
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNo = dialBox.getText().toString();
                Uri uri = Uri.parse("tel:" + phoneNo);
                Intent i = new Intent(Intent.ACTION_CALL, uri);
                startActivity(i);
            }
        });

        Button dialBtn = (Button) findViewById(R.id.dialBtn);
        dialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNo = dialBox.getText().toString();
                Uri uri = Uri.parse("tel:" + phoneNo);
                Intent i = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(i);
            }
        });

    }
}
