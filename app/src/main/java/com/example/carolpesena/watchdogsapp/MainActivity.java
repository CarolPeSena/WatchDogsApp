package com.example.carolpesena.watchdogsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.buttonConfiguration = (Button) findViewById(R.id.button_configurations);
        this.mViewHolder.buttonSchedule = (Button) findViewById(R.id.button_schedule);

        this.mViewHolder.buttonSchedule.setOnClickListener(this);
        this.mViewHolder.buttonConfiguration.setOnClickListener(this);
        Log.i("onCreate", "criei");

        try
        {

            Log.i("try", "try");

        } catch (Exception ex)
        {

        }



    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Log.i("onClick", "clicou em alguma coisa");

        if(id == R.id.button_configurations){
            Intent intent = new  Intent(this, ConfigurationsActivity.class);
            Log.i("onClick", "clicou em configurar");
            startActivity(intent);
        }

        if(id == R.id.button_schedule){
            Intent intent = new  Intent(this, ScheduleActivity.class);
            Log.i("onClick", "clicou em agendar");
            startActivity(intent);
        }
    }

    public void onToggleClicked(View view) {
    }

    static class ViewHolder{
        Button buttonConfiguration;
        Button buttonSchedule;
    }
}
