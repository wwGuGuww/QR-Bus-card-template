package com.example.deneme1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn_anasayfa;//Hepsınde Lazım
EditText et_tc,et_şifre;//Hepsınde Lazım
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Kanka burda ID YI BUTONA ESITLIYORUZ ONUN ISMI ARTIK BU OLSUN DIYORUZ
        btn_anasayfa=findViewById(R.id.btn_giris);//
        et_şifre=findViewById(R.id.et_şifre);//
        et_tc=findViewById(R.id.et_tc);//
        btn_anasayfa.setOnClickListener(new View.OnClickListener() {//Burda butonun clık olayını yapıyoruz butona tıkladıgında yapılması gereken
            @Override
            public void onClick(View v) {
               check();//voıd mantıgı deger verıp if else cekıyoruz
            }
        });
    }

    private void check() {
        if (et_tc.getText().toString().equals("admin") && et_şifre  .getText().toString().equals("123123"))
        {
            Intent ans =new Intent(MainActivity.this,anasayfa.class);//BU sayfadan sayfaya gecısın kodu buton clık olayının ıcıne yazıyoruz
            startActivity(ans);
        }else{
            Toast.makeText(this,"Hatalı Giriş",Toast.LENGTH_SHORT).show();//ekrana mesaj yazdırma komutu
        }
    }
}
