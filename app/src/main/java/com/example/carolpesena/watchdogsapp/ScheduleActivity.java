package com.example.carolpesena.watchdogsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class ScheduleActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        this.mViewHolder.buttonSchedule = (Button) findViewById(R.id.button_save_schedule);
        this.mViewHolder.tempoativ = (TimePicker) findViewById(R.id.activation_time);
        this.mViewHolder.tempodesativ = (TimePicker) findViewById(R.id.deactivation_time);

        this.mViewHolder.buttonSchedule.setOnClickListener(this);
        this.mViewHolder.tempoativ.setOnClickListener(this);
        this.mViewHolder.tempodesativ.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Log.i("onClick", "clicou em alguma coisa no scheduler");

        if(id == R.id.button_save_schedule){


            Log.i("onClick", "clicou para voltar");

            super.onBackPressed();
        }
    }

    public int GravaDados()
    {
        int a = 0;

        return a;
    }

    static class ViewHolder{
        Button buttonSchedule;
        TimePicker tempoativ;
        TimePicker tempodesativ;
    }
}
