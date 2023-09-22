package com.example.task_organizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class contact extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    ImageButton facebookButton = findViewById(R.id.facebook_button);
    ImageButton githubButton = findViewById(R.id.github_button);
    ImageButton gmailButton = findViewById(R.id.gmail_button);

// Add click listeners to the buttons
facebookButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Open the Facebook website
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
            startActivity(intent);
        }
    });

githubButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Open the GitHub website
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/"));
            startActivity(intent);
        }
    });

gmailButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Open the Gmail website
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/"));
            startActivity(intent);
        }
    });
}