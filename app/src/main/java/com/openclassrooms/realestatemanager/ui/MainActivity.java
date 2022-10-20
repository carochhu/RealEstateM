package com.openclassrooms.realestatemanager.ui;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.openclassrooms.realestatemanager.R;
import com.openclassrooms.realestatemanager.Utils;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMain;
    private TextView textViewQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this.textViewMain = findViewById(R.id.activity_second_activity_text_view_main); ANCIEN CODE: PB mauvais chemin pour relier l'activity à un élément du XML
        this.textViewMain = findViewById(R.id.activity_main_activity_text_view_main); //new code
        this.textViewQuantity = findViewById(R.id.activity_main_activity_text_view_quantity);

        this.configureTextViewMain();
        this.configureTextViewQuantity();
    }

    private void configureTextViewMain(){
        this.textViewMain.setTextSize(15);
        this.textViewMain.setText("Le premier bien immobilier enregistré vaut ");
    }

    private void configureTextViewQuantity(){
        int quantity = Utils.convertDollarToEuro(100);
        this.textViewQuantity.setTextSize(20);
        //this.textViewQuantity.setText(quantity); ANCIEN CODE: PB setText() sur un integer
        this.textViewQuantity.setText(String.valueOf(quantity)); //new code
    }
}
