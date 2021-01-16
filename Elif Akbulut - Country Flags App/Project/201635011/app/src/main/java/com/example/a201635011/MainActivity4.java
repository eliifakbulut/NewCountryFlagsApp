package com.example.a201635011;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.icu.number.Scale;
import android.media.Image;
import android.opengl.Matrix;
import android.os.Bundle;
import android.util.Size;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.a201635011.MainActivity2.questions;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TableLayout tableLayout = (TableLayout) findViewById(R.id.tutorialTableLayout);
        TableRow firstTableRow = new TableRow(this);
        TextView firstTextView = new TextView(this);
        firstTextView.setText("Countries And Their Flags\n");
        firstTextView.setTextColor(Color.WHITE);
        firstTextView.setTextSize(30);
        firstTextView.setTypeface(Typeface.DEFAULT_BOLD);
        firstTableRow.addView(firstTextView);
        tableLayout.addView(firstTableRow);
        firstTableRow.setGravity(Gravity.CENTER_HORIZONTAL);
        for (Question q : questions){
            TableRow tableRow = new TableRow(this);
            LinearLayout linearLayout = new LinearLayout(this);
            ImageView imageView = new ImageView(this);
            TextView textView = new TextView(this);
            TextView space = new TextView(this);
            textView.setBackgroundColor(Color.WHITE);
            imageView.setBackgroundColor(Color.GRAY);
            textView.setText(q.getTrueAnswerId());
            space.setText("\n");
            imageView.setImageResource(q.getImage());
            textView.setTextAppearance(this,android.R.style.TextAppearance_Large);
            linearLayout.setOrientation(LinearLayout.VERTICAL);
            tableRow.setGravity(Gravity.CENTER_HORIZONTAL);
            linearLayout.addView(textView);
            linearLayout.addView(imageView);
            linearLayout.addView(space);
            tableRow.addView(linearLayout);
            tableLayout.addView(tableRow);
        }
        TableRow tableRowForButton = new TableRow(this);
        Button button = new Button(this);
        button.setText("Let's Start");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tableRowForButton.addView(button);
        tableRowForButton.setGravity(Gravity.CENTER_HORIZONTAL);
        tableLayout.addView(tableRowForButton);
    }
}