package com.example.carolpesena.watchdogsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SensorsActivity extends AppCompatActivity implements View.OnClickListener{


    private ViewHolder kViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors);



        this.kViewHolder.ok = (Button) findViewById(R.id.ok);
        this.kViewHolder.ok.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        Log.i("onClick", "clicou em alguma coisa nos sensores");

        if(id == R.id.ok){


            Log.i("onClick", "clicou para voltar");
            //manda as infos para o servidor


            super.onBackPressed();
        }

    }

    private static class ViewHolder{
        Button ok;
    }


}
