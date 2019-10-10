package com.example.footballsce.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.footballsce.R;
import com.example.footballsce.fragments.EplFragment;
import com.example.footballsce.fragments.LaligaFragment;
import com.example.footballsce.fragments.LeagueFragment;
import com.example.footballsce.fragments.LigaIndoFragment;
import com.example.footballsce.fragments.SerieAFragment;

public class MainActivity extends AppCompatActivity {
    private LeagueFragment leagueFragment;
    private EplFragment eplFragment;
    private LaligaFragment laligaFragment;
    private SerieAFragment serieAFragment;
    private LigaIndoFragment ligaIndoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leagueFragment = new LeagueFragment();
        eplFragment = new EplFragment();
        laligaFragment = new LaligaFragment();
        serieAFragment = new SerieAFragment();
        ligaIndoFragment = new LigaIndoFragment();
    }

    public void LoadIndonesia(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_dynamic, leagueFragment).commit();
    }
    public void LoadInggris(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.framejadwal, eplFragment).commit();
    }
    public void LoadSpanyol(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.framejadwal, laligaFragment).commit();
    }
    public void LoadItaly(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.framejadwal, serieAFragment).commit();
    }
    public void LoadLigaIndonesia(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.framejadwal,ligaIndoFragment).commit();
    }
}
