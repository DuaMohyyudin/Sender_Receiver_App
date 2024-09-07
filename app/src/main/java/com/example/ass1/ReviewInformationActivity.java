package com.example.ass1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;

public class ReviewInformationActivity extends AppCompatActivity {

    private TextView senderNameView, senderContactView, senderCountryView, senderAddressView;
    private TextView receiverNameView, receiverContactView, receiverCountryView, receiverAddressView;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_information);

        // Get data from the intent
        Intent intent = getIntent();
        String senderName = intent.getStringExtra("sender_name");
        String senderContact = intent.getStringExtra("sender_contact");
        String senderCountry = intent.getStringExtra("sender_country");
        String senderAddress = intent.getStringExtra("sender_address");

        String receiverName = intent.getStringExtra("receiver_name");
        String receiverContact = intent.getStringExtra("receiver_contact");
        String receiverCountry = intent.getStringExtra("receiver_country");
        String receiverAddress = intent.getStringExtra("receiver_address");

        // Find the TextViews in the layout
        senderNameView = findViewById(R.id.sender_name);
        senderContactView = findViewById(R.id.sender_contact);
        senderCountryView = findViewById(R.id.sender_country);
        senderAddressView = findViewById(R.id.sender_address);

        receiverNameView = findViewById(R.id.receiver_name);
        receiverContactView = findViewById(R.id.receiver_contact);
        receiverCountryView = findViewById(R.id.receiver_country);
        receiverAddressView = findViewById(R.id.receiver_address);

        // Set the data to the TextViews
        senderNameView.setText(senderName);
        senderContactView.setText(senderContact);
        senderCountryView.setText(senderCountry);
        senderAddressView.setText(senderAddress);

        receiverNameView.setText(receiverName);
        receiverContactView.setText(receiverContact);
        receiverCountryView.setText(receiverCountry);
        receiverAddressView.setText(receiverAddress);

        // Find the Floating Action Button (FAB)
        fab = findViewById(R.id.fab);

        // Set an OnClickListener for the FAB to go back to the SenderActivity
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to navigate back to the SenderActivity
                Intent intent = new Intent(ReviewInformationActivity.this, SenderActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  // Clear the back stack
                startActivity(intent);
            }
        });
    }
}
