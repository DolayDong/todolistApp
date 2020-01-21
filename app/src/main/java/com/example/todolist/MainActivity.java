package com.example.todolist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    AlertDialog.Builder dialog;
    LayoutInflater inflater;
    View tampilDialog;
    EditText etDataListBaru;
    FloatingActionButton floatingActionButton;
    String DataBaru;
    TextView DataFix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = (FloatingActionButton)findViewById(R.id.fab1);

        floatingActionButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Floating Action Button Berhasil dibuat", Toast.LENGTH_SHORT).show();
    }


    public void dialogAlert()  {
        dialog = new AlertDialog.Builder(MainActivity.this);
        inflater = getLayoutInflater();
        tampilDialog = inflater.inflate(R.layout.form_add, null);
        dialog.setView(tampilDialog);
        dialog.setCancelable(true);
        dialog.setTitle("Tambah List");

        etDataListBaru = (EditText) findViewById(R.id.et_add_data);

        editTextKosong();

        dialog.setPositiveButton("Tambah", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                DataBaru = etDataListBaru.getText().toString();

                DataFix.setText(DataBaru);
            }
        });



    }

    public void editTextKosong(){
        etDataListBaru.setText(null);
    }
}