package com.example.ishanpant.daggerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private AppComponent appComponent;
    private Button button;
    @Inject inteABC abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button) findViewById(R.id.button);
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(MainActivity.this))
                .build();

        appComponent.inject(MainActivity.this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abc.greet("Ishan");
            }
        });

    }
}
