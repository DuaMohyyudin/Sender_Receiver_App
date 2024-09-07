package com.example.ass1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SenderActivity extends AppCompatActivity {
    private EditText emailInput,fullNameInput,contactInfoInput,countryInput,addressInput;
    private Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        emailInput=findViewById(R.id.email_input);
        fullNameInput=findViewById(R.id.full_name);
        contactInfoInput=findViewById(R.id.contact_info);
        countryInput=findViewById(R.id.country);
        addressInput=findViewById(R.id.address_info);
        nextButton=findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateFields();
            }
        });

    }
    private void validateFields()
    {
        String email = emailInput.getText().toString().trim();
        String fullName = fullNameInput.getText().toString().trim();
        String contactInfo = contactInfoInput.getText().toString().trim();
        String country = countryInput.getText().toString().trim();
        String address = addressInput.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            showToast("Please enter your Email");
            return;
        }

        if (TextUtils.isEmpty(fullName)) {
            showToast("Please enter your Full Name");
            return;
        }

        if (TextUtils.isEmpty(contactInfo)) {
            showToast("Please enter your Contact Information");
            return;
        }

        if (TextUtils.isEmpty(country)) {
            showToast("Please enter your Country");
            return;
        }

        if (TextUtils.isEmpty(address)) {
            showToast("Please enter your Address");
            return;
        }

        // If all fields are valid, navigate to ReceiverActivity
        Intent intent = new Intent(SenderActivity.this, RecieverActivity.class);
        intent.putExtra("sender_name", fullName);
        intent.putExtra("sender_email", email);
        intent.putExtra("sender_contact", contactInfo);
        intent.putExtra("sender_country", country);
        intent.putExtra("sender_address", address);
        startActivity(intent);

    }
    private void showToast(String message){
        Toast.makeText(SenderActivity.this,message,Toast.LENGTH_LONG).show();
    }
}