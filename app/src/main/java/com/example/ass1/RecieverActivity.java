package com.example.ass1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RecieverActivity extends AppCompatActivity {

    private EditText emailInput, fullNameInput, contactInfoInput, countryInput, addressInput;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);


        emailInput = findViewById(R.id.email_input);
        fullNameInput = findViewById(R.id.full_name);
        contactInfoInput = findViewById(R.id.contact_info);
        countryInput = findViewById(R.id.country);
        addressInput = findViewById(R.id.address_info);
        nextButton = findViewById(R.id.next_button);

        Intent senderIntent = getIntent();
        String senderName = senderIntent.getStringExtra("sender_name");
        String senderEmail = senderIntent.getStringExtra("sender_email");
        String senderContact = senderIntent.getStringExtra("sender_contact");
        String senderCountry = senderIntent.getStringExtra("sender_country");
        String senderAddress = senderIntent.getStringExtra("sender_address");



        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateFields(senderName, senderContact, senderCountry, senderAddress);
            }
        });
    }


    private void validateFields(String senderName, String senderContact, String senderCountry, String senderAddress) {
        String recieverEmail = emailInput.getText().toString().trim();
        String recieverName = fullNameInput.getText().toString().trim();
        String recieverContact = contactInfoInput.getText().toString().trim();
        String recieverCountry = countryInput.getText().toString().trim();
        String recieverAddress = addressInput.getText().toString().trim();


        if (TextUtils.isEmpty(recieverEmail)) {
            showToast("Please enter your Email");
            return;
        }

        if (TextUtils.isEmpty(recieverName)) {
            showToast("Please enter your Full Name");
            return;
        }

        if (TextUtils.isEmpty(recieverContact)) {
            showToast("Please enter your Contact Information");
            return;
        }

        if (TextUtils.isEmpty(recieverCountry)) {
            showToast("Please enter your Country");
            return;
        }

        if (TextUtils.isEmpty(recieverAddress)) {
            showToast("Please enter your Address");
            return;
        }

        Intent intent = new Intent(RecieverActivity.this, ReviewInformationActivity.class);
        intent.putExtra("sender_name", senderName);
        intent.putExtra("sender_contact", senderContact);
        intent.putExtra("sender_country", senderCountry);
        intent.putExtra("sender_address", senderAddress);

        intent.putExtra("receiver_name", recieverName);  // Corrected
        intent.putExtra("receiver_contact", recieverContact);  // Corrected
        intent.putExtra("receiver_country", recieverCountry);  // Corrected
        intent.putExtra("receiver_address", recieverAddress);  // Corrected
        startActivity(intent);
    }


    private void showToast(String message) {
        Toast.makeText(RecieverActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
