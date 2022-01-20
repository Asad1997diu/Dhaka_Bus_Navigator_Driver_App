package com.example.localtransportationtrackingsystem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Filter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.localtransportationtrackingsystem.Adapter.BusAdapter;
import com.example.localtransportationtrackingsystem.Model.Bus;

import java.util.ArrayList;
import java.util.List;

public class AfterSearchActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BusAdapter adapter;


    private String str="";
    private String getsACTV;
    private String getdACTV;
    private TextView getfromTV;
    private TextView gettoTV;
    private TextView availTV;
    private Button onMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_after_search);

        ActionBar actionBar= getSupportActionBar();

        availTV = findViewById(R.id.availabilityTV);
        getfromTV= findViewById(R.id.fromTV);
        gettoTV= findViewById(R.id.toTV);
        onMap= findViewById(R.id.onMap);
        Intent intent= getIntent();
        str= intent.getStringExtra("InputedET");
        getsACTV= intent.getStringExtra("sACTV");
        getdACTV= intent.getStringExtra("dACTV");

        getfromTV.setText(getsACTV);
        gettoTV.setText(getdACTV);

        recyclerView = findViewById(R.id.recyclerview);
        adapter = new BusAdapter(AfterSearchActivity.this,generateBusList());

        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        adapter.getFilter().filter(str, new Filter.FilterListener() {
            @Override
            public void onFilterComplete(int i) {

                if((adapter.getItemCount())>0){
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(adapter);

                }else{

                    adapter.getFilter().filter(getdACTV);
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(adapter);
                    availTV.setText("No Available Bus");
                    Toast.makeText(AfterSearchActivity.this, "Only Buses that go to "+getdACTV+" is displayed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        onMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AfterSearchActivity.this,MapsActivity.class));
            }
        });

    }


    private List<Bus> generateBusList(){
        List<Bus>buses= new ArrayList<>();
        buses.add(new Bus(R.drawable.logo,"Bahon",
                "Mirpur 14 Mirpur 10 Mirpur 14 Mirpur 2 Mirpur 14 Mirpur 1 Mirpur 14 Ansar Camp Mirpur 14 Bangla College Mirpur 14 Darussalam Mirpur 14" +
                        " Mirpur 14 Technical Mirpur 14 Kallayanpur Mirpur 14 Shyamoli Mirpur 14 Shishu Mela Mirpur 14 College Gate Mirpur 14" +
                        "Mirpur 14 Asad Gate Mirpur 14 Dhanmondi 27 Mirpur 14 Dhanmondi 32 Mirpur 14 Kalabagan Mirpur 14" +
                        "Mirpur 14 Science Lab Mirpur 14 Katabon Mirpur 14 Shahbag Mirpur 14 High Court Mirpur 14 Press Club Mirpur 14 " +
                        "Mirpur 14 Paltan Mirpur 14  Daynik Bangla More  Mirpur 14 Arambag Mirpur 14 Kamalapur Mirpur 14 Mugdapara Mirpur 14 " +
                        "Mirpur 14 Basabo Mirpur 14 Khilgaon Mirpur 14" +
                        "Mirpur 10 Mirpur 2 Mirpur 10 Mirpur 1 Mirpur 10 Ansar Camp Mirpur 10 Bangla College Mirpur 10 Darussalam Mirpur 10" +
                        " Mirpur 10 Technical Mirpur 10 Kallayanpur Mirpur 10 Shyamoli Mirpur 10 Shishu Mela Mirpur 10 College Gate Mirpur 10" +
                        "Mirpur 10 Asad Gate Mirpur 10 Dhanmondi 27 Mirpur 10 Dhanmondi 32 Mirpur 10 Kalabagan Mirpur 10" +
                        "Mirpur 10 Science Lab Mirpur 10 Katabon Mirpur 10 Shahbag Mirpur 10 High Court Mirpur 10 Press Club Mirpur 10 " +
                        "Mirpur 10 Paltan Mirpur 10 Daynik Bangla More Mirpur 10 Arambag Mirpur 10 Kamalapur Mirpur 10 Mugdapara Mirpur 10 " +
                        "Mirpur 10 Basabo Mirpur 10 Khilgaon Mirpur 10" +
                        "Mirpur 2 Mirpur 1 Mirpur 2 Ansar Camp Mirpur 2 Bangla College Mirpur 2 Darussalam Mirpur 2" +
                        "Mirpur 2 Technical Mirpur 2 Kallayanpur Mirpur 2 Shyamoli Mirpur 2 Shishu Mela Mirpur 2 College Gate Mirpur 2" +
                        "Mirpur 2 Asad Gate Mirpur 2 Dhanmondi 27 Mirpur 2 Dhanmondi 32 Mirpur 2 Kalabagan Mirpur 2" +
                        "Mirpur 2 Science Lab Mirpur 2 Katabon Mirpur 2 Shahbag Mirpur 2 High Court Mirpur 2 Press Club Mirpur 2 " +
                        "Mirpur 2 Paltan Mirpur 2 Daynik Bangla More Mirpur 2 Arambag Mirpur 2 Kamalapur Mirpur 2 Mugdapara Mirpur 2 " +
                        "Mirpur 2 Basabo Mirpur 2 Khilgaon Mirpur 2" +
                        "Mirpur 1 Ansar Camp Mirpur 1 Bangla College Mirpur 1 Darussalam Mirpur 1" +
                        "Mirpur 1 Technical Mirpur 1 Kallayanpur Mirpur 1 Shyamoli Mirpur 1 Shishu Mela Mirpur 1 College Gate Mirpur 1" +
                        "Mirpur 1 Asad Gate Mirpur 1 Dhanmondi 27 Mirpur 1 Dhanmondi 32 Mirpur 1 Kalabagan Mirpur 1" +
                        "Mirpur 1 Science Lab Mirpur 1 Katabon Mirpur 1 Shahbag Mirpur 1 High Court Mirpur 1 Press Club Mirpur 1 " +
                        "Mirpur 1 Paltan Mirpur 1 Daynik Bangla More Mirpur 1 Arambag Mirpur 1 Kamalapur Mirpur 1 Mugdapara Mirpur 1 " +
                        "Mirpur 1 Basabo Mirpur 1 Khilgaon Mirpur 1" +
                        "Mirpur 1 Bangla College Mirpur 1 Darussalam Mirpur 1" +
                        "Ansar Camp Technical Ansar Camp Kallayanpur Ansar Camp Shyamoli Ansar Camp Shishu Mela Ansar Camp College Gate Ansar Camp" +
                        "Ansar Camp Asad Gate Ansar Camp Dhanmondi 27 Ansar Camp Dhanmondi 32 Ansar Camp Kalabagan Ansar Camp" +
                        "Ansar Camp Science Lab Ansar Camp Katabon Ansar Camp Shahbag Ansar Camp High Court Ansar Camp Press Club Ansar Camp " +
                        "Ansar Camp Paltan Ansar Camp Daynik Bangla More Ansar Camp Arambag Ansar Camp Kamalapur Ansar Camp Mugdapara Ansar Camp " +
                        "Ansar Camp Basabo Ansar Camp Khilgaon Ansar Camp" +
                        "Technical Kallayanpur Technical Shyamoli Technical Shishu Mela Technical College Gate Technical" +
                        "Technical Asad Gate Technical Dhanmondi 27 Technical Dhanmondi 32 Technical Kalabagan Technical" +
                        "Technical Science Lab Technical Katabon Technical Shahbag Technical High Court Technical Press Club Technical " +
                        "Technical Paltan Technical Daynik Bangla More Technical Arambag Technical Kamalapur Technical Mugdapara Technical " +
                        "Technical Basabo Technical Khilgaon Technical" +
                        "Kallayanpur Shyamoli Kallayanpur Shishu Mela Kallayanpur College Gate Kallayanpur" +
                        "Kallayanpur Asad Gate Kallayanpur Dhanmondi 27 Kallayanpur Dhanmondi 32 Kallayanpur Kalabagan Kallayanpur" +
                        "Kallayanpur Science Lab Kallayanpur Katabon Kallayanpur Shahbag Kallayanpur High Court Kallayanpur Press Club Kallayanpur " +
                        "Kallayanpur Paltan Kallayanpur Daynik Bangla More Kallayanpur Arambag Kallayanpur Kamalapur Kallayanpur Mugdapara Kallayanpur " +
                        "Kallayanpur Basabo Kallayanpur Khilgaon Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli College Gate Shyamoli" +
                        "Shyamoli Asad Gate Shyamoli Dhanmondi 27 Shyamoli Dhanmondi 32 Shyamoli Kalabagan Shyamoli" +
                        "Shyamoli Science Lab Shyamoli Katabon Shyamoli Shahbag Shyamoli High Court Shyamoli Press Club Shyamoli " +
                        "Shyamoli Paltan Shyamoli Daynik Bangla More Shyamoli Arambag Shyamoli Kamalapur Shyamoli Mugdapara Shyamoli " +
                        "Shyamoli Basabo Shyamoli Khilgaon Shyamoli" +
                        "Shishu Mela College Gate Shishu Mela" +
                        "Shishu Mela Asad Gate Shishu Mela Dhanmondi 27 Shishu Mela Dhanmondi 32 Shishu Mela Kalabagan Shishu Mela" +
                        "Shishu Mela Science Lab Shishu Mela Katabon Shishu Mela Shahbag Shishu Mela High Court Shishu Mela Press Club Shishu Mela " +
                        "Shishu Mela Paltan Shishu Mela Daynik Bangla More Shishu Mela Arambag Shishu Mela Kamalapur Shishu Mela Mugdapara Shishu Mela " +
                        "Shishu Mela Basabo Shishu Mela Khilgaon Shishu Mela" +
                        "Asad Gate Dhanmondi 27 Asad Gate Dhanmondi 32 Asad Gate Kalabagan Asad Gate" +
                        "Asad Gate Science Lab Asad Gate Katabon Asad Gate Shahbag Asad Gate High Court Asad Gate Press Club Asad Gate " +
                        "Asad Gate Paltan Asad Gate Daynik Bangla More Asad Gate Arambag Asad Gate Kamalapur Asad Gate Mugdapara Asad Gate " +
                        "Asad Gate Basabo Asad Gate Khilgaon Asad Gate" +
                        "Dhanmondi 27 Dhanmondi 32 Dhanmondi 27 Kalabagan Dhanmondi 27" +
                        "Dhanmondi 27 Science Lab Dhanmondi 27 Katabon Dhanmondi 27 Shahbag Dhanmondi 27 High Court Dhanmondi 27 Press Club Dhanmondi 27 " +
                        "Dhanmondi 27 Paltan Dhanmondi 27 Daynik Bangla More Dhanmondi 27 Arambag Dhanmondi 27 Kamalapur Dhanmondi 27 Mugdapara Dhanmondi 27 " +
                        "Dhanmondi 27 Basabo Dhanmondi 27 Khilgaon Dhanmondi 27" +
                        "Dhanmondi 32 Kalabagan Dhanmondi 32" +
                        "Dhanmondi 32 Science Lab Dhanmondi 32 Katabon Dhanmondi 32 Shahbag Dhanmondi 32 High Court Dhanmondi 32 Press Club Dhanmondi 32 " +
                        "Dhanmondi 32 Paltan Dhanmondi 32 Daynik Bangla More Dhanmondi 32 Arambag Dhanmondi 32 Kamalapur Dhanmondi 32 Mugdapara Dhanmondi 32 " +
                        "Dhanmondi 32 Basabo Dhanmondi 32 Khilgaon Dhanmondi 32" +
                        "Kalabagan Science Lab Kalabagan Katabon Kalabagan Shahbag Kalabagan High Court Kalabagan Press Club Kalabagan " +
                        "Kalabagan Paltan Kalabagan Daynik Bangla More Kalabagan Arambag Kalabagan Kamalapur Kalabagan Mugdapara Kalabagan " +
                        "Kalabagan Basabo Kalabagan Khilgaon Kalabagan" +
                        "Science Lab Katabon Science Lab Shahbag Science Lab High Court Science Lab Press Club Science Lab " +
                        "Science Lab Paltan Science Lab Daynik Bangla More Science Lab Arambag Science Lab Kamalapur Science Lab Mugdapara Science Lab " +
                        "Science Lab Basabo Science Lab Khilgaon Science Lab" +
                        "Katabon Shahbag Katabon High Court Katabon Press Club Katabon " +
                        "Katabon Paltan Katabon Daynik Bangla More Katabon Arambag Katabon Kamalapur Katabon Mugdapara Katabon " +
                        "Katabon Basabo Katabon Khilgaon Katabon" +
                        "Shahbag High Court Shahbag Press Club Shahbag " +
                        "Shahbag Paltan Shahbag Daynik Bangla More Shahbag Arambag Shahbag Kamalapur Shahbag Mugdapara Shahbag " +
                        "Shahbag Basabo Shahbag Khilgaon Shahbag" +
                        "High Court Press Club High Court " +
                        "Press Club Paltan Press Club Daynik Bangla More Press Club Arambag Press Club Kamalapur Press Club Mugdapara Press Club " +
                        "Press Club Basabo Press Club Khilgaon Press Club" +
                        "Press Club Paltan Press Club Daynik Bangla More Press Club Arambag Press Club Kamalapur Press Club Mugdapara Press Club " +
                        "Press Club Basabo Press Club Khilgaon Press Club" +
                        "Paltan Daynik Bangla More Paltan Arambag Paltan Kamalapur Paltan Mugdapara Paltan " +
                        "Paltan Basabo Paltan Khilgaon Paltan" +
                        "Daynik Bangla More Arambag Daynik Bangla More Kamalapur Daynik Bangla More Mugdapara Daynik Bangla More " +
                        "Daynik Bangla More Basabo Daynik Bangla More Khilgaon Daynik Bangla More" +
                        "Arambag Kamalapur Arambag Mugdapara Arambag " +
                        "Arambag Basabo Arambag Khilgaon Arambag" +
                        "Kamalapur Mugdapara Kamalapur " +
                        "Kamalapur Basabo Kamalapur Khilgaon Kamalapur" +
                        "Mugdapara Basabo Mugdapara Khilgaon Mugdapara" +
                        "Basabo Khilgaon Basabo" +
                        "" +
                        "" +
                        "Mirpur 10 Birdem Hospital Mirpur 2 Birdem Hospital Mirpur 1 Birdem Hospital Ansar Camp Birdem Hospital Bangla College Birdem Hospital Darussalam Birdem Hospital" +
                        "Technical Birdem Hospital Kallayanpur Birdem Hospital Shyamoli Birdem Hospital Shishu Mela Birdem Hospital College Gate Birdem Hospital" +
                        "Asad Gate Birdem Hospital Dhanmondi 27 Birdem Hospital Dhanmondi 32 Birdem Hospital Kalabagan Birdem Hospital" +
                        "Science Lab Birdem Hospital Katabon Birdem Hospital Shahbag Birdem Hospital High Court Birdem Hospital Press Club Birdem Hospital " +
                        "Paltan Birdem Hospital Daynik Bangla More  Birdem Hospital Arambag MBirdem Hospital Kamalapur Birdem Hospital Mugdapara Birdem Hospital " +
                        "Basabo Birdem Hospital Khilgaon Birdem Hospital"
        ));

        buses.add(new Bus(R.drawable.logo,"13 No",
                "Mohammadpur Shankar  Mohammadpur Star Kabab Mohammadpur Dhanmondi 15 Mohammadpur " +
                        "Mohammadpur Jigatola Mohammadpur City College Mohammadpur New Market Mohammadpur Nilkhet Mohammadpur Azimpur Mohammadpur" +
                        "Shankar Star Kabab Shankar Dhanmondi 15 Shankar " +
                        "Shankar Jigatola Shankar City College Shankar New Market Shankar Nilkhet Shankar Azimpur Shankar" +
                        "Star Kabab Dhanmondi 15 Star Kabab " +
                        "Dhanmondi 15 Jigatola Dhanmondi 15 City College Dhanmondi 15 New Market Dhanmondi 15 Nilkhet Dhanmondi 15 Azimpur Dhanmondi 15" +

                        "Jigatola City College Jigatola New Market Jigatola Nilkhet Jigatola Azimpur Jigatola" +
                        "City College New Market City College Nilkhet City College Azimpur City College" +
                        "New Market Nilkhet New Market Azimpur New Market" +
                        "Nilkhet Azimpur Nilkhet"
        ));

        buses.add(new Bus(R.drawable.logo,"6 No",
                "Kamalapur Motijheel Kamalapur Gulisthan Kamalapur GPO Kamalapur Paltan Kamalapur Kakrail Kamalapur Shantinagar Kamalapur " +
                        "Kamalapur Malibagh Mor Kamalapur Mouchak Kamalapur Satrasta Kamalapur Nabisko Kamalapur Mohakhali Kamalapur Wireless Mor Kamalapur" +
                        "Kamalapur Gulshan 1 Kamalapur Gulshan 2 Kamalapur Natun Bazar Kamalapur" +
                        "Motijheel Gulisthan Motijheel GPO Motijheel Paltan Motijheel Kakrail Motijheel Shantinagar Motijheel " +
                        "Motijheel Malibagh Mor Motijheel Mouchak Motijheel Satrasta Motijheel Nabisko Motijheel Mohakhali Motijheel Wireless Mor Motijheel" +
                        "Motijheel Gulshan 1 Motijheel Gulshan 2 Motijheel Natun Bazar Motijheel" +
                        "Gulisthan GPO Gulisthan Paltan Gulisthan Kakrail Gulisthan Shantinagar Gulisthan " +
                        "Gulisthan Malibagh Mor Gulisthan Mouchak Gulisthan Satrasta Gulisthan Nabisko Gulisthan Mohakhali Gulisthan Wireless Mor Gulisthan" +
                        "Gulisthan Gulshan 1 Gulisthan Gulshan 2 Gulisthan Natun Bazar Gulisthan" +
                        "GPO Paltan GPO Kakrail GPO Shantinagar GPO " +
                        "GPO Malibagh Mor GPO Mouchak GPO Satrasta GPO Nabisko GPO Mohakhali GPO Wireless Mor GPO" +
                        "GPO Gulshan 1 GPO Gulshan 2 GPO Natun Bazar GPO" +
                        "Paltan Kakrail Paltan Shantinagar Paltan " +
                        "Paltan Malibagh Mor Paltan Mouchak Paltan Satrasta Paltan Nabisko Paltan Mohakhali Paltan Wireless Mor Paltan" +
                        "Paltan Gulshan 1 Paltan Gulshan 2 Paltan Natun Bazar Paltan" +
                        "Kakrail Shantinagar Kakrail " +
                        "Kakrail Malibagh Mor Kakrail Mouchak Kakrail Satrasta Kakrail Nabisko Kakrail Mohakhali Kakrail Wireless Mor Kakrail" +
                        "Kakrail Gulshan 1 Kakrail Gulshan 2 Kakrail Natun Bazar Kakrail" +
                        "Shantinagar Malibagh Mor Shantinagar Mouchak Shantinagar Satrasta Shantinagar Nabisko Shantinagar Mohakhali Shantinagar Wireless Mor Shantinagar" +
                        "Shantinagar Gulshan 1 Shantinagar Gulshan 2 Shantinagar Natun Bazar Shantinagar" +
                        "Malibagh Mor Mouchak Malibagh Mor Satrasta Malibagh Mor Nabisko Malibagh Mor Mohakhali Malibagh Mor Wireless Mor Malibagh Mor" +
                        "Malibagh Mor Gulshan 1 Malibagh Mor Gulshan 2 Malibagh Mor Natun Bazar Malibagh Mor" +
                        "Mouchak Satrasta Mouchak Nabisko Mouchak Mohakhali Mouchak Wireless Mor Mouchak" +
                        "Mouchak Gulshan 1 Mouchak Gulshan 2 Mouchak Natun Bazar Mouchak" +
                        "Satrasta Nabisko Satrasta Mohakhali Satrasta Wireless Mor Satrasta" +
                        "Satrasta Gulshan 1 Satrasta Gulshan 2 Satrasta Natun Bazar Satrasta" +
                        "Nabisko Mohakhali Nabisko Wireless Mor Nabisko" +
                        "Nabisko Gulshan 1 Nabisko Gulshan 2 Nabisko Natun Bazar Nabisko" +
                        " Mohakhali Wireless Mor Mohakhali" +
                        "Mohakhali Gulshan 1 Mohakhali Gulshan 2 Mohakhali Natun Bazar Mohakhali" +
                        "Wireless Mor Gulshan 1 Wireless Mor Gulshan 2 Wireless Mor Natun Bazar Wireless Mor" +
                        "Gulshan 1 Gulshan 2 Gulshan 1 Natun Bazar Gulshan 1" +
                        "Gulshan 2 Natun Bazar Gulshan 2"));



        buses.add(new Bus(R.drawable.logo,"7 No",
                "Gabtoli Mazar Road Gabtoli Technical Gabtoli Kallayanpur Gabtoli Shyamoli Gabtoli Shishu Mela Gabtoli College Gate Gabtoli" +
                        "Gabtoli Asad Gate Gabtoli Dhanmondi 27 Gabtoli Dhanmondi 32 Gabtoli Kalabagan Gabtoli Science Lab Gabtoli" +
                        "Gabtoli Katabon Gabtoli Shahbag Gabtoli High Court Gabtoli Press Club Gabtoli Paltan Gabtoli GPO Gabtoli" +
                        "Gabtoli Golap Shah Mazar Gabtoli Gulisthan Gabtoli Naya Bazar Gabtoli Ray Shaheb Bazar Gabtoli" +
                        "Gabtoli Sadarghat Gabtoli" +
                        "Mazar Road Technical Mazar Road Kallayanpur Mazar Road Shyamoli Mazar Road Shishu Mela Mazar Road College Gate Mazar Road" +
                        "Mazar Road Asad Gate Mazar Road Dhanmondi 27 Mazar Road Dhanmondi 32 Mazar Road Kalabagan Mazar Road Science Lab Mazar Road" +
                        "Mazar Road Katabon Mazar Road Shahbag Mazar Road High Court Mazar Road Press Club Mazar Road Paltan Mazar Road GPO Mazar Road" +
                        "Mazar Road Golap Shah Mazar Mazar Road Gulisthan Mazar Road Naya Bazar Mazar Road Ray Shaheb Bazar Mazar Road" +
                        "Mazar Road Sadarghat Mazar Road" +
                        "Technical Kallayanpur Technical Shyamoli Technical Shishu Mela Technical College Gate Technical" +
                        "Technical Asad Gate Technical Dhanmondi 27 Technical Dhanmondi 32 Technical Kalabagan Technical Science Lab Technical" +
                        "Technical Katabon Technical Shahbag Technical High Court Technical Press Club Technical Paltan Technical GPO Technical" +
                        "Technical Golap Shah Mazar Technical Gulisthan Technical Naya Bazar Technical Ray Shaheb Bazar Technical" +
                        "Technical Sadarghat Technical" +
                        "Kallayanpur Shyamoli Kallayanpur Shishu Mela Kallayanpur College Gate Kallayanpur" +
                        "Kallayanpur Asad Gate Kallayanpur Dhanmondi 27 Kallayanpur Dhanmondi 32 Kallayanpur Kalabagan Kallayanpur Science Lab Kallayanpur" +
                        "Kallayanpur Katabon Kallayanpur Shahbag Kallayanpur High Court Kallayanpur Press Club Kallayanpur Paltan Kallayanpur GPO Kallayanpur" +
                        "Kallayanpur Golap Shah Mazar Kallayanpur Gulisthan Kallayanpur Naya Bazar Kallayanpur Ray Shaheb Bazar Kallayanpur" +
                        "Kallayanpur Sadarghat Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli College Gate Shyamoli" +
                        "Shyamoli Asad Gate Shyamoli Dhanmondi 27 Shyamoli Dhanmondi 32 Shyamoli Kalabagan Shyamoli Science Lab Shyamoli" +
                        "Shyamoli Katabon Shyamoli Shahbag Shyamoli High Court Shyamoli Press Club Shyamoli Paltan Shyamoli GPO Shyamoli" +
                        "Shyamoli Golap Shah Mazar Shyamoli Gulisthan Shyamoli Naya Bazar Shyamoli Ray Shaheb Bazar Shyamoli" +
                        "Shyamoli Sadarghat Shyamoli" +
                        "Asad Gate Dhanmondi 27 Asad Gate Dhanmondi 32 Asad Gate Kalabagan Asad Gate Science Lab Asad Gate" +
                        "Asad Gate Katabon Asad Gate Shahbag Asad Gate High Court Asad Gate Press Club Asad Gate Paltan Asad Gate GPO Asad Gate" +
                        "Asad Gate Golap Shah Mazar Asad Gate Gulisthan Asad Gate Naya Bazar Asad Gate Ray Shaheb Bazar Asad Gate" +
                        "Asad Gate Sadarghat Asad Gate" +
                        "Dhanmondi 27 Dhanmondi 32 Dhanmondi 27 Kalabagan Dhanmondi 27 Science Lab Dhanmondi 27" +
                        "Dhanmondi 27 Katabon Dhanmondi 27 Shahbag Dhanmondi 27 High Court Dhanmondi 27 Press Club Dhanmondi 27 Paltan Dhanmondi 27 GPO Dhanmondi 27" +
                        "Dhanmondi 27 Golap Shah Mazar Dhanmondi 27 Gulisthan Dhanmondi 27 Naya Bazar Dhanmondi 27 Ray Shaheb Bazar Dhanmondi 27" +
                        "Dhanmondi 27 Sadarghat Dhanmondi 27" +
                        "Dhanmondi 32 Kalabagan Dhanmondi 32 Science Lab Dhanmondi 32" +
                        "Dhanmondi 32 Katabon Dhanmondi 32 Shahbag Dhanmondi 32 High Court Dhanmondi 32 Press Club Dhanmondi 32 Paltan Dhanmondi 32 GPO Dhanmondi 32" +
                        "Dhanmondi 32 Golap Shah Mazar Dhanmondi 32 Gulisthan Dhanmondi 32 Naya Bazar Dhanmondi 32 Ray Shaheb Bazar Dhanmondi 32" +
                        "Dhanmondi 32 Sadarghat Dhanmondi 32" +
                        "Kalabagan Science Lab Kalabagan" +
                        "Kalabagan Katabon Kalabagan Shahbag Kalabagan High Court Kalabagan Press Club Kalabagan Paltan Kalabagan GPO Kalabagan" +
                        "Kalabagan Golap Shah Mazar Kalabagan Gulisthan Kalabagan Naya Bazar Kalabagan Ray Shaheb Bazar Kalabagan" +
                        "Kalabagan Sadarghat Kalabagan" +
                        "Science Lab Katabon Science Lab Shahbag Science Lab High Court Science Lab Press Club Science Lab Paltan Science Lab GPO Science Lab" +
                        "Science Lab Golap Shah Mazar Science Lab Gulisthan Science Lab Naya Bazar Science Lab Ray Shaheb Bazar Science Lab" +
                        "Science Lab Sadarghat Science Lab" +
                        "Katabon Shahbag Katabon High Court Katabon Press Club Katabon Paltan Katabon GPO Katabon" +
                        "Katabon Golap Shah Mazar Katabon Gulisthan Katabon Naya Bazar Katabon Ray Shaheb Bazar Katabon" +
                        "Katabon Sadarghat Katabon" +
                        "Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag GPO Shahbag" +
                        "Shahbag Golap Shah Mazar Shahbag Gulisthan Shahbag Naya Bazar Shahbag Ray Shaheb Bazar Shahbag" +
                        "Shahbag Sadarghat Shahbag" +
                        "High Court Press Club High Court Paltan High Court GPO High Court" +
                        "High Court Golap Shah Mazar High Court Gulisthan High Court Naya Bazar High Court Ray Shaheb Bazar High Court" +
                        "High Court Sadarghat High Court" +
                        "Press Club Paltan Press Club GPO Press Club" +
                        "Press Club Golap Shah Mazar Press Club Gulisthan Press Club Naya Bazar Press Club Ray Shaheb Bazar Press Club" +
                        "Press Club Sadarghat Press Club" +
                        "Paltan GPO Paltan" +
                        "Paltan Golap Shah Mazar Paltan Gulisthan Paltan Naya Bazar Paltan Ray Shaheb Bazar Paltan" +
                        "Paltan Sadarghat Paltan" +
                        "GPO Golap Shah Mazar GPO Gulisthan GPO Naya Bazar GPO Ray Shaheb Bazar GPO" +
                        "GPO Sadarghat GPO" +
                        "Golap Shah Mazar Gulisthan Golap Shah Mazar Naya Bazar Golap Shah Mazar Ray Shaheb Bazar Golap Shah Mazar" +
                        "Golap Shah Mazar Sadarghat Golap Shah Mazar" +
                        "Gulisthan Naya Bazar Gulisthan Ray Shaheb Bazar Gulisthan" +
                        "Gulisthan Sadarghat Gulisthan" +
                        "Naya Bazar Ray Shaheb Bazar Naya Bazar" +
                        "Naya Bazar Sadarghat Naya Bazar" +
                        "Ray Shaheb Bazar Sadarghat Ray Shaheb Bazar"
        ));


        buses.add(new Bus(R.drawable.logo,"8 No",
                "Jatrabari Jonopoth Jatrabari Sayedabad Jatrabari Motijheel Jatrabari Daynik Bangla Mor Jatrabari" +
                        "Jatrabari Paltan Jatrabari Press Club Jatrabari High Court Jatrabari Shahbag Jatrabari Bangla Motor Jatrabari" +
                        "Jatrabari Kawran Bazar Jatrabari Farmgate Jatrabari Khamarbari Jatrabari Asad Gate Jatrabari College Gate Jatrabari" +
                        "Jatrabari Shishu Mela Jatrabari Shyamoli Jatrabari Kallayanpur Jatrabari Technical Jatrabari Mazar Road Jatrabari" +
                        "Jatrabari Gabtoli Jatrabari" +
                        "Jonopoth Sayedabad Jonopoth Motijheel Jonopoth Daynik Bangla Mor Jonopoth" +
                        "Jonopoth Paltan Jonopoth Press Club Jonopoth High Court Jonopoth Shahbag Jonopoth Bangla Motor Jonopoth" +
                        "Jonopoth Kawran Bazar Jonopoth Farmgate Jonopoth Khamarbari Jonopoth Asad Gate Jonopoth College Gate Jonopoth" +
                        "Jonopoth Shishu Mela Jonopoth Shyamoli Jonopoth Kallayanpur Jonopoth Technical Jonopoth Mazar Road Jonopoth" +
                        "Jonopoth Gabtoli Jonopoth" +
                        "Sayedabad Motijheel Sayedabad Daynik Bangla Mor Sayedabad" +
                        "Sayedabad Paltan Sayedabad Press Club Sayedabad High Court Sayedabad Shahbag Sayedabad Bangla Motor Sayedabad" +
                        "Sayedabad Kawran Bazar Sayedabad Farmgate Sayedabad Khamarbari Sayedabad Asad Gate Sayedabad College Gate Sayedabad" +
                        "Sayedabad Shishu Mela Sayedabad Shyamoli Sayedabad Kallayanpur Sayedabad Technical Sayedabad Mazar Road Sayedabad" +
                        "Sayedabad Gabtoli Sayedabad" +
                        "Motijheel Daynik Bangla Mor Motijheel" +
                        "Motijheel Paltan Motijheel Press Club Motijheel High Court Motijheel Shahbag Motijheel Bangla Motor Motijheel" +
                        "Motijheel Kawran Bazar Motijheel Farmgate Motijheel Khamarbari Motijheel Asad Gate Motijheel College Gate Motijheel" +
                        "Motijheel Shishu Mela Motijheel Shyamoli Motijheel Kallayanpur Motijheel Technical Motijheel Mazar Road Motijheel" +
                        "Motijheel Gabtoli Motijheel" +
                        "Daynik Bangla Mor Paltan Daynik Bangla Mor Press Club Daynik Bangla Mor High Court Daynik Bangla Mor Shahbag Daynik Bangla Mor Bangla Motor Daynik Bangla Mor" +
                        "Daynik Bangla Mor Kawran Bazar Daynik Bangla Mor Farmgate Daynik Bangla Mor Khamarbari Daynik Bangla Mor Asad Gate Daynik Bangla Mor College Gate Daynik Bangla Mor" +
                        "Daynik Bangla Mor Shishu Mela Daynik Bangla Mor Shyamoli Daynik Bangla Mor Kallayanpur Daynik Bangla Mor Technical Daynik Bangla Mor Mazar Road Daynik Bangla Mor" +
                        "Daynik Bangla Mor Gabtoli Daynik Bangla Mor" +
                        "Paltan Press Club Paltan High Court Paltan Shahbag Paltan Bangla Motor Paltan" +
                        "Paltan Kawran Bazar Paltan Farmgate Paltan Khamarbari Paltan Asad Gate Paltan College Gate Paltan" +
                        "Paltan Shishu Mela Paltan Shyamoli Paltan Kallayanpur Paltan Technical Paltan Mazar Road Paltan" +
                        "Paltan Gabtoli Paltan" +
                        "Press Club High Court Press Club Shahbag Press Club Bangla Motor Press Club" +
                        "Press Club Kawran Bazar Press Club Farmgate Press Club Khamarbari Press Club Asad Gate Press Club College Gate Press Club" +
                        "Press Club Shishu Mela Press Club Shyamoli Press Club Kallayanpur Press Club Technical Press Club Mazar Road Press Club" +
                        "Press Club Gabtoli Press Club" +
                        "High Court Shahbag High Court Bangla Motor High Court" +
                        "High Court Kawran Bazar High Court Farmgate High Court Khamarbari High Court Asad Gate High Court College Gate High Court" +
                        "High Court Shishu Mela High Court Shyamoli High Court Kallayanpur High Court Technical High Court Mazar Road High Court" +
                        "High Court Gabtoli High Court" +
                        "Shahbag Bangla Motor Shahbag" +
                        "Shahbag Kawran Bazar Shahbag Farmgate Shahbag Khamarbari Shahbag Asad Gate Shahbag College Gate Shahbag" +
                        "Shahbag Shishu Mela Shahbag Shyamoli Shahbag Kallayanpur Shahbag Technical Shahbag Mazar Road Shahbag" +
                        "Shahbag Gabtoli Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Khamarbari Bangla Motor Asad Gate Bangla Motor College Gate Bangla Motor" +
                        "Bangla Motor Shishu Mela Bangla Motor Shyamoli Bangla Motor Kallayanpur Bangla Motor Technical Bangla Motor Mazar Road Bangla Motor" +
                        "Bangla Motor Gabtoli Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Khamarbari Kawran Bazar Asad Gate Kawran Bazar College Gate Kawran Bazar" +
                        "Kawran Bazar Shishu Mela Kawran Bazar Shyamoli Kawran Bazar Kallayanpur Kawran Bazar Technical Kawran Bazar Mazar Road Kawran Bazar" +
                        "Kawran Bazar Gabtoli Kawran Bazar" +
                        "Farmgate Khamarbari Farmgate Asad Gate Farmgate College Gate Farmgate" +
                        "Farmgate Shishu Mela Farmgate Shyamoli Farmgate Kallayanpur Farmgate Technical Farmgate Mazar Road Farmgate" +
                        "Farmgate Gabtoli Farmgate" +
                        "Khamarbari Asad Gate Khamarbari College Gate Khamarbari" +
                        "Khamarbari Shishu Mela Khamarbari Shyamoli Khamarbari Kallayanpur Khamarbari Technical Khamarbari Mazar Road Khamarbari" +
                        "Khamarbari Gabtoli Khamarbari" +
                        "Asad Gate College Gate Asad Gate" +
                        "Asad Gate Shishu Mela Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Technical Asad Gate Mazar Road Asad Gate" +
                        "Asad Gate Gabtoli Asad Gate" +
                        "College Gate Shishu Mela College Gate Shyamoli College Gate Kallayanpur College Gate Technical College Gate Mazar Road College Gate" +
                        "College Gate Gabtoli College Gate" +
                        "Shishu Mela Shyamoli Shishu Mela Kallayanpur Shishu Mela Technical Shishu Mela Mazar Road Shishu Mela" +
                        "Shishu Mela Gabtoli Shishu Mela" +
                        "Shyamoli Kallayanpur Shyamoli Technical Shyamoli Mazar Road Shyamoli" +
                        "Shyamoli Gabtoli Shyamoli" +
                        "Kallayanpur Technical Kallayanpur Mazar Road Kallayanpur" +
                        "Kallayanpur Gabtoli Kallayanpur" +
                        "Technical Mazar Road Technical" +
                        "Mazar Road Gabtoli Mazar Road" +
                        "Mazar Road Gabtoli Mazar Road" +
                        "" +
                        "" +
                        "Jonopoth Birdem Hospital Sayedabad Birdem Hospital Motijheel Birdem Hospital Daynik Bangla Mor Birdem Hospital" +
                        "Paltan Birdem Hospital Press Club Birdem Hospital High Court Birdem Hospital Shahbag Birdem Hospital Bangla Motor Birdem Hospital" +
                        "Kawran Bazar Birdem Hospital Farmgate Birdem Hospital Khamarbari Birdem Hospital Asad Gate Birdem Hospital College Gate Birdem Hospital" +
                        "Jatrabari Birdem Hospital Shishu Mela Birdem Hospital Shyamoli Birdem Hospital Kallayanpur Birdem Hospital Technical Birdem Hospital Mazar Road Birdem Hospital" +
                        "Gabtoli Birdem Hospital"

        ));

        buses.add(new Bus(R.drawable.logo,"Achim Paribahan",
                "Gabtoli Mazar Road Gabtoli Technical Gabtoli Ansar Camp Gabtoli Mirpur 1 Gabtoli Sony Hall Gabtoli" +
                        "Gabtoli Mirpur 2 Gabtoli Mirpur 10 Gabtoli Mirpur 11 Gabtoli Purobi Gabtoli kalshi Gabtoli ECB Chattar Gabtoli" +
                        "Gabtoli MES Gabtoli Shewra Gabtoli Kuril Bishwa Road Gabtoli Bashundhara Gabtoli Nadda Gabtoli Natun Bazar Gabtoli" +
                        "Gabtoli Bashtola Gabtoli Shahjadpur Gabtoli Uttar Badda Bazar Gabtoli Badda Gabtoli Madhya Badda Gabtoli Merul Gabtoli" +
                        "Gabtoli Rampura Bridge Gabtoli Banasree Gabtoli Demra Gabtoli" +
                        "Mazar Road Technical Mazar Road Ansar Camp Mazar Road Mirpur 1 Mazar Road Sony Hall Mazar Road" +
                        "Mazar Road Mirpur 2 Mazar Road Mirpur 10 Mazar Road Mirpur 11 Mazar Road Purobi Mazar Road kalshi Mazar Road ECB Chattar Mazar Road" +
                        "Mazar Road MES Mazar Road Shewra Mazar Road Kuril Bishwa Road Mazar Road Bashundhara Mazar Road Nadda Mazar Road Natun Bazar Mazar Road" +
                        "Mazar Road Bashtola Mazar Road Shahjadpur Mazar Road Uttar Badda Bazar Mazar Road Badda Mazar Road Madhya Badda Mazar Road Merul Mazar Road" +
                        "Mazar Road Rampura Bridge Mazar Road Banasree Mazar Road Demra Gabtoli" +
                        "Technical Ansar Camp Technical Mirpur 1 Technical Sony Hall Technical" +
                        "Technical Mirpur 2 Technical Mirpur 10 Technical Mirpur 11 Technical Purobi Technical kalshi Technical ECB Chattar Technical" +
                        "Technical MES Technical Shewra Technical Kuril Bishwa Road Technical Bashundhara Technical Nadda Technical Natun Bazar Technical" +
                        "Technical Bashtola Technical Shahjadpur Technical Uttar Badda Bazar Technical Badda Technical Madhya Badda Technical Merul Technical" +
                        "Technical Rampura Bridge Technical Banasree Technical Demra Technical" +
                        "Ansar Camp Mirpur 1 Ansar Camp Sony Hall Ansar Camp" +
                        "Ansar Camp Mirpur 2 Ansar Camp Mirpur 10 Ansar Camp Mirpur 11 Ansar Camp Purobi Ansar Camp kalshi Ansar Camp ECB Chattar Ansar Camp" +
                        "Ansar Camp MES Ansar Camp Shewra Ansar Camp Kuril Bishwa Road Ansar Camp Bashundhara Ansar Camp Nadda Ansar Camp Natun Bazar Ansar Camp" +
                        "Ansar Camp Bashtola Ansar Camp Shahjadpur Ansar Camp Uttar Badda Bazar Ansar Camp Badda Ansar Camp Madhya Badda Ansar Camp Merul Ansar Camp" +
                        "Ansar Camp Rampura Bridge Ansar Camp Banasree Ansar Camp Demra Ansar Camp" +
                        "Mirpur 1 Sony Hall Mirpur 1" +
                        "Mirpur 1 Mirpur 2 Mirpur 1 Mirpur 10 Mirpur 1 Mirpur 11 Mirpur 1 Purobi Mirpur 1 kalshi Mirpur 1 ECB Chattar Mirpur 1" +
                        "Mirpur 1 MES Mirpur 1 Shewra Mirpur 1 Kuril Bishwa Road Mirpur 1 Bashundhara Mirpur 1 Nadda Mirpur 1 Natun Bazar Mirpur 1" +
                        "Mirpur 1 Bashtola Mirpur 1 Shahjadpur Mirpur 1 Uttar Badda Bazar Mirpur 1 Badda Mirpur 1 Madhya Badda Mirpur 1 Merul Mirpur 1" +
                        "Mirpur 1 Rampura Bridge Mirpur 1 Banasree Mirpur 1 Demra Mirpur 1" +
                        "Sony Hall Mirpur 2 Sony Hall Mirpur 10 Sony Hall Mirpur 11 Sony Hall Purobi Sony Hall kalshi Sony Hall ECB Chattar Sony Hall" +
                        "Sony Hall MES Sony Hall Shewra Sony Hall Kuril Bishwa Road Sony Hall Bashundhara Sony Hall Nadda Sony Hall Natun Bazar Sony Hall" +
                        "Sony Hall Bashtola Sony Hall Shahjadpur Sony Hall Uttar Badda Bazar Sony Hall Badda Sony Hall Madhya Badda Sony Hall Merul Sony Hall" +
                        "Sony Hall Rampura Bridge Sony Hall Banasree Sony Hall Demra Sony Hall" +
                        "Mirpur 2 Mirpur 10 Mirpur 2 Mirpur 11 Mirpur 2 Purobi Mirpur 2 kalshi Mirpur 2 ECB Chattar Mirpur 2" +
                        "Mirpur 2 MES Mirpur 2 Shewra Mirpur 2 Kuril Bishwa Road Mirpur 2 Bashundhara Mirpur 2 Nadda Mirpur 2 Natun Bazar Mirpur 2" +
                        "Mirpur 2 Bashtola Mirpur 2 Shahjadpur Mirpur 2 Uttar Badda Bazar Mirpur 2 Badda Mirpur 2 Madhya Badda Mirpur 2 Merul Mirpur 2" +
                        "Mirpur 2 Rampura Bridge Mirpur 2 Banasree Mirpur 2 Demra Mirpur 2" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 kalshi Mirpur 10 ECB Chattar Mirpur 10" +
                        "Mirpur 10 MES Mirpur 10 Shewra Mirpur 10 Kuril Bishwa Road Mirpur 10 Bashundhara Mirpur 10 Nadda Mirpur 10 Natun Bazar Mirpur 10" +
                        "Mirpur 10 Bashtola Mirpur 10 Shahjadpur Mirpur 10 Uttar Badda Bazar Mirpur 10 Badda Mirpur 10 Madhya Badda Mirpur 10 Merul Mirpur 10" +
                        "Mirpur 10 Rampura Bridge Mirpur 10 Banasree Mirpur 10 Demra Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 kalshi Mirpur 11 ECB Chattar Mirpur 11" +
                        "Mirpur 11 MES Mirpur 11 Shewra Mirpur 11 Kuril Bishwa Road Mirpur 11 Bashundhara Mirpur 11 Nadda Mirpur 11 Natun Bazar Mirpur 11" +
                        "Mirpur 11 Bashtola Mirpur 11 Shahjadpur Mirpur 11 Uttar Badda Bazar Mirpur 11 Badda Mirpur 11 Madhya Badda Mirpur 11 Merul Mirpur 11" +
                        "Mirpur 11 Rampura Bridge Mirpur 11 Banasree Mirpur 11 Demra Mirpur 11" +
                        "Purobi kalshi Purobi ECB Chattar Purobi" +
                        "Purobi MES Purobi Shewra Purobi Kuril Bishwa Road Purobi Bashundhara Purobi Nadda Purobi Natun Bazar Purobi" +
                        "Purobi Bashtola Purobi Shahjadpur Purobi Uttar Badda Bazar Purobi Badda Purobi Madhya Badda Purobi Merul Purobi" +
                        "Purobi Rampura Bridge Purobi Banasree Purobi Demra Purobi" +
                        "kalshi ECB Chattar kalshi" +
                        "kalshi MES kalshi Shewra kalshi Kuril Bishwa Road kalshi Bashundhara kalshi Nadda kalshi Natun Bazar kalshi" +
                        "kalshi Bashtola kalshi Shahjadpur kalshi Uttar Badda Bazar kalshi Badda kalshi Madhya Badda kalshi Merul kalshi" +
                        "kalshi Rampura Bridge kalshi Banasree kalshi Demra kalshi" +
                        "ECB Chattar MES ECB Chattar Shewra ECB Chattar Kuril Bishwa Road ECB Chattar Bashundhara ECB Chattar Nadda ECB Chattar Natun Bazar ECB Chattar" +
                        "ECB Chattar Bashtola ECB Chattar Shahjadpur ECB Chattar Uttar Badda Bazar ECB Chattar Badda ECB Chattar Madhya Badda ECB Chattar Merul ECB Chattar" +
                        "ECB Chattar Rampura Bridge ECB Chattar Banasree ECB Chattar Demra Purobi" +
                        "MES Shewra MES Kuril Bishwa Road MES Bashundhara MES Nadda MES Natun Bazar MES" +
                        "MES Bashtola MES Shahjadpur MES Uttar Badda Bazar MES Badda MES Madhya Badda MES Merul MES" +
                        "MES Rampura Bridge MES Banasree MES Demra MES" +
                        "Shewra Kuril Bishwa Road Shewra Bashundhara Shewra Nadda Shewra Natun Bazar Shewra" +
                        "Shewra Bashtola Shewra Shahjadpur Shewra Uttar Badda Bazar Shewra Badda Shewra Madhya Badda Shewra Merul Shewra" +
                        "Shewra Rampura Bridge Shewra Banasree Shewra Demra Shewra" +
                        "Kuril Bishwa Road Bashundhara Kuril Bishwa Road Nadda Shewra Natun Bazar Kuril Bishwa Road" +
                        "Kuril Bishwa Road Bashtola Kuril Bishwa Road Shahjadpur Kuril Bishwa Road Uttar Badda Bazar Kuril Bishwa Road Badda Kuril Bishwa Road Madhya Badda Kuril Bishwa Road Merul Kuril Bishwa Road" +
                        "Kuril Bishwa Road Rampura Bridge Kuril Bishwa Road Banasree Kuril Bishwa Road Demra Kuril Bishwa Road" +
                        "Bashundhara Nadda Bashundhara Natun Bazar Bashundhara" +
                        "Bashundhara Bashtola Bashundhara Shahjadpur Bashundhara Uttar Badda Bazar Bashundhara Badda Bashundhara Madhya Badda Bashundhara Merul Bashundhara" +
                        "Bashundhara Rampura Bridge Bashundhara Banasree Bashundhara Demra Bashundhara" +
                        "Nadda Natun Bazar Nadda" +
                        "Nadda Bashtola Nadda Shahjadpur Nadda Uttar Badda Bazar Nadda Badda Nadda Madhya Badda Nadda Merul Nadda" +
                        "Nadda Rampura Bridge Nadda Banasree Nadda Demra Nadda" +
                        "Natun Bazar Bashtola Natun Bazar Shahjadpur Natun Bazar Uttar Badda Bazar Natun Bazar Badda Natun Bazar Madhya Badda Natun Bazar Merul Natun Bazar" +
                        "Natun Bazar Rampura Bridge Natun Bazar Banasree Natun Bazar Demra Natun Bazar" +
                        "Bashtola Shahjadpur Bashtola Uttar Badda Bazar Bashtola Badda Bashtola Madhya Badda Bashtola Merul Bashtola" +
                        "Bashtola Rampura Bridge Bashtola Banasree Bashtola Demra Bashtola" +
                        "Shahjadpur Uttar Badda Bazar Shahjadpur Badda Shahjadpur Madhya Badda Shahjadpur Merul Shahjadpur" +
                        "Shahjadpur Rampura Bridge Shahjadpur Banasree Shahjadpur Demra Shahjadpur" +
                        "Uttar Badda Bazar Badda Uttar Badda Bazar Madhya Badda Uttar Badda Bazar Merul Uttar Badda Bazar" +
                        "Uttar Badda Bazar Rampura Bridge Uttar Badda Bazar Banasree Uttar Badda Bazar Demra Uttar Badda Bazar" +
                        "Badda Madhya Badda Badda Merul Badda" +
                        "Badda Rampura Bridge Badda Banasree Badda Demra Badda" +
                        "Madhya Badda Merul Madhya Badda" +
                        "Madhya Badda Rampura Bridge Madhya Badda Banasree Madhya Badda Demra Madhya Badda" +
                        "Merul Rampura Bridge Merul Banasree Merul Demra Merul" +
                        "Rampura Bridge Banasree Rampura Bridge Demra Rampura Bridge" +
                        "Banasree Demra Banasree"));


        buses.add(new Bus(R.drawable.logo,"Raja City",
                "Mohammadpur Shankar Mohammadpur Star Kabab Mohammadpur Dhanmondi 15 Mohammadpur Jigatola Mohammadpur" +
                        "Mohammadpur City College Mohammadpur Science Lab Mohammadpur Bata Signal Mohammadpur Katabon Mohammadpur" +
                        "Mohammadpur Shahbag Mohammadpur Motsho Bhobon Mohammadpur High Court Mohammadpur Press Club Mohammadpur" +
                        "Mohammadpur Paltan Mohammadpur GPO Mohammadpur Gulisthan Mohammadpur Motijheel Mohammadpur" +
                        "Mohammadpur Arambag Mohammadpur" +
                        "Shankar Star Kabab Shankar Dhanmondi 15 Shankar Jigatola Shankar" +
                        "Shankar City College Shankar Science Lab Shankar Bata Signal Shankar Katabon Shankar" +
                        "Shankar Shahbag Shankar Motsho Bhobon Shankar High Court Shankar Press Club Shankar" +
                        "Shankar Paltan Shankar GPO Shankar Gulisthan Shankar Motijheel Shankar" +
                        "Shankar Arambag Shankar" +
                        "Star Kabab Dhanmondi 15 Star Kabab Jigatola Star Kabab" +
                        "Star Kabab City College Star Kabab Science Lab Star Kabab Bata Signal Star Kabab Katabon Star Kabab" +
                        "Star Kabab Shahbag Star Kabab Motsho Bhobon Star Kabab High Court Star Kabab Press Club Star Kabab" +
                        "Star Kabab Paltan Star Kabab GPO Star Kabab Gulisthan Star Kabab Motijheel Star Kabab" +
                        "Star Kabab Arambag Star Kabab" +
                        "Dhanmondi 15 Jigatola Dhanmondi 15" +
                        "Dhanmondi 15 City College Dhanmondi 15 Science Lab Dhanmondi 15 Bata Signal Dhanmondi 15 Katabon Dhanmondi 15" +
                        "Dhanmondi 15 Shahbag Dhanmondi 15 Motsho Bhobon Dhanmondi 15 High Court Dhanmondi 15 Press Club Dhanmondi 15" +
                        "Dhanmondi 15 Paltan Dhanmondi 15 GPO Dhanmondi 15 Gulisthan Dhanmondi 15 Motijheel Dhanmondi 15" +
                        "Dhanmondi 15 Arambag Dhanmondi 15" +
                        "Jigatola City College Jigatola Science Lab Jigatola Bata Signal Jigatola Katabon Jigatola" +
                        "Jigatola Shahbag Jigatola Motsho Bhobon Jigatola High Court Jigatola Press Club Jigatola" +
                        "Jigatola Paltan Jigatola GPO Jigatola Gulisthan Jigatola Motijheel Jigatola" +
                        "Jigatola Arambag Jigatola" +
                        "City College Science Lab City College Bata Signal City College Katabon City College" +
                        "City College Shahbag City College Motsho Bhobon City College High Court City College Press Club City College" +
                        "City College Paltan City College GPO City College Gulisthan City College Motijheel City College" +
                        "City College Arambag City College" +
                        "Science Lab Bata Signal Science Lab Katabon Science Lab" +
                        "Science Lab Shahbag Science Lab Motsho Bhobon Science Lab High Court Science Lab Press Club Science Lab" +
                        "Science Lab Paltan Science Lab GPO Science Lab Gulisthan Science Lab Motijheel Science Lab" +
                        "Science Lab Arambag Science Lab" +
                        "Bata Signal Katabon Bata Signal Shahbag Bata Signal Motsho Bhobon Bata Signal High Court Bata Signal Press Club Bata Signal" +
                        "Bata Signal Paltan Bata Signal GPO Bata Signal Gulisthan Bata Signal Motijheel Bata Signal" +
                        "Bata Signal Arambag Bata Signal" +
                        "Katabon Shahbag Katabon Motsho Bhobon Katabon High Court Katabon Press Club Katabon" +
                        "Katabon Paltan Katabon GPO Katabon Gulisthan Katabon Motijheel Katabon" +
                        "Katabon Arambag Katabon" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag" +
                        "Shahbag Paltan Shahbag GPO Shahbag Gulisthan Shahbag Motijheel Shahbag" +
                        "Shahbag Arambag Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon" +
                        "Motsho Bhobon Paltan Motsho Bhobon GPO Motsho Bhobon Gulisthan Motsho Bhobon Motijheel Motsho Bhobon" +
                        "Motsho Bhobon Arambag Motsho Bhobon" +
                        "High Court Press Club High Court" +
                        "High Court Paltan High Court GPO High Court Gulisthan High Court Motijheel High Court" +
                        "High Court Arambag High Court" +
                        "Press Club Paltan Press Club GPO Press Club Gulisthan Press Club Motijheel Press Club" +
                        "Press Club Arambag Press Club" +
                        "Paltan GPO Paltan Gulisthan Paltan Motijheel Paltan" +
                        "Paltan Arambag Paltan" +
                        "GPO Gulisthan GPO Motijheel GPO" +
                        "GPO Arambag GPO" +
                        "Gulisthan Motijheel Gulisthan" +
                        "Gulisthan Arambag Gulisthan" +
                        "Motijheel Arambag Motijheel" +
                        "" +
                        "" +
                        "Shankar Birdem Hospital Star Kabab Birdem Hospital Dhanmondi 15 Birdem Hospital Jigatola Birdem Hospital" +
                        "City College Birdem Hospital Science Lab Birdem Hospital Bata Signal Birdem Hospital Katabon Birdem Hospital" +
                        "Shahbag Mohammadpur Motsho Bhobon Mohammadpur High Court Mohammadpur Press Club Mohammadpur" +
                        "Paltan Birdem Hospital GPO Birdem Hospital Gulisthan Birdem Hospital Motijheel Birdem Hospital" +
                        "Arambag Birdem Hospital Mohammadpur Birdem Hospital"
        ));

        buses.add(new Bus(R.drawable.logo,"VIP 27",
                "Azimpur Nilkhet Azimpur New Market Azimpur Science Lab Azimpur City College Azimpur Kalabagan Azimpur" +
                        "Azimpur Dhanmondi 32 Azimpur Dhanmondi 27 Azimpur Asad gate Azimpur Khamarbari Azimpur" +
                        "Azimpur Farmgate Azimpur Jahangir Gate Azimpur Mohakhali Azimpur Chairman Bari Azimpur" +
                        "Azimpur Shainik Club Azimpur Banani Azimpur Kakoli Azimpur MES Azimpur Shewra Azimpur" +
                        "Azimpur Kuril Bishwa Road Azimpur Khilkhet Azimpur Airport Azimpur Uttara Azimpur " +
                        "Azimpur Jasimuddin Road Azimpur Rajlakhsmi Azimpur House Building Azimpur Andullahpur Azimpur" +
                        "Azimpur Tongi Azimpur Station Road Azimpur Mill Gate Azimpur Board Bazar Azimpur Gazipur Azimpur" +
                        "Azimpur Gazipur Chowrasta Azimpur" +
                        "Nilkhet New Market Nilkhet Science Lab Nilkhet City College Nilkhet Kalabagan Nilkhet" +
                        "Nilkhet Dhanmondi 32 Nilkhet Dhanmondi 27 Nilkhet Asad gate Nilkhet Khamarbari Nilkhet" +
                        "Nilkhet Farmgate Nilkhet Jahangir Gate Nilkhet Mohakhali Nilkhet Chairman Bari Nilkhet" +
                        "Nilkhet Shainik Club Nilkhet Banani Nilkhet Kakoli Nilkhet MES Nilkhet Shewra Nilkhet" +
                        "Nilkhet Kuril Bishwa Road Nilkhet Khilkhet Nilkhet Airport Nilkhet Uttara Nilkhet " +
                        "Nilkhet Jasimuddin Road Nilkhet Rajlakhsmi Nilkhet House Building Nilkhet Andullahpur Nilkhet" +
                        "Nilkhet Tongi Nilkhet Station Road Nilkhet Mill Gate Nilkhet Board Bazar Nilkhet Gazipur Nilkhet" +
                        "Nilkhet Gazipur Chowrasta Nilkhet" +
                        "New Market Science Lab New Market City College New Market Kalabagan New Market" +
                        "New Market Dhanmondi 32 New Market Dhanmondi 27 New Market Asad gate New Market Khamarbari New Market" +
                        "New Market Farmgate New Market Jahangir Gate New Market Mohakhali New Market Chairman Bari New Market" +
                        "New Market Shainik Club New Market Banani New Market Kakoli New Market MES New Market Shewra New Market" +
                        "New Market Kuril Bishwa Road New Market Khilkhet New Market Airport New Market Uttara New Market " +
                        "New Market Jasimuddin Road New Market Rajlakhsmi New Market House Building New Market Andullahpur New Market" +
                        "New Market Tongi New Market Station Road New Market Mill Gate New Market Board Bazar New Market Gazipur New Market" +
                        "New Market Gazipur Chowrasta New Market" +
                        "Science Lab City College Science Lab Kalabagan Science Lab" +
                        "Science Lab Dhanmondi 32 Science Lab Dhanmondi 27 Science Lab Asad gate Science Lab Khamarbari Science Lab" +
                        "Science Lab Farmgate Science Lab Jahangir Gate Science Lab Mohakhali Science Lab Chairman Bari Science Lab" +
                        "Science Lab Shainik Club Science Lab Banani Science Lab Kakoli Science Lab MES Science Lab Shewra Science Lab" +
                        "Science Lab Kuril Bishwa Road Science Lab Khilkhet Science Lab Airport Science Lab Uttara Science Lab " +
                        "Science Lab Jasimuddin Road Science Lab Rajlakhsmi Science Lab House Building Science Lab Andullahpur Science Lab" +
                        "Science Lab Tongi Science Lab Station Road Science Lab Mill Gate Science Lab Board Bazar Science Lab Gazipur Science Lab" +
                        "Science Lab Gazipur Chowrasta Science Lab" +
                        "City College Kalabagan City College" +
                        "City College Dhanmondi 32 City College Dhanmondi 27 City College Asad gate City College Khamarbari City College" +
                        "City College Farmgate City College Jahangir Gate City College Mohakhali City College Chairman Bari City College" +
                        "City College Shainik Club City College Banani City College Kakoli City College MES City College Shewra City College" +
                        "City College Kuril Bishwa Road City College Khilkhet City College Airport City College Uttara City College " +
                        "City College Jasimuddin Road City College Rajlakhsmi City College House Building City College Andullahpur City College" +
                        "City College Tongi City College Station Road City College Mill Gate City College Board Bazar City College Gazipur City College" +
                        "City College Gazipur Chowrasta City College" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad gate Kalabagan Khamarbari Kalabagan" +
                        "Kalabagan Farmgate Kalabagan Jahangir Gate Kalabagan Mohakhali Kalabagan Chairman Bari Kalabagan" +
                        "Kalabagan Shainik Club Kalabagan Banani Kalabagan Kakoli Kalabagan MES Kalabagan Shewra Kalabagan" +
                        "Kalabagan Kuril Bishwa Road Kalabagan Khilkhet Kalabagan Airport Kalabagan Uttara Kalabagan " +
                        "Kalabagan Jasimuddin Road Kalabagan Rajlakhsmi Kalabagan House Building Kalabagan Andullahpur Kalabagan" +
                        "Kalabagan Tongi Kalabagan Station Road Kalabagan Mill Gate Kalabagan Board Bazar Kalabagan Gazipur Kalabagan" +
                        "Kalabagan Gazipur Chowrasta Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad gate Dhanmondi 32 Khamarbari Dhanmondi 32" +
                        "Dhanmondi 32 Farmgate Dhanmondi 32 Jahangir Gate Dhanmondi 32 Mohakhali Dhanmondi 32 Chairman Bari Dhanmondi 32" +
                        "Dhanmondi 32 Shainik Club Dhanmondi 32 Banani Dhanmondi 32 Kakoli Dhanmondi 32 MES Dhanmondi 32 Shewra Dhanmondi 32" +
                        "Dhanmondi 32 Kuril Bishwa Road Dhanmondi 32 Khilkhet Dhanmondi 32 Airport Dhanmondi 32 Uttara Dhanmondi 32 " +
                        "Dhanmondi 32 Jasimuddin Road Dhanmondi 32 Rajlakhsmi Dhanmondi 32 House Building Dhanmondi 32 Andullahpur Dhanmondi 32" +
                        "Dhanmondi 32 Tongi Dhanmondi 32 Station Road Dhanmondi 32 Mill Gate Dhanmondi 32 Board Bazar Dhanmondi 32 Gazipur Dhanmondi 32" +
                        "Dhanmondi 32 Gazipur Chowrasta Dhanmondi 32" +
                        "Dhanmondi 27 Asad gate Dhanmondi 27 Khamarbari Dhanmondi 27" +
                        "Dhanmondi 27 Farmgate Dhanmondi 27 Jahangir Gate Dhanmondi 27 Mohakhali Dhanmondi 27 Chairman Bari Dhanmondi 27" +
                        "Dhanmondi 27 Shainik Club Dhanmondi 27 Banani Dhanmondi 27 Kakoli Dhanmondi 27 MES Dhanmondi 27 Shewra Dhanmondi 27" +
                        "Dhanmondi 27 Kuril Bishwa Road Dhanmondi 27 Khilkhet Dhanmondi 27 Airport Dhanmondi 27 Uttara Dhanmondi 27 " +
                        "Dhanmondi 27 Jasimuddin Road Dhanmondi 27 Rajlakhsmi Dhanmondi 27 House Building Dhanmondi 27 Andullahpur Dhanmondi 27" +
                        "Dhanmondi 27 Tongi Dhanmondi 27 Station Road Dhanmondi 27 Mill Gate Dhanmondi 27 Board Bazar Dhanmondi 27 Gazipur Dhanmondi 27" +
                        "Dhanmondi 27 Gazipur Chowrasta Dhanmondi 27" +
                        "Asad gate Khamarbari Asad gate" +
                        "Asad gate Farmgate Asad gate Jahangir Gate Asad gate Mohakhali Asad gate Chairman Bari Asad gate" +
                        "Asad gate Shainik Club Asad gate Banani Asad gate Kakoli Asad gate MES Asad gate Shewra Asad gate" +
                        "Asad gate Kuril Bishwa Road Asad gate Khilkhet Asad gate Airport Asad gate Uttara Asad gate " +
                        "Asad gate Jasimuddin Road Asad gate Rajlakhsmi Asad gate House Building Asad gate Andullahpur Asad gate" +
                        "Asad gate Tongi Asad gate Station Road Asad gate Mill Gate Asad gate Board Bazar Asad gate Gazipur Asad gate" +
                        "Asad gate Gazipur Chowrasta Asad gate" +
                        "Khamarbari Farmgate Khamarbari Jahangir Gate Khamarbari Mohakhali Khamarbari Chairman Bari Khamarbari" +
                        "Khamarbari Shainik Club Khamarbari Banani Khamarbari Kakoli Khamarbari MES Khamarbari Shewra Khamarbari" +
                        "Khamarbari Kuril Bishwa Road Khamarbari Khilkhet Khamarbari Airport Khamarbari Uttara Khamarbari " +
                        "Khamarbari Jasimuddin Road Khamarbari Rajlakhsmi Khamarbari House Building Khamarbari Andullahpur Khamarbari" +
                        "Khamarbari Tongi Khamarbari Station Road Khamarbari Mill Gate Khamarbari Board Bazar Khamarbari Gazipur Khamarbari" +
                        "Khamarbari Gazipur Chowrasta Khamarbari" +
                        "Farmgate Jahangir Gate Farmgate Mohakhali Farmgate Chairman Bari Farmgate" +
                        "Farmgate Shainik Club Farmgate Banani Farmgate Kakoli Farmgate MES Farmgate Shewra Farmgate" +
                        "Farmgate Kuril Bishwa Road Farmgate Khilkhet Farmgate Airport Farmgate Uttara Farmgate " +
                        "Farmgate Jasimuddin Road Farmgate Rajlakhsmi Farmgate House Building Farmgate Andullahpur Farmgate" +
                        "Farmgate Tongi Farmgate Station Road Farmgate Mill Gate Farmgate Board Bazar Farmgate Gazipur Farmgate" +
                        "Farmgate Gazipur Chowrasta Farmgate" +
                        "Jahangir Gate Mohakhali Jahangir Gate Chairman Bari Jahangir Gate" +
                        "Jahangir Gate Shainik Club Jahangir Gate Banani Jahangir Gate Kakoli Jahangir Gate MES Jahangir Gate Shewra Jahangir Gate" +
                        "Jahangir Gate Kuril Bishwa Road Jahangir Gate Khilkhet Jahangir Gate Airport Jahangir Gate Uttara Jahangir Gate " +
                        "Jahangir Gate Jasimuddin Road Jahangir Gate Rajlakhsmi Jahangir Gate House Building Jahangir Gate Andullahpur Jahangir Gate" +
                        "Jahangir Gate Tongi Jahangir Gate Station Road Jahangir Gate Mill Gate Jahangir Gate Board Bazar Jahangir Gate Gazipur Jahangir Gate" +
                        "Jahangir Gate Gazipur Chowrasta Jahangir Gate" +
                        "Mohakhali Chairman Bari Mohakhali" +
                        "Mohakhali Shainik Club Mohakhali Banani Mohakhali Kakoli Mohakhali MES Mohakhali Shewra Mohakhali" +
                        "Mohakhali Kuril Bishwa Road Mohakhali Khilkhet Mohakhali Airport Mohakhali Uttara Mohakhali " +
                        "Mohakhali Jasimuddin Road Mohakhali Rajlakhsmi Mohakhali House Building Mohakhali Andullahpur Mohakhali" +
                        "Mohakhali Tongi Mohakhali Station Road Mohakhali Mill Gate Mohakhali Board Bazar Mohakhali Gazipur Mohakhali" +
                        "Mohakhali Gazipur Chowrasta Mohakhali" +
                        "Chairman Bari Shainik Club Chairman Bari Banani Chairman Bari Kakoli Chairman Bari MES Chairman Bari Shewra Chairman Bari" +
                        "Chairman Bari Kuril Bishwa Road Chairman Bari Khilkhet Chairman Bari Airport Chairman Bari Uttara Chairman Bari " +
                        "Chairman Bari Jasimuddin Road Chairman Bari Rajlakhsmi Chairman Bari House Building Chairman Bari Andullahpur Chairman Bari" +
                        "Chairman Bari Tongi Chairman Bari Station Road Chairman Bari Mill Gate Chairman Bari Board Bazar Chairman Bari Gazipur Chairman Bari" +
                        "Chairman Bari Gazipur Chowrasta Chairman Bari" +
                        "Shainik Club Banani Shainik Club Kakoli Shainik Club MES Shainik Club Shewra Shainik Club" +
                        "Shainik Club Kuril Bishwa Road Shainik Club Khilkhet Shainik Club Airport Shainik Club Uttara Shainik Club " +
                        "Shainik Club Jasimuddin Road Shainik Club Rajlakhsmi Shainik Club House Building Shainik Club Andullahpur Shainik Club" +
                        "Shainik Club Tongi Shainik Club Station Road Shainik Club Mill Gate Shainik Club Board Bazar Shainik Club Gazipur Shainik Club" +
                        "Shainik Club Gazipur Chowrasta Shainik Club" +
                        "Banani Kakoli Banani MES Banani Shewra Banani" +
                        "Banani Kuril Bishwa Road Banani Khilkhet Banani Airport Banani Uttara Banani " +
                        "Banani Jasimuddin Road Banani Rajlakhsmi Banani House Building Banani Andullahpur Banani" +
                        "Banani Tongi Banani Station Road Banani Mill Gate Banani Board Bazar Banani Gazipur Banani" +
                        "Banani Gazipur Chowrasta Banani" +
                        "Kakoli MES Kakoli Shewra Kakoli" +
                        "Kakoli Kuril Bishwa Road Kakoli Khilkhet Kakoli Airport Kakoli Uttara Kakoli " +
                        "Kakoli Jasimuddin Road Kakoli Rajlakhsmi Kakoli House Building Kakoli Andullahpur Kakoli" +
                        "Kakoli Tongi Kakoli Station Road Kakoli Mill Gate Kakoli Board Bazar Kakoli Gazipur Kakoli" +
                        "Kakoli Gazipur Chowrasta Kakoli" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Uttara Kuril Bishwa Road " +
                        "Kuril Bishwa Road Jasimuddin Road Kuril Bishwa Road Rajlakhsmi Kuril Bishwa Road House Building Kuril Bishwa Road Andullahpur Kuril Bishwa Road" +
                        "Kuril Bishwa Road Tongi Kuril Bishwa Road Station Road Kuril Bishwa Road Mill Gate Kuril Bishwa Road Board Bazar Kuril Bishwa Road Gazipur Kuril Bishwa Road" +
                        "Kuril Bishwa Road Gazipur Chowrasta Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Uttara Khilkhet " +
                        "Khilkhet Jasimuddin Road Khilkhet Rajlakhsmi Khilkhet House Building Khilkhet Andullahpur Khilkhet" +
                        "Khilkhet Tongi Khilkhet Station Road Khilkhet Mill Gate Khilkhet Board Bazar Khilkhet Gazipur Khilkhet" +
                        "Khilkhet Gazipur Chowrasta Khilkhet" +
                        "Airport Uttara Airport " +
                        "Airport Jasimuddin Road Airport Rajlakhsmi Airport House Building Airport Andullahpur Airport" +
                        "Airport Tongi Airport Station Road Airport Mill Gate Airport Board Bazar Airport Gazipur Airport" +
                        "Airport Gazipur Chowrasta Airport" +
                        "Uttara Jasimuddin Road Uttara Rajlakhsmi Uttara House Building Uttara Andullahpur Uttara" +
                        "Uttara Tongi Uttara Station Road Uttara Mill Gate Uttara Board Bazar Uttara Gazipur Uttara" +
                        "Uttara Gazipur Chowrasta Uttara" +
                        "Jasimuddin Road Rajlakhsmi Jasimuddin Road House Building Jasimuddin Road Andullahpur Jasimuddin Road" +
                        "Jasimuddin Road Tongi Jasimuddin Road Station Road Jasimuddin Road Mill Gate Jasimuddin Road Board Bazar Jasimuddin Road Gazipur Jasimuddin Road" +
                        "Jasimuddin Road Gazipur Chowrasta Jasimuddin Road" +
                        "Rajlakhsmi House Building Rajlakhsmi Andullahpur Rajlakhsmi" +
                        "Rajlakhsmi Tongi Rajlakhsmi Station Road Rajlakhsmi Mill Gate Rajlakhsmi Board Bazar Rajlakhsmi Gazipur Rajlakhsmi" +
                        "Rajlakhsmi Gazipur Chowrasta Rajlakhsmi" +
                        "House Building Andullahpur House Building" +
                        "House Building Tongi House Building Station Road House Building Mill Gate House Building Board Bazar House Building Gazipur House Building" +
                        "House Building Gazipur Chowrasta House Building" +
                        "Andullahpur Tongi Andullahpur Station Road Andullahpur Mill Gate Andullahpur Board Bazar Andullahpur Gazipur Andullahpur" +
                        "Andullahpur Gazipur Chowrasta Andullahpur" +
                        "Tongi Station Road Tongi Mill Gate Tongi Board Bazar Tongi Gazipur Tongi" +
                        "Tongi Gazipur Chowrasta Tongi" +
                        "Station Road Mill Gate Station Road Board Bazar Station Road Gazipur Station Road" +
                        "Station Road Gazipur Chowrasta Station Road" +
                        "Mill Gate Board Bazar Mill Gate Gazipur Mill Gate" +
                        "Mill Gate Gazipur Chowrasta Mill Gate" +
                        "Board Bazar Gazipur Board Bazar" +
                        "Board Bazar Gazipur Chowrasta Board Bazar" +
                        "" +
                        "" +
                        "Azimpur Labaid Hospital Nilkhet Labaid Hospital New Market Labaid Hospital City College Labaid Hospital" +
                        "Kalabagan Labaid Hospital Dhanmondi 32 Labaid Hospital Dhanmondi 27 Labaid Hospital Asad Gate Labaid Hospital" +
                        "Khamarbari Labaid Hospital Jahangir Gate Labaid Hospital Mohakhali Labaid Hospital Chairman Bari Labaid Hospital" +
                        "Shainik Club Labaid Hospital Banani Labaid Hospital Kakoli Labaid Hospital MES Labaid Hospital Shewra Labaid Hospital" +
                        "Kuril Bishwa Road Labaid Hospital Khilkhet Labaid Hospital Airport Labaid Hospital Jasimuddin Labaid Hospital" +
                        "Rajlakshmi Labaid Hospital Azampur Labaid Hospital House Building Labaid Hospital Abdullahpur Labaid Hospital" +
                        "Tongi Labaid Hospital Station Road Labaid Hospital Mill Gate Labaid Hospital Board Bazar Labaid Hospital Gazipur Labaid Hospital"
        ));


        buses.add(new Bus(R.drawable.logo,"Agradut",
                "Savar Hemayetpur Savar Gabtoli Savar Technical Savar Kallayanpur Savar" +
                        "Savar Shyamoli Savar Shishu Mela Savar Agargaon Savar Bijoy Sarani Savar Jahangir Gate Savar " +
                        "Savar Mohakhali Savar Wireless Mor Savar Gulshan 1 Savar Badda Savar" +
                        "Savar Shahjadpur Savar Bashtola Savar Natun Bazar Savar" +
                        "Hemayetpur Gabtoli Hemayetpur Technical Hemayetpur Kallayanpur Hemayetpur" +
                        "Hemayetpur Shyamoli Hemayetpur Shishu Mela Hemayetpur Agargaon Hemayetpur Bijoy Sarani Hemayetpur Jahangir Gate Hemayetpur " +
                        "Hemayetpur Mohakhali Hemayetpur Wireless Mor Hemayetpur Gulshan 1 Hemayetpur Badda Hemayetpur" +
                        "Hemayetpur Shahjadpur Hemayetpur Bashtola Hemayetpur Natun Bazar Hemayetpur" +
                        "Gabtoli Technical Gabtoli Kallayanpur Gabtoli" +
                        "Gabtoli Shyamoli Gabtoli Shishu Mela Gabtoli Agargaon Gabtoli Bijoy Sarani Gabtoli Jahangir Gate Gabtoli " +
                        "Gabtoli Mohakhali Gabtoli Wireless Mor Gabtoli Gulshan 1 Gabtoli Badda Gabtoli" +
                        "Gabtoli Shahjadpur Gabtoli Bashtola Gabtoli Natun Bazar Gabtoli" +
                        "Technical Kallayanpur Technical" +
                        "Technical Shyamoli Technical Shishu Mela Technical Agargaon Technical Bijoy Sarani Technical Jahangir Gate Technical " +
                        "Technical Mohakhali Technical Wireless Mor Technical Gulshan 1 Technical Badda Technical" +
                        "Technical Shahjadpur Technical Bashtola Technical Natun Bazar Technical" +
                        "Kallayanpur Shyamoli Kallayanpur Shishu Mela Kallayanpur Agargaon Kallayanpur Bijoy Sarani Kallayanpur Jahangir Gate Kallayanpur " +
                        "Kallayanpur Mohakhali Kallayanpur Wireless Mor Kallayanpur Gulshan 1 Kallayanpur Badda Kallayanpur" +
                        "Kallayanpur Shahjadpur Kallayanpur Bashtola Kallayanpur Natun Bazar Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli Agargaon Shyamoli Bijoy Sarani Shyamoli Jahangir Gate Shyamoli " +
                        "Shyamoli Mohakhali Shyamoli Wireless Mor Shyamoli Gulshan 1 Shyamoli Badda Shyamoli" +
                        "Shyamoli Shahjadpur Shyamoli Bashtola Shyamoli Natun Bazar Shyamoli" +
                        "Shishu Mela Agargaon Shishu Mela Bijoy Sarani Shishu Mela Jahangir Gate Shishu Mela " +
                        "Shishu Mela Mohakhali Shishu Mela Wireless Mor Shishu Mela Gulshan 1 Shishu Mela Badda Shishu Mela" +
                        "Shishu Mela Shahjadpur Shishu Mela Bashtola Shishu Mela Natun Bazar Shishu Mela" +
                        "Agargaon Bijoy Sarani Agargaon Jahangir Gate Agargaon " +
                        "Agargaon Mohakhali Agargaon Wireless Mor Agargaon Gulshan 1 Agargaon Badda Agargaon" +
                        "Agargaon Shahjadpur Agargaon Bashtola Agargaon Natun Bazar Agargaon" +
                        "Bijoy Sarani Jahangir Gate Bijoy Sarani " +
                        "Bijoy Sarani Mohakhali Bijoy Sarani Wireless Mor Bijoy Sarani Gulshan 1 Bijoy Sarani Badda Bijoy Sarani" +
                        "Bijoy Sarani Shahjadpur Bijoy Sarani Bashtola Bijoy Sarani Natun Bazar Bijoy Sarani" +
                        "Jahangir Gate Mohakhali Jahangir Gate Wireless Mor Jahangir Gate Gulshan 1 Jahangir Gate Badda Jahangir Gate" +
                        "Jahangir Gate Shahjadpur Jahangir Gate Bashtola Jahangir Gate Natun Bazar Jahangir Gate" +
                        "Mohakhali Wireless Mor Mohakhali Gulshan 1 Mohakhali Badda Mohakhali" +
                        "Mohakhali Shahjadpur Mohakhali Bashtola Mohakhali Natun Bazar Mohakhali" +
                        "Wireless Mor Gulshan 1 Wireless Mor Badda Wireless Mor" +
                        "Wireless Mor Shahjadpur Wireless Mor Bashtola Wireless Mor Natun Bazar Wireless Mor" +
                        "Gulshan 1 Badda Gulshan 1" +
                        "Gulshan 1 Shahjadpur Gulshan 1 Bashtola Gulshan 1 Natun Bazar Gulshan 1" +
                        "Badda Shahjadpur Badda Bashtola Badda Natun Bazar Badda" +
                        "Shahjadpur Bashtola Shahjadpur Natun Bazar Shahjadpur" +
                        "Bashtola Natun Bazar Bashtola"));



        buses.add(new Bus(R.drawable.logo,"Airport Bangabandhu Avenue",
                "Fulbaria Golap Shah Mazar Fulbaria GPO Fulbaria Paltan Fulbaria Press Club Fulbaria High Court Fulbaria " +
                        "Fulbaria Motsho Bhobon Fulbaria Shahbag Fulbaria" +
                        "Fulbaria Bangla Motor Fulbaria Kawran Bazar Fulbaria Farmgate Fulbaria Jahangir Gate Fulbaria " +
                        "Fulbaria Mohakhali Fulbaria Chairman Bari Fulbaria Shainik Club Fulbaria" +
                        "Fulbaria Banani Fulbaria Kakoli Fulbaria Staff Road Fulbaria MES Fulbaria Shewra Fulbaria" +
                        "Fulbaria kuril Bishwa Road Fulbaria khilkhet Fulbaria Airport Fulbaria Rajlakshmi Fulbaria" +
                        "Fulbaria Azampur Fulbaria House Building " +
                        "Fulbaria Abdullahpur Fulbaria" +
                        "Golap Shah Mazar GPO Golap Shah Mazar Paltan Golap Shah Mazar Press Club Golap Shah Mazar High Court Golap Shah Mazar " +
                        "Golap Shah Mazar Motsho Bhobon Golap Shah Mazar Shahbag Golap Shah Mazar" +
                        "Golap Shah Mazar Bangla Motor Golap Shah Mazar Kawran Bazar Golap Shah Mazar Farmgate Golap Shah Mazar Jahangir Gate Golap Shah Mazar " +
                        "Golap Shah Mazar Mohakhali Golap Shah Mazar Chairman Bari Golap Shah Mazar Shainik Club Golap Shah Mazar" +
                        "Golap Shah Mazar Banani Golap Shah Mazar Kakoli Golap Shah Mazar Staff Road Golap Shah Mazar MES Golap Shah Mazar Shewra Golap Shah Mazar" +
                        "Golap Shah Mazar kuril Bishwa Road Golap Shah Mazar khilkhet Golap Shah Mazar Airport Golap Shah Mazar Rajlakshmi Golap Shah Mazar" +
                        "Golap Shah Mazar Azampur Golap Shah Mazar House Building Golap Shah Mazar" +
                        "Golap Shah Mazar Abdullahpur Golap Shah Mazar" +
                        "GPO Paltan GPO Press Club GPO High Court GPO " +
                        "GPO Motsho Bhobon GPO Shahbag GPO" +
                        "GPO Bangla Motor GPO Kawran Bazar GPO Farmgate GPO Jahangir Gate GPO " +
                        "GPO Mohakhali GPO Chairman Bari GPO Shainik Club GPO" +
                        "GPO Banani GPO Kakoli GPO Staff Road GPO MES GPO Shewra GPO" +
                        "GPO kuril Bishwa Road GPO khilkhet GPO Airport GPO Rajlakshmi GPO" +
                        "GPO Azampur GPO House Building GPO" +
                        "GPO Abdullahpur GPO" +
                        "Paltan Press Club Paltan High Court Paltan" +
                        "Paltan Motsho Bhobon Paltan Shahbag Paltan" +
                        "Paltan Bangla Motor Paltan Kawran Bazar Paltan Farmgate Paltan Jahangir Gate Paltan " +
                        "Paltan Mohakhali Paltan Chairman Bari Paltan Shainik Club Paltan" +
                        "Paltan Banani Paltan Kakoli Paltan Staff Road Paltan MES Paltan Shewra Paltan" +
                        "Paltan kuril Bishwa Road Paltan khilkhet Paltan Airport Paltan Rajlakshmi Paltan" +
                        "Paltan Azampur Paltan House Building Paltan" +
                        "Paltan Abdullahpur Paltan" +
                        "Press Club High Court Press Club" +
                        "Press Club Motsho Bhobon Press Club Shahbag Press Club" +
                        "Press Club Bangla Motor Press Club Kawran Bazar Press Club Farmgate Press Club Jahangir Gate Press Club " +
                        "Press Club Mohakhali Press Club Chairman Bari Press Club Shainik Club Press Club" +
                        "Press Club Banani Press Club Kakoli Press Club Staff Road Press Club MES Press Club Shewra Press Club" +
                        "Press Club kuril Bishwa Road Press Club khilkhet Press Club Airport Press Club Rajlakshmi Press Club" +
                        "Press Club Azampur Press Club House Building Press Club" +
                        "Press Club Abdullahpur Press Club" +
                        "High Court Shahbag High Court" +
                        "High Court Bangla Motor High Court Kawran Bazar High Court Farmgate High Court Jahangir Gate High Court " +
                        "High Court Mohakhali High Court Chairman Bari High Court Shainik Club High Court" +
                        "High Court Banani High Court Kakoli High Court Staff Road High Court MES High Court Shewra High Court" +
                        "High Court kuril Bishwa Road High Court khilkhet High Court Airport High Court Rajlakshmi High Court" +
                        "High Court Azampur High Court House Building High Court" +
                        "High Court Abdullahpur High Court" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag Farmgate Shahbag Jahangir Gate Shahbag " +
                        "Shahbag Mohakhali Shahbag Chairman Bari Shahbag Shainik Club Shahbag" +
                        "Shahbag Banani Shahbag Kakoli Shahbag Staff Road Shahbag MES Shahbag Shewra Shahbag" +
                        "Shahbag kuril Bishwa Road Shahbag khilkhet Shahbag Airport Shahbag Rajlakshmi Shahbag" +
                        "Shahbag Azampur Shahbag House Building Shahbag" +
                        "Shahbag Abdullahpur Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Jahangir Gate Bangla Motor " +
                        "Bangla Motor Mohakhali Bangla Motor Chairman Bari Bangla Motor Shainik Club Bangla Motor" +
                        "Bangla Motor Banani Bangla Motor Kakoli Bangla Motor Staff Road Bangla Motor MES Bangla Motor Shewra Bangla Motor" +
                        "Bangla Motor kuril Bishwa Road Bangla Motor khilkhet Bangla Motor Airport Bangla Motor Rajlakshmi Bangla Motor" +
                        "Bangla Motor Azampur Bangla Motor House Building Bangla Motor" +
                        "Bangla Motor Abdullahpur Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Jahangir Gate Kawran Bazar " +
                        "Kawran Bazar Mohakhali Kawran Bazar Chairman Bari Kawran Bazar Shainik Club Kawran Bazar" +
                        "Kawran Bazar Banani Kawran Bazar Kakoli Kawran Bazar Staff Road Kawran Bazar MES Kawran Bazar Shewra Kawran Bazar" +
                        "Kawran Bazar kuril Bishwa Road Kawran Bazar khilkhet Kawran Bazar Airport Kawran Bazar Rajlakshmi Kawran Bazar" +
                        "Kawran Bazar Azampur Kawran Bazar House Building Kawran Bazar" +
                        "Kawran Bazar Abdullahpur Kawran Bazar" +
                        "Farmgate Jahangir Gate Farmgate " +
                        "Farmgate Mohakhali Farmgate Chairman Bari Farmgate Shainik Club Farmgate" +
                        "Farmgate Banani Farmgate Kakoli Farmgate Staff Road Farmgate MES Farmgate Shewra Farmgate" +
                        "Farmgate kuril Bishwa Road Farmgate khilkhet Farmgate Airport Farmgate Rajlakshmi Farmgate" +
                        "Farmgate Azampur Farmgate House Building Farmgate" +
                        "Farmgate Abdullahpur Farmgate" +
                        "Jahangir Gate Mohakhali Jahangir Gate Chairman Bari Jahangir Gate Shainik Club Jahangir Gate" +
                        "Jahangir Gate Banani Jahangir Gate Kakoli Jahangir Gate Staff Road Jahangir Gate MES Jahangir Gate Shewra Jahangir Gate" +
                        "Jahangir Gate kuril Bishwa Road Jahangir Gate khilkhet Jahangir Gate Airport Jahangir Gate Rajlakshmi Jahangir Gate" +
                        "Jahangir Gate Azampur Jahangir Gate House Building Jahangir Gate" +
                        "Jahangir Gate Abdullahpur Jahangir Gate" +
                        "Mohakhali Chairman Bari Mohakhali Shainik Club Mohakhali" +
                        "Mohakhali Banani Mohakhali Kakoli Mohakhali Staff Road Mohakhali MES Mohakhali Shewra Mohakhali" +
                        "Mohakhali kuril Bishwa Road Mohakhali khilkhet Mohakhali Airport Mohakhali Rajlakshmi Mohakhali" +
                        "Mohakhali Azampur Mohakhali House Building Mohakhali" +
                        "Mohakhali Abdullahpur Mohakhali" +
                        "Chairman Bari Shainik Club Chairman Bari" +
                        "Chairman Bari Banani Chairman Bari Kakoli Chairman Bari Staff Road Chairman Bari MES Chairman Bari Shewra Chairman Bari" +
                        "Chairman Bari kuril Bishwa Road Chairman Bari khilkhet Chairman Bari Airport Chairman Bari Rajlakshmi Chairman Bari" +
                        "Chairman Bari Azampur Chairman Bari House Building Chairman Bari" +
                        "Chairman Bari Abdullahpur Chairman Bari" +
                        "Shainik Club Banani Shainik Club Kakoli Shainik Club Staff Road Shainik Club MES Shainik Club Shewra Shainik Club" +
                        "Shainik Club kuril Bishwa Road Shainik Club khilkhet Shainik Club Airport Shainik Club Rajlakshmi Shainik Club" +
                        "Shainik Club Azampur Shainik Club House Building Shainik Club" +
                        "Shainik Club Abdullahpur Shainik Club" +
                        "Banani Kakoli Banani Staff Road Banani MES Banani Shewra Banani" +
                        "Banani kuril Bishwa Road Banani khilkhet Banani Airport Banani Rajlakshmi Banani" +
                        "Banani Azampur Banani House Building Banani" +
                        "Banani Abdullahpur Banani" +
                        "Kakoli Staff Road Kakoli MES Kakoli Shewra Kakoli" +
                        "Kakoli kuril Bishwa Road Kakoli khilkhet Kakoli Airport Kakoli Rajlakshmi Kakoli" +
                        "Kakoli Azampur Kakoli House Building Kakoli" +
                        "Kakoli Abdullahpur Kakoli" +
                        "Staff Road MES Staff Road Shewra Staff Road" +
                        "Staff Road kuril Bishwa Road Staff Road khilkhet Staff Road Airport Staff Road Rajlakshmi Staff Road" +
                        "Staff Road Azampur Staff Road House Building Staff Road" +
                        "Staff Road Abdullahpur Staff Road" +
                        "MES Shewra MES" +
                        "MES kuril Bishwa Road MES khilkhet MES Airport MES Rajlakshmi MES" +
                        "MES Azampur MES House Building MES" +
                        "MES Abdullahpur MES" +
                        "kuril Bishwa Road khilkhet kuril Bishwa Road Airport kuril Bishwa Road Rajlakshmi kuril Bishwa Road" +
                        "kuril Bishwa Road Azampur kuril Bishwa Road House Building kuril Bishwa Road" +
                        "kuril Bishwa Road Abdullahpur kuril Bishwa Road" +
                        "khilkhet Airport khilkhet Rajlakshmi khilkhet" +
                        "khilkhet Azampur khilkhet House Building khilkhet" +
                        "khilkhet Abdullahpur khilkhet" +
                        "Airport Rajlakshmi Airport" +
                        "Airport Azampur Airport House Building Airport" +
                        "Airport Abdullahpur Airport" +
                        "Rajlakshmi Azampur Rajlakshmi House Building Rajlakshmi" +
                        "Rajlakshmi Abdullahpur Rajlakshmi" +
                        "Azampur House Building Azampur" +
                        "Azampur Abdullahpur Azampur" +
                        "House Building Abdullahpur House Building"));


        buses.add(new Bus(R.drawable.logo,"Akik Paribahan",
                "Ansar Camp Mirpur 1 Ansar Camp Sony Hall Ansar Camp Mirpur 2 Ansar Camp Mirpur 10 Ansar Camp Mirpur 11 Ansar Camp" +
                        "Ansar Camp Purobi Ansar Camp Kalshi Ansar Camp ECB Chottor Ansar Camp MES Ansar Camp Kuril Bishwa Road Ansar Camp" +
                        "Ansar Camp Bashundhara Ansar Camp Nadda Ansar Camp" +
                        "Ansar Camp Natun Bazar Ansar Camp" +
                        "Mirpur 1 Sony Hall Mirpur 1 Mirpur 2 Mirpur 1 Mirpur 10 Mirpur 1 Mirpur 11 Mirpur 1" +
                        "Mirpur 1 Purobi Mirpur 1 Kalshi Mirpur 1 ECB Chottor Mirpur 1 MES Mirpur 1 Kuril Bishwa Road Mirpur 1" +
                        "Mirpur 1 Bashundhara Mirpur 1 Nadda Mirpur 1" +
                        "Mirpur 1 Natun Bazar Mirpur 1" +
                        "Sony Hall Mirpur 2 Sony Hall Mirpur 10 Sony Hall Mirpur 11 Sony Hall" +
                        "Sony Hall Purobi Sony Hall Kalshi Sony Hall ECB Chottor Sony Hall MES Sony Hall Kuril Bishwa Road Sony Hall" +
                        "Sony Hall Bashundhara Sony Hall Nadda Sony Hall" +
                        "Sony Hall Natun Bazar Sony Hall" +
                        "Mirpur 2 Mirpur 10 Mirpur 2 Mirpur 11 Mirpur 2" +
                        "Mirpur 2 Purobi Mirpur 2 Kalshi Mirpur 2 ECB Chottor Mirpur 2 MES Mirpur 2 Kuril Bishwa Road Mirpur 2" +
                        "Mirpur 2 Bashundhara Mirpur 2 Nadda Mirpur 2" +
                        "Mirpur 2 Natun Bazar Mirpur 2" +
                        "Mirpur 10 Mirpur 11 Mirpur 10" +
                        "Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10 ECB Chottor Mirpur 10 MES Mirpur 10 Kuril Bishwa Road Mirpur 10" +
                        "Mirpur 10 Bashundhara Mirpur 10 Nadda Mirpur 10" +
                        "Mirpur 10 Natun Bazar Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Kalshi Mirpur 11 ECB Chottor Mirpur 11 MES Mirpur 11 Kuril Bishwa Road Mirpur 11" +
                        "Mirpur 11 Bashundhara Mirpur 11 Nadda Mirpur 11" +
                        "Mirpur 11 Natun Bazar Mirpur 11" +
                        "Purobi Kalshi Purobi ECB Chottor Purobi MES Purobi Kuril Bishwa Road Purobi" +
                        "Purobi Bashundhara Purobi Nadda Purobi" +
                        "Purobi Natun Bazar Purobi" +
                        "Kalshi ECB Chottor Kalshi MES Kalshi Kuril Bishwa Road Kalshi" +
                        "Kalshi Bashundhara Kalshi Nadda Kalshi" +
                        "Kalshi Natun Bazar Kalshi" +
                        "ECB Chottor MES ECB Chottor Kuril Bishwa Road ECB Chottor" +
                        "ECB Chottor Bashundhara ECB Chottor Nadda ECB Chottor" +
                        "ECB Chottor Natun Bazar ECB Chottor" +
                        "MES Kuril Bishwa Road MES" +
                        "MES Bashundhara MES Nadda MES" +
                        "MES Natun Bazar MES" +
                        "Kuril Bishwa Road Bashundhara Kuril Bishwa Road Nadda Kuril Bishwa Road" +
                        "Kuril Bishwa Road Natun Bazar Kuril Bishwa Road" +
                        "Bashundhara Nadda Bashundhara" +
                        "Bashundhara Natun Bazar Bashundhara" +
                        "Nadda Natun Bazar Nadda"));


        buses.add(new Bus(R.drawable.logo,"Al Modina Plus One",
                "Nandan Park Zirani Bazar Nandan Park Baipayl Nandan Park Nobinagar Nandan Park Savar Nandan Park" +
                        "Nandan Park Hemayetpur Nandan Park Aminbazar Nandan Park Gabtoli Nandan Park Technical Nandan Park Kallayanpur Nandan Park" +
                        "Nandan Park Shyamoli Nandan Park Shishu Mela Nandan Park College Gate Nandan Park Asad Gate Nandan Park" +
                        "Nandan Park Khamarbari Nandan Park Farmgate Nandan Park Kawran Bazar Nandan Park Bangla Motor Nandan Park Shahbag Nandan Park" +
                        "Nandan Park High Court Nandan Park Press Club Nandan Park Paltan Nandan Park GPO Nandan Park Gulisthan Nandan Park" +
                        "Nandan Park Motijheel Nandan Park Kamalapur Nandan Park" +
                        "Zirani Bazar Baipayl Zirani Bazar Nobinagar Zirani Bazar Savar Zirani Bazar" +
                        "Zirani Bazar Hemayetpur Zirani Bazar Aminbazar Zirani Bazar Gabtoli Zirani Bazar Technical Zirani Bazar Kallayanpur Zirani Bazar" +
                        "Zirani Bazar Shyamoli Zirani Bazar Shishu Mela Zirani Bazar College Gate Zirani Bazar Asad Gate Zirani Bazar" +
                        "Zirani Bazar Khamarbari Zirani Bazar Farmgate Zirani Bazar Kawran Bazar Zirani Bazar Bangla Motor Zirani Bazar Shahbag Zirani Bazar" +
                        "Zirani Bazar High Court Zirani Bazar Press Club Zirani Bazar Paltan Zirani Bazar GPO Zirani Bazar Gulisthan Zirani Bazar" +
                        "Zirani Bazar Motijheel Zirani Bazar Kamalapur Zirani Bazar" +
                        "Baipayl Nobinagar Baipayl Savar Baipayl" +
                        "Baipayl Hemayetpur Baipayl Aminbazar Baipayl Gabtoli Baipayl Technical Baipayl Kallayanpur Baipayl" +
                        "Baipayl Shyamoli Baipayl Shishu Mela Baipayl College Gate Baipayl Asad Gate Baipayl" +
                        "Baipayl Khamarbari Baipayl Farmgate Baipayl Kawran Bazar Baipayl Bangla Motor Baipayl Shahbag Baipayl" +
                        "Baipayl High Court Baipayl Press Club Baipayl Paltan Baipayl GPO Baipayl Gulisthan Baipayl" +
                        "Baipayl Motijheel Baipayl Kamalapur Baipayl" +
                        "Nobinagar Savar Nobinagar" +
                        "Nobinagar Hemayetpur Nobinagar Aminbazar Nobinagar Gabtoli Nobinagar Technical Nobinagar Kallayanpur Nobinagar" +
                        "Nobinagar Shyamoli Nobinagar Shishu Mela Nobinagar College Gate Nobinagar Asad Gate Nobinagar" +
                        "Nobinagar Khamarbari Nobinagar Farmgate Nobinagar Kawran Bazar Nobinagar Bangla Motor Nobinagar Shahbag Nobinagar" +
                        "Nobinagar High Court Nobinagar Press Club Nobinagar Paltan Nobinagar GPO Nobinagar Gulisthan Nobinagar" +
                        "Nobinagar Motijheel Nobinagar Kamalapur Nobinagar" +
                        "Hemayetpur Aminbazar Hemayetpur Gabtoli Hemayetpur Technical Hemayetpur Kallayanpur Hemayetpur" +
                        "Hemayetpur Shyamoli Hemayetpur Shishu Mela Hemayetpur College Gate Hemayetpur Asad Gate Hemayetpur" +
                        "Hemayetpur Khamarbari Hemayetpur Farmgate Hemayetpur Kawran Bazar Hemayetpur Bangla Motor Hemayetpur Shahbag Hemayetpur" +
                        "Hemayetpur High Court Hemayetpur Press Club Hemayetpur Paltan Hemayetpur GPO Hemayetpur Gulisthan Hemayetpur" +
                        "Hemayetpur Motijheel Hemayetpur Kamalapur Hemayetpur" +
                        "Aminbazar Gabtoli Aminbazar Technical Aminbazar Kallayanpur Aminbazar" +
                        "Aminbazar Shyamoli Aminbazar Shishu Mela Aminbazar College Gate Aminbazar Asad Gate Aminbazar" +
                        "Aminbazar Khamarbari Aminbazar Farmgate Aminbazar Kawran Bazar Aminbazar Bangla Motor Aminbazar Shahbag Aminbazar" +
                        "Aminbazar High Court Aminbazar Press Club Aminbazar Paltan Aminbazar GPO Aminbazar Gulisthan Aminbazar" +
                        "Aminbazar Motijheel Aminbazar Kamalapur Aminbazar" +
                        "Shyamoli Shishu Mela Shyamoli College Gate Shyamoli Asad Gate Shyamoli" +
                        "Shyamoli Khamarbari Shyamoli Farmgate Shyamoli Kawran Bazar Shyamoli Bangla Motor Shyamoli Shahbag Shyamoli" +
                        "Shyamoli High Court Shyamoli Press Club Shyamoli Paltan Shyamoli GPO Shyamoli Gulisthan Shyamoli" +
                        "Shyamoli Motijheel Shyamoli Kamalapur Shyamoli" +
                        "Shishu Mela College Gate Shishu Mela Asad Gate Shishu Mela" +
                        "Shishu Mela Khamarbari Shishu Mela Farmgate Shishu Mela Kawran Bazar Shishu Mela Bangla Motor Shishu Mela Shahbag Shishu Mela" +
                        "Shishu Mela High Court Shishu Mela Press Club Shishu Mela Paltan Shishu Mela GPO Shishu Mela Gulisthan Shishu Mela" +
                        "Shishu Mela Motijheel Shishu Mela Kamalapur Shishu Mela" +
                        "College Gate Asad Gate College Gate" +
                        "College Gate Khamarbari College Gate Farmgate College Gate Kawran Bazar College Gate Bangla Motor College Gate Shahbag College Gate" +
                        "College Gate High Court College Gate Press Club College Gate Paltan College Gate GPO College Gate Gulisthan College Gate" +
                        "College Gate Motijheel College Gate Kamalapur College Gate" +
                        "Asad Gate Khamarbari Asad Gate Farmgate Asad Gate Kawran Bazar Asad Gate Bangla Motor Asad Gate Shahbag Asad Gate" +
                        "Asad Gate High Court Asad Gate Press Club Asad Gate Paltan Asad Gate GPO Asad Gate Gulisthan Asad Gate" +
                        "Asad Gate Motijheel Asad Gate Kamalapur Asad Gate" +
                        "Khamarbari Farmgate Khamarbari Kawran Bazar Khamarbari Bangla Motor Khamarbari Shahbag Khamarbari" +
                        "Khamarbari High Court Khamarbari Press Club Khamarbari Paltan Khamarbari GPO Khamarbari Gulisthan Khamarbari" +
                        "Khamarbari Motijheel Khamarbari Kamalapur Khamarbari" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate Shahbag Farmgate" +
                        "Farmgate High Court Farmgate Press Club Farmgate Paltan Farmgate GPO Farmgate Gulisthan Farmgate" +
                        "Farmgate Motijheel Farmgate Kamalapur Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar Shahbag Kawran Bazar" +
                        "Kawran Bazar High Court Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar GPO Kawran Bazar Gulisthan Kawran Bazar" +
                        "Kawran Bazar Motijheel Kawran Bazar Kamalapur Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor" +
                        "Bangla Motor High Court Bangla Motor Press Club Bangla Motor Paltan Bangla Motor GPO Bangla Motor Gulisthan Bangla Motor" +
                        "Bangla Motor Motijheel Bangla Motor Kamalapur Bangla Motor" +
                        "Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag GPO Shahbag Gulisthan Shahbag" +
                        "Shahbag Motijheel Shahbag Kamalapur Shahbag" +
                        "High Court Press Club High Court Paltan High Court GPO High Court Gulisthan High Court" +
                        "High Court Motijheel High Court Kamalapur High Court" +
                        "Press Club Paltan Press Club GPO Press Club Gulisthan Press Club" +
                        "Press Club Motijheel Press Club Kamalapur Press Club" +
                        "Paltan GPO Paltan Gulisthan Paltan" +
                        "Paltan Motijheel Paltan Kamalapur Paltan" +
                        "GPO Gulisthan GPO" +
                        "GPO Motijheel GPO Kamalapur GPO" +
                        "Gulisthan Motijheel Gulistan Kamalapur Gulistan" +
                        "Motijheel Kamalapur Motijheel"));


        buses.add(new Bus(R.drawable.logo,"Al Mokka Transport",
                "Motijheel Gulisthan Motijheel GPO Motijheel Paltan Motijheel Kakrail Motijheel Malibagh Motijheel" +
                        "Motijheel Mouchak Motijheel Moghbazar Motijheel Nabisko Motijheel Mohakhali Motijheel " +
                        "Motijheel Chairman Bari Motijheel Kakoli Motijheel Banani Motijheel ECB Chattar Motijheel" +
                        "Motijheel Kalshi Motijheel Purobi Motijheel Mirpur 10 Motijheel Mirpur 2 Motijheel" +
                        "Motijheel Mirpur 1 Motijheel" +
                        "Gulisthan GPO Gulisthan Paltan Gulisthan Kakrail Gulisthan Malibagh Gulisthan" +
                        "Gulisthan Mouchak Gulisthan Moghbazar Gulisthan Nabisko Gulisthan Mohakhali Gulisthan " +
                        "Gulisthan Chairman Bari Gulisthan Kakoli Gulisthan Banani Gulisthan ECB Chattar Gulisthan" +
                        "Gulisthan Kalshi Gulisthan Purobi Gulisthan Mirpur 10 Gulisthan Mirpur 2 Gulisthan" +
                        "Gulisthan Mirpur 1 Gulisthan" +
                        "GPO Paltan GPO Kakrail GPO Malibagh GPO" +
                        "GPO Mouchak GPO Moghbazar GPO Nabisko GPO Mohakhali GPO " +
                        "GPO Chairman Bari GPO Kakoli GPO Banani GPO ECB Chattar GPO" +
                        "GPO Kalshi GPO Purobi GPO Mirpur 10 GPO Mirpur 2 GPO" +
                        "GPO Mirpur 1 GPO" +
                        "Paltan Kakrail Paltan Malibagh Paltan" +
                        "Paltan Mouchak Paltan Moghbazar Paltan Nabisko Paltan Mohakhali Paltan " +
                        "Paltan Chairman Bari Paltan Kakoli Paltan Banani Paltan ECB Chattar Paltan" +
                        "Paltan Kalshi Paltan Purobi Paltan Mirpur 10 Paltan Mirpur 2 Paltan" +
                        "Paltan Mirpur 1 Paltan" +
                        "Kakrail Malibagh Kakrail" +
                        "Kakrail Mouchak Kakrail Moghbazar Kakrail Nabisko Kakrail Mohakhali Kakrail " +
                        "Kakrail Chairman Bari Kakrail Kakoli Kakrail Banani Kakrail ECB Chattar Kakrail" +
                        "Kakrail Kalshi Kakrail Purobi Kakrail Mirpur 10 Kakrail Mirpur 2 Kakrail" +
                        "Kakrail Mirpur 1 Kakrail" +
                        "Malibagh Mouchak Malibagh Moghbazar Malibagh Nabisko Malibagh Mohakhali Malibagh " +
                        "Malibagh Chairman Bari Malibagh Kakoli Malibagh Banani Malibagh ECB Chattar Malibagh" +
                        "Malibagh Kalshi Malibagh Purobi Malibagh Mirpur 10 Malibagh Mirpur 2 Malibagh" +
                        "Malibagh Mirpur 1 Malibagh" +
                        "Mouchak Moghbazar Mouchak Nabisko Mouchak Mohakhali Mouchak " +
                        "Mouchak Chairman Bari Mouchak Kakoli Mouchak Banani Mouchak ECB Chattar Mouchak" +
                        "Mouchak Kalshi Mouchak Purobi Mouchak Mirpur 10 Mouchak Mirpur 2 Mouchak" +
                        "Mouchak Mirpur 1 Mouchak" +
                        "Moghbazar Nabisko Moghbazar Mohakhali Moghbazar " +
                        "Moghbazar Chairman Bari Moghbazar Kakoli Moghbazar Banani Moghbazar ECB Chattar Moghbazar" +
                        "Moghbazar Kalshi Moghbazar Purobi Moghbazar Mirpur 10 Moghbazar Mirpur 2 Moghbazar" +
                        "Moghbazar Mirpur 1 Moghbazar" +
                        "Nabisko Mohakhali Nabisko " +
                        "Nabisko Chairman Bari Nabisko Kakoli Nabisko Banani Nabisko ECB Chattar Nabisko" +
                        "Nabisko Kalshi Nabisko Purobi Nabisko Mirpur 10 Nabisko Mirpur 2 Nabisko" +
                        "Nabisko Mirpur 1 Nabisko" +
                        "Mohakhali Chairman Bari Mohakhali Kakoli Mohakhali Banani Mohakhali ECB Chattar Mohakhali" +
                        "Mohakhali Kalshi Mohakhali Purobi Mohakhali Mirpur 10 Mohakhali Mirpur 2 Mohakhali" +
                        "Mohakhali Mirpur 1 Mohakhali" +
                        "Chairman Bari Kakoli Chairman Bari Banani Chairman Bari ECB Chattar Chairman Bari" +
                        "Chairman Bari Kalshi Chairman Bari Purobi Chairman Bari Mirpur 10 Chairman Bari Mirpur 2 Chairman Bari" +
                        "Chairman Bari Mirpur 1 Chairman Bari" +
                        "Kakoli Banani Kakoli ECB Chattar Kakoli" +
                        "Kakoli Kalshi Kakoli Purobi Kakoli Mirpur 10 Kakoli Mirpur 2 Kakoli" +
                        "Kakoli Mirpur 1 Kakoli" +
                        "Banani ECB Chattar Banani" +
                        "Banani Kalshi Banani Purobi Banani Mirpur 10 Banani Mirpur 2 Banani" +
                        "Banani Mirpur 1 Banani" +
                        "ECB Chattar Kalshi ECB Chattar Purobi ECB Chattar Mirpur 10 ECB Chattar Mirpur 2 ECB Chattar" +
                        "ECB Chattar Mirpur 1 ECB Chattar" +
                        "Kalshi Purobi Kalshi Mirpur 10 Kalshi Mirpur 2 Kalshi" +
                        "Kalshi Mirpur 1 Kalshi" +
                        "Purobi Mirpur 10 Purobi Mirpur 2 Purobi" +
                        "Purobi Mirpur 1 Purobi" +
                        "Mirpur 10 Mirpur 2 Mirpur 10" +
                        "Mirpur 10 Mirpur 1 Mirpur 10" +
                        "Mirpur 2 Mirpur 1 Mirpur 2"));


        buses.add(new Bus(R.drawable.logo,"Alif Enterprise",
                "Mirpur 1 Mirpur 2 Mirpur 1 Mirpur 10 Mirpur 1 Kazipara Mirpur 1 Shewrapara Mirpur 1 Agargaon Mirpur 1" +
                        "Mirpur 1 Bijoy Sarani Mirpur 1 Jahangir Gate Mirpur 1 Mohakhali Mirpur 1 Wireless Mor Mirpur 1" +
                        "Mirpur 1 Gulshan Bridge Mirpur 1 Gulshan 1 Mirpur 1 Badda Mirpur 1 Rampura Bridge Mirpur 1" +
                        "Mirpur 1 Banasree Mirpur 1" +
                        "Mirpur 2 Mirpur 10 Mirpur 2 Kazipara Mirpur 2 Shewrapara Mirpur 2 Agargaon Mirpur 2" +
                        "Mirpur 2 Bijoy Sarani Mirpur 2 Jahangir Gate Mirpur 2 Mohakhali Mirpur 2 Wireless Mor Mirpur 2" +
                        "Mirpur 2 Gulshan Bridge Mirpur 2 Gulshan 1 Mirpur 2 Badda Mirpur 2 Rampura Bridge Mirpur 2" +
                        "Mirpur 2 Banasree Mirpur 2" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10 Agargaon Mirpur 10" +
                        "Mirpur 10 Bijoy Sarani Mirpur 10 Jahangir Gate Mirpur 10 Mohakhali Mirpur 10 Wireless Mor Mirpur 10" +
                        "Mirpur 10 Gulshan Bridge Mirpur 10 Gulshan 1 Mirpur 10 Badda Mirpur 10 Rampura Bridge Mirpur 10" +
                        "Mirpur 10 Banasree Mirpur 10" +
                        "Kazipara Shewrapara Kazipara Agargaon Kazipara" +
                        "Kazipara Bijoy Sarani Kazipara Jahangir Gate Kazipara Mohakhali Kazipara Wireless Mor Kazipara" +
                        "Kazipara Gulshan Bridge Kazipara Gulshan 1 Kazipara Badda Kazipara Rampura Bridge Kazipara" +
                        "Kazipara Banasree Kazipara" +
                        "Shewrapara Agargaon Shewrapara" +
                        "Shewrapara Bijoy Sarani Shewrapara Jahangir Gate Shewrapara Mohakhali Shewrapara Wireless Mor Shewrapara" +
                        "Shewrapara Gulshan Bridge Shewrapara Gulshan 1 Shewrapara Badda Shewrapara Rampura Bridge Shewrapara" +
                        "Shewrapara Banasree Shewrapara" +
                        "Agargaon Bijoy Sarani Agargaon Jahangir Gate Agargaon Mohakhali Agargaon Wireless Mor Agargaon" +
                        "Agargaon Gulshan Bridge Agargaon Gulshan 1 Agargaon Badda Agargaon Rampura Bridge Agargaon" +
                        "Agargaon Banasree Agargaon" +
                        "Bijoy Sarani Jahangir Gate Bijoy Sarani Mohakhali Bijoy Sarani Wireless Mor Bijoy Sarani" +
                        "Bijoy Sarani Gulshan Bridge Bijoy Sarani Gulshan 1 Bijoy Sarani Badda Bijoy Sarani Rampura Bridge Bijoy Sarani" +
                        "Bijoy Sarani Banasree Bijoy Sarani" +
                        "Jahangir Gate Mohakhali Jahangir Gate Wireless Mor Jahangir Gate" +
                        "Jahangir Gate Gulshan Bridge Jahangir Gate Gulshan 1 Jahangir Gate Badda Jahangir Gate Rampura Bridge Jahangir Gate" +
                        "Jahangir Gate Banasree Jahangir Gate" +
                        "Mohakhali Wireless Mor Mohakhali" +
                        "Mohakhali Gulshan Bridge Mohakhali Gulshan 1 Mohakhali Badda Mohakhali Rampura Bridge Mohakhali" +
                        "Mohakhali Banasree Mohakhali" +
                        "Wireless Mor Gulshan Bridge Wireless Mor Gulshan 1 Wireless Mor Badda Wireless Mor Rampura Bridge Wireless Mor" +
                        "Wireless Mor Banasree Wireless Mor" +
                        "Gulshan Bridge Gulshan 1 Gulshan Bridge Badda Gulshan Bridge Rampura Bridge Gulshan Bridge" +
                        "Gulshan Bridge Banasree Gulshan Bridge" +
                        "Gulshan 1 Badda Gulshan 1 Rampura Bridge Gulshan 1" +
                        "Gulshan 1 Banasree Gulshan 1" +
                        "Badda Rampura Bridge Badda" +
                        "Badda Banasree Badda" +
                        "Rampura Bridge Banasree Rampura Bridge"));


        buses.add(new Bus(R.drawable.logo,"Alif Enterprise 2",
                "Shia Masjid Japan Garden City Shia Masjid Adabor Shia Masjid Shyamoli Shia Masjid Shishu Mela Shia Masjid" +
                        "Shia Masjid Agargaon Shia Masjid Bijoy Sarani Shia Masjid Old Airport Shia Masjid Jahangir Gate Shia Masjid" +
                        "Shia Masjid Mohakhali Shia Masjid Wireless Mor Shia Masjid Gulshan 1 Shia Masjid Link Road Shia Masjid" +
                        "Shia Masjid Badda Shia Masjid Madhya Badda Shia Masjid Merul Shia Masjid Rampura Bridge Shia Masjid" +
                        "Shia Masjid Banasree Shia Masjid" +
                        "Japan Garden City Adabor Japan Garden City Shyamoli Japan Garden City Shishu Mela Japan Garden City" +
                        "Japan Garden City Agargaon Japan Garden City Bijoy Sarani Japan Garden City Old Airport Japan Garden City Jahangir Gate Japan Garden City" +
                        "Japan Garden City Mohakhali Japan Garden City Wireless Mor Japan Garden City Gulshan 1 Japan Garden City Link Road Japan Garden City" +
                        "Japan Garden City Badda Japan Garden City Madhya Badda Japan Garden City Merul Japan Garden City Rampura Bridge Japan Garden City" +
                        "Japan Garden City Banasree Japan Garden City" +
                        "Adabor Shyamoli Adabor Shishu Mela Adabor" +
                        "Adabor Agargaon Adabor Bijoy Sarani Adabor Old Airport Adabor Jahangir Gate Adabor" +
                        "Adabor Mohakhali Adabor Wireless Mor Adabor Gulshan 1 Adabor Link Road Adabor" +
                        "Adabor Badda Adabor Madhya Badda Adabor Merul Adabor Rampura Bridge Adabor" +
                        "Adabor Banasree Adabor" +
                        "Shyamoli Shishu Mela Shyamoli" +
                        "Shyamoli Agargaon Shyamoli Bijoy Sarani Shyamoli Old Airport Shyamoli Jahangir Gate Shyamoli" +
                        "Shyamoli Mohakhali Shyamoli Wireless Mor Shyamoli Gulshan 1 Shyamoli Link Road Shyamoli" +
                        "Shyamoli Badda Shyamoli Madhya Badda Shyamoli Merul Shyamoli Rampura Bridge Shyamoli" +
                        "Shyamoli Banasree Shyamoli" +
                        "Shishu Mela Agargaon Shishu Mela Bijoy Sarani Shishu Mela Old Airport Shishu Mela Jahangir Gate Shishu Mela" +
                        "Shishu Mela Mohakhali Shishu Mela Wireless Mor Shishu Mela Gulshan 1 Shishu Mela Link Road Shishu Mela" +
                        "Shishu Mela Badda Shishu Mela Madhya Badda Shishu Mela Merul Shishu Mela Rampura Bridge Shishu Mela" +
                        "Shishu Mela Banasree Shishu Mela" +
                        "Agargaon Bijoy Sarani Agargaon Old Airport Agargaon Jahangir Gate Agargaon" +
                        "Agargaon Mohakhali Agargaon Wireless Mor Agargaon Gulshan 1 Agargaon Link Road Agargaon" +
                        "Agargaon Badda Agargaon Madhya Badda Agargaon Merul Agargaon Rampura Bridge Agargaon" +
                        "Agargaon Banasree Agargaon" +
                        "Bijoy Sarani Old Airport Bijoy Sarani Jahangir Gate Bijoy Sarani" +
                        "Bijoy Sarani Mohakhali Bijoy Sarani Wireless Mor Bijoy Sarani Gulshan 1 Bijoy Sarani Link Road Bijoy Sarani" +
                        "Bijoy Sarani Badda Bijoy Sarani Madhya Badda Bijoy Sarani Merul Bijoy Sarani Rampura Bridge Bijoy Sarani" +
                        "Bijoy Sarani Banasree Bijoy Sarani" +
                        "Old Airport Jahangir Gate Old Airport" +
                        "Old Airport Mohakhali Old Airport Wireless Mor Old Airport Gulshan 1 Old Airport Link Road Old Airport" +
                        "Old Airport Badda Old Airport Madhya Badda Old Airport Merul Old Airport Rampura Bridge Old Airport" +
                        "Old Airport Banasree Old Airport" +
                        "Jahangir Gate Mohakhali Jahangir Gate Wireless Mor Jahangir Gate Gulshan 1 Jahangir Gate Link Road Jahangir Gate" +
                        "Jahangir Gate Badda Jahangir Gate Madhya Badda Jahangir Gate Merul Jahangir Gate Rampura Bridge Jahangir Gate" +
                        "Jahangir Gate Banasree Jahangir Gate" +
                        "Mohakhali Wireless Mor Mohakhali Gulshan 1 Mohakhali Link Road Mohakhali" +
                        "Mohakhali Badda Mohakhali Madhya Badda Mohakhali Merul Mohakhali Rampura Bridge Mohakhali" +
                        "Mohakhali Banasree Mohakhali" +
                        "Wireless Mor Gulshan 1 Wireless Mor Link Road Wireless Mor" +
                        "Wireless Mor Badda Wireless Mor Madhya Badda Wireless Mor Merul Wireless Mor Rampura Bridge Wireless Mor" +
                        "Wireless Mor Banasree Wireless Mor" +
                        "Gulshan 1 Link Road Gulshan 1" +
                        "Gulshan 1 Badda Gulshan 1 Madhya Badda Gulshan 1 Merul Gulshan 1 Rampura Bridge Gulshan 1" +
                        "Gulshan 1 Banasree Gulshan 1" +
                        "Link Road Badda Link Road Madhya Badda Link Road Merul Link Road Rampura Bridge Link Road" +
                        "Link Road Banasree Link Road" +
                        "Badda Madhya Badda Badda Merul Badda Rampura Bridge Badda" +
                        "Badda Banasree Badda" +
                        "Madhya Badda Merul Madhya Badda Rampura Bridge Madhya Badda" +
                        "Madhya Badda Banasree Madhya Badda" +
                        "Merul Rampura Bridge Merul" +
                        "Merul Banasree Merul" +
                        "Rampura Bridge Banasree Rampura Bridge"));


        buses.add(new Bus(R.drawable.logo,"Alif Enterprise 3",
                "Mirpur 14 Mirpur 10 Mirpur 14 Mirpur 2 Mirpur 14 Sony Hall Mirpur 14 Mirpur 1 Mirpur 14 Konabari Mirpur 14" +
                        "Mirpur 14 Rupnagar Mirpur 14 Birulia Mirpur 14 Ashulia Mirpur 14 Zirabo Mirpur 14" +
                        "Mirpur 14 Fantasy Kingdom Mirpur 14" +
                        "Mirpur 10 Mirpur 2 Mirpur 10 Sony Hall Mirpur 10 Mirpur 1 Mirpur 10 Konabari Mirpur 10" +
                        "Mirpur 10 Rupnagar Mirpur 10 Birulia Mirpur 10 Ashulia Mirpur 10 Zirabo Mirpur 10" +
                        "Mirpur 10 Fantasy Kingdom Mirpur 10" +
                        "Mirpur 2 Sony Hall Mirpur 2 Mirpur 1 Mirpur 2 Konabari Mirpur 2" +
                        "Mirpur 2 Rupnagar Mirpur 2 Birulia Mirpur 2 Ashulia Mirpur 2 Zirabo Mirpur 2" +
                        "Mirpur 2 Fantasy Kingdom Mirpur 2" +
                        "Sony Hall Mirpur 1 Sony Hall Konabari Sony Hall" +
                        "Sony Hall Rupnagar Sony Hall Birulia Sony Hall Ashulia Sony Hall Zirabo Sony Hall" +
                        "Sony Hall Fantasy Kingdom Sony Hall" +
                        "Mirpur 1 Konabari Mirpur 1" +
                        "Mirpur 1 Rupnagar Mirpur 1 Birulia Mirpur 1 Ashulia Mirpur 1 Zirabo Mirpur 1" +
                        "Mirpur 1 Fantasy Kingdom Mirpur 1" +
                        "Konabari Rupnagar Konabari Birulia Konabari Ashulia Konabari Zirabo Konabari" +
                        "Konabari Fantasy Kingdom Konabari" +
                        "Rupnagar Birulia Rupnagar Ashulia Rupnagar Zirabo Rupnagar" +
                        "Rupnagar Fantasy Kingdom Rupnagar" +
                        "Birulia Ashulia Birulia Zirabo Birulia" +
                        "Birulia Fantasy Kingdom Birulia" +
                        "Ashulia Zirabo Ashulia" +
                        "Ashulia Fantasy Kingdom Ashulia" +
                        "Zirabo Fantasy Kingdom Zirabo"));


        buses.add(new Bus(R.drawable.logo,"Alike",
                "Balughat Signal Balughat CMH Balughat Garrison Balughat Adamjee College Balughat Workshop Balughat" +
                        "Balughat Jahangir Gate Balughat Farmgate Balughat Kawran Bazar Balughat Bangla Motor Balughat" +
                        "Balughat Shahbag Balughat" +
                        "Signal CMH Signal Garrison Signal Adamjee College Signal Workshop Signal" +
                        "Signal Jahangir Gate Signal Farmgate Signal Kawran Bazar Signal Bangla Motor Signal" +
                        "Signal Shahbag Signal" +
                        "CMH Garrison CMH Adamjee College CMH Workshop CMH" +
                        "CMH Jahangir Gate CMH Farmgate CMH Kawran Bazar CMH Bangla Motor CMH" +
                        "CMH Shahbag CMH" +
                        "Garrison Adamjee College Garrison Workshop Garrison" +
                        "Garrison Jahangir Gate Garrison Farmgate Garrison Kawran Bazar Garrison Bangla Motor Garrison" +
                        "Garrison Shahbag Garrison" +
                        "Adamjee College Workshop Adamjee College" +
                        "Adamjee College Jahangir Gate Adamjee College Farmgate Adamjee College Kawran Bazar Adamjee College Bangla Motor Adamjee College" +
                        "Adamjee College Shahbag Adamjee College" +
                        "Workshop Jahangir Gate Workshop Farmgate Workshop Kawran Bazar Workshop Bangla Motor Workshop" +
                        "Workshop Shahbag Workshop" +
                        "Jahangir Gate Farmgate Jahangir Gate Kawran Bazar Jahangir Gate Bangla Motor Jahangir Gate" +
                        "Jahangir Gate Shahbag Jahangir Gate" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate" +
                        "Farmgate Shahbag Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar" +
                        "Kawran Bazar Shahbag Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor"));


        buses.add(new Bus(R.drawable.logo,"Anabil",
                "Sign Board Shonir Akhra Sign Board Jatrabari Sign Board Sayedabad Sign Board Mugdapara Sign Board Basabo Sign Board" +
                        "Sign Board Khilgaon Sign Board Malibagh Sign Board Rampura Sign Board Merul Sign Board Badda Sign Board Natun Bazar Sign Board" +
                        "Sign Board Nadda Sign Board Kuril Bishwa Road Sign Board Khilkhet Sign Board Airport Sign Board House Building Sign Board" +
                        "Sign Board Abdullahpur Sign Board Tongi Sign Board Gazipur Chowrasta Sign Board" +
                        "Shonir Akhra Jatrabari Shonir Akhra Sayedabad Shonir Akhra Mugdapara Shonir Akhra Basabo Shonir Akhra" +
                        "Shonir Akhra Khilgaon Shonir Akhra Malibagh Shonir Akhra Rampura Shonir Akhra Merul Shonir Akhra Badda Shonir Akhra Natun Bazar Shonir Akhra" +
                        "Shonir Akhra Nadda Shonir Akhra Kuril Bishwa Road Shonir Akhra Khilkhet Shonir Akhra Airport Shonir Akhra House Building Shonir Akhra" +
                        "Shonir Akhra Abdullahpur Shonir Akhra Tongi Shonir Akhra Gazipur Chowrasta Shonir Akhra" +
                        "Jatrabari Sayedabad Jatrabari Mugdapara Jatrabari Basabo Jatrabari" +
                        "Jatrabari Khilgaon Jatrabari Malibagh Jatrabari Rampura Jatrabari Merul Jatrabari Badda Jatrabari Natun Bazar Jatrabari" +
                        "Jatrabari Nadda Jatrabari Kuril Bishwa Road Jatrabari Khilkhet Jatrabari Airport Jatrabari House Building Jatrabari" +
                        "Jatrabari Abdullahpur Jatrabari Tongi Jatrabari Gazipur Chowrasta Jatrabari" +
                        "Sayedabad Mugdapara Sayedabad Basabo Sayedabad" +
                        "Sayedabad Khilgaon Sayedabad Malibagh Sayedabad Rampura Sayedabad Merul Sayedabad Badda Sayedabad Natun Bazar Sayedabad" +
                        "Sayedabad Nadda Sayedabad Kuril Bishwa Road Sayedabad Khilkhet Sayedabad Airport Sayedabad House Building Sayedabad" +
                        "Sayedabad Abdullahpur Sayedabad Tongi Sayedabad Gazipur Chowrasta Sayedabad" +
                        "Mugdapara Basabo Mugdapara" +
                        "Mugdapara Khilgaon Mugdapara Malibagh Mugdapara Rampura Mugdapara Merul Mugdapara Badda Mugdapara Natun Bazar Mugdapara" +
                        "Mugdapara Nadda Mugdapara Kuril Bishwa Road Mugdapara Khilkhet Mugdapara Airport Mugdapara House Building Mugdapara" +
                        "Mugdapara Abdullahpur Mugdapara Tongi Mugdapara Gazipur Chowrasta Mugdapara" +
                        "Basabo Khilgaon Basabo Malibagh Basabo Rampura Basabo Merul Basabo Badda Basabo Natun Bazar Basabo" +
                        "Basabo Nadda Basabo Kuril Bishwa Road Basabo Khilkhet Basabo Airport Basabo House Building Basabo" +
                        "Basabo Abdullahpur Basabo Tongi Basabo Gazipur Chowrasta Basabo" +
                        "Khilgaon Malibagh Khilgaon Rampura Khilgaon Merul Khilgaon Badda Khilgaon Natun Bazar Khilgaon" +
                        "Khilgaon Nadda Khilgaon Kuril Bishwa Road Khilgaon Khilkhet Khilgaon Airport Khilgaon House Building Khilgaon" +
                        "Khilgaon Abdullahpur Khilgaon Tongi Khilgaon Gazipur Chowrasta Khilgaon" +
                        "Malibagh Rampura Malibagh Merul Malibagh Badda Malibagh Natun Bazar Malibagh" +
                        "Malibagh Nadda Malibagh Kuril Bishwa Road Malibagh Khilkhet Malibagh Airport Malibagh House Building Malibagh" +
                        "Malibagh Abdullahpur Malibagh Tongi Malibagh Gazipur Chowrasta Malibagh" +
                        "Rampura Merul Rampura Badda Rampura Natun Bazar Rampura" +
                        "Rampura Nadda Rampura Kuril Bishwa Road Rampura Khilkhet Rampura Airport Rampura House Building Rampura" +
                        "Rampura Abdullahpur Rampura Tongi Rampura Gazipur Chowrasta Rampura" +
                        "Merul Badda Merul Natun Bazar Merul" +
                        "Merul Nadda Merul Kuril Bishwa Road Merul Khilkhet Merul Airport Merul House Building Merul" +
                        "Merul Abdullahpur Merul Tongi Merul Gazipur Chowrasta Merul" +
                        "Badda Natun Bazar Badda" +
                        "Badda Nadda Badda Kuril Bishwa Road Badda Khilkhet Badda Airport Badda House Building Badda" +
                        "Badda Abdullahpur Badda Tongi Badda Gazipur Chowrasta Badda" +
                        "Natun Bazar Nadda Natun Bazar Kuril Bishwa Road Natun Bazar Khilkhet Natun Bazar Airport Badda House Building Natun Bazar" +
                        "Natun Bazar Abdullahpur Natun Bazar Tongi Natun Bazar Gazipur Chowrasta Natun Bazar" +
                        "Nadda Kuril Bishwa Road Nadda Khilkhet Nadda Airport Nadda House Building Nadda" +
                        "Nadda Abdullahpur Nadda Tongi Nadda Gazipur Chowrasta Nadda" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road Tongi Kuril Bishwa Road Gazipur Chowrasta Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet Tongi Khilkhet Gazipur Chowrasta Khilkhet" +
                        "Airport House Building Airport" +
                        "Airport Abdullahpur Airport Tongi Airport Gazipur Chowrasta Airport" +
                        "House Building Abdullahpur House Building Tongi House Building Gazipur Chowrasta House Building" +
                        "Abdullahpur Tongi Abdullahpur Gazipur Chowrasta Abdullahpur" +
                        "Tongi Gazipur Chowrasta Tongi"));


        buses.add(new Bus(R.drawable.logo,"Ashirbad Paribahan",
                "Duaripara Rupnagar Abashik Mor Duaripara Shiyal Bari Duaripara Proshika Mor Duaripara Mirpur 2 Duaripara Mirpur 1 Duaripara" +
                        "Duaripara Ansar Camp Duaripara Technical Duaripara Kallayanpur Duaripara Shyamoli Duaripara Shishu Mela Duaripara" +
                        "Duaripara College Gate Duaripara Asad Gate Duaripara Dhanmondi 27 Duaripara Dhanmondi 32 Duaripara Kalabagan Duaripara " +
                        "Duaripara City College Duaripara Science Lab Duaripara New Market Duaripara Nilkhet Duaripara" +
                        "Duaripara Azimpur Duaripara" +
                        "Rupnagar Abashik Mor Shiyal Bari Rupnagar Abashik Mor Proshika Mor Rupnagar Abashik Mor Mirpur 2 Rupnagar Abashik Mor Mirpur 1 Rupnagar Abashik Mor" +
                        "Rupnagar Abashik Mor Ansar Camp Rupnagar Abashik Mor Technical Rupnagar Abashik Mor Kallayanpur Rupnagar Abashik Mor Shyamoli Rupnagar Abashik Mor Shishu Mela Rupnagar Abashik Mor" +
                        "Rupnagar Abashik Mor College Gate Rupnagar Abashik Mor Asad Gate Rupnagar Abashik Mor Dhanmondi 27 Rupnagar Abashik Mor Dhanmondi 32 Rupnagar Abashik Mor Kalabagan Rupnagar Abashik Mor " +
                        "Rupnagar Abashik Mor City College Rupnagar Abashik Mor Science Lab Rupnagar Abashik Mor New Market Rupnagar Abashik Mor Nilkhet Rupnagar Abashik Mor " +
                        "Rupnagar Abashik Mor Azimpur Rupnagar Abashik Mor" +
                        "Shiyal Bari Proshika Mor Shiyal Bari Mirpur 2 Shiyal Bari Mirpur 1 Shiyal Bari" +
                        "Shiyal Bari Ansar Camp Shiyal Bari Technical Shiyal Bari Kallayanpur Shiyal Bari Shyamoli Shiyal Bari Shishu Mela Shiyal Bari" +
                        "Shiyal Bari College Gate Shiyal Bari Asad Gate Shiyal Bari Dhanmondi 27 Shiyal Bari Dhanmondi 32 Shiyal Bari Kalabagan Shiyal Bari " +
                        "Shiyal Bari City College Shiyal Bari Science Lab Shiyal Bari New Market Shiyal Bari Nilkhet Shiyal Bari" +
                        "Shiyal Bari Azimpur Shiyal Bari" +
                        "Proshika Mor Mirpur 2 Proshika Mor Mirpur 1 Proshika Mor" +
                        "Proshika Mor Ansar Camp Proshika Mor Technical Proshika Mor Kallayanpur Proshika Mor Shyamoli Proshika Mor Shishu Mela Proshika Mor" +
                        "Proshika Mor College Gate Proshika Mor Asad Gate Proshika Mor Dhanmondi 27 Proshika Mor Dhanmondi 32 Proshika Mor Kalabagan Proshika Mor " +
                        "Proshika Mor City College Proshika Mor Science Lab Proshika Mor New Market Proshika Mor Nilkhet Proshika Mor" +
                        "Proshika Mor Azimpur Proshika Mor" +
                        "Mirpur 2 Mirpur 1 Mirpur 2" +
                        "Mirpur 2 Ansar Camp Mirpur 2 Technical Mirpur 2 Kallayanpur Mirpur 2 Shyamoli Mirpur 2 Shishu Mela Mirpur 2" +
                        "Mirpur 2 College Gate Mirpur 2 Asad Gate Mirpur 2 Dhanmondi 27 Mirpur 2 Dhanmondi 32 Mirpur 2 Kalabagan Mirpur 2 " +
                        "Mirpur 2 City College Mirpur 2 Science Lab Mirpur 2 New Market Mirpur 2 Nilkhet Mirpur 2" +
                        "Mirpur 2 Azimpur Mirpur 2" +
                        "Mirpur 1 Ansar Camp Mirpur 1 Technical Mirpur 1 Kallayanpur Mirpur 1 Shyamoli Mirpur 1 Shishu Mela Mirpur 1" +
                        "Mirpur 1 College Gate Mirpur 1 Asad Gate Mirpur 1 Dhanmondi 27 Mirpur 1 Dhanmondi 32 Mirpur 1 Kalabagan Mirpur 1 " +
                        "Mirpur 1 City College Mirpur 1 Science Lab Mirpur 1 New Market Mirpur 1 Nilkhet Mirpur 1" +
                        "Mirpur 1 Azimpur Mirpur 1" +
                        "Ansar Camp Technical Ansar Camp Kallayanpur Ansar Camp Shyamoli Ansar Camp Shishu Mela Ansar Camp" +
                        "Ansar Camp College Gate Ansar Camp Asad Gate Ansar Camp Dhanmondi 27 Ansar Camp Dhanmondi 32 Ansar Camp Kalabagan Ansar Camp " +
                        "Ansar Camp City College Ansar Camp Science Lab Ansar Camp New Market Ansar Camp Nilkhet Ansar Camp" +
                        "Ansar Camp Azimpur Ansar Camp" +
                        "Technical Kallayanpur Technical Shyamoli Technical Shishu Mela Technical" +
                        "Technical College Gate Technical Asad Gate Technical Dhanmondi 27 Technical Dhanmondi 32 Technical Kalabagan Technical " +
                        "Technical City College Technical Science Lab Technical New Market Technical Nilkhet Technical" +
                        "Technical Azimpur Technical" +
                        "Kallayanpur Shyamoli Kallayanpur Shishu Mela Kallayanpur" +
                        "Kallayanpur College Gate Kallayanpur Asad Gate Kallayanpur Dhanmondi 27 Kallayanpur Dhanmondi 32 Kallayanpur Kalabagan Kallayanpur " +
                        "Kallayanpur City College Kallayanpur Science Lab Kallayanpur New Market Kallayanpur Nilkhet Kallayanpur" +
                        "Kallayanpur Azimpur Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli" +
                        "Shyamoli College Gate Shyamoli Asad Gate Shyamoli Dhanmondi 27 Shyamoli Dhanmondi 32 Shyamoli Kalabagan Shyamoli " +
                        "Shyamoli City College Shyamoli Science Lab Shyamoli New Market Shyamoli Nilkhet Shyamoli" +
                        "Shyamoli Azimpur Shyamoli" +
                        "Shishu Mela College Gate Shishu Mela Asad Gate Shishu Mela Dhanmondi 27 Shishu Mela Dhanmondi 32 Shishu Mela Kalabagan Shishu Mela " +
                        "Shishu Mela City College Shishu Mela Science Lab Shishu Mela New Market Shishu Mela Nilkhet Shishu Mela" +
                        "Shishu Mela Azimpur Shishu Mela" +
                        "College Gate Asad Gate College Gate Dhanmondi 27 College Gate Dhanmondi 32 College Gate Kalabagan College Gate " +
                        "College Gate City College College Gate Science Lab College Gate New Market College Gate Nilkhet College Gate" +
                        "College Gate Azimpur College Gate" +
                        "Asad Gate Dhanmondi 27 Asad Gate Dhanmondi 32 Asad Gate Kalabagan Asad Gate " +
                        "Asad Gate City College Asad Gate Science Lab Asad Gate New Market Asad Gate Nilkhet Asad Gate" +
                        "Asad Gate Azimpur Asad Gate" +
                        "Dhanmondi 27 Dhanmondi 32 Dhanmondi 27 Kalabagan Dhanmondi 27 " +
                        "Dhanmondi 27 City College Dhanmondi 27 Science Lab Dhanmondi 27 New Market Dhanmondi 27 Nilkhet Dhanmondi 27" +
                        "Dhanmondi 27 Azimpur Dhanmondi 27" +
                        "Dhanmondi 32 Kalabagan Dhanmondi 32 " +
                        "Dhanmondi 32 City College Dhanmondi 32 Science Lab Dhanmondi 32 New Market Dhanmondi 32 Nilkhet Dhanmondi 32" +
                        "Dhanmondi 32 Azimpur Dhanmondi 32" +
                        "Kalabagan City College Kalabagan Science Lab Kalabagan New Market Kalabagan Nilkhet Kalabagan" +
                        "Kalabagan Azimpur Kalabagan" +
                        "City College Science Lab City College New Market City College Nilkhet City College" +
                        "City College Azimpur City College" +
                        "Science Lab New Market Science Lab Nilkhet Science Lab" +
                        "Science Lab Azimpur Science Lab" +
                        "New Market Nilkhet New Market" +
                        "Nilkhet Azimpur Nilkhet" +
                        "Nilkhet Azimpur Nilkhet"));


        buses.add(new Bus(R.drawable.logo,"Ashulia Classic",
                "Nobinagar Baipayl Nobinagar Jamgora Nobinagar Fantasy Kingdom Nobinagar Zirabo Nobinagar Ashulia Bazar Nobinagar Kamarpara Nobinagar" +
                        "Nobinagar Abdullahpur Nobinagar House Building Nobinagar Airport Nobinagar Kuril Bishwa Road Nobinagar Shewra Nobinagar MES Nobinagar" +
                        "Nobinagar Kakoli Nobinagar Banani Nobinagar Chairman Bari Nobinagar " +
                        "Nobinagar Mohakhali Nobinagar" +
                        "Baipayl Jamgora Baipayl Fantasy Kingdom Baipayl Zirabo Baipayl Ashulia Bazar Baipayl Kamarpara Baipayl" +
                        "Baipayl Abdullahpur Baipayl House Building Baipayl Airport Baipayl Kuril Bishwa Road Baipayl Shewra Baipayl MES Baipayl" +
                        "Baipayl Kakoli Baipayl Banani Baipayl Chairman Bari Baipayl " +
                        "Baipayl Mohakhali Baipayl" +
                        "Jamgora Fantasy Kingdom Jamgora Zirabo Jamgora Ashulia Bazar Jamgora Kamarpara Jamgora" +
                        "Jamgora Abdullahpur Jamgora House Building Jamgora Airport Jamgora Kuril Bishwa Road Jamgora Shewra Jamgora MES Jamgora" +
                        "Jamgora Kakoli Jamgora Banani Jamgora Chairman Bari Jamgora " +
                        "Jamgora Mohakhali Jamgora" +
                        "Fantasy Kingdom Zirabo Fantasy Kingdom Ashulia Bazar Fantasy Kingdom Kamarpara Fantasy Kingdom" +
                        "Fantasy Kingdom Abdullahpur Fantasy Kingdom House Building Fantasy Kingdom Airport Fantasy Kingdom Kuril Bishwa Road Fantasy Kingdom Shewra Fantasy Kingdom MES Fantasy Kingdom" +
                        "Fantasy Kingdom Kakoli Fantasy Kingdom Banani Fantasy Kingdom Chairman Bari Fantasy Kingdom " +
                        "Fantasy Kingdom Mohakhali Fantasy Kingdom" +
                        "Zirabo Ashulia Bazar Zirabo Kamarpara Zirabo" +
                        "Zirabo Abdullahpur Zirabo House Building Zirabo Airport Zirabo Kuril Bishwa Road Zirabo Shewra Zirabo MES Zirabo" +
                        "Zirabo Kakoli Zirabo Banani Zirabo Chairman Bari Zirabo " +
                        "Zirabo Mohakhali Zirabo" +
                        "Ashulia Bazar Kamarpara Ashulia Bazar" +
                        "Ashulia Bazar Abdullahpur Ashulia Bazar House Building Ashulia Bazar Airport Ashulia Bazar Kuril Bishwa Road Ashulia Bazar Shewra Ashulia Bazar MES Ashulia Bazar" +
                        "Ashulia Bazar Kakoli Ashulia Bazar Banani Ashulia Bazar Chairman Bari Ashulia Bazar " +
                        "Ashulia Bazar Mohakhali Ashulia Bazar" +
                        "Kamarpara Abdullahpur Kamarpara House Building Kamarpara Airport Kamarpara Kuril Bishwa Road Kamarpara Shewra Kamarpara MES Kamarpara" +
                        "Kamarpara Kakoli Kamarpara Banani Kamarpara Chairman Bari Kamarpara " +
                        "Kamarpara Mohakhali Kamarpara" +
                        "Abdullahpur House Building Abdullahpur Airport Abdullahpur Kuril Bishwa Road Abdullahpur Shewra Abdullahpur MES Abdullahpur" +
                        "Abdullahpur Kakoli Abdullahpur Banani Abdullahpur Chairman Bari Abdullahpur " +
                        "Abdullahpur Mohakhali Abdullahpur" +
                        "Kakoli Banani Kakoli Chairman Bari Kakoli " +
                        "Kakoli Mohakhali Kakoli" +
                        "Banani Chairman Bari Banani " +
                        "Banani Mohakhali Banani" +
                        "Chairman Bari Mohakhali Chairman Bari"));


        buses.add(new Bus(R.drawable.logo,"Asmani Paribahan",
                "Dhour Abdullahpur Dhour House Building Dhour Azampur Dhour Rajlakshmi Dhour Jasimuddin Dhour Airport Dhour Khilkhet Dhour Kuril Bishwa Road Dhour" +
                        "Dhour Jamuna Future Park Dhour Nadda Dhour Natun Bazar Dhour Shahjadpur Dhour Uttar Badda Bazar Dhour Badda Dhour Madhya Badda Dhour Merul Dhour" +
                        "Dhour Rampura Dhour Banasree Dhour Demra Staff Quarter Dhour Tarabo Dhour " +
                        "Dhour Madanpur Dhour" +
                        "Abdullahpur House Building Abdullahpur Azampur Abdullahpur Rajlakshmi Abdullahpur Jasimuddin Abdullahpur Airport Abdullahpur Khilkhet Abdullahpur Kuril Bishwa Road Abdullahpur" +
                        "Abdullahpur Jamuna Future Park Abdullahpur Nadda Abdullahpur Natun Bazar Abdullahpur Shahjadpur Abdullahpur Uttar Badda Bazar Abdullahpur Badda Abdullahpur Madhya Badda Abdullahpur Merul Abdullahpur" +
                        "Abdullahpur Rampura Abdullahpur Banasree Abdullahpur Demra Staff Quarter Abdullahpur Tarabo Abdullahpur " +
                        "Abdullahpur Madanpur Abdullahpur" +
                        "House Building Azampur House Building Rajlakshmi House Building Jasimuddin House Building Airport House Building Khilkhet House Building Kuril Bishwa Road House Building" +
                        "House Building Jamuna Future Park House Building Nadda House Building Natun Bazar House Building Shahjadpur House Building Uttar Badda Bazar House Building Badda House Building Madhya Badda House Building Merul House Building" +
                        "House Building Rampura House Building Banasree House Building Demra Staff Quarter House Building Tarabo House Building " +
                        "House Building Madanpur House Building" +
                        "Azampur Rajlakshmi Azampur Jasimuddin Azampur Airport Azampur Khilkhet Azampur Kuril Bishwa Road Azampur" +
                        "Azampur Jamuna Future Park Azampur Nadda Azampur Natun Bazar Azampur Shahjadpur Azampur Uttar Badda Bazar Azampur Badda Azampur Madhya Badda Azampur Merul Azampur" +
                        "Azampur Rampura Azampur Banasree Azampur Demra Staff Quarter Azampur Tarabo Azampur " +
                        "Azampur Madanpur Azampur" +
                        "Rajlakshmi Jasimuddin Rajlakshmi Airport Rajlakshmi Khilkhet Rajlakshmi Kuril Bishwa Road Rajlakshmi" +
                        "Rajlakshmi Jamuna Future Park Rajlakshmi Nadda Rajlakshmi Natun Bazar Rajlakshmi Shahjadpur Rajlakshmi Uttar Badda Bazar Rajlakshmi Badda Rajlakshmi Madhya Badda Rajlakshmi Merul Rajlakshmi" +
                        "Rajlakshmi Rampura Rajlakshmi Banasree Rajlakshmi Demra Staff Quarter Rajlakshmi Tarabo Rajlakshmi " +
                        "Rajlakshmi Madanpur Rajlakshmi" +
                        "Jasimuddin Airport Jasimuddin Khilkhet Jasimuddin Kuril Bishwa Road Jasimuddin" +
                        "Jasimuddin Jamuna Future Park Jasimuddin Nadda Jasimuddin Natun Bazar Jasimuddin Shahjadpur Jasimuddin Uttar Badda Bazar Jasimuddin Badda Jasimuddin Madhya Badda Jasimuddin Merul Jasimuddin" +
                        "Jasimuddin Rampura Jasimuddin Banasree Jasimuddin Demra Staff Quarter Jasimuddin Tarabo Jasimuddin " +
                        "Jasimuddin Madanpur Jasimuddin" +
                        "Airport Khilkhet Airport Kuril Bishwa Road Airport" +
                        "Airport Jamuna Future Park Airport Nadda Airport Natun Bazar Airport Shahjadpur Airport Uttar Badda Bazar Airport Badda Airport Madhya Badda Airport Merul Airport" +
                        "Airport Rampura Airport Banasree Airport Demra Staff Quarter Airport Tarabo Airport " +
                        "Airport Madanpur Airport" +
                        "Khilkhet Kuril Bishwa Road Khilkhet" +
                        "Khilkhet Jamuna Future Park Khilkhet Nadda Khilkhet Natun Bazar Khilkhet Shahjadpur Khilkhet Uttar Badda Bazar Khilkhet Badda Khilkhet Madhya Badda Khilkhet Merul Khilkhet" +
                        "Khilkhet Rampura Khilkhet Banasree Khilkhet Demra Staff Quarter Khilkhet Tarabo Khilkhet " +
                        "Khilkhet Madanpur Khilkhet" +
                        "Kuril Bishwa Road Jamuna Future Park Kuril Bishwa Road Nadda Kuril Bishwa Road Natun Bazar Kuril Bishwa Road Shahjadpur Kuril Bishwa Road Uttar Badda Bazar Kuril Bishwa Road Badda Kuril Bishwa Road Madhya Badda Kuril Bishwa Road Merul Kuril Bishwa Road" +
                        "Kuril Bishwa Road Rampura Kuril Bishwa Road Banasree Kuril Bishwa Road Demra Staff Quarter Kuril Bishwa Road Tarabo Kuril Bishwa Road " +
                        "Kuril Bishwa Road Madanpur Kuril Bishwa Road" +
                        "Jamuna Future Park Nadda Jamuna Future Park Natun Bazar Jamuna Future Park Shahjadpur Jamuna Future Park Uttar Badda Bazar Jamuna Future Park Badda Jamuna Future Park Madhya Badda Jamuna Future Park Merul Jamuna Future Park" +
                        "Jamuna Future Park Rampura Jamuna Future Park Banasree Jamuna Future Park Demra Staff Quarter Jamuna Future Park Tarabo Jamuna Future Park " +
                        "Jamuna Future Park Madanpur Jamuna Future Park" +
                        "Nadda Natun Bazar Nadda Shahjadpur Nadda Uttar Badda Bazar Nadda Badda Nadda Madhya Badda Nadda Merul Nadda" +
                        "Nadda Rampura Nadda Banasree Nadda Demra Staff Quarter Nadda Tarabo Nadda " +
                        "Nadda Madanpur Nadda" +
                        "Natun Bazar Shahjadpur Natun Bazar Uttar Badda Bazar Natun Bazar Badda Natun Bazar Madhya Badda Natun Bazar Merul Natun Bazar" +
                        "Natun Bazar Rampura Natun Bazar Banasree Natun Bazar Demra Staff Quarter Natun Bazar Tarabo Natun Bazar " +
                        "Natun Bazar Madanpur Natun Bazar" +
                        "Shahjadpur Uttar Badda Bazar Shahjadpur Badda Shahjadpur Madhya Badda Shahjadpur Merul Shahjadpur" +
                        "Shahjadpur Rampura Shahjadpur Banasree Shahjadpur Demra Staff Quarter Shahjadpur Tarabo Shahjadpur " +
                        "Shahjadpur Madanpur Shahjadpur" +
                        "Uttar Badda Bazar Badda Uttar Badda Bazar Madhya Uttar Badda Bazar Merul Uttar Badda Bazar" +
                        "Uttar Badda Bazar Rampura Uttar Badda Bazar Banasree Uttar Badda Bazar Demra Staff Quarter Uttar Badda Bazar Tarabo Uttar Badda Bazar " +
                        "Uttar Badda Bazar Madanpur Uttar Badda Bazar" +
                        "Badda Madhya Badda Badda Merul Badda" +
                        "Badda Rampura Badda Banasree Badda Demra Staff Quarter Badda Tarabo Badda " +
                        "Badda Madanpur Badda" +
                        "Madhya Badda Merul Madhya Badda" +
                        "Madhya Badda Rampura Madhya Badda Banasree Madhya Badda Demra Staff Quarter Madhya Badda Tarabo Madhya Badda " +
                        "Madhya Badda Madanpur Madhya Badda" +
                        "Merul Rampura Merul Banasree Merul Demra Staff Quarter Merul Tarabo Merul " +
                        "Merul Madanpur Merul" +
                        "Rampura Banasree Rampura Demra Staff Quarter Rampura Tarabo Rampura " +
                        "Rampura Madanpur Rampura" +
                        "Banasree Demra Staff Quarter Banasree Tarabo Banasree " +
                        "Banasree Madanpur Banasree" +
                        "Demra Staff Quarter Tarabo Demra Staff Quarter " +
                        "Demra Staff Quarter Madanpur Demra Staff Quarter" +
                        "Tarabo Madanpur Tarabo"));


        buses.add(new Bus(R.drawable.logo,"Ayat",
                "Chiriakhana Sony Hall Chiriakhana Mirpur 2 Chiriakhana Mirpur 10 Chiriakhana Kazipara Chiriakhana Shewrapara Chiriakhana Taltola Chiriakhana" +
                        "Chiriakhana Agargaon Chiriakhana Khamarbari Chiriakhana Farmgate Chiriakhana Kawran Bazar Chiriakhana Bangla Motor Chiriakhana" +
                        "Chiriakhana Moghbazar Chiriakhana Mouchak Chiriakhana Malibagh Chiriakhana Rajarbagh Chiriakhana" +
                        "Chiriakhana Kamalapur Chiriakhana" +
                        "Sony Hall Mirpur 2 Sony Hall Mirpur 10 Sony Hall Kazipara Sony Hall Shewrapara Sony Hall Taltola Sony Hall" +
                        "Sony Hall Agargaon Sony Hall Khamarbari Sony Hall Farmgate Sony Hall Kawran Bazar Sony Hall Bangla Motor Sony Hall" +
                        "Sony Hall Moghbazar Sony Hall Mouchak Sony Hall Malibagh Sony Hall Rajarbagh Sony Hall" +
                        "Sony Hall Kamalapur Sony Hall" +
                        "Mirpur 2 Mirpur 10 Mirpur 2 Kazipara Mirpur 2 Shewrapara Mirpur 2 Taltola Mirpur 2" +
                        "Mirpur 2 Agargaon Mirpur 2 Khamarbari Mirpur 2 Farmgate Mirpur 2 Kawran Bazar Mirpur 2 Bangla Motor Mirpur 2" +
                        "Mirpur 2 Moghbazar Mirpur 2 Mouchak Mirpur 2 Malibagh Mirpur 2 Rajarbagh Mirpur 2" +
                        "Mirpur 2 Kamalapur Mirpur 2" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10 Taltola Mirpur 10" +
                        "Mirpur 10 Agargaon Mirpur 10 Khamarbari Mirpur 10 Farmgate Mirpur 10 Kawran Bazar Mirpur 10 Bangla Motor Mirpur 10" +
                        "Mirpur 10 Moghbazar Mirpur 10 Mouchak Mirpur 10 Malibagh Mirpur 10 Rajarbagh Mirpur 10" +
                        "Mirpur 10 Kamalapur Mirpur 10" +
                        "Kazipara Shewrapara Kazipara Taltola Kazipara" +
                        "Kazipara Agargaon Kazipara Khamarbari Kazipara Farmgate Kazipara Kawran Bazar Kazipara Bangla Motor Kazipara" +
                        "Kazipara Moghbazar Kazipara Mouchak Kazipara Malibagh Kazipara Rajarbagh Kazipara" +
                        "Kazipara Kamalapur Kazipara" +
                        "Shewrapara Taltola Shewrapara" +
                        "Shewrapara Agargaon Shewrapara Khamarbari Shewrapara Farmgate Shewrapara Kawran Bazar Shewrapara Bangla Motor Shewrapara" +
                        "Shewrapara Moghbazar Shewrapara Mouchak Shewrapara Malibagh Shewrapara Rajarbagh Shewrapara" +
                        "Shewrapara Kamalapur Shewrapara" +
                        "Taltola Agargaon Taltola Khamarbari Taltola Farmgate Taltola Kawran Bazar Taltola Bangla Motor Taltola" +
                        "Taltola Moghbazar Taltola Mouchak Taltola Malibagh Taltola Rajarbagh Taltola" +
                        "Taltola Kamalapur Taltola" +
                        "Agargaon Khamarbari Agargaon Farmgate Agargaon Kawran Bazar Agargaon Bangla Motor Agargaon" +
                        "Agargaon Moghbazar Agargaon Mouchak Agargaon Malibagh Agargaon Rajarbagh Agargaon" +
                        "Agargaon Kamalapur Agargaon" +
                        "Khamarbari Farmgate Khamarbari Kawran Bazar Khamarbari Bangla Motor Khamarbari" +
                        "Khamarbari Moghbazar Khamarbari Mouchak Khamarbari Malibagh Khamarbari Rajarbagh Khamarbari" +
                        "Khamarbari Kamalapur Khamarbari" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate" +
                        "Farmgate Moghbazar Farmgate Mouchak Farmgate Malibagh Farmgate Rajarbagh Farmgate" +
                        "Farmgate Kamalapur Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar" +
                        "Kawran Bazar Moghbazar Kawran Bazar Mouchak Kawran Bazar Malibagh Kawran Bazar Rajarbagh Kawran Bazar" +
                        "Kawran Bazar Kamalapur Kawran Bazar" +
                        "Bangla Motor Moghbazar Bangla Motor Mouchak Bangla Motor Malibagh Bangla Motor Rajarbagh Bangla Motor" +
                        "Bangla Motor Kamalapur Bangla Motor" +
                        "Moghbazar Mouchak Moghbazar Malibagh Moghbazar Rajarbagh Moghbazar" +
                        "Moghbazar Kamalapur Moghbazar" +
                        "Mouchak Malibagh Mouchak Rajarbagh Mouchak" +
                        "Mouchak Kamalapur Mouchak" +
                        "Malibagh Rajarbagh Malibagh" +
                        "Malibagh Kamalapur Malibagh" +
                        "Rajarbagh Kamalapur Rajarbagh"));


        buses.add(new Bus(R.drawable.logo,"Azmery Glory",
                "Sadarghat Ray Shaheb Bazar Sadarghat Naya Bazar Sadarghat Golap Shah Mazar Sadarghat GPO Sadarghat Paltan Sadarghat" +
                        "Sadarghat Kakrail Sadarghat Shantinagar Sadarghat Malibagh Sadarghat Mouchak Sadarghat Moghbazar Sadarghat Nabisco Sadarghat" +
                        "Sadarghat Mohakhali Sadarghat Chairman Bari Sadarghat Shainik Club Sadarghat Banani Sadarghat Kakoli Sadarghat Staff Road Sadarghat" +
                        "Sadarghat MES Sadarghat Shewra Sadarghat Kuril Bishwa Road Sadarghat Khilkhet Sadarghat Airport Sadarghat Jasimuddin Sadarghat" +
                        "Sadarghat Rajlakshmi Sadarghat Azampur Sadarghat House Building Sadarghat Abdullahpur Sadarghat Tongi Sadarghat Station Road Sadarghat" +
                        "Sadarghat Mill Gate Sadarghat Board Bazar Sadarghat Gazipur Sadarghat Konabari Sadarghat" +
                        "Sadarghat Chandra Sadarghat" +
                        "Ray Shaheb Bazar Naya Bazar Ray Shaheb Bazar Golap Shah Mazar Ray Shaheb Bazar GPO Ray Shaheb Bazar Paltan Ray Shaheb Bazar" +
                        "Ray Shaheb Bazar Kakrail Ray Shaheb Bazar Shantinagar Ray Shaheb Bazar Malibagh Ray Shaheb Bazar Mouchak Ray Shaheb Bazar Moghbazar Ray Shaheb Bazar Nabisco Ray Shaheb Bazar" +
                        "Ray Shaheb Bazar Mohakhali Ray Shaheb Bazar Chairman Bari Ray Shaheb Bazar Shainik Club Ray Shaheb Bazar Banani Ray Shaheb Bazar Kakoli Ray Shaheb Bazar Staff Road Ray Shaheb Bazar" +
                        "Ray Shaheb Bazar MES Ray Shaheb Bazar Shewra Ray Shaheb Bazar Kuril Bishwa Road Ray Shaheb Bazar Khilkhet Ray Shaheb Bazar Airport Ray Shaheb Bazar Jasimuddin Ray Shaheb Bazar" +
                        "Ray Shaheb Bazar Rajlakshmi Ray Shaheb Bazar Azampur Ray Shaheb Bazar House Building Ray Shaheb Bazar Abdullahpur Ray Shaheb Bazar Tongi Ray Shaheb Bazar Station Road Ray Shaheb Bazar" +
                        "Ray Shaheb Bazar Mill Gate Ray Shaheb Bazar Board Bazar Ray Shaheb Bazar Gazipur Ray Shaheb Bazar Konabari Ray Shaheb Bazar" +
                        "Ray Shaheb Bazar Chandra Ray Shaheb Bazar" +
                        "Naya Bazar Golap Shah Mazar Naya Bazar GPO Naya Bazar Paltan Naya Bazar" +
                        "Naya Bazar Kakrail Naya Bazar Shantinagar Naya Bazar Malibagh Naya Bazar Mouchak Naya Bazar Moghbazar Naya Bazar Nabisco Naya Bazar" +
                        "Naya Bazar Mohakhali Naya Bazar Chairman Bari Naya Bazar Shainik Club Naya Bazar Banani Naya Bazar Kakoli Naya Bazar Staff Road Naya Bazar" +
                        "Naya Bazar MES Naya Bazar Shewra Naya Bazar Kuril Bishwa Road Naya Bazar Khilkhet Naya Bazar Airport Naya Bazar Jasimuddin Naya Bazar" +
                        "Naya Bazar Rajlakshmi Naya Bazar Azampur Naya Bazar House Building Naya Bazar Abdullahpur Naya Bazar Tongi Naya Bazar Station Road Naya Bazar" +
                        "Naya Bazar Mill Gate Naya Bazar Board Bazar Naya Bazar Gazipur Naya Bazar Konabari Naya Bazar" +
                        "Naya Bazar Chandra Naya Bazar" +
                        "Golap Shah Mazar GPO Golap Shah Mazar Paltan Golap Shah Mazar" +
                        "Golap Shah Mazar Kakrail Golap Shah Mazar Shantinagar Golap Shah Mazar Malibagh Golap Shah Mazar Mouchak Golap Shah Mazar Moghbazar Golap Shah Mazar Nabisco Golap Shah Mazar" +
                        "Golap Shah Mazar Mohakhali Golap Shah Mazar Chairman Bari Golap Shah Mazar Shainik Club Golap Shah Mazar Banani Golap Shah Mazar Kakoli Golap Shah Mazar Staff Road Golap Shah Mazar" +
                        "Golap Shah Mazar MES Golap Shah Mazar Shewra Golap Shah Mazar Kuril Bishwa Road Golap Shah Mazar Khilkhet Golap Shah Mazar Airport Golap Shah Mazar Jasimuddin Golap Shah Mazar" +
                        "Golap Shah Mazar Rajlakshmi Golap Shah Mazar Azampur Golap Shah Mazar House Building Golap Shah Mazar Abdullahpur Golap Shah Mazar Tongi Golap Shah Mazar Station Road Golap Shah Mazar" +
                        "Golap Shah Mazar Mill Gate Golap Shah Mazar Board Bazar Golap Shah Mazar Gazipur Golap Shah Mazar Konabari Golap Shah Mazar" +
                        "Golap Shah Mazar Chandra Golap Shah Mazar" +
                        "GPO Paltan GPO" +
                        "GPO Kakrail GPO Shantinagar GPO Malibagh GPO Mouchak GPO Moghbazar GPO Nabisco GPO" +
                        "GPO Mohakhali GPO Chairman Bari GPO Shainik Club GPO Banani GPO Kakoli GPO Staff Road GPO" +
                        "GPO MES GPO Shewra GPO Kuril Bishwa Road GPO Khilkhet GPO Airport GPO Jasimuddin GPO" +
                        "GPO Rajlakshmi GPO Azampur GPO House Building GPO Abdullahpur GPO Tongi GPO Station Road GPO" +
                        "GPO Mill Gate GPO Board Bazar GPO Gazipur GPO Konabari GPO" +
                        "GPO Chandra GPO" +
                        "Paltan Kakrail Paltan Shantinagar Paltan Malibagh Paltan Mouchak Paltan Moghbazar Paltan Nabisco Paltan" +
                        "Paltan Mohakhali Paltan Chairman Bari Paltan Shainik Club Paltan Banani Paltan Kakoli Paltan Staff Road Paltan" +
                        "Paltan MES Paltan Shewra Paltan Kuril Bishwa Road Paltan Khilkhet Paltan Airport Paltan Jasimuddin Paltan" +
                        "Paltan Rajlakshmi Paltan Azampur Paltan House Building Paltan Abdullahpur Paltan Tongi Paltan Station Road Paltan" +
                        "Paltan Mill Gate Paltan Board Bazar Paltan Gazipur Paltan Konabari Paltan" +
                        "Paltan Chandra Paltan" +
                        "Kakrail Shantinagar Kakrail Malibagh Kakrail Mouchak Kakrail Moghbazar Kakrail Nabisco Kakrail" +
                        "Kakrail Mohakhali Kakrail Chairman Bari Kakrail Shainik Club Kakrail Banani Kakrail Kakoli Kakrail Staff Road Kakrail" +
                        "Kakrail MES Kakrail Shewra Kakrail Kuril Bishwa Road Kakrail Khilkhet Kakrail Airport Kakrail Jasimuddin Kakrail" +
                        "Kakrail Rajlakshmi Kakrail Azampur Kakrail House Building Kakrail Abdullahpur Kakrail Tongi Kakrail Station Road Kakrail" +
                        "Kakrail Mill Gate Kakrail Board Bazar Kakrail Gazipur Kakrail Konabari Kakrail" +
                        "Kakrail Chandra Kakrail" +
                        "Shantinagar Malibagh Shantinagar Mouchak Shantinagar Moghbazar Shantinagar Nabisco Shantinagar" +
                        "Shantinagar Mohakhali Shantinagar Chairman Bari Shantinagar Shainik Club Shantinagar Banani Shantinagar Kakoli Shantinagar Staff Road Shantinagar" +
                        "Shantinagar MES Shantinagar Shewra Shantinagar Kuril Bishwa Road Shantinagar Khilkhet Shantinagar Airport Shantinagar Jasimuddin Shantinagar" +
                        "Shantinagar Rajlakshmi Shantinagar Azampur Shantinagar House Building Shantinagar Abdullahpur Shantinagar Tongi Shantinagar Station Road Shantinagar" +
                        "Shantinagar Mill Gate Shantinagar Board Bazar Shantinagar Gazipur Shantinagar Konabari Shantinagar" +
                        "Shantinagar Chandra Shantinagar" +
                        "Malibagh Mouchak Malibagh Moghbazar Malibagh Nabisco Malibagh" +
                        "Malibagh Mohakhali Malibagh Chairman Bari Malibagh Shainik Club Malibagh Banani Malibagh Kakoli Malibagh Staff Road Malibagh" +
                        "Malibagh MES Malibagh Shewra Malibagh Kuril Bishwa Road Malibagh Khilkhet Malibagh Airport Malibagh Jasimuddin Malibagh" +
                        "Malibagh Rajlakshmi Malibagh Azampur Malibagh House Building Malibagh Abdullahpur Malibagh Tongi Malibagh Station Road Malibagh" +
                        "Malibagh Mill Gate Malibagh Board Bazar Malibagh Gazipur Malibagh Konabari Malibagh" +
                        "Malibagh Chandra Malibagh" +
                        "Mouchak Moghbazar Mouchak Nabisco Mouchak" +
                        "Mouchak Mohakhali Mouchak Chairman Bari Mouchak Shainik Club Mouchak Banani Mouchak Kakoli Mouchak Staff Road Mouchak" +
                        "Mouchak MES Mouchak Shewra Mouchak Kuril Bishwa Road Mouchak Khilkhet Mouchak Airport Mouchak Jasimuddin Mouchak" +
                        "Mouchak Rajlakshmi Mouchak Azampur Mouchak House Building Mouchak Abdullahpur Mouchak Tongi Mouchak Station Road Mouchak" +
                        "Mouchak Mill Gate Mouchak Board Bazar Mouchak Gazipur Mouchak Konabari Mouchak" +
                        "Mouchak Chandra Mouchak" +
                        "Moghbazar Nabisco Moghbazar" +
                        "Moghbazar Mohakhali Moghbazar Chairman Bari Moghbazar Shainik Club Moghbazar Banani Moghbazar Kakoli Moghbazar Staff Road Moghbazar" +
                        "Moghbazar MES Moghbazar Shewra Moghbazar Kuril Bishwa Road Moghbazar Khilkhet Moghbazar Airport Moghbazar Jasimuddin Moghbazar" +
                        "Moghbazar Rajlakshmi Moghbazar Azampur Moghbazar House Building Moghbazar Abdullahpur Moghbazar Tongi Moghbazar Station Road Moghbazar" +
                        "Moghbazar Mill Gate Moghbazar Board Bazar Moghbazar Gazipur Moghbazar Konabari Moghbazar" +
                        "Moghbazar Chandra Moghbazar" +
                        "Nabisco Mohakhali Nabisco Chairman Bari Nabisco Shainik Club Nabisco Banani Nabisco Kakoli Nabisco Staff Road Nabisco" +
                        "Nabisco MES Nabisco Shewra Nabisco Kuril Bishwa Road Nabisco Khilkhet Nabisco Airport Nabisco Jasimuddin Nabisco" +
                        "Nabisco Rajlakshmi Nabisco Azampur Nabisco House Building Nabisco Abdullahpur Nabisco Tongi Nabisco Station Road Nabisco" +
                        "Nabisco Mill Gate Nabisco Board Bazar Nabisco Gazipur Nabisco Konabari Nabisco" +
                        "Nabisco Chandra Nabisco" +
                        "Mohakhali Chairman Bari Mohakhali Shainik Club Mohakhali Banani Mohakhali Kakoli Mohakhali Staff Road Mohakhali" +
                        "Mohakhali MES Mohakhali Shewra Mohakhali Kuril Bishwa Road Mohakhali Khilkhet Mohakhali Airport Mohakhali Jasimuddin Mohakhali" +
                        "Mohakhali Rajlakshmi Mohakhali Azampur Mohakhali House Building Mohakhali Abdullahpur Mohakhali Tongi Mohakhali Station Road Mohakhali" +
                        "Mohakhali Mill Gate Mohakhali Board Bazar Mohakhali Gazipur Mohakhali Konabari Mohakhali" +
                        "Mohakhali Chandra Mohakhali" +
                        "Chairman Bari Shainik Club Chairman Bari Banani Chairman Bari Kakoli Chairman Bari Staff Road Chairman Bari" +
                        "Chairman Bari MES Chairman Bari Shewra Chairman Bari Kuril Bishwa Road Chairman Bari Khilkhet Chairman Bari Airport Chairman Bari Jasimuddin Chairman Bari" +
                        "Chairman Bari Rajlakshmi Chairman Bari Azampur Chairman Bari House Building Chairman Bari Abdullahpur Chairman Bari Tongi Chairman Bari Station Road Chairman Bari" +
                        "Chairman Bari Mill Gate Chairman Bari Board Bazar Chairman Bari Gazipur Chairman Bari Konabari Chairman Bari" +
                        "Chairman Bari Chandra Chairman Bari" +
                        "Shainik Club Banani Shainik Club Kakoli Shainik Club Staff Road Shainik Club" +
                        "Shainik Club MES Shainik Club Shewra Shainik Club Kuril Bishwa Road Shainik Club Khilkhet Shainik Club Airport Shainik Club Jasimuddin Shainik Club" +
                        "Shainik Club Rajlakshmi Shainik Club Azampur Shainik Club House Building Shainik Club Abdullahpur Shainik Club Tongi Shainik Club Station Road Shainik Club" +
                        "Shainik Club Mill Gate Shainik Club Board Bazar Shainik Club Gazipur Shainik Club Konabari Shainik Club" +
                        "Shainik Club Chandra Shainik Club" +
                        "Banani Kakoli Banani Staff Road Banani" +
                        "Banani MES Banani Shewra Banani Kuril Bishwa Road Banani Khilkhet Banani Airport Banani Jasimuddin Banani" +
                        "Banani Rajlakshmi Banani Azampur Banani House Building Banani Abdullahpur Banani Tongi Banani Station Road Banani" +
                        "Banani Mill Gate Banani Board Bazar Banani Gazipur Banani Konabari Banani" +
                        "Banani Chandra Banani" +
                        "Kakoli Staff Road Kakoli" +
                        "Kakoli MES Kakoli Shewra Kakoli Kuril Bishwa Road Kakoli Khilkhet Kakoli Airport Kakoli Jasimuddin Kakoli" +
                        "Kakoli Rajlakshmi Kakoli Azampur Kakoli House Building Kakoli Abdullahpur Kakoli Tongi Kakoli Station Road Kakoli" +
                        "Kakoli Mill Gate Kakoli Board Bazar Kakoli Gazipur Kakoli Konabari Kakoli" +
                        "Kakoli Chandra Kakoli" +
                        "Staff Road MES Staff Road Shewra Staff Road Kuril Bishwa Road Staff Road Khilkhet Staff Road Airport Staff Road Jasimuddin Staff Road" +
                        "Staff Road Rajlakshmi Staff Road Azampur Staff Road House Building Staff Road Abdullahpur Staff Road Tongi Staff Road Station Road Staff Road" +
                        "Staff Road Mill Gate Staff Road Board Bazar Staff Road Gazipur Staff Road Konabari Staff Road" +
                        "Staff Road Chandra Staff Road" +
                        "MES Shewra MES Kuril Bishwa Road MES Khilkhet MES Airport MES Jasimuddin MES" +
                        "MES Rajlakshmi MES Azampur MES House Building MES Abdullahpur MES Tongi MES Station Road MES" +
                        "MES Mill Gate MES Board Bazar MES Gazipur MES Konabari MES" +
                        "MES Chandra MES" +
                        "Shewra Kuril Bishwa Road Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra" +
                        "Shewra Rajlakshmi Shewra Azampur Shewra House Building Shewra Abdullahpur Shewra Tongi Shewra Station Road Shewra" +
                        "Shewra Mill Gate Shewra Board Bazar Shewra Gazipur Shewra Konabari Shewra" +
                        "Shewra Chandra Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road" +
                        "Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road Abdullahpur Kuril Bishwa Road Tongi Kuril Bishwa Road Station Road Kuril Bishwa Road" +
                        "Kuril Bishwa Road Mill Gate Kuril Bishwa Road Board Bazar Kuril Bishwa Road Gazipur Kuril Bishwa Road Konabari Kuril Bishwa Road" +
                        "Kuril Bishwa Road Chandra Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet" +
                        "Khilkhet Rajlakshmi Khilkhet Azampur Khilkhet House Building Khilkhet Abdullahpur Khilkhet Tongi Khilkhet Station Road Khilkhet" +
                        "Khilkhet Mill Gate Khilkhet Board Bazar Khilkhet Gazipur Khilkhet Konabari Khilkhet" +
                        "Khilkhet Chandra Khilkhet" +
                        "Airport Jasimuddin Airport" +
                        "Airport Rajlakshmi Airport Azampur Airport House Building Airport Abdullahpur Airport Tongi Airport Station Road Airport" +
                        "Airport Mill Gate Airport Board Bazar Airport Gazipur Airport Konabari Airport" +
                        "Airport Chandra Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin Azampur Jasimuddin House Building Jasimuddin Abdullahpur Jasimuddin Tongi Jasimuddin Station Road Jasimuddin" +
                        "Jasimuddin Mill Gate Jasimuddin Board Bazar Jasimuddin Gazipur Jasimuddin Konabari Jasimuddin" +
                        "Jasimuddin Chandra Jasimuddin" +
                        "Rajlakshmi Azampur Rajlakshmi House Building Rajlakshmi Abdullahpur Rajlakshmi Tongi Rajlakshmi Station Road Rajlakshmi" +
                        "Rajlakshmi Mill Gate Rajlakshmi Board Bazar Rajlakshmi Gazipur Rajlakshmi Konabari Rajlakshmi" +
                        "Rajlakshmi Chandra Rajlakshmi" +
                        "Azampur House Building Azampur Abdullahpur Azampur Tongi Azampur Station Road Azampur" +
                        "Azampur Mill Gate Azampur Board Bazar Azampur Gazipur Azampur Konabari Azampur" +
                        "Azampur Chandra Azampur" +
                        "House Building Abdullahpur House Building Tongi House Building Station Road House Building" +
                        "House Building Mill Gate House Building Board Bazar House Building Gazipur House Building Konabari House Building" +
                        "House Building Chandra House Building" +
                        "Abdullahpur Tongi Abdullahpur Station Road Abdullahpur" +
                        "Abdullahpur Mill Gate Abdullahpur Board Bazar Abdullahpur Gazipur Abdullahpur Konabari Abdullahpur" +
                        "Abdullahpur Chandra Abdullahpur" +
                        "Tongi Station Road Tongi" +
                        "Tongi Mill Gate Tongi Board Bazar Tongi Gazipur Tongi Konabari Tongi" +
                        "Tongi Chandra Tongi" +
                        "Station Road Mill Gate Station Road Board Bazar Station Road Gazipur Station Road Konabari Station Road" +
                        "Station Road Chandra Station Road" +
                        "Mill Gate Board Bazar Mill Gate Gazipur Mill Gate Konabari Mill Gate" +
                        "Mill Gate Chandra Mill Gate" +
                        "Board Bazar Gazipur Board Bazar Konabari Board Bazar" +
                        "Board Bazar Chandra Board Bazar" +
                        "Gazipur Konabari Gazipur" +
                        "Gazipur Chandra Gazipur" +
                        "Konabari Chandra Konabari"));


        buses.add(new Bus(R.drawable.logo,"BRTC",
                "Madanpur Kanchpur Madanpur Chittagong Road Madanpur Sign Board Madanpur Shonir Akhra Madanpur Jatrabari Madanpur" +
                        "Madanpur Sayedabad Madanpur Gulisthan Madanpur GPO Madanpur Paltan Madanpur Press Club Madanpur High Court Madanpur" +
                        "Madanpur Shahbag Madanpur Bangla Motor Madanpur Kawran Bazar Madanpur Farmgate Madanpur Khamarbari Madanpur" +
                        "Madanpur Asad Gate Madanpur Shyamoli Madanpur Kallayanpur Madanpur Technical Madanpur Gabtoli Madanpur " +
                        "Madanpur Savar Madanpur" +
                        "Kanchpur Chittagong Road Kanchpur Sign Board Kanchpur Shonir Akhra Kanchpur Jatrabari Kanchpur" +
                        "Kanchpur Sayedabad Kanchpur Gulisthan Kanchpur GPO Kanchpur Paltan Kanchpur Press Club Kanchpur High Court Kanchpur" +
                        "Kanchpur Shahbag Kanchpur Bangla Motor Kanchpur Kawran Bazar Kanchpur Farmgate Kanchpur Khamarbari Kanchpur" +
                        "Kanchpur Asad Gate Kanchpur Shyamoli Kanchpur Kallayanpur Kanchpur Technical Kanchpur Gabtoli Kanchpur " +
                        "Kanchpur Savar Kanchpur" +
                        "Chittagong Road Sign Board Chittagong Road Shonir Akhra Chittagong Road Jatrabari Chittagong Road" +
                        "Chittagong Road Sayedabad Chittagong Road Gulisthan Chittagong Road GPO Chittagong Road Paltan Chittagong Road Press Club Chittagong Road High Court Chittagong Road" +
                        "Chittagong Road Shahbag Chittagong Road Bangla Motor Chittagong Road Kawran Bazar Chittagong Road Farmgate Chittagong Road Khamarbari Chittagong Road" +
                        "Chittagong Road Asad Gate Chittagong Road Shyamoli Chittagong Road Kallayanpur Chittagong Road Technical Chittagong Road Gabtoli Chittagong Road " +
                        "Chittagong Road Savar Chittagong Road" +
                        "Sign Board Shonir Akhra Sign Board Jatrabari Sign Board" +
                        "Sign Board Sayedabad Sign Board Gulisthan Sign Board GPO Sign Board Paltan Sign Board Press Club Sign Board High Court Sign Board" +
                        "Sign Board Shahbag Sign Board Bangla Motor Sign Board Kawran Bazar Sign Board Farmgate Sign Board Khamarbari Sign Board" +
                        "Sign Board Asad Gate Sign Board Shyamoli Sign Board Kallayanpur Sign Board Technical Sign Board Gabtoli Sign Board " +
                        "Sign Board Savar Sign Board" +
                        "Shonir Akhra Jatrabari Shonir Akhra" +
                        "Shonir Akhra Sayedabad Shonir Akhra Gulisthan Shonir Akhra GPO Shonir Akhra Paltan Shonir Akhra Press Club Shonir Akhra High Court Shonir Akhra" +
                        "Shonir Akhra Shahbag Shonir Akhra Bangla Motor Shonir Akhra Kawran Bazar Shonir Akhra Farmgate Shonir Akhra Khamarbari Shonir Akhra" +
                        "Shonir Akhra Asad Gate Shonir Akhra Shyamoli Shonir Akhra Kallayanpur Shonir Akhra Technical Shonir Akhra Gabtoli Shonir Akhra " +
                        "Shonir Akhra Savar Shonir Akhra" +
                        "Jatrabari Sayedabad Jatrabari Gulisthan Jatrabari GPO Jatrabari Paltan Jatrabari Press Club Jatrabari High Court Jatrabari" +
                        "Jatrabari Shahbag Jatrabari Bangla Motor Jatrabari Kawran Bazar Jatrabari Farmgate Jatrabari Khamarbari Jatrabari" +
                        "Jatrabari Asad Gate Jatrabari Shyamoli Jatrabari Kallayanpur Jatrabari Technical Jatrabari Gabtoli Jatrabari " +
                        "Jatrabari Savar Jatrabari" +
                        "Sayedabad Gulisthan Sayedabad GPO Sayedabad Paltan Sayedabad Press Club Sayedabad High Court Sayedabad" +
                        "Sayedabad Shahbag Sayedabad Bangla Motor Sayedabad Kawran Bazar Sayedabad Farmgate Sayedabad Khamarbari Sayedabad" +
                        "Sayedabad Asad Gate Sayedabad Shyamoli Sayedabad Kallayanpur Sayedabad Technical Sayedabad Gabtoli Sayedabad " +
                        "Sayedabad Savar Sayedabad" +
                        "Gulisthan GPO Gulisthan Paltan Gulisthan Press Club Gulisthan High Court Gulisthan" +
                        "Gulisthan Shahbag Gulisthan Bangla Motor Gulisthan Kawran Bazar Gulisthan Farmgate Gulisthan Khamarbari Gulisthan" +
                        "Gulisthan Asad Gate Gulisthan Shyamoli Gulisthan Kallayanpur Gulisthan Technical Gulisthan Gabtoli Gulisthan " +
                        "Gulisthan Savar Gulisthan" +
                        "GPO Paltan GPO Press Club GPO High Court GPO" +
                        "GPO Shahbag GPO Bangla Motor GPO Kawran Bazar GPO Farmgate GPO Khamarbari GPO" +
                        "GPO Asad Gate GPO Shyamoli GPO Kallayanpur GPO Technical GPO Gabtoli GPO " +
                        "GPO Savar GPO" +
                        "Paltan Press Club Paltan High Court Paltan" +
                        "Paltan Shahbag Paltan Bangla Motor Paltan Kawran Bazar Paltan Farmgate Paltan Khamarbari Paltan" +
                        "Paltan Asad Gate Paltan Shyamoli Paltan Kallayanpur Paltan Technical Paltan Gabtoli Paltan " +
                        "Paltan Savar Paltan" +
                        "Press Club High Court Press Club" +
                        "Press Club Shahbag Press Club Bangla Motor Press Club Kawran Bazar Press Club Farmgate Press Club Khamarbari Press Club" +
                        "Press Club Asad Gate Press Club Shyamoli Press Club Kallayanpur Press Club Technical Press Club Gabtoli Press Club " +
                        "Press Club Savar Press Club" +
                        "High Court Shahbag High Court Bangla Motor High Court Kawran Bazar High Court Farmgate High Court Khamarbari High Court" +
                        "High Court Asad Gate High Court Shyamoli High Court Kallayanpur High Court Technical High Court Gabtoli High Court " +
                        "High Court Savar High Court" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag Farmgate Shahbag Khamarbari Shahbag" +
                        "Shahbag Asad Gate Shahbag Shyamoli Shahbag Kallayanpur Shahbag Technical Shahbag Gabtoli Shahbag " +
                        "Shahbag Savar Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Khamarbari Bangla Motor" +
                        "Bangla Motor Asad Gate Bangla Motor Shyamoli Bangla Motor Kallayanpur Bangla Motor Technical Bangla Motor Gabtoli Bangla Motor " +
                        "Bangla Motor Savar Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Khamarbari Kawran Bazar" +
                        "Kawran Bazar Asad Gate Kawran Bazar Shyamoli Kawran Bazar Kallayanpur Kawran Bazar Technical Kawran Bazar Gabtoli Kawran Bazar " +
                        "Kawran Bazar Savar Kawran Bazar" +
                        "Farmgate Khamarbari Farmgate" +
                        "Farmgate Asad Gate Farmgate Shyamoli Farmgate Kallayanpur Farmgate Technical Farmgate Gabtoli Farmgate " +
                        "Farmgate Savar Farmgate" +
                        "Khamarbari Asad Gate Khamarbari Shyamoli Khamarbari Kallayanpur Khamarbari Technical Khamarbari Gabtoli Khamarbari " +
                        "Khamarbari Savar Khamarbari" +
                        "Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Technical Asad Gate Gabtoli Asad Gate " +
                        "Asad Gate Savar Asad Gate" +
                        "Shyamoli Kallayanpur Shyamoli Technical Shyamoli Gabtoli Shyamoli " +
                        "Shyamoli Savar Shyamoli" +
                        "Kallayanpur Technical Kallayanpur Gabtoli Kallayanpur " +
                        "Kallayanpur Savar Kallayanpur" +
                        "Technical Gabtoli Technical " +
                        "Technical Savar Technical" +
                        "Gabtoli Savar Gabtoli"));


        buses.add(new Bus(R.drawable.logo,"BRTC 2",
                "Motijheel Gulisthan Motijheel GPO Motijheel Paltan Motijheel Press Club Motijheel High Court Motijheel Shahbag Motijheel" +
                        "Motijheel Bangla Motor Motijheel Kawran Bazar Motijheel Farmgate Motijheel Jahangir Gate Motijheel Mohakhali Motijheel" +
                        "Motijheel Chairman Bari Motijheel Kakoli Motijheel Banani Motijheel Staff Road Motijheel Shewra Motijheel Kuril Bishwa Road Motijheel" +
                        "Motijheel Khilkhet Motijheel Airport Motijheel House Building Motijheel Abdullahpur Motijheel" +
                        "Motijheel Tongi Motijheel" +
                        "Gulisthan GPO Gulisthan Paltan Gulisthan Press Club Gulisthan High Court Gulisthan Shahbag Gulisthan" +
                        "Gulisthan Bangla Motor Gulisthan Kawran Bazar Gulisthan Farmgate Gulisthan Jahangir Gate Gulisthan Mohakhali Gulisthan" +
                        "Gulisthan Chairman Bari Gulisthan Kakoli Gulisthan Banani Gulisthan Staff Road Gulisthan Shewra Gulisthan Kuril Bishwa Road Gulisthan" +
                        "Gulisthan Khilkhet Gulisthan Airport Gulisthan House Building Gulisthan Abdullahpur Gulisthan" +
                        "Gulisthan Tongi Gulisthan" +
                        "GPO Paltan GPO Press Club GPO High Court GPO Shahbag GPO" +
                        "GPO Bangla Motor GPO Kawran Bazar GPO Farmgate GPO Jahangir Gate GPO Mohakhali GPO" +
                        "GPO Chairman Bari GPO Kakoli GPO Banani GPO Staff Road GPO Shewra GPO Kuril Bishwa Road GPO" +
                        "GPO Khilkhet GPO Airport GPO House Building GPO Abdullahpur GPO" +
                        "GPO Tongi GPO" +
                        "Paltan Press Club Paltan High Court Paltan Shahbag Paltan" +
                        "Paltan Bangla Motor Paltan Kawran Bazar Paltan Farmgate Paltan Jahangir Gate Paltan Mohakhali Paltan" +
                        "Paltan Chairman Bari Paltan Kakoli Paltan Banani Paltan Staff Road Paltan Shewra Paltan Kuril Bishwa Road Paltan" +
                        "Paltan Khilkhet Paltan Airport Paltan House Building Paltan Abdullahpur Paltan" +
                        "Paltan Tongi Paltan" +
                        "Press Club High Court Press Club Shahbag Press Club" +
                        "Press Club Bangla Motor Press Club Kawran Bazar Press Club Farmgate Press Club Jahangir Gate Press Club Mohakhali Press Club" +
                        "Press Club Chairman Bari Press Club Kakoli Press Club Banani Press Club Staff Road Press Club Shewra Press Club Kuril Bishwa Road Press Club" +
                        "Press Club Khilkhet Press Club Airport Press Club House Building Press Club Abdullahpur Press Club" +
                        "Press Club Tongi Press Club" +
                        "High Court Shahbag High Court" +
                        "High Court Bangla Motor High Court Kawran Bazar High Court Farmgate High Court Jahangir Gate High Court Mohakhali High Court" +
                        "High Court Chairman Bari High Court Kakoli High Court Banani High Court Staff Road High Court Shewra High Court Kuril Bishwa Road High Court" +
                        "High Court Khilkhet High Court Airport High Court House Building High Court Abdullahpur High Court" +
                        "High Court Tongi High Court" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag Farmgate Shahbag Jahangir Gate Shahbag Mohakhali Shahbag" +
                        "Shahbag Chairman Bari Shahbag Kakoli Shahbag Banani Shahbag Staff Road Shahbag Shewra Shahbag Kuril Bishwa Road Shahbag" +
                        "Shahbag Khilkhet Shahbag Airport Shahbag House Building Shahbag Abdullahpur Shahbag" +
                        "Shahbag Tongi Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Jahangir Gate Bangla Motor Mohakhali Bangla Motor" +
                        "Bangla Motor Chairman Bari Bangla Motor Kakoli Bangla Motor Banani Bangla Motor Staff Road Bangla Motor Shewra Bangla Motor Kuril Bishwa Road Bangla Motor" +
                        "Bangla Motor Khilkhet Bangla Motor Airport Bangla Motor House Building Bangla Motor Abdullahpur Bangla Motor" +
                        "Bangla Motor Tongi Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Jahangir Gate Kawran Bazar Mohakhali Kawran Bazar" +
                        "Kawran Bazar Chairman Bari Kawran Bazar Kakoli Kawran Bazar Banani Kawran Bazar Staff Road Kawran Bazar Shewra Kawran Bazar Kuril Bishwa Road Kawran Bazar" +
                        "Kawran Bazar Khilkhet Kawran Bazar Airport Kawran Bazar House Building Kawran Bazar Abdullahpur Kawran Bazar" +
                        "Kawran Bazar Tongi Kawran Bazar" +
                        "Farmgate Jahangir Gate Farmgate Mohakhali Farmgate" +
                        "Farmgate Chairman Bari Farmgate Kakoli Farmgate Banani Farmgate Staff Road Farmgate Shewra Farmgate Kuril Bishwa Road Farmgate" +
                        "Farmgate Khilkhet Farmgate Airport Farmgate House Building Farmgate Abdullahpur Farmgate" +
                        "Farmgate Tongi Farmgate" +
                        "Jahangir Gate Mohakhali Jahangir Gate" +
                        "Jahangir Gate Chairman Bari Jahangir Gate Kakoli Jahangir Gate Banani Jahangir Gate Staff Road Jahangir Gate Shewra Jahangir Gate Kuril Bishwa Road Jahangir Gate" +
                        "Jahangir Gate Khilkhet Jahangir Gate Airport Jahangir Gate House Building Jahangir Gate Abdullahpur Jahangir Gate" +
                        "Jahangir Gate Tongi Jahangir Gate" +
                        "Mohakhali Chairman Bari Mohakhali Kakoli Mohakhali Banani Mohakhali Staff Road Mohakhali Shewra Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Mohakhali Khilkhet Mohakhali Airport Mohakhali House Building Mohakhali Abdullahpur Mohakhali" +
                        "Mohakhali Tongi Mohakhali" +
                        "Chairman Bari Kakoli Chairman Bari Banani Chairman Bari Staff Road Chairman Bari Shewra Chairman Bari Kuril Bishwa Road Chairman Bari" +
                        "Chairman Bari Khilkhet Chairman Bari Airport Chairman Bari House Building Chairman Bari Abdullahpur Chairman Bari" +
                        "Chairman Bari Tongi Chairman Bari" +
                        "Kakoli Banani Kakoli Staff Road Kakoli Shewra Kakoli Kuril Bishwa Road Kakoli" +
                        "Kakoli Khilkhet Kakoli Airport Kakoli House Building Kakoli Abdullahpur Kakoli" +
                        "Kakoli Tongi Kakoli" +
                        "Banani Staff Road Banani Shewra Banani Kuril Bishwa Road Banani" +
                        "Banani Khilkhet Banani Airport Banani House Building Banani Abdullahpur Banani" +
                        "Banani Tongi Banani" +
                        "Staff Road Shewra Staff Road Kuril Bishwa Road Staff Road" +
                        "Staff Road Khilkhet Staff Road Airport Staff Road House Building Staff Road Abdullahpur Staff Road" +
                        "Staff Road Tongi Staff Road" +
                        "Shewra Kuril Bishwa Road Shewra" +
                        "Shewra Khilkhet Shewra Airport Shewra House Building Shewra Abdullahpur Shewra" +
                        "Shewra Tongi Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road House Building Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Kuril Bishwa Road Tongi Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet House Building Khilkhet Abdullahpur Khilkhet" +
                        "Khilkhet Tongi Khilkhet" +
                        "Airport House Building Airport Abdullahpur Airport" +
                        "Airport Tongi Airport" +
                        "House Building Abdullahpur House Building" +
                        "House Building Tongi House Building" +
                        "Abdullahpur Tongi Abdullahpur"));


        buses.add(new Bus(R.drawable.logo,"BRTC 3",
                "Motijheel Gulisthan Motijheel GPO Motijheel Paltan Motijheel Press Club Motijheel High Court Motijheel Shahbag Motijheel" +
                        "Motijheel Bangla Motor Motijheel Kawran Bazar Motijheel Farmgate Motijheel Khamarbari Motijheel Asad Gate Motijheel" +
                        "Motijheel College Gate Motijheel Shishu Mela Motijheel Shyamoli Motijheel Kallayanpur Motijheel Darussalam Motijheel" +
                        "Motijheel Technical Motijheel Gabtoli Motijheel Aminbazar Motijheel Hemayetpur Motijheel Baipayl Motijheel Zirani Bazar Motijheel" +
                        "Motijheel Chandra Motijheel" +
                        "Gulisthan GPO Gulisthan Paltan Gulisthan Press Club Gulisthan High Court Gulisthan Shahbag Gulisthan" +
                        "Gulisthan Bangla Motor Gulisthan Kawran Bazar Gulisthan Farmgate Gulisthan Khamarbari Gulisthan Asad Gate Gulisthan" +
                        "Gulisthan College Gate Gulisthan Shishu Mela Gulisthan Shyamoli Gulisthan Kallayanpur Gulisthan Darussalam Gulisthan" +
                        "Gulisthan Technical Gulisthan Gabtoli Gulisthan Aminbazar Gulisthan Hemayetpur Gulisthan Baipayl Gulisthan Zirani Bazar Gulisthan" +
                        "Gulisthan Chandra Gulisthan" +
                        "GPO Paltan GPO Press Club GPO High Court GPO Shahbag GPO" +
                        "GPO Bangla Motor GPO Kawran Bazar GPO Farmgate GPO Khamarbari GPO Asad Gate GPO" +
                        "GPO College Gate GPO Shishu Mela GPO Shyamoli GPO Kallayanpur GPO Darussalam GPO" +
                        "GPO Technical GPO Gabtoli GPO Aminbazar GPO Hemayetpur GPO Baipayl GPO Zirani Bazar GPO" +
                        "GPO Chandra GPO" +
                        "Paltan Press Club Paltan High Court Paltan Shahbag Paltan" +
                        "Paltan Bangla Motor Paltan Kawran Bazar Paltan Farmgate Paltan Khamarbari Paltan Asad Gate Paltan" +
                        "Paltan College Gate Paltan Shishu Mela Paltan Shyamoli Paltan Kallayanpur Paltan Darussalam Paltan" +
                        "Paltan Technical Paltan Gabtoli Paltan Aminbazar Paltan Hemayetpur Paltan Baipayl Paltan Zirani Bazar Paltan" +
                        "Paltan Chandra Paltan" +
                        "Press Club High Court Press Club Shahbag Press Club" +
                        "Press Club Bangla Motor Press Club Kawran Bazar Press Club Farmgate Press Club Khamarbari Press Club Asad Gate Press Club" +
                        "Press Club College Gate Press Club Shishu Mela Press Club Shyamoli Press Club Kallayanpur Press Club Darussalam Press Club" +
                        "Press Club Technical Press Club Gabtoli Press Club Aminbazar Press Club Hemayetpur Press Club Baipayl Press Club Zirani Bazar Press Club" +
                        "Press Club Chandra Press Club" +
                        "High Court Shahbag High Court" +
                        "High Court Bangla Motor High Court Kawran Bazar High Court Farmgate High Court Khamarbari High Court Asad Gate High Court" +
                        "High Court College Gate High Court Shishu Mela High Court Shyamoli High Court Kallayanpur High Court Darussalam High Court" +
                        "High Court Technical High Court Gabtoli High Court Aminbazar High Court Hemayetpur High Court Baipayl High Court Zirani Bazar High Court" +
                        "High Court Chandra High Court" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag Farmgate Shahbag Khamarbari Shahbag Asad Gate Shahbag" +
                        "Shahbag College Gate Shahbag Shishu Mela Shahbag Shyamoli Shahbag Kallayanpur Shahbag Darussalam Shahbag" +
                        "Shahbag Technical Shahbag Gabtoli Shahbag Aminbazar Shahbag Hemayetpur Shahbag Baipayl Shahbag Zirani Bazar Shahbag" +
                        "Shahbag Chandra Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Khamarbari Bangla Motor Asad Gate Bangla Motor" +
                        "Bangla Motor College Gate Bangla Motor Shishu Mela Bangla Motor Shyamoli Bangla Motor Kallayanpur Bangla Motor Darussalam Bangla Motor" +
                        "Bangla Motor Technical Bangla Motor Gabtoli Bangla Motor Aminbazar Bangla Motor Hemayetpur Bangla Motor Baipayl Bangla Motor Zirani Bazar Bangla Motor" +
                        "Bangla Motor Chandra Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Khamarbari Kawran Bazar Asad Gate Kawran Bazar" +
                        "Kawran Bazar College Gate Kawran Bazar Shishu Mela Kawran Bazar Shyamoli Kawran Bazar Kallayanpur Kawran Bazar Darussalam Kawran Bazar" +
                        "Kawran Bazar Technical Kawran Bazar Gabtoli Kawran Bazar Aminbazar Kawran Bazar Hemayetpur Kawran Bazar Baipayl Kawran Bazar Zirani Bazar Kawran Bazar" +
                        "Kawran Bazar Chandra Kawran Bazar" +
                        "Farmgate Khamarbari Farmgate Asad Gate Farmgate" +
                        "Farmgate College Gate Farmgate Shishu Mela Farmgate Shyamoli Farmgate Kallayanpur Farmgate Darussalam Farmgate" +
                        "Farmgate Technical Farmgate Gabtoli Farmgate Aminbazar Farmgate Hemayetpur Farmgate Baipayl Farmgate Zirani Bazar Farmgate" +
                        "Farmgate Chandra Farmgate" +
                        "Khamarbari Asad Gate Khamarbari" +
                        "Khamarbari College Gate Khamarbari Shishu Mela Khamarbari Shyamoli Khamarbari Kallayanpur Khamarbari Darussalam Khamarbari" +
                        "Khamarbari Technical Khamarbari Gabtoli Khamarbari Aminbazar Khamarbari Hemayetpur Khamarbari Baipayl Khamarbari Zirani Bazar Khamarbari" +
                        "Khamarbari Chandra Khamarbari" +
                        "Asad Gate College Gate Asad Gate Shishu Mela Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Darussalam Asad Gate" +
                        "Asad Gate Technical Asad Gate Gabtoli Asad Gate Aminbazar Asad Gate Hemayetpur Asad Gate Baipayl Asad Gate Zirani Bazar Asad Gate" +
                        "Asad Gate Chandra Asad Gate" +
                        "College Gate Shishu Mela College Gate Shyamoli College Gate Kallayanpur College Gate Darussalam College Gate" +
                        "College Gate Technical College Gate Gabtoli College Gate Aminbazar College Gate Hemayetpur College Gate Baipayl College Gate Zirani Bazar College Gate" +
                        "College Gate Chandra College Gate" +
                        "Shishu Mela Shyamoli Shishu Mela Kallayanpur Shishu Mela Darussalam Shishu Mela" +
                        "Shishu Mela Technical Shishu Mela Gabtoli Shishu Mela Aminbazar Shishu Mela Hemayetpur Shishu Mela Baipayl Shishu Mela Zirani Bazar Shishu Mela" +
                        "Shishu Mela Chandra Shishu Mela" +
                        "Shyamoli Kallayanpur Shyamoli Darussalam Shyamoli" +
                        "Shyamoli Technical Shyamoli Gabtoli Shyamoli Aminbazar Shyamoli Hemayetpur Shyamoli Baipayl Shyamoli Zirani Bazar Shyamoli" +
                        "Shyamoli Chandra Shyamoli" +
                        "Kallayanpur Darussalam Kallayanpur" +
                        "Kallayanpur Technical Kallayanpur Gabtoli Kallayanpur Aminbazar Kallayanpur Hemayetpur Kallayanpur Baipayl Kallayanpur Zirani Bazar Kallayanpur" +
                        "Kallayanpur Chandra Kallayanpur" +
                        "Darussalam Technical Darussalam Gabtoli Darussalam Aminbazar Darussalam Hemayetpur Darussalam Baipayl Darussalam Zirani Bazar Darussalam" +
                        "Darussalam Chandra Darussalam" +
                        "Technical Gabtoli Technical Aminbazar Technical Hemayetpur Technical Baipayl Technical Zirani Bazar Technical" +
                        "Technical Chandra Technical" +
                        "Gabtoli Aminbazar Gabtoli Hemayetpur Gabtoli Baipayl Gabtoli Zirani Bazar Gabtoli" +
                        "Gabtoli Chandra Gabtoli" +
                        "Aminbazar Hemayetpur Aminbazar Baipayl Aminbazar Zirani Bazar Aminbazar" +
                        "Aminbazar Chandra Aminbazar" +
                        "Hemayetpur Baipayl Hemayetpur Zirani Bazar Hemayetpur" +
                        "Hemayetpur Chandra Hemayetpur" +
                        "Baipayl Zirani Bazar Baipayl" +
                        "Baipayl Chandra Baipayl" +
                        "Zirani Bazar Chandra Zirani Bazar"));


        buses.add(new Bus(R.drawable.logo,"BRTC 4",
                "Mohammadpur Asad Gate Mohammadpur Khamarbari Mohammadpur Farmgate Mohammadpur Jahangir Gate Mohammadpur Mohakhali Mohammadpur" +
                        "Mohammadpur Wireless Mor Mohammadpur Gulshan 1 Mohammadpur Badda Mohammadpur Shahjadpur Mohammadpur Natun Bazar Mohammadpur" +
                        "Mohammadpur Nadda Mohammadpur Bashundhara Mohammadpur Jamuna Future Park Mohammadpur" +
                        "Mohammadpur Kuril Bishwa Road Mohammadpur" +
                        "Asad Gate Khamarbari Asad Gate Farmgate Asad Gate Jahangir Gate Asad Gate Mohakhali Asad Gate" +
                        "Asad Gate Wireless Mor Asad Gate Gulshan 1 Asad Gate Badda Asad Gate Shahjadpur Asad Gate Natun Bazar Asad Gate" +
                        "Asad Gate Nadda Asad Gate Bashundhara Asad Gate Jamuna Future Park Asad Gate" +
                        "Asad Gate Kuril Bishwa Road Asad Gate" +
                        "Khamarbari Farmgate Khamarbari Jahangir Gate Khamarbari Mohakhali Khamarbari" +
                        "Khamarbari Wireless Mor Khamarbari Gulshan 1 Khamarbari Badda Khamarbari Shahjadpur Khamarbari Natun Bazar Khamarbari" +
                        "Khamarbari Nadda Khamarbari Bashundhara Khamarbari Jamuna Future Park Khamarbari" +
                        "Khamarbari Kuril Bishwa Road Khamarbari" +
                        "Farmgate Jahangir Gate Farmgate Mohakhali Farmgate" +
                        "Farmgate Wireless Mor Farmgate Gulshan 1 Farmgate Badda Farmgate Shahjadpur Farmgate Natun Bazar Farmgate" +
                        "Farmgate Nadda Farmgate Bashundhara Farmgate Jamuna Future Park Farmgate" +
                        "Farmgate Kuril Bishwa Road Farmgate" +
                        "Jahangir Gate Mohakhali Jahangir Gate" +
                        "Jahangir Gate Wireless Mor Jahangir Gate Gulshan 1 Jahangir Gate Badda Jahangir Gate Shahjadpur Jahangir Gate Natun Bazar Jahangir Gate" +
                        "Jahangir Gate Nadda Jahangir Gate Bashundhara Jahangir Gate Jamuna Future Park Jahangir Gate" +
                        "Jahangir Gate Kuril Bishwa Road Jahangir Gate" +
                        "Mohakhali Wireless Mor Mohakhali Gulshan 1 Mohakhali Badda Mohakhali Shahjadpur Mohakhali Natun Bazar Mohakhali" +
                        "Mohakhali Nadda Mohakhali Bashundhara Mohakhali Jamuna Future Park Mohakhali" +
                        "Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Wireless Mor Gulshan 1 Wireless Mor Badda Wireless Mor Shahjadpur Wireless Mor Natun Bazar Wireless Mor" +
                        "Wireless Mor Nadda Wireless Mor Bashundhara Wireless Mor Jamuna Future Park Wireless Mor" +
                        "Wireless Mor Kuril Bishwa Road Wireless Mor" +
                        "Gulshan 1 Badda Gulshan 1 Shahjadpur Gulshan 1 Natun Bazar Gulshan 1" +
                        "Gulshan 1 Nadda Gulshan 1 Bashundhara Gulshan 1 Jamuna Future Park Gulshan 1" +
                        "Gulshan 1 Kuril Bishwa Road Gulshan 1" +
                        "Badda Shahjadpur Badda Natun Bazar Badda" +
                        "Badda Nadda Badda Bashundhara Badda Jamuna Future Park Badda" +
                        "Badda Kuril Bishwa Road Badda" +
                        "Shahjadpur Natun Bazar Shahjadpur" +
                        "Shahjadpur Nadda Shahjadpur Bashundhara Shahjadpur Jamuna Future Park Shahjadpur" +
                        "Shahjadpur Kuril Bishwa Road Shahjadpur" +
                        "Natun Bazar Nadda Natun Bazar Bashundhara Natun Bazar Jamuna Future Park Natun Bazar" +
                        "Natun Bazar Kuril Bishwa Road Natun Bazar" +
                        "Nadda Bashundhara Nadda Jamuna Future Park Nadda" +
                        "Nadda Kuril Bishwa Road Nadda" +
                        "Bashundhara Jamuna Future Park Bashundhara" +
                        "Bashundhara Kuril Bishwa Road Bashundhara" +
                        "Jamuna Future Park Kuril Bishwa Road Jamuna Future Park"));




        buses.add(new Bus(R.drawable.logo,"BRTC 5",
                "Kamalapur Motijheel Kamalapur Gulisthan Kamalapur GPO Kamalapur Press Club Kamalapur Shahbag Kamalapur Bangla Motor Kamalapur" +
                        "Kamalapur Kawran Bazar Kamalapur Farmgate Kamalapur Jahangir Gate Kamalapur Mohakhali Kamalapur Wireless Mor Kamalapur" +
                        "Kamalapur Gulshan 1 Kamalapur Badda Kamalapur Shahjadpur Kamalapur Natun Bazar Kamalapur Nadda Kamalapur" +
                        "Kamalapur Bashundhara Kamalapur Jamuna Future Park Kamalapur " +
                        "Kamalapur Kuril Bishwa Road Kamalapur" +
                        "Motijheel Gulisthan Motijheel GPO Motijheel Press Club Motijheel Shahbag Motijheel Bangla Motor Motijheel" +
                        "Motijheel Kawran Bazar Motijheel Farmgate Motijheel Jahangir Gate Motijheel Mohakhali Motijheel Wireless Mor Motijheel" +
                        "Motijheel Gulshan 1 Motijheel Badda Motijheel Shahjadpur Motijheel Natun Bazar Motijheel Nadda Motijheel" +
                        "Motijheel Bashundhara Motijheel Jamuna Future Park Motijheel " +
                        "Motijheel Kuril Bishwa Road Motijheel" +
                        "Gulisthan GPO Gulisthan Press Club Gulisthan Shahbag Gulisthan Bangla Motor Gulisthan" +
                        "Gulisthan Kawran Bazar Gulisthan Farmgate Gulisthan Jahangir Gate Gulisthan Mohakhali Gulisthan Wireless Mor Gulisthan" +
                        "Gulisthan Gulshan 1 Gulisthan Badda Gulisthan Shahjadpur Gulisthan Natun Bazar Gulisthan Nadda Gulisthan" +
                        "Gulisthan Bashundhara Gulisthan Jamuna Future Park Gulisthan " +
                        "Gulisthan Kuril Bishwa Road Gulisthan" +
                        "GPO Press Club GPO Shahbag GPO Bangla Motor GPO" +
                        "GPO Kawran Bazar GPO Farmgate GPO Jahangir Gate GPO Mohakhali GPO Wireless Mor GPO" +
                        "GPO Gulshan 1 GPO Badda GPO Shahjadpur GPO Natun Bazar GPO Nadda GPO" +
                        "GPO Bashundhara GPO Jamuna Future Park GPO " +
                        "GPO Kuril Bishwa Road GPO" +
                        "Press Club Shahbag Press Club Bangla Motor Press Club" +
                        "Press Club Kawran Bazar Press Club Farmgate Press Club Jahangir Gate Press Club Mohakhali Press Club Wireless Mor Press Club" +
                        "Press Club Gulshan 1 Press Club Badda Press Club Shahjadpur Press Club Natun Bazar Press Club Nadda Press Club" +
                        "Press Club Bashundhara Press Club Jamuna Future Park Press Club " +
                        "Press Club Kuril Bishwa Road Press Club" +
                        "Shahbag Bangla Motor Shahbag" +
                        "Shahbag Kawran Bazar Shahbag Farmgate Shahbag Jahangir Gate Shahbag Mohakhali Shahbag Wireless Mor Shahbag" +
                        "Shahbag Gulshan 1 Shahbag Badda Shahbag Shahjadpur Shahbag Natun Bazar Shahbag Nadda Shahbag" +
                        "Shahbag Bashundhara Shahbag Jamuna Future Park Shahbag " +
                        "Shahbag Kuril Bishwa Road Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Jahangir Gate Bangla Motor Mohakhali Bangla Motor Wireless Mor Bangla Motor" +
                        "Bangla Motor Gulshan 1 Bangla Motor Badda Bangla Motor Shahjadpur Bangla Motor Natun Bazar Bangla Motor Nadda Bangla Motor" +
                        "Bangla Motor Bashundhara Bangla Motor Jamuna Future Park Bangla Motor " +
                        "Bangla Motor Kuril Bishwa Road Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Jahangir Gate Kawran Bazar Mohakhali Kawran Bazar Wireless Mor Kawran Bazar" +
                        "Kawran Bazar Gulshan 1 Kawran Bazar Badda Kawran Bazar Shahjadpur Kawran Bazar Natun Bazar Kawran Bazar Nadda Kawran Bazar" +
                        "Kawran Bazar Bashundhara Kawran Bazar Jamuna Future Park Kawran Bazar " +
                        "Kawran Bazar Kuril Bishwa Road Kawran Bazar" +
                        "Farmgate Jahangir Gate Farmgate Mohakhali Farmgate Wireless Mor Farmgate" +
                        "Farmgate Gulshan 1 Farmgate Badda Farmgate Shahjadpur Farmgate Natun Bazar Farmgate Nadda Farmgate" +
                        "Farmgate Bashundhara Farmgate Jamuna Future Park Farmgate " +
                        "Farmgate Kuril Bishwa Road Farmgate" +
                        "Jahangir Gate Mohakhali Jahangir Gate Wireless Mor Jahangir Gate" +
                        "Jahangir Gate Gulshan 1 Jahangir Gate Badda Jahangir Gate Shahjadpur Jahangir Gate Natun Bazar Jahangir Gate Nadda Jahangir Gate" +
                        "Jahangir Gate Bashundhara Jahangir Gate Jamuna Future Park Jahangir Gate " +
                        "Jahangir Gate Kuril Bishwa Road Jahangir Gate" +
                        "Mohakhali Wireless Mor Mohakhali" +
                        "Mohakhali Gulshan 1 Mohakhali Badda Mohakhali Shahjadpur Mohakhali Natun Bazar Mohakhali Nadda Mohakhali" +
                        "Mohakhali Bashundhara Mohakhali Jamuna Future Park Mohakhali " +
                        "Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Wireless Mor Gulshan 1 Wireless Mor Badda Wireless Mor Shahjadpur Wireless Mor Natun Bazar Wireless Mor Nadda Wireless Mor" +
                        "Wireless Mor Bashundhara Wireless Mor Jamuna Future Park Wireless Mor " +
                        "Wireless Mor Kuril Bishwa Road Wireless Mor" +
                        "Gulshan 1 Badda Gulshan 1 Shahjadpur Gulshan 1 Natun Bazar Gulshan 1 Nadda Gulshan 1" +
                        "Gulshan 1 Bashundhara Gulshan 1 Jamuna Future Park Gulshan 1 " +
                        "Gulshan 1 Kuril Bishwa Road Gulshan 1" +
                        "Badda Shahjadpur Badda Natun Bazar Badda Nadda Badda" +
                        "Badda Bashundhara Badda Jamuna Future Park Badda " +
                        "Badda Kuril Bishwa Road Badda" +
                        "Shahjadpur Natun Bazar Shahjadpur Nadda Shahjadpur" +
                        "Shahjadpur Bashundhara Shahjadpur Jamuna Future Park Shahjadpur " +
                        "Shahjadpur Kuril Bishwa Road Shahjadpur" +
                        "Natun Bazar Nadda Natun Bazar" +
                        "Natun Bazar Bashundhara Natun Bazar Jamuna Future Park Natun Bazar " +
                        "Natun Bazar Kuril Bishwa Road Natun Bazar" +
                        "Nadda Bashundhara Nadda Jamuna Future Park Nadda " +
                        "Nadda Kuril Bishwa Road Nadda" +
                        "Bashundhara Jamuna Future Park Bashundhara " +
                        "Bashundhara Kuril Bishwa Road Bashundhara" +
                        "Jamuna Future Park Kuril Bishwa Road Jamuna Future Park"));





        buses.add(new Bus(R.drawable.logo,"BRTC 6",
                "Bhulta Kanchan Bridge Bhulta Nila Market Bhulta 300 Feet Bhulta Bashundhara R/A Bhulta Kuril Bishwa Road Bhulta" +
                        "Kanchan Bridge Nila Market Kanchan Bridge 300 Feet Kanchan Bridge Bashundhara R/A Kanchan Bridge Kuril Bishwa Road Kanchan Bridge" +
                        "Nila Market 300 Feet Nila Market Bashundhara R/A Nila Market Kuril Bishwa Road Nila Market" +
                        "300 Feet Bashundhara R/A 300 Feet Kuril Bishwa Road 300 Feet" +
                        "Bashundhara R/A Kuril Bishwa Road Bashundhara R/A"));



        buses.add(new Bus(R.drawable.logo,"Balaka Paribahan",
                "Sayedabad Ittefaq Sayedabad Motijheel Sayedabad Kamalapur Sayedabad Malibagh Sayedabad Mouchak Sayedabad Moghbazar Sayedabad" +
                        "Sayedabad Satrasta Sayedabad Nabisco Sayedabad Mohakhali Sayedabad Chairman Bari Sayedabad Banani Sayedabad Kakoli Sayedabad" +
                        "Sayedabad Shewra Sayedabad Kuril Bishwa Road Sayedabad Khilkhet Sayedabad Airport Sayedabad Jasimuddin Sayedabad" +
                        "Sayedabad Rajlakshmi Sayedabad Azampur Sayedabad House Building Sayedabad " +
                        "Sayedabad Abdullahpur Sayedabad" +
                        "Ittefaq Motijheel Ittefaq Kamalapur Ittefaq Malibagh Ittefaq Mouchak Ittefaq Moghbazar Ittefaq" +
                        "Ittefaq Satrasta Ittefaq Nabisco Ittefaq Mohakhali Ittefaq Chairman Bari Ittefaq Banani Ittefaq Kakoli Ittefaq" +
                        "Ittefaq Shewra Ittefaq Kuril Bishwa Road Ittefaq Khilkhet Ittefaq Airport Ittefaq Jasimuddin Ittefaq" +
                        "Ittefaq Rajlakshmi Ittefaq Azampur Ittefaq House Building Ittefaq " +
                        "Ittefaq Abdullahpur Ittefaq" +
                        "Motijheel Kamalapur Motijheel Malibagh Motijheel Mouchak Motijheel Moghbazar Motijheel" +
                        "Motijheel Satrasta Motijheel Nabisco Motijheel Mohakhali Motijheel Chairman Bari Motijheel Banani Motijheel Kakoli Motijheel" +
                        "Motijheel Shewra Motijheel Kuril Bishwa Road Motijheel Khilkhet Motijheel Airport Motijheel Jasimuddin Motijheel" +
                        "Motijheel Rajlakshmi Motijheel Azampur Motijheel House Building Motijheel " +
                        "Motijheel Abdullahpur Motijheel" +
                        "Kamalapur Malibagh Kamalapur Mouchak Kamalapur Moghbazar Kamalapur" +
                        "Kamalapur Satrasta Kamalapur Nabisco Kamalapur Mohakhali Kamalapur Chairman Bari Kamalapur Banani Kamalapur Kakoli Kamalapur" +
                        "Kamalapur Shewra Kamalapur Kuril Bishwa Road Kamalapur Khilkhet Kamalapur Airport Kamalapur Jasimuddin Kamalapur" +
                        "Kamalapur Rajlakshmi Kamalapur Azampur Kamalapur House Building Kamalapur " +
                        "Kamalapur Abdullahpur Kamalapur" +
                        "Malibagh Mouchak Malibagh Moghbazar Malibagh" +
                        "Malibagh Satrasta Malibagh Nabisco Malibagh Mohakhali Malibagh Chairman Bari Malibagh Banani Malibagh Kakoli Malibagh" +
                        "Malibagh Shewra Malibagh Kuril Bishwa Road Malibagh Khilkhet Malibagh Airport Malibagh Jasimuddin Malibagh" +
                        "Malibagh Rajlakshmi Malibagh Azampur Malibagh House Building Malibagh " +
                        "Malibagh Abdullahpur Malibagh" +
                        "Mouchak Moghbazar Mouchak" +
                        "Mouchak Satrasta Mouchak Nabisco Mouchak Mohakhali Mouchak Chairman Bari Mouchak Banani Mouchak Kakoli Mouchak" +
                        "Mouchak Shewra Mouchak Kuril Bishwa Road Mouchak Khilkhet Mouchak Airport Mouchak Jasimuddin Mouchak" +
                        "Mouchak Rajlakshmi Mouchak Azampur Mouchak House Building Mouchak " +
                        "Mouchak Abdullahpur Mouchak" +
                        "Moghbazar Satrasta Moghbazar Nabisco Moghbazar Mohakhali Moghbazar Chairman Bari Moghbazar Banani Moghbazar Kakoli Moghbazar" +
                        "Moghbazar Shewra Moghbazar Kuril Bishwa Road Moghbazar Khilkhet Moghbazar Airport Moghbazar Jasimuddin Moghbazar" +
                        "Moghbazar Rajlakshmi Moghbazar Azampur Moghbazar House Building Moghbazar " +
                        "Moghbazar Abdullahpur Moghbazar" +
                        "Satrasta Nabisco Satrasta Mohakhali Satrasta Chairman Bari Satrasta Banani Satrasta Kakoli Satrasta" +
                        "Satrasta Shewra Satrasta Kuril Bishwa Road Satrasta Khilkhet Satrasta Airport Satrasta Jasimuddin Satrasta" +
                        "Satrasta Rajlakshmi Satrasta Azampur Satrasta House Building Satrasta " +
                        "Satrasta Abdullahpur Satrasta" +
                        "Nabisco Mohakhali Nabisco Chairman Bari Nabisco Banani Nabisco Kakoli Nabisco" +
                        "Nabisco Shewra Nabisco Kuril Bishwa Road Nabisco Khilkhet Nabisco Airport Nabisco Jasimuddin Nabisco" +
                        "Nabisco Rajlakshmi Nabisco Azampur Nabisco House Building Nabisco " +
                        "Nabisco Abdullahpur Nabisco" +
                        "Mohakhali Chairman Bari Mohakhali Banani Mohakhali Kakoli Mohakhali" +
                        "Mohakhali Shewra Mohakhali Kuril Bishwa Road Mohakhali Khilkhet Mohakhali Airport Mohakhali Jasimuddin Mohakhali" +
                        "Mohakhali Rajlakshmi Mohakhali Azampur Mohakhali House Building Mohakhali " +
                        "Mohakhali Abdullahpur Mohakhali" +
                        "Chairman Bari Banani Chairman Bari Kakoli Chairman Bari" +
                        "Chairman Bari Shewra Chairman Bari Kuril Bishwa Road Chairman Bari Khilkhet Chairman Bari Airport Chairman Bari Jasimuddin Chairman Bari" +
                        "Chairman Bari Rajlakshmi Chairman Bari Azampur Chairman Bari House Building Chairman Bari " +
                        "Chairman Bari Abdullahpur Chairman Bari" +
                        "Banani Kakoli Banani" +
                        "Banani Shewra Banani Kuril Bishwa Road Banani Khilkhet Banani Airport Banani Jasimuddin Banani" +
                        "Banani Rajlakshmi Banani Azampur Banani House Building Banani " +
                        "Banani Abdullahpur Banani" +
                        "Kakoli Shewra Kakoli Kuril Bishwa Road Kakoli Khilkhet Kakoli Airport Kakoli Jasimuddin Kakoli" +
                        "Kakoli Rajlakshmi Kakoli Azampur Kakoli House Building Kakoli " +
                        "Kakoli Abdullahpur Kakoli" +
                        "Shewra Kuril Bishwa Road Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra" +
                        "Shewra Rajlakshmi Shewra Azampur Shewra House Building Shewra " +
                        "Shewra Abdullahpur Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road" +
                        "Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road " +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet" +
                        "Khilkhet Rajlakshmi Khilkhet Azampur Khilkhet House Building Khilkhet " +
                        "Khilkhet Abdullahpur Khilkhet" +
                        "Airport Jasimuddin Airport" +
                        "Airport Rajlakshmi Airport Azampur Airport House Building Airport " +
                        "Airport Abdullahpur Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin Azampur Jasimuddin House Building Jasimuddin " +
                        "Jasimuddin Abdullahpur Jasimuddin" +
                        "Rajlakshmi Azampur Rajlakshmi House Building Rajlakshmi " +
                        "Rajlakshmi Abdullahpur Rajlakshmi" +
                        "Azampur House Building Azampur " +
                        "Azampur Abdullahpur Azampur" +
                        "House Building Abdullahpur House Building"));



        buses.add(new Bus(R.drawable.logo,"Basumati Transport",
                "Gabtoli Mirpur 1 Gabtoli Mirpur 2 Gabtoli Mirpur 10 Gabtoli Mirpur 11 Gabtoli Purobi Gabtoli Kalshi Gabtoli ECB Square Gabtoli" +
                        "Gabtoli MES Gabtoli Shewra Gabtoli Kuril Bishwa Road Gabtoli Khilkhet Gabtoli Airport Gabtoli Jasimuddin Gabtoli" +
                        "Gabtoli Rajlakshmi Gabtoli House Building Gabtoli Abdullahpur Gabtoli Tongi Gabtoli Station Road Gabtoli Mill Gate Gabtoli" +
                        "Gabtoli Board Bazar Gabtoli Gazipur Gabtoli" +
                        "Mirpur 1 Mirpur 2 Mirpur 1 Mirpur 10 Mirpur 1 Mirpur 11 Mirpur 1 Purobi Mirpur 1 Kalshi Mirpur 1 ECB Square Mirpur 1" +
                        "Mirpur 1 MES Mirpur 1 Shewra Mirpur 1 Kuril Bishwa Road Mirpur 1 Khilkhet Mirpur 1 Airport Mirpur 1 Jasimuddin Mirpur 1" +
                        "Mirpur 1 Rajlakshmi Mirpur 1 House Building Mirpur 1 Abdullahpur Mirpur 1 Tongi Mirpur 1 Station Road Mirpur 1 Mill Gate Mirpur 1" +
                        "Mirpur 1 Board Bazar Mirpur 1 Gazipur Mirpur 1" +
                        "Mirpur 2 Mirpur 10 Mirpur 2 Mirpur 11 Mirpur 2 Purobi Mirpur 2 Kalshi Mirpur 2 ECB Square Mirpur 2" +
                        "Mirpur 2 MES Mirpur 2 Shewra Mirpur 2 Kuril Bishwa Road Mirpur 2 Khilkhet Mirpur 2 Airport Mirpur 2 Jasimuddin Mirpur 2" +
                        "Mirpur 2 Rajlakshmi Mirpur 2 House Building Mirpur 2 Abdullahpur Mirpur 2 Tongi Mirpur 2 Station Road Mirpur 2 Mill Gate Mirpur 2" +
                        "Mirpur 2 Board Bazar Mirpur 2 Gazipur Mirpur 2" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10 ECB Square Mirpur 10" +
                        "Mirpur 10 MES Mirpur 10 Shewra Mirpur 10 Kuril Bishwa Road Mirpur 10 Khilkhet Mirpur 10 Airport Mirpur 10 Jasimuddin Mirpur 10" +
                        "Mirpur 10 Rajlakshmi Mirpur 10 House Building Mirpur 10 Abdullahpur Mirpur 10 Tongi Mirpur 10 Station Road Mirpur 10 Mill Gate Mirpur 10" +
                        "Mirpur 10 Board Bazar Mirpur 10 Gazipur Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Kalshi Mirpur 11 ECB Square Mirpur 11" +
                        "Mirpur 11 MES Mirpur 11 Shewra Mirpur 11 Kuril Bishwa Road Mirpur 11 Khilkhet Mirpur 11 Airport Mirpur 11 Jasimuddin Mirpur 11" +
                        "Mirpur 11 Rajlakshmi Mirpur 11 House Building Mirpur 11 Abdullahpur Mirpur 11 Tongi Mirpur 11 Station Road Mirpur 11 Mill Gate Mirpur 11" +
                        "Mirpur 11 Board Bazar Mirpur 11 Gazipur Mirpur 11" +
                        "Purobi Kalshi Purobi ECB Square Purobi" +
                        "Purobi MES Purobi Shewra Purobi Kuril Bishwa Road Purobi Khilkhet Purobi Airport Purobi Jasimuddin Purobi" +
                        "Purobi Rajlakshmi Purobi House Building Purobi Abdullahpur Purobi Tongi Purobi Station Road Purobi Mill Gate Purobi" +
                        "Purobi Board Bazar Purobi Gazipur Purobi" +
                        "Kalshi ECB Square Kalshi" +
                        "Kalshi MES Kalshi Shewra Kalshi Kuril Bishwa Road Kalshi Khilkhet Kalshi Airport Kalshi Jasimuddin Kalshi" +
                        "Kalshi Rajlakshmi Kalshi House Building Kalshi Abdullahpur Kalshi Tongi Kalshi Station Road Kalshi Mill Gate Kalshi" +
                        "Kalshi Board Bazar Kalshi Gazipur Kalshi" +
                        "ECB Square MES ECB Square Shewra ECB Square Kuril Bishwa Road ECB Square Khilkhet ECB Square Airport ECB Square Jasimuddin ECB Square" +
                        "ECB Square Rajlakshmi ECB Square House Building ECB Square Abdullahpur ECB Square Tongi ECB Square Station Road ECB Square Mill Gate ECB Square" +
                        "ECB Square Board Bazar ECB Square Gazipur ECB Square" +
                        "MES Shewra MES Kuril Bishwa Road MES Khilkhet MES Airport MES Jasimuddin MES" +
                        "MES Rajlakshmi MES House Building MES Abdullahpur MES Tongi MES Station Road MES Mill Gate MES" +
                        "MES Board Bazar MES Gazipur MES" +
                        "Shewra Kuril Bishwa Road Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra" +
                        "Shewra Rajlakshmi Shewra House Building Shewra Abdullahpur Shewra Tongi Shewra Station Road Shewra Mill Gate Shewra" +
                        "Shewra Board Bazar Shewra Gazipur Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road" +
                        "Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road House Building Kuril Bishwa Road Abdullahpur Kuril Bishwa Road Tongi Kuril Bishwa Road Station Road Kuril Bishwa Road Mill Gate Kuril Bishwa Road" +
                        "Kuril Bishwa Road Board Bazar Kuril Bishwa Road Gazipur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet" +
                        "Khilkhet Rajlakshmi Khilkhet House Building Khilkhet Abdullahpur Khilkhet Tongi Khilkhet Station Road Khilkhet Mill Gate Khilkhet" +
                        "Khilkhet Board Bazar Khilkhet Gazipur Khilkhet" +
                        "Airport Jasimuddin Airport" +
                        "Airport Rajlakshmi Airport House Building Airport Abdullahpur Airport Tongi Airport Station Road Airport Mill Gate Airport" +
                        "Airport Board Bazar Airport Gazipur Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin House Building Jasimuddin Abdullahpur Jasimuddin Tongi Jasimuddin Station Road Jasimuddin Mill Gate Jasimuddin" +
                        "Jasimuddin Board Bazar Jasimuddin Gazipur Jasimuddin" +
                        "Rajlakshmi House Building Rajlakshmi Abdullahpur Rajlakshmi Tongi Rajlakshmi Station Road Rajlakshmi Mill Gate Rajlakshmi" +
                        "Rajlakshmi Board Bazar Rajlakshmi Gazipur Rajlakshmi" +
                        "House Building Abdullahpur House Building Tongi House Building Station Road House Building Mill Gate House Building" +
                        "House Building Board Bazar House Building Gazipur House Building" +
                        "Abdullahpur Tongi Abdullahpur Station Road Abdullahpur Mill Gate Abdullahpur" +
                        "Abdullahpur Board Bazar Abdullahpur Gazipur Abdullahpur" +
                        "Tongi Station Road Tongi Mill Gate Tongi" +
                        "Tongi Board Bazar Tongi Gazipur Tongi" +
                        "Station Road Mill Gate Station Road" +
                        "Station Road Board Bazar Station Road Gazipur Station Road" +
                        "Mill Gate Board Bazar Mill Gate Gazipur Mill Gate" +
                        "Board Bazar Gazipur Board Bazar"));




        buses.add(new Bus(R.drawable.logo,"Best Transport",
                "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Khamarbari Mirpur 10 Farmgate Mirpur 10" +
                        "Mirpur 10 Kawran Bazar Mirpur 10 Bangla Motor Mirpur 10 Shahbag Mirpur 10 Motsho Bhobon Mirpur 10 High Court Mirpur 10" +
                        "Mirpur 10 Press Club Mirpur 10 Paltan Mirpur 10 Daynik Bangla Mor Mirpur 10 Motijheel Mirpur 10 Ittefaq Mirpur 10 Sayedabad Mirpur 10" +
                        "Mirpur 10 Jatrabari Mirpur 10" +
                        "Kazipara Shewrapara Kazipara Taltola Kazipara Agargaon Kazipara Khamarbari Kazipara Farmgate Kazipara" +
                        "Kazipara Kawran Bazar Kazipara Bangla Motor Kazipara Shahbag Kazipara Motsho Bhobon Kazipara High Court Kazipara" +
                        "Kazipara Press Club Kazipara Paltan Kazipara Daynik Bangla Mor Kazipara Motijheel Kazipara Ittefaq Kazipara Sayedabad Kazipara" +
                        "Kazipara Jatrabari Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Khamarbari Shewrapara Farmgate Shewrapara" +
                        "Shewrapara Kawran Bazar Shewrapara Bangla Motor Shewrapara Shahbag Shewrapara Motsho Bhobon Shewrapara High Court Shewrapara" +
                        "Shewrapara Press Club Shewrapara Paltan Shewrapara Daynik Bangla Mor Shewrapara Motijheel Shewrapara Ittefaq Shewrapara Sayedabad Shewrapara" +
                        "Shewrapara Jatrabari Shewrapara" +
                        "Taltola Agargaon Taltola Khamarbari Taltola Farmgate Taltola" +
                        "Taltola Kawran Bazar Taltola Bangla Motor Taltola Shahbag Taltola Motsho Bhobon Taltola High Court Taltola" +
                        "Taltola Press Club Taltola Paltan Taltola Daynik Bangla Mor Taltola Motijheel Taltola Ittefaq Taltola Sayedabad Taltola" +
                        "Taltola Jatrabari Taltola" +
                        "Agargaon Khamarbari Agargaon Farmgate Agargaon" +
                        "Agargaon Kawran Bazar Agargaon Bangla Motor Agargaon Shahbag Agargaon Motsho Bhobon Agargaon High Court Agargaon" +
                        "Agargaon Press Club Agargaon Paltan Agargaon Daynik Bangla Mor Agargaon Motijheel Agargaon Ittefaq Agargaon Sayedabad Agargaon" +
                        "Agargaon Jatrabari Agargaon" +
                        "Khamarbari Farmgate Khamarbari" +
                        "Khamarbari Kawran Bazar Khamarbari Bangla Motor Khamarbari Shahbag Khamarbari Motsho Bhobon Khamarbari High Court Khamarbari" +
                        "Khamarbari Press Club Khamarbari Paltan Khamarbari Daynik Bangla Mor Khamarbari Motijheel Khamarbari Ittefaq Khamarbari Sayedabad Khamarbari" +
                        "Khamarbari Jatrabari Khamarbari" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate Shahbag Farmgate Motsho Bhobon Farmgate High Court Farmgate" +
                        "Farmgate Press Club Farmgate Paltan Farmgate Daynik Bangla Mor Farmgate Motijheel Farmgate Ittefaq Farmgate Sayedabad Farmgate" +
                        "Farmgate Jatrabari Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar High Court Kawran Bazar" +
                        "Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar Daynik Bangla Mor Kawran Bazar Motijheel Kawran Bazar Ittefaq Kawran Bazar Sayedabad Kawran Bazar" +
                        "Kawran Bazar Jatrabari Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor High Court Bangla Motor" +
                        "Bangla Motor Press Club Bangla Motor Paltan Bangla Motor Daynik Bangla Mor Bangla Motor Motijheel Bangla Motor Ittefaq Bangla Motor Sayedabad Bangla Motor" +
                        "Bangla Motor Jatrabari Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag" +
                        "Shahbag Press Club Shahbag Paltan Shahbag Daynik Bangla Mor Shahbag Motijheel Shahbag Ittefaq Shahbag Sayedabad Shahbag" +
                        "Shahbag Jatrabari Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon" +
                        "Motsho Bhobon Press Club Motsho Bhobon Paltan Motsho Bhobon Daynik Bangla Mor Motsho Bhobon Motijheel Motsho Bhobon Ittefaq Motsho Bhobon Sayedabad Motsho Bhobon" +
                        "Motsho Bhobon Jatrabari Motsho Bhobon" +
                        "High Court Press Club High Court Paltan High Court Daynik Bangla Mor High Court Motijheel High Court Ittefaq High Court Sayedabad High Court" +
                        "High Court Jatrabari High Court" +
                        "Press Club Paltan Press Club Daynik Bangla Mor Press Club Motijheel Press Club Ittefaq Press Club Sayedabad Press Club" +
                        "Press Club Jatrabari Press Club" +
                        "Paltan Daynik Bangla Mor Paltan Motijheel Paltan Ittefaq Paltan Sayedabad Paltan" +
                        "Paltan Jatrabari Paltan" +
                        "Daynik Bangla Mor Motijheel Daynik Bangla Mor Ittefaq Daynik Bangla Mor Sayedabad Daynik Bangla Mor" +
                        "Daynik Bangla Mor Jatrabari Daynik Bangla Mor" +
                        "Motijheel Ittefaq Motijheel Sayedabad Motijheel" +
                        "Motijheel Jatrabari Motijheel" +
                        "Ittefaq Sayedabad Ittefaq" +
                        "Ittefaq Jatrabari Ittefaq" +
                        "Sayedabad Jatrabari Sayedabad"));





        buses.add(new Bus(R.drawable.logo,"Bhuiyan Paribahan",
                "Japan Garden City Ring Road Japan Garden City Adabor Japan Garden City Shyamoli Japan Garden City Shishu Mela Japan Garden City" +
                        "Japan Garden City Agargaon Japan Garden City Bijoy Sarani Japan Garden City Jahangir Gate Japan Garden City Mohakhali Japan Garden City" +
                        "Japan Garden City Chairman Bari Japan Garden City Shainik Club Japan Garden City Kakoli Japan Garden City Banani Japan Garden City" +
                        "Japan Garden City Staff Road Japan Garden City MES Japan Garden City Shewra Japan Garden City Kuril Bishwa Road Japan Garden City" +
                        "Japan Garden City Khilkhet Japan Garden City Airport Japan Garden City Jasimuddin Japan Garden City Rajlakshmi Japan Garden City" +
                        "Japan Garden City House Building Japan Garden City Abdullahpur Japan Garden City" +
                        "Ring Road Adabor Ring Road Shyamoli Ring Road Shishu Mela Ring Road" +
                        "Ring Road Agargaon Ring Road Bijoy Sarani Ring Road Jahangir Gate Ring Road Mohakhali Ring Road" +
                        "Ring Road Chairman Bari Ring Road Shainik Club Ring Road Kakoli Ring Road Banani Ring Road" +
                        "Ring Road Staff Road Ring Road MES Ring Road Shewra Ring Road Kuril Bishwa Road Ring Road" +
                        "Ring Road Khilkhet Ring Road Airport Ring Road Jasimuddin Ring Road Rajlakshmi Ring Road" +
                        "Ring Road House Building Ring Road Abdullahpur Ring Road" +
                        "Adabor Shyamoli Adabor Shishu Mela Adabor" +
                        "Adabor Agargaon Adabor Bijoy Sarani Adabor Jahangir Gate Adabor Mohakhali Adabor" +
                        "Adabor Chairman Bari Adabor Shainik Club Adabor Kakoli Adabor Banani Adabor" +
                        "Adabor Staff Road Adabor MES Adabor Shewra Adabor Kuril Bishwa Road Adabor" +
                        "Adabor Khilkhet Adabor Airport Adabor Jasimuddin Adabor Rajlakshmi Adabor" +
                        "Adabor House Building Adabor Abdullahpur Adabor" +
                        "Shyamoli Shishu Mela Shyamoli" +
                        "Shyamoli Agargaon Shyamoli Bijoy Sarani Shyamoli Jahangir Gate Shyamoli Mohakhali Shyamoli" +
                        "Shyamoli Chairman Bari Shyamoli Shainik Club Shyamoli Kakoli Shyamoli Banani Shyamoli" +
                        "Shyamoli Staff Road Shyamoli MES Shyamoli Shewra Shyamoli Kuril Bishwa Road Shyamoli" +
                        "Shyamoli Khilkhet Shyamoli Airport Shyamoli Jasimuddin Shyamoli Rajlakshmi Shyamoli" +
                        "Shyamoli House Building Shyamoli Abdullahpur Shyamoli" +
                        "Shishu Mela Agargaon Shishu Mela Bijoy Sarani Shishu Mela Jahangir Gate Shishu Mela Mohakhali Shishu Mela" +
                        "Shishu Mela Chairman Bari Shishu Mela Shainik Club Shishu Mela Kakoli Shishu Mela Banani Shishu Mela" +
                        "Shishu Mela Staff Road Shishu Mela MES Shishu Mela Shewra Shishu Mela Kuril Bishwa Road Shishu Mela" +
                        "Shishu Mela Khilkhet Shishu Mela Airport Shishu Mela Jasimuddin Shishu Mela Rajlakshmi Shishu Mela" +
                        "Shishu Mela House Building Shishu Mela Abdullahpur Shishu Mela" +
                        "Agargaon Bijoy Sarani Agargaon Jahangir Gate Agargaon Mohakhali Agargaon" +
                        "Agargaon Chairman Bari Agargaon Shainik Club Agargaon Kakoli Agargaon Banani Agargaon" +
                        "Agargaon Staff Road Agargaon MES Agargaon Shewra Agargaon Kuril Bishwa Road Agargaon" +
                        "Agargaon Khilkhet Agargaon Airport Agargaon Jasimuddin Agargaon Rajlakshmi Agargaon" +
                        "Agargaon House Building Agargaon Abdullahpur Agargaon" +
                        "Bijoy Sarani Jahangir Gate Bijoy Sarani Mohakhali Bijoy Sarani" +
                        "Bijoy Sarani Chairman Bari Bijoy Sarani Shainik Club Bijoy Sarani Kakoli Bijoy Sarani Banani Bijoy Sarani" +
                        "Bijoy Sarani Staff Road Bijoy Sarani MES Bijoy Sarani Shewra Bijoy Sarani Kuril Bishwa Road Bijoy Sarani" +
                        "Bijoy Sarani Khilkhet Bijoy Sarani Airport Bijoy Sarani Jasimuddin Bijoy Sarani Rajlakshmi Bijoy Sarani" +
                        "Bijoy Sarani House Building Bijoy Sarani Abdullahpur Bijoy Sarani" +
                        "Jahangir Gate Mohakhali Jahangir Gate" +
                        "Jahangir Gate Chairman Bari Jahangir Gate Shainik Club Jahangir Gate Kakoli Jahangir Gate Banani Jahangir Gate" +
                        "Jahangir Gate Staff Road Jahangir Gate MES Jahangir Gate Shewra Jahangir Gate Kuril Bishwa Road Jahangir Gate" +
                        "Jahangir Gate Khilkhet Jahangir Gate Airport Jahangir Gate Jasimuddin Jahangir Gate Rajlakshmi Jahangir Gate" +
                        "Jahangir Gate House Building Jahangir Gate Abdullahpur Jahangir Gate" +
                        "Mohakhali Chairman Bari Mohakhali Shainik Club Mohakhali Kakoli Mohakhali Banani Mohakhali" +
                        "Mohakhali Staff Road Mohakhali MES Mohakhali Shewra Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Mohakhali Khilkhet Mohakhali Airport Mohakhali Jasimuddin Mohakhali Rajlakshmi Mohakhali" +
                        "Mohakhali House Building Mohakhali Abdullahpur Mohakhali" +
                        "Chairman Bari Shainik Club Chairman Bari Kakoli Chairman Bari Banani Chairman Bari" +
                        "Chairman Bari Staff Road Chairman Bari MES Chairman Bari Shewra Chairman Bari Kuril Bishwa Road Chairman Bari" +
                        "Chairman Bari Khilkhet Chairman Bari Airport Chairman Bari Jasimuddin Chairman Bari Rajlakshmi Chairman Bari" +
                        "Chairman Bari House Building Chairman Bari Abdullahpur Chairman Bari" +
                        "Shainik Club Kakoli Shainik Club Banani Shainik Club" +
                        "Shainik Club Staff Road Shainik Club MES Shainik Club Shewra Shainik Club Kuril Bishwa Road Shainik Club" +
                        "Shainik Club Khilkhet Shainik Club Airport Shainik Club Jasimuddin Shainik Club Rajlakshmi Shainik Club" +
                        "Shainik Club House Building Shainik Club Abdullahpur Shainik Club" +
                        "Kakoli Banani Kakoli" +
                        "Kakoli Staff Road Kakoli MES Kakoli Shewra Kakoli Kuril Bishwa Road Kakoli" +
                        "Kakoli Khilkhet Kakoli Airport Kakoli Jasimuddin Kakoli Rajlakshmi Kakoli" +
                        "Kakoli House Building Kakoli Abdullahpur Kakoli" +
                        "Banani Staff Road Banani MES Banani Shewra Banani Kuril Bishwa Road Banani" +
                        "Banani Khilkhet Banani Airport Banani Jasimuddin Banani Rajlakshmi Banani" +
                        "Banani House Building Banani Abdullahpur Banani" +
                        "Staff Road MES Staff Road Shewra Staff Road Kuril Bishwa Road Staff Road" +
                        "Staff Road Khilkhet Staff Road Airport Staff Road Jasimuddin Staff Road Rajlakshmi Staff Road" +
                        "Staff Road House Building Staff Road Abdullahpur Staff Road" +
                        "MES Shewra MES Kuril Bishwa Road MES" +
                        "MES Khilkhet MES Airport MES Jasimuddin MES Rajlakshmi MES" +
                        "MES House Building MES Abdullahpur MES" +
                        "Shewra Kuril Bishwa Road Shewra" +
                        "Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra Rajlakshmi Shewra" +
                        "Shewra House Building Shewra Abdullahpur Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road" +
                        "Kuril Bishwa Road House Building Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet Rajlakshmi Khilkhet" +
                        "Khilkhet House Building Khilkhet Abdullahpur Khilkhet" +
                        "Airport Jasimuddin Airport Rajlakshmi Airport" +
                        "Airport House Building Airport Abdullahpur Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin" +
                        "Jasimuddin House Building Jasimuddin Abdullahpur Jasimuddin" +
                        "Rajlakshmi House Building Rajlakshmi Abdullahpur Rajlakshmi" +
                        "House Building Abdullahpur House Building"));



        buses.add(new Bus(R.drawable.logo,"Bihango Paribahan",
                "Duaripara Pallabi Duaripara Purobi Duaripara Mirpur 11 Duaripara Mirpur 10 Duaripara Kazipara Duaripara Shewrapara Duaripara" +
                        "Duaripara Taltola Duaripara Agargaon Duaripara Khamarbari Duaripara Farmgate Duaripara Kawran Bazar Duaripara Bangla Motor Duaripara" +
                        "Duaripara Shahbag Duaripara Motsho Bhobon Duaripara High Court Duaripara Press Club Duaripara Paltan Duaripara GPO Duaripara" +
                        "Duaripara Golap Shah Mazar Duaripara Naya Bazar Duaripara Ray Shaheb Bazar Duaripara" +
                        "Duaripara Sadarghat Duaripara" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Khamarbari Pallabi Farmgate Pallabi Kawran Bazar Pallabi Bangla Motor Pallabi" +
                        "Pallabi Shahbag Pallabi Motsho Bhobon Pallabi High Court Pallabi Press Club Pallabi Paltan Pallabi GPO Pallabi" +
                        "Pallabi Golap Shah Mazar Pallabi Naya Bazar Pallabi Ray Shaheb Bazar Pallabi" +
                        "Pallabi Sadarghat Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Khamarbari Purobi Farmgate Purobi Kawran Bazar Purobi Bangla Motor Purobi" +
                        "Purobi Shahbag Purobi Motsho Bhobon Purobi High Court Purobi Press Club Purobi Paltan Purobi GPO Purobi" +
                        "Purobi Golap Shah Mazar Purobi Naya Bazar Purobi Ray Shaheb Bazar Purobi" +
                        "Purobi Sadarghat Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Khamarbari Mirpur 11 Farmgate Mirpur 11 Kawran Bazar Mirpur 11 Bangla Motor Mirpur 11" +
                        "Mirpur 11 Shahbag Mirpur 11 Motsho Bhobon Mirpur 11 High Court Mirpur 11 Press Club Mirpur 11 Paltan Mirpur 11 GPO Mirpur 11" +
                        "Mirpur 11 Golap Shah Mazar Mirpur 11 Naya Bazar Mirpur 11 Ray Shaheb Bazar Mirpur 11" +
                        "Mirpur 11 Sadarghat Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Khamarbari Mirpur 10 Farmgate Mirpur 10 Kawran Bazar Mirpur 10 Bangla Motor Mirpur 10" +
                        "Mirpur 10 Shahbag Mirpur 10 Motsho Bhobon Mirpur 10 High Court Mirpur 10 Press Club Mirpur 10 Paltan Mirpur 10 GPO Mirpur 10" +
                        "Mirpur 10 Golap Shah Mazar Mirpur 10 Naya Bazar Mirpur 10 Ray Shaheb Bazar Mirpur 10" +
                        "Mirpur 10 Sadarghat Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Khamarbari Kazipara Farmgate Kazipara Kawran Bazar Kazipara Bangla Motor Kazipara" +
                        "Kazipara Shahbag Kazipara Motsho Bhobon Kazipara High Court Kazipara Press Club Kazipara Paltan Kazipara GPO Kazipara" +
                        "Kazipara Golap Shah Mazar Kazipara Naya Bazar Kazipara Ray Shaheb Bazar Kazipara" +
                        "Kazipara Sadarghat Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Khamarbari Shewrapara Farmgate Shewrapara Kawran Bazar Shewrapara Bangla Motor Shewrapara" +
                        "Shewrapara Shahbag Shewrapara Motsho Bhobon Shewrapara High Court Shewrapara Press Club Shewrapara Paltan Shewrapara GPO Shewrapara" +
                        "Shewrapara Golap Shah Mazar Shewrapara Naya Bazar Shewrapara Ray Shaheb Bazar Shewrapara" +
                        "Shewrapara Sadarghat Shewrapara" +
                        "Taltola Agargaon Taltola Khamarbari Taltola Farmgate Taltola Kawran Bazar Taltola Bangla Motor Taltola" +
                        "Taltola Shahbag Taltola Motsho Bhobon Taltola High Court Taltola Press Club Taltola Paltan Taltola GPO Taltola" +
                        "Taltola Golap Shah Mazar Taltola Naya Bazar Taltola Ray Shaheb Bazar Taltola" +
                        "Taltola Sadarghat Taltola" +
                        "Agargaon Khamarbari Agargaon Farmgate Agargaon Kawran Bazar Agargaon Bangla Motor Agargaon" +
                        "Agargaon Shahbag Agargaon Motsho Bhobon Agargaon High Court Agargaon Press Club Agargaon Paltan Agargaon GPO Agargaon" +
                        "Agargaon Golap Shah Mazar Agargaon Naya Bazar Agargaon Ray Shaheb Bazar Agargaon" +
                        "Agargaon Sadarghat Agargaon" +
                        "Khamarbari Farmgate Khamarbari Kawran Bazar Khamarbari Bangla Motor Khamarbari" +
                        "Khamarbari Shahbag Khamarbari Motsho Bhobon Khamarbari High Court Khamarbari Press Club Khamarbari Paltan Khamarbari GPO Khamarbari" +
                        "Khamarbari Golap Shah Mazar Khamarbari Naya Bazar Khamarbari Ray Shaheb Bazar Khamarbari" +
                        "Khamarbari Sadarghat Khamarbari" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate" +
                        "Farmgate Shahbag Farmgate Motsho Bhobon Farmgate High Court Farmgate Press Club Farmgate Paltan Farmgate GPO Farmgate" +
                        "Farmgate Golap Shah Mazar Farmgate Naya Bazar Farmgate Ray Shaheb Bazar Farmgate" +
                        "Farmgate Sadarghat Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar" +
                        "Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar High Court Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar GPO Kawran Bazar" +
                        "Kawran Bazar Golap Shah Mazar Kawran Bazar Naya Bazar Kawran Bazar Ray Shaheb Bazar Kawran Bazar" +
                        "Kawran Bazar Sadarghat Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor High Court Bangla Motor Press Club Bangla Motor Paltan Bangla Motor GPO Bangla Motor" +
                        "Bangla Motor Golap Shah Mazar Bangla Motor Naya Bazar Bangla Motor Ray Shaheb Bazar Bangla Motor" +
                        "Bangla Motor Sadarghat Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag GPO Shahbag" +
                        "Shahbag Golap Shah Mazar Shahbag Naya Bazar Shahbag Ray Shaheb Bazar Shahbag" +
                        "Shahbag Sadarghat Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon Paltan Motsho Bhobon GPO Motsho Bhobon" +
                        "Motsho Bhobon Golap Shah Mazar Motsho Bhobon Naya Bazar Motsho Bhobon Ray Shaheb Bazar Motsho Bhobon" +
                        "Motsho Bhobon Sadarghat Motsho Bhobon" +
                        "High Court Press Club High Court Paltan High Court GPO High Court" +
                        "High Court Golap Shah Mazar High Court Naya Bazar High Court Ray Shaheb Bazar High Court" +
                        "High Court Sadarghat High Court" +
                        "Press Club Paltan Press Club GPO Press Club" +
                        "Press Club Golap Shah Mazar Press Club Naya Bazar Press Club Ray Shaheb Bazar Press Club" +
                        "Press Club Sadarghat Press Club" +
                        "Paltan GPO Paltan" +
                        "Paltan Golap Shah Mazar Paltan Naya Bazar Paltan Ray Shaheb Bazar Paltan" +
                        "Paltan Sadarghat Paltan" +
                        "GPO Golap Shah Mazar GPO Naya Bazar GPO Ray Shaheb Bazar GPO" +
                        "GPO Sadarghat GPO" +
                        "Golap Shah Mazar Naya Bazar Golap Shah Mazar Ray Shaheb Bazar Golap Shah Mazar" +
                        "Golap Shah Mazar Sadarghat Golap Shah Mazar" +
                        "Naya Bazar Ray Shaheb Bazar Naya Bazar" +
                        "Naya Bazar Sadarghat Naya Bazar" +
                        "Ray Shaheb Bazar Sadarghat Ray Shaheb Bazar"));



        buses.add(new Bus(R.drawable.logo,"Bihango Paribahan 2",
                "Azimpur Nilkhet Azimpur New Market Azimpur Science Lab Azimpur City College Azimpur Kalabagan Azimpur Dhanmondi 32 Azimpur" +
                        "Azimpur Dhanmondi 27 Azimpur Asad Gate Azimpur College Gate Azimpur Shishu Mela Azimpur Shyamoli Azimpur Kallayanpur Azimpur" +
                        "Azimpur Darussalam Azimpur Technical Azimpur Bangla College Azimpur Tolarbag Azimpur Ansar Camp Azimpur Mirpur 1 Azimpur" +
                        "Azimpur Mirpur 2 Azimpur Proshika Mor Azimpur Rupnagar Azimpur" +
                        "Azimpur Duaripara Azimpur" +
                        "Nilkhet New Market Nilkhet Science Lab Nilkhet City College Nilkhet Kalabagan Nilkhet Dhanmondi 32 Nilkhet" +
                        "Nilkhet Dhanmondi 27 Nilkhet Asad Gate Nilkhet College Gate Nilkhet Shishu Mela Nilkhet Shyamoli Nilkhet Kallayanpur Nilkhet" +
                        "Nilkhet Darussalam Nilkhet Technical Nilkhet Bangla College Nilkhet Tolarbag Nilkhet Ansar Camp Nilkhet Mirpur 1 Nilkhet" +
                        "Nilkhet Mirpur 2 Nilkhet Proshika Mor Nilkhet Rupnagar Nilkhet" +
                        "Nilkhet Duaripara Nilkhet" +
                        "New Market Science Lab New Market City College New Market Kalabagan New Market Dhanmondi 32 New Market" +
                        "New Market Dhanmondi 27 New Market Asad Gate New Market College Gate New Market Shishu Mela New Market Shyamoli New Market Kallayanpur New Market" +
                        "New Market Darussalam New Market Technical New Market Bangla College New Market Tolarbag New Market Ansar Camp New Market Mirpur 1 New Market" +
                        "New Market Mirpur 2 New Market Proshika Mor New Market Rupnagar New Market" +
                        "New Market Duaripara New Market" +
                        "Science Lab City College Science Lab Kalabagan Science Lab Dhanmondi 32 Science Lab" +
                        "Science Lab Dhanmondi 27 Science Lab Asad Gate Science Lab College Gate Science Lab Shishu Mela Science Lab Shyamoli Science Lab Kallayanpur Science Lab" +
                        "Science Lab Darussalam Science Lab Technical Science Lab Bangla College Science Lab Tolarbag Science Lab Ansar Camp Science Lab Mirpur 1 Science Lab" +
                        "Science Lab Mirpur 2 Science Lab Proshika Mor Science Lab Rupnagar Science Lab" +
                        "Science Lab Duaripara Science Lab" +
                        "City College Kalabagan City College Dhanmondi 32 City College" +
                        "City College Dhanmondi 27 City College Asad Gate City College College Gate City College Shishu Mela City College Shyamoli City College Kallayanpur City College" +
                        "City College Darussalam City College Technical City College Bangla College City College Tolarbag City College Ansar Camp City College Mirpur 1 City College" +
                        "City College Mirpur 2 City College Proshika Mor City College Rupnagar City College" +
                        "City College Duaripara City College" +
                        "Kalabagan Dhanmondi 32 Kalabagan" +
                        "Kalabagan Dhanmondi 27 Kalabagan Asad Gate Kalabagan College Gate Kalabagan Shishu Mela Kalabagan Shyamoli Kalabagan Kallayanpur Kalabagan" +
                        "Kalabagan Darussalam Kalabagan Technical Kalabagan Bangla College Kalabagan Tolarbag Kalabagan Ansar Camp Kalabagan Mirpur 1 Kalabagan" +
                        "Kalabagan Mirpur 2 Kalabagan Proshika Mor Kalabagan Rupnagar Kalabagan" +
                        "Kalabagan Duaripara Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad Gate Dhanmondi 32 College Gate Dhanmondi 32 Shishu Mela Dhanmondi 32 Shyamoli Dhanmondi 32 Kallayanpur Dhanmondi 32" +
                        "Dhanmondi 32 Darussalam Dhanmondi 32 Technical Dhanmondi 32 Bangla College Dhanmondi 32 Tolarbag Dhanmondi 32 Ansar Camp Dhanmondi 32 Mirpur 1 Dhanmondi 32" +
                        "Dhanmondi 32 Mirpur 2 Dhanmondi 32 Proshika Mor Dhanmondi 32 Rupnagar Dhanmondi 32" +
                        "Dhanmondi 32 Duaripara Dhanmondi 32" +
                        "Dhanmondi 27 Asad Gate Dhanmondi 27 College Gate Dhanmondi 27 Shishu Mela Dhanmondi 27 Shyamoli Dhanmondi 27 Kallayanpur Dhanmondi 27" +
                        "Dhanmondi 27 Darussalam Dhanmondi 27 Technical Dhanmondi 27 Bangla College Dhanmondi 27 Tolarbag Dhanmondi 27 Ansar Camp Dhanmondi 27 Mirpur 1 Dhanmondi 27" +
                        "Dhanmondi 27 Mirpur 2 Dhanmondi 27 Proshika Mor Dhanmondi 27 Rupnagar Dhanmondi 27" +
                        "Dhanmondi 27 Duaripara Dhanmondi 27" +
                        "Asad Gate College Gate Asad Gate Shishu Mela Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate" +
                        "Asad Gate Darussalam Asad Gate Technical Asad Gate Bangla College Asad Gate Tolarbag Asad Gate Ansar Camp Asad Gate Mirpur 1 Asad Gate" +
                        "Asad Gate Mirpur 2 Asad Gate Proshika Mor Asad Gate Rupnagar Asad Gate" +
                        "Asad Gate Duaripara Asad Gate" +
                        "College Gate Shishu Mela College Gate Shyamoli College Gate Kallayanpur College Gate" +
                        "College Gate Darussalam College Gate Technical College Gate Bangla College College Gate Tolarbag College Gate Ansar Camp College Gate Mirpur 1 College Gate" +
                        "College Gate Mirpur 2 College Gate Proshika Mor College Gate Rupnagar College Gate" +
                        "College Gate Duaripara College Gate" +
                        "Shishu Mela Shyamoli Shishu Mela Kallayanpur Shishu Mela" +
                        "Shishu Mela Darussalam Shishu Mela Technical Shishu Mela Bangla College Shishu Mela Tolarbag Shishu Mela Ansar Camp Shishu Mela Mirpur 1 Shishu Mela" +
                        "Shishu Mela Mirpur 2 Shishu Mela Proshika Mor Shishu Mela Rupnagar Shishu Mela" +
                        "Shishu Mela Duaripara Shishu Mela" +
                        "Shyamoli Kallayanpur Shyamoli" +
                        "Shyamoli Darussalam Shyamoli Technical Shyamoli Bangla College Shyamoli Tolarbag Shyamoli Ansar Camp Shyamoli Mirpur 1 Shyamoli" +
                        "Shyamoli Mirpur 2 Shyamoli Proshika Mor Shyamoli Rupnagar Shyamoli" +
                        "Shyamoli Duaripara Shyamoli" +
                        "Kallayanpur Darussalam Kallayanpur Technical Kallayanpur Bangla College Kallayanpur Tolarbag Kallayanpur Ansar Camp Kallayanpur Mirpur 1 Kallayanpur" +
                        "Kallayanpur Mirpur 2 Kallayanpur Proshika Mor Kallayanpur Rupnagar Kallayanpur" +
                        "Kallayanpur Duaripara Kallayanpur" +
                        "Darussalam Technical Darussalam Bangla College Darussalam Tolarbag Darussalam Ansar Camp Darussalam Mirpur 1 Darussalam" +
                        "Darussalam Mirpur 2 Darussalam Proshika Mor Darussalam Rupnagar Darussalam" +
                        "Darussalam Duaripara Darussalam" +
                        "Technical Bangla College Technical Tolarbag Technical Ansar Camp Technical Mirpur 1 Technical" +
                        "Technical Mirpur 2 Technical Proshika Mor Technical Rupnagar Technical" +
                        "Technical Duaripara Technical" +
                        "Bangla College Tolarbag Bangla College Ansar Camp Bangla College Mirpur 1 Bangla College" +
                        "Bangla College Mirpur 2 Bangla College Proshika Mor Bangla College Rupnagar Bangla College" +
                        "Bangla College Duaripara Bangla College" +
                        "Tolarbag Ansar Camp Tolarbag Mirpur 1 Tolarbag" +
                        "Tolarbag Mirpur 2 Tolarbag Proshika Mor Tolarbag Rupnagar Tolarbag" +
                        "Tolarbag Duaripara Tolarbag" +
                        "Ansar Camp Mirpur 1 Ansar Camp" +
                        "Ansar Camp Mirpur 2 Ansar Camp Proshika Mor Ansar Camp Rupnagar Ansar Camp" +
                        "Ansar Camp Duaripara Ansar Camp" +
                        "Mirpur 1 Mirpur 2 Mirpur 1 Proshika Mor Mirpur 1 Rupnagar Mirpur 1" +
                        "Mirpur 1 Duaripara Mirpur 1" +
                        "Mirpur 2 Proshika Mor Mirpur 2 Rupnagar Mirpur 2" +
                        "Mirpur 2 Duaripara Mirpur 2" +
                        "Proshika Mor Rupnagar Proshika Mor" +
                        "Proshika Mor Duaripara Proshika Mor" +
                        "Rupnagar Duaripara Rupnagar"));






        buses.add(new Bus(R.drawable.logo,"Bikalpo Auto Service",
                "Mirpur 12 Pallabi Mirpur 12 Purobi Mirpur 12 Mirpur 11 Mirpur 12 Mirpur 10 Mirpur 12 Kazipara Mirpur 12 Shewrapara Mirpur 12" +
                        "Mirpur 12 Taltola Mirpur 12 Agargaon Mirpur 12 Bijoy Sarani Mirpur 12 Farmgate Mirpur 12 Kawran Bazar Mirpur 12 Bangla Motor Mirpur 12" +
                        "Mirpur 12 Shahbag Mirpur 12 Motsho Bhobon Mirpur 12 High Court Mirpur 12 Press Club Mirpur 12 Paltan Mirpur 12 Gulisthan Mirpur 12" +
                        "Mirpur 12 Motijheel Mirpur 12" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Bijoy Sarani Pallabi Farmgate Pallabi Kawran Bazar Pallabi Bangla Motor Pallabi" +
                        "Pallabi Shahbag Pallabi Motsho Bhobon Pallabi High Court Pallabi Press Club Pallabi Paltan Pallabi Gulisthan Pallabi" +
                        "Pallabi Motijheel Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Bijoy Sarani Purobi Farmgate Purobi Kawran Bazar Purobi Bangla Motor Purobi" +
                        "Purobi Shahbag Purobi Motsho Bhobon Purobi High Court Purobi Press Club Purobi Paltan Purobi Gulisthan Purobi" +
                        "Purobi Motijheel Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Bijoy Sarani Mirpur 11 Farmgate Mirpur 11 Kawran Bazar Mirpur 11 Bangla Motor Mirpur 11" +
                        "Mirpur 11 Shahbag Mirpur 11 Motsho Bhobon Mirpur 11 High Court Mirpur 11 Press Club Mirpur 11 Paltan Mirpur 11 Gulisthan Mirpur 11" +
                        "Mirpur 11 Motijheel Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Bijoy Sarani Mirpur 10 Farmgate Mirpur 10 Kawran Bazar Mirpur 10 Bangla Motor Mirpur 10" +
                        "Mirpur 10 Shahbag Mirpur 10 Motsho Bhobon Mirpur 10 High Court Mirpur 10 Press Club Mirpur 10 Paltan Mirpur 10 Gulisthan Mirpur 10" +
                        "Mirpur 10 Motijheel Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Bijoy Sarani Kazipara Farmgate Kazipara Kawran Bazar Kazipara Bangla Motor Kazipara" +
                        "Kazipara Shahbag Kazipara Motsho Bhobon Kazipara High Court Kazipara Press Club Kazipara Paltan Kazipara Gulisthan Kazipara" +
                        "Kazipara Motijheel Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Bijoy Sarani Shewrapara Farmgate Shewrapara Kawran Bazar Shewrapara Bangla Motor Shewrapara" +
                        "Shewrapara Shahbag Shewrapara Motsho Bhobon Shewrapara High Court Shewrapara Press Club Shewrapara Paltan Shewrapara Gulisthan Shewrapara" +
                        "Shewrapara Motijheel Shewrapara" +
                        "Taltola Agargaon Taltola Bijoy Sarani Taltola Farmgate Taltola Kawran Bazar Taltola Bangla Motor Taltola" +
                        "Taltola Shahbag Taltola Motsho Bhobon Taltola High Court Taltola Press Club Taltola Paltan Taltola Gulisthan Taltola" +
                        "Taltola Motijheel Taltola" +
                        "Agargaon Bijoy Sarani Agargaon Farmgate Agargaon Kawran Bazar Agargaon Bangla Motor Agargaon" +
                        "Agargaon Shahbag Agargaon Motsho Bhobon Agargaon High Court Agargaon Press Club Agargaon Paltan Agargaon Gulisthan Agargaon" +
                        "Agargaon Motijheel Agargaon" +
                        "Bijoy Sarani Farmgate Bijoy Sarani Kawran Bazar Bijoy Sarani Bangla Motor Bijoy Sarani" +
                        "Bijoy Sarani Shahbag Bijoy Sarani Motsho Bhobon Bijoy Sarani High Court Bijoy Sarani Press Club Bijoy Sarani Paltan Bijoy Sarani Gulisthan Bijoy Sarani" +
                        "Bijoy Sarani Motijheel Bijoy Sarani" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate" +
                        "Farmgate Shahbag Farmgate Motsho Bhobon Farmgate High Court Farmgate Press Club Farmgate Paltan Farmgate Gulisthan Farmgate" +
                        "Farmgate Motijheel Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar" +
                        "Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar High Court Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar Gulisthan Kawran Bazar" +
                        "Kawran Bazar Motijheel Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor High Court Bangla Motor Press Club Bangla Motor Paltan Bangla Motor Gulisthan Bangla Motor" +
                        "Bangla Motor Motijheel Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag Gulisthan Shahbag" +
                        "Shahbag Motijheel Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon Paltan Motsho Bhobon Gulisthan Motsho Bhobon" +
                        "Motsho Bhobon Motijheel Motsho Bhobon" +
                        "High Court Press Club High Court Paltan High Court Gulisthan High Court" +
                        "High Court Motijheel High Court" +
                        "Press Club Paltan Press Club Gulisthan Press Club" +
                        "Press Club Motijheel Press Club" +
                        "Paltan Gulisthan Paltan" +
                        "Paltan Motijheel Paltan" +
                        "Gulisthan Motijheel Gulisthan"));




        buses.add(new Bus(R.drawable.logo,"Bikalpo City Super Service",
                "Mirpur 12 Pallabi Mirpur 12 Purobi Mirpur 12 Mirpur 11 Mirpur 12 Mirpur 10 Mirpur 12 Kazipara Mirpur 12 Shewrapara Mirpur 12" +
                        "Mirpur 12 Taltola Mirpur 12 Agargaon Mirpur 12 Khamarbari Mirpur 12 Dhanmondi 27 Mirpur 12 Dhanmondi 32 Mirpur 12 Kalabagan Mirpur 12" +
                        "Mirpur 12 City College Mirpur 12 Science Lab Mirpur 12 New Market Mirpur 12 Nilkhet Mirpur 12 Azimpur Mirpur 12" +
                        "Mirpur 12 Dhakeshwari Mirpur 12" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Khamarbari Pallabi Dhanmondi 27 Pallabi Dhanmondi 32 Pallabi Kalabagan Pallabi" +
                        "Pallabi City College Pallabi Science Lab Pallabi New Market Pallabi Nilkhet Pallabi Azimpur Pallabi" +
                        "Pallabi Dhakeshwari Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Khamarbari Purobi Dhanmondi 27 Purobi Dhanmondi 32 Purobi Kalabagan Purobi" +
                        "Purobi City College Purobi Science Lab Purobi New Market Purobi Nilkhet Purobi Azimpur Purobi" +
                        "Purobi Dhakeshwari Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Khamarbari Mirpur 11 Dhanmondi 27 Mirpur 11 Dhanmondi 32 Mirpur 11 Kalabagan Mirpur 11" +
                        "Mirpur 11 City College Mirpur 11 Science Lab Mirpur 11 New Market Mirpur 11 Nilkhet Mirpur 11 Azimpur Mirpur 11" +
                        "Mirpur 11 Dhakeshwari Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Khamarbari Mirpur 10 Dhanmondi 27 Mirpur 10 Dhanmondi 32 Mirpur 10 Kalabagan Mirpur 10" +
                        "Mirpur 10 City College Mirpur 10 Science Lab Mirpur 10 New Market Mirpur 10 Nilkhet Mirpur 10 Azimpur Mirpur 10" +
                        "Mirpur 10 Dhakeshwari Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Khamarbari Kazipara Dhanmondi 27 Kazipara Dhanmondi 32 Kazipara Kalabagan Kazipara" +
                        "Kazipara City College Kazipara Science Lab Kazipara New Market Kazipara Nilkhet Kazipara Azimpur Kazipara" +
                        "Kazipara Dhakeshwari Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Khamarbari Shewrapara Dhanmondi 27 Shewrapara Dhanmondi 32 Shewrapara Kalabagan Shewrapara" +
                        "Shewrapara City College Shewrapara Science Lab Shewrapara New Market Shewrapara Nilkhet Shewrapara Azimpur Shewrapara" +
                        "Shewrapara Dhakeshwari Shewrapara" +
                        "Taltola Agargaon Taltola Khamarbari Taltola Dhanmondi 27 Taltola Dhanmondi 32 Taltola Kalabagan Taltola" +
                        "Taltola City College Taltola Science Lab Taltola New Market Taltola Nilkhet Taltola Azimpur Taltola" +
                        "Taltola Dhakeshwari Taltola" +
                        "Agargaon Khamarbari Agargaon Dhanmondi 27 Agargaon Dhanmondi 32 Agargaon Kalabagan Agargaon" +
                        "Agargaon City College Agargaon Science Lab Agargaon New Market Agargaon Nilkhet Agargaon Azimpur Agargaon" +
                        "Agargaon Dhakeshwari Agargaon" +
                        "Khamarbari Dhanmondi 27 Khamarbari Dhanmondi 32 Khamarbari Kalabagan Khamarbari" +
                        "Khamarbari City College Khamarbari Science Lab Khamarbari New Market Khamarbari Nilkhet Khamarbari Azimpur Khamarbari" +
                        "Khamarbari Dhakeshwari Khamarbari" +
                        "Dhanmondi 27 Dhanmondi 32 Dhanmondi 27 Kalabagan Dhanmondi 27" +
                        "Dhanmondi 27 City College Dhanmondi 27 Science Lab Dhanmondi 27 New Market Dhanmondi 27 Nilkhet Dhanmondi 27 Azimpur Dhanmondi 27" +
                        "Dhanmondi 27 Dhakeshwari Dhanmondi 27" +
                        "Dhanmondi 32 Kalabagan Dhanmondi 32" +
                        "Dhanmondi 32 City College Dhanmondi 32 Science Lab Dhanmondi 32 New Market Dhanmondi 32 Nilkhet Dhanmondi 32 Azimpur Dhanmondi 32" +
                        "Dhanmondi 32 Dhakeshwari Dhanmondi 32" +
                        "Kalabagan City College Kalabagan Science Lab Kalabagan New Market Kalabagan Nilkhet Kalabagan Azimpur Kalabagan" +
                        "Kalabagan Dhakeshwari Kalabagan" +
                        "City College Science Lab City College New Market City College Nilkhet City College Azimpur City College" +
                        "City College Dhakeshwari City College" +
                        "Science Lab New Market Science Lab Nilkhet Science Lab Azimpur Science Lab" +
                        "Science Lab Dhakeshwari Science Lab" +
                        "New Market Nilkhet New Market Azimpur New Market" +
                        "New Market Dhakeshwari New Market" +
                        "Nilkhet Azimpur Nilkhet" +
                        "Nilkhet Dhakeshwari Nilkhet" +
                        "Azimpur Dhakeshwari Azimpur"));




        buses.add(new Bus(R.drawable.logo,"Bikash Parihaban",
                "Azimpur Nilkhet Azimpur New Market Azimpur Science Lab Azimpur City College Azimpur Kalabagan Azimpur" +
                        "Azimpur Dhanmondi 32 Azimpur Dhanmondi 27 Azimpur Asad gate Azimpur Khamarbari Azimpur" +
                        "Azimpur Farmgate Azimpur Jahangir Gate Azimpur Mohakhali Azimpur Chairman Bari Azimpur" +
                        "Azimpur Shainik Club Azimpur Banani Azimpur Kakoli Azimpur MES Azimpur Shewra Azimpur" +
                        "Azimpur Kuril Bishwa Road Azimpur Khilkhet Azimpur Airport Azimpur Uttara Azimpur " +
                        "Azimpur Jasimuddin Road Azimpur Rajlakhsmi Azimpur House Building Azimpur Andullahpur Azimpur Kamarpara Azimpur" +
                        "Azimpur Dhour Azimpur" +
                        "Nilkhet New Market Nilkhet Science Lab Nilkhet City College Nilkhet Kalabagan Nilkhet" +
                        "Nilkhet Dhanmondi 32 Nilkhet Dhanmondi 27 Nilkhet Asad gate Nilkhet Khamarbari Nilkhet" +
                        "Nilkhet Farmgate Nilkhet Jahangir Gate Nilkhet Mohakhali Nilkhet Chairman Bari Nilkhet" +
                        "Nilkhet Shainik Club Nilkhet Banani Nilkhet Kakoli Nilkhet MES Nilkhet Shewra Nilkhet" +
                        "Nilkhet Kuril Bishwa Road Nilkhet Khilkhet Nilkhet Airport Nilkhet Uttara Nilkhet " +
                        "Nilkhet Jasimuddin Road Nilkhet Rajlakhsmi Nilkhet House Building Nilkhet Andullahpur Nilkhet Kamarpara Nilkhet" +
                        "Nilkhet Dhour Nilkhet" +
                        "New Market Science Lab New Market City College New Market Kalabagan New Market" +
                        "New Market Dhanmondi 32 New Market Dhanmondi 27 New Market Asad gate New Market Khamarbari New Market" +
                        "New Market Farmgate New Market Jahangir Gate New Market Mohakhali New Market Chairman Bari New Market" +
                        "New Market Shainik Club New Market Banani New Market Kakoli New Market MES New Market Shewra New Market" +
                        "New Market Kuril Bishwa Road New Market Khilkhet New Market Airport New Market Uttara New Market " +
                        "New Market Jasimuddin Road New Market Rajlakhsmi New Market House Building New Market Andullahpur New Market Kamarpara New Market" +
                        "New Market Dhour New Market" +
                        "Science Lab City College Science Lab Kalabagan Science Lab" +
                        "Science Lab Dhanmondi 32 Science Lab Dhanmondi 27 Science Lab Asad gate Science Lab Khamarbari Science Lab" +
                        "Science Lab Farmgate Science Lab Jahangir Gate Science Lab Mohakhali Science Lab Chairman Bari Science Lab" +
                        "Science Lab Shainik Club Science Lab Banani Science Lab Kakoli Science Lab MES Science Lab Shewra Science Lab" +
                        "Science Lab Kuril Bishwa Road Science Lab Khilkhet Science Lab Airport Science Lab Uttara Science Lab " +
                        "Science Lab Jasimuddin Road Science Lab Rajlakhsmi Science Lab House Building Science Lab Andullahpur Science Lab Kamarpara Science Lab" +
                        "Science Lab Dhour Science Lab" +
                        "City College Kalabagan City College" +
                        "City College Dhanmondi 32 City College Dhanmondi 27 City College Asad gate City College Khamarbari City College" +
                        "City College Farmgate City College Jahangir Gate City College Mohakhali City College Chairman Bari City College" +
                        "City College Shainik Club City College Banani City College Kakoli City College MES City College Shewra City College" +
                        "City College Kuril Bishwa Road City College Khilkhet City College Airport City College Uttara City College " +
                        "City College Jasimuddin Road City College Rajlakhsmi City College House Building City College Andullahpur City College Kamarpara City College" +
                        "City College Dhour City College" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad gate Kalabagan Khamarbari Kalabagan" +
                        "Kalabagan Farmgate Kalabagan Jahangir Gate Kalabagan Mohakhali Kalabagan Chairman Bari Kalabagan" +
                        "Kalabagan Shainik Club Kalabagan Banani Kalabagan Kakoli Kalabagan MES Kalabagan Shewra Kalabagan" +
                        "Kalabagan Kuril Bishwa Road Kalabagan Khilkhet Kalabagan Airport Kalabagan Uttara Kalabagan " +
                        "Kalabagan Jasimuddin Road Kalabagan Rajlakhsmi Kalabagan House Building Kalabagan Andullahpur Kalabagan Kamarpara Kalabagan" +
                        "Kalabagan Dhour Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad gate Dhanmondi 32 Khamarbari Dhanmondi 32" +
                        "Dhanmondi 32 Farmgate Dhanmondi 32 Jahangir Gate Dhanmondi 32 Mohakhali Dhanmondi 32 Chairman Bari Dhanmondi 32" +
                        "Dhanmondi 32 Shainik Club Dhanmondi 32 Banani Dhanmondi 32 Kakoli Dhanmondi 32 MES Dhanmondi 32 Shewra Dhanmondi 32" +
                        "Dhanmondi 32 Kuril Bishwa Road Dhanmondi 32 Khilkhet Dhanmondi 32 Airport Dhanmondi 32 Uttara Dhanmondi 32 " +
                        "Dhanmondi 32 Jasimuddin Road Dhanmondi 32 Rajlakhsmi Dhanmondi 32 House Building Dhanmondi 32 Andullahpur Dhanmondi 32 Kamarpara Dhanmondi 32" +
                        "Dhanmondi 32 Dhour Dhanmondi 32" +
                        "Dhanmondi 27 Asad gate Dhanmondi 27 Khamarbari Dhanmondi 27" +
                        "Dhanmondi 27 Farmgate Dhanmondi 27 Jahangir Gate Dhanmondi 27 Mohakhali Dhanmondi 27 Chairman Bari Dhanmondi 27" +
                        "Dhanmondi 27 Shainik Club Dhanmondi 27 Banani Dhanmondi 27 Kakoli Dhanmondi 27 MES Dhanmondi 27 Shewra Dhanmondi 27" +
                        "Dhanmondi 27 Kuril Bishwa Road Dhanmondi 27 Khilkhet Dhanmondi 27 Airport Dhanmondi 27 Uttara Dhanmondi 27 " +
                        "Dhanmondi 27 Jasimuddin Road Dhanmondi 27 Rajlakhsmi Dhanmondi 27 House Building Dhanmondi 27 Andullahpur Dhanmondi 27 Kamarpara Dhanmondi 27" +
                        "Dhanmondi 27 Dhour Dhanmondi 27" +
                        "Asad gate Khamarbari Asad gate" +
                        "Asad gate Farmgate Asad gate Jahangir Gate Asad gate Mohakhali Asad gate Chairman Bari Asad gate" +
                        "Asad gate Shainik Club Asad gate Banani Asad gate Kakoli Asad gate MES Asad gate Shewra Asad gate" +
                        "Asad gate Kuril Bishwa Road Asad gate Khilkhet Asad gate Airport Asad gate Uttara Asad gate " +
                        "Asad gate Jasimuddin Road Asad gate Rajlakhsmi Asad gate House Building Asad gate Andullahpur Asad gate Kamarpara Asad gate" +
                        "Asad gate Dhour Asad gate" +
                        "Khamarbari Farmgate Khamarbari Jahangir Gate Khamarbari Mohakhali Khamarbari Chairman Bari Khamarbari" +
                        "Khamarbari Shainik Club Khamarbari Banani Khamarbari Kakoli Khamarbari MES Khamarbari Shewra Khamarbari" +
                        "Khamarbari Kuril Bishwa Road Khamarbari Khilkhet Khamarbari Airport Khamarbari Uttara Khamarbari " +
                        "Khamarbari Jasimuddin Road Khamarbari Rajlakhsmi Khamarbari House Building Khamarbari Andullahpur Khamarbari Kamarpara Khamarbari" +
                        "Khamarbari Dhour Khamarbari" +
                        "Farmgate Jahangir Gate Farmgate Mohakhali Farmgate Chairman Bari Farmgate" +
                        "Farmgate Shainik Club Farmgate Banani Farmgate Kakoli Farmgate MES Farmgate Shewra Farmgate" +
                        "Farmgate Kuril Bishwa Road Farmgate Khilkhet Farmgate Airport Farmgate Uttara Farmgate " +
                        "Farmgate Jasimuddin Road Farmgate Rajlakhsmi Farmgate House Building Farmgate Andullahpur Farmgate Kamarpara Farmgate" +
                        "Farmgate Dhour Farmgate" +
                        "Jahangir Gate Mohakhali Jahangir Gate Chairman Bari Jahangir Gate" +
                        "Jahangir Gate Shainik Club Jahangir Gate Banani Jahangir Gate Kakoli Jahangir Gate MES Jahangir Gate Shewra Jahangir Gate" +
                        "Jahangir Gate Kuril Bishwa Road Jahangir Gate Khilkhet Jahangir Gate Airport Jahangir Gate Uttara Jahangir Gate " +
                        "Jahangir Gate Jasimuddin Road Jahangir Gate Rajlakhsmi Jahangir Gate House Building Jahangir Gate Andullahpur Jahangir Gate Kamarpara Jahangir Gate" +
                        "Jahangir Gate Dhour Jahangir Gate" +
                        "Mohakhali Chairman Bari Mohakhali" +
                        "Mohakhali Shainik Club Mohakhali Banani Mohakhali Kakoli Mohakhali MES Mohakhali Shewra Mohakhali" +
                        "Mohakhali Kuril Bishwa Road Mohakhali Khilkhet Mohakhali Airport Mohakhali Uttara Mohakhali " +
                        "Mohakhali Jasimuddin Road Mohakhali Rajlakhsmi Mohakhali House Building Mohakhali Andullahpur Mohakhali Kamarpara Mohakhali" +
                        "Mohakhali Dhour Mohakhali" +
                        "Chairman Bari Shainik Club Chairman Bari Banani Chairman Bari Kakoli Chairman Bari MES Chairman Bari Shewra Chairman Bari" +
                        "Chairman Bari Kuril Bishwa Road Chairman Bari Khilkhet Chairman Bari Airport Chairman Bari Uttara Chairman Bari " +
                        "Chairman Bari Jasimuddin Road Chairman Bari Rajlakhsmi Chairman Bari House Building Chairman Bari Andullahpur Chairman Bari Kamarpara Chairman Bari" +
                        "Chairman Bari Dhour Chairman Bari" +
                        "Shainik Club Banani Shainik Club Kakoli Shainik Club MES Shainik Club Shewra Shainik Club" +
                        "Shainik Club Kuril Bishwa Road Shainik Club Khilkhet Shainik Club Airport Shainik Club Uttara Shainik Club " +
                        "Shainik Club Jasimuddin Road Shainik Club Rajlakhsmi Shainik Club House Building Shainik Club Andullahpur Shainik Club Kamarpara Shainik Club" +
                        "Shainik Club Dhour Shainik Club" +
                        "Banani Kakoli Banani MES Banani Shewra Banani" +
                        "Banani Kuril Bishwa Road Banani Khilkhet Banani Airport Banani Uttara Banani " +
                        "Banani Jasimuddin Road Banani Rajlakhsmi Banani House Building Banani Andullahpur Banani Kamarpara Banani" +
                        "Banani Dhour Banani" +
                        "Kakoli MES Kakoli Shewra Kakoli" +
                        "Kakoli Kuril Bishwa Road Kakoli Khilkhet Kakoli Airport Kakoli Uttara Kakoli " +
                        "Kakoli Jasimuddin Road Kakoli Rajlakhsmi Kakoli House Building Kakoli Andullahpur Kakoli Kamarpara Kakoli" +
                        "Kakoli Dhour Kakoli" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Uttara Kuril Bishwa Road " +
                        "Kuril Bishwa Road Jasimuddin Road Kuril Bishwa Road Rajlakhsmi Kuril Bishwa Road House Building Kuril Bishwa Road Andullahpur Kuril Bishwa Road Kamarpara Kuril Bishwa Road" +
                        "Kuril Bishwa Road Dhour Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Uttara Khilkhet " +
                        "Khilkhet Jasimuddin Road Khilkhet Rajlakhsmi Khilkhet House Building Khilkhet Andullahpur Khilkhet Kamarpara Khilkhet" +
                        "Khilkhet Dhour Khilkhet" +
                        "Airport Uttara Airport " +
                        "Airport Jasimuddin Road Airport Rajlakhsmi Airport House Building Airport Andullahpur Airport Kamarpara Airport" +
                        "Airport Dhour Airport" +
                        "Uttara Jasimuddin Road Uttara Rajlakhsmi Uttara House Building Uttara Andullahpur Uttara Kamarpara Nilkhet" +
                        "Nilkhet Dhour Nilkhet" +
                        "Jasimuddin Road Rajlakhsmi Jasimuddin Road House Building Jasimuddin Road Andullahpur Jasimuddin Road Kamarpara Jasimuddin Road" +
                        "Jasimuddin Road Dhour Jasimuddin Road" +
                        "Rajlakhsmi House Building Rajlakhsmi Andullahpur Rajlakhsmi Kamarpara Rajlakhsmi" +
                        "Rajlakhsmi Dhour Rajlakhsmi" +
                        "House Building Andullahpur House Building Kamarpara House Building" +
                        "House Building Dhour House Building" +
                        "Andullahpur Kamarpara Andullahpur" +
                        "Andullahpur Dhour Andullahpur" +
                        "Kamarpara Dhour Kamarpara"));





        buses.add(new Bus(R.drawable.logo,"Boishakhi Paripahan",
                "Savar Hemayetpur Savar Gabtoli Savar Technical Savar Kallayanpur Savar" +
                        "Savar Shyamoli Savar Shishu Mela Savar Agargaon Savar Bijoy Sarani Savar Jahangir Gate Savar " +
                        "Savar Mohakhali Savar Wireless Mor Savar Gulshan 1 Savar Badda Savar" +
                        "Savar Shahjadpur Savar Bashtola Savar Natun Bazar Savar" +
                        "Hemayetpur Gabtoli Hemayetpur Technical Hemayetpur Kallayanpur Hemayetpur" +
                        "Hemayetpur Shyamoli Hemayetpur Shishu Mela Hemayetpur Agargaon Hemayetpur Bijoy Sarani Hemayetpur Jahangir Gate Hemayetpur " +
                        "Hemayetpur Mohakhali Hemayetpur Wireless Mor Hemayetpur Gulshan 1 Hemayetpur Badda Hemayetpur" +
                        "Hemayetpur Shahjadpur Hemayetpur Bashtola Hemayetpur Natun Bazar Hemayetpur" +
                        "Gabtoli Technical Gabtoli Kallayanpur Gabtoli" +
                        "Gabtoli Shyamoli Gabtoli Shishu Mela Gabtoli Agargaon Gabtoli Bijoy Sarani Gabtoli Jahangir Gate Gabtoli " +
                        "Gabtoli Mohakhali Gabtoli Wireless Mor Gabtoli Gulshan 1 Gabtoli Badda Gabtoli" +
                        "Gabtoli Shahjadpur Gabtoli Bashtola Gabtoli Natun Bazar Gabtoli" +
                        "Technical Kallayanpur Technical" +
                        "Technical Shyamoli Technical Shishu Mela Technical Agargaon Technical Bijoy Sarani Technical Jahangir Gate Technical " +
                        "Technical Mohakhali Technical Wireless Mor Technical Gulshan 1 Technical Badda Technical" +
                        "Technical Shahjadpur Technical Bashtola Technical Natun Bazar Technical" +
                        "Kallayanpur Shyamoli Kallayanpur Shishu Mela Kallayanpur Agargaon Kallayanpur Bijoy Sarani Kallayanpur Jahangir Gate Kallayanpur " +
                        "Kallayanpur Mohakhali Kallayanpur Wireless Mor Kallayanpur Gulshan 1 Kallayanpur Badda Kallayanpur" +
                        "Kallayanpur Shahjadpur Kallayanpur Bashtola Kallayanpur Natun Bazar Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli Agargaon Shyamoli Bijoy Sarani Shyamoli Jahangir Gate Shyamoli " +
                        "Shyamoli Mohakhali Shyamoli Wireless Mor Shyamoli Gulshan 1 Shyamoli Badda Shyamoli" +
                        "Shyamoli Shahjadpur Shyamoli Bashtola Shyamoli Natun Bazar Shyamoli" +
                        "Shishu Mela Agargaon Shishu Mela Bijoy Sarani Shishu Mela Jahangir Gate Shishu Mela " +
                        "Shishu Mela Mohakhali Shishu Mela Wireless Mor Shishu Mela Gulshan 1 Shishu Mela Badda Shishu Mela" +
                        "Shishu Mela Shahjadpur Shishu Mela Bashtola Shishu Mela Natun Bazar Shishu Mela" +
                        "Agargaon Bijoy Sarani Agargaon Jahangir Gate Agargaon " +
                        "Agargaon Mohakhali Agargaon Wireless Mor Agargaon Gulshan 1 Agargaon Badda Agargaon" +
                        "Agargaon Shahjadpur Agargaon Bashtola Agargaon Natun Bazar Agargaon" +
                        "Bijoy Sarani Jahangir Gate Bijoy Sarani " +
                        "Bijoy Sarani Mohakhali Bijoy Sarani Wireless Mor Bijoy Sarani Gulshan 1 Bijoy Sarani Badda Bijoy Sarani" +
                        "Bijoy Sarani Shahjadpur Bijoy Sarani Bashtola Bijoy Sarani Natun Bazar Bijoy Sarani" +
                        "Jahangir Gate Mohakhali Jahangir Gate Wireless Mor Jahangir Gate Gulshan 1 Jahangir Gate Badda Jahangir Gate" +
                        "Jahangir Gate Shahjadpur Jahangir Gate Bashtola Jahangir Gate Natun Bazar Jahangir Gate" +
                        "Mohakhali Wireless Mor Mohakhali Gulshan 1 Mohakhali Badda Mohakhali" +
                        "Mohakhali Shahjadpur Mohakhali Bashtola Mohakhali Natun Bazar Mohakhali" +
                        "Wireless Mor Gulshan 1 Wireless Mor Badda Wireless Mor" +
                        "Wireless Mor Shahjadpur Wireless Mor Bashtola Wireless Mor Natun Bazar Wireless Mor" +
                        "Gulshan 1 Badda Gulshan 1" +
                        "Gulshan 1 Shahjadpur Gulshan 1 Bashtola Gulshan 1 Natun Bazar Gulshan 1" +
                        "Badda Shahjadpur Badda Bashtola Badda Natun Bazar Badda" +
                        "Shahjadpur Bashtola Shahjadpur Natun Bazar Shahjadpur" +
                        "Bashtola Natun Bazar Bashtola"));


        buses.add(new Bus(R.drawable.logo,"Bondhu Paribahan",
                "Gulisthan GPO Gulisthan Paltan Gulisthan Kakrail Gulisthan Shantinagar Gulisthan Malibagh Gulisthan Mouchak Gulisthan Rampura Gulisthan" +
                        "Gulisthan Merul Gulisthan Madhya Badda Gulisthan Badda Gulisthan Uttar Badda Bazar Gulisthan Shahjadpur Gulisthan Bashtola Gulisthan" +
                        "Gulisthan Natun Bazar Gulisthan" +
                        "GPO Paltan GPO Kakrail GPO Shantinagar GPO Malibagh GPO Mouchak GPO Rampura GPO" +
                        "GPO Merul GPO Madhya Badda GPO Badda GPO Uttar Badda Bazar GPO Shahjadpur GPO Bashtola GPO" +
                        "GPO Natun Bazar GPO" +
                        "Paltan Kakrail Paltan Shantinagar Paltan Malibagh Paltan Mouchak Paltan Rampura Paltan" +
                        "Paltan Merul Paltan Madhya Badda Paltan Badda Paltan Uttar Badda Bazar Paltan Shahjadpur Paltan Bashtola Paltan" +
                        "Paltan Natun Bazar Paltan" +
                        "Kakrail Shantinagar Kakrail Malibagh Kakrail Mouchak Kakrail Rampura Kakrail" +
                        "Kakrail Merul Kakrail Madhya Badda Kakrail Badda Kakrail Uttar Badda Bazar Kakrail Shahjadpur Kakrail Bashtola Kakrail" +
                        "Kakrail Natun Bazar Kakrail" +
                        "Shantinagar Malibagh Shantinagar Mouchak Shantinagar Rampura Shantinagar" +
                        "Shantinagar Merul Shantinagar Madhya Badda Shantinagar Badda Shantinagar Uttar Badda Bazar Shantinagar Shahjadpur Shantinagar Bashtola Shantinagar" +
                        "Shantinagar Natun Bazar Shantinagar" +
                        "Malibagh Mouchak Malibagh Rampura Malibagh" +
                        "Malibagh Merul Malibagh Madhya Badda Malibagh Badda Malibagh Uttar Badda Bazar Malibagh Shahjadpur Malibagh Bashtola Malibagh" +
                        "Malibagh Natun Bazar Malibagh" +
                        "Mouchak Rampura Mouchak" +
                        "Mouchak Merul Mouchak Madhya Badda Mouchak Badda Mouchak Uttar Badda Bazar Mouchak Shahjadpur Mouchak Bashtola Mouchak" +
                        "Mouchak Natun Bazar Mouchak" +
                        "Rampura Merul Rampura Madhya Badda Rampura Badda Rampura Uttar Badda Bazar Rampura Shahjadpur Rampura Bashtola Rampura" +
                        "Rampura Natun Bazar Rampura" +
                        "Merul Madhya Badda Merul Badda Merul Uttar Badda Bazar Merul Shahjadpur Merul Bashtola Merul" +
                        "Merul Natun Bazar Merul" +
                        "Madhya Badda Badda Madhya Badda Uttar Badda Bazar Madhya Badda Shahjadpur Madhya Badda Bashtola Madhya Badda" +
                        "Madhya Badda Natun Bazar Madhya Badda" +
                        "Badda Uttar Badda Bazar Badda Shahjadpur Badda Bashtola Badda" +
                        "Badda Natun Bazar Badda" +
                        "Uttar Badda Bazar Shahjadpur Uttar Badda Bazar Bashtola Uttar Badda Bazar" +
                        "Uttar Badda Bazar Natun Bazar Uttar Badda Bazar" +
                        "Shahjadpur Bashtola Shahjadpur" +
                        "Shahjadpur Natun Bazar Shahjadpur" +
                        "Bashtola Natun Bazar Bashtola"));




        buses.add(new Bus(R.drawable.logo,"Bornomala Paribahan",
                "Azimpur Nilkhet Azimpur New Market Azimpur Science Lab Azimpur City College Azimpur Kalabagan Azimpur Panthapath Azimpur" +
                        "Azimpur Kawran Bazar Azimpur Farmgate Azimpur Bijoy Sarani Azimpur Mohakhali Azimpur Wireless Mor Azimpur Gulshan 1 Azimpur" +
                        "Azimpur Badda Azimpur Madhya Badda Azimpur Merul Azimpur Rampura Azimpur" +
                        "Azimpur Banasree Azimpur" +
                        "Nilkhet New Market Nilkhet Science Lab Nilkhet City College Nilkhet Kalabagan Nilkhet Panthapath Nilkhet" +
                        "Nilkhet Kawran Bazar Nilkhet Farmgate Nilkhet Bijoy Sarani Nilkhet Mohakhali Nilkhet Wireless Mor Nilkhet Gulshan 1 Nilkhet" +
                        "Nilkhet Badda Nilkhet Madhya Badda Nilkhet Merul Nilkhet Rampura Nilkhet" +
                        "Nilkhet Banasree Nilkhet" +
                        "New Market Science Lab New Market City College New Market Kalabagan New Market Panthapath New Market" +
                        "New Market Kawran Bazar New Market Farmgate New Market Bijoy Sarani New Market Mohakhali New Market Wireless Mor New Market Gulshan 1 New Market" +
                        "New Market Badda New Market Madhya Badda New Market Merul New Market Rampura New Market" +
                        "New Market Banasree New Market" +
                        "Science Lab City College Science Lab Kalabagan Science Lab Panthapath Science Lab" +
                        "Science Lab Kawran Bazar Science Lab Farmgate Science Lab Bijoy Sarani Science Lab Mohakhali Science Lab Wireless Mor Science Lab Gulshan 1 Science Lab" +
                        "Science Lab Badda Science Lab Madhya Badda Science Lab Merul Science Lab Rampura Science Lab" +
                        "Science Lab Banasree Science Lab" +
                        "City College Kalabagan City College Panthapath City College" +
                        "City College Kawran Bazar City College Farmgate City College Bijoy Sarani City College Mohakhali City College Wireless Mor City College Gulshan 1 City College" +
                        "City College Badda City College Madhya Badda City College Merul City College Rampura City College" +
                        "City College Banasree City College" +
                        "Kalabagan Panthapath Kalabagan" +
                        "Kalabagan Kawran Bazar Kalabagan Farmgate Kalabagan Bijoy Sarani Kalabagan Mohakhali Kalabagan Wireless Mor Kalabagan Gulshan 1 Kalabagan" +
                        "Kalabagan Badda Kalabagan Madhya Badda Kalabagan Merul Kalabagan Rampura Kalabagan" +
                        "Kalabagan Banasree Kalabagan" +
                        "Panthapath Kawran Bazar Panthapath Farmgate Panthapath Bijoy Sarani Panthapath Mohakhali Panthapath Wireless Mor Panthapath Gulshan 1 Panthapath" +
                        "Panthapath Badda Panthapath Madhya Badda Panthapath Merul Panthapath Rampura Panthapath" +
                        "Panthapath Banasree Panthapath" +
                        "Kawran Bazar Farmgate Kawran Bazar Bijoy Sarani Kawran Bazar Mohakhali Kawran Bazar Wireless Mor Kawran Bazar Gulshan 1 Kawran Bazar" +
                        "Kawran Bazar Badda Kawran Bazar Madhya Badda Kawran Bazar Merul Kawran Bazar Rampura Kawran Bazar" +
                        "Kawran Bazar Banasree Kawran Bazar" +
                        "Farmgate Bijoy Sarani Farmgate Mohakhali Farmgate Wireless Mor Farmgate Gulshan 1 Farmgate" +
                        "Farmgate Badda Farmgate Madhya Badda Farmgate Merul Farmgate Rampura Farmgate" +
                        "Farmgate Banasree Farmgate" +
                        "Bijoy Sarani Mohakhali Bijoy Sarani Wireless Mor Bijoy Sarani Gulshan 1 Bijoy Sarani" +
                        "Bijoy Sarani Badda Bijoy Sarani Madhya Badda Bijoy Sarani Merul Bijoy Sarani Rampura Bijoy Sarani" +
                        "Bijoy Sarani Banasree Bijoy Sarani" +
                        "Mohakhali Wireless Mor Mohakhali Gulshan 1 Mohakhali" +
                        "Mohakhali Badda Mohakhali Madhya Badda Mohakhali Merul Mohakhali Rampura Mohakhali" +
                        "Mohakhali Banasree Mohakhali" +
                        "Wireless Mor Gulshan 1 Wireless Mor" +
                        "Wireless Mor Badda Wireless Mor Madhya Badda Wireless Mor Merul Wireless Mor Rampura Wireless Mor" +
                        "Wireless Mor Banasree Wireless Mor" +
                        "Gulshan 1 Badda Gulshan 1 Madhya Badda Gulshan 1 Merul Gulshan 1 Rampura Gulshan 1" +
                        "Gulshan 1 Banasree Gulshan 1" +
                        "Badda Madhya Badda Badda Merul Badda Rampura Badda" +
                        "Badda Banasree Badda" +
                        "Madhya Badda Merul Madhya Badda Rampura Madhya Badda" +
                        "Madhya Badda Banasree Madhya Badda" +
                        "Merul Rampura Merul" +
                        "Merul Banasree Merul" +
                        "Rampura Banasree Rampura"));



        buses.add(new Bus(R.drawable.logo,"Brothers",
                "Gabtoli Beribadh Gabtoli Rayer Bazar Gabtoli Sikder Medical Gabtoli Hazaribag Gabtoli Nawabganj Gabtoli Kamrangirchar Gabtoli" +
                        "Gabtoli Showari Ghat Gabtoli Mitford Ghat Gabtoli" +
                        "Gabtoli Babu Bazar Gabtoli" +
                        "Beribadh Rayer Bazar Beribadh Sikder Medical Beribadh Hazaribag Beribadh Nawabganj Beribadh Kamrangirchar Beribadh" +
                        "Beribadh Showari Ghat Beribadh Mitford Ghat Beribadh" +
                        "Beribadh Babu Bazar Beribadh" +
                        "Rayer Bazar Sikder Medical Rayer Bazar Hazaribag Rayer Bazar Nawabganj Rayer Bazar Kamrangirchar Rayer Bazar" +
                        "Rayer Bazar Showari Ghat Rayer Bazar Mitford Ghat Rayer Bazar" +
                        "Rayer Bazar Babu Bazar Rayer Bazar" +
                        "Sikder Medical Hazaribag Sikder Medical Nawabganj Sikder Medical Kamrangirchar Sikder Medical" +
                        "Sikder Medical Showari Ghat Sikder Medical Mitford Ghat Sikder Medical" +
                        "Sikder Medical Babu Bazar Sikder Medical" +
                        "Hazaribag Nawabganj Hazaribag Kamrangirchar Hazaribag" +
                        "Hazaribag Showari Ghat Hazaribag Mitford Ghat Hazaribag" +
                        "Hazaribag Babu Bazar Hazaribag" +
                        "Nawabganj Kamrangirchar Nawabganj" +
                        "Nawabganj Showari Ghat Nawabganj Mitford Ghat Nawabganj" +
                        "Nawabganj Babu Bazar Nawabganj" +
                        "Kamrangirchar Showari Ghat Kamrangirchar Mitford Ghat Kamrangirchar" +
                        "Kamrangirchar Babu Bazar Kamrangirchar" +
                        "Showari Ghat Mitford Ghat Showari Ghat" +
                        "Showari Ghat Babu Bazar Showari Ghat" +
                        "Mitford Ghat Babu Bazar Mitford Ghat"));


        buses.add(new Bus(R.drawable.logo,"Cantonment Mini Service",
                "Mirpur 14 Kochukhet Mirpur 14 Mirpur Cantonment Mirpur 14 Shainik Club Mirpur 14 Kakoli Mirpur 14" +
                        "Mirpur 14 Banani Mirpur 14" +
                        "Kochukhet Mirpur Cantonment Kochukhet Shainik Club Kochukhet Kakoli Kochukhet" +
                        "Kochukhet Banani Kochukhet" +
                        "Mirpur Cantonment Shainik Club Mirpur Cantonment Kakoli Mirpur Cantonment" +
                        "Mirpur Cantonment Banani Mirpur Cantonment" +
                        "Shainik Club Kakoli Shainik Club" +
                        "Shainik Club Banani Shainik Club" +
                        "Kakoli Banani Kakoli"));



        buses.add(new Bus(R.drawable.logo,"Champion",
                "Bhashantek Mirpur 14 Bhashantek Mirpur 10 Bhashantek Mirpur 2 Bhashantek Sony Hall Bhashantek Mirpur 1 Bhashantek" +
                        "Bhashantek Ansar Camp Bhashantek Technical Bhashantek" +
                        "Bhashantek Gabtoli Bhashantek" +
                        "Mirpur 14 Mirpur 10 Mirpur 14 Mirpur 2 Mirpur 14 Sony Hall Mirpur 14 Mirpur 1 Mirpur 14" +
                        "Mirpur 14 Ansar Camp Mirpur 14 Technical Mirpur 14" +
                        "Mirpur 14 Gabtoli Mirpur 14" +
                        "Mirpur 10 Mirpur 2 Mirpur 10 Sony Hall Mirpur 10 Mirpur 1 Mirpur 10" +
                        "Mirpur 10Mirpur 10 Ansar Camp Mirpur 10 Technical Mirpur 10" +
                        "Mirpur 10 Gabtoli Mirpur 10" +
                        "Mirpur 2 Sony Hall Mirpur 2 Mirpur 1 Mirpur 2" +
                        "Mirpur 2 Ansar Camp Mirpur 2 Technical Mirpur 2" +
                        "Mirpur 2 Gabtoli Mirpur 2" +
                        "Sony Hall Mirpur 1 Sony Hall" +
                        "Sony Hall Ansar Camp Sony Hall Technical Sony Hall" +
                        "Sony Hall Gabtoli Sony Hall" +
                        "Mirpur 1 Ansar Camp Mirpur 1 Technical Mirpur 1" +
                        "Mirpur 1 Gabtoli Mirpur 1" +
                        "Ansar Camp Technical Ansar Camp" +
                        "Ansar Camp Gabtoli Ansar Camp" +
                        "Technical Gabtoli Technical"));



        buses.add(new Bus(R.drawable.logo,"D Link",
                "Fulbaria Chankhar Pul Fulbaria Bakshi Bazar Fulbaria Azimpur Fulbaria Nilkhet Fulbaria New Market Fulbaria Science Lab Fulbaria" +
                        "Fulbaria City College Fulbaria Kalabagan Fulbaria Dhanmondi 32 Fulbaria Dhanmondi 27 Fulbaria Asad Gate Fulbaria College Gate Fulbaria" +
                        "Fulbaria Shishu Mela Fulbaria Shyamoli Fulbaria Kallayanpur Fulbaria Technical Fulbaria Gabtoli Fulbaria Aminbazar Fulbaria" +
                        "Fulbaria Hemayetpur Fulbaria Savar Fulbaria" +
                        "Fulbaria Dhamrai Fulbaria" +
                        "Chankhar Pul Bakshi Bazar Chankhar Pul Azimpur Chankhar Pul Nilkhet Chankhar Pul New Market Chankhar Pul Science Lab Chankhar Pul" +
                        "Chankhar Pul City College Chankhar Pul Kalabagan Chankhar Pul Dhanmondi 32 Chankhar Pul Dhanmondi 27 Chankhar Pul Asad Gate Chankhar Pul College Gate Chankhar Pul" +
                        "Chankhar Pul Shishu Mela Chankhar Pul Shyamoli Chankhar Pul Kallayanpur Chankhar Pul Technical Chankhar Pul Gabtoli Chankhar Pul Aminbazar Chankhar Pul" +
                        "Chankhar Pul Hemayetpur Chankhar Pul Savar Chankhar Pul" +
                        "Chankhar Pul Dhamrai Chankhar Pul" +
                        "Bakshi Bazar Azimpur Bakshi Bazar Nilkhet Bakshi Bazar New Market Bakshi Bazar Science Lab Bakshi Bazar" +
                        "Bakshi Bazar City College Bakshi Bazar Kalabagan Bakshi Bazar Dhanmondi 32 Bakshi Bazar Dhanmondi 27 Bakshi Bazar Asad Gate Bakshi Bazar College Gate Bakshi Bazar" +
                        "Bakshi Bazar Shishu Mela Bakshi Bazar Shyamoli Bakshi Bazar Kallayanpur Bakshi Bazar Technical Bakshi Bazar Gabtoli Bakshi Bazar Aminbazar Bakshi Bazar" +
                        "Bakshi Bazar Hemayetpur Bakshi Bazar Savar Bakshi Bazar" +
                        "Bakshi Bazar Dhamrai Bakshi Bazar" +
                        "Azimpur Nilkhet Azimpur New Market Azimpur Science Lab Azimpur" +
                        "Azimpur City College Azimpur Kalabagan Azimpur Dhanmondi 32 Azimpur Dhanmondi 27 Azimpur Asad Gate Azimpur College Gate Azimpur" +
                        "Azimpur Shishu Mela Azimpur Shyamoli Azimpur Kallayanpur Azimpur Technical Azimpur Gabtoli Azimpur Aminbazar Azimpur" +
                        "Azimpur Hemayetpur Azimpur Savar Azimpur" +
                        "Azimpur Dhamrai Azimpur" +
                        "Nilkhet New Market Nilkhet Science Lab Nilkhet" +
                        "Nilkhet City College Nilkhet Kalabagan Nilkhet Dhanmondi 32 Nilkhet Dhanmondi 27 Nilkhet Asad Gate Nilkhet College Gate Nilkhet" +
                        "Nilkhet Shishu Mela Nilkhet Shyamoli Nilkhet Kallayanpur Nilkhet Technical Nilkhet Gabtoli Nilkhet Aminbazar Nilkhet" +
                        "Nilkhet Hemayetpur Nilkhet Savar Nilkhet" +
                        "Nilkhet Dhamrai Nilkhet" +
                        "New Market Science Lab New Market" +
                        "New Market City College New Market Kalabagan New Market Dhanmondi 32 New Market Dhanmondi 27 New Market Asad Gate New Market College Gate New Market" +
                        "New Market Shishu Mela New Market Shyamoli New Market Kallayanpur New Market Technical New Market Gabtoli New Market Aminbazar New Market" +
                        "New Market Hemayetpur New Market Savar New Market" +
                        "New Market Dhamrai New Market" +
                        "Science Lab City College Science Lab Kalabagan Science Lab Dhanmondi 32 Science Lab Dhanmondi 27 Science Lab Asad Gate Science Lab College Gate Science Lab" +
                        "Science Lab Shishu Mela Science Lab Shyamoli Science Lab Kallayanpur Science Lab Technical Science Lab Gabtoli Science Lab Aminbazar Science Lab" +
                        "Science Lab Hemayetpur Science Lab Savar Science Lab" +
                        "Science Lab Dhamrai Science Lab" +
                        "City College Kalabagan City College Dhanmondi 32 City College Dhanmondi 27 City College Asad Gate City College College Gate City College" +
                        "City College Shishu Mela City College Shyamoli City College Kallayanpur City College Technical City College Gabtoli City College Aminbazar City College" +
                        "City College Hemayetpur City College Savar City College" +
                        "City College Dhamrai City College" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad Gate Kalabagan College Gate Kalabagan" +
                        "Kalabagan Shishu Mela Kalabagan Shyamoli Kalabagan Kallayanpur Kalabagan Technical Kalabagan Gabtoli Kalabagan Aminbazar Kalabagan" +
                        "Kalabagan Hemayetpur Kalabagan Savar Kalabagan" +
                        "Kalabagan Dhamrai Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad Gate Dhanmondi 32 College Gate Dhanmondi 32" +
                        "Dhanmondi 32 Shishu Mela Dhanmondi 32 Shyamoli Dhanmondi 32 Kallayanpur Dhanmondi 32 Technical Dhanmondi 32 Gabtoli Dhanmondi 32 Aminbazar Dhanmondi 32" +
                        "Dhanmondi 32 Hemayetpur Dhanmondi 32 Savar Dhanmondi 32" +
                        "Dhanmondi 32 Dhamrai Dhanmondi 32" +
                        "Dhanmondi 27 Asad Gate Dhanmondi 27 College Gate Dhanmondi 27" +
                        "Dhanmondi 27 Shishu Mela Dhanmondi 27 Shyamoli Dhanmondi 27 Kallayanpur Dhanmondi 27 Technical Dhanmondi 27 Gabtoli Dhanmondi 27 Aminbazar Dhanmondi 27" +
                        "Dhanmondi 27 Hemayetpur Dhanmondi 27 Savar Dhanmondi 27" +
                        "Dhanmondi 27 Dhamrai Dhanmondi 27" +
                        "Asad Gate College Gate Asad Gate" +
                        "Asad Gate Shishu Mela Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Technical Asad Gate Gabtoli Asad Gate Aminbazar Asad Gate" +
                        "Asad Gate Hemayetpur Asad Gate Savar Asad Gate" +
                        "Asad Gate Dhamrai Asad Gate" +
                        "College Gate Shishu Mela College Gate Shyamoli College Gate Kallayanpur College Gate Technical College Gate Gabtoli College Gate Aminbazar College Gate" +
                        "College Gate Hemayetpur College Gate Savar College Gate" +
                        "College Gate Dhamrai College Gate" +
                        "Shishu Mela Shyamoli Shishu Mela Kallayanpur Shishu Mela Technical Shishu Mela Gabtoli Shishu Mela Aminbazar Shishu Mela" +
                        "Shishu Mela Hemayetpur Shishu Mela Savar Shishu Mela" +
                        "Shishu Mela Dhamrai Shishu Mela" +
                        "Shyamoli Kallayanpur Shyamoli Technical Shyamoli Gabtoli Shyamoli Aminbazar Shyamoli" +
                        "Shyamoli Hemayetpur Shyamoli Savar Shyamoli" +
                        "Shyamoli Dhamrai Shyamoli" +
                        "Kallayanpur Technical Kallayanpur Gabtoli Kallayanpur Aminbazar Kallayanpur" +
                        "Kallayanpur Hemayetpur Kallayanpur Savar Kallayanpur" +
                        "Kallayanpur Dhamrai Kallayanpur" +
                        "Technical Gabtoli Technical Aminbazar Technical" +
                        "Technical Hemayetpur Technical Savar Technical" +
                        "Technical Dhamrai Technical" +
                        "Gabtoli Aminbazar Gabtoli" +
                        "Gabtoli Hemayetpur Gabtoli Savar Gabtoli" +
                        "Gabtoli Dhamrai Gabtoli" +
                        "Aminbazar Hemayetpur Aminbazar Savar Aminbazar" +
                        "Aminbazar Dhamrai Aminbazar" +
                        "Hemayetpur Savar Hemayetpur" +
                        "Hemayetpur Dhamrai Hemayetpur" +
                        "Savar Dhamrai Savar"));


        buses.add(new Bus(R.drawable.logo,"D One Transport",
                "Motijheel Daynik Bangla Mor Motijheel Paltan Motijheel Press Club Motijheel Motsho Bhobon Motijheel Shahbag Motijheel" +
                        "Motijheel Bangla Motor Motijheel Kawran Bazar Motijheel Farmgate Motijheel Asad Gate Motijheel College Gate Motijheel Shyamoli Motijheel" +
                        "Motijheel Kallayanpur Motijheel Technical Motijheel Gabtoli Motijheel Aminbazar Motijheel Nobinagar Motijheel Dhamrai Motijheel" +
                        "Motijheel Kalampur Motijheel" +
                        "Daynik Bangla Mor Paltan Motijheel Press Club Daynik Bangla Mor Motsho Bhobon Daynik Bangla Mor Shahbag Daynik Bangla Mor" +
                        "Daynik Bangla Mor Bangla Motor Daynik Bangla Mor Kawran Bazar Daynik Bangla Mor Farmgate Daynik Bangla Mor Asad Gate Daynik Bangla Mor College Gate Daynik Bangla Mor Shyamoli Daynik Bangla Mor" +
                        "Daynik Bangla Mor Kallayanpur Daynik Bangla Mor Technical Daynik Bangla Mor Gabtoli Daynik Bangla Mor Aminbazar Daynik Bangla Mor Nobinagar Daynik Bangla Mor Dhamrai Daynik Bangla Mor" +
                        "Daynik Bangla Mor Kalampur Daynik Bangla Mor" +
                        "Paltan Press Club Paltan Motsho Bhobon Paltan Shahbag Paltan" +
                        "Paltan Bangla Motor Paltan Kawran Bazar Paltan Farmgate Paltan Asad Gate Paltan College Gate Paltan Shyamoli Paltan" +
                        "Paltan Kallayanpur Paltan Technical Paltan Gabtoli Paltan Aminbazar Paltan Nobinagar Paltan Dhamrai Paltan" +
                        "Paltan Kalampur Paltan" +
                        "Press Club Motsho Bhobon Press Club Shahbag Press Club" +
                        "Press Club Bangla Motor Press Club Kawran Bazar Press Club Farmgate Press Club Asad Gate Press Club College Gate Press Club Shyamoli Press Club" +
                        "Press Club Kallayanpur Press Club Technical Press Club Gabtoli Press Club Aminbazar Press Club Nobinagar Press Club Dhamrai Press Club" +
                        "Press Club Kalampur Press Club" +
                        "Motsho Bhobon Shahbag Motsho Bhobon" +
                        "Motsho Bhobon Bangla Motor Motsho Bhobon Kawran Bazar Motsho Bhobon Farmgate Motsho Bhobon Asad Gate Motsho Bhobon College Gate Motsho Bhobon Shyamoli Motsho Bhobon" +
                        "Motsho Bhobon Kallayanpur Motsho Bhobon Technical Motsho Bhobon Gabtoli Motsho Bhobon Aminbazar Motsho Bhobon Nobinagar Motsho Bhobon Dhamrai Motsho Bhobon" +
                        "Motsho Bhobon Kalampur Motsho Bhobon" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag Farmgate Shahbag Asad Gate Shahbag College Gate Shahbag Shyamoli Shahbag" +
                        "Shahbag Kallayanpur Shahbag Technical Shahbag Gabtoli Shahbag Aminbazar Shahbag Nobinagar Shahbag Dhamrai Shahbag" +
                        "Shahbag Kalampur Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Asad Gate Bangla Motor College Gate Bangla Motor Shyamoli Bangla Motor" +
                        "Bangla Motor Kallayanpur Bangla Motor Technical Bangla Motor Gabtoli Bangla Motor Aminbazar Bangla Motor Nobinagar Bangla Motor Dhamrai Bangla Motor" +
                        "Bangla Motor Kalampur Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Asad Gate Kawran Bazar College Gate Kawran Bazar Shyamoli Kawran Bazar" +
                        "Kawran Bazar Kallayanpur Kawran Bazar Technical Kawran Bazar Gabtoli Kawran Bazar Aminbazar Kawran Bazar Nobinagar Kawran Bazar Dhamrai Kawran Bazar" +
                        "Kawran Bazar Kalampur Kawran Bazar" +
                        "Farmgate Asad Gate Farmgate College Gate Farmgate Shyamoli Farmgate" +
                        "Farmgate Kallayanpur Farmgate Technical Farmgate Gabtoli Farmgate Aminbazar Farmgate Nobinagar Farmgate Dhamrai Farmgate" +
                        "Farmgate Kalampur Farmgate" +
                        "Asad Gate College Gate Asad Gate Shyamoli Asad Gate" +
                        "Asad Gate Kallayanpur Asad Gate Technical Asad Gate Gabtoli Asad Gate Aminbazar Asad Gate Nobinagar Asad Gate Dhamrai Asad Gate" +
                        "Asad Gate Kalampur Asad Gate" +
                        "College Gate Shyamoli College Gate" +
                        "College Gate Kallayanpur College Gate Technical College Gate Gabtoli College Gate Aminbazar College Gate Nobinagar College Gate Dhamrai College Gate" +
                        "College Gate Kalampur College Gate" +
                        "Shyamoli Kallayanpur Shyamoli Technical Shyamoli Gabtoli Shyamoli Aminbazar Shyamoli Nobinagar Shyamoli Dhamrai Shyamoli" +
                        "Shyamoli Kalampur Shyamoli" +
                        "Kallayanpur Technical Kallayanpur Gabtoli Kallayanpur Aminbazar Kallayanpur Nobinagar Kallayanpur Dhamrai Kallayanpur" +
                        "Kallayanpur Kalampur Kallayanpur" +
                        "Technical Gabtoli Technical Aminbazar Technical Nobinagar Technical Dhamrai Technical" +
                        "Technical Kalampur Technical" +
                        "Gabtoli Aminbazar Gabtoli Nobinagar Gabtoli Dhamrai Gabtoli" +
                        "Gabtoli Kalampur Gabtoli" +
                        "Aminbazar Nobinagar Aminbazar Dhamrai Aminbazar" +
                        "Aminbazar Kalampur Aminbazar" +
                        "Nobinagar Dhamrai Nobinagar" +
                        "Nobinagar Kalampur Nobinagar" +
                        "Dhamrai Kalampur Dhamrai"));


        buses.add(new Bus(R.drawable.logo,"Dewan",
                "Azimpur New Market Azimpur Science Lab Azimpur Bata Signal Azimpur Katabon Azimpur Shahbag Azimpur Bangla Motor Azimpur" +
                        "Azimpur Kawran Bazar Azimpur Farmgate Azimpur Jahangir Gate Azimpur Mohakhali Azimpur Wireless Mor Azimpur Gulshan 1 Azimpur" +
                        "Azimpur Badda Azimpur Shahjadpur Azimpur Natun Bazar Azimpur Nadda Azimpur Bashundhara Azimpur Jamuna Future Park Azimpur" +
                        "Azimpur Kuril Bishwa Road Azimpur" +
                        "New Market Science Lab New Market Bata Signal New Market Katabon New Market Shahbag New Market Bangla Motor New Market" +
                        "New Market Kawran Bazar New Market Farmgate New Market Jahangir Gate New Market Mohakhali New Market Wireless Mor New Market Gulshan 1 New Market" +
                        "New Market Badda New Market Shahjadpur New Market Natun Bazar New Market Nadda New Market Bashundhara New Market Jamuna Future Park New Market" +
                        "New Market Kuril Bishwa Road New Market" +
                        "Science Lab Bata Signal Science Lab Katabon Science Lab Shahbag Science Lab Bangla Motor Science Lab" +
                        "Science Lab Kawran Bazar Science Lab Farmgate Science Lab Jahangir Gate Science Lab Mohakhali Science Lab Wireless Mor Science Lab Gulshan 1 Science Lab" +
                        "Science Lab Badda Science Lab Shahjadpur Science Lab Natun Bazar Science Lab Nadda Science Lab Bashundhara Science Lab Jamuna Future Park Science Lab" +
                        "Science Lab Kuril Bishwa Road Science Lab" +
                        "Bata Signal Katabon Bata Signal Shahbag Bata Signal Bangla Motor Bata Signal" +
                        "Bata Signal Kawran Bazar Bata Signal Farmgate Bata Signal Jahangir Gate Bata Signal Mohakhali Bata Signal Wireless Mor Bata Signal Gulshan 1 Bata Signal" +
                        "Bata Signal Badda Bata Signal Shahjadpur Bata Signal Natun Bazar Bata Signal Nadda Bata Signal Bashundhara Bata Signal Jamuna Future Park Bata Signal" +
                        "Bata Signal Kuril Bishwa Road Bata Signal" +
                        "Katabon Shahbag Katabon Bangla Motor Katabon" +
                        "Katabon Kawran Bazar Katabon Farmgate Katabon Jahangir Gate Katabon Mohakhali Katabon Wireless Mor Katabon Gulshan 1 Katabon" +
                        "Katabon Badda Katabon Shahjadpur Katabon Natun Bazar Katabon Nadda Katabon Bashundhara Katabon Jamuna Future Park Katabon" +
                        "Katabon Kuril Bishwa Road Katabon" +
                        "Shahbag Bangla Motor Shahbag" +
                        "Shahbag Kawran Bazar Shahbag Farmgate Shahbag Jahangir Gate Shahbag Mohakhali Shahbag Wireless Mor Shahbag Gulshan 1 Shahbag" +
                        "Shahbag Badda Shahbag Shahjadpur Shahbag Natun Bazar Shahbag Nadda Shahbag Bashundhara Shahbag Jamuna Future Park Shahbag" +
                        "Shahbag Kuril Bishwa Road Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Jahangir Gate Bangla Motor Mohakhali Bangla Motor Wireless Mor Bangla Motor Gulshan 1 Bangla Motor" +
                        "Bangla Motor Badda Bangla Motor Shahjadpur Bangla Motor Natun Bazar Bangla Motor Nadda Bangla Motor Bashundhara Bangla Motor Jamuna Future Park Bangla Motor" +
                        "Bangla Motor Kuril Bishwa Road Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Jahangir Gate Kawran Bazar Mohakhali Kawran Bazar Wireless Mor Kawran Bazar Gulshan 1 Kawran Bazar" +
                        "Kawran Bazar Badda Kawran Bazar Shahjadpur Kawran Bazar Natun Bazar Kawran Bazar Nadda Kawran Bazar Bashundhara Kawran Bazar Jamuna Future Park Kawran Bazar" +
                        "Kawran Bazar Kuril Bishwa Road Kawran Bazar" +
                        "Farmgate Jahangir Gate Farmgate Mohakhali Farmgate Wireless Mor Farmgate Gulshan 1 Farmgate" +
                        "Farmgate Badda Farmgate Shahjadpur Farmgate Natun Bazar Farmgate Nadda Farmgate Bashundhara Farmgate Jamuna Future Park Farmgate" +
                        "Farmgate Kuril Bishwa Road Farmgate" +
                        "Jahangir Gate Mohakhali Jahangir Gate Wireless Mor Jahangir Gate Gulshan 1 Jahangir Gate" +
                        "Jahangir Gate Badda Jahangir Gate Shahjadpur Jahangir Gate Natun Bazar Jahangir Gate Nadda Jahangir Gate Bashundhara Jahangir Gate Jamuna Future Park Jahangir Gate" +
                        "Jahangir Gate Kuril Bishwa Road Jahangir Gate" +
                        "Mohakhali Wireless Mor Mohakhali Gulshan 1 Mohakhali" +
                        "Mohakhali Badda Mohakhali Shahjadpur Mohakhali Natun Bazar Mohakhali Nadda Mohakhali Bashundhara Mohakhali Jamuna Future Park Mohakhali" +
                        "Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Wireless Mor Gulshan 1 Wireless Mor" +
                        "Wireless Mor Badda Wireless Mor Shahjadpur Wireless Mor Natun Bazar Wireless Mor Nadda Wireless Mor Bashundhara Wireless Mor Jamuna Future Park Wireless Mor" +
                        "Wireless Mor Kuril Bishwa Road Wireless Mor" +
                        "Gulshan 1 Badda Gulshan 1 Shahjadpur Gulshan 1 Natun Bazar Gulshan 1 Nadda Gulshan 1 Bashundhara Gulshan 1 Jamuna Future Park Gulshan 1" +
                        "Gulshan 1 Kuril Bishwa Road Gulshan 1" +
                        "Badda Shahjadpur Badda Natun Bazar Badda Nadda Badda Bashundhara Badda Jamuna Future Park Badda" +
                        "Badda Kuril Bishwa Road Badda" +
                        "Shahjadpur Natun Bazar Shahjadpur Nadda Shahjadpur Bashundhara Shahjadpur Jamuna Future Park Shahjadpur" +
                        "Shahjadpur Kuril Bishwa Road Shahjadpur" +
                        "Natun Bazar Nadda Natun Bazar Bashundhara Natun Bazar Jamuna Future Park Natun Bazar" +
                        "Natun Bazar Kuril Bishwa Road Natun Bazar" +
                        "Nadda Bashundhara Nadda Jamuna Future Park Nadda" +
                        "Nadda Kuril Bishwa Road Nadda" +
                        "Bashundhara Jamuna Future Park Bashundhara" +
                        "Bashundhara Kuril Bishwa Road Bashundhara" +
                        "Jamuna Future Park Kuril Bishwa Road Jamuna Future Park"));

        buses.add(new Bus(R.drawable.logo,"Dhaka Paribahan",
                "Motijheel Gulisthan Motijheel GPO Motijheel Paltan Motijheel Press Club Motijheel High Court Motijheel Shahbag Motijheel" +
                        "Motijheel Bangla Motor Motijheel Kawran Bazar Motijheel Farmgate Motijheel Jahangir Gate Motijheel Mohakhali Motijheel" +
                        "Motijheel Chairman Bari Motijheel Kakoli Motijheel Banani Motijheel Staff Road Motijheel Shewra Motijheel Kuril Bishwa Road Motijheel" +
                        "Motijheel Khilkhet Motijheel Airport Motijheel House Building Motijheel Abdullahpur Motijheel" +
                        "Motijheel Tongi Motijheel Board Bazar Motijheel Gazipur Motijheel Shibbari Motijheel" +
                        "Gulisthan GPO Gulisthan Paltan Gulisthan Press Club Gulisthan High Court Gulisthan Shahbag Gulisthan" +
                        "Gulisthan Bangla Motor Gulisthan Kawran Bazar Gulisthan Farmgate Gulisthan Jahangir Gate Gulisthan Mohakhali Gulisthan" +
                        "Gulisthan Chairman Bari Gulisthan Kakoli Gulisthan Banani Gulisthan Staff Road Gulisthan Shewra Gulisthan Kuril Bishwa Road Gulisthan" +
                        "Gulisthan Khilkhet Gulisthan Airport Gulisthan House Building Gulisthan Abdullahpur Gulisthan" +
                        "Gulisthan Tongi Gulisthan Board Bazar Gulisthan Gazipur Gulisthan Shibbari Gulisthan" +
                        "GPO Paltan GPO Press Club GPO High Court GPO Shahbag GPO" +
                        "GPO Bangla Motor GPO Kawran Bazar GPO Farmgate GPO Jahangir Gate GPO Mohakhali GPO" +
                        "GPO Chairman Bari GPO Kakoli GPO Banani GPO Staff Road GPO Shewra GPO Kuril Bishwa Road GPO" +
                        "GPO Khilkhet GPO Airport GPO House Building GPO Abdullahpur GPO" +
                        "GPO Tongi GPO Board Bazar GPO Gazipur GPO Shibbari GPO" +
                        "Paltan Press Club Paltan High Court Paltan Shahbag Paltan" +
                        "Paltan Bangla Motor Paltan Kawran Bazar Paltan Farmgate Paltan Jahangir Gate Paltan Mohakhali Paltan" +
                        "Paltan Chairman Bari Paltan Kakoli Paltan Banani Paltan Staff Road Paltan Shewra Paltan Kuril Bishwa Road Paltan" +
                        "Paltan Khilkhet Paltan Airport Paltan House Building Paltan Abdullahpur Paltan" +
                        "Paltan Tongi Paltan Board Bazar Paltan Gazipur Paltan Shibbari Paltan" +
                        "Press Club High Court Press Club Shahbag Press Club" +
                        "Press Club Bangla Motor Press Club Kawran Bazar Press Club Farmgate Press Club Jahangir Gate Press Club Mohakhali Press Club" +
                        "Press Club Chairman Bari Press Club Kakoli Press Club Banani Press Club Staff Road Press Club Shewra Press Club Kuril Bishwa Road Press Club" +
                        "Press Club Khilkhet Press Club Airport Press Club House Building Press Club Abdullahpur Press Club" +
                        "Press Club Tongi Press Club Board Bazar Press Club Gazipur Press Club Shibbari Press Club" +
                        "High Court Shahbag High Court" +
                        "High Court Bangla Motor High Court Kawran Bazar High Court Farmgate High Court Jahangir Gate High Court Mohakhali High Court" +
                        "High Court Chairman Bari High Court Kakoli High Court Banani High Court Staff Road High Court Shewra High Court Kuril Bishwa Road High Court" +
                        "High Court Khilkhet High Court Airport High Court House Building High Court Abdullahpur High Court" +
                        "High Court Tongi High Court Board Bazar High Court Gazipur High Court Shibbari High Court" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag Farmgate Shahbag Jahangir Gate Shahbag Mohakhali Shahbag" +
                        "Shahbag Chairman Bari Shahbag Kakoli Shahbag Banani Shahbag Staff Road Shahbag Shewra Shahbag Kuril Bishwa Road Shahbag" +
                        "Shahbag Khilkhet Shahbag Airport Shahbag House Building Shahbag Abdullahpur Shahbag" +
                        "Shahbag Tongi Shahbag Board Bazar Shahbag Gazipur Shahbag Shibbari Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Jahangir Gate Bangla Motor Mohakhali Bangla Motor" +
                        "Bangla Motor Chairman Bari Bangla Motor Kakoli Bangla Motor Banani Bangla Motor Staff Road Bangla Motor Shewra Bangla Motor Kuril Bishwa Road Bangla Motor" +
                        "Bangla Motor Khilkhet Bangla Motor Airport Bangla Motor House Building Bangla Motor Abdullahpur Bangla Motor" +
                        "Bangla Motor Tongi Bangla Motor Board Bazar Bangla Motor Gazipur Bangla Motor Shibbari Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Jahangir Gate Kawran Bazar Mohakhali Kawran Bazar" +
                        "Kawran Bazar Chairman Bari Kawran Bazar Kakoli Kawran Bazar Banani Kawran Bazar Staff Road Kawran Bazar Shewra Kawran Bazar Kuril Bishwa Road Kawran Bazar" +
                        "Kawran Bazar Khilkhet Kawran Bazar Airport Kawran Bazar House Building Kawran Bazar Abdullahpur Kawran Bazar" +
                        "Kawran Bazar Tongi Kawran Bazar Board Bazar Kawran Bazar Gazipur Kawran Bazar Shibbari Kawran Bazar" +
                        "Farmgate Jahangir Gate Farmgate Mohakhali Farmgate" +
                        "Farmgate Chairman Bari Farmgate Kakoli Farmgate Banani Farmgate Staff Road Farmgate Shewra Farmgate Kuril Bishwa Road Farmgate" +
                        "Farmgate Khilkhet Farmgate Airport Farmgate House Building Farmgate Abdullahpur Farmgate" +
                        "Farmgate Tongi Farmgate Board Bazar Farmgate Gazipur Farmgate Shibbari Farmgate" +
                        "Jahangir Gate Mohakhali Jahangir Gate" +
                        "Jahangir Gate Chairman Bari Jahangir Gate Kakoli Jahangir Gate Banani Jahangir Gate Staff Road Jahangir Gate Shewra Jahangir Gate Kuril Bishwa Road Jahangir Gate" +
                        "Jahangir Gate Khilkhet Jahangir Gate Airport Jahangir Gate House Building Jahangir Gate Abdullahpur Jahangir Gate" +
                        "Jahangir Gate Tongi Jahangir Gate Board Bazar Jahangir Gate Gazipur Jahangir Gate Shibbari Jahangir Gate" +
                        "Mohakhali Chairman Bari Mohakhali Kakoli Mohakhali Banani Mohakhali Staff Road Mohakhali Shewra Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Mohakhali Khilkhet Mohakhali Airport Mohakhali House Building Mohakhali Abdullahpur Mohakhali" +
                        "Mohakhali Tongi Mohakhali Board Bazar Mohakhali Gazipur Mohakhali Shibbari Mohakhali" +
                        "Chairman Bari Kakoli Chairman Bari Banani Chairman Bari Staff Road Chairman Bari Shewra Chairman Bari Kuril Bishwa Road Chairman Bari" +
                        "Chairman Bari Khilkhet Chairman Bari Airport Chairman Bari House Building Chairman Bari Abdullahpur Chairman Bari" +
                        "Chairman Bari Tongi Chairman Bari Board Bazar Chairman Bari Gazipur Chairman Bari Shibbari Chairman Bari" +
                        "Kakoli Banani Kakoli Staff Road Kakoli Shewra Kakoli Kuril Bishwa Road Kakoli" +
                        "Kakoli Khilkhet Kakoli Airport Kakoli House Building Kakoli Abdullahpur Kakoli" +
                        "Kakoli Tongi Kakoli Board Bazar Kakoli Gazipur Kakoli Shibbari Kakoli" +
                        "Banani Staff Road Banani Shewra Banani Kuril Bishwa Road Banani" +
                        "Banani Khilkhet Banani Airport Banani House Building Banani Abdullahpur Banani" +
                        "Banani Tongi Banani Board Bazar Banani Gazipur Banani Shibbari Banani" +
                        "Staff Road Shewra Staff Road Kuril Bishwa Road Staff Road" +
                        "Staff Road Khilkhet Staff Road Airport Staff Road House Building Staff Road Abdullahpur Staff Road" +
                        "Staff Road Tongi Staff Road Board Bazar Staff Road Gazipur Staff Road Shibbari Staff Road" +
                        "Shewra Kuril Bishwa Road Shewra" +
                        "Shewra Khilkhet Shewra Airport Shewra House Building Shewra Abdullahpur Shewra" +
                        "Shewra Tongi Shewra Board Bazar Shewra Gazipur Shewra Shibbari Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road House Building Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Kuril Bishwa Road Tongi Kuril Bishwa Road Board Bazar Kuril Bishwa Road Gazipur Kuril Bishwa Road Shibbari Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet House Building Khilkhet Abdullahpur Khilkhet" +
                        "Khilkhet Tongi Khilkhet Board Bazar Khilkhet Gazipur Khilkhet Shibbari Khilkhet" +
                        "Airport House Building Airport Abdullahpur Airport" +
                        "Airport Tongi Airport Board Bazar Airport Gazipur Airport Shibbari Airport" +
                        "House Building Abdullahpur House Building" +
                        "House Building Tongi House Building Board Bazar House Building Gazipur House Building Shibbari House Building" +
                        "Abdullahpur Tongi Abdullahpur Board Bazar Abdullahpur Gazipur Abdullahpur Shibbari Abdullahpur" +
                        "Tongi Board Bazar Tongi Gazipur Tongi Shibbari Tongi" +
                        "Board Bazar Gazipur Board Bazar Shibbari Board Bazar" +
                        "Gazipur Shibbari Gazipur"));


        buses.add(new Bus(R.drawable.logo,"Dhakar Chaka",
                "Hatir Jheel Gulshan 1 Hatir Jheel Gulshan 2 Hatir Jheel Natun Bazar Hatir Jheel" +
                        "Gulshan 1 Gulshan 2 Gulshan 1 Natun Bazar Gulshan 1" +
                        "Gulshan 2 Natun Bazar Gulshan 2"));


        buses.add(new Bus(R.drawable.logo,"Dipon",
                "Tajmahal Road Salimullah Road Tajmahal Road Jakir Hossain Road Tajmahal Road Shankar Tajmahal Road Star Kabab Tajmahal Road" +
                        "Tajmahal Road Dhanmondi 15 Tajmahal Road Jigatola Tajmahal Road City College Tajmahal Road Science Lab Tajmahal Road Bata Signal Tajmahal Road" +
                        "Tajmahal Road Katabon Tajmahal Road Shahbag Tajmahal Road Motsho Bhobon Tajmahal Road High Court Tajmahal Road Press Club Tajmahal Road" +
                        "Tajmahal Road Paltan Tajmahal Road Gulisthan Tajmahal Road Motijheel Tajmahal Road" +
                        "Tajmahal Road Arambag Tajmahal Road" +
                        "Salimullah Road Jakir Hossain Road Salimullah Road Shankar Salimullah Road Star Kabab Salimullah Road" +
                        "Salimullah Road Dhanmondi 15 Salimullah Road Jigatola Salimullah Road City College Salimullah Road Science Lab Salimullah Road Bata Signal Salimullah Road" +
                        "Salimullah Road Katabon Salimullah Road Shahbag Salimullah Road Motsho Bhobon Salimullah Road High Court Salimullah Road Press Club Salimullah Road" +
                        "Salimullah Road Paltan Salimullah Road Gulisthan Salimullah Road Motijheel Salimullah Road" +
                        "Salimullah Road Arambag Salimullah Road" +
                        "Jakir Hossain Road Shankar Jakir Hossain Road Star Kabab Jakir Hossain Road" +
                        "Jakir Hossain Road Dhanmondi 15 Jakir Hossain Road Jigatola Jakir Hossain Road City College Jakir Hossain Road Science Lab Jakir Hossain Road Bata Signal Jakir Hossain Road" +
                        "Jakir Hossain Road Katabon Jakir Hossain Road Shahbag Jakir Hossain Road Motsho Bhobon Jakir Hossain Road High Court Jakir Hossain Road Press Club Jakir Hossain Road" +
                        "Jakir Hossain Road Paltan Jakir Hossain Road Gulisthan Jakir Hossain Road Motijheel Jakir Hossain Road" +
                        "Jakir Hossain Road Arambag Jakir Hossain Road" +
                        "Shankar Star Kabab Shankar" +
                        "Shankar Dhanmondi 15 Shankar Jigatola Shankar City College Shankar Science Lab Shankar Bata Signal Shankar" +
                        "Shankar Katabon Shankar Shahbag Shankar Motsho Bhobon Shankar High Court Shankar Press Club Shankar" +
                        "Shankar Paltan Shankar Gulisthan Shankar Motijheel Shankar" +
                        "Shankar Arambag Shankar" +
                        "Dhanmondi 15 Jigatola Dhanmondi 15 City College Dhanmondi 15 Science Lab Dhanmondi 15 Bata Signal Dhanmondi 15" +
                        "Dhanmondi 15 Katabon Dhanmondi 15 Shahbag Dhanmondi 15 Motsho Bhobon Dhanmondi 15 High Court Dhanmondi 15 Press Club Dhanmondi 15" +
                        "Dhanmondi 15 Paltan Dhanmondi 15 Gulisthan Dhanmondi 15 Motijheel Dhanmondi 15" +
                        "Dhanmondi 15 Arambag Dhanmondi 15" +
                        "Jigatola City College Jigatola Science Lab Jigatola Bata Signal Jigatola" +
                        "Jigatola Katabon Jigatola Shahbag Jigatola Motsho Bhobon Jigatola High Court Jigatola Press Club Jigatola" +
                        "Jigatola Paltan Jigatola Gulisthan Jigatola Motijheel Jigatola" +
                        "Jigatola Arambag Jigatola" +
                        "City College Science Lab City College Bata Signal City College" +
                        "City College Katabon City College Shahbag City College Motsho Bhobon City College High Court City College Press Club City College" +
                        "City College Paltan City College Gulisthan City College Motijheel City College" +
                        "City College Arambag City College" +
                        "Science Lab Bata Signal Science Lab" +
                        "Science Lab Katabon Science Lab Shahbag Science Lab Motsho Bhobon Science Lab High Court Science Lab Press Club Science Lab" +
                        "Science Lab Paltan Science Lab Gulisthan Science Lab Motijheel Science Lab" +
                        "Science Lab Arambag Science Lab" +
                        "Bata Signal Katabon Bata Signal Shahbag Bata Signal Motsho Bhobon Bata Signal High Court Bata Signal Press Club Bata Signal" +
                        "Bata Signal Paltan Bata Signal Gulisthan Bata Signal Motijheel Bata Signal" +
                        "Bata Signal Arambag Bata Signal" +
                        "Katabon Shahbag Katabon Motsho Bhobon Katabon High Court Katabon Press Club Katabon" +
                        "Katabon Paltan Katabon Gulisthan Katabon Motijheel Katabon" +
                        "Katabon Arambag Katabon" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag" +
                        "Shahbag Paltan Shahbag Gulisthan Shahbag Motijheel Shahbag" +
                        "Shahbag Arambag Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon" +
                        "Motsho Bhobon Paltan Motsho Bhobon Gulisthan Motsho Bhobon Motijheel Motsho Bhobon" +
                        "Motsho Bhobon Arambag Motsho Bhobon" +
                        "High Court Press Club High Court" +
                        "High Court Paltan High Court Gulisthan High Court Motijheel High Court" +
                        "High Court Arambag High Court" +
                        "Press Club Paltan Press Club Gulisthan Press Club Motijheel Press Club" +
                        "Press Club Arambag Press Club" +
                        "Paltan Gulisthan Paltan Motijheel Paltan" +
                        "Paltan Arambag Paltan" +
                        "Gulisthan Motijheel Gulisthan" +
                        "Gulisthan Arambag Gulisthan" +
                        "Motijheel Arambag Motijheel"));



        buses.add(new Bus(R.drawable.logo,"Dishari Paribahan",
                "Chiriakhana Mirpur 1 Chiriakhana Ansar Camp Chiriakhana Technical Chiriakhana Kallayanpur Chiriakhana Shyamoli Chiriakhana" +
                        "Chiriakhana Shishu Mela Chiriakhana College Gate Chiriakhana Asad Gate Chiriakhana Khamarbari Chiriakhana Farmgate Chiriakhana" +
                        "Chiriakhana Kawran Bazar Chiriakhana Bangla Motor Chiriakhana Shahbag Chiriakhana Motsho Bhobon Chiriakhana High Court Chiriakhana" +
                        "Chiriakhana Press Club Chiriakhana Paltan Chiriakhana GPO Chiriakhana Golap Shah Mazar Chiriakhana Naya Bazar Chiriakhana Babu Bazar Chiriakhana" +
                        "Chiriakhana Keraniganj Chiriakhana" +
                        "Mirpur 1 Ansar Camp Mirpur 1 Technical Mirpur 1 Kallayanpur Mirpur 1 Shyamoli Mirpur 1" +
                        "Mirpur 1 Shishu Mela Mirpur 1 College Gate Mirpur 1 Asad Gate Mirpur 1 Khamarbari Mirpur 1 Farmgate Mirpur 1" +
                        "Mirpur 1 Kawran Bazar Mirpur 1 Bangla Motor Mirpur 1 Shahbag Mirpur 1 Motsho Bhobon Mirpur 1 High Court Mirpur 1" +
                        "Mirpur 1 Press Club Mirpur 1 Paltan Mirpur 1 GPO Mirpur 1 Golap Shah Mazar Mirpur 1 Naya Bazar Mirpur 1 Babu Bazar Mirpur 1" +
                        "Mirpur 1 Keraniganj Mirpur 1" +
                        "Ansar Camp Technical Ansar Camp Kallayanpur Ansar Camp Shyamoli Ansar Camp" +
                        "Ansar Camp Shishu Mela Ansar Camp College Gate Ansar Camp Asad Gate Ansar Camp Khamarbari Ansar Camp Farmgate Ansar Camp" +
                        "Ansar Camp Kawran Bazar Ansar Camp Bangla Motor Ansar Camp Shahbag Ansar Camp Motsho Bhobon Ansar Camp High Court Ansar Camp" +
                        "Ansar Camp Press Club Ansar Camp Paltan Ansar Camp GPO Ansar Camp Golap Shah Mazar Ansar Camp Naya Bazar Ansar Camp Babu Bazar Ansar Camp" +
                        "Ansar Camp Keraniganj Ansar Camp" +
                        "Technical Kallayanpur Technical Shyamoli Technical" +
                        "Technical Shishu Mela Technical College Gate Technical Asad Gate Technical Khamarbari Technical Farmgate Technical" +
                        "Technical Kawran Bazar Technical Bangla Motor Technical Shahbag Technical Motsho Bhobon Technical High Court Technical" +
                        "Technical Press Club Technical Paltan Technical GPO Technical Golap Shah Mazar Technical Naya Bazar Technical Babu Bazar Technical" +
                        "Technical Keraniganj Technical" +
                        "Kallayanpur Shyamoli Kallayanpur" +
                        "Kallayanpur Shishu Mela Kallayanpur College Gate Kallayanpur Asad Gate Kallayanpur Khamarbari Kallayanpur Farmgate Kallayanpur" +
                        "Kallayanpur Kawran Bazar Kallayanpur Bangla Motor Kallayanpur Shahbag Kallayanpur Motsho Bhobon Kallayanpur High Court Kallayanpur" +
                        "Kallayanpur Press Club Kallayanpur Paltan Kallayanpur GPO Kallayanpur Golap Shah Mazar Kallayanpur Naya Bazar Kallayanpur Babu Bazar Kallayanpur" +
                        "Kallayanpur Keraniganj Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli College Gate Shyamoli Asad Gate Shyamoli Khamarbari Shyamoli Farmgate Shyamoli" +
                        "Shyamoli Kawran Bazar Shyamoli Bangla Motor Shyamoli Shahbag Shyamoli Motsho Bhobon Shyamoli High Court Shyamoli" +
                        "Shyamoli Press Club Shyamoli Paltan Shyamoli GPO Shyamoli Golap Shah Mazar Shyamoli Naya Bazar Shyamoli Babu Bazar Shyamoli" +
                        "Shyamoli Keraniganj Shyamoli" +
                        "Shishu Mela College Gate Shishu Mela Asad Gate Shishu Mela Khamarbari Shishu Mela Farmgate Shishu Mela" +
                        "Shishu Mela Kawran Bazar Shishu Mela Bangla Motor Shishu Mela Shahbag Shishu Mela Motsho Bhobon Shishu Mela High Court Shishu Mela" +
                        "Shishu Mela Press Club Shishu Mela Paltan Shishu Mela GPO Shishu Mela Golap Shah Mazar Shishu Mela Naya Bazar Shishu Mela Babu Bazar Shishu Mela" +
                        "Shishu Mela Keraniganj Shishu Mela" +
                        "College Gate Asad Gate College Gate Khamarbari College Gate Farmgate College Gate" +
                        "College Gate Kawran Bazar College Gate Bangla Motor College Gate Shahbag College Gate Motsho Bhobon College Gate High Court College Gate" +
                        "College Gate Press Club College Gate Paltan College Gate GPO College Gate Golap Shah Mazar College Gate Naya Bazar College Gate Babu Bazar College Gate" +
                        "College Gate Keraniganj College Gate" +
                        "Asad Gate Khamarbari Asad Gate Farmgate Asad Gate" +
                        "Asad Gate Kawran Bazar Asad Gate Bangla Motor Asad Gate Shahbag Asad Gate Motsho Bhobon Asad Gate High Court Asad Gate" +
                        "Asad Gate Press Club Asad Gate Paltan Asad Gate GPO Asad Gate Golap Shah Mazar Asad Gate Naya Bazar Asad Gate Babu Bazar Asad Gate" +
                        "Asad Gate Keraniganj Asad Gate" +
                        "Khamarbari Farmgate Khamarbari" +
                        "Khamarbari Kawran Bazar Khamarbari Bangla Motor Khamarbari Shahbag Khamarbari Motsho Bhobon Khamarbari High Court Khamarbari" +
                        "Khamarbari Press Club Khamarbari Paltan Khamarbari GPO Khamarbari Golap Shah Mazar Khamarbari Naya Bazar Khamarbari Babu Bazar Khamarbari" +
                        "Khamarbari Keraniganj Khamarbari" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate Shahbag Farmgate Motsho Bhobon Farmgate High Court Farmgate" +
                        "Farmgate Press Club Farmgate Paltan Farmgate GPO Farmgate Golap Shah Mazar Farmgate Naya Bazar Farmgate Babu Bazar Farmgate" +
                        "Farmgate Keraniganj Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar High Court Kawran Bazar" +
                        "Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar GPO Kawran Bazar Golap Shah Mazar Kawran Bazar Naya Bazar Kawran Bazar Babu Bazar Kawran Bazar" +
                        "Kawran Bazar Keraniganj Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor High Court Bangla Motor" +
                        "Bangla Motor Press Club Bangla Motor Paltan Bangla Motor GPO Bangla Motor Golap Shah Mazar Bangla Motor Naya Bazar Bangla Motor Babu Bazar Bangla Motor" +
                        "Bangla Motor Keraniganj Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag" +
                        "Shahbag Press Club Shahbag Paltan Shahbag GPO Shahbag Golap Shah Mazar Shahbag Naya Bazar Shahbag Babu Bazar Shahbag" +
                        "Shahbag Keraniganj Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon" +
                        "Motsho Bhobon Press Club Motsho Bhobon Paltan Motsho Bhobon GPO Motsho Bhobon Golap Shah Mazar Motsho Bhobon Naya Bazar Motsho Bhobon Babu Bazar Motsho Bhobon" +
                        "Motsho Bhobon Keraniganj Motsho Bhobon" +
                        "High Court Press Club High Court Paltan High Court GPO High Court Golap Shah Mazar High Court Naya Bazar High Court Babu Bazar High Court" +
                        "High Court Keraniganj High Court" +
                        "Press Club Paltan Press Club GPO Press Club Golap Shah Mazar Press Club Naya Bazar Press Club Babu Bazar Press Club" +
                        "Press Club Keraniganj Press Club" +
                        "Paltan GPO Paltan Golap Shah Mazar Paltan Naya Bazar Paltan Babu Bazar Paltan" +
                        "Paltan Keraniganj Paltan" +
                        "GPO Golap Shah Mazar GPO Naya Bazar GPO Babu Bazar GPO" +
                        "GPO Keraniganj GPO" +
                        "Golap Shah Mazar Naya Bazar Golap Shah Mazar Babu Bazar Golap Shah Mazar" +
                        "Golap Shah Mazar Keraniganj Golap Shah Mazar" +
                        "Naya Bazar Babu Bazar Naya Bazar" +
                        "Naya Bazar Keraniganj Naya Bazar" +
                        "Babu Bazar Keraniganj Babu Bazar"));




        buses.add(new Bus(R.drawable.logo,"Druti Paribahan",
                "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Khamarbari Pallabi Dhanmondi 27 Pallabi Dhanmondi 32 Pallabi Kalabagan Pallabi" +
                        "Pallabi City College Pallabi Science Lab Pallabi New Market Pallabi Nilkhet Pallabi Azimpur Pallabi" +
                        "Pallabi Dhakeshwari Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Khamarbari Purobi Dhanmondi 27 Purobi Dhanmondi 32 Purobi Kalabagan Purobi" +
                        "Purobi City College Purobi Science Lab Purobi New Market Purobi Nilkhet Purobi Azimpur Purobi" +
                        "Purobi Dhakeshwari Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Khamarbari Mirpur 11 Dhanmondi 27 Mirpur 11 Dhanmondi 32 Mirpur 11 Kalabagan Mirpur 11" +
                        "Mirpur 11 City College Mirpur 11 Science Lab Mirpur 11 New Market Mirpur 11 Nilkhet Mirpur 11 Azimpur Mirpur 11" +
                        "Mirpur 11 Dhakeshwari Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Khamarbari Mirpur 10 Dhanmondi 27 Mirpur 10 Dhanmondi 32 Mirpur 10 Kalabagan Mirpur 10" +
                        "Mirpur 10 City College Mirpur 10 Science Lab Mirpur 10 New Market Mirpur 10 Nilkhet Mirpur 10 Azimpur Mirpur 10" +
                        "Mirpur 10 Dhakeshwari Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Khamarbari Kazipara Dhanmondi 27 Kazipara Dhanmondi 32 Kazipara Kalabagan Kazipara" +
                        "Kazipara City College Kazipara Science Lab Kazipara New Market Kazipara Nilkhet Kazipara Azimpur Kazipara" +
                        "Kazipara Dhakeshwari Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Khamarbari Shewrapara Dhanmondi 27 Shewrapara Dhanmondi 32 Shewrapara Kalabagan Shewrapara" +
                        "Shewrapara City College Shewrapara Science Lab Shewrapara New Market Shewrapara Nilkhet Shewrapara Azimpur Shewrapara" +
                        "Shewrapara Dhakeshwari Shewrapara" +
                        "Taltola Agargaon Taltola Khamarbari Taltola Dhanmondi 27 Taltola Dhanmondi 32 Taltola Kalabagan Taltola" +
                        "Taltola City College Taltola Science Lab Taltola New Market Taltola Nilkhet Taltola Azimpur Taltola" +
                        "Taltola Dhakeshwari Taltola" +
                        "Agargaon Khamarbari Agargaon Dhanmondi 27 Agargaon Dhanmondi 32 Agargaon Kalabagan Agargaon" +
                        "Agargaon City College Agargaon Science Lab Agargaon New Market Agargaon Nilkhet Agargaon Azimpur Agargaon" +
                        "Agargaon Dhakeshwari Agargaon" +
                        "Khamarbari Dhanmondi 27 Khamarbari Dhanmondi 32 Khamarbari Kalabagan Khamarbari" +
                        "Khamarbari City College Khamarbari Science Lab Khamarbari New Market Khamarbari Nilkhet Khamarbari Azimpur Khamarbari" +
                        "Khamarbari Dhakeshwari Khamarbari" +
                        "Dhanmondi 27 Dhanmondi 32 Dhanmondi 27 Kalabagan Dhanmondi 27" +
                        "Dhanmondi 27 City College Dhanmondi 27 Science Lab Dhanmondi 27 New Market Dhanmondi 27 Nilkhet Dhanmondi 27 Azimpur Dhanmondi 27" +
                        "Dhanmondi 27 Dhakeshwari Dhanmondi 27" +
                        "Dhanmondi 32 Kalabagan Dhanmondi 32" +
                        "Dhanmondi 32 City College Dhanmondi 32 Science Lab Dhanmondi 32 New Market Dhanmondi 32 Nilkhet Dhanmondi 32 Azimpur Dhanmondi 32" +
                        "Dhanmondi 32 Dhakeshwari Dhanmondi 32" +
                        "Kalabagan City College Kalabagan Science Lab Kalabagan New Market Kalabagan Nilkhet Kalabagan Azimpur Kalabagan" +
                        "Kalabagan Dhakeshwari Kalabagan" +
                        "City College Science Lab City College New Market City College Nilkhet City College Azimpur City College" +
                        "City College Dhakeshwari City College" +
                        "Science Lab New Market Science Lab Nilkhet Science Lab Azimpur Science Lab" +
                        "Science Lab Dhakeshwari Science Lab" +
                        "New Market Nilkhet New Market Azimpur New Market" +
                        "New Market Dhakeshwari New Market" +
                        "Nilkhet Azimpur Nilkhet" +
                        "Nilkhet Dhakeshwari Nilkhet" +
                        "Azimpur Dhakeshwari Azimpur"));



        buses.add(new Bus(R.drawable.logo,"ETC Transport",
                "Golap Shah Mazar GPO Golap Shah Mazar Paltan Golap Shah Mazar Press Club Golap Shah Mazar High Court Golap Shah Mazar Motsho Bhobon Golap Shah Mazar" +
                        "Golap Shah Mazar Shahbag Golap Shah Mazar Bangla Motor Golap Shah Mazar Kawran Bazar Golap Shah Mazar Farmgate Golap Shah Mazar Khamarbari Golap Shah Mazar" +
                        "Golap Shah Mazar Agargaon Golap Shah Mazar Taltola Golap Shah Mazar Shewrapara Golap Shah Mazar Kazipara Golap Shah Mazar Mirpur 10 Golap Shah Mazar" +
                        "Golap Shah Mazar Mirpur 11 Golap Shah Mazar Purobi Golap Shah Mazar Pallabi Golap Shah Mazar" +
                        "Golap Shah Mazar Mirpur 12 Golap Shah Mazar" +
                        "GPO Paltan GPO Press Club GPO High Court GPO Motsho Bhobon GPO" +
                        "GPO Shahbag GPO Bangla Motor GPO Kawran Bazar GPO Farmgate GPO Khamarbari GPO" +
                        "GPO Agargaon GPO Taltola GPO Shewrapara GPO Kazipara GPO Mirpur 10 GPO" +
                        "GPO Mirpur 11 GPO Purobi GPO Pallabi GPO" +
                        "GPO Mirpur 12 GPO" +
                        "Paltan Press Club Paltan High Court Paltan Motsho Bhobon Paltan" +
                        "Paltan Shahbag Paltan Bangla Motor Paltan Kawran Bazar Paltan Farmgate Paltan Khamarbari Paltan" +
                        "Paltan Agargaon Paltan Taltola Paltan Shewrapara Paltan Kazipara Paltan Mirpur 10 Paltan" +
                        "Paltan Mirpur 11 Paltan Purobi Paltan Pallabi Paltan" +
                        "Paltan Mirpur 12 Paltan" +
                        "Press Club High Court Press Club Motsho Bhobon Press Club" +
                        "Press Club Shahbag Press Club Bangla Motor Press Club Kawran Bazar Press Club Farmgate Press Club Khamarbari Press Club" +
                        "Press Club Agargaon Press Club Taltola Press Club Shewrapara Press Club Kazipara Press Club Mirpur 10 Press Club" +
                        "Press Club Mirpur 11 Press Club Purobi Press Club Pallabi Press Club" +
                        "Press Club Mirpur 12 Press Club" +
                        "High Court Motsho Bhobon High Court" +
                        "High Court Shahbag High Court Bangla Motor High Court Kawran Bazar High Court Farmgate High Court Khamarbari High Court" +
                        "High Court Agargaon High Court Taltola High Court Shewrapara High Court Kazipara High Court Mirpur 10 High Court" +
                        "High Court Mirpur 11 High Court Purobi High Court Pallabi High Court" +
                        "High Court Mirpur 12 High Court" +
                        "Motsho Bhobon Shahbag Motsho Bhobon Bangla Motor Motsho Bhobon Kawran Bazar Motsho Bhobon Farmgate Motsho Bhobon Khamarbari Motsho Bhobon" +
                        "Motsho Bhobon Agargaon Motsho Bhobon Taltola Motsho Bhobon Shewrapara Motsho Bhobon Kazipara Motsho Bhobon Mirpur 10 Motsho Bhobon" +
                        "Motsho Bhobon Mirpur 11 Motsho Bhobon Purobi Motsho Bhobon Pallabi Motsho Bhobon" +
                        "Motsho Bhobon Mirpur 12 Motsho Bhobon" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag Farmgate Shahbag Khamarbari Shahbag" +
                        "Shahbag Agargaon Shahbag Taltola Shahbag Shewrapara Shahbag Kazipara Shahbag Mirpur 10 Shahbag" +
                        "Shahbag Mirpur 11 Shahbag Purobi Shahbag Pallabi Shahbag" +
                        "Shahbag Mirpur 12 Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Khamarbari Bangla Motor" +
                        "Bangla Motor Agargaon Bangla Motor Taltola Bangla Motor Shewrapara Bangla Motor Kazipara Bangla Motor Mirpur 10 Bangla Motor" +
                        "Bangla Motor Mirpur 11 Bangla Motor Purobi Bangla Motor Pallabi Bangla Motor" +
                        "Bangla Motor Mirpur 12 Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Khamarbari Kawran Bazar" +
                        "Kawran Bazar Agargaon Kawran Bazar Taltola Kawran Bazar Shewrapara Kawran Bazar Kazipara Kawran Bazar Mirpur 10 Kawran Bazar" +
                        "Kawran Bazar Mirpur 11 Kawran Bazar Purobi Kawran Bazar Pallabi Kawran Bazar" +
                        "Kawran Bazar Mirpur 12 Kawran Bazar" +
                        "Farmgate Khamarbari Farmgate" +
                        "Farmgate Agargaon Farmgate Taltola Farmgate Shewrapara Farmgate Kazipara Farmgate Mirpur 10 Farmgate" +
                        "Farmgate Mirpur 11 Farmgate Purobi Farmgate Pallabi Farmgate" +
                        "Farmgate Mirpur 12 Farmgate" +
                        "Khamarbari Agargaon Khamarbari Taltola Khamarbari Shewrapara Khamarbari Kazipara Khamarbari Mirpur 10 Khamarbari" +
                        "Khamarbari Mirpur 11 Khamarbari Purobi Khamarbari Pallabi Khamarbari" +
                        "Khamarbari Mirpur 12 Khamarbari" +
                        "Agargaon Taltola Agargaon Shewrapara Agargaon Kazipara Agargaon Mirpur 10 Agargaon" +
                        "Agargaon Mirpur 11 Agargaon Purobi Agargaon Pallabi Agargaon" +
                        "Agargaon Mirpur 12 Agargaon" +
                        "Taltola Shewrapara Taltola Kazipara Taltola Mirpur 10 Taltola" +
                        "Taltola Mirpur 11 Taltola Purobi Taltola Pallabi Taltola" +
                        "Taltola Mirpur 12 Taltola" +
                        "Shewrapara Kazipara Shewrapara Mirpur 10 Shewrapara" +
                        "Shewrapara Mirpur 11 Shewrapara Purobi Shewrapara Pallabi Shewrapara" +
                        "Shewrapara Mirpur 12 Shewrapara" +
                        "Kazipara Mirpur 10 Kazipara" +
                        "Kazipara Mirpur 11 Kazipara Purobi Kazipara Pallabi Kazipara" +
                        "Kazipara Mirpur 12 Kazipara" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Pallabi Mirpur 10" +
                        "Mirpur 10 Mirpur 12 Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Pallabi Mirpur 11" +
                        "Mirpur 11 Mirpur 12 Mirpur 11" +
                        "Purobi Pallabi Purobi" +
                        "Purobi Mirpur 12 Purobi" +
                        "Pallabi Mirpur 12 Pallabi"));



        buses.add(new Bus(R.drawable.logo,"Everest Paribahan",
                "Chiriakhana Mirpur 1 Chiriakhana Ansar Camp Chiriakhana Technical Chiriakhana Kallayanpur Chiriakhana Shyamoli Chiriakhana" +
                        "Chiriakhana Shishu Mela Chiriakhana College Gate Chiriakhana Asad Gate Chiriakhana Khamarbari Chiriakhana Farmgate Chiriakhana" +
                        "Chiriakhana Kawran Bazar Chiriakhana Bangla Motor Chiriakhana Shahbag Chiriakhana Motsho Bhobon Chiriakhana High Court Chiriakhana" +
                        "Chiriakhana Press Club Chiriakhana Paltan Chiriakhana GPO Chiriakhana Golap Shah Mazar Chiriakhana Naya Bazar Chiriakhana Babu Bazar Chiriakhana" +
                        "Chiriakhana Keraniganj Chiriakhana" +
                        "Mirpur 1 Ansar Camp Mirpur 1 Technical Mirpur 1 Kallayanpur Mirpur 1 Shyamoli Mirpur 1" +
                        "Mirpur 1 Shishu Mela Mirpur 1 College Gate Mirpur 1 Asad Gate Mirpur 1 Khamarbari Mirpur 1 Farmgate Mirpur 1" +
                        "Mirpur 1 Kawran Bazar Mirpur 1 Bangla Motor Mirpur 1 Shahbag Mirpur 1 Motsho Bhobon Mirpur 1 High Court Mirpur 1" +
                        "Mirpur 1 Press Club Mirpur 1 Paltan Mirpur 1 GPO Mirpur 1 Golap Shah Mazar Mirpur 1 Naya Bazar Mirpur 1 Babu Bazar Mirpur 1" +
                        "Mirpur 1 Keraniganj Mirpur 1" +
                        "Ansar Camp Technical Ansar Camp Kallayanpur Ansar Camp Shyamoli Ansar Camp" +
                        "Ansar Camp Shishu Mela Ansar Camp College Gate Ansar Camp Asad Gate Ansar Camp Khamarbari Ansar Camp Farmgate Ansar Camp" +
                        "Ansar Camp Kawran Bazar Ansar Camp Bangla Motor Ansar Camp Shahbag Ansar Camp Motsho Bhobon Ansar Camp High Court Ansar Camp" +
                        "Ansar Camp Press Club Ansar Camp Paltan Ansar Camp GPO Ansar Camp Golap Shah Mazar Ansar Camp Naya Bazar Ansar Camp Babu Bazar Ansar Camp" +
                        "Ansar Camp Keraniganj Ansar Camp" +
                        "Technical Kallayanpur Technical Shyamoli Technical" +
                        "Technical Shishu Mela Technical College Gate Technical Asad Gate Technical Khamarbari Technical Farmgate Technical" +
                        "Technical Kawran Bazar Technical Bangla Motor Technical Shahbag Technical Motsho Bhobon Technical High Court Technical" +
                        "Technical Press Club Technical Paltan Technical GPO Technical Golap Shah Mazar Technical Naya Bazar Technical Babu Bazar Technical" +
                        "Technical Keraniganj Technical" +
                        "Kallayanpur Shyamoli Kallayanpur" +
                        "Kallayanpur Shishu Mela Kallayanpur College Gate Kallayanpur Asad Gate Kallayanpur Khamarbari Kallayanpur Farmgate Kallayanpur" +
                        "Kallayanpur Kawran Bazar Kallayanpur Bangla Motor Kallayanpur Shahbag Kallayanpur Motsho Bhobon Kallayanpur High Court Kallayanpur" +
                        "Kallayanpur Press Club Kallayanpur Paltan Kallayanpur GPO Kallayanpur Golap Shah Mazar Kallayanpur Naya Bazar Kallayanpur Babu Bazar Kallayanpur" +
                        "Kallayanpur Keraniganj Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli College Gate Shyamoli Asad Gate Shyamoli Khamarbari Shyamoli Farmgate Shyamoli" +
                        "Shyamoli Kawran Bazar Shyamoli Bangla Motor Shyamoli Shahbag Shyamoli Motsho Bhobon Shyamoli High Court Shyamoli" +
                        "Shyamoli Press Club Shyamoli Paltan Shyamoli GPO Shyamoli Golap Shah Mazar Shyamoli Naya Bazar Shyamoli Babu Bazar Shyamoli" +
                        "Shyamoli Keraniganj Shyamoli" +
                        "Shishu Mela College Gate Shishu Mela Asad Gate Shishu Mela Khamarbari Shishu Mela Farmgate Shishu Mela" +
                        "Shishu Mela Kawran Bazar Shishu Mela Bangla Motor Shishu Mela Shahbag Shishu Mela Motsho Bhobon Shishu Mela High Court Shishu Mela" +
                        "Shishu Mela Press Club Shishu Mela Paltan Shishu Mela GPO Shishu Mela Golap Shah Mazar Shishu Mela Naya Bazar Shishu Mela Babu Bazar Shishu Mela" +
                        "Shishu Mela Keraniganj Shishu Mela" +
                        "College Gate Asad Gate College Gate Khamarbari College Gate Farmgate College Gate" +
                        "College Gate Kawran Bazar College Gate Bangla Motor College Gate Shahbag College Gate Motsho Bhobon College Gate High Court College Gate" +
                        "College Gate Press Club College Gate Paltan College Gate GPO College Gate Golap Shah Mazar College Gate Naya Bazar College Gate Babu Bazar College Gate" +
                        "College Gate Keraniganj College Gate" +
                        "Asad Gate Khamarbari Asad Gate Farmgate Asad Gate" +
                        "Asad Gate Kawran Bazar Asad Gate Bangla Motor Asad Gate Shahbag Asad Gate Motsho Bhobon Asad Gate High Court Asad Gate" +
                        "Asad Gate Press Club Asad Gate Paltan Asad Gate GPO Asad Gate Golap Shah Mazar Asad Gate Naya Bazar Asad Gate Babu Bazar Asad Gate" +
                        "Asad Gate Keraniganj Asad Gate" +
                        "Khamarbari Farmgate Khamarbari" +
                        "Khamarbari Kawran Bazar Khamarbari Bangla Motor Khamarbari Shahbag Khamarbari Motsho Bhobon Khamarbari High Court Khamarbari" +
                        "Khamarbari Press Club Khamarbari Paltan Khamarbari GPO Khamarbari Golap Shah Mazar Khamarbari Naya Bazar Khamarbari Babu Bazar Khamarbari" +
                        "Khamarbari Keraniganj Khamarbari" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate Shahbag Farmgate Motsho Bhobon Farmgate High Court Farmgate" +
                        "Farmgate Press Club Farmgate Paltan Farmgate GPO Farmgate Golap Shah Mazar Farmgate Naya Bazar Farmgate Babu Bazar Farmgate" +
                        "Farmgate Keraniganj Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar High Court Kawran Bazar" +
                        "Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar GPO Kawran Bazar Golap Shah Mazar Kawran Bazar Naya Bazar Kawran Bazar Babu Bazar Kawran Bazar" +
                        "Kawran Bazar Keraniganj Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor High Court Bangla Motor" +
                        "Bangla Motor Press Club Bangla Motor Paltan Bangla Motor GPO Bangla Motor Golap Shah Mazar Bangla Motor Naya Bazar Bangla Motor Babu Bazar Bangla Motor" +
                        "Bangla Motor Keraniganj Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag" +
                        "Shahbag Press Club Shahbag Paltan Shahbag GPO Shahbag Golap Shah Mazar Shahbag Naya Bazar Shahbag Babu Bazar Shahbag" +
                        "Shahbag Keraniganj Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon" +
                        "Motsho Bhobon Press Club Motsho Bhobon Paltan Motsho Bhobon GPO Motsho Bhobon Golap Shah Mazar Motsho Bhobon Naya Bazar Motsho Bhobon Babu Bazar Motsho Bhobon" +
                        "Motsho Bhobon Keraniganj Motsho Bhobon" +
                        "High Court Press Club High Court Paltan High Court GPO High Court Golap Shah Mazar High Court Naya Bazar High Court Babu Bazar High Court" +
                        "High Court Keraniganj High Court" +
                        "Press Club Paltan Press Club GPO Press Club Golap Shah Mazar Press Club Naya Bazar Press Club Babu Bazar Press Club" +
                        "Press Club Keraniganj Press Club" +
                        "Paltan GPO Paltan Golap Shah Mazar Paltan Naya Bazar Paltan Babu Bazar Paltan" +
                        "Paltan Keraniganj Paltan" +
                        "GPO Golap Shah Mazar GPO Naya Bazar GPO Babu Bazar GPO" +
                        "GPO Keraniganj GPO" +
                        "Golap Shah Mazar Naya Bazar Golap Shah Mazar Babu Bazar Golap Shah Mazar" +
                        "Golap Shah Mazar Keraniganj Golap Shah Mazar" +
                        "Naya Bazar Babu Bazar Naya Bazar" +
                        "Naya Bazar Keraniganj Naya Bazar" +
                        "Babu Bazar Keraniganj Babu Bazar"));



        buses.add(new Bus(R.drawable.logo,"FTCL",
                "Mohammadpur Shankar Mohammadpur Star Kabab Mohammadpur Dhanmondi 15 Mohammadpur Jigatola Mohammadpur" +
                        "Mohammadpur City College Mohammadpur Science Lab Mohammadpur Bata Signal Mohammadpur Katabon Mohammadpur" +
                        "Mohammadpur Shahbag Mohammadpur Motsho Bhobon Mohammadpur High Court Mohammadpur Press Club Mohammadpur" +
                        "Mohammadpur Paltan Mohammadpur GPO Mohammadpur Gulisthan Mohammadpur Motijheel Mohammadpur" +
                        "Mohammadpur Arambag Mohammadpur" +
                        "Shankar Star Kabab Shankar Dhanmondi 15 Shankar Jigatola Shankar" +
                        "Shankar City College Shankar Science Lab Shankar Bata Signal Shankar Katabon Shankar" +
                        "Shankar Shahbag Shankar Motsho Bhobon Shankar High Court Shankar Press Club Shankar" +
                        "Shankar Paltan Shankar GPO Shankar Gulisthan Shankar Motijheel Shankar" +
                        "Shankar Arambag Shankar" +
                        "Star Kabab Dhanmondi 15 Star Kabab Jigatola Star Kabab" +
                        "Star Kabab City College Star Kabab Science Lab Star Kabab Bata Signal Star Kabab Katabon Star Kabab" +
                        "Star Kabab Shahbag Star Kabab Motsho Bhobon Star Kabab High Court Star Kabab Press Club Star Kabab" +
                        "Star Kabab Paltan Star Kabab GPO Star Kabab Gulisthan Star Kabab Motijheel Star Kabab" +
                        "Star Kabab Arambag Star Kabab" +
                        "Dhanmondi 15 Jigatola Dhanmondi 15" +
                        "Dhanmondi 15 City College Dhanmondi 15 Science Lab Dhanmondi 15 Bata Signal Dhanmondi 15 Katabon Dhanmondi 15" +
                        "Dhanmondi 15 Shahbag Dhanmondi 15 Motsho Bhobon Dhanmondi 15 High Court Dhanmondi 15 Press Club Dhanmondi 15" +
                        "Dhanmondi 15 Paltan Dhanmondi 15 GPO Dhanmondi 15 Gulisthan Dhanmondi 15 Motijheel Dhanmondi 15" +
                        "Dhanmondi 15 Arambag Dhanmondi 15" +
                        "Jigatola City College Jigatola Science Lab Jigatola Bata Signal Jigatola Katabon Jigatola" +
                        "Jigatola Shahbag Jigatola Motsho Bhobon Jigatola High Court Jigatola Press Club Jigatola" +
                        "Jigatola Paltan Jigatola GPO Jigatola Gulisthan Jigatola Motijheel Jigatola" +
                        "Jigatola Arambag Jigatola" +
                        "City College Science Lab City College Bata Signal City College Katabon City College" +
                        "City College Shahbag City College Motsho Bhobon City College High Court City College Press Club City College" +
                        "City College Paltan City College GPO City College Gulisthan City College Motijheel City College" +
                        "City College Arambag City College" +
                        "Science Lab Bata Signal Science Lab Katabon Science Lab" +
                        "Science Lab Shahbag Science Lab Motsho Bhobon Science Lab High Court Science Lab Press Club Science Lab" +
                        "Science Lab Paltan Science Lab GPO Science Lab Gulisthan Science Lab Motijheel Science Lab" +
                        "Science Lab Arambag Science Lab" +
                        "Bata Signal Katabon Bata Signal Shahbag Bata Signal Motsho Bhobon Bata Signal High Court Bata Signal Press Club Bata Signal" +
                        "Bata Signal Paltan Bata Signal GPO Bata Signal Gulisthan Bata Signal Motijheel Bata Signal" +
                        "Bata Signal Arambag Bata Signal" +
                        "Katabon Shahbag Katabon Motsho Bhobon Katabon High Court Katabon Press Club Katabon" +
                        "Katabon Paltan Katabon GPO Katabon Gulisthan Katabon Motijheel Katabon" +
                        "Katabon Arambag Katabon" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag" +
                        "Shahbag Paltan Shahbag GPO Shahbag Gulisthan Shahbag Motijheel Shahbag" +
                        "Shahbag Arambag Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon" +
                        "Motsho Bhobon Paltan Motsho Bhobon GPO Motsho Bhobon Gulisthan Motsho Bhobon Motijheel Motsho Bhobon" +
                        "Motsho Bhobon Arambag Motsho Bhobon" +
                        "High Court Press Club High Court" +
                        "High Court Paltan High Court GPO High Court Gulisthan High Court Motijheel High Court" +
                        "High Court Arambag High Court" +
                        "Press Club Paltan Press Club GPO Press Club Gulisthan Press Club Motijheel Press Club" +
                        "Press Club Arambag Press Club" +
                        "Paltan GPO Paltan Gulisthan Paltan Motijheel Paltan" +
                        "Paltan Arambag Paltan" +
                        "GPO Gulisthan GPO Motijheel GPO" +
                        "GPO Arambag GPO" +
                        "Gulisthan Motijheel Gulisthan" +
                        "Motijheel Arambag Motijheel" +
                        "Motijheel Arambag Motijheel"));



        buses.add(new Bus(R.drawable.logo,"First Ten",
                "Bhashantek Mirpur 14 Bhashantek Mirpur 10 Bhashantek Mirpur 2 Bhashantek Sony Hall Bhashantek Mirpur 1 Bhashantek" +
                        "Bhashantek Ansar Camp Bhashantek Technical Bhashantek" +
                        "Bhashantek Gabtoli Bhashantek" +
                        "Mirpur 14 Mirpur 10 Mirpur 14 Mirpur 2 Mirpur 14 Sony Hall Mirpur 14 Mirpur 1 Mirpur 14" +
                        "Mirpur 14 Ansar Camp Mirpur 14 Technical Mirpur 14" +
                        "Mirpur 14 Gabtoli Mirpur 14" +
                        "Mirpur 10 Mirpur 2 Mirpur 10 Sony Hall Mirpur 10 Mirpur 1 Mirpur 10" +
                        "Mirpur 10Mirpur 10 Ansar Camp Mirpur 10 Technical Mirpur 10" +
                        "Mirpur 10 Gabtoli Mirpur 10" +
                        "Mirpur 2 Sony Hall Mirpur 2 Mirpur 1 Mirpur 2" +
                        "Mirpur 2 Ansar Camp Mirpur 2 Technical Mirpur 2" +
                        "Mirpur 2 Gabtoli Mirpur 2" +
                        "Sony Hall Mirpur 1 Sony Hall" +
                        "Sony Hall Ansar Camp Sony Hall Technical Sony Hall" +
                        "Sony Hall Gabtoli Sony Hall" +
                        "Mirpur 1 Ansar Camp Mirpur 1 Technical Mirpur 1" +
                        "Mirpur 1 Gabtoli Mirpur 1" +
                        "Ansar Camp Technical Ansar Camp" +
                        "Ansar Camp Gabtoli Ansar Camp" +
                        "Technical Gabtoli Technical"));


        buses.add(new Bus(R.drawable.logo,"Galaxy Line",
                "Ansar Camp Mirpur 1 Ansar Camp Sony Hall Ansar Camp" +
                        "Ansar Camp Mirpur 2 Ansar Camp Mirpur 10 Ansar Camp Mirpur 11 Ansar Camp Purobi Ansar Camp kalshi Ansar Camp ECB Chattar Ansar Camp" +
                        "Ansar Camp MES Ansar Camp Shewra Ansar Camp Kuril Bishwa Road Ansar Camp Bashundhara Ansar Camp Nadda Ansar Camp Natun Bazar Ansar Camp" +
                        "Ansar Camp Bashtola Ansar Camp Shahjadpur Ansar Camp Uttar Badda Bazar Ansar Camp Badda Ansar Camp Madhya Badda Ansar Camp Merul Ansar Camp" +
                        "Ansar Camp Rampura Bridge Ansar Camp Banasree Ansar Camp Demra Ansar Camp" +
                        "Mirpur 1 Sony Hall Mirpur 1" +
                        "Mirpur 1 Mirpur 2 Mirpur 1 Mirpur 10 Mirpur 1 Mirpur 11 Mirpur 1 Purobi Mirpur 1 kalshi Mirpur 1 ECB Chattar Mirpur 1" +
                        "Mirpur 1 MES Mirpur 1 Shewra Mirpur 1 Kuril Bishwa Road Mirpur 1 Bashundhara Mirpur 1 Nadda Mirpur 1 Natun Bazar Mirpur 1" +
                        "Mirpur 1 Bashtola Mirpur 1 Shahjadpur Mirpur 1 Uttar Badda Bazar Mirpur 1 Badda Mirpur 1 Madhya Badda Mirpur 1 Merul Mirpur 1" +
                        "Mirpur 1 Rampura Bridge Mirpur 1 Banasree Mirpur 1 Demra Mirpur 1" +
                        "Sony Hall Mirpur 2 Sony Hall Mirpur 10 Sony Hall Mirpur 11 Sony Hall Purobi Sony Hall kalshi Sony Hall ECB Chattar Sony Hall" +
                        "Sony Hall MES Sony Hall Shewra Sony Hall Kuril Bishwa Road Sony Hall Bashundhara Sony Hall Nadda Sony Hall Natun Bazar Sony Hall" +
                        "Sony Hall Bashtola Sony Hall Shahjadpur Sony Hall Uttar Badda Bazar Sony Hall Badda Sony Hall Madhya Badda Sony Hall Merul Sony Hall" +
                        "Sony Hall Rampura Bridge Sony Hall Banasree Sony Hall Demra Sony Hall" +
                        "Mirpur 2 Mirpur 10 Mirpur 2 Mirpur 11 Mirpur 2 Purobi Mirpur 2 kalshi Mirpur 2 ECB Chattar Mirpur 2" +
                        "Mirpur 2 MES Mirpur 2 Shewra Mirpur 2 Kuril Bishwa Road Mirpur 2 Bashundhara Mirpur 2 Nadda Mirpur 2 Natun Bazar Mirpur 2" +
                        "Mirpur 2 Bashtola Mirpur 2 Shahjadpur Mirpur 2 Uttar Badda Bazar Mirpur 2 Badda Mirpur 2 Madhya Badda Mirpur 2 Merul Mirpur 2" +
                        "Mirpur 2 Rampura Bridge Mirpur 2 Banasree Mirpur 2 Demra Mirpur 2" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 kalshi Mirpur 10 ECB Chattar Mirpur 10" +
                        "Mirpur 10 MES Mirpur 10 Shewra Mirpur 10 Kuril Bishwa Road Mirpur 10 Bashundhara Mirpur 10 Nadda Mirpur 10 Natun Bazar Mirpur 10" +
                        "Mirpur 10 Bashtola Mirpur 10 Shahjadpur Mirpur 10 Uttar Badda Bazar Mirpur 10 Badda Mirpur 10 Madhya Badda Mirpur 10 Merul Mirpur 10" +
                        "Mirpur 10 Rampura Bridge Mirpur 10 Banasree Mirpur 10 Demra Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 kalshi Mirpur 11 ECB Chattar Mirpur 11" +
                        "Mirpur 11 MES Mirpur 11 Shewra Mirpur 11 Kuril Bishwa Road Mirpur 11 Bashundhara Mirpur 11 Nadda Mirpur 11 Natun Bazar Mirpur 11" +
                        "Mirpur 11 Bashtola Mirpur 11 Shahjadpur Mirpur 11 Uttar Badda Bazar Mirpur 11 Badda Mirpur 11 Madhya Badda Mirpur 11 Merul Mirpur 11" +
                        "Mirpur 11 Rampura Bridge Mirpur 11 Banasree Mirpur 11 Demra Mirpur 11" +
                        "Purobi kalshi Purobi ECB Chattar Purobi" +
                        "Purobi MES Purobi Shewra Purobi Kuril Bishwa Road Purobi Bashundhara Purobi Nadda Purobi Natun Bazar Purobi" +
                        "Purobi Bashtola Purobi Shahjadpur Purobi Uttar Badda Bazar Purobi Badda Purobi Madhya Badda Purobi Merul Purobi" +
                        "Purobi Rampura Bridge Purobi Banasree Purobi Demra Purobi" +
                        "kalshi ECB Chattar kalshi" +
                        "kalshi MES kalshi Shewra kalshi Kuril Bishwa Road kalshi Bashundhara kalshi Nadda kalshi Natun Bazar kalshi" +
                        "kalshi Bashtola kalshi Shahjadpur kalshi Uttar Badda Bazar kalshi Badda kalshi Madhya Badda kalshi Merul kalshi" +
                        "kalshi Rampura Bridge kalshi Banasree kalshi Demra kalshi" +
                        "ECB Chattar MES ECB Chattar Shewra ECB Chattar Kuril Bishwa Road ECB Chattar Bashundhara ECB Chattar Nadda ECB Chattar Natun Bazar ECB Chattar" +
                        "ECB Chattar Bashtola ECB Chattar Shahjadpur ECB Chattar Uttar Badda Bazar ECB Chattar Badda ECB Chattar Madhya Badda ECB Chattar Merul ECB Chattar" +
                        "ECB Chattar Rampura Bridge ECB Chattar Banasree ECB Chattar Demra Purobi" +
                        "MES Shewra MES Kuril Bishwa Road MES Bashundhara MES Nadda MES Natun Bazar MES" +
                        "MES Bashtola MES Shahjadpur MES Uttar Badda Bazar MES Badda MES Madhya Badda MES Merul MES" +
                        "MES Rampura Bridge MES Banasree MES Demra MES" +
                        "Shewra Kuril Bishwa Road Shewra Bashundhara Shewra Nadda Shewra Natun Bazar Shewra" +
                        "Shewra Bashtola Shewra Shahjadpur Shewra Uttar Badda Bazar Shewra Badda Shewra Madhya Badda Shewra Merul Shewra" +
                        "Shewra Rampura Bridge Shewra Banasree Shewra Demra Shewra" +
                        "Kuril Bishwa Road Bashundhara Kuril Bishwa Road Nadda Shewra Natun Bazar Kuril Bishwa Road" +
                        "Kuril Bishwa Road Bashtola Kuril Bishwa Road Shahjadpur Kuril Bishwa Road Uttar Badda Bazar Kuril Bishwa Road Badda Kuril Bishwa Road Madhya Badda Kuril Bishwa Road Merul Kuril Bishwa Road" +
                        "Kuril Bishwa Road Rampura Bridge Kuril Bishwa Road Banasree Kuril Bishwa Road Demra Kuril Bishwa Road" +
                        "Bashundhara Nadda Bashundhara Natun Bazar Bashundhara" +
                        "Bashundhara Bashtola Bashundhara Shahjadpur Bashundhara Uttar Badda Bazar Bashundhara Badda Bashundhara Madhya Badda Bashundhara Merul Bashundhara" +
                        "Bashundhara Rampura Bridge Bashundhara Banasree Bashundhara Demra Bashundhara" +
                        "Nadda Natun Bazar Nadda" +
                        "Nadda Bashtola Nadda Shahjadpur Nadda Uttar Badda Bazar Nadda Badda Nadda Madhya Badda Nadda Merul Nadda" +
                        "Nadda Rampura Bridge Nadda Banasree Nadda Demra Nadda" +
                        "Natun Bazar Bashtola Natun Bazar Shahjadpur Natun Bazar Uttar Badda Bazar Natun Bazar Badda Natun Bazar Madhya Badda Natun Bazar Merul Natun Bazar" +
                        "Natun Bazar Rampura Bridge Natun Bazar Banasree Natun Bazar Demra Natun Bazar" +
                        "Bashtola Shahjadpur Bashtola Uttar Badda Bazar Bashtola Badda Bashtola Madhya Badda Bashtola Merul Bashtola" +
                        "Bashtola Rampura Bridge Bashtola Banasree Bashtola Demra Bashtola" +
                        "Shahjadpur Uttar Badda Bazar Shahjadpur Badda Shahjadpur Madhya Badda Shahjadpur Merul Shahjadpur" +
                        "Shahjadpur Rampura Bridge Shahjadpur Banasree Shahjadpur Demra Shahjadpur" +
                        "Uttar Badda Bazar Badda Uttar Badda Bazar Madhya Badda Uttar Badda Bazar Merul Uttar Badda Bazar" +
                        "Uttar Badda Bazar Rampura Bridge Uttar Badda Bazar Banasree Uttar Badda Bazar Demra Uttar Badda Bazar" +
                        "Badda Madhya Badda Badda Merul Badda" +
                        "Badda Rampura Bridge Badda Banasree Badda Demra Badda" +
                        "Madhya Badda Merul Madhya Badda" +
                        "Madhya Badda Rampura Bridge Madhya Badda Banasree Madhya Badda Demra Madhya Badda" +
                        "Merul Rampura Bridge Merul Banasree Merul Demra Merul" +
                        "Rampura Bridge Banasree Rampura Bridge Demra Rampura Bridge" +
                        "Banasree Demra Banasree"));


        buses.add(new Bus(R.drawable.logo,"Gazipur Paribahan",
                "Motijheel Gulisthan Motijheel Paltan Motijheel Kakrail Motijheel Shantinagar Motijheel Malibagh Mor Motijheel Mouchak Motijheel Moghbazar Motijheel" +
                        "Motijheel Nabisco Motijheel Mohakhali Motijheel Banani Motijheel Kakoli Motijheel MES Motijheel Shewra Motijheel Kuril Bishwa Road Motijheel" +
                        "Motijheel Khilkhet Motijheel Airport Motijheel Jasimuddin Motijheel Rajlakshmi Motijheel Azampur Motijheel House Building Motijheel Abdullahpur Motijheel" +
                        "Motijheel Tongi Motijheel Station Road Motijheel Board Bazar Motijheel Gazipur Motijheel" +
                        "Motijheel Shibbari Motijheel" +
                        "Gulisthan Paltan Gulisthan Kakrail Gulisthan Shantinagar Gulisthan Malibagh Mor Gulisthan Mouchak Gulisthan Moghbazar Gulisthan" +
                        "Gulisthan Nabisco Gulisthan Mohakhali Gulisthan Banani Gulisthan Kakoli Gulisthan MES Gulisthan Shewra Gulisthan Kuril Bishwa Road Gulisthan" +
                        "Gulisthan Khilkhet Gulisthan Airport Gulisthan Jasimuddin Gulisthan Rajlakshmi Gulisthan Azampur Gulisthan House Building Gulisthan Abdullahpur Gulisthan" +
                        "Gulisthan Tongi Gulisthan Station Road Gulisthan Board Bazar Gulisthan Gazipur Gulisthan" +
                        "Gulisthan Shibbari Gulisthan" +
                        "Paltan Kakrail Paltan Shantinagar Paltan Malibagh Mor Paltan Mouchak Paltan Moghbazar Paltan" +
                        "Paltan Nabisco Paltan Mohakhali Paltan Banani Paltan Kakoli Paltan MES Paltan Shewra Paltan Kuril Bishwa Road Paltan" +
                        "Paltan Khilkhet Paltan Airport Paltan Jasimuddin Paltan Rajlakshmi Paltan Azampur Paltan House Building Paltan Abdullahpur Paltan" +
                        "Paltan Tongi Paltan Station Road Paltan Board Bazar Paltan Gazipur Paltan" +
                        "Paltan Shibbari Paltan" +
                        "Kakrail Shantinagar Kakrail Malibagh Mor Kakrail Mouchak Kakrail Moghbazar Kakrail" +
                        "Kakrail Nabisco Kakrail Mohakhali Kakrail Banani Kakrail Kakoli Kakrail MES Kakrail Shewra Kakrail Kuril Bishwa Road Kakrail" +
                        "Kakrail Khilkhet Kakrail Airport Kakrail Jasimuddin Kakrail Rajlakshmi Kakrail Azampur Kakrail House Building Kakrail Abdullahpur Kakrail" +
                        "Kakrail Tongi Kakrail Station Road Kakrail Board Bazar Kakrail Gazipur Kakrail" +
                        "Kakrail Shibbari Kakrail" +
                        "Shantinagar Malibagh Mor Shantinagar Mouchak Shantinagar Moghbazar Shantinagar" +
                        "Shantinagar Nabisco Shantinagar Mohakhali Shantinagar Banani Shantinagar Kakoli Shantinagar MES Shantinagar Shewra Shantinagar Kuril Bishwa Road Shantinagar" +
                        "Shantinagar Khilkhet Shantinagar Airport Shantinagar Jasimuddin Shantinagar Rajlakshmi Shantinagar Azampur Shantinagar House Building Shantinagar Abdullahpur Shantinagar" +
                        "Shantinagar Tongi Shantinagar Station Road Shantinagar Board Bazar Shantinagar Gazipur Shantinagar" +
                        "Shantinagar Shibbari Shantinagar" +
                        "Malibagh Mor Mouchak Malibagh Mor Moghbazar Malibagh Mor" +
                        "Malibagh Mor Nabisco Malibagh Mor Mohakhali Malibagh Mor Banani Malibagh Mor Kakoli Malibagh Mor MES Malibagh Mor Shewra Malibagh Mor Kuril Bishwa Road Malibagh Mor" +
                        "Malibagh Mor Khilkhet Malibagh Mor Airport Malibagh Mor Jasimuddin Malibagh Mor Rajlakshmi Malibagh Mor Azampur Malibagh Mor House Building Malibagh Mor Abdullahpur Malibagh Mor" +
                        "Malibagh Mor Tongi Malibagh Mor Station Road Malibagh Mor Board Bazar Malibagh Mor Gazipur Malibagh Mor" +
                        "Malibagh Mor Shibbari Malibagh Mor" +
                        "Mouchak Moghbazar Mouchak" +
                        "Mouchak Nabisco Mouchak Mohakhali Mouchak Banani Mouchak Kakoli Mouchak MES Mouchak Shewra Mouchak Kuril Bishwa Road Mouchak" +
                        "Mouchak Khilkhet Mouchak Airport Mouchak Jasimuddin Mouchak Rajlakshmi Mouchak Azampur Mouchak House Building Mouchak Abdullahpur Mouchak" +
                        "Mouchak Tongi Mouchak Station Road Mouchak Board Bazar Mouchak Gazipur Mouchak" +
                        "Mouchak Shibbari Mouchak" +
                        "Moghbazar Nabisco Moghbazar Mohakhali Moghbazar Banani Moghbazar Kakoli Moghbazar MES Moghbazar Shewra Moghbazar Kuril Bishwa Road Moghbazar" +
                        "Moghbazar Khilkhet Moghbazar Airport Moghbazar Jasimuddin Moghbazar Rajlakshmi Moghbazar Azampur Moghbazar House Building Moghbazar Abdullahpur Moghbazar" +
                        "Moghbazar Tongi Moghbazar Station Road Moghbazar Board Bazar Moghbazar Gazipur Moghbazar" +
                        "Moghbazar Shibbari Moghbazar" +
                        "Nabisco Mohakhali Nabisco Banani Nabisco Kakoli Nabisco MES Nabisco Shewra Nabisco Kuril Bishwa Road Nabisco" +
                        "Nabisco Khilkhet Nabisco Airport Nabisco Jasimuddin Nabisco Rajlakshmi Nabisco Azampur Nabisco House Building Nabisco Abdullahpur Nabisco" +
                        "Nabisco Tongi Nabisco Station Road Nabisco Board Bazar Nabisco Gazipur Nabisco" +
                        "Nabisco Shibbari Nabisco" +
                        "Mohakhali Banani Mohakhali Kakoli Mohakhali MES Mohakhali Shewra Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Mohakhali Khilkhet Mohakhali Airport Mohakhali Jasimuddin Mohakhali Rajlakshmi Mohakhali Azampur Mohakhali House Building Mohakhali Abdullahpur Mohakhali" +
                        "Mohakhali Tongi Mohakhali Station Road Mohakhali Board Bazar Mohakhali Gazipur Mohakhali" +
                        "Mohakhali Shibbari Mohakhali" +
                        "Banani Kakoli Banani MES Banani Shewra Banani Kuril Bishwa Road Banani" +
                        "Banani Khilkhet Banani Airport Banani Jasimuddin Banani Rajlakshmi Banani Azampur Banani House Building Banani Abdullahpur Banani" +
                        "Banani Tongi Banani Station Road Banani Board Bazar Banani Gazipur Banani" +
                        "Banani Shibbari Banani" +
                        "Kakoli MES Kakoli Shewra Kakoli Kuril Bishwa Road Kakoli" +
                        "Kakoli Khilkhet Kakoli Airport Kakoli Jasimuddin Kakoli Rajlakshmi Kakoli Azampur Kakoli House Building Kakoli Abdullahpur Kakoli" +
                        "Kakoli Tongi Kakoli Station Road Kakoli Board Bazar Kakoli Gazipur Kakoli" +
                        "Kakoli Shibbari Kakoli" +
                        "MES Shewra MES Kuril Bishwa Road MES" +
                        "MES Khilkhet MES Airport MES Jasimuddin MES Rajlakshmi MES Azampur MES House Building MES Abdullahpur MES" +
                        "MES Tongi MES Station Road MES Board Bazar MES Gazipur MES" +
                        "MES Shibbari MES" +
                        "Shewra Kuril Bishwa Road Shewra" +
                        "Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra Rajlakshmi Shewra Azampur Shewra House Building Shewra Abdullahpur Shewra" +
                        "Shewra Tongi Shewra Station Road Shewra Board Bazar Shewra Gazipur Shewra" +
                        "Shewra Shibbari Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Kuril Bishwa Road Tongi Kuril Bishwa Road Station Road Kuril Bishwa Road Board Bazar Kuril Bishwa Road Gazipur Kuril Bishwa Road" +
                        "Kuril Bishwa Road Shibbari Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet Rajlakshmi Khilkhet Azampur Khilkhet House Building Khilkhet Abdullahpur Khilkhet" +
                        "Khilkhet Tongi Khilkhet Station Road Khilkhet Board Bazar Khilkhet Gazipur Khilkhet" +
                        "Khilkhet Shibbari Khilkhet" +
                        "Airport Jasimuddin Airport Rajlakshmi Airport Azampur Airport House Building Airport Abdullahpur Airport" +
                        "Airport Tongi Airport Station Road Airport Board Bazar Airport Gazipur Airport" +
                        "Airport Shibbari Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin Azampur Jasimuddin House Building Jasimuddin Abdullahpur Jasimuddin" +
                        "Jasimuddin Tongi Jasimuddin Station Road Jasimuddin Board Bazar Jasimuddin Gazipur Jasimuddin" +
                        "Jasimuddin Shibbari Jasimuddin" +
                        "Rajlakshmi Azampur Rajlakshmi House Building Rajlakshmi Abdullahpur Rajlakshmi" +
                        "Rajlakshmi Tongi Rajlakshmi Station Road Rajlakshmi Board Bazar Rajlakshmi Gazipur Rajlakshmi" +
                        "Rajlakshmi Shibbari Rajlakshmi" +
                        "Azampur House Building Azampur Abdullahpur Azampur" +
                        "Azampur Tongi Azampur Station Road Azampur Board Bazar Azampur Gazipur Azampur" +
                        "Azampur Shibbari Azampur" +
                        "House Building Abdullahpur House Building" +
                        "House Building Tongi House Building Station Road House Building Board Bazar House Building Gazipur House Building" +
                        "House Building Shibbari House Building" +
                        "Abdullahpur Tongi Abdullahpur Station Road Abdullahpur Board Bazar Abdullahpur Gazipur Abdullahpur" +
                        "Abdullahpur Shibbari Abdullahpur" +
                        "Tongi Station Road Tongi Board Bazar Tongi Gazipur Tongi" +
                        "Tongi Shibbari Tongi" +
                        "Station Road Board Bazar Station Road Gazipur Station Road" +
                        "Station Road Shibbari Station Road" +
                        "Board Bazar Gazipur Board Bazar" +
                        "Board Bazar Shibbari Board Bazar" +
                        "Gazipur Shibbari Gazipur"));


        buses.add(new Bus(R.drawable.logo,"Grameen",
                "Mirpur 14 Mirpur 10 Mirpur 14 Mirpur 2 Mirpur 14 Sony Hall Mirpur 14 Mirpur 1 Mirpur 14" +
                        "Mirpur 14 Ansar Camp Mirpur 14 Technical Mirpur 14" +
                        "Mirpur 14 Gabtoli Mirpur 14" +
                        "Mirpur 10 Mirpur 2 Mirpur 10 Sony Hall Mirpur 10 Mirpur 1 Mirpur 10" +
                        "Mirpur 10Mirpur 10 Ansar Camp Mirpur 10 Technical Mirpur 10" +
                        "Mirpur 10 Gabtoli Mirpur 10" +
                        "Mirpur 2 Sony Hall Mirpur 2 Mirpur 1 Mirpur 2" +
                        "Mirpur 2 Ansar Camp Mirpur 2 Technical Mirpur 2" +
                        "Mirpur 2 Gabtoli Mirpur 2" +
                        "Sony Hall Mirpur 1 Sony Hall" +
                        "Sony Hall Ansar Camp Sony Hall Technical Sony Hall" +
                        "Sony Hall Gabtoli Sony Hall" +
                        "Mirpur 1 Ansar Camp Mirpur 1 Technical Mirpur 1" +
                        "Mirpur 1 Gabtoli Mirpur 1" +
                        "Ansar Camp Technical Ansar Camp" +
                        "Ansar Camp Gabtoli Ansar Camp" +
                        "Technical Gabtoli Technical"));

        buses.add(new Bus(R.drawable.logo,"Grameen Shubheccha",
                "Fulbaria Chankhar Pul Fulbaria Bakshi Bazar Fulbaria Azimpur Fulbaria Nilkhet Fulbaria New Market Fulbaria Science Lab Fulbaria" +
                        "Fulbaria City College Fulbaria Kalabagan Fulbaria Dhanmondi 32 Fulbaria Dhanmondi 27 Fulbaria Asad Gate Fulbaria College Gate Fulbaria" +
                        "Fulbaria Shishu Mela Fulbaria Shyamoli Fulbaria Kallayanpur Fulbaria Technical Fulbaria Gabtoli Fulbaria Aminbazar Fulbaria" +
                        "Fulbaria Hemayetpur Fulbaria Savar Fulbaria" +
                        "Fulbaria Baipayl Fulbaria Zirani Bazar Fulbaria Nandan Park Fulbaria" +
                        "Fulbaria Chandra Fulbaria" +
                        "Chankhar Pul Bakshi Bazar Chankhar Pul Azimpur Chankhar Pul Nilkhet Chankhar Pul New Market Chankhar Pul Science Lab Chankhar Pul" +
                        "Chankhar Pul City College Chankhar Pul Kalabagan Chankhar Pul Dhanmondi 32 Chankhar Pul Dhanmondi 27 Chankhar Pul Asad Gate Chankhar Pul College Gate Chankhar Pul" +
                        "Chankhar Pul Shishu Mela Chankhar Pul Shyamoli Chankhar Pul Kallayanpur Chankhar Pul Technical Chankhar Pul Gabtoli Chankhar Pul Aminbazar Chankhar Pul" +
                        "Chankhar Pul Hemayetpur Chankhar Pul Savar Chankhar Pul" +
                        "Chankhar Pul Baipayl Chankhar Pul Zirani Bazar Chankhar Pul Nandan Park Chankhar Pul" +
                        "Chankhar Pul Chandra Chankhar Pul" +
                        "Bakshi Bazar Azimpur Bakshi Bazar Nilkhet Bakshi Bazar New Market Bakshi Bazar Science Lab Bakshi Bazar" +
                        "Bakshi Bazar City College Bakshi Bazar Kalabagan Bakshi Bazar Dhanmondi 32 Bakshi Bazar Dhanmondi 27 Bakshi Bazar Asad Gate Bakshi Bazar College Gate Bakshi Bazar" +
                        "Bakshi Bazar Shishu Mela Bakshi Bazar Shyamoli Bakshi Bazar Kallayanpur Bakshi Bazar Technical Bakshi Bazar Gabtoli Bakshi Bazar Aminbazar Bakshi Bazar" +
                        "Bakshi Bazar Hemayetpur Bakshi Bazar Savar Bakshi Bazar" +
                        "Bakshi Bazar Baipayl Bakshi Bazar Zirani Bazar Bakshi Bazar Nandan Park Bakshi Bazar" +
                        "Bakshi Bazar Chandra Bakshi Bazar" +
                        "Azimpur Nilkhet Azimpur New Market Azimpur Science Lab Azimpur" +
                        "Azimpur City College Azimpur Kalabagan Azimpur Dhanmondi 32 Azimpur Dhanmondi 27 Azimpur Asad Gate Azimpur College Gate Azimpur" +
                        "Azimpur Shishu Mela Azimpur Shyamoli Azimpur Kallayanpur Azimpur Technical Azimpur Gabtoli Azimpur Aminbazar Azimpur" +
                        "Azimpur Hemayetpur Azimpur Savar Azimpur" +
                        "Azimpur Baipayl Azimpur Zirani Bazar Azimpur Nandan Park Azimpur" +
                        "Azimpur Chandra Azimpur" +
                        "Nilkhet New Market Nilkhet Science Lab Nilkhet" +
                        "Nilkhet City College Nilkhet Kalabagan Nilkhet Dhanmondi 32 Nilkhet Dhanmondi 27 Nilkhet Asad Gate Nilkhet College Gate Nilkhet" +
                        "Nilkhet Shishu Mela Nilkhet Shyamoli Nilkhet Kallayanpur Nilkhet Technical Nilkhet Gabtoli Nilkhet Aminbazar Nilkhet" +
                        "Nilkhet Hemayetpur Nilkhet Savar Nilkhet" +
                        "Nilkhet Baipayl Nilkhet Zirani Bazar Nilkhet Nandan Park Nilkhet" +
                        "Nilkhet Chandra Nilkhet" +
                        "New Market Science Lab New Market" +
                        "New Market City College New Market Kalabagan New Market Dhanmondi 32 New Market Dhanmondi 27 New Market Asad Gate New Market College Gate New Market" +
                        "New Market Shishu Mela New Market Shyamoli New Market Kallayanpur New Market Technical New Market Gabtoli New Market Aminbazar New Market" +
                        "New Market Hemayetpur New Market Savar New Market" +
                        "New Market Baipayl New Market Zirani Bazar New Market Nandan Park New Market" +
                        "New Market Chandra New Market" +
                        "Science Lab City College Science Lab Kalabagan Science Lab Dhanmondi 32 Science Lab Dhanmondi 27 Science Lab Asad Gate Science Lab College Gate Science Lab" +
                        "Science Lab Shishu Mela Science Lab Shyamoli Science Lab Kallayanpur Science Lab Technical Science Lab Gabtoli Science Lab Aminbazar Science Lab" +
                        "Science Lab Hemayetpur Science Lab Savar Science Lab" +
                        "Science Lab Baipayl Science Lab Zirani Bazar Science Lab Nandan Park Science Lab" +
                        "Science Lab Chandra Science Lab" +
                        "City College Kalabagan City College Dhanmondi 32 City College Dhanmondi 27 City College Asad Gate City College College Gate City College" +
                        "City College Shishu Mela City College Shyamoli City College Kallayanpur City College Technical City College Gabtoli City College Aminbazar City College" +
                        "City College Hemayetpur City College Savar City College" +
                        "City College Baipayl City College Zirani Bazar City College Nandan Park City College" +
                        "City College Chandra City College" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad Gate Kalabagan College Gate Kalabagan" +
                        "Kalabagan Shishu Mela Kalabagan Shyamoli Kalabagan Kallayanpur Kalabagan Technical Kalabagan Gabtoli Kalabagan Aminbazar Kalabagan" +
                        "Kalabagan Hemayetpur Kalabagan Savar Kalabagan" +
                        "Kalabagan Baipayl Kalabagan Zirani Bazar Kalabagan Nandan Park Kalabagan" +
                        "Kalabagan Chandra Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad Gate Dhanmondi 32 College Gate Dhanmondi 32" +
                        "Dhanmondi 32 Shishu Mela Dhanmondi 32 Shyamoli Dhanmondi 32 Kallayanpur Dhanmondi 32 Technical Dhanmondi 32 Gabtoli Dhanmondi 32 Aminbazar Dhanmondi 32" +
                        "Dhanmondi 32 Hemayetpur Dhanmondi 32 Savar Dhanmondi 32" +
                        "Dhanmondi 32 Baipayl Dhanmondi 32 Zirani Bazar Dhanmondi 32 Nandan Park Dhanmondi 32" +
                        "Dhanmondi 32 Chandra Dhanmondi 32" +
                        "Dhanmondi 27 Asad Gate Dhanmondi 27 College Gate Dhanmondi 27" +
                        "Dhanmondi 27 Shishu Mela Dhanmondi 27 Shyamoli Dhanmondi 27 Kallayanpur Dhanmondi 27 Technical Dhanmondi 27 Gabtoli Dhanmondi 27 Aminbazar Dhanmondi 27" +
                        "Dhanmondi 27 Hemayetpur Dhanmondi 27 Savar Dhanmondi 27" +
                        "Dhanmondi 27 Baipayl Dhanmondi 27 Zirani Bazar Dhanmondi 27 Nandan Park Dhanmondi 27" +
                        "Dhanmondi 27 Chandra Dhanmondi 27" +
                        "Asad Gate College Gate Asad Gate" +
                        "Asad Gate Shishu Mela Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Technical Asad Gate Gabtoli Asad Gate Aminbazar Asad Gate" +
                        "Asad Gate Hemayetpur Asad Gate Savar Asad Gate" +
                        "Asad Gate Baipayl Asad Gate Zirani Bazar Asad Gate Nandan Park Asad Gate" +
                        "Asad Gate Chandra Asad Gate" +
                        "College Gate Shishu Mela College Gate Shyamoli College Gate Kallayanpur College Gate Technical College Gate Gabtoli College Gate Aminbazar College Gate" +
                        "College Gate Hemayetpur College Gate Savar College Gate" +
                        "College Gate Baipayl College Gate Zirani Bazar College Gate Nandan Park College Gate" +
                        "College Gate Chandra College Gate" +
                        "Shishu Mela Shyamoli Shishu Mela Kallayanpur Shishu Mela Technical Shishu Mela Gabtoli Shishu Mela Aminbazar Shishu Mela" +
                        "Shishu Mela Hemayetpur Shishu Mela Savar Shishu Mela" +
                        "Shishu Mela Baipayl Shishu Mela Zirani Bazar Shishu Mela Nandan Park Shishu Mela" +
                        "Shishu Mela Chandra Shishu Mela" +
                        "Shyamoli Kallayanpur Shyamoli Technical Shyamoli Gabtoli Shyamoli Aminbazar Shyamoli" +
                        "Shyamoli Hemayetpur Shyamoli Savar Shyamoli" +
                        "Shyamoli Baipayl Shyamoli Zirani Bazar Shyamoli Nandan Park Shyamoli" +
                        "Shyamoli Chandra Shyamoli" +
                        "Kallayanpur Technical Kallayanpur Gabtoli Kallayanpur Aminbazar Kallayanpur" +
                        "Kallayanpur Hemayetpur Kallayanpur Savar Kallayanpur" +
                        "Kallayanpur Baipayl Kallayanpur Zirani Bazar Kallayanpur Nandan Park Kallayanpur" +
                        "Kallayanpur Chandra Kallayanpur" +
                        "Technical Gabtoli Technical Aminbazar Technical" +
                        "Technical Hemayetpur Technical Savar Technical" +
                        "Technical Baipayl Technical Zirani Bazar Technical Nandan Park Technical" +
                        "Technical Chandra Technical" +
                        "Gabtoli Aminbazar Gabtoli" +
                        "Gabtoli Hemayetpur Gabtoli Savar Gabtoli" +
                        "Gabtoli Baipayl Gabtoli Zirani Bazar Gabtoli Nandan Park Gabtoli" +
                        "Gabtoli Chandra Gabtoli" +
                        "Aminbazar Hemayetpur Aminbazar Savar Aminbazar" +
                        "Aminbazar Baipayl Aminbazar Zirani Bazar Aminbazar Nandan Park Aminbazar" +
                        "Aminbazar Chandra Aminbazar" +
                        "Hemayetpur Savar Hemayetpur" +
                        "Hemayetpur Baipayl Hemayetpur Zirani Bazar Hemayetpur Nandan Park Hemayetpur" +
                        "Hemayetpur Chandra Hemayetpur" +
                        "Savar Baipayl Savar Zirani Bazar Savar Nandan Park Savar" +
                        "Savar Chandra Savar" +
                        "Baipayl Zirani Bazar Baipayl Nandan Park Baipayl" +
                        "Baipayl Chandra Baipayl" +
                        "Zirani Bazar Nandan Park Zirani Bazar" +
                        "Zirani Bazar Chandra Zirani Bazar" +
                        "Nandan Park Chandra Nandan Park"));


        buses.add(new Bus(R.drawable.logo,"Green Dhaka",
                "Motijheel Gulisthan Motijheel Paltan Motijheel Kakrail Motijheel Shantinagar Motijheel Malibagh Mor Motijheel Mouchak Motijheel Moghbazar Motijheel" +
                        "Motijheel Nabisco Motijheel Mohakhali Motijheel Banani Motijheel Kakoli Motijheel MES Motijheel Shewra Motijheel Kuril Bishwa Road Motijheel" +
                        "Motijheel Khilkhet Motijheel Airport Motijheel Jasimuddin Motijheel Rajlakshmi Motijheel Azampur Motijheel House Building Motijheel Abdullahpur Motijheel" +
                        "Gulisthan Paltan Gulisthan Kakrail Gulisthan Shantinagar Gulisthan Malibagh Mor Gulisthan Mouchak Gulisthan Moghbazar Gulisthan" +
                        "Gulisthan Nabisco Gulisthan Mohakhali Gulisthan Banani Gulisthan Kakoli Gulisthan MES Gulisthan Shewra Gulisthan Kuril Bishwa Road Gulisthan" +
                        "Gulisthan Khilkhet Gulisthan Airport Gulisthan Jasimuddin Gulisthan Rajlakshmi Gulisthan Azampur Gulisthan House Building Gulisthan Abdullahpur Gulisthan" +
                        "Paltan Kakrail Paltan Shantinagar Paltan Malibagh Mor Paltan Mouchak Paltan Moghbazar Paltan" +
                        "Paltan Nabisco Paltan Mohakhali Paltan Banani Paltan Kakoli Paltan MES Paltan Shewra Paltan Kuril Bishwa Road Paltan" +
                        "Paltan Khilkhet Paltan Airport Paltan Jasimuddin Paltan Rajlakshmi Paltan Azampur Paltan House Building Paltan Abdullahpur Paltan" +
                        "Kakrail Shantinagar Kakrail Malibagh Mor Kakrail Mouchak Kakrail Moghbazar Kakrail" +
                        "Kakrail Nabisco Kakrail Mohakhali Kakrail Banani Kakrail Kakoli Kakrail MES Kakrail Shewra Kakrail Kuril Bishwa Road Kakrail" +
                        "Kakrail Khilkhet Kakrail Airport Kakrail Jasimuddin Kakrail Rajlakshmi Kakrail Azampur Kakrail House Building Kakrail Abdullahpur Kakrail" +
                        "Shantinagar Malibagh Mor Shantinagar Mouchak Shantinagar Moghbazar Shantinagar" +
                        "Shantinagar Nabisco Shantinagar Mohakhali Shantinagar Banani Shantinagar Kakoli Shantinagar MES Shantinagar Shewra Shantinagar Kuril Bishwa Road Shantinagar" +
                        "Shantinagar Khilkhet Shantinagar Airport Shantinagar Jasimuddin Shantinagar Rajlakshmi Shantinagar Azampur Shantinagar House Building Shantinagar Abdullahpur Shantinagar" +
                        "Malibagh Mor Mouchak Malibagh Mor Moghbazar Malibagh Mor" +
                        "Malibagh Mor Nabisco Malibagh Mor Mohakhali Malibagh Mor Banani Malibagh Mor Kakoli Malibagh Mor MES Malibagh Mor Shewra Malibagh Mor Kuril Bishwa Road Malibagh Mor" +
                        "Malibagh Mor Khilkhet Malibagh Mor Airport Malibagh Mor Jasimuddin Malibagh Mor Rajlakshmi Malibagh Mor Azampur Malibagh Mor House Building Malibagh Mor Abdullahpur Malibagh Mor" +
                        "Mouchak Moghbazar Mouchak" +
                        "Mouchak Nabisco Mouchak Mohakhali Mouchak Banani Mouchak Kakoli Mouchak MES Mouchak Shewra Mouchak Kuril Bishwa Road Mouchak" +
                        "Mouchak Khilkhet Mouchak Airport Mouchak Jasimuddin Mouchak Rajlakshmi Mouchak Azampur Mouchak House Building Mouchak Abdullahpur Mouchak" +
                        "Moghbazar Nabisco Moghbazar Mohakhali Moghbazar Banani Moghbazar Kakoli Moghbazar MES Moghbazar Shewra Moghbazar Kuril Bishwa Road Moghbazar" +
                        "Moghbazar Khilkhet Moghbazar Airport Moghbazar Jasimuddin Moghbazar Rajlakshmi Moghbazar Azampur Moghbazar House Building Moghbazar Abdullahpur Moghbazar" +
                        "Nabisco Mohakhali Nabisco Banani Nabisco Kakoli Nabisco MES Nabisco Shewra Nabisco Kuril Bishwa Road Nabisco" +
                        "Nabisco Khilkhet Nabisco Airport Nabisco Jasimuddin Nabisco Rajlakshmi Nabisco Azampur Nabisco House Building Nabisco Abdullahpur Nabisco" +
                        "Mohakhali Banani Mohakhali Kakoli Mohakhali MES Mohakhali Shewra Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Mohakhali Khilkhet Mohakhali Airport Mohakhali Jasimuddin Mohakhali Rajlakshmi Mohakhali Azampur Mohakhali House Building Mohakhali Abdullahpur Mohakhali" +
                        "Banani Kakoli Banani MES Banani Shewra Banani Kuril Bishwa Road Banani" +
                        "Banani Khilkhet Banani Airport Banani Jasimuddin Banani Rajlakshmi Banani Azampur Banani House Building Banani Abdullahpur Banani" +
                        "Kakoli MES Kakoli Shewra Kakoli Kuril Bishwa Road Kakoli" +
                        "Kakoli Khilkhet Kakoli Airport Kakoli Jasimuddin Kakoli Rajlakshmi Kakoli Azampur Kakoli House Building Kakoli Abdullahpur Kakoli" +
                        "MES Shewra MES Kuril Bishwa Road MES" +
                        "MES Khilkhet MES Airport MES Jasimuddin MES Rajlakshmi MES Azampur MES House Building MES Abdullahpur MES" +
                        "Shewra Kuril Bishwa Road Shewra" +
                        "Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra Rajlakshmi Shewra Azampur Shewra House Building Shewra Abdullahpur Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet Rajlakshmi Khilkhet Azampur Khilkhet House Building Khilkhet Abdullahpur Khilkhet" +
                        "Airport Jasimuddin Airport Rajlakshmi Airport Azampur Airport House Building Airport Abdullahpur Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin Azampur Jasimuddin House Building Jasimuddin Abdullahpur Jasimuddin" +
                        "Rajlakshmi Azampur Rajlakshmi House Building Rajlakshmi Abdullahpur Rajlakshmi" +
                        "Azampur House Building Azampur Abdullahpur Azampur" +
                        "House Building Abdullahpur House Building" ));




        buses.add(new Bus(R.drawable.logo,"Haji Transport",
                "Mirpur 12 Pallabi Mirpur 12 Purobi Mirpur 12 Mirpur 11 Mirpur 12 Mirpur 10 Mirpur 12 Kazipara Mirpur 12 Shewrapara Mirpur 12" +
                        "Mirpur 12 Taltola Mirpur 12 Agargaon Mirpur 12 Bijoy Sarani Mirpur 12 Farmgate Mirpur 12 Kawran Bazar Mirpur 12 Bangla Motor Mirpur 12" +
                        "Mirpur 12 Shahbag Mirpur 12 Motsho Bhobon Mirpur 12 High Court Mirpur 12 Press Club Mirpur 12 Paltan Mirpur 12 Gulisthan Mirpur 12" +
                        "Mirpur 12 Motijheel Mirpur 12" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Bijoy Sarani Pallabi Farmgate Pallabi Kawran Bazar Pallabi Bangla Motor Pallabi" +
                        "Pallabi Shahbag Pallabi Motsho Bhobon Pallabi High Court Pallabi Press Club Pallabi Paltan Pallabi Gulisthan Pallabi" +
                        "Pallabi Motijheel Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Bijoy Sarani Purobi Farmgate Purobi Kawran Bazar Purobi Bangla Motor Purobi" +
                        "Purobi Shahbag Purobi Motsho Bhobon Purobi High Court Purobi Press Club Purobi Paltan Purobi Gulisthan Purobi" +
                        "Purobi Motijheel Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Bijoy Sarani Mirpur 11 Farmgate Mirpur 11 Kawran Bazar Mirpur 11 Bangla Motor Mirpur 11" +
                        "Mirpur 11 Shahbag Mirpur 11 Motsho Bhobon Mirpur 11 High Court Mirpur 11 Press Club Mirpur 11 Paltan Mirpur 11 Gulisthan Mirpur 11" +
                        "Mirpur 11 Motijheel Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Bijoy Sarani Mirpur 10 Farmgate Mirpur 10 Kawran Bazar Mirpur 10 Bangla Motor Mirpur 10" +
                        "Mirpur 10 Shahbag Mirpur 10 Motsho Bhobon Mirpur 10 High Court Mirpur 10 Press Club Mirpur 10 Paltan Mirpur 10 Gulisthan Mirpur 10" +
                        "Mirpur 10 Motijheel Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Bijoy Sarani Kazipara Farmgate Kazipara Kawran Bazar Kazipara Bangla Motor Kazipara" +
                        "Kazipara Shahbag Kazipara Motsho Bhobon Kazipara High Court Kazipara Press Club Kazipara Paltan Kazipara Gulisthan Kazipara" +
                        "Kazipara Motijheel Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Bijoy Sarani Shewrapara Farmgate Shewrapara Kawran Bazar Shewrapara Bangla Motor Shewrapara" +
                        "Shewrapara Shahbag Shewrapara Motsho Bhobon Shewrapara High Court Shewrapara Press Club Shewrapara Paltan Shewrapara Gulisthan Shewrapara" +
                        "Shewrapara Motijheel Shewrapara" +
                        "Taltola Agargaon Taltola Bijoy Sarani Taltola Farmgate Taltola Kawran Bazar Taltola Bangla Motor Taltola" +
                        "Taltola Shahbag Taltola Motsho Bhobon Taltola High Court Taltola Press Club Taltola Paltan Taltola Gulisthan Taltola" +
                        "Taltola Motijheel Taltola" +
                        "Agargaon Bijoy Sarani Agargaon Farmgate Agargaon Kawran Bazar Agargaon Bangla Motor Agargaon" +
                        "Agargaon Shahbag Agargaon Motsho Bhobon Agargaon High Court Agargaon Press Club Agargaon Paltan Agargaon Gulisthan Agargaon" +
                        "Agargaon Motijheel Agargaon" +
                        "Bijoy Sarani Farmgate Bijoy Sarani Kawran Bazar Bijoy Sarani Bangla Motor Bijoy Sarani" +
                        "Bijoy Sarani Shahbag Bijoy Sarani Motsho Bhobon Bijoy Sarani High Court Bijoy Sarani Press Club Bijoy Sarani Paltan Bijoy Sarani Gulisthan Bijoy Sarani" +
                        "Bijoy Sarani Motijheel Bijoy Sarani" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate" +
                        "Farmgate Shahbag Farmgate Motsho Bhobon Farmgate High Court Farmgate Press Club Farmgate Paltan Farmgate Gulisthan Farmgate" +
                        "Farmgate Motijheel Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar" +
                        "Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar High Court Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar Gulisthan Kawran Bazar" +
                        "Kawran Bazar Motijheel Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor High Court Bangla Motor Press Club Bangla Motor Paltan Bangla Motor Gulisthan Bangla Motor" +
                        "Bangla Motor Motijheel Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag Gulisthan Shahbag" +
                        "Shahbag Motijheel Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon Paltan Motsho Bhobon Gulisthan Motsho Bhobon" +
                        "Motsho Bhobon Motijheel Motsho Bhobon" +
                        "High Court Press Club High Court Paltan High Court Gulisthan High Court" +
                        "High Court Motijheel High Court" +
                        "Press Club Paltan Press Club Gulisthan Press Club" +
                        "Press Club Motijheel Press Club" +
                        "Paltan Gulisthan Paltan" +
                        "Paltan Motijheel Paltan" +
                        "Gulisthan Motijheel Gulisthan"));




        buses.add(new Bus(R.drawable.logo,"Himachol",
                "Metro Hall Chashara Metro Hall Shibu Market Metro Hall Jalkuri Metro Hall Sign Board Metro Hall Matuail Metro Hall Rayerbag Metro Hall" +
                        "Metro Hall Shonir Akhra Metro Hall Jatrabari Metro Hall Jonopath Mor Metro Hall Gulisthan Metro Hall GPO Metro Hall Paltan Metro Hall" +
                        "Metro Hall Press Club Metro Hall High Court Metro Hall Motsho Bhobon Metro Hall" +
                        "Metro Hall Shahbag Metro Hall Bangla Motor Metro Hall Kawran Bazar Metro Hall Farmgate Metro Hall Khamarbari Metro Hall" +
                        "Metro Hall Agargaon Metro Hall Taltola Metro Hall Shewrapara Metro Hall Kazipara Metro Hall Mirpur 10 Metro Hall" +
                        "Metro Hall Mirpur 11 Metro Hall Purobi Metro Hall Pallabi Metro Hall" +
                        "Metro Hall Mirpur 12 Metro Hall" +
                        "Chashara Shibu Market Chashara Jalkuri Chashara Sign Board Chashara Matuail Chashara Rayerbag Chashara" +
                        "Chashara Shonir Akhra Chashara Jatrabari Chashara Jonopath Mor Chashara Gulisthan Chashara GPO Chashara Paltan Chashara" +
                        "Chashara Press Club Chashara High Court Chashara Motsho Bhobon Chashara" +
                        "Chashara Shahbag Chashara Bangla Motor Chashara Kawran Bazar Chashara Farmgate Chashara Khamarbari Chashara" +
                        "Chashara Agargaon Chashara Taltola Chashara Shewrapara Chashara Kazipara Chashara Mirpur 10 Chashara" +
                        "Chashara Mirpur 11 Chashara Purobi Chashara Pallabi Chashara" +
                        "Chashara Mirpur 12 Chashara" +
                        "Shibu Market Jalkuri Shibu Market Sign Board Shibu Market Matuail Shibu Market Rayerbag Shibu Market" +
                        "Shibu Market Shonir Akhra Shibu Market Jatrabari Shibu Market Jonopath Mor Shibu Market Gulisthan Shibu Market GPO Shibu Market Paltan Shibu Market" +
                        "Shibu Market Press Club Shibu Market High Court Shibu Market Motsho Bhobon Shibu Market" +
                        "Shibu Market Shahbag Shibu Market Bangla Motor Shibu Market Kawran Bazar Shibu Market Farmgate Shibu Market Khamarbari Shibu Market" +
                        "Shibu Market Agargaon Shibu Market Taltola Shibu Market Shewrapara Shibu Market Kazipara Shibu Market Mirpur 10 Shibu Market" +
                        "Shibu Market Mirpur 11 Shibu Market Purobi Shibu Market Pallabi Shibu Market" +
                        "Shibu Market Mirpur 12 Shibu Market" +
                        "Jalkuri Sign Board Jalkuri Matuail Jalkuri Rayerbag Jalkuri" +
                        "Jalkuri Shonir Akhra Jalkuri Jatrabari Jalkuri Jonopath Mor Jalkuri Gulisthan Jalkuri GPO Jalkuri Paltan Jalkuri" +
                        "Jalkuri Press Club Jalkuri High Court Jalkuri Motsho Bhobon Jalkuri" +
                        "Jalkuri Shahbag Jalkuri Bangla Motor Jalkuri Kawran Bazar Jalkuri Farmgate Jalkuri Khamarbari Jalkuri" +
                        "Jalkuri Agargaon Jalkuri Taltola Jalkuri Shewrapara Jalkuri Kazipara Jalkuri Mirpur 10 Jalkuri" +
                        "Jalkuri Mirpur 11 Jalkuri Purobi Jalkuri Pallabi Jalkuri" +
                        "Jalkuri Mirpur 12 Jalkuri" +
                        "Sign Board Matuail Sign Board Rayerbag Sign Board" +
                        "Sign Board Shonir Akhra Sign Board Jatrabari Sign Board Jonopath Mor Sign Board Gulisthan Sign Board GPO Sign Board Paltan Sign Board" +
                        "Sign Board Press Club Sign Board High Court Sign Board Motsho Bhobon Sign Board" +
                        "Sign Board Shahbag Sign Board Bangla Motor Sign Board Kawran Bazar Sign Board Farmgate Sign Board Khamarbari Sign Board" +
                        "Sign Board Agargaon Sign Board Taltola Sign Board Shewrapara Sign Board Kazipara Sign Board Mirpur 10 Sign Board" +
                        "Sign Board Mirpur 11 Sign Board Purobi Sign Board Pallabi Sign Board" +
                        "Sign Board Mirpur 12 Sign Board" +
                        "Matuail Rayerbag Matuail" +
                        "Matuail Shonir Akhra Matuail Jatrabari Matuail Jonopath Mor Matuail Gulisthan Matuail GPO Matuail Paltan Matuail" +
                        "Matuail Press Club Matuail High Court Matuail Motsho Bhobon Matuail" +
                        "Matuail Shahbag Matuail Bangla Motor Matuail Kawran Bazar Matuail Farmgate Matuail Khamarbari Matuail" +
                        "Matuail Agargaon Matuail Taltola Matuail Shewrapara Matuail Kazipara Matuail Mirpur 10 Matuail" +
                        "Matuail Mirpur 11 Matuail Purobi Matuail Pallabi Matuail" +
                        "Matuail Mirpur 12 Matuail" +
                        "Rayerbag Shonir Akhra Rayerbag Jatrabari Rayerbag Jonopath Mor Rayerbag Gulisthan Rayerbag GPO Rayerbag Paltan Rayerbag" +
                        "Rayerbag Press Club Rayerbag High Court Rayerbag Motsho Bhobon Rayerbag" +
                        "Rayerbag Shahbag Rayerbag Bangla Motor Rayerbag Kawran Bazar Rayerbag Farmgate Rayerbag Khamarbari Rayerbag" +
                        "Rayerbag Agargaon Rayerbag Taltola Rayerbag Shewrapara Rayerbag Kazipara Rayerbag Mirpur 10 Rayerbag" +
                        "Rayerbag Mirpur 11 Rayerbag Purobi Rayerbag Pallabi Rayerbag" +
                        "Rayerbag Mirpur 12 Rayerbag" +
                        "Shonir Akhra Jatrabari Shonir Akhra Jonopath Mor Shonir Akhra Gulisthan Shonir Akhra GPO Shonir Akhra Paltan Shonir Akhra" +
                        "Shonir Akhra Press Club Shonir Akhra High Court Shonir Akhra Motsho Bhobon Shonir Akhra" +
                        "Shonir Akhra Shahbag Shonir Akhra Bangla Motor Shonir Akhra Kawran Bazar Shonir Akhra Farmgate Shonir Akhra Khamarbari Shonir Akhra" +
                        "Shonir Akhra Agargaon Shonir Akhra Taltola Shonir Akhra Shewrapara Shonir Akhra Kazipara Shonir Akhra Mirpur 10 Shonir Akhra" +
                        "Shonir Akhra Mirpur 11 Shonir Akhra Purobi Shonir Akhra Pallabi Shonir Akhra" +
                        "Shonir Akhra Mirpur 12 Shonir Akhra" +
                        "Jatrabari Jonopath Mor Jatrabari Gulisthan Jatrabari GPO Jatrabari Paltan Jatrabari" +
                        "Jatrabari Press Club Jatrabari High Court Jatrabari Motsho Bhobon Jatrabari" +
                        "Jatrabari Shahbag Jatrabari Bangla Motor Jatrabari Kawran Bazar Jatrabari Farmgate Jatrabari Khamarbari Jatrabari" +
                        "Jatrabari Agargaon Jatrabari Taltola Jatrabari Shewrapara Jatrabari Kazipara Jatrabari Mirpur 10 Jatrabari" +
                        "Jatrabari Mirpur 11 Jatrabari Purobi Jatrabari Pallabi Jatrabari" +
                        "Jatrabari Mirpur 12 Jatrabari" +
                        "Jonopath Mor Gulisthan Jonopath Mor GPO Jonopath Mor Paltan Jonopath Mor" +
                        "Jonopath Mor Press Club Jonopath Mor High Court Jonopath Mor Motsho Bhobon Jonopath Mor" +
                        "Jonopath Mor Shahbag Jonopath Mor Bangla Motor Jonopath Mor Kawran Bazar Jonopath Mor Farmgate Jonopath Mor Khamarbari Jonopath Mor" +
                        "Jonopath Mor Agargaon Jonopath Mor Taltola Jonopath Mor Shewrapara Jonopath Mor Kazipara Jonopath Mor Mirpur 10 Jonopath Mor" +
                        "Jonopath Mor Mirpur 11 Jonopath Mor Purobi Jonopath Mor Pallabi Jonopath Mor" +
                        "Jonopath Mor Mirpur 12 Jonopath Mor" +
                        "Gulisthan GPO Gulisthan Paltan Gulisthan" +
                        "Gulisthan Press Club Gulisthan High Court Gulisthan Motsho Bhobon Gulisthan" +
                        "Gulisthan Shahbag Gulisthan Bangla Motor Gulisthan Kawran Bazar Gulisthan Farmgate Gulisthan Khamarbari Gulisthan" +
                        "Gulisthan Agargaon Gulisthan Taltola Gulisthan Shewrapara Gulisthan Kazipara Gulisthan Mirpur 10 Gulisthan" +
                        "Gulisthan Mirpur 11 Gulisthan Purobi Gulisthan Pallabi Gulisthan" +
                        "Gulisthan Mirpur 12 Gulisthan" +
                        "GPO Paltan GPO Press Club GPO High Court GPO Motsho Bhobon GPO" +
                        "GPO Shahbag GPO Bangla Motor GPO Kawran Bazar GPO Farmgate GPO Khamarbari GPO" +
                        "GPO Agargaon GPO Taltola GPO Shewrapara GPO Kazipara GPO Mirpur 10 GPO" +
                        "GPO Mirpur 11 GPO Purobi GPO Pallabi GPO" +
                        "GPO Mirpur 12 GPO" +
                        "Paltan Press Club Paltan High Court Paltan Motsho Bhobon Paltan" +
                        "Paltan Shahbag Paltan Bangla Motor Paltan Kawran Bazar Paltan Farmgate Paltan Khamarbari Paltan" +
                        "Paltan Agargaon Paltan Taltola Paltan Shewrapara Paltan Kazipara Paltan Mirpur 10 Paltan" +
                        "Paltan Mirpur 11 Paltan Purobi Paltan Pallabi Paltan" +
                        "Paltan Mirpur 12 Paltan" +
                        "Press Club High Court Press Club Motsho Bhobon Press Club" +
                        "Press Club Shahbag Press Club Bangla Motor Press Club Kawran Bazar Press Club Farmgate Press Club Khamarbari Press Club" +
                        "Press Club Agargaon Press Club Taltola Press Club Shewrapara Press Club Kazipara Press Club Mirpur 10 Press Club" +
                        "Press Club Mirpur 11 Press Club Purobi Press Club Pallabi Press Club" +
                        "Press Club Mirpur 12 Press Club" +
                        "High Court Motsho Bhobon High Court" +
                        "High Court Shahbag High Court Bangla Motor High Court Kawran Bazar High Court Farmgate High Court Khamarbari High Court" +
                        "High Court Agargaon High Court Taltola High Court Shewrapara High Court Kazipara High Court Mirpur 10 High Court" +
                        "High Court Mirpur 11 High Court Purobi High Court Pallabi High Court" +
                        "High Court Mirpur 12 High Court" +
                        "Motsho Bhobon Shahbag Motsho Bhobon Bangla Motor Motsho Bhobon Kawran Bazar Motsho Bhobon Farmgate Motsho Bhobon Khamarbari Motsho Bhobon" +
                        "Motsho Bhobon Agargaon Motsho Bhobon Taltola Motsho Bhobon Shewrapara Motsho Bhobon Kazipara Motsho Bhobon Mirpur 10 Motsho Bhobon" +
                        "Motsho Bhobon Mirpur 11 Motsho Bhobon Purobi Motsho Bhobon Pallabi Motsho Bhobon" +
                        "Motsho Bhobon Mirpur 12 Motsho Bhobon" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag Farmgate Shahbag Khamarbari Shahbag" +
                        "Shahbag Agargaon Shahbag Taltola Shahbag Shewrapara Shahbag Kazipara Shahbag Mirpur 10 Shahbag" +
                        "Shahbag Mirpur 11 Shahbag Purobi Shahbag Pallabi Shahbag" +
                        "Shahbag Mirpur 12 Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Khamarbari Bangla Motor" +
                        "Bangla Motor Agargaon Bangla Motor Taltola Bangla Motor Shewrapara Bangla Motor Kazipara Bangla Motor Mirpur 10 Bangla Motor" +
                        "Bangla Motor Mirpur 11 Bangla Motor Purobi Bangla Motor Pallabi Bangla Motor" +
                        "Bangla Motor Mirpur 12 Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Khamarbari Kawran Bazar" +
                        "Kawran Bazar Agargaon Kawran Bazar Taltola Kawran Bazar Shewrapara Kawran Bazar Kazipara Kawran Bazar Mirpur 10 Kawran Bazar" +
                        "Kawran Bazar Mirpur 11 Kawran Bazar Purobi Kawran Bazar Pallabi Kawran Bazar" +
                        "Kawran Bazar Mirpur 12 Kawran Bazar" +
                        "Farmgate Khamarbari Farmgate" +
                        "Farmgate Agargaon Farmgate Taltola Farmgate Shewrapara Farmgate Kazipara Farmgate Mirpur 10 Farmgate" +
                        "Farmgate Mirpur 11 Farmgate Purobi Farmgate Pallabi Farmgate" +
                        "Farmgate Mirpur 12 Farmgate" +
                        "Khamarbari Agargaon Khamarbari Taltola Khamarbari Shewrapara Khamarbari Kazipara Khamarbari Mirpur 10 Khamarbari" +
                        "Khamarbari Mirpur 11 Khamarbari Purobi Khamarbari Pallabi Khamarbari" +
                        "Khamarbari Mirpur 12 Khamarbari" +
                        "Agargaon Taltola Agargaon Shewrapara Agargaon Kazipara Agargaon Mirpur 10 Agargaon" +
                        "Agargaon Mirpur 11 Agargaon Purobi Agargaon Pallabi Agargaon" +
                        "Agargaon Mirpur 12 Agargaon" +
                        "Taltola Shewrapara Taltola Kazipara Taltola Mirpur 10 Taltola" +
                        "Taltola Mirpur 11 Taltola Purobi Taltola Pallabi Taltola" +
                        "Taltola Mirpur 12 Taltola" +
                        "Shewrapara Kazipara Shewrapara Mirpur 10 Shewrapara" +
                        "Shewrapara Mirpur 11 Shewrapara Purobi Shewrapara Pallabi Shewrapara" +
                        "Shewrapara Mirpur 12 Shewrapara" +
                        "Kazipara Mirpur 10 Kazipara" +
                        "Kazipara Mirpur 11 Kazipara Purobi Kazipara Pallabi Kazipara" +
                        "Kazipara Mirpur 12 Kazipara" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Pallabi Mirpur 10" +
                        "Mirpur 10 Mirpur 12 Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Pallabi Mirpur 11" +
                        "Mirpur 11 Mirpur 12 Mirpur 11" +
                        "Purobi Pallabi Purobi" +
                        "Purobi Mirpur 12 Purobi" +
                        "Pallabi Mirpur 12 Pallabi"));


        buses.add(new Bus(R.drawable.logo,"Intercity",
                "Chandra Zirani Bazar Chandra Baipayl Chandra Nobinagar Chandra Savar Chandra Hemayetpur Chandra Aminbazar Chandra Gabtoli Chandra" +
                        "Chandra Technical Chandra Ansar Camp Chandra Mirpur 1 Chandra Mirpur 10 Chandra Mirpur 11 Chandra Purobi Chandra Kalshi Chandra" +
                        "Chandra ECB Square Chandra MES Chandra Shewra Chandra Kuril Bishwa Road Chandra Khilkhet Chandra Airport Chandra Jasimuddin Chandra" +
                        "Chandra Azampur Chandra House Building Chandra" +
                        "Chandra Abdullahpur Chandra" +
                        "Zirani Bazar Baipayl Zirani Bazar Nobinagar Zirani Bazar Savar Zirani Bazar Hemayetpur Zirani Bazar Aminbazar Zirani Bazar Gabtoli Zirani Bazar" +
                        "Zirani Bazar Technical Zirani Bazar Ansar Camp Zirani Bazar Mirpur 1 Zirani Bazar Mirpur 10 Zirani Bazar Mirpur 11 Zirani Bazar Purobi Zirani Bazar Kalshi Zirani Bazar" +
                        "Zirani Bazar ECB Square Zirani Bazar MES Zirani Bazar Shewra Zirani Bazar Kuril Bishwa Road Zirani Bazar Khilkhet Zirani Bazar Airport Zirani Bazar Jasimuddin Zirani Bazar" +
                        "Zirani Bazar Azampur Zirani Bazar House Building Zirani Bazar" +
                        "Zirani Bazar Abdullahpur Zirani Bazar" +
                        "Baipayl Nobinagar Baipayl Savar Baipayl Hemayetpur Baipayl Aminbazar Baipayl Gabtoli Baipayl" +
                        "Baipayl Technical Baipayl Ansar Camp Baipayl Mirpur 1 Baipayl Mirpur 10 Baipayl Mirpur 11 Baipayl Purobi Baipayl Kalshi Baipayl" +
                        "Baipayl ECB Square Baipayl MES Baipayl Shewra Baipayl Kuril Bishwa Road Baipayl Khilkhet Baipayl Airport Baipayl Jasimuddin Baipayl" +
                        "Baipayl Azampur Baipayl House Building Baipayl" +
                        "Baipayl Abdullahpur Baipayl" +
                        "Nobinagar Savar Nobinagar Hemayetpur Nobinagar Aminbazar Nobinagar Gabtoli Nobinagar" +
                        "Nobinagar Technical Nobinagar Ansar Camp Nobinagar Mirpur 1 Nobinagar Mirpur 10 Nobinagar Mirpur 11 Nobinagar Purobi Nobinagar Kalshi Nobinagar" +
                        "Nobinagar ECB Square Nobinagar MES Nobinagar Shewra Nobinagar Kuril Bishwa Road Nobinagar Khilkhet Nobinagar Airport Nobinagar Jasimuddin Nobinagar" +
                        "Nobinagar Azampur Nobinagar House Building Nobinagar" +
                        "Nobinagar Abdullahpur Nobinagar" +
                        "Savar Hemayetpur Savar Aminbazar Savar Gabtoli Savar" +
                        "Savar Technical Savar Ansar Camp Savar Mirpur 1 Savar Mirpur 10 Savar Mirpur 11 Savar Purobi Savar Kalshi Savar" +
                        "Savar ECB Square Savar MES Savar Shewra Savar Kuril Bishwa Road Savar Khilkhet Savar Airport Savar Jasimuddin Savar" +
                        "Savar Azampur Savar House Building Savar" +
                        "Savar Abdullahpur Savar" +
                        "Hemayetpur Aminbazar Hemayetpur Gabtoli Hemayetpur" +
                        "Hemayetpur Technical Hemayetpur Ansar Camp Hemayetpur Mirpur 1 Hemayetpur Mirpur 10 Hemayetpur Mirpur 11 Hemayetpur Purobi Hemayetpur Kalshi Hemayetpur" +
                        "Hemayetpur ECB Square Hemayetpur MES Hemayetpur Shewra Hemayetpur Kuril Bishwa Road Hemayetpur Khilkhet Hemayetpur Airport Hemayetpur Jasimuddin Hemayetpur" +
                        "Hemayetpur Azampur Hemayetpur House Building Hemayetpur" +
                        "Hemayetpur Abdullahpur Hemayetpur" +
                        "Aminbazar Gabtoli Aminbazar" +
                        "Aminbazar Technical Aminbazar Ansar Camp Aminbazar Mirpur 1 Aminbazar Mirpur 10 Aminbazar Mirpur 11 Aminbazar Purobi Aminbazar Kalshi Aminbazar" +
                        "Aminbazar ECB Square Aminbazar MES Aminbazar Shewra Aminbazar Kuril Bishwa Road Aminbazar Khilkhet Aminbazar Airport Aminbazar Jasimuddin Aminbazar" +
                        "Aminbazar Azampur Aminbazar House Building Aminbazar" +
                        "Aminbazar Abdullahpur Aminbazar" +
                        "Gabtoli Technical Gabtoli Ansar Camp Gabtoli Mirpur 1 Gabtoli Mirpur 10 Gabtoli Mirpur 11 Gabtoli Purobi Gabtoli Kalshi Gabtoli" +
                        "Gabtoli ECB Square Gabtoli MES Gabtoli Shewra Gabtoli Kuril Bishwa Road Gabtoli Khilkhet Gabtoli Airport Gabtoli Jasimuddin Gabtoli" +
                        "Gabtoli Azampur Gabtoli House Building Gabtoli" +
                        "Gabtoli Abdullahpur Gabtoli" +
                        "Technical Ansar Camp Technical Mirpur 1 Technical Mirpur 10 Technical Mirpur 11 Technical Purobi Technical Kalshi Technical" +
                        "Technical ECB Square Technical MES Technical Shewra Technical Kuril Bishwa Road Technical Khilkhet Technical Airport Technical Jasimuddin Technical" +
                        "Technical Azampur Technical House Building Technical" +
                        "Technical Abdullahpur Technical" +
                        "Ansar Camp Mirpur 1 Ansar Camp Mirpur 10 Ansar Camp Mirpur 11 Ansar Camp Purobi Ansar Camp Kalshi Ansar Camp" +
                        "Ansar Camp ECB Square Ansar Camp MES Ansar Camp Shewra Ansar Camp Kuril Bishwa Road Ansar Camp Khilkhet Ansar Camp Airport Ansar Camp Jasimuddin Ansar Camp" +
                        "Ansar Camp Azampur Ansar Camp House Building Ansar Camp" +
                        "Ansar Camp Abdullahpur Ansar Camp" +
                        "Mirpur 1 Mirpur 10 Mirpur 1 Mirpur 11 Mirpur 1 Purobi Mirpur 1 Kalshi Mirpur 1" +
                        "Mirpur 1 ECB Square Mirpur 1 MES Mirpur 1 Shewra Mirpur 1 Kuril Bishwa Road Mirpur 1 Khilkhet Mirpur 1 Airport Mirpur 1 Jasimuddin Mirpur 1" +
                        "Mirpur 1 Azampur Mirpur 1 House Building Mirpur 1" +
                        "Mirpur 1 Abdullahpur Mirpur 1" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10" +
                        "Mirpur 10 ECB Square Mirpur 10 MES Mirpur 10 Shewra Mirpur 10 Kuril Bishwa Road Mirpur 10 Khilkhet Mirpur 10 Airport Mirpur 10 Jasimuddin Mirpur 10" +
                        "Mirpur 10 Azampur Mirpur 10 House Building Mirpur 10" +
                        "Mirpur 10 Abdullahpur Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Kalshi Mirpur 11" +
                        "Mirpur 11 ECB Square Mirpur 11 MES Mirpur 11 Shewra Mirpur 11 Kuril Bishwa Road Mirpur 11 Khilkhet Mirpur 11 Airport Mirpur 11 Jasimuddin Mirpur 11" +
                        "Mirpur 11 Azampur Mirpur 11 House Building Mirpur 11" +
                        "Mirpur 11 Abdullahpur Mirpur 11" +
                        "Purobi Kalshi Purobi" +
                        "Purobi ECB Square Purobi MES Purobi Shewra Purobi Kuril Bishwa Road Purobi Khilkhet Purobi Airport Purobi Jasimuddin Purobi" +
                        "Purobi Azampur Purobi House Building Purobi" +
                        "Purobi Abdullahpur Purobi" +
                        "Kalshi ECB Square Kalshi MES Kalshi Shewra Kalshi Kuril Bishwa Road Kalshi Khilkhet Kalshi Airport Kalshi Jasimuddin Kalshi" +
                        "Kalshi Azampur Kalshi House Building Kalshi" +
                        "Kalshi Abdullahpur Kalshi" +
                        "ECB Square MES ECB Square Shewra ECB Square Kuril Bishwa Road ECB Square Khilkhet ECB Square Airport ECB Square Jasimuddin ECB Square" +
                        "ECB Square Azampur ECB Square House Building ECB Square" +
                        "ECB Square Abdullahpur ECB Square" +
                        "MES Shewra MES Kuril Bishwa Road MES Khilkhet MES Airport MES Jasimuddin MES" +
                        "MES Azampur MES House Building MES" +
                        "MES Abdullahpur MES" +
                        "Shewra Kuril Bishwa Road Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra" +
                        "Shewra Azampur Shewra House Building Shewra" +
                        "Shewra Abdullahpur Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road" +
                        "Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet" +
                        "Khilkhet Azampur Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet" +
                        "Airport Jasimuddin Airport" +
                        "Airport Azampur Airport House Building Airport" +
                        "Airport Abdullahpur Airport" +
                        "Jasimuddin Azampur Jasimuddin House Building Jasimuddin" +
                        "Jasimuddin Abdullahpur Jasimuddin" +
                        "Azampur House Building Azampur" +
                        "Azampur Abdullahpur Azampur" +
                        "House Building Abdullahpur House Building"));


        buses.add(new Bus(R.drawable.logo,"Itihas Paribahan",
                "Savar Hemayetpur Savar Aminbazar Savar Gabtoli Savar Technical Savar Kallayanpur Savar Shyamoli Savar Shishu Mela Savar College Gate Savar" +
                        "Savar Asad Gate Savar Khamarbari Savar Farmgate Savar Kawran Bazar Savar Bangla Motor Savar Shahbag Savar Motsho Bhobon Savar" +
                        "Savar Kakrail Savar Paltan Savar Gulisthan Savar Dayaganj Savar" +
                        "Savar Postogola Savar" +
                        "Hemayetpur Aminbazar Hemayetpur Gabtoli Hemayetpur Technical Hemayetpur Kallayanpur Hemayetpur Shyamoli Hemayetpur Shishu Mela Hemayetpur College Gate Hemayetpur" +
                        "Hemayetpur Asad Gate Hemayetpur Khamarbari Hemayetpur Farmgate Hemayetpur Kawran Bazar Hemayetpur Bangla Motor Hemayetpur Shahbag Hemayetpur Motsho Bhobon Hemayetpur" +
                        "Hemayetpur Kakrail Hemayetpur Paltan Hemayetpur Gulisthan Hemayetpur Dayaganj Hemayetpur" +
                        "Hemayetpur Postogola Hemayetpur" +
                        "Aminbazar Gabtoli Aminbazar Technical Aminbazar Kallayanpur Aminbazar Shyamoli Aminbazar Shishu Mela Aminbazar College Gate Aminbazar" +
                        "Aminbazar Asad Gate Aminbazar Khamarbari Aminbazar Farmgate Aminbazar Kawran Bazar Aminbazar Bangla Motor Aminbazar Shahbag Aminbazar Motsho Bhobon Aminbazar" +
                        "Aminbazar Kakrail Aminbazar Paltan Aminbazar Gulisthan Aminbazar Dayaganj Aminbazar" +
                        "Aminbazar Postogola Aminbazar" +
                        "Gabtoli Technical Gabtoli Kallayanpur Gabtoli Shyamoli Gabtoli Shishu Mela Gabtoli College Gate Gabtoli" +
                        "Gabtoli Asad Gate Gabtoli Khamarbari Gabtoli Farmgate Gabtoli Kawran Bazar Gabtoli Bangla Motor Gabtoli Shahbag Gabtoli Motsho Bhobon Gabtoli" +
                        "Gabtoli Kakrail Gabtoli Paltan Gabtoli Gulisthan Gabtoli Dayaganj Gabtoli" +
                        "Gabtoli Postogola Gabtoli" +
                        "Technical Kallayanpur Technical Shyamoli Technical Shishu Mela Technical College Gate Technical" +
                        "Technical Asad Gate Technical Khamarbari Technical Farmgate Technical Kawran Bazar Technical Bangla Motor Technical Shahbag Technical Motsho Bhobon Technical" +
                        "Technical Kakrail Technical Paltan Technical Gulisthan Technical Dayaganj Technical" +
                        "Technical Postogola Technical" +
                        "Kallayanpur Shyamoli Kallayanpur Shishu Mela Kallayanpur College Gate Kallayanpur" +
                        "Kallayanpur Asad Gate Kallayanpur Khamarbari Kallayanpur Farmgate Kallayanpur Kawran Bazar Kallayanpur Bangla Motor Kallayanpur Shahbag Kallayanpur Motsho Bhobon Kallayanpur" +
                        "Kallayanpur Kakrail Kallayanpur Paltan Kallayanpur Gulisthan Kallayanpur Dayaganj Kallayanpur" +
                        "Kallayanpur Postogola Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli College Gate Shyamoli" +
                        "Shyamoli Asad Gate Shyamoli Khamarbari Shyamoli Farmgate Shyamoli Kawran Bazar Shyamoli Bangla Motor Shyamoli Shahbag Shyamoli Motsho Bhobon Shyamoli" +
                        "Shyamoli Kakrail Shyamoli Paltan Shyamoli Gulisthan Shyamoli Dayaganj Shyamoli" +
                        "Shyamoli Postogola Shyamoli" +
                        "Asad Gate Khamarbari Asad Gate Farmgate Asad Gate Kawran Bazar Asad Gate Bangla Motor Asad Gate Shahbag Asad Gate Motsho Bhobon Asad Gate" +
                        "Asad Gate Kakrail Asad Gate Paltan Asad Gate Gulisthan Asad Gate Dayaganj Asad Gate" +
                        "Asad Gate Postogola Asad Gate" +
                        "Shishu Mela College Gate Shishu Mela" +
                        "Shishu Mela Asad Gate Shishu Mela Khamarbari Shishu Mela Farmgate Shishu Mela Kawran Bazar Shishu Mela Bangla Motor Shishu Mela Shahbag Shishu Mela Motsho Bhobon Shishu Mela" +
                        "Shishu Mela Kakrail Shishu Mela Paltan Shishu Mela Gulisthan Shishu Mela Dayaganj Shishu Mela" +
                        "Shishu Mela Postogola Shishu Mela" +
                        "College Gate Asad Gate College Gate Khamarbari College Gate Farmgate College Gate Kawran Bazar College Gate Bangla Motor College Gate Shahbag College Gate Motsho Bhobon College Gate" +
                        "College Gate Kakrail College Gate Paltan College Gate Gulisthan College Gate Dayaganj College Gate" +
                        "College Gate Postogola College Gate" +
                        "Khamarbari Farmgate Khamarbari Kawran Bazar Khamarbari Bangla Motor Khamarbari Shahbag Khamarbari Motsho Bhobon Khamarbari" +
                        "Khamarbari Kakrail Khamarbari Paltan Khamarbari Gulisthan Khamarbari Dayaganj Khamarbari" +
                        "Khamarbari Postogola Khamarbari" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate Shahbag Farmgate Motsho Bhobon Farmgate" +
                        "Farmgate Kakrail Farmgate Paltan Farmgate Gulisthan Farmgate Dayaganj Farmgate" +
                        "Farmgate Postogola Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar" +
                        "Kawran Bazar Kakrail Kawran Bazar Paltan Kawran Bazar Gulisthan Kawran Bazar Dayaganj Kawran Bazar" +
                        "Kawran Bazar Postogola Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor" +
                        "Bangla Motor Kakrail Bangla Motor Paltan Bangla Motor Gulisthan Bangla Motor Dayaganj Bangla Motor" +
                        "Bangla Motor Postogola Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag" +
                        "Shahbag Kakrail Shahbag Paltan Shahbag Gulisthan Shahbag Dayaganj Shahbag" +
                        "Shahbag Postogola Shahbag" +
                        "Motsho Bhobon Kakrail Motsho Bhobon Paltan Motsho Bhobon Gulisthan Motsho Bhobon Dayaganj Motsho Bhobon" +
                        "Motsho Bhobon Postogola Motsho Bhobon" +
                        "Kakrail Paltan Kakrail Gulisthan Kakrail Dayaganj Kakrail" +
                        "Kakrail Postogola Kakrail" +
                        "Paltan Gulisthan Paltan Dayaganj Paltan" +
                        "Paltan Postogola Paltan" +
                        "Gulisthan Dayaganj Gulisthan" +
                        "Gulisthan Postogola Gulisthan" +
                        "Dayaganj Postogola Dayaganj"));


        buses.add(new Bus(R.drawable.logo,"Itihas Paribahan 2",
                "Mirpur 14 Mirpur 10 Mirpur 14 Mirpur 2 Mirpur 14 Sony Hall Mirpur 14 Mirpur 1 Mirpur 14 Ansar Camp Mirpur 14 Technical Mirpur 14 Gabtoli Mirpur 14" +
                        "Mirpur 14 Aminbazar Mirpur 14 Hemayetpur Mirpur 14 Savar Mirpur 14 Nobinagar Mirpur 14 Baipayl Mirpur 14" +
                        "Mirpur 14 Zirani Bazar Mirpur 14" +
                        "Mirpur 10 Mirpur 2 Mirpur 10 Sony Hall Mirpur 10 Mirpur 1 Mirpur 10 Ansar Camp Mirpur 10 Technical Mirpur 10 Gabtoli Mirpur 10" +
                        "Mirpur 10 Aminbazar Mirpur 10 Hemayetpur Mirpur 10 Savar Mirpur 10 Nobinagar Mirpur 10 Baipayl Mirpur 10" +
                        "Mirpur 10 Zirani Bazar Mirpur 10" +
                        "Mirpur 2 Sony Hall Mirpur 2 Mirpur 1 Mirpur 2 Ansar Camp Mirpur 2 Technical Mirpur 2 Gabtoli Mirpur 2" +
                        "Mirpur 2 Aminbazar Mirpur 2 Hemayetpur Mirpur 2 Savar Mirpur 2 Nobinagar Mirpur 2 Baipayl Mirpur 2" +
                        "Mirpur 2 Zirani Bazar Mirpur 2" +
                        "Sony Hall Mirpur 1 Sony Hall Ansar Camp Sony Hall Technical Sony Hall Gabtoli Sony Hall" +
                        "Sony Hall Aminbazar Sony Hall Hemayetpur Sony Hall Savar Sony Hall Nobinagar Sony Hall Baipayl Sony Hall" +
                        "Sony Hall Zirani Bazar Sony Hall" +
                        "Mirpur 1 Ansar Camp Mirpur 1 Technical Mirpur 1 Gabtoli Mirpur 1" +
                        "Mirpur 1 Aminbazar Mirpur 1 Hemayetpur Mirpur 1 Savar Mirpur 1 Nobinagar Mirpur 1 Baipayl Mirpur 1" +
                        "Mirpur 1 Zirani Bazar Mirpur 1" +
                        "Ansar Camp Technical Ansar Camp Gabtoli Ansar Camp" +
                        "Ansar Camp Aminbazar Ansar Camp Hemayetpur Ansar Camp Savar Ansar Camp Nobinagar Ansar Camp Baipayl Ansar Camp" +
                        "Ansar Camp Zirani Bazar Ansar Camp" +
                        "Technical Gabtoli Technical" +
                        "Technical Aminbazar Technical Hemayetpur Technical Savar Technical Nobinagar Technical Baipayl Technical" +
                        "Technical Zirani Bazar Technical" +
                        "Gabtoli Aminbazar Gabtoli Hemayetpur Gabtoli Savar Gabtoli Nobinagar Gabtoli Baipayl Gabtoli" +
                        "Gabtoli Zirani Bazar Gabtoli" +
                        "Aminbazar Hemayetpur Aminbazar Savar Aminbazar Nobinagar Aminbazar Baipayl Aminbazar" +
                        "Aminbazar Zirani Bazar Aminbazar" +
                        "Hemayetpur Savar Hemayetpur Nobinagar Hemayetpur Baipayl Hemayetpur" +
                        "Hemayetpur Zirani Bazar Hemayetpur" +
                        "Savar Nobinagar Savar Baipayl Savar" +
                        "Savar Zirani Bazar Savar" +
                        "Nobinagar Baipayl Nobinagar" +
                        "Nobinagar Zirani Bazar Nobinagar" +
                        "Baipayl Zirani Bazar Baipayl"));



        buses.add(new Bus(R.drawable.logo,"J M Super Paribahan",
                "Jatrabari Sayedabad Jatrabari Mugdapara Jatrabari Basabo Jatrabari" +
                        "Jatrabari Khilgaon Jatrabari Malibagh Jatrabari Rampura Jatrabari Merul Jatrabari Badda Jatrabari Natun Bazar Jatrabari" +
                        "Jatrabari Nadda Jatrabari Kuril Bishwa Road Jatrabari Khilkhet Jatrabari Airport Jatrabari House Building Jatrabari" +
                        "Jatrabari Abdullahpur Jatrabari Tongi Jatrabari" +
                        "Sayedabad Mugdapara Sayedabad Basabo Sayedabad" +
                        "Sayedabad Khilgaon Sayedabad Malibagh Sayedabad Rampura Sayedabad Merul Sayedabad Badda Sayedabad Natun Bazar Sayedabad" +
                        "Sayedabad Nadda Sayedabad Kuril Bishwa Road Sayedabad Khilkhet Sayedabad Airport Sayedabad House Building Sayedabad" +
                        "Sayedabad Abdullahpur Sayedabad Tongi Sayedabad" +
                        "Mugdapara Basabo Mugdapara" +
                        "Mugdapara Khilgaon Mugdapara Malibagh Mugdapara Rampura Mugdapara Merul Mugdapara Badda Mugdapara Natun Bazar Mugdapara" +
                        "Mugdapara Nadda Mugdapara Kuril Bishwa Road Mugdapara Khilkhet Mugdapara Airport Mugdapara House Building Mugdapara" +
                        "Mugdapara Abdullahpur Mugdapara Tongi Mugdapara" +
                        "Basabo Khilgaon Basabo Malibagh Basabo Rampura Basabo Merul Basabo Badda Basabo Natun Bazar Basabo" +
                        "Basabo Nadda Basabo Kuril Bishwa Road Basabo Khilkhet Basabo Airport Basabo House Building Basabo" +
                        "Basabo Abdullahpur Basabo Tongi Basabo" +
                        "Khilgaon Malibagh Khilgaon Rampura Khilgaon Merul Khilgaon Badda Khilgaon Natun Bazar Khilgaon" +
                        "Khilgaon Nadda Khilgaon Kuril Bishwa Road Khilgaon Khilkhet Khilgaon Airport Khilgaon House Building Khilgaon" +
                        "Khilgaon Abdullahpur Khilgaon Tongi Khilgaon" +
                        "Malibagh Rampura Malibagh Merul Malibagh Badda Malibagh Natun Bazar Malibagh" +
                        "Malibagh Nadda Malibagh Kuril Bishwa Road Malibagh Khilkhet Malibagh Airport Malibagh House Building Malibagh" +
                        "Malibagh Abdullahpur Malibagh Tongi Malibagh" +
                        "Rampura Merul Rampura Badda Rampura Natun Bazar Rampura" +
                        "Rampura Nadda Rampura Kuril Bishwa Road Rampura Khilkhet Rampura Airport Rampura House Building Rampura" +
                        "Rampura Abdullahpur Rampura Tongi Rampura" +
                        "Merul Badda Merul Natun Bazar Merul" +
                        "Merul Nadda Merul Kuril Bishwa Road Merul Khilkhet Merul Airport Merul House Building Merul" +
                        "Merul Abdullahpur Merul Tongi Merul" +
                        "Badda Natun Bazar Badda" +
                        "Badda Nadda Badda Kuril Bishwa Road Badda Khilkhet Badda Airport Badda House Building Badda" +
                        "Badda Abdullahpur Badda Tongi Badda" +
                        "Natun Bazar Nadda Natun Bazar Kuril Bishwa Road Natun Bazar Khilkhet Natun Bazar Airport Badda House Building Natun Bazar" +
                        "Natun Bazar Abdullahpur Natun Bazar Tongi Natun Bazar" +
                        "Nadda Kuril Bishwa Road Nadda Khilkhet Nadda Airport Nadda House Building Nadda" +
                        "Nadda Abdullahpur Nadda Tongi Nadda" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road Tongi Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet Tongi Khilkhet" +
                        "Airport House Building Airport" +
                        "Airport Abdullahpur Airport Tongi Airport" +
                        "House Building Abdullahpur House Building Tongi House Building" +
                        "Abdullahpur Tongi Abdullahpur"));


        buses.add(new Bus(R.drawable.logo,"Jabale Nur Paribahan",
                "Ansar Camp Mirpur 1 Ansar Camp Sony Hall Ansar Camp Mirpur 2 Ansar Camp Mirpur 10 Ansar Camp Mirpur 11 Ansar Camp" +
                        "Ansar Camp Purobi Ansar Camp Kalshi Ansar Camp ECB Chottor Ansar Camp MES Ansar Camp Kuril Bishwa Road Ansar Camp" +
                        "Ansar Camp Bashundhara Ansar Camp Nadda Ansar Camp" +
                        "Ansar Camp Natun Bazar Ansar Camp" +
                        "Mirpur 1 Sony Hall Mirpur 1 Mirpur 2 Mirpur 1 Mirpur 10 Mirpur 1 Mirpur 11 Mirpur 1" +
                        "Mirpur 1 Purobi Mirpur 1 Kalshi Mirpur 1 ECB Chottor Mirpur 1 MES Mirpur 1 Kuril Bishwa Road Mirpur 1" +
                        "Mirpur 1 Bashundhara Mirpur 1 Nadda Mirpur 1" +
                        "Mirpur 1 Natun Bazar Mirpur 1" +
                        "Sony Hall Mirpur 2 Sony Hall Mirpur 10 Sony Hall Mirpur 11 Sony Hall" +
                        "Sony Hall Purobi Sony Hall Kalshi Sony Hall ECB Chottor Sony Hall MES Sony Hall Kuril Bishwa Road Sony Hall" +
                        "Sony Hall Bashundhara Sony Hall Nadda Sony Hall" +
                        "Sony Hall Natun Bazar Sony Hall" +
                        "Mirpur 2 Mirpur 10 Mirpur 2 Mirpur 11 Mirpur 2" +
                        "Mirpur 2 Purobi Mirpur 2 Kalshi Mirpur 2 ECB Chottor Mirpur 2 MES Mirpur 2 Kuril Bishwa Road Mirpur 2" +
                        "Mirpur 2 Bashundhara Mirpur 2 Nadda Mirpur 2" +
                        "Mirpur 2 Natun Bazar Mirpur 2" +
                        "Mirpur 10 Mirpur 11 Mirpur 10" +
                        "Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10 ECB Chottor Mirpur 10 MES Mirpur 10 Kuril Bishwa Road Mirpur 10" +
                        "Mirpur 10 Bashundhara Mirpur 10 Nadda Mirpur 10" +
                        "Mirpur 10 Natun Bazar Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Kalshi Mirpur 11 ECB Chottor Mirpur 11 MES Mirpur 11 Kuril Bishwa Road Mirpur 11" +
                        "Mirpur 11 Bashundhara Mirpur 11 Nadda Mirpur 11" +
                        "Mirpur 11 Natun Bazar Mirpur 11" +
                        "Purobi Kalshi Purobi ECB Chottor Purobi MES Purobi Kuril Bishwa Road Purobi" +
                        "Purobi Bashundhara Purobi Nadda Purobi" +
                        "Purobi Natun Bazar Purobi" +
                        "Kalshi ECB Chottor Kalshi MES Kalshi Kuril Bishwa Road Kalshi" +
                        "Kalshi Bashundhara Kalshi Nadda Kalshi" +
                        "Kalshi Natun Bazar Kalshi" +
                        "ECB Chottor MES ECB Chottor Kuril Bishwa Road ECB Chottor" +
                        "ECB Chottor Bashundhara ECB Chottor Nadda ECB Chottor" +
                        "ECB Chottor Natun Bazar ECB Chottor" +
                        "MES Kuril Bishwa Road MES" +
                        "MES Bashundhara MES Nadda MES" +
                        "MES Natun Bazar MES" +
                        "Kuril Bishwa Road Bashundhara Kuril Bishwa Road Nadda Kuril Bishwa Road" +
                        "Kuril Bishwa Road Natun Bazar Kuril Bishwa Road" +
                        "Bashundhara Nadda Bashundhara" +
                        "Bashundhara Natun Bazar Bashundhara" +
                        "Nadda Natun Bazar Nadda"));

        buses.add(new Bus(R.drawable.logo,"Jabale Nur Paribahan 2",
                "Agargaon Taltola Agargaon Shewrapara Agargaon Kazipara Agargaon Mirpur 10 Agargaon Mirpur 11 Agargaon Purobi Agargaon Kalshi Agargaon" +
                        "Agargaon ECB Square Agargaon MES Agargaon Shewra Agargaon Kuril Bishwa Road Agargaon Khilkhet Agargaon Airport Agargaon Jasimuddin Agargaon" +
                        "Agargaon Rajlakshmi Agargaon Azampur Agargaon House Building Agargaon" +
                        "Agargaon Abdullahpur Agargaon" +
                        "Taltola Shewrapara Taltola Kazipara Taltola Mirpur 10 Taltola Mirpur 11 Taltola Purobi Taltola Kalshi Taltola" +
                        "Taltola ECB Square Taltola MES Taltola Shewra Taltola Kuril Bishwa Road Taltola Khilkhet Taltola Airport Taltola Jasimuddin Taltola" +
                        "Taltola Rajlakshmi Taltola Azampur Taltola House Building Taltola" +
                        "Taltola Abdullahpur Taltola" +
                        "Shewrapara Kazipara Shewrapara Mirpur 10 Shewrapara Mirpur 11 Shewrapara Purobi Shewrapara Kalshi Shewrapara" +
                        "Shewrapara ECB Square Shewrapara MES Shewrapara Shewra Shewrapara Kuril Bishwa Road Shewrapara Khilkhet Shewrapara Airport Shewrapara Jasimuddin Shewrapara" +
                        "Shewrapara Rajlakshmi Shewrapara Azampur Shewrapara House Building Shewrapara" +
                        "Shewrapara Abdullahpur Shewrapara" +
                        "Kazipara Mirpur 10 Kazipara Mirpur 11 Kazipara Purobi Kazipara Kalshi Kazipara" +
                        "Kazipara ECB Square Kazipara MES Kazipara Shewra Kazipara Kuril Bishwa Road Kazipara Khilkhet Kazipara Airport Kazipara Jasimuddin Kazipara" +
                        "Kazipara Rajlakshmi Kazipara Azampur Kazipara House Building Kazipara" +
                        "Kazipara Abdullahpur Kazipara" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10" +
                        "Mirpur 10 ECB Square Mirpur 10 MES Mirpur 10 Shewra Mirpur 10 Kuril Bishwa Road Mirpur 10 Khilkhet Mirpur 10 Airport Mirpur 10 Jasimuddin Mirpur 10" +
                        "Mirpur 10 Rajlakshmi Mirpur 10 Azampur Mirpur 10 House Building Mirpur 10" +
                        "Mirpur 10 Abdullahpur Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Kalshi Mirpur 11" +
                        "Mirpur 11 ECB Square Mirpur 11 MES Mirpur 11 Shewra Mirpur 11 Kuril Bishwa Road Mirpur 11 Khilkhet Mirpur 11 Airport Mirpur 11 Jasimuddin Mirpur 11" +
                        "Mirpur 11 Rajlakshmi Mirpur 11 Azampur Mirpur 11 House Building Mirpur 11" +
                        "Mirpur 11 Abdullahpur Mirpur 11" +
                        "Purobi Kalshi Purobi" +
                        "Purobi ECB Square Purobi MES Purobi Shewra Purobi Kuril Bishwa Road Purobi Khilkhet Purobi Airport Purobi Jasimuddin Purobi" +
                        "Purobi Rajlakshmi Purobi Azampur Purobi House Building Purobi" +
                        "Purobi Abdullahpur Purobi" +
                        "ECB Square MES ECB Square Shewra ECB Square Kuril Bishwa Road ECB Square Khilkhet ECB Square Airport ECB Square Jasimuddin ECB Square" +
                        "ECB Square Rajlakshmi ECB Square Azampur ECB Square House Building ECB Square" +
                        "ECB Square Abdullahpur ECB Square" +
                        "MES Shewra MES Kuril Bishwa Road MES Khilkhet MES Airport MES Jasimuddin MES" +
                        "MES Rajlakshmi MES Azampur MES House Building MES" +
                        "MES Abdullahpur MES" +
                        "Shewra Kuril Bishwa Road Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra" +
                        "Shewra Rajlakshmi Shewra Azampur Shewra House Building Shewra" +
                        "Shewra Abdullahpur Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road" +
                        "Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet" +
                        "Khilkhet Rajlakshmi Khilkhet Azampur Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet" +
                        "Airport Jasimuddin Airport" +
                        "Airport Rajlakshmi Airport Azampur Airport House Building Airport" +
                        "Airport Abdullahpur Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin Azampur Jasimuddin House Building Jasimuddin" +
                        "Jasimuddin Abdullahpur Jasimuddin" +
                        "Rajlakshmi Azampur Rajlakshmi House Building Rajlakshmi" +
                        "Rajlakshmi Abdullahpur Rajlakshmi" +
                        "Azampur House Building Azampur" +
                        "Azampur Abdullahpur Azampur" +
                        "House Building Abdullahpur House Building"));


        buses.add(new Bus(R.drawable.logo,"Janjabil",
                "Gabtoli Beribadh Gabtoli Rayer Bazar Gabtoli Sikder Medical Gabtoli Hazaribag Gabtoli Nawabganj Gabtoli Kamrangirchar Gabtoli" +
                        "Gabtoli Showari Ghat Gabtoli Mitford Ghat Gabtoli" +
                        "Gabtoli Babu Bazar Gabtoli" +
                        "Beribadh Rayer Bazar Beribadh Sikder Medical Beribadh Hazaribag Beribadh Nawabganj Beribadh Kamrangirchar Beribadh" +
                        "Beribadh Showari Ghat Beribadh Mitford Ghat Beribadh" +
                        "Beribadh Babu Bazar Beribadh" +
                        "Rayer Bazar Sikder Medical Rayer Bazar Hazaribag Rayer Bazar Nawabganj Rayer Bazar Kamrangirchar Rayer Bazar" +
                        "Rayer Bazar Showari Ghat Rayer Bazar Mitford Ghat Rayer Bazar" +
                        "Rayer Bazar Babu Bazar Rayer Bazar" +
                        "Sikder Medical Hazaribag Sikder Medical Nawabganj Sikder Medical Kamrangirchar Sikder Medical" +
                        "Sikder Medical Showari Ghat Sikder Medical Mitford Ghat Sikder Medical" +
                        "Sikder Medical Babu Bazar Sikder Medical" +
                        "Hazaribag Nawabganj Hazaribag Kamrangirchar Hazaribag" +
                        "Hazaribag Showari Ghat Hazaribag Mitford Ghat Hazaribag" +
                        "Hazaribag Babu Bazar Hazaribag" +
                        "Nawabganj Kamrangirchar Nawabganj" +
                        "Nawabganj Showari Ghat Nawabganj Mitford Ghat Nawabganj" +
                        "Nawabganj Babu Bazar Nawabganj" +
                        "Kamrangirchar Showari Ghat Kamrangirchar Mitford Ghat Kamrangirchar" +
                        "Kamrangirchar Babu Bazar Kamrangirchar" +
                        "Showari Ghat Mitford Ghat Showari Ghat" +
                        "Showari Ghat Babu Bazar Showari Ghat" +
                        "Mitford Ghat Babu Bazar Mitford Ghat"));


        buses.add(new Bus(R.drawable.logo,"Kanak",
                "Mirpur 1 Sony Hall Mirpur 1 Mirpur 2 Mirpur 1 Mirpur 10 Mirpur 1 Mirpur 11 Mirpur 1 Purobi Mirpur 1 Kalshi Mirpur 1" +
                        "Mirpur 1 ECB Square Mirpur 1 MES Mirpur 1 Shewra Mirpur 1 Kuril Bishwa Road Mirpur 1 Khilkhet Mirpur 1 Airport Mirpur 1 Jasimuddin Mirpur 1" +
                        "Mirpur 1 Azampur Mirpur 1 House Building Mirpur 1" +
                        "Mirpur 1 Abdullahpur Mirpur 1" +
                        "Sony Hall Mirpur 2 Sony Hall Mirpur 10 Sony Hall Mirpur 11 Sony Hall Purobi Sony Hall Kalshi Sony Hall" +
                        "Sony Hall ECB Square Sony Hall MES Sony Hall Shewra Sony Hall Kuril Bishwa Road Sony Hall Khilkhet Sony Hall Airport Sony Hall Jasimuddin Sony Hall" +
                        "Sony Hall Azampur Sony Hall House Building Sony Hall" +
                        "Sony Hall Abdullahpur Sony Hall" +
                        "Mirpur 2 Mirpur 10 Mirpur 2 Mirpur 11 Mirpur 2 Purobi Mirpur 2 Kalshi Mirpur 2" +
                        "Mirpur 2 ECB Square Mirpur 2 MES Mirpur 2 Shewra Mirpur 2 Kuril Bishwa Road Mirpur 2 Khilkhet Mirpur 2 Airport Mirpur 2 Jasimuddin Mirpur 2" +
                        "Mirpur 2 Azampur Mirpur 2 House Building Mirpur 2" +
                        "Mirpur 2 Abdullahpur Mirpur 2" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10" +
                        "Mirpur 10 ECB Square Mirpur 10 MES Mirpur 10 Shewra Mirpur 10 Kuril Bishwa Road Mirpur 10 Khilkhet Mirpur 10 Airport Mirpur 10 Jasimuddin Mirpur 10" +
                        "Mirpur 10 Azampur Mirpur 10 House Building Mirpur 10" +
                        "Mirpur 10 Abdullahpur Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Kalshi Mirpur 11" +
                        "Mirpur 11 ECB Square Mirpur 11 MES Mirpur 11 Shewra Mirpur 11 Kuril Bishwa Road Mirpur 11 Khilkhet Mirpur 11 Airport Mirpur 11 Jasimuddin Mirpur 11" +
                        "Mirpur 11 Azampur Mirpur 11 House Building Mirpur 11" +
                        "Mirpur 11 Abdullahpur Mirpur 11" +
                        "Purobi Kalshi Purobi" +
                        "Purobi ECB Square Purobi MES Purobi Shewra Purobi Kuril Bishwa Road Purobi Khilkhet Purobi Airport Purobi Jasimuddin Purobi" +
                        "Purobi Azampur Purobi House Building Purobi" +
                        "Purobi Abdullahpur Purobi" +
                        "Kalshi ECB Square Kalshi MES Kalshi Shewra Kalshi Kuril Bishwa Road Kalshi Khilkhet Kalshi Airport Kalshi Jasimuddin Kalshi" +
                        "Kalshi Azampur Kalshi House Building Kalshi" +
                        "Kalshi Abdullahpur Kalshi" +
                        "ECB Square MES ECB Square Shewra ECB Square Kuril Bishwa Road ECB Square Khilkhet ECB Square Airport ECB Square Jasimuddin ECB Square" +
                        "ECB Square Azampur ECB Square House Building ECB Square" +
                        "ECB Square Abdullahpur ECB Square" +
                        "MES Shewra MES Kuril Bishwa Road MES Khilkhet MES Airport MES Jasimuddin MES" +
                        "MES Azampur MES House Building MES" +
                        "MES Abdullahpur MES" +
                        "Shewra Kuril Bishwa Road Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra" +
                        "Shewra Azampur Shewra House Building Shewra" +
                        "Shewra Abdullahpur Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road" +
                        "Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet" +
                        "Khilkhet Azampur Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet" +
                        "Airport Jasimuddin Airport" +
                        "Airport Azampur Airport House Building Airport" +
                        "Airport Abdullahpur Airport" +
                        "Jasimuddin Azampur Jasimuddin House Building Jasimuddin" +
                        "Jasimuddin Abdullahpur Jasimuddin" +
                        "Azampur House Building Azampur" +
                        "Azampur Abdullahpur Azampur" +
                        "House Building Abdullahpur House Building"));


        buses.add(new Bus(R.drawable.logo,"Khajababa Paribahan",
                "Mirpur 12 Pallabi Mirpur 12 Purobi Mirpur 12 Mirpur 11 Mirpur 12 Mirpur 10 Mirpur 12 Kazipara Mirpur 12 Shewrapara Mirpur 12" +
                        "Mirpur 12 Taltola Mirpur 12 Agargaon Mirpur 12 Bijoy Sarani Mirpur 12 Farmgate Mirpur 12 Kawran Bazar Mirpur 12 Bangla Motor Mirpur 12" +
                        "Mirpur 12 Shahbag Mirpur 12 Motsho Bhobon Mirpur 12 High Court Mirpur 12 Press Club Mirpur 12 Paltan Mirpur 12 Gulisthan Mirpur 12" +
                        "Mirpur 12 Sayedabad Mirpur 12 Jatrabari Mirpur 12" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Bijoy Sarani Pallabi Farmgate Pallabi Kawran Bazar Pallabi Bangla Motor Pallabi" +
                        "Pallabi Shahbag Pallabi Motsho Bhobon Pallabi High Court Pallabi Press Club Pallabi Paltan Pallabi Gulisthan Pallabi" +
                        "Pallabi Sayedabad Pallabi Jatrabari Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Bijoy Sarani Purobi Farmgate Purobi Kawran Bazar Purobi Bangla Motor Purobi" +
                        "Purobi Shahbag Purobi Motsho Bhobon Purobi High Court Purobi Press Club Purobi Paltan Purobi Gulisthan Purobi" +
                        "Purobi Sayedabad Purobi Jatrabari Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Bijoy Sarani Mirpur 11 Farmgate Mirpur 11 Kawran Bazar Mirpur 11 Bangla Motor Mirpur 11" +
                        "Mirpur 11 Shahbag Mirpur 11 Motsho Bhobon Mirpur 11 High Court Mirpur 11 Press Club Mirpur 11 Paltan Mirpur 11 Gulisthan Mirpur 11" +
                        "Mirpur 11 Sayedabad Mirpur 11 Jatrabari Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Bijoy Sarani Mirpur 10 Farmgate Mirpur 10 Kawran Bazar Mirpur 10 Bangla Motor Mirpur 10" +
                        "Mirpur 10 Shahbag Mirpur 10 Motsho Bhobon Mirpur 10 High Court Mirpur 10 Press Club Mirpur 10 Paltan Mirpur 10 Gulisthan Mirpur 10" +
                        "Mirpur 10 Sayedabad Mirpur 10 Jatrabari Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Bijoy Sarani Kazipara Farmgate Kazipara Kawran Bazar Kazipara Bangla Motor Kazipara" +
                        "Kazipara Shahbag Kazipara Motsho Bhobon Kazipara High Court Kazipara Press Club Kazipara Paltan Kazipara Gulisthan Kazipara" +
                        "Kazipara Sayedabad Kazipara Jatrabari Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Bijoy Sarani Shewrapara Farmgate Shewrapara Kawran Bazar Shewrapara Bangla Motor Shewrapara" +
                        "Shewrapara Shahbag Shewrapara Motsho Bhobon Shewrapara High Court Shewrapara Press Club Shewrapara Paltan Shewrapara Gulisthan Shewrapara" +
                        "Shewrapara Sayedabad Shewrapara Jatrabari Shewrapara" +
                        "Taltola Agargaon Taltola Bijoy Sarani Taltola Farmgate Taltola Kawran Bazar Taltola Bangla Motor Taltola" +
                        "Taltola Shahbag Taltola Motsho Bhobon Taltola High Court Taltola Press Club Taltola Paltan Taltola Gulisthan Taltola" +
                        "Taltola Sayedabad Taltola Jatrabari Taltola" +
                        "Agargaon Bijoy Sarani Agargaon Farmgate Agargaon Kawran Bazar Agargaon Bangla Motor Agargaon" +
                        "Agargaon Shahbag Agargaon Motsho Bhobon Agargaon High Court Agargaon Press Club Agargaon Paltan Agargaon Gulisthan Agargaon" +
                        "Agargaon Sayedabad Agargaon Jatrabari Agargaon" +
                        "Bijoy Sarani Farmgate Bijoy Sarani Kawran Bazar Bijoy Sarani Bangla Motor Bijoy Sarani" +
                        "Bijoy Sarani Shahbag Bijoy Sarani Motsho Bhobon Bijoy Sarani High Court Bijoy Sarani Press Club Bijoy Sarani Paltan Bijoy Sarani Gulisthan Bijoy Sarani" +
                        "Bijoy Sarani Sayedabad Bijoy Sarani Jatrabari Bijoy Sarani" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate" +
                        "Farmgate Shahbag Farmgate Motsho Bhobon Farmgate High Court Farmgate Press Club Farmgate Paltan Farmgate Gulisthan Farmgate" +
                        "Farmgate Sayedabad Farmgate Jatrabari Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar" +
                        "Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar High Court Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar Gulisthan Kawran Bazar" +
                        "Kawran Bazar Sayedabad Kawran Bazar Jatrabari Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor High Court Bangla Motor Press Club Bangla Motor Paltan Bangla Motor Gulisthan Bangla Motor" +
                        "Bangla Motor Sayedabad Bangla Motor Jatrabari Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag Gulisthan Shahbag" +
                        "Shahbag Sayedabad Shahbag Jatrabari Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon Paltan Motsho Bhobon Gulisthan Motsho Bhobon" +
                        "Motsho Bhobon Sayedabad Motsho Bhobon Jatrabari Motsho Bhobon" +
                        "High Court Press Club High Court Paltan High Court Gulisthan High Court" +
                        "High Court Sayedabad High Court Jatrabari High Court" +
                        "Press Club Paltan Press Club Gulisthan Press Club" +
                        "Press Club Sayedabad Mirpur 12 Jatrabari Mirpur 12" +
                        "Paltan Gulisthan Paltan" +
                        "Paltan Sayedabad Paltan Jatrabari Paltan" +
                        "Gulisthan Sayedabad Gulisthan Jatrabari Gulisthan" +
                        "Sayedabad Jatrabari Sayedabad"));


        buses.add(new Bus(R.drawable.logo,"Labbaik",
                "Savar Hemayetpur Savar Aminbazar Savar Gabtoli Savar Technical Savar Kallayanpur Savar Shyamoli Savar Shishu Mela Savar College Gate Savar" +
                        "Savar Asad Gate Savar Khamarbari Savar Farmgate Savar Kawran Bazar Savar Bangla Motor Savar Moghbazar Savar Mouchak Savar Malibagh Mor Savar" +
                        "Savar Rajarbagh Savar Khilgaon Flyover Savar Basabo Savar Mugdapara Savar Manik Nagar Savar Golapbag Savar Sayedabad Savar Jonopath Mor Savar" +
                        "Savar Jatrabari Savar Shonir Akhra Savar Rayerbag Savar Matuail Savar" +
                        "Savar Sign Board Savar" +
                        "Hemayetpur Aminbazar Hemayetpur Gabtoli Hemayetpur Technical Hemayetpur Kallayanpur Hemayetpur Shyamoli Hemayetpur Shishu Mela Hemayetpur College Gate Hemayetpur" +
                        "Hemayetpur Asad Gate Hemayetpur Khamarbari Hemayetpur Farmgate Hemayetpur Kawran Bazar Hemayetpur Bangla Motor Hemayetpur Moghbazar Hemayetpur Mouchak Hemayetpur Malibagh Mor Hemayetpur" +
                        "Hemayetpur Rajarbagh Hemayetpur Khilgaon Flyover Hemayetpur Basabo Hemayetpur Mugdapara Hemayetpur Manik Nagar Hemayetpur Golapbag Hemayetpur Sayedabad Hemayetpur Jonopath Mor Hemayetpur" +
                        "Hemayetpur Jatrabari Hemayetpur Shonir Akhra Hemayetpur Rayerbag Hemayetpur Matuail Hemayetpur" +
                        "Hemayetpur Sign Board Hemayetpur" +
                        "Aminbazar Gabtoli Aminbazar Technical Aminbazar Kallayanpur Aminbazar Shyamoli Aminbazar Shishu Mela Aminbazar College Gate Aminbazar" +
                        "Aminbazar Asad Gate Aminbazar Khamarbari Aminbazar Farmgate Aminbazar Kawran Bazar Aminbazar Bangla Motor Aminbazar Moghbazar Aminbazar Mouchak Aminbazar Malibagh Mor Aminbazar" +
                        "Aminbazar Rajarbagh Aminbazar Khilgaon Flyover Aminbazar Basabo Aminbazar Mugdapara Aminbazar Manik Nagar Aminbazar Golapbag Aminbazar Sayedabad Aminbazar Jonopath Mor Aminbazar" +
                        "Aminbazar Jatrabari Aminbazar Shonir Akhra Aminbazar Rayerbag Aminbazar Matuail Aminbazar" +
                        "Aminbazar Sign Board Aminbazar" +
                        "Gabtoli Technical Gabtoli Kallayanpur Gabtoli Shyamoli Gabtoli Shishu Mela Gabtoli College Gate Gabtoli" +
                        "Gabtoli Asad Gate Gabtoli Khamarbari Gabtoli Farmgate Gabtoli Kawran Bazar Gabtoli Bangla Motor Gabtoli Moghbazar Gabtoli Mouchak Gabtoli Malibagh Mor Gabtoli" +
                        "Gabtoli Rajarbagh Gabtoli Khilgaon Flyover Gabtoli Basabo Gabtoli Mugdapara Gabtoli Manik Nagar Gabtoli Golapbag Gabtoli Sayedabad Gabtoli Jonopath Mor Gabtoli" +
                        "Gabtoli Jatrabari Gabtoli Shonir Akhra Gabtoli Rayerbag Gabtoli Matuail Gabtoli" +
                        "Gabtoli Sign Board Gabtoli" +
                        "Technical Kallayanpur Technical Shyamoli Technical Shishu Mela Technical College Gate Technical" +
                        "Technical Asad Gate Technical Khamarbari Technical Farmgate Technical Kawran Bazar Technical Bangla Motor Technical Moghbazar Technical Mouchak Technical Malibagh Mor Technical" +
                        "Technical Rajarbagh Technical Khilgaon Flyover Technical Basabo Technical Mugdapara Technical Manik Nagar Technical Golapbag Technical Sayedabad Technical Jonopath Mor Technical" +
                        "Technical Jatrabari Technical Shonir Akhra Technical Rayerbag Technical Matuail Technical" +
                        "Technical Sign Board Technical" +
                        "Kallayanpur Shyamoli Kallayanpur Shishu Mela Kallayanpur College Gate Kallayanpur" +
                        "Kallayanpur Asad Gate Kallayanpur Khamarbari Kallayanpur Farmgate Kallayanpur Kawran Bazar Kallayanpur Bangla Motor Kallayanpur Moghbazar Kallayanpur Mouchak Kallayanpur Malibagh Mor Kallayanpur" +
                        "Kallayanpur Rajarbagh Kallayanpur Khilgaon Flyover Kallayanpur Basabo Kallayanpur Mugdapara Kallayanpur Manik Nagar Kallayanpur Golapbag Kallayanpur Sayedabad Kallayanpur Jonopath Mor Kallayanpur" +
                        "Kallayanpur Jatrabari Kallayanpur Shonir Akhra Kallayanpur Rayerbag Kallayanpur Matuail Kallayanpur" +
                        "Kallayanpur Sign Board Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli College Gate Shyamoli" +
                        "Shyamoli Asad Gate Shyamoli Khamarbari Shyamoli Farmgate Shyamoli Kawran Bazar Shyamoli Bangla Motor Shyamoli Moghbazar Shyamoli Mouchak Shyamoli Malibagh Mor Shyamoli" +
                        "Shyamoli Rajarbagh Shyamoli Khilgaon Flyover Shyamoli Basabo Shyamoli Mugdapara Shyamoli Manik Nagar Shyamoli Golapbag Shyamoli Sayedabad Shyamoli Jonopath Mor Shyamoli" +
                        "Shyamoli Jatrabari Shyamoli Shonir Akhra Shyamoli Rayerbag Shyamoli Matuail Shyamoli" +
                        "Shyamoli Sign Board Shyamoli" +
                        "Shishu Mela College Gate Shishu Mela" +
                        "Shishu Mela Asad Gate Shishu Mela Khamarbari Shishu Mela Farmgate Shishu Mela Kawran Bazar Shishu Mela Bangla Motor Shishu Mela Moghbazar Shishu Mela Mouchak Shishu Mela Malibagh Mor Shishu Mela" +
                        "Shishu Mela Rajarbagh Shishu Mela Khilgaon Flyover Shishu Mela Basabo Shishu Mela Mugdapara Shishu Mela Manik Nagar Shishu Mela Golapbag Shishu Mela Sayedabad Shishu Mela Jonopath Mor Shishu Mela" +
                        "Shishu Mela Jatrabari Shishu Mela Shonir Akhra Shishu Mela Rayerbag Shishu Mela Matuail Shishu Mela" +
                        "Shishu Mela Sign Board Shishu Mela" +
                        "College Gate Asad Gate College Gate Khamarbari College Gate Farmgate College Gate Kawran Bazar College Gate Bangla Motor College Gate Moghbazar College Gate Mouchak College Gate Malibagh Mor College Gate" +
                        "College Gate Rajarbagh College Gate Khilgaon Flyover College Gate Basabo College Gate Mugdapara College Gate Manik Nagar College Gate Golapbag College Gate Sayedabad College Gate Jonopath Mor College Gate" +
                        "College Gate Jatrabari College Gate Shonir Akhra College Gate Rayerbag College Gate Matuail College Gate" +
                        "College Gate Sign Board College Gate" +
                        "Asad Gate Khamarbari Asad Gate Farmgate Asad Gate Kawran Bazar Asad Gate Bangla Motor Asad Gate Moghbazar Asad Gate Mouchak Asad Gate Malibagh Mor Asad Gate" +
                        "Asad Gate Rajarbagh Asad Gate Khilgaon Flyover Asad Gate Basabo Asad Gate Mugdapara Asad Gate Manik Nagar Asad Gate Golapbag Asad Gate Sayedabad Asad Gate Jonopath Mor Asad Gate" +
                        "Asad Gate Jatrabari Asad Gate Shonir Akhra Asad Gate Rayerbag Asad Gate Matuail Asad Gate" +
                        "Asad Gate Sign Board Asad Gate" +
                        "Khamarbari Farmgate Khamarbari Kawran Bazar Khamarbari Bangla Motor Khamarbari Moghbazar Khamarbari Mouchak Khamarbari Malibagh Mor Khamarbari" +
                        "Khamarbari Rajarbagh Khamarbari Khilgaon Flyover Khamarbari Basabo Khamarbari Mugdapara Khamarbari Manik Nagar Khamarbari Golapbag Khamarbari Sayedabad Khamarbari Jonopath Mor Khamarbari" +
                        "Khamarbari Jatrabari Khamarbari Shonir Akhra Khamarbari Rayerbag Khamarbari Matuail Khamarbari" +
                        "Khamarbari Sign Board Khamarbari" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate Moghbazar Farmgate Mouchak Farmgate Malibagh Mor Farmgate" +
                        "Farmgate Rajarbagh Farmgate Khilgaon Flyover Farmgate Basabo Farmgate Mugdapara Farmgate Manik Nagar Farmgate Golapbag Farmgate Sayedabad Farmgate Jonopath Mor Farmgate" +
                        "Farmgate Jatrabari Farmgate Shonir Akhra Farmgate Rayerbag Farmgate Matuail Farmgate" +
                        "Farmgate Sign Board Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar Moghbazar Kawran Bazar Mouchak Kawran Bazar Malibagh Mor Kawran Bazar" +
                        "Kawran Bazar Rajarbagh Kawran Bazar Khilgaon Flyover Kawran Bazar Basabo Kawran Bazar Mugdapara Kawran Bazar Manik Nagar Kawran Bazar Golapbag Kawran Bazar Sayedabad Kawran Bazar Jonopath Mor Kawran Bazar" +
                        "Kawran Bazar Jatrabari Kawran Bazar Shonir Akhra Kawran Bazar Rayerbag Kawran Bazar Matuail Kawran Bazar" +
                        "Kawran Bazar Sign Board Kawran Bazar" +
                        "Bangla Motor Moghbazar Bangla Motor Mouchak Bangla Motor Malibagh Mor Bangla Motor" +
                        "Bangla Motor Rajarbagh Bangla Motor Khilgaon Flyover Bangla Motor Basabo Bangla Motor Mugdapara Bangla Motor Manik Nagar Bangla Motor Golapbag Bangla Motor Sayedabad Bangla Motor Jonopath Mor Bangla Motor" +
                        "Bangla Motor Jatrabari Bangla Motor Shonir Akhra Bangla Motor Rayerbag Bangla Motor Matuail Bangla Motor" +
                        "Bangla Motor Sign Board Bangla Motor" +
                        "Moghbazar Mouchak Moghbazar Malibagh Mor Moghbazar" +
                        "Moghbazar Rajarbagh Moghbazar Khilgaon Flyover Moghbazar Basabo Moghbazar Mugdapara Moghbazar Manik Nagar Moghbazar Golapbag Moghbazar Sayedabad Moghbazar Jonopath Mor Moghbazar" +
                        "Moghbazar Jatrabari Moghbazar Shonir Akhra Moghbazar Rayerbag Moghbazar Matuail Moghbazar" +
                        "Moghbazar Sign Board Moghbazar" +
                        "Mouchak Malibagh Mor Mouchak" +
                        "Mouchak Rajarbagh Mouchak Khilgaon Flyover Mouchak Basabo Mouchak Mugdapara Mouchak Manik Nagar Mouchak Golapbag Mouchak Sayedabad Mouchak Jonopath Mor Mouchak" +
                        "Mouchak Jatrabari Mouchak Shonir Akhra Mouchak Rayerbag Mouchak Matuail Mouchak" +
                        "Mouchak Sign Board Mouchak" +
                        "Malibagh Mor Rajarbagh Malibagh Mor Khilgaon Flyover Malibagh Mor Basabo Malibagh Mor Mugdapara Malibagh Mor Manik Nagar Malibagh Mor Golapbag Malibagh Mor Sayedabad Malibagh Mor Jonopath Mor Malibagh Mor" +
                        "Malibagh Mor Jatrabari Malibagh Mor Shonir Akhra Malibagh Mor Rayerbag Malibagh Mor Matuail Malibagh Mor" +
                        "Malibagh Mor Sign Board Malibagh Mor" +
                        "Rajarbagh Khilgaon Flyover Rajarbagh Basabo Rajarbagh Mugdapara Rajarbagh Manik Nagar Rajarbagh Golapbag Rajarbagh Sayedabad Rajarbagh Jonopath Mor Rajarbagh" +
                        "Rajarbagh Jatrabari Rajarbagh Shonir Akhra Rajarbagh Rayerbag Rajarbagh Matuail Rajarbagh" +
                        "Rajarbagh Sign Board Rajarbagh" +
                        "Khilgaon Flyover Basabo Khilgaon Flyover Mugdapara Khilgaon Flyover Manik Nagar Khilgaon Flyover Golapbag Khilgaon Flyover Sayedabad Khilgaon Flyover Jonopath Mor Khilgaon Flyover" +
                        "Khilgaon Flyover Jatrabari Khilgaon Flyover Shonir Akhra Khilgaon Flyover Rayerbag Khilgaon Flyover Matuail Khilgaon Flyover" +
                        "Khilgaon Flyover Sign Board Khilgaon Flyover" +
                        "Basabo Mugdapara Basabo Manik Nagar Basabo Golapbag Basabo Sayedabad Basabo Jonopath Mor Basabo" +
                        "Basabo Jatrabari Basabo Shonir Akhra Basabo Rayerbag Basabo Matuail Basabo" +
                        "Basabo Sign Board Basabo" +
                        "Mugdapara Manik Nagar Mugdapara Golapbag Mugdapara Sayedabad Mugdapara Jonopath Mor Mugdapara" +
                        "Basabo Jatrabari Mugdapara Shonir Akhra Mugdapara Rayerbag Mugdapara Matuail Mugdapara" +
                        "Mugdapara Sign Board Mugdapara" +
                        "Manik Nagar Golapbag Manik Nagar Sayedabad Manik Nagar Jonopath Mor Manik Nagar" +
                        "Manik Nagar Jatrabari Manik Nagar Shonir Akhra Manik Nagar Rayerbag Manik Nagar Matuail Manik Nagar" +
                        "Manik Nagar Sign Board Manik Nagar" +
                        "Golapbag Sayedabad Golapbag Jonopath Mor Golapbag" +
                        "Golapbag Jatrabari Golapbag Shonir Akhra Golapbag Rayerbag Golapbag Matuail Golapbag" +
                        "Golapbag Sign Board Golapbag" +
                        "Sayedabad Jonopath Mor Sayedabad" +
                        "Sayedabad Jatrabari Sayedabad Shonir Akhra Sayedabad Rayerbag Sayedabad Matuail Sayedabad" +
                        "Sayedabad Sign Board Sayedabad" +
                        "Jonopath Mor Jatrabari Jonopath Mor Shonir Akhra Jonopath Mor Rayerbag Jonopath Mor Matuail Jonopath Mor" +
                        "Jonopath Mor Sign Board Jonopath Mor" +
                        "Jatrabari Shonir Akhra Jatrabari Rayerbag Jatrabari Matuail Jatrabari" +
                        "Jatrabari Sign Board Jatrabari" +
                        "Shonir Akhra Rayerbag Shonir Akhra Matuail Shonir Akhra" +
                        "Shonir Akhra Sign Board Shonir Akhra" +
                        "Rayerbag Matuail Rayerbag" +
                        "Rayerbag Sign Board Rayerbag" +
                        "Matuail Sign Board Matuail"));

        buses.add(new Bus(R.drawable.logo,"Lams Paribahan",
                "Mirpur 12 Pallabi Mirpur 12 Purobi Mirpur 12 Mirpur 11 Mirpur 12 Mirpur 10 Mirpur 12 Kazipara Mirpur 12 Shewrapara Mirpur 12" +
                        "Mirpur 12 Taltola Mirpur 12 Agargaon Mirpur 12 Bijoy Sarani Mirpur 12 Farmgate Mirpur 12 Kawran Bazar Mirpur 12 Bangla Motor Mirpur 12" +
                        "Mirpur 12 Shahbag Mirpur 12 Motsho Bhobon Mirpur 12 High Court Mirpur 12 Press Club Mirpur 12 Paltan Mirpur 12 Daynik Bangla Mor Mirpur 12" +
                        "Mirpur 12 Motijheel Mirpur 12" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Bijoy Sarani Pallabi Farmgate Pallabi Kawran Bazar Pallabi Bangla Motor Pallabi" +
                        "Pallabi Shahbag Pallabi Motsho Bhobon Pallabi High Court Pallabi Press Club Pallabi Paltan Pallabi Daynik Bangla Mor Pallabi" +
                        "Pallabi Motijheel Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Bijoy Sarani Purobi Farmgate Purobi Kawran Bazar Purobi Bangla Motor Purobi" +
                        "Purobi Shahbag Purobi Motsho Bhobon Purobi High Court Purobi Press Club Purobi Paltan Purobi Daynik Bangla Mor Purobi" +
                        "Purobi Motijheel Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Bijoy Sarani Mirpur 11 Farmgate Mirpur 11 Kawran Bazar Mirpur 11 Bangla Motor Mirpur 11" +
                        "Mirpur 11 Shahbag Mirpur 11 Motsho Bhobon Mirpur 11 High Court Mirpur 11 Press Club Mirpur 11 Paltan Mirpur 11 Daynik Bangla Mor Mirpur 11" +
                        "Mirpur 11 Motijheel Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Bijoy Sarani Mirpur 10 Farmgate Mirpur 10 Kawran Bazar Mirpur 10 Bangla Motor Mirpur 10" +
                        "Mirpur 10 Shahbag Mirpur 10 Motsho Bhobon Mirpur 10 High Court Mirpur 10 Press Club Mirpur 10 Paltan Mirpur 10 Daynik Bangla Mor Mirpur 10" +
                        "Mirpur 10 Motijheel Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Bijoy Sarani Kazipara Farmgate Kazipara Kawran Bazar Kazipara Bangla Motor Kazipara" +
                        "Kazipara Shahbag Kazipara Motsho Bhobon Kazipara High Court Kazipara Press Club Kazipara Paltan Kazipara Daynik Bangla Mor Kazipara" +
                        "Kazipara Motijheel Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Bijoy Sarani Shewrapara Farmgate Shewrapara Kawran Bazar Shewrapara Bangla Motor Shewrapara" +
                        "Shewrapara Shahbag Shewrapara Motsho Bhobon Shewrapara High Court Shewrapara Press Club Shewrapara Paltan Shewrapara Daynik Bangla Mor Shewrapara" +
                        "Shewrapara Motijheel Shewrapara" +
                        "Taltola Agargaon Taltola Bijoy Sarani Taltola Farmgate Taltola Kawran Bazar Taltola Bangla Motor Taltola" +
                        "Taltola Shahbag Taltola Motsho Bhobon Taltola High Court Taltola Press Club Taltola Paltan Taltola Daynik Bangla Mor Taltola" +
                        "Taltola Motijheel Taltola" +
                        "Agargaon Bijoy Sarani Agargaon Farmgate Agargaon Kawran Bazar Agargaon Bangla Motor Agargaon" +
                        "Agargaon Shahbag Agargaon Motsho Bhobon Agargaon High Court Agargaon Press Club Agargaon Paltan Agargaon Daynik Bangla Mor Agargaon" +
                        "Agargaon Motijheel Agargaon" +
                        "Bijoy Sarani Farmgate Bijoy Sarani Kawran Bazar Bijoy Sarani Bangla Motor Bijoy Sarani" +
                        "Bijoy Sarani Shahbag Bijoy Sarani Motsho Bhobon Bijoy Sarani High Court Bijoy Sarani Press Club Bijoy Sarani Paltan Bijoy Sarani Daynik Bangla Mor Bijoy Sarani" +
                        "Bijoy Sarani Motijheel Bijoy Sarani" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate" +
                        "Farmgate Shahbag Farmgate Motsho Bhobon Farmgate High Court Farmgate Press Club Farmgate Paltan Farmgate Daynik Bangla Mor Farmgate" +
                        "Farmgate Motijheel Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar" +
                        "Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar High Court Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar Daynik Bangla Mor Kawran Bazar" +
                        "Kawran Bazar Motijheel Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor High Court Bangla Motor Press Club Bangla Motor Paltan Bangla Motor Daynik Bangla Mor Bangla Motor" +
                        "Bangla Motor Motijheel Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag Daynik Bangla Mor Shahbag" +
                        "Shahbag Motijheel Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon Paltan Motsho Bhobon Daynik Bangla Mor Motsho Bhobon" +
                        "Motsho Bhobon Motijheel Motsho Bhobon" +
                        "High Court Press Club High Court Paltan High Court Daynik Bangla Mor High Court" +
                        "High Court Motijheel High Court" +
                        "Press Club Paltan Press Club Daynik Bangla Mor Press Club" +
                        "Press Club Motijheel Press Club" +
                        "Paltan Daynik Bangla Mor Paltan" +
                        "Paltan Motijheel Paltan" +
                        "Daynik Bangla Mor Motijheel Daynik Bangla Mor"));


        buses.add(new Bus(R.drawable.logo,"MTCL 2",
                "Mohammadpur Asad Gate Mohammadpur Dhanmondi 27 Mohammadpur Dhanmondi 32 Mohammadpur Kalabagan Mohammadpur Science Lab Mohammadpur" +
                        "Mohammadpur Bata Signal Mohammadpur Shahbag Mohammadpur Motsho Bhobon Mohammadpur High Court Mohammadpur Press Club Mohammadpur" +
                        "Mohammadpur Paltan Mohammadpur GPO Mohammadpur Gulisthan Mohammadpur Motijheel Mohammadpur" +
                        "Mohammadpur Arambagh Mohammadpur" +
                        "Asad Gate Dhanmondi 27 Asad Gate Dhanmondi 32 Asad Gate Kalabagan Asad Gate Science Lab Asad Gate" +
                        "Asad Gate Bata Signal Asad Gate Shahbag Asad Gate Motsho Bhobon Asad Gate High Court Asad Gate Press Club Asad Gate" +
                        "Asad Gate Paltan Asad Gate GPO Asad Gate Gulisthan Asad Gate Motijheel Asad Gate" +
                        "Asad Gate Arambagh Asad Gate" +
                        "Dhanmondi 27 Dhanmondi 32 Dhanmondi 27 Kalabagan Dhanmondi 27 Science Lab Dhanmondi 27" +
                        "Dhanmondi 27 Bata Signal Dhanmondi 27 Shahbag Dhanmondi 27 Motsho Bhobon Dhanmondi 27 High Court Dhanmondi 27 Press Club Dhanmondi 27" +
                        "Dhanmondi 27 Paltan Dhanmondi 27 GPO Dhanmondi 27 Gulisthan Dhanmondi 27 Motijheel Dhanmondi 27" +
                        "Dhanmondi 27 Arambagh Dhanmondi 27" +
                        "Dhanmondi 32 Kalabagan Dhanmondi 32 Science Lab Dhanmondi 32" +
                        "Dhanmondi 32 Bata Signal Dhanmondi 32 Shahbag Dhanmondi 32 Motsho Bhobon Dhanmondi 32 High Court Dhanmondi 32 Press Club Dhanmondi 32" +
                        "Dhanmondi 32 Paltan Dhanmondi 32 GPO Dhanmondi 32 Gulisthan Dhanmondi 32 Motijheel Dhanmondi 32" +
                        "Dhanmondi 32 Arambagh Dhanmondi 32" +
                        "Kalabagan Science Lab Kalabagan" +
                        "Kalabagan Bata Signal Kalabagan Shahbag Kalabagan Motsho Bhobon Kalabagan High Court Kalabagan Press Club Kalabagan" +
                        "Kalabagan Paltan Kalabagan GPO Kalabagan Gulisthan Kalabagan Motijheel Kalabagan" +
                        "Kalabagan Arambagh Kalabagan" +
                        "Science Lab Bata Signal Science Lab Shahbag Science Lab Motsho Bhobon Science Lab High Court Science Lab Press Club Science Lab" +
                        "Science Lab Paltan Science Lab GPO Science Lab Gulisthan Science Lab Motijheel Science Lab" +
                        "Science Lab Arambagh Science Lab" +
                        "Bata Signal Shahbag Bata Signal Motsho Bhobon Bata Signal High Court Bata Signal Press Club Bata Signal" +
                        "Bata Signal Paltan Bata Signal GPO Bata Signal Gulisthan Bata Signal Motijheel Bata Signal" +
                        "Bata Signal Arambagh Bata Signal" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag" +
                        "Shahbag Paltan Shahbag GPO Shahbag Gulisthan Shahbag Motijheel Shahbag" +
                        "Shahbag Arambagh Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon" +
                        "Motsho Bhobon Paltan Motsho Bhobon GPO Motsho Bhobon Gulisthan Motsho Bhobon Motijheel Motsho Bhobon" +
                        "Motsho Bhobon Arambagh Motsho Bhobon" +
                        "High Court Press Club High Court" +
                        "High Court Paltan High Court GPO High Court Gulisthan High Court Motijheel High Court" +
                        "High Court Arambagh High Court" +
                        "Press Club Paltan Press Club GPO Press Club Gulisthan Press Club Motijheel Press Club" +
                        "Press Club Arambagh Press Club" +
                        "Paltan GPO Paltan Gulisthan Paltan Motijheel Paltan" +
                        "Paltan Arambagh Paltan" +
                        "GPO Gulisthan GPO Motijheel GPO" +
                        "GPO Arambagh GPO" +
                        "Gulisthan Motijheel Gulisthan" +
                        "Gulisthan Arambagh Gulisthan" +
                        "Motijheel Arambagh Motijheel"));


        buses.add(new Bus(R.drawable.logo,"Malancha Transport",
                "Mohammadpur Shankar Mohammadpur Star Kabab Mohammadpur Dhanmondi 15 Mohammadpur Jigatola Mohammadpur" +
                        "Mohammadpur City College Mohammadpur Science Lab Mohammadpur Bata Signal Mohammadpur Katabon Mohammadpur" +
                        "Mohammadpur Shahbag Mohammadpur Motsho Bhobon Mohammadpur High Court Mohammadpur Press Club Mohammadpur" +
                        "Mohammadpur Paltan Mohammadpur GPO Mohammadpur Gulisthan Mohammadpur Dayaganj Mohammadpur" +
                        "Mohammadpur Dhupkhola Mohammadpur" +
                        "Shankar Star Kabab Shankar Dhanmondi 15 Shankar Jigatola Shankar" +
                        "Shankar City College Shankar Science Lab Shankar Bata Signal Shankar Katabon Shankar" +
                        "Shankar Shahbag Shankar Motsho Bhobon Shankar High Court Shankar Press Club Shankar" +
                        "Shankar Paltan Shankar GPO Shankar Gulisthan Shankar Dayaganj Shankar" +
                        "Shankar Dhupkhola Shankar" +
                        "Star Kabab Dhanmondi 15 Star Kabab Jigatola Star Kabab" +
                        "Star Kabab City College Star Kabab Science Lab Star Kabab Bata Signal Star Kabab Katabon Star Kabab" +
                        "Star Kabab Shahbag Star Kabab Motsho Bhobon Star Kabab High Court Star Kabab Press Club Star Kabab" +
                        "Star Kabab Paltan Star Kabab GPO Star Kabab Gulisthan Star Kabab Dayaganj Star Kabab" +
                        "Star Kabab Dhupkhola Star Kabab" +
                        "Dhanmondi 15 Jigatola Dhanmondi 15" +
                        "Dhanmondi 15 City College Dhanmondi 15 Science Lab Dhanmondi 15 Bata Signal Dhanmondi 15 Katabon Dhanmondi 15" +
                        "Dhanmondi 15 Shahbag Dhanmondi 15 Motsho Bhobon Dhanmondi 15 High Court Dhanmondi 15 Press Club Dhanmondi 15" +
                        "Dhanmondi 15 Paltan Dhanmondi 15 GPO Dhanmondi 15 Gulisthan Dhanmondi 15 Dayaganj Dhanmondi 15" +
                        "Dhanmondi 15 Dhupkhola Dhanmondi 15" +
                        "Jigatola City College Jigatola Science Lab Jigatola Bata Signal Jigatola Katabon Jigatola" +
                        "Jigatola Shahbag Jigatola Motsho Bhobon Jigatola High Court Jigatola Press Club Jigatola" +
                        "Jigatola Paltan Jigatola GPO Jigatola Gulisthan Jigatola Dayaganj Jigatola" +
                        "Jigatola Dhupkhola Jigatola" +
                        "City College Science Lab City College Bata Signal City College Katabon City College" +
                        "City College Shahbag City College Motsho Bhobon City College High Court City College Press Club City College" +
                        "City College Paltan City College GPO City College Gulisthan City College Dayaganj City College" +
                        "City College Dhupkhola City College" +
                        "Science Lab Bata Signal Science Lab Katabon Science Lab" +
                        "Science Lab Shahbag Science Lab Motsho Bhobon Science Lab High Court Science Lab Press Club Science Lab" +
                        "Science Lab Paltan Science Lab GPO Science Lab Gulisthan Science Lab Dayaganj Science Lab" +
                        "Science Lab Dhupkhola Science Lab" +
                        "Bata Signal Katabon Bata Signal Shahbag Bata Signal Motsho Bhobon Bata Signal High Court Bata Signal Press Club Bata Signal" +
                        "Bata Signal Paltan Bata Signal GPO Bata Signal Gulisthan Bata Signal Dayaganj Bata Signal" +
                        "Bata Signal Dhupkhola Bata Signal" +
                        "Katabon Shahbag Katabon Motsho Bhobon Katabon High Court Katabon Press Club Katabon" +
                        "Katabon Paltan Katabon GPO Katabon Gulisthan Katabon Dayaganj Katabon" +
                        "Katabon Dhupkhola Katabon" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag" +
                        "Shahbag Paltan Shahbag GPO Shahbag Gulisthan Shahbag Dayaganj Shahbag" +
                        "Shahbag Dhupkhola Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon" +
                        "Motsho Bhobon Paltan Motsho Bhobon GPO Motsho Bhobon Gulisthan Motsho Bhobon Dayaganj Motsho Bhobon" +
                        "Motsho Bhobon Dhupkhola Motsho Bhobon" +
                        "High Court Press Club High Court" +
                        "High Court Paltan High Court GPO High Court Gulisthan High Court Dayaganj High Court" +
                        "High Court Dhupkhola High Court" +
                        "Press Club Paltan Press Club GPO Press Club Gulisthan Press Club Dayaganj Press Club" +
                        "Press Club Dhupkhola Press Club" +
                        "Paltan GPO Paltan Gulisthan Paltan Dayaganj Paltan" +
                        "Paltan Dhupkhola Paltan" +
                        "GPO Gulisthan GPO Dayaganj GPO" +
                        "GPO Dhupkhola GPO" +
                        "Gulisthan Dayaganj Gulisthan" +
                        "Gulisthan Dhupkhola Gulisthan" +
                        "Dayaganj Dhupkhola Dayaganj"));

        buses.add(new Bus(R.drawable.logo,"Manjil Express",
                "Chittagang Road Sign Board Chittagang Road Shonir Akhra Chittagang Road Gulisthan Chittagang Road GPO Chittagang Road Paltan Chittagang Road" +
                        "Chittagang Road Kakrail Chittagang Road Malibagh Mor Chittagang Road Mouchak Chittagang Road Moghbazar Chittagang Road Satrasta Chittagang Road" +
                        "Chittagang Road Nabisco Chittagang Road Mohakhali Chittagang Road Banani Chittagang Road Kakoli Chittagang Road Kuril Bishwa Road Chittagang Road" +
                        "Chittagang Road Khilkhet Chittagang Road Airport Chittagang Road Jasimuddin Chittagang Road Rajlakshmi Chittagang Road Azampur Chittagang Road House Building Chittagang Road" +
                        "Chittagang Road Abdullahpur Chittagang Road" +
                        "Sign Board Shonir Akhra Sign Board Gulisthan Sign Board GPO Sign Board Paltan Sign Board" +
                        "Sign Board Kakrail Sign Board Malibagh Mor Sign Board Mouchak Sign Board Moghbazar Sign Board Satrasta Sign Board" +
                        "Sign Board Nabisco Sign Board Mohakhali Sign Board Banani Sign Board Kakoli Sign Board Kuril Bishwa Road Sign Board" +
                        "Sign Board Khilkhet Sign Board Airport Sign Board Jasimuddin Sign Board Rajlakshmi Sign Board Azampur Sign Board House Building Sign Board" +
                        "Sign Board Abdullahpur Sign Board" +
                        "Shonir Akhra Gulisthan Shonir Akhra GPO Shonir Akhra Paltan Shonir Akhra" +
                        "Shonir Akhra Kakrail Shonir Akhra Malibagh Mor Shonir Akhra Mouchak Shonir Akhra Moghbazar Shonir Akhra Satrasta Shonir Akhra" +
                        "Shonir Akhra Nabisco Shonir Akhra Mohakhali Shonir Akhra Banani Shonir Akhra Kakoli Shonir Akhra Kuril Bishwa Road Shonir Akhra" +
                        "Shonir Akhra Khilkhet Shonir Akhra Airport Shonir Akhra Jasimuddin Shonir Akhra Rajlakshmi Shonir Akhra Azampur Shonir Akhra House Building Shonir Akhra" +
                        "Shonir Akhra Abdullahpur Shonir Akhra" +
                        "Gulisthan GPO Gulisthan Paltan Gulisthan" +
                        "Gulisthan Kakrail Gulisthan Malibagh Mor Gulisthan Mouchak Gulisthan Moghbazar Gulisthan Satrasta Gulisthan" +
                        "Gulisthan Nabisco Gulisthan Mohakhali Gulisthan Banani Gulisthan Kakoli Gulisthan Kuril Bishwa Road Gulisthan" +
                        "Gulisthan Khilkhet Gulisthan Airport Gulisthan Jasimuddin Gulisthan Rajlakshmi Gulisthan Azampur Gulisthan House Building Gulisthan" +
                        "Gulisthan Abdullahpur Gulisthan" +
                        "GPO Paltan GPO" +
                        "GPO Kakrail GPO Malibagh Mor GPO Mouchak GPO Moghbazar GPO Satrasta GPO" +
                        "GPO Nabisco GPO Mohakhali GPO Banani GPO Kakoli GPO Kuril Bishwa Road GPO" +
                        "GPO Khilkhet GPO Airport GPO Jasimuddin GPO Rajlakshmi GPO Azampur GPO House Building GPO" +
                        "GPO Abdullahpur GPO" +
                        "Paltan Kakrail Paltan Malibagh Mor Paltan Mouchak Paltan Moghbazar Paltan Satrasta Paltan" +
                        "Paltan Nabisco Paltan Mohakhali Paltan Banani Paltan Kakoli Paltan Kuril Bishwa Road Paltan" +
                        "Paltan Khilkhet Paltan Airport Paltan Jasimuddin Paltan Rajlakshmi Paltan Azampur Paltan House Building Paltan" +
                        "Paltan Abdullahpur Paltan" +
                        "Kakrail Malibagh Mor Kakrail Mouchak Kakrail Moghbazar Kakrail Satrasta Kakrail" +
                        "Kakrail Nabisco Kakrail Mohakhali Kakrail Banani Kakrail Kakoli Kakrail Kuril Bishwa Road Kakrail" +
                        "Kakrail Khilkhet Kakrail Airport Kakrail Jasimuddin Kakrail Rajlakshmi Kakrail Azampur Kakrail House Building Kakrail" +
                        "Kakrail Abdullahpur Kakrail" +
                        "Malibagh Mor Mouchak Malibagh Mor Moghbazar Malibagh Mor Satrasta Malibagh Mor" +
                        "Malibagh Mor Nabisco Malibagh Mor Mohakhali Malibagh Mor Banani Malibagh Mor Kakoli Malibagh Mor Kuril Bishwa Road Malibagh Mor" +
                        "Malibagh Mor Khilkhet Malibagh Mor Airport Malibagh Mor Jasimuddin Malibagh Mor Rajlakshmi Malibagh Mor Azampur Malibagh Mor House Building Malibagh Mor" +
                        "Malibagh Mor Abdullahpur Malibagh Mor" +
                        "Mouchak Moghbazar Mouchak Satrasta Mouchak" +
                        "Mouchak Nabisco Mouchak Mohakhali Mouchak Banani Mouchak Kakoli Mouchak Kuril Bishwa Road Mouchak" +
                        "Mouchak Khilkhet Mouchak Airport Mouchak Jasimuddin Mouchak Rajlakshmi Mouchak Azampur Mouchak House Building Mouchak" +
                        "Mouchak Abdullahpur Mouchak" +
                        "Moghbazar Satrasta Moghbazar" +
                        "Moghbazar Nabisco Moghbazar Mohakhali Moghbazar Banani Moghbazar Kakoli Moghbazar Kuril Bishwa Road Moghbazar" +
                        "Moghbazar Khilkhet Moghbazar Airport Moghbazar Jasimuddin Moghbazar Rajlakshmi Moghbazar Azampur Moghbazar House Building Moghbazar" +
                        "Moghbazar Abdullahpur Moghbazar" +
                        "Satrasta Nabisco Satrasta Mohakhali Satrasta Banani Satrasta Kakoli Satrasta Kuril Bishwa Road Satrasta" +
                        "Satrasta Khilkhet Satrasta Airport Satrasta Jasimuddin Satrasta Rajlakshmi Satrasta Azampur Satrasta House Building Satrasta" +
                        "Satrasta Abdullahpur Satrasta" +
                        "Nabisco Mohakhali Nabisco Banani Nabisco Kakoli Nabisco Kuril Bishwa Road Nabisco" +
                        "Nabisco Khilkhet Nabisco Airport Nabisco Jasimuddin Nabisco Rajlakshmi Nabisco Azampur Nabisco House Building Nabisco" +
                        "Nabisco Abdullahpur Nabisco" +
                        "Mohakhali Banani Mohakhali Kakoli Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Mohakhali Khilkhet Mohakhali Airport Mohakhali Jasimuddin Mohakhali Rajlakshmi Mohakhali Azampur Mohakhali House Building Mohakhali" +
                        "Mohakhali Abdullahpur Mohakhali" +
                        "Banani Kakoli Banani Kuril Bishwa Road Banani" +
                        "Banani Khilkhet Banani Airport Banani Jasimuddin Banani Rajlakshmi Banani Azampur Banani House Building Banani" +
                        "Banani Abdullahpur Banani" +
                        "Kakoli Kuril Bishwa Road Kakoli" +
                        "Kakoli Khilkhet Kakoli Airport Kakoli Jasimuddin Kakoli Rajlakshmi Kakoli Azampur Kakoli House Building Kakoli" +
                        "Kakoli Abdullahpur Kakoli" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet Rajlakshmi Khilkhet Azampur Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet" +
                        "Airport Jasimuddin Airport Rajlakshmi Airport Azampur Airport House Building Airport" +
                        "Airport Abdullahpur Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin Azampur Jasimuddin House Building Jasimuddin" +
                        "Jasimuddin Abdullahpur Jasimuddin" +
                        "Rajlakshmi Azampur Rajlakshmi House Building Rajlakshmi" +
                        "Rajlakshmi Abdullahpur Rajlakshmi" +
                        "Azampur House Building Azampur" +
                        "Azampur Abdullahpur Azampur" +
                        "House Building Abdullahpur House Building"));


        buses.add(new Bus(R.drawable.logo,"Meghla Transport",
                "Kalabagan Science Lab Kalabagan Bata Signal Kalabagan Katabon Kalabagan Shahbag Kalabagan High Court Kalabagan Press Club Kalabagan Paltan Kalabagan" +
                        "Kalabagan GPO Kalabagan Gulisthan Kalabagan Sayedabad Kalabagan Jatrabari Kalabagan Shonir Akhra Kalabagan Sign Board Kalabagan Kachpur Kalabagan" +
                        "Kalabagan Bhulta Kalabagan" +
                        "Science Lab Bata Signal Science Lab Katabon Science Lab Shahbag Science Lab High Court Science Lab Press Club Science Lab Paltan Science Lab" +
                        "Science Lab GPO Science Lab Gulisthan Science Lab Sayedabad Science Lab Jatrabari Science Lab Shonir Akhra Science Lab Sign Board Science Lab Kachpur Science Lab" +
                        "Science Lab Bhulta Science Lab" +
                        "Bata Signal Katabon Bata Signal Shahbag Bata Signal High Court Bata Signal Press Club Bata Signal Paltan Bata Signal" +
                        "Bata Signal GPO Bata Signal Gulisthan Bata Signal Sayedabad Bata Signal Jatrabari Bata Signal Shonir Akhra Bata Signal Sign Board Bata Signal Kachpur Bata Signal" +
                        "Bata Signal Bhulta Bata Signal" +
                        "Katabon Shahbag Katabon High Court Katabon Press Club Katabon Paltan Katabon" +
                        "Katabon GPO Katabon Gulisthan Katabon Sayedabad Katabon Jatrabari Katabon Shonir Akhra Katabon Sign Board Katabon Kachpur Katabon" +
                        "Katabon Bhulta Katabon" +
                        "Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag" +
                        "Shahbag GPO Shahbag Gulisthan Shahbag Sayedabad Shahbag Jatrabari Shahbag Shonir Akhra Shahbag Sign Board Shahbag Kachpur Shahbag" +
                        "Shahbag Bhulta Shahbag" +
                        "High Court Press Club High Court Paltan High Court" +
                        "High Court GPO High Court Gulisthan High Court Sayedabad High Court Jatrabari High Court Shonir Akhra High Court Sign Board High Court Kachpur High Court" +
                        "High Court Bhulta High Court" +
                        "Press Club Paltan Press Club" +
                        "Press Club GPO Press Club Gulisthan Press Club Sayedabad Press Club Jatrabari Press Club Shonir Akhra Press Club Sign Board Press Club Kachpur Press Club" +
                        "Press Club Bhulta Press Club" +
                        "Paltan GPO Paltan Gulisthan Paltan Sayedabad Paltan Jatrabari Paltan Shonir Akhra Paltan Sign Board Paltan Kachpur Paltan" +
                        "Paltan Bhulta Paltan" +
                        "GPO Gulisthan GPO Sayedabad GPO Jatrabari GPO Shonir Akhra GPO Sign Board GPO Kachpur GPO" +
                        "GPO Bhulta GPO" +
                        "Gulisthan Sayedabad Gulisthan Jatrabari Gulisthan Shonir Akhra Gulisthan Sign Board Gulisthan Kachpur Gulisthan" +
                        "Gulisthan Bhulta Gulisthan" +
                        "Sayedabad Jatrabari Sayedabad Shonir Akhra Sayedabad Sign Board Sayedabad Kachpur Sayedabad" +
                        "Sayedabad Bhulta Sayedabad" +
                        "Jatrabari Shonir Akhra Jatrabari Sign Board Jatrabari Kachpur Jatrabari" +
                        "Jatrabari Bhulta Jatrabari" +
                        "Shonir Akhra Sign Board Shonir Akhra Kachpur Shonir Akhra" +
                        "Shonir Akhra Bhulta Shonir Akhra" +
                        "Sign Board Kachpur Sign Board" +
                        "Sign Board Bhulta Sign Board" +
                        "Kachpur Bhulta Kachpur"));

        buses.add(new Bus(R.drawable.logo,"Meshkat Transport",
                "Chittagang Road Sign Board Chittagang Road Shonir Akhra Chittagang Road Jatrabari Chittagang Road Jonopath Mor Chittagang Road Sayedabad Chittagang Road" +
                        "Chittagang Road Ittefaq Chittagang Road Motijheel Chittagang Road Daynik Bangla Mor Chittagang Road Paltan Chittagang Road Press Club Chittagang Road" +
                        "Chittagang Road High Court Chittagang Road Motsho Bhobon Chittagang Road Shahbag Chittagang Road Bangla Motor Chittagang Road Kawran Bazar Chittagang Road" +
                        "Chittagang Road Farmgate Chittagang Road Khamarbari Chittagang Road Asad Gate Chittagang Road" +
                        "Chittagang Road Mohammadpur Chittagang Road" +
                        "Sign Board Shonir Akhra Sign Board Jatrabari Sign Board Jonopath Mor Sign Board Sayedabad Sign Board" +
                        "Sign Board Ittefaq Sign Board Motijheel Sign Board Daynik Bangla Mor Sign Board Paltan Sign Board Press Club Sign Board" +
                        "Sign Board High Court Sign Board Motsho Bhobon Sign Board Shahbag Sign Board Bangla Motor Sign Board Kawran Bazar Sign Board" +
                        "Sign Board Farmgate Sign Board Khamarbari Sign Board Asad Gate Sign Board" +
                        "Sign Board Mohammadpur Sign Board" +
                        "Shonir Akhra Jatrabari Shonir Akhra Jonopath Mor Shonir Akhra Sayedabad Shonir Akhra" +
                        "Shonir Akhra Ittefaq Shonir Akhra Motijheel Shonir Akhra Daynik Bangla Mor Shonir Akhra Paltan Shonir Akhra Press Club Shonir Akhra" +
                        "Shonir Akhra High Court Shonir Akhra Motsho Bhobon Shonir Akhra Shahbag Shonir Akhra Bangla Motor Shonir Akhra Kawran Bazar Shonir Akhra" +
                        "Shonir Akhra Farmgate Shonir Akhra Khamarbari Shonir Akhra Asad Gate Shonir Akhra" +
                        "Shonir Akhra Mohammadpur Shonir Akhra" +
                        "Jatrabari Jonopath Mor Jatrabari Sayedabad Jatrabari" +
                        "Jatrabari Ittefaq Jatrabari Motijheel Jatrabari Daynik Bangla Mor Jatrabari Paltan Jatrabari Press Club Jatrabari" +
                        "Jatrabari High Court Jatrabari Motsho Bhobon Jatrabari Shahbag Jatrabari Bangla Motor Jatrabari Kawran Bazar Jatrabari" +
                        "Jatrabari Farmgate Jatrabari Khamarbari Jatrabari Asad Gate Jatrabari" +
                        "Jatrabari Mohammadpur Jatrabari" +
                        "Jonopath Mor Sayedabad Jonopath Mor" +
                        "Jonopath Mor Ittefaq Jonopath Mor Motijheel Jonopath Mor Daynik Bangla Mor Jonopath Mor Paltan Jonopath Mor Press Club Jonopath Mor" +
                        "Jonopath Mor High Court Jonopath Mor Motsho Bhobon Jonopath Mor Shahbag Jonopath Mor Bangla Motor Jonopath Mor Kawran Bazar Jonopath Mor" +
                        "Jonopath Mor Farmgate Jonopath Mor Khamarbari Jonopath Mor Asad Gate Jonopath Mor" +
                        "Jonopath Mor Mohammadpur Jonopath Mor" +
                        "Sayedabad Ittefaq Sayedabad Motijheel Sayedabad Daynik Bangla Mor Sayedabad Paltan Sayedabad Press Club Sayedabad" +
                        "Sayedabad High Court Sayedabad Motsho Bhobon Sayedabad Shahbag Sayedabad Bangla Motor Sayedabad Kawran Bazar Sayedabad" +
                        "Sayedabad Farmgate Sayedabad Khamarbari Sayedabad Asad Gate Sayedabad" +
                        "Sayedabad Mohammadpur Sayedabad" +
                        "Ittefaq Motijheel Ittefaq Daynik Bangla Mor Ittefaq Paltan Ittefaq Press Club Ittefaq" +
                        "Ittefaq High Court Ittefaq Motsho Bhobon Ittefaq Shahbag Ittefaq Bangla Motor Ittefaq Kawran Bazar Ittefaq" +
                        "Ittefaq Farmgate Ittefaq Khamarbari Ittefaq Asad Gate Ittefaq" +
                        "Ittefaq Mohammadpur Ittefaq" +
                        "Motijheel Daynik Bangla Mor Motijheel Paltan Motijheel Press Club Motijheel" +
                        "Motijheel High Court Motijheel Motsho Bhobon Motijheel Shahbag Motijheel Bangla Motor Motijheel Kawran Bazar Motijheel" +
                        "Motijheel Farmgate Motijheel Khamarbari Motijheel Asad Gate Motijheel" +
                        "Motijheel Mohammadpur Motijheel" +
                        "Daynik Bangla Mor Paltan Daynik Bangla Mor Press Club Daynik Bangla Mor" +
                        "Daynik Bangla Mor High Court Daynik Bangla Mor Motsho Bhobon Daynik Bangla Mor Shahbag Daynik Bangla Mor Bangla Motor Daynik Bangla Mor Kawran Bazar Daynik Bangla Mor" +
                        "Daynik Bangla Mor Farmgate Daynik Bangla Mor Khamarbari Daynik Bangla Mor Asad Gate Daynik Bangla Mor" +
                        "Daynik Bangla Mor Mohammadpur Daynik Bangla Mor" +
                        "Paltan Press Club Paltan" +
                        "Paltan High Court Paltan Motsho Bhobon Paltan Shahbag Paltan Bangla Motor Paltan Kawran Bazar Paltan" +
                        "Paltan Farmgate Paltan Khamarbari Paltan Asad Gate Paltan" +
                        "Paltan Mohammadpur Paltan" +
                        "Press Club High Court Press Club Motsho Bhobon Press Club Shahbag Press Club Bangla Motor Press Club Kawran Bazar Press Club" +
                        "Press Club Farmgate Press Club Khamarbari Press Club Asad Gate Press Club" +
                        "Press Club Mohammadpur Press Club" +
                        "High Court Motsho Bhobon High Court Shahbag High Court Bangla Motor High Court Kawran Bazar High Court" +
                        "High Court Farmgate High Court Khamarbari High Court Asad Gate High Court" +
                        "High Court Mohammadpur High Court" +
                        "Motsho Bhobon Shahbag Motsho Bhobon Bangla Motor Motsho Bhobon Kawran Bazar Motsho Bhobon" +
                        "Motsho Bhobon Farmgate Motsho Bhobon Khamarbari Motsho Bhobon Asad Gate Motsho Bhobon" +
                        "Motsho Bhobon Mohammadpur Motsho Bhobon" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag" +
                        "Shahbag Farmgate Shahbag Khamarbari Shahbag Asad Gate Shahbag" +
                        "Shahbag Mohammadpur Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor" +
                        "Bangla Motor Farmgate Bangla Motor Khamarbari Bangla Motor Asad Gate Bangla Motor" +
                        "Bangla Motor Mohammadpur Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Khamarbari Kawran Bazar Asad Gate Kawran Bazar" +
                        "Kawran Bazar Mohammadpur Kawran Bazar" +
                        "Farmgate Khamarbari Farmgate Asad Gate Farmgate" +
                        "Farmgate Mohammadpur Farmgate" +
                        "Khamarbari Asad Gate Khamarbari" +
                        "Khamarbari Mohammadpur Khamarbari" +
                        "Asad Gate Mohammadpur Asad Gate"));



        buses.add(new Bus(R.drawable.logo,"Midway",
                "Mohammadpur Shankar Mohammadpur Star Kabab Mohammadpur Dhanmondi 15 Mohammadpur Jigatola Mohammadpur" +
                        "Mohammadpur City College Mohammadpur Science Lab Mohammadpur Bata Signal Mohammadpur Katabon Mohammadpur" +
                        "Mohammadpur Shahbag Mohammadpur Motsho Bhobon Mohammadpur High Court Mohammadpur Press Club Mohammadpur" +
                        "Mohammadpur Paltan Mohammadpur GPO Mohammadpur Gulisthan Mohammadpur Motijheel Mohammadpur" +
                        "Mohammadpur Arambag Mohammadpur Kamalapur Mohammadpur Mugdapara Mohammadpur Basabo Mohammadpur" +
                        "Mohammadpur Khilgaon Mohammadpur" +
                        "Shankar Star Kabab Shankar Dhanmondi 15 Shankar Jigatola Shankar" +
                        "Shankar City College Shankar Science Lab Shankar Bata Signal Shankar Katabon Shankar" +
                        "Shankar Shahbag Shankar Motsho Bhobon Shankar High Court Shankar Press Club Shankar" +
                        "Shankar Paltan Shankar GPO Shankar Gulisthan Shankar Motijheel Shankar" +
                        "Shankar Arambag Shankar Kamalapur Shankar Mugdapara Shankar Basabo Shankar" +
                        "Shankar Khilgaon Shankar" +
                        "Star Kabab Dhanmondi 15 Star Kabab Jigatola Star Kabab" +
                        "Star Kabab City College Star Kabab Science Lab Star Kabab Bata Signal Star Kabab Katabon Star Kabab" +
                        "Star Kabab Shahbag Star Kabab Motsho Bhobon Star Kabab High Court Star Kabab Press Club Star Kabab" +
                        "Star Kabab Paltan Star Kabab GPO Star Kabab Gulisthan Star Kabab Motijheel Star Kabab" +
                        "Star Kabab Arambag Star Kabab Kamalapur Star Kabab Mugdapara Star Kabab Basabo Star Kabab" +
                        "Star Kabab Khilgaon Star Kabab" +
                        "Dhanmondi 15 Jigatola Dhanmondi 15" +
                        "Dhanmondi 15 City College Dhanmondi 15 Science Lab Dhanmondi 15 Bata Signal Dhanmondi 15 Katabon Dhanmondi 15" +
                        "Dhanmondi 15 Shahbag Dhanmondi 15 Motsho Bhobon Dhanmondi 15 High Court Dhanmondi 15 Press Club Dhanmondi 15" +
                        "Dhanmondi 15 Paltan Dhanmondi 15 GPO Dhanmondi 15 Gulisthan Dhanmondi 15 Motijheel Dhanmondi 15" +
                        "Dhanmondi 15 Arambag Dhanmondi 15 Kamalapur Dhanmondi 15 Mugdapara Dhanmondi 15 Basabo Dhanmondi 15" +
                        "Dhanmondi 15 Khilgaon Dhanmondi 15" +
                        "Jigatola City College Jigatola Science Lab Jigatola Bata Signal Jigatola Katabon Jigatola" +
                        "Jigatola Shahbag Jigatola Motsho Bhobon Jigatola High Court Jigatola Press Club Jigatola" +
                        "Jigatola Paltan Jigatola GPO Jigatola Gulisthan Jigatola Motijheel Jigatola" +
                        "Jigatola Arambag Jigatola Kamalapur Jigatola Mugdapara Jigatola Basabo Jigatola" +
                        "Jigatola Khilgaon Jigatola" +
                        "City College Science Lab City College Bata Signal City College Katabon City College" +
                        "City College Shahbag City College Motsho Bhobon City College High Court City College Press Club City College" +
                        "City College Paltan City College GPO City College Gulisthan City College Motijheel City College" +
                        "City College Arambag City College Kamalapur City College Mugdapara City College Basabo City College" +
                        "City College Khilgaon City College" +
                        "Science Lab Bata Signal Science Lab Katabon Science Lab" +
                        "Science Lab Shahbag Science Lab Motsho Bhobon Science Lab High Court Science Lab Press Club Science Lab" +
                        "Science Lab Paltan Science Lab GPO Science Lab Gulisthan Science Lab Motijheel Science Lab" +
                        "Science Lab Arambag Science Lab Kamalapur Science Lab Mugdapara Science Lab Basabo Science Lab" +
                        "Science Lab Khilgaon Science Lab" +
                        "Bata Signal Katabon Bata Signal Shahbag Bata Signal Motsho Bhobon Bata Signal High Court Bata Signal Press Club Bata Signal" +
                        "Bata Signal Paltan Bata Signal GPO Bata Signal Gulisthan Bata Signal Motijheel Bata Signal" +
                        "Bata Signal Arambag Bata Signal Kamalapur Bata Signal Mugdapara Bata Signal Basabo Bata Signal" +
                        "Bata Signal Khilgaon Bata Signal" +
                        "Katabon Shahbag Katabon Motsho Bhobon Katabon High Court Katabon Press Club Katabon" +
                        "Katabon Paltan Katabon GPO Katabon Gulisthan Katabon Motijheel Katabon" +
                        "Katabon Arambag Katabon Kamalapur Katabon Mugdapara Katabon Basabo Katabon" +
                        "Katabon Khilgaon Katabon" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag" +
                        "Shahbag Paltan Shahbag GPO Shahbag Gulisthan Shahbag Motijheel Shahbag" +
                        "Shahbag Arambag Shahbag Kamalapur Shahbag Mugdapara Shahbag Basabo Shahbag" +
                        "Shahbag Khilgaon Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon" +
                        "Motsho Bhobon Paltan Motsho Bhobon GPO Motsho Bhobon Gulisthan Motsho Bhobon Motijheel Motsho Bhobon" +
                        "Motsho Bhobon Arambag Motsho Bhobon Kamalapur Motsho Bhobon Mugdapara Motsho Bhobon Basabo Motsho Bhobon" +
                        "Motsho Bhobon Khilgaon Motsho Bhobon" +
                        "High Court Press Club High Court" +
                        "High Court Paltan High Court GPO High Court Gulisthan High Court Motijheel High Court" +
                        "High Court Arambag High Court Kamalapur High Court Mugdapara High Court Basabo High Court" +
                        "High Court Khilgaon High Court" +
                        "Press Club Paltan Press Club GPO Press Club Gulisthan Press Club Motijheel Press Club" +
                        "Press Club Arambag Press Club Kamalapur Press Club Mugdapara Press Club Basabo Press Club" +
                        "Press Club Khilgaon Press Club" +
                        "Paltan GPO Paltan Gulisthan Paltan Motijheel Paltan" +
                        "Paltan Arambag Paltan Kamalapur Paltan Mugdapara Paltan Basabo Paltan" +
                        "Paltan Khilgaon Paltan" +
                        "GPO Gulisthan GPO Motijheel GPO" +
                        "GPO Arambag GPO Kamalapur GPO Mugdapara GPO Basabo GPO" +
                        "GPO Khilgaon GPO" +
                        "Gulisthan Motijheel Gulisthan" +
                        "Gulisthan Arambag Gulisthan Kamalapur Gulisthan Mugdapara Gulisthan Basabo Gulisthan" +
                        "Gulisthan Khilgaon Gulisthan" +
                        "Motijheel Arambag Motijheel Kamalapur Motijheel Mugdapara Motijheel Basabo Motijheel" +
                        "Motijheel Khilgaon Motijheel" +
                        "Arambag Kamalapur Arambag Mugdapara Arambag Basabo Arambag" +
                        "Arambag Khilgaon Arambag" +
                        "Kamalapur Mugdapara Kamalapur Basabo Kamalapur" +
                        "Kamalapur Khilgaon Kamalapur" +
                        "Mugdapara Basabo Mugdapara" +
                        "Mugdapara Khilgaon Mugdapara" +
                        "Basabo Khilgaon Basabo"));


        buses.add(new Bus(R.drawable.logo,"Mirpur Link",
                "Dhakeshwari Azimpur Dhakeshwari Nilkhet Dhakeshwari New Market Dhakeshwari Science Lab Dhakeshwari City College Dhakeshwari Kalabagan Dhakeshwari" +
                        "Dhakeshwari Dhanmondi 32 Dhakeshwari Dhanmondi 27 Dhakeshwari Asad Gate Dhakeshwari College Gate Dhakeshwari Shyamoli Dhakeshwari Kallayanpur Dhakeshwari" +
                        "Dhakeshwari Darussalam Dhakeshwari Technical Dhakeshwari Bangla College Dhakeshwari Ansar Camp Dhakeshwari Mirpur 1 Dhakeshwari Mirpur 10 Dhakeshwari" +
                        "Dhakeshwari Mirpur 11 Dhakeshwari Mirpur 12 Dhakeshwari" +
                        "Azimpur Nilkhet Azimpur New Market Azimpur Science Lab Azimpur City College Azimpur Kalabagan Azimpur" +
                        "Azimpur Dhanmondi 32 Azimpur Dhanmondi 27 Azimpur Asad Gate Azimpur College Gate Azimpur Shyamoli Azimpur Kallayanpur Azimpur" +
                        "Azimpur Darussalam Azimpur Technical Azimpur Bangla College Azimpur Ansar Camp Azimpur Mirpur 1 Azimpur Mirpur 10 Azimpur" +
                        "Azimpur Mirpur 11 Azimpur Mirpur 12 Azimpur" +
                        "Nilkhet New Market Nilkhet Science Lab Nilkhet City College Nilkhet Kalabagan Nilkhet" +
                        "Nilkhet Dhanmondi 32 Nilkhet Dhanmondi 27 Nilkhet Asad Gate Nilkhet College Gate Nilkhet Shyamoli Nilkhet Kallayanpur Nilkhet" +
                        "Nilkhet Darussalam Nilkhet Technical Nilkhet Bangla College Nilkhet Ansar Camp Nilkhet Mirpur 1 Nilkhet Mirpur 10 Nilkhet" +
                        "Nilkhet Mirpur 11 Nilkhet Mirpur 12 Nilkhet" +
                        "New Market Science Lab New Market City College New Market Kalabagan New Market" +
                        "New Market Dhanmondi 32 New Market Dhanmondi 27 New Market Asad Gate New Market College Gate New Market Shyamoli New Market Kallayanpur New Market" +
                        "New Market Darussalam New Market Technical New Market Bangla College New Market Ansar Camp New Market Mirpur 1 New Market Mirpur 10 New Market" +
                        "New Market Mirpur 11 New Market Mirpur 12 New Market" +
                        "Science Lab City College Science Lab Kalabagan Science Lab" +
                        "Science Lab Dhanmondi 32 Science Lab Dhanmondi 27 Science Lab Asad Gate Science Lab College Gate Science Lab Shyamoli Science Lab Kallayanpur Science Lab" +
                        "Science Lab Darussalam Science Lab Technical Science Lab Bangla College Science Lab Ansar Camp Science Lab Mirpur 1 Science Lab Mirpur 10 Science Lab" +
                        "Science Lab Mirpur 11 Science Lab Mirpur 12 Science Lab" +
                        "City College Kalabagan City College" +
                        "City College Dhanmondi 32 City College Dhanmondi 27 City College Asad Gate City College College Gate City College Shyamoli City College Kallayanpur City College" +
                        "City College Darussalam City College Technical City College Bangla College City College Ansar Camp City College Mirpur 1 City College Mirpur 10 City College" +
                        "City College Mirpur 11 City College Mirpur 12 City College" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad Gate Kalabagan College Gate Kalabagan Shyamoli Kalabagan Kallayanpur Kalabagan" +
                        "Kalabagan Darussalam Kalabagan Technical Kalabagan Bangla College Kalabagan Ansar Camp Kalabagan Mirpur 1 Kalabagan Mirpur 10 Kalabagan" +
                        "Kalabagan Mirpur 11 Kalabagan Mirpur 12 Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad Gate Dhanmondi 32 College Gate Dhanmondi 32 Shyamoli Dhanmondi 32 Kallayanpur Dhanmondi 32" +
                        "Dhanmondi 32 Darussalam Dhanmondi 32 Technical Dhanmondi 32 College Dhanmondi 32 Ansar Camp Dhanmondi 32 Mirpur 1 Dhanmondi 32 Mirpur 10 Dhanmondi 32" +
                        "Dhanmondi 32 Mirpur 11 Dhanmondi 32 Mirpur 12 Dhanmondi 32" +
                        "Dhanmondi 27 Asad Gate Dhanmondi 27 College Gate Dhanmondi 27 Shyamoli Dhanmondi 27 Kallayanpur Dhanmondi 27" +
                        "Dhanmondi 27 Darussalam Dhanmondi 27 Technical Dhanmondi 27 Bangla College Dhanmondi 27 Ansar Camp Dhanmondi 27 Mirpur 1 Dhanmondi 27 Mirpur 10 Dhanmondi 27" +
                        "Dhanmondi 27 Mirpur 11 Dhanmondi 27 Mirpur 12 Dhanmondi 27" +
                        "Asad Gate College Gate Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate" +
                        "Asad Gate Darussalam Asad Gate Technical Asad Gate Bangla College Asad Gate Ansar Camp Asad Gate Mirpur 1 Asad Gate Mirpur 10 Asad Gate" +
                        "Asad Gate Mirpur 11 Asad Gate Mirpur 12 Asad Gate" +
                        "College Gate Shyamoli College Gate Kallayanpur College Gate" +
                        "College Gate Darussalam College Gate Technical College Gate Bangla College College Gate Ansar Camp College Gate Mirpur 1 College Gate Mirpur 10 College Gate" +
                        "College Gate Mirpur 11 College Gate Mirpur 12 College Gate" +
                        "Shyamoli Kallayanpur Shyamoli" +
                        "Shyamoli Darussalam Shyamoli Technical Shyamoli Bangla College Shyamoli Ansar Camp Shyamoli Mirpur 1 Shyamoli Mirpur 10 Shyamoli" +
                        "Shyamoli Mirpur 11 Shyamoli Mirpur 12 Shyamoli" +
                        "Kallayanpur Darussalam Kallayanpur Technical Kallayanpur Bangla College Kallayanpur Ansar Camp Kallayanpur Mirpur 1 Kallayanpur Mirpur 10 Kallayanpur" +
                        "Kallayanpur Mirpur 11 Kallayanpur Mirpur 12 Kallayanpur" +
                        "Darussalam Technical Darussalam Bangla College Darussalam Ansar Camp Darussalam Mirpur 1 Darussalam Mirpur 10 Darussalam" +
                        "Darussalam Mirpur 11 Darussalam Mirpur 12 Darussalam" +
                        "Technical Bangla College Technical Ansar Camp Technical Mirpur 1 Technical Mirpur 10 Technical" +
                        "Technical Mirpur 11 Technical Mirpur 12 Technical" +
                        "Bangla College Ansar Camp Bangla College Mirpur 1 Bangla College Mirpur 10 Bangla College" +
                        "Bangla College Mirpur 11 Bangla College Mirpur 12 Bangla College" +
                        "Ansar Camp Mirpur 1 Ansar Camp Mirpur 10 Ansar Camp" +
                        "Ansar Camp Mirpur 11 Ansar Camp Mirpur 12 Ansar Camp" +
                        "Mirpur 1 Mirpur 10 Mirpur 1" +
                        "Mirpur 1 Mirpur 11 Mirpur 1 Mirpur 12 Mirpur 1" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Mirpur 12 Mirpur 10" +
                        "Mirpur 11 Mirpur 12 Mirpur 11"));


        buses.add(new Bus(R.drawable.logo,"Mirpur Link 2",
                "ECB Square Mirpur 12 ECB Square Pallabi ECB Square Purobi ECB Square Mirpur 11 ECB Square Mirpur 10 ECB Square Kazipara ECB Square Shewrapara ECB Square" +
                        "ECB Square Taltola ECB Square Agargaon ECB Square Khamarbari ECB Square Dhanmondi 27 ECB Square Dhanmondi 32 ECB Square Kalabagan ECB Square" +
                        "ECB Square City College ECB Square Science Lab ECB Square New Market ECB Square Nilkhet ECB Square Azimpur ECB Square" +
                        "Mirpur 12 Pallabi Mirpur 12 Purobi Mirpur 12 Mirpur 11 Mirpur 12 Mirpur 10 Mirpur 12 Kazipara Mirpur 12 Shewrapara Mirpur 12" +
                        "Mirpur 12 Taltola Mirpur 12 Agargaon Mirpur 12 Khamarbari Mirpur 12 Dhanmondi 27 Mirpur 12 Dhanmondi 32 Mirpur 12 Kalabagan Mirpur 12" +
                        "Mirpur 12 City College Mirpur 12 Science Lab Mirpur 12 New Market Mirpur 12 Nilkhet Mirpur 12 Azimpur Mirpur 12" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Khamarbari Pallabi Dhanmondi 27 Pallabi Dhanmondi 32 Pallabi Kalabagan Pallabi" +
                        "Pallabi City College Pallabi Science Lab Pallabi New Market Pallabi Nilkhet Pallabi Azimpur Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Khamarbari Purobi Dhanmondi 27 Purobi Dhanmondi 32 Purobi Kalabagan Purobi" +
                        "Purobi City College Purobi Science Lab Purobi New Market Purobi Nilkhet Purobi Azimpur Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Khamarbari Mirpur 11 Dhanmondi 27 Mirpur 11 Dhanmondi 32 Mirpur 11 Kalabagan Mirpur 11" +
                        "Mirpur 11 City College Mirpur 11 Science Lab Mirpur 11 New Market Mirpur 11 Nilkhet Mirpur 11 Azimpur Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Khamarbari Mirpur 10 Dhanmondi 27 Mirpur 10 Dhanmondi 32 Mirpur 10 Kalabagan Mirpur 10" +
                        "Mirpur 10 City College Mirpur 10 Science Lab Mirpur 10 New Market Mirpur 10 Nilkhet Mirpur 10 Azimpur Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Khamarbari Kazipara Dhanmondi 27 Kazipara Dhanmondi 32 Kazipara Kalabagan Kazipara" +
                        "Kazipara City College Kazipara Science Lab Kazipara New Market Kazipara Nilkhet Kazipara Azimpur Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Khamarbari Shewrapara Dhanmondi 27 Shewrapara Dhanmondi 32 Shewrapara Kalabagan Shewrapara" +
                        "Shewrapara City College Shewrapara Science Lab Shewrapara New Market Shewrapara Nilkhet Shewrapara Azimpur Shewrapara" +
                        "Taltola Agargaon Taltola Khamarbari Taltola Dhanmondi 27 Taltola Dhanmondi 32 Taltola Kalabagan Taltola" +
                        "Taltola City College Taltola Science Lab Taltola New Market Taltola Nilkhet Taltola Azimpur Taltola" +
                        "Agargaon Khamarbari Agargaon Dhanmondi 27 Agargaon Dhanmondi 32 Agargaon Kalabagan Agargaon" +
                        "Agargaon City College Agargaon Science Lab Agargaon New Market Agargaon Nilkhet Agargaon Azimpur Agargaon" +
                        "Khamarbari Dhanmondi 27 Khamarbari Dhanmondi 32 Khamarbari Kalabagan Khamarbari" +
                        "Khamarbari City College Khamarbari Science Lab Khamarbari New Market Khamarbari Nilkhet Khamarbari Azimpur Khamarbari" +
                        "Dhanmondi 27 Dhanmondi 32 Dhanmondi 27 Kalabagan Dhanmondi 27" +
                        "Dhanmondi 27 City College Dhanmondi 27 Science Lab Dhanmondi 27 New Market Dhanmondi 27 Nilkhet Dhanmondi 27 Azimpur Dhanmondi 27" +
                        "Dhanmondi 32 Kalabagan Dhanmondi 32" +
                        "Dhanmondi 32 City College Dhanmondi 32 Science Lab Dhanmondi 32 New Market Dhanmondi 32 Nilkhet Dhanmondi 32 Azimpur Dhanmondi 32" +
                        "Kalabagan City College Kalabagan Science Lab Kalabagan New Market Kalabagan Nilkhet Kalabagan Azimpur Kalabagan" +
                        "City College Science Lab City College New Market City College Nilkhet City College Azimpur City College" +
                        "Science Lab New Market Science Lab Nilkhet Science Lab Azimpur Science Lab" +
                        "New Market Nilkhet New Market Azimpur New Market" +
                        "Nilkhet Azimpur Nilkhet"));


        buses.add(new Bus(R.drawable.logo,"Mirpur Metro Service",
                "Azimpur Nilkhet Azimpur New Market Azimpur Science Lab Azimpur City College Azimpur Kalabagan Azimpur" +
                        "Azimpur Dhanmondi 32 Azimpur Dhanmondi 27 Azimpur Asad Gate Azimpur College Gate Azimpur Shyamoli Azimpur Kallayanpur Azimpur" +
                        "Azimpur Darussalam Azimpur Technical Azimpur Bangla College Azimpur Ansar Camp Azimpur Mirpur 1 Azimpur" +
                        "Nilkhet New Market Nilkhet Science Lab Nilkhet City College Nilkhet Kalabagan Nilkhet" +
                        "Nilkhet Dhanmondi 32 Nilkhet Dhanmondi 27 Nilkhet Asad Gate Nilkhet College Gate Nilkhet Shyamoli Nilkhet Kallayanpur Nilkhet" +
                        "Nilkhet Darussalam Nilkhet Technical Nilkhet Bangla College Nilkhet Ansar Camp Nilkhet Mirpur 1 Nilkhet " +
                        "New Market Science Lab New Market City College New Market Kalabagan New Market" +
                        "New Market Dhanmondi 32 New Market Dhanmondi 27 New Market Asad Gate New Market College Gate New Market Shyamoli New Market Kallayanpur New Market" +
                        "New Market Darussalam New Market Technical New Market Bangla College New Market Ansar Camp New Market Mirpur 1 New Market " +
                        "Science Lab City College Science Lab Kalabagan Science Lab" +
                        "Science Lab Dhanmondi 32 Science Lab Dhanmondi 27 Science Lab Asad Gate Science Lab College Gate Science Lab Shyamoli Science Lab Kallayanpur Science Lab" +
                        "Science Lab Darussalam Science Lab Technical Science Lab Bangla College Science Lab Ansar Camp Science Lab Mirpur 1 Science Lab " +
                        "City College Kalabagan City College" +
                        "City College Dhanmondi 32 City College Dhanmondi 27 City College Asad Gate City College College Gate City College Shyamoli City College Kallayanpur City College" +
                        "City College Darussalam City College Technical City College Bangla College City College Ansar Camp City College Mirpur 1 City College" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad Gate Kalabagan College Gate Kalabagan Shyamoli Kalabagan Kallayanpur Kalabagan" +
                        "Kalabagan Darussalam Kalabagan Technical Kalabagan Bangla College Kalabagan Ansar Camp Kalabagan Mirpur 1 Kalabagan " +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad Gate Dhanmondi 32 College Gate Dhanmondi 32 Shyamoli Dhanmondi 32 Kallayanpur Dhanmondi 32" +
                        "Dhanmondi 32 Darussalam Dhanmondi 32 Technical Dhanmondi 32 College Dhanmondi 32 Ansar Camp Dhanmondi 32 Mirpur 1 Dhanmondi 32" +
                        "Dhanmondi 27 Asad Gate Dhanmondi 27 College Gate Dhanmondi 27 Shyamoli Dhanmondi 27 Kallayanpur Dhanmondi 27" +
                        "Dhanmondi 27 Darussalam Dhanmondi 27 Technical Dhanmondi 27 Bangla College Dhanmondi 27 Ansar Camp Dhanmondi 27 Mirpur 1 Dhanmondi 27 " +
                        "Asad Gate College Gate Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate" +
                        "Asad Gate Darussalam Asad Gate Technical Asad Gate Bangla College Asad Gate Ansar Camp Asad Gate Mirpur 1 Asad Gate" +
                        "College Gate Shyamoli College Gate Kallayanpur College Gate" +
                        "College Gate Darussalam College Gate Technical College Gate Bangla College College Gate Ansar Camp College Gate Mirpur 1 College Gate" +
                        "Shyamoli Kallayanpur Shyamoli" +
                        "Shyamoli Darussalam Shyamoli Technical Shyamoli Bangla College Shyamoli Ansar Camp Shyamoli Mirpur 1 Shyamoli " +
                        "Kallayanpur Darussalam Kallayanpur Technical Kallayanpur Bangla College Kallayanpur Ansar Camp Kallayanpur Mirpur 1 Kallayanpur" +
                        "Darussalam Technical Darussalam Bangla College Darussalam Ansar Camp Darussalam Mirpur 1 Darussalam " +
                        "Technical Bangla College Technical Ansar Camp Technical Mirpur 1 Technical" +
                        "Bangla College Ansar Camp Bangla College Mirpur 1 Bangla College" +
                        "Ansar Camp Mirpur 1 Ansar Camp"));


        buses.add(new Bus(R.drawable.logo,"Mirpur United Service",
                "Mirpur 12 Pallabi Mirpur 12 Purobi Mirpur 12 Mirpur 11 Mirpur 12 Mirpur 10 Mirpur 12 Kazipara Mirpur 12 Shewrapara Mirpur 12" +
                        "Mirpur 12 Taltola Mirpur 12 Agargaon Mirpur 12 Khamarbari Mirpur 12 Farmgate Mirpur 12 Kawran Bazar Mirpur 12 Bangla Motor Mirpur 12" +
                        "Mirpur 12 Shahbag Mirpur 12 Motsho Bhobon Mirpur 12 High Court Mirpur 12 Press Club Mirpur 12 Paltan Mirpur 12 GPO Mirpur 12" +
                        "Mirpur 12 Golap Shah Mazar Mirpur 12 Naya Bazar Mirpur 12 Ray Shaheb Bazar Mirpur 12" +
                        "Mirpur 12 Sadarghat Mirpur 12" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Khamarbari Pallabi Farmgate Pallabi Kawran Bazar Pallabi Bangla Motor Pallabi" +
                        "Pallabi Shahbag Pallabi Motsho Bhobon Pallabi High Court Pallabi Press Club Pallabi Paltan Pallabi GPO Pallabi" +
                        "Pallabi Golap Shah Mazar Pallabi Naya Bazar Pallabi Ray Shaheb Bazar Pallabi" +
                        "Pallabi Sadarghat Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Khamarbari Purobi Farmgate Purobi Kawran Bazar Purobi Bangla Motor Purobi" +
                        "Purobi Shahbag Purobi Motsho Bhobon Purobi High Court Purobi Press Club Purobi Paltan Purobi GPO Purobi" +
                        "Purobi Golap Shah Mazar Purobi Naya Bazar Purobi Ray Shaheb Bazar Purobi" +
                        "Purobi Sadarghat Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Khamarbari Mirpur 11 Farmgate Mirpur 11 Kawran Bazar Mirpur 11 Bangla Motor Mirpur 11" +
                        "Mirpur 11 Shahbag Mirpur 11 Motsho Bhobon Mirpur 11 High Court Mirpur 11 Press Club Mirpur 11 Paltan Mirpur 11 GPO Mirpur 11" +
                        "Mirpur 11 Golap Shah Mazar Mirpur 11 Naya Bazar Mirpur 11 Ray Shaheb Bazar Mirpur 11" +
                        "Mirpur 11 Sadarghat Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Khamarbari Mirpur 10 Farmgate Mirpur 10 Kawran Bazar Mirpur 10 Bangla Motor Mirpur 10" +
                        "Mirpur 10 Shahbag Mirpur 10 Motsho Bhobon Mirpur 10 High Court Mirpur 10 Press Club Mirpur 10 Paltan Mirpur 10 GPO Mirpur 10" +
                        "Mirpur 10 Golap Shah Mazar Mirpur 10 Naya Bazar Mirpur 10 Ray Shaheb Bazar Mirpur 10" +
                        "Mirpur 10 Sadarghat Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Khamarbari Kazipara Farmgate Kazipara Kawran Bazar Kazipara Bangla Motor Kazipara" +
                        "Kazipara Shahbag Kazipara Motsho Bhobon Kazipara High Court Kazipara Press Club Kazipara Paltan Kazipara GPO Kazipara" +
                        "Kazipara Golap Shah Mazar Kazipara Naya Bazar Kazipara Ray Shaheb Bazar Kazipara" +
                        "Kazipara Sadarghat Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Khamarbari Shewrapara Farmgate Shewrapara Kawran Bazar Shewrapara Bangla Motor Shewrapara" +
                        "Shewrapara Shahbag Shewrapara Motsho Bhobon Shewrapara High Court Shewrapara Press Club Shewrapara Paltan Shewrapara GPO Shewrapara" +
                        "Shewrapara Golap Shah Mazar Shewrapara Naya Bazar Shewrapara Ray Shaheb Bazar Shewrapara" +
                        "Shewrapara Sadarghat Shewrapara" +
                        "Taltola Agargaon Taltola Khamarbari Taltola Farmgate Taltola Kawran Bazar Taltola Bangla Motor Taltola" +
                        "Taltola Shahbag Taltola Motsho Bhobon Taltola High Court Taltola Press Club Taltola Paltan Taltola GPO Taltola" +
                        "Taltola Golap Shah Mazar Taltola Naya Bazar Taltola Ray Shaheb Bazar Taltola" +
                        "Taltola Sadarghat Taltola" +
                        "Agargaon Khamarbari Agargaon Farmgate Agargaon Kawran Bazar Agargaon Bangla Motor Agargaon" +
                        "Agargaon Shahbag Agargaon Motsho Bhobon Agargaon High Court Agargaon Press Club Agargaon Paltan Agargaon GPO Agargaon" +
                        "Agargaon Golap Shah Mazar Agargaon Naya Bazar Agargaon Ray Shaheb Bazar Agargaon" +
                        "Agargaon Sadarghat Agargaon" +
                        "Khamarbari Farmgate Khamarbari Kawran Bazar Khamarbari Bangla Motor Khamarbari" +
                        "Khamarbari Shahbag Khamarbari Motsho Bhobon Khamarbari High Court Khamarbari Press Club Khamarbari Paltan Khamarbari GPO Khamarbari" +
                        "Khamarbari Golap Shah Mazar Khamarbari Naya Bazar Khamarbari Ray Shaheb Bazar Khamarbari" +
                        "Khamarbari Sadarghat Khamarbari" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate" +
                        "Farmgate Shahbag Farmgate Motsho Bhobon Farmgate High Court Farmgate Press Club Farmgate Paltan Farmgate GPO Farmgate" +
                        "Farmgate Golap Shah Mazar Farmgate Naya Bazar Farmgate Ray Shaheb Bazar Farmgate" +
                        "Farmgate Sadarghat Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar" +
                        "Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar High Court Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar GPO Kawran Bazar" +
                        "Kawran Bazar Golap Shah Mazar Kawran Bazar Naya Bazar Kawran Bazar Ray Shaheb Bazar Kawran Bazar" +
                        "Kawran Bazar Sadarghat Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor High Court Bangla Motor Press Club Bangla Motor Paltan Bangla Motor GPO Bangla Motor" +
                        "Bangla Motor Golap Shah Mazar Bangla Motor Naya Bazar Bangla Motor Ray Shaheb Bazar Bangla Motor" +
                        "Bangla Motor Sadarghat Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag GPO Shahbag" +
                        "Shahbag Golap Shah Mazar Shahbag Naya Bazar Shahbag Ray Shaheb Bazar Shahbag" +
                        "Shahbag Sadarghat Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon Paltan Motsho Bhobon GPO Motsho Bhobon" +
                        "Motsho Bhobon Golap Shah Mazar Motsho Bhobon Naya Bazar Motsho Bhobon Ray Shaheb Bazar Motsho Bhobon" +
                        "Motsho Bhobon Sadarghat Motsho Bhobon" +
                        "High Court Press Club High Court Paltan High Court GPO High Court" +
                        "High Court Golap Shah Mazar High Court Naya Bazar High Court Ray Shaheb Bazar High Court" +
                        "High Court Sadarghat High Court" +
                        "Press Club Paltan Press Club GPO Press Club" +
                        "Press Club Golap Shah Mazar Press Club Naya Bazar Press Club Ray Shaheb Bazar Press Club" +
                        "Press Club Sadarghat Press Club" +
                        "Paltan GPO Paltan" +
                        "Paltan Golap Shah Mazar Paltan Naya Bazar Paltan Ray Shaheb Bazar Paltan" +
                        "Paltan Sadarghat Paltan" +
                        "GPO Golap Shah Mazar GPO Naya Bazar GPO Ray Shaheb Bazar GPO" +
                        "GPO Sadarghat GPO" +
                        "Golap Shah Mazar Naya Bazar Golap Shah Mazar Ray Shaheb Bazar Golap Shah Mazar" +
                        "Golap Shah Mazar Sadarghat Golap Shah Mazar" +
                        "Naya Bazar Ray Shaheb Bazar Naya Bazar" +
                        "Naya Bazar Sadarghat Naya Bazar" +
                        "Ray Shaheb Bazar Sadarghat Ray Shaheb Bazar"));



        buses.add(new Bus(R.drawable.logo,"Modhumoti Paribahan",
                "Baipayl Nobinagar Baipayl Savar Baipayl Hemayetpur Baipayl Aminbazar Baipayl Gabtoli Baipayl" +
                        "Baipayl Technical Baipayl Ansar Camp Baipayl Mirpur 1 Baipayl Mirpur 10 Baipayl Mirpur 11 Baipayl Purobi Baipayl Kalshi Baipayl" +
                        "Baipayl ECB Square Baipayl MES Baipayl Shewra Baipayl Kuril Bishwa Road Baipayl Khilkhet Baipayl Airport Baipayl Jasimuddin Baipayl" +
                        "Baipayl Azampur Baipayl House Building Baipayl" +
                        "Baipayl Abdullahpur Baipayl Kamarpara Baipayl" +
                        "Nobinagar Savar Nobinagar Hemayetpur Nobinagar Aminbazar Nobinagar Gabtoli Nobinagar" +
                        "Nobinagar Technical Nobinagar Ansar Camp Nobinagar Mirpur 1 Nobinagar Mirpur 10 Nobinagar Mirpur 11 Nobinagar Purobi Nobinagar Kalshi Nobinagar" +
                        "Nobinagar ECB Square Nobinagar MES Nobinagar Shewra Nobinagar Kuril Bishwa Road Nobinagar Khilkhet Nobinagar Airport Nobinagar Jasimuddin Nobinagar" +
                        "Nobinagar Azampur Nobinagar House Building Nobinagar" +
                        "Nobinagar Abdullahpur Nobinagar Kamarpara Nobinagar" +
                        "Savar Hemayetpur Savar Aminbazar Savar Gabtoli Savar" +
                        "Savar Technical Savar Ansar Camp Savar Mirpur 1 Savar Mirpur 10 Savar Mirpur 11 Savar Purobi Savar Kalshi Savar" +
                        "Savar ECB Square Savar MES Savar Shewra Savar Kuril Bishwa Road Savar Khilkhet Savar Airport Savar Jasimuddin Savar" +
                        "Savar Azampur Savar House Building Savar" +
                        "Savar Abdullahpur Savar Kamarpara Savar" +
                        "Hemayetpur Aminbazar Hemayetpur Gabtoli Hemayetpur" +
                        "Hemayetpur Technical Hemayetpur Ansar Camp Hemayetpur Mirpur 1 Hemayetpur Mirpur 10 Hemayetpur Mirpur 11 Hemayetpur Purobi Hemayetpur Kalshi Hemayetpur" +
                        "Hemayetpur ECB Square Hemayetpur MES Hemayetpur Shewra Hemayetpur Kuril Bishwa Road Hemayetpur Khilkhet Hemayetpur Airport Hemayetpur Jasimuddin Hemayetpur" +
                        "Hemayetpur Azampur Hemayetpur House Building Hemayetpur" +
                        "Hemayetpur Abdullahpur Hemayetpur Kamarpara Hemayetpur" +
                        "Aminbazar Gabtoli Aminbazar" +
                        "Aminbazar Technical Aminbazar Ansar Camp Aminbazar Mirpur 1 Aminbazar Mirpur 10 Aminbazar Mirpur 11 Aminbazar Purobi Aminbazar Kalshi Aminbazar" +
                        "Aminbazar ECB Square Aminbazar MES Aminbazar Shewra Aminbazar Kuril Bishwa Road Aminbazar Khilkhet Aminbazar Airport Aminbazar Jasimuddin Aminbazar" +
                        "Aminbazar Azampur Aminbazar House Building Aminbazar" +
                        "Aminbazar Abdullahpur Aminbazar Kamarpara Aminbazar" +
                        "Gabtoli Technical Gabtoli Ansar Camp Gabtoli Mirpur 1 Gabtoli Mirpur 10 Gabtoli Mirpur 11 Gabtoli Purobi Gabtoli Kalshi Gabtoli" +
                        "Gabtoli ECB Square Gabtoli MES Gabtoli Shewra Gabtoli Kuril Bishwa Road Gabtoli Khilkhet Gabtoli Airport Gabtoli Jasimuddin Gabtoli" +
                        "Gabtoli Azampur Gabtoli House Building Gabtoli" +
                        "Gabtoli Abdullahpur Gabtoli Kamarpara Gabtoli" +
                        "Technical Ansar Camp Technical Mirpur 1 Technical Mirpur 10 Technical Mirpur 11 Technical Purobi Technical Kalshi Technical" +
                        "Technical ECB Square Technical MES Technical Shewra Technical Kuril Bishwa Road Technical Khilkhet Technical Airport Technical Jasimuddin Technical" +
                        "Technical Azampur Technical House Building Technical" +
                        "Technical Abdullahpur Technical Kamarpara Technical" +
                        "Ansar Camp Mirpur 1 Ansar Camp Mirpur 10 Ansar Camp Mirpur 11 Ansar Camp Purobi Ansar Camp Kalshi Ansar Camp" +
                        "Ansar Camp ECB Square Ansar Camp MES Ansar Camp Shewra Ansar Camp Kuril Bishwa Road Ansar Camp Khilkhet Ansar Camp Airport Ansar Camp Jasimuddin Ansar Camp" +
                        "Ansar Camp Azampur Ansar Camp House Building Ansar Camp" +
                        "Ansar Camp Abdullahpur Ansar Camp Kamarpara Ansar Camp" +
                        "Mirpur 1 Mirpur 10 Mirpur 1 Mirpur 11 Mirpur 1 Purobi Mirpur 1 Kalshi Mirpur 1" +
                        "Mirpur 1 ECB Square Mirpur 1 MES Mirpur 1 Shewra Mirpur 1 Kuril Bishwa Road Mirpur 1 Khilkhet Mirpur 1 Airport Mirpur 1 Jasimuddin Mirpur 1" +
                        "Mirpur 1 Azampur Mirpur 1 House Building Mirpur 1" +
                        "Mirpur 1 Abdullahpur Mirpur 1 Kamarpara Mirpur 1" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10" +
                        "Mirpur 10 ECB Square Mirpur 10 MES Mirpur 10 Shewra Mirpur 10 Kuril Bishwa Road Mirpur 10 Khilkhet Mirpur 10 Airport Mirpur 10 Jasimuddin Mirpur 10" +
                        "Mirpur 10 Azampur Mirpur 10 House Building Mirpur 10" +
                        "Mirpur 10 Abdullahpur Mirpur 10 Kamarpara Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Kalshi Mirpur 11" +
                        "Mirpur 11 ECB Square Mirpur 11 MES Mirpur 11 Shewra Mirpur 11 Kuril Bishwa Road Mirpur 11 Khilkhet Mirpur 11 Airport Mirpur 11 Jasimuddin Mirpur 11" +
                        "Mirpur 11 Azampur Mirpur 11 House Building Mirpur 11" +
                        "Mirpur 11 Abdullahpur Mirpur 11 Kamarpara Mirpur 11" +
                        "Purobi Kalshi Purobi" +
                        "Purobi ECB Square Purobi MES Purobi Shewra Purobi Kuril Bishwa Road Purobi Khilkhet Purobi Airport Purobi Jasimuddin Purobi" +
                        "Purobi Azampur Purobi House Building Purobi" +
                        "Purobi Abdullahpur Purobi Kamarpara Purobi" +
                        "Kalshi ECB Square Kalshi MES Kalshi Shewra Kalshi Kuril Bishwa Road Kalshi Khilkhet Kalshi Airport Kalshi Jasimuddin Kalshi" +
                        "Kalshi Azampur Kalshi House Building Kalshi" +
                        "Kalshi Abdullahpur Kalshi Kamarpara Kalshi" +
                        "ECB Square MES ECB Square Shewra ECB Square Kuril Bishwa Road ECB Square Khilkhet ECB Square Airport ECB Square Jasimuddin ECB Square" +
                        "ECB Square Azampur ECB Square House Building ECB Square" +
                        "ECB Square Abdullahpur ECB Square Kamarpara ECB Square" +
                        "MES Shewra MES Kuril Bishwa Road MES Khilkhet MES Airport MES Jasimuddin MES" +
                        "MES Azampur MES House Building MES" +
                        "MES Abdullahpur MES Kamarpara MES" +
                        "Shewra Kuril Bishwa Road Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra" +
                        "Shewra Azampur Shewra House Building Shewra" +
                        "Shewra Abdullahpur Shewra Kamarpara Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road" +
                        "Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road Kamarpara Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet" +
                        "Khilkhet Azampur Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet Kamarpara Khilkhet" +
                        "Airport Jasimuddin Airport" +
                        "Airport Azampur Airport House Building Airport" +
                        "Airport Abdullahpur Airport Kamarpara Airport" +
                        "Jasimuddin Azampur Jasimuddin House Building Jasimuddin" +
                        "Jasimuddin Abdullahpur Jasimuddin Kamarpara Jasimuddin" +
                        "Azampur House Building Azampur" +
                        "Azampur Abdullahpur Azampur Kamarpara Azampur" +
                        "House Building Abdullahpur House Building Kamarpara House Building" +
                        "Abdullahpur Kamarpara Abdullahpur"));


        buses.add(new Bus(R.drawable.logo,"Mohona",
                "Mirpur 14 Mirpur 10 Mirpur 14 Mirpur 2 Mirpur 14 Sony Hall Mirpur 14 Mirpur 1 Mirpur 14 Konabari Mirpur 14" +
                        "Mirpur 14 Rupnagar Mirpur 14 Birulia Mirpur 14 Ashulia Mirpur 14 Zirabo Mirpur 14" +
                        "Mirpur 14 Fantasy Kingdom Mirpur 14" +
                        "Mirpur 10 Mirpur 2 Mirpur 10 Sony Hall Mirpur 10 Mirpur 1 Mirpur 10 Konabari Mirpur 10" +
                        "Mirpur 10 Rupnagar Mirpur 10 Birulia Mirpur 10 Ashulia Mirpur 10 Zirabo Mirpur 10" +
                        "Mirpur 10 Fantasy Kingdom Mirpur 10" +
                        "Mirpur 2 Sony Hall Mirpur 2 Mirpur 1 Mirpur 2 Konabari Mirpur 2" +
                        "Mirpur 2 Rupnagar Mirpur 2 Birulia Mirpur 2 Ashulia Mirpur 2 Zirabo Mirpur 2" +
                        "Mirpur 2 Fantasy Kingdom Mirpur 2" +
                        "Sony Hall Mirpur 1 Sony Hall Konabari Sony Hall" +
                        "Sony Hall Rupnagar Sony Hall Birulia Sony Hall Ashulia Sony Hall Zirabo Sony Hall" +
                        "Sony Hall Fantasy Kingdom Sony Hall" +
                        "Mirpur 1 Konabari Mirpur 1" +
                        "Mirpur 1 Rupnagar Mirpur 1 Birulia Mirpur 1 Ashulia Mirpur 1 Zirabo Mirpur 1" +
                        "Mirpur 1 Fantasy Kingdom Mirpur 1" +
                        "Konabari Rupnagar Konabari Birulia Konabari Ashulia Konabari Zirabo Konabari" +
                        "Konabari Fantasy Kingdom Konabari" +
                        "Rupnagar Birulia Rupnagar Ashulia Rupnagar Zirabo Rupnagar" +
                        "Rupnagar Fantasy Kingdom Rupnagar" +
                        "Birulia Ashulia Birulia Zirabo Birulia" +
                        "Birulia Fantasy Kingdom Birulia" +
                        "Ashulia Zirabo Ashulia" +
                        "Ashulia Fantasy Kingdom Ashulia" +
                        "Zirabo Fantasy Kingdom Zirabo"));



        buses.add(new Bus(R.drawable.logo,"Moitri",
                "Mohammadpur Shankar Mohammadpur Star Kabab Mohammadpur Dhanmondi 15 Mohammadpur Jigatola Mohammadpur" +
                        "Mohammadpur City College Mohammadpur Science Lab Mohammadpur Bata Signal Mohammadpur Katabon Mohammadpur" +
                        "Mohammadpur Shahbag Mohammadpur Motsho Bhobon Mohammadpur High Court Mohammadpur Press Club Mohammadpur" +
                        "Mohammadpur Paltan Mohammadpur GPO Mohammadpur Gulisthan Mohammadpur Motijheel Mohammadpur" +
                        "Mohammadpur Arambag Mohammadpur" +
                        "Shankar Star Kabab Shankar Dhanmondi 15 Shankar Jigatola Shankar" +
                        "Shankar City College Shankar Science Lab Shankar Bata Signal Shankar Katabon Shankar" +
                        "Shankar Shahbag Shankar Motsho Bhobon Shankar High Court Shankar Press Club Shankar" +
                        "Shankar Paltan Shankar GPO Shankar Gulisthan Shankar Motijheel Shankar" +
                        "Shankar Arambag Shankar" +
                        "Star Kabab Dhanmondi 15 Star Kabab Jigatola Star Kabab" +
                        "Star Kabab City College Star Kabab Science Lab Star Kabab Bata Signal Star Kabab Katabon Star Kabab" +
                        "Star Kabab Shahbag Star Kabab Motsho Bhobon Star Kabab High Court Star Kabab Press Club Star Kabab" +
                        "Star Kabab Paltan Star Kabab GPO Star Kabab Gulisthan Star Kabab Motijheel Star Kabab" +
                        "Star Kabab Arambag Star Kabab" +
                        "Dhanmondi 15 Jigatola Dhanmondi 15" +
                        "Dhanmondi 15 City College Dhanmondi 15 Science Lab Dhanmondi 15 Bata Signal Dhanmondi 15 Katabon Dhanmondi 15" +
                        "Dhanmondi 15 Shahbag Dhanmondi 15 Motsho Bhobon Dhanmondi 15 High Court Dhanmondi 15 Press Club Dhanmondi 15" +
                        "Dhanmondi 15 Paltan Dhanmondi 15 GPO Dhanmondi 15 Gulisthan Dhanmondi 15 Motijheel Dhanmondi 15" +
                        "Dhanmondi 15 Arambag Dhanmondi 15" +
                        "Jigatola City College Jigatola Science Lab Jigatola Bata Signal Jigatola Katabon Jigatola" +
                        "Jigatola Shahbag Jigatola Motsho Bhobon Jigatola High Court Jigatola Press Club Jigatola" +
                        "Jigatola Paltan Jigatola GPO Jigatola Gulisthan Jigatola Motijheel Jigatola" +
                        "Jigatola Arambag Jigatola" +
                        "City College Science Lab City College Bata Signal City College Katabon City College" +
                        "City College Shahbag City College Motsho Bhobon City College High Court City College Press Club City College" +
                        "City College Paltan City College GPO City College Gulisthan City College Motijheel City College" +
                        "City College Arambag City College" +
                        "Science Lab Bata Signal Science Lab Katabon Science Lab" +
                        "Science Lab Shahbag Science Lab Motsho Bhobon Science Lab High Court Science Lab Press Club Science Lab" +
                        "Science Lab Paltan Science Lab GPO Science Lab Gulisthan Science Lab Motijheel Science Lab" +
                        "Science Lab Arambag Science Lab" +
                        "Bata Signal Katabon Bata Signal Shahbag Bata Signal Motsho Bhobon Bata Signal High Court Bata Signal Press Club Bata Signal" +
                        "Bata Signal Paltan Bata Signal GPO Bata Signal Gulisthan Bata Signal Motijheel Bata Signal" +
                        "Bata Signal Arambag Bata Signal" +
                        "Katabon Shahbag Katabon Motsho Bhobon Katabon High Court Katabon Press Club Katabon" +
                        "Katabon Paltan Katabon GPO Katabon Gulisthan Katabon Motijheel Katabon" +
                        "Katabon Arambag Katabon" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag" +
                        "Shahbag Paltan Shahbag GPO Shahbag Gulisthan Shahbag Motijheel Shahbag" +
                        "Shahbag Arambag Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon" +
                        "Motsho Bhobon Paltan Motsho Bhobon GPO Motsho Bhobon Gulisthan Motsho Bhobon Motijheel Motsho Bhobon" +
                        "Motsho Bhobon Arambag Motsho Bhobon" +
                        "High Court Press Club High Court" +
                        "High Court Paltan High Court GPO High Court Gulisthan High Court Motijheel High Court" +
                        "High Court Arambag High Court" +
                        "Press Club Paltan Press Club GPO Press Club Gulisthan Press Club Motijheel Press Club" +
                        "Press Club Arambag Press Club" +
                        "Paltan GPO Paltan Gulisthan Paltan Motijheel Paltan" +
                        "Paltan Arambag Paltan" +
                        "GPO Gulisthan GPO Motijheel GPO" +
                        "GPO Arambag GPO" +
                        "Gulisthan Motijheel Gulisthan" +
                        "Gulisthan Arambag Gulisthan" +
                        "Motijheel Arambag Motijheel"));


        buses.add(new Bus(R.drawable.logo,"Moumita Transport",
                "Chashara Shibu Market Chashara Jalkuri Chashara Sign Board Chashara Matuail Chashara Rayerbag Chashara Shonir Akhra Chashara Jatrabari Chashara" +
                        "Chashara Sayedabad Chashara Gulisthan Chashara Chankhar Pul Chashara Bakshi Bazar Chashara Azimpur Chashara Nilkhet Chashara New Market Chashara" +
                        "Chashara City College Chashara Kalabagan Chashara Dhanmondi 32 Chashara Dhanmondi 27 Chashara Asad Gate Chashara College Gate Chashara Shishu Mela Chashara" +
                        "Chashara Shyamoli Chashara Kallayanpur Chashara Gabtoli Chashara Aminbazar Chashara Hemayetpur Chashara Savar Chashara Baipayl Chashara Zirani Bazar Chashara" +
                        "Chashara Nandan Park Chashara Chandra Chashara" +
                        "Shibu Market Jalkuri Shibu Market Sign Board Shibu Market Matuail Shibu Market Rayerbag Shibu Market Shonir Akhra Shibu Market Jatrabari Shibu Market" +
                        "Shibu Market Sayedabad Shibu Market Gulisthan Shibu Market Chankhar Pul Shibu Market Bakshi Bazar Shibu Market Azimpur Shibu Market Nilkhet Shibu Market New Market Shibu Market" +
                        "Shibu Market City College Shibu Market Kalabagan Shibu Market Dhanmondi 32 Shibu Market Dhanmondi 27 Shibu Market Asad Gate Shibu Market College Gate Shibu Market Shishu Mela Shibu Market" +
                        "Shibu Market Shyamoli Shibu Market Kallayanpur Shibu Market Gabtoli Shibu Market Aminbazar Shibu Market Hemayetpur Shibu Market Savar Shibu Market Baipayl Shibu Market Zirani Bazar Shibu Market" +
                        "Shibu Market Nandan Park Shibu Market Chandra Shibu Market" +
                        "Jalkuri Sign Board Jalkuri Matuail Jalkuri Rayerbag Jalkuri Shonir Akhra Jalkuri Jatrabari Jalkuri" +
                        "Jalkuri Sayedabad Jalkuri Gulisthan Jalkuri Chankhar Pul Jalkuri Bakshi Bazar Jalkuri Azimpur Jalkuri Nilkhet Jalkuri New Market Jalkuri" +
                        "Jalkuri City College Jalkuri Kalabagan Jalkuri Dhanmondi 32 Jalkuri Dhanmondi 27 Jalkuri Asad Gate Jalkuri College Gate Jalkuri Shishu Mela Jalkuri" +
                        "Jalkuri Shyamoli Jalkuri Kallayanpur Jalkuri Gabtoli Jalkuri Aminbazar Jalkuri Hemayetpur Jalkuri Savar Jalkuri Baipayl Jalkuri Zirani Bazar Jalkuri" +
                        "Jalkuri Nandan Park Jalkuri Chandra Jalkuri" +
                        "Sign Board Matuail Sign Board Rayerbag Sign Board Shonir Akhra Sign Board Jatrabari Sign Board" +
                        "Sign Board Sayedabad Sign Board Gulisthan Sign Board Chankhar Pul Sign Board Bakshi Bazar Sign Board Azimpur Sign Board Nilkhet Sign Board New Market Sign Board" +
                        "Sign Board City College Sign Board Kalabagan Sign Board Dhanmondi 32 Sign Board Dhanmondi 27 Sign Board Asad Gate Sign Board College Gate Sign Board Shishu Mela Sign Board" +
                        "Sign Board Shyamoli Sign Board Kallayanpur Sign Board Gabtoli Sign Board Aminbazar Sign Board Hemayetpur Sign Board Savar Sign Board Baipayl Sign Board Zirani Bazar Sign Board" +
                        "Sign Board Nandan Park Sign Board Chandra Sign Board" +
                        "Matuail Rayerbag Matuail Shonir Akhra Matuail Jatrabari Matuail" +
                        "Matuail Sayedabad Matuail Gulisthan Matuail Chankhar Pul Matuail Bakshi Bazar Matuail Azimpur Matuail Nilkhet Matuail New Market Matuail" +
                        "Matuail City College Matuail Kalabagan Matuail Dhanmondi 32 Matuail Dhanmondi 27 Matuail Asad Gate Matuail College Gate Matuail Shishu Mela Matuail" +
                        "Matuail Shyamoli Matuail Kallayanpur Matuail Gabtoli Matuail Aminbazar Matuail Hemayetpur Matuail Savar Matuail Baipayl Matuail Zirani Bazar Matuail" +
                        "Matuail Nandan Park Matuail Chandra Matuail" +
                        "Rayerbag Shonir Akhra Rayerbag Jatrabari Rayerbag" +
                        "Rayerbag Sayedabad Rayerbag Gulisthan Rayerbag Chankhar Pul Rayerbag Bakshi Bazar Rayerbag Azimpur Rayerbag Nilkhet Rayerbag New Market Rayerbag" +
                        "Rayerbag City College Rayerbag Kalabagan Rayerbag Dhanmondi 32 Rayerbag Dhanmondi 27 Rayerbag Asad Gate Rayerbag College Gate Rayerbag Shishu Mela Rayerbag" +
                        "Rayerbag Shyamoli Rayerbag Kallayanpur Rayerbag Gabtoli Rayerbag Aminbazar Rayerbag Hemayetpur Rayerbag Savar Rayerbag Baipayl Rayerbag Zirani Bazar Rayerbag" +
                        "Rayerbag Nandan Park Rayerbag Chandra Rayerbag" +
                        "Shonir Akhra Jatrabari Shonir Akhra" +
                        "Shonir Akhra Sayedabad Shonir Akhra Gulisthan Shonir Akhra Chankhar Pul Shonir Akhra Bakshi Bazar Shonir Akhra Azimpur Shonir Akhra Nilkhet Shonir Akhra New Market Shonir Akhra" +
                        "Shonir Akhra City College Shonir Akhra Kalabagan Shonir Akhra Dhanmondi 32 Shonir Akhra Dhanmondi 27 Shonir Akhra Asad Gate Shonir Akhra College Gate Shonir Akhra Shishu Mela Shonir Akhra" +
                        "Shonir Akhra Shyamoli Shonir Akhra Kallayanpur Shonir Akhra Gabtoli Shonir Akhra Aminbazar Shonir Akhra Hemayetpur Shonir Akhra Savar Shonir Akhra Baipayl Shonir Akhra Zirani Bazar Shonir Akhra" +
                        "Shonir Akhra Nandan Park Shonir Akhra Chandra Shonir Akhra" +
                        "Jatrabari Sayedabad Jatrabari Gulisthan Jatrabari Chankhar Pul Jatrabari Bakshi Bazar Jatrabari Azimpur Jatrabari Nilkhet Jatrabari New Market Jatrabari" +
                        "Jatrabari City College Jatrabari Kalabagan Jatrabari Dhanmondi 32 Jatrabari Dhanmondi 27 Jatrabari Asad Gate Jatrabari College Gate Jatrabari Shishu Mela Jatrabari" +
                        "Jatrabari Shyamoli Jatrabari Kallayanpur Jatrabari Gabtoli Jatrabari Aminbazar Jatrabari Hemayetpur Jatrabari Savar Jatrabari Baipayl Jatrabari Zirani Bazar Jatrabari" +
                        "Jatrabari Nandan Park Jatrabari Chandra Jatrabari" +
                        "Sayedabad Gulisthan Sayedabad Chankhar Pul Sayedabad Bakshi Bazar Sayedabad Azimpur Sayedabad Nilkhet Sayedabad New Market Sayedabad" +
                        "Sayedabad City College Sayedabad Kalabagan Sayedabad Dhanmondi 32 Sayedabad Dhanmondi 27 Sayedabad Asad Gate Sayedabad College Gate Sayedabad Shishu Mela Sayedabad" +
                        "Sayedabad Shyamoli Sayedabad Kallayanpur Sayedabad Gabtoli Sayedabad Aminbazar Sayedabad Hemayetpur Sayedabad Savar Sayedabad Baipayl Sayedabad Zirani Bazar Sayedabad" +
                        "Sayedabad Nandan Park Sayedabad Chandra Sayedabad" +
                        "Gulisthan Chankhar Pul Gulisthan Bakshi Bazar Gulisthan Azimpur Gulisthan Nilkhet Gulisthan New Market Gulisthan" +
                        "Gulisthan City College Gulisthan Kalabagan Gulisthan Dhanmondi 32 Gulisthan Dhanmondi 27 Gulisthan Asad Gate Gulisthan College Gate Gulisthan Shishu Mela Gulisthan" +
                        "Gulisthan Shyamoli Gulisthan Kallayanpur Gulisthan Gabtoli Gulisthan Aminbazar Gulisthan Hemayetpur Gulisthan Savar Gulisthan Baipayl Gulisthan Zirani Bazar Gulisthan" +
                        "Gulisthan Nandan Park Gulisthan Chandra Gulisthan" +
                        "Chankhar Pul Bakshi Bazar Chankhar Pul Azimpur Chankhar Pul Nilkhet Chankhar Pul New Market Chankhar Pul" +
                        "Chankhar Pul City College Chankhar Pul Kalabagan Chankhar Pul Dhanmondi 32 Chankhar Pul Dhanmondi 27 Chankhar Pul Asad Gate Chankhar Pul College Gate Chankhar Pul Shishu Mela Chankhar Pul" +
                        "Chankhar Pul Shyamoli Chankhar Pul Kallayanpur Chankhar Pul Gabtoli Chankhar Pul Aminbazar Chankhar Pul Hemayetpur Chankhar Pul Savar Chankhar Pul Baipayl Chankhar Pul Zirani Bazar Chankhar Pul" +
                        "Chankhar Pul Nandan Park Chankhar Pul Chandra Chankhar Pul" +
                        "Bakshi Bazar Azimpur Bakshi Bazar Nilkhet Bakshi Bazar New Market Bakshi Bazar" +
                        "Bakshi Bazar City College Bakshi Bazar Kalabagan Bakshi Bazar Dhanmondi 32 Bakshi Bazar Dhanmondi 27 Bakshi Bazar Asad Gate Bakshi Bazar College Gate Bakshi Bazar Shishu Mela Bakshi Bazar" +
                        "Bakshi Bazar Shyamoli Bakshi Bazar Kallayanpur Bakshi Bazar Gabtoli Bakshi Bazar Aminbazar Bakshi Bazar Hemayetpur Bakshi Bazar Savar Bakshi Bazar Baipayl Bakshi Bazar Zirani Bazar Bakshi Bazar" +
                        "Bakshi Bazar Nandan Park Bakshi Bazar Chandra Bakshi Bazar" +
                        "Azimpur Nilkhet Azimpur New Market Azimpur" +
                        "Azimpur City College Azimpur Kalabagan Azimpur Dhanmondi 32 Azimpur Dhanmondi 27 Azimpur Asad Gate Azimpur College Gate Azimpur Shishu Mela Azimpur" +
                        "Azimpur Shyamoli Azimpur Kallayanpur Azimpur Gabtoli Azimpur Aminbazar Azimpur Hemayetpur Azimpur Savar Azimpur Baipayl Azimpur Zirani Bazar Azimpur" +
                        "Azimpur Nandan Park Azimpur Chandra Azimpur" +
                        "Nilkhet New Market Nilkhet" +
                        "Nilkhet City College Nilkhet Kalabagan Nilkhet Dhanmondi 32 Nilkhet Dhanmondi 27 Nilkhet Asad Gate Nilkhet College Gate Nilkhet Shishu Mela Nilkhet" +
                        "Nilkhet Shyamoli Nilkhet Kallayanpur Nilkhet Gabtoli Nilkhet Aminbazar Nilkhet Hemayetpur Nilkhet Savar Nilkhet Baipayl Nilkhet Zirani Bazar Nilkhet" +
                        "Nilkhet Nandan Park Nilkhet Chandra Nilkhet" +
                        "New Market City College New Market Kalabagan New Market Dhanmondi 32 New Market Dhanmondi 27 New Market Asad Gate New Market College Gate New Market Shishu Mela New Market" +
                        "New Market Shyamoli New Market Kallayanpur New Market Gabtoli New Market Aminbazar New Market Hemayetpur New Market Savar New Market Baipayl New Market Zirani Bazar New Market" +
                        "New Market Nandan Park New Market Chandra New Market" +
                        "City College Kalabagan City College Dhanmondi 32 City College Dhanmondi 27 City College Asad Gate City College College Gate City College Shishu Mela City College" +
                        "City College Shyamoli City College Kallayanpur City College Gabtoli City College Aminbazar City College Hemayetpur City College Savar City College Baipayl City College Zirani Bazar City College" +
                        "City College Nandan Park City College Chandra City College" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad Gate Kalabagan College Gate Kalabagan Shishu Mela Kalabagan" +
                        "Kalabagan Shyamoli Kalabagan Kallayanpur Kalabagan Gabtoli Kalabagan Aminbazar Kalabagan Hemayetpur Kalabagan Savar Kalabagan Baipayl Kalabagan Zirani Bazar Kalabagan" +
                        "Kalabagan Nandan Park Kalabagan Chandra Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad Gate Dhanmondi 32 College Gate Dhanmondi 32 Shishu Mela Dhanmondi 32" +
                        "Dhanmondi 32 Shyamoli Dhanmondi 32 Kallayanpur Dhanmondi 32 Gabtoli Dhanmondi 32 Aminbazar Dhanmondi 32 Hemayetpur Dhanmondi 32 Savar Dhanmondi 32 Baipayl Dhanmondi 32 Zirani Bazar Dhanmondi 32" +
                        "Dhanmondi 32 Nandan Park Dhanmondi 32 Chandra Dhanmondi 32" +
                        "Dhanmondi 27 Asad Gate Dhanmondi 27 College Gate Dhanmondi 27 Shishu Mela Dhanmondi 27" +
                        "Dhanmondi 27 Shyamoli Dhanmondi 27 Kallayanpur Dhanmondi 27 Gabtoli Dhanmondi 27 Aminbazar Dhanmondi 27 Hemayetpur Dhanmondi 27 Savar Dhanmondi 27 Baipayl Dhanmondi 27 Zirani Bazar Dhanmondi 27" +
                        "Dhanmondi 27 Nandan Park Dhanmondi 27 Chandra Dhanmondi 27" +
                        "Asad Gate College Gate Asad Gate Shishu Mela Asad Gate" +
                        "Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Gabtoli Asad Gate Aminbazar Asad Gate Hemayetpur Asad Gate Savar Asad Gate Baipayl Asad Gate Zirani Bazar Asad Gate" +
                        "Asad Gate Nandan Park Asad Gate Chandra Asad Gate" +
                        "College Gate Shishu Mela College Gate" +
                        "College Gate Shyamoli College Gate Kallayanpur College Gate Gabtoli College Gate Aminbazar College Gate Hemayetpur College Gate Savar College Gate Baipayl College Gate Zirani Bazar College Gate" +
                        "College Gate Nandan Park College Gate Chandra College Gate" +
                        "Shishu Mela Shyamoli Shishu Mela Kallayanpur Shishu Mela Gabtoli Shishu Mela Aminbazar Shishu Mela Hemayetpur Shishu Mela Savar Shishu Mela Baipayl Shishu Mela Zirani Bazar Shishu Mela" +
                        "Shishu Mela Nandan Park Shishu Mela Chandra Shishu Mela" +
                        "Shyamoli Kallayanpur Shyamoli Gabtoli Shyamoli Aminbazar Shyamoli Hemayetpur Shyamoli Savar Shyamoli Baipayl Shyamoli Zirani Bazar Shyamoli" +
                        "Shyamoli Nandan Park Shyamoli Chandra Shyamoli" +
                        "Kallayanpur Gabtoli Kallayanpur Aminbazar Kallayanpur Hemayetpur Kallayanpur Savar Kallayanpur Baipayl Kallayanpur Zirani Bazar Kallayanpur" +
                        "Kallayanpur Nandan Park Kallayanpur Chandra Kallayanpur" +
                        "Gabtoli Aminbazar Gabtoli Hemayetpur Gabtoli Savar Gabtoli Baipayl Gabtoli Zirani Bazar Gabtoli" +
                        "Gabtoli Nandan Park Gabtoli Chandra Gabtoli" +
                        "Aminbazar Hemayetpur Aminbazar Savar Aminbazar Baipayl Aminbazar Zirani Bazar Aminbazar" +
                        "Aminbazar Nandan Park Aminbazar Chandra Aminbazar" +
                        "Hemayetpur Savar Hemayetpur Baipayl Hemayetpur Zirani Bazar Hemayetpur" +
                        "Hemayetpur Nandan Park Hemayetpur Chandra Hemayetpur" +
                        "Savar Baipayl Savar Zirani Bazar Savar" +
                        "Savar Nandan Park Savar Chandra Savar" +
                        "Baipayl Zirani Bazar Baipayl" +
                        "Baipayl Nandan Park Baipayl Chandra Baipayl" +
                        "Zirani Bazar Nandan Park Zirani Bazar Chandra Zirani Bazar" +
                        "Nandan Park Chandra Nandan Park"));



        buses.add(new Bus(R.drawable.logo,"Nilachol",
                "Chittagang Road Sign Board Chittagang Road Matuail Chittagang Road Rayerbag Chittagang Road Shonir Akhra Chittagang Road Jatrabari Chittagang Road" +
                        "Chittagang Road Sayedabad Chittagang Road Gulisthan Chittagang Road Chankhar Pul Chittagang Road Bakshi Bazar Chittagang Road Azimpur Chittagang Road Nilkhet Chittagang Road New Market Chittagang Road" +
                        "Chittagang Road City College Chittagang Road Kalabagan Chittagang Road Dhanmondi 32 Chittagang Road Dhanmondi 27 Chittagang Road Asad Gate Chittagang Road College Gate Chittagang Road Shishu Mela Chittagang Road" +
                        "Chittagang Road Shyamoli Chittagang Road Kallayanpur Chittagang Road Gabtoli Chittagang Road Aminbazar Chittagang Road Hemayetpur Chittagang Road Nobinagar Chittagang Road Manikganj Chittagang Road" +
                        "Chittagang Road Paturia Chittagang Road" +
                        "Sign Board Matuail Sign Board Rayerbag Sign Board Shonir Akhra Sign Board Jatrabari Sign Board" +
                        "Sign Board Sayedabad Sign Board Gulisthan Sign Board Chankhar Pul Sign Board Bakshi Bazar Sign Board Azimpur Sign Board Nilkhet Sign Board New Market Sign Board" +
                        "Sign Board City College Sign Board Kalabagan Sign Board Dhanmondi 32 Sign Board Dhanmondi 27 Sign Board Asad Gate Sign Board College Gate Sign Board Shishu Mela Sign Board" +
                        "Sign Board Shyamoli Sign Board Kallayanpur Sign Board Gabtoli Sign Board Aminbazar Sign Board Hemayetpur Sign Board Savar Nobinagar Sign Board Manikganj Sign Board" +
                        "Sign Board Paturia Sign Board" +
                        "Matuail Rayerbag Matuail Shonir Akhra Matuail Jatrabari Matuail" +
                        "Matuail Sayedabad Matuail Gulisthan Matuail Chankhar Pul Matuail Bakshi Bazar Matuail Azimpur Matuail Nilkhet Matuail New Market Matuail" +
                        "Matuail City College Matuail Kalabagan Matuail Dhanmondi 32 Matuail Dhanmondi 27 Matuail Asad Gate Matuail College Gate Matuail Shishu Mela Matuail" +
                        "Matuail Shyamoli Matuail Kallayanpur Matuail Gabtoli Matuail Aminbazar Matuail Hemayetpur Matuail Nobinagar Matuail Manikganj Matuail" +
                        "Matuail Paturia Matuail" +
                        "Rayerbag Shonir Akhra Rayerbag Jatrabari Rayerbag" +
                        "Rayerbag Sayedabad Rayerbag Gulisthan Rayerbag Chankhar Pul Rayerbag Bakshi Bazar Rayerbag Azimpur Rayerbag Nilkhet Rayerbag New Market Rayerbag" +
                        "Rayerbag City College Rayerbag Kalabagan Rayerbag Dhanmondi 32 Rayerbag Dhanmondi 27 Rayerbag Asad Gate Rayerbag College Gate Rayerbag Shishu Mela Rayerbag" +
                        "Rayerbag Shyamoli Rayerbag Kallayanpur Rayerbag Gabtoli Rayerbag Aminbazar Rayerbag Hemayetpur Rayerbag Nobinagar Rayerbag Manikganj Rayerbag" +
                        "Rayerbag Paturia Rayerbag" +
                        "Shonir Akhra Jatrabari Shonir Akhra" +
                        "Shonir Akhra Sayedabad Shonir Akhra Gulisthan Shonir Akhra Chankhar Pul Shonir Akhra Bakshi Bazar Shonir Akhra Azimpur Shonir Akhra Nilkhet Shonir Akhra New Market Shonir Akhra" +
                        "Shonir Akhra City College Shonir Akhra Kalabagan Shonir Akhra Dhanmondi 32 Shonir Akhra Dhanmondi 27 Shonir Akhra Asad Gate Shonir Akhra College Gate Shonir Akhra Shishu Mela Shonir Akhra" +
                        "Shonir Akhra Shyamoli Shonir Akhra Kallayanpur Shonir Akhra Gabtoli Shonir Akhra Aminbazar Shonir Akhra Hemayetpur Shonir Akhra Nobinagar Shonir Akhra Manikganj Shonir Akhra" +
                        "Shonir Akhra Paturia Shonir Akhra" +
                        "Jatrabari Sayedabad Jatrabari Gulisthan Jatrabari Chankhar Pul Jatrabari Bakshi Bazar Jatrabari Azimpur Jatrabari Nilkhet Jatrabari New Market Jatrabari" +
                        "Jatrabari City College Jatrabari Kalabagan Jatrabari Dhanmondi 32 Jatrabari Dhanmondi 27 Jatrabari Asad Gate Jatrabari College Gate Jatrabari Shishu Mela Jatrabari" +
                        "Jatrabari Shyamoli Jatrabari Kallayanpur Jatrabari Gabtoli Jatrabari Aminbazar Jatrabari Hemayetpur Jatrabari Nobinagar Jatrabari Manikganj Jatrabari" +
                        "Jatrabari Paturia Jatrabari" +
                        "Sayedabad Gulisthan Sayedabad Chankhar Pul Sayedabad Bakshi Bazar Sayedabad Azimpur Sayedabad Nilkhet Sayedabad New Market Sayedabad" +
                        "Sayedabad City College Sayedabad Kalabagan Sayedabad Dhanmondi 32 Sayedabad Dhanmondi 27 Sayedabad Asad Gate Sayedabad College Gate Sayedabad Shishu Mela Sayedabad" +
                        "Sayedabad Shyamoli Sayedabad Kallayanpur Sayedabad Gabtoli Sayedabad Aminbazar Sayedabad Hemayetpur Sayedabad Nobinagar Sayedabad Manikganj Sayedabad" +
                        "Sayedabad Paturia Sayedabad" +
                        "Gulisthan Chankhar Pul Gulisthan Bakshi Bazar Gulisthan Azimpur Gulisthan Nilkhet Gulisthan New Market Gulisthan" +
                        "Gulisthan City College Gulisthan Kalabagan Gulisthan Dhanmondi 32 Gulisthan Dhanmondi 27 Gulisthan Asad Gate Gulisthan College Gate Gulisthan Shishu Mela Gulisthan" +
                        "Gulisthan Shyamoli Gulisthan Kallayanpur Gulisthan Gabtoli Gulisthan Aminbazar Gulisthan Hemayetpur Gulisthan Nobinagar Gulisthan Manikganj Gulisthan" +
                        "Gulisthan Paturia Gulisthan" +
                        "Chankhar Pul Bakshi Bazar Chankhar Pul Azimpur Chankhar Pul Nilkhet Chankhar Pul New Market Chankhar Pul" +
                        "Chankhar Pul City College Chankhar Pul Kalabagan Chankhar Pul Dhanmondi 32 Chankhar Pul Dhanmondi 27 Chankhar Pul Asad Gate Chankhar Pul College Gate Chankhar Pul Shishu Mela Chankhar Pul" +
                        "Chankhar Pul Shyamoli Chankhar Pul Kallayanpur Chankhar Pul Gabtoli Chankhar Pul Aminbazar Chankhar Pul Hemayetpur Chankhar Pul Nobinagar Chankhar Pul Manikganj Chankhar Pul" +
                        "Chankhar Pul Paturia Chankhar Pul" +
                        "Bakshi Bazar Azimpur Bakshi Bazar Nilkhet Bakshi Bazar New Market Bakshi Bazar" +
                        "Bakshi Bazar City College Bakshi Bazar Kalabagan Bakshi Bazar Dhanmondi 32 Bakshi Bazar Dhanmondi 27 Bakshi Bazar Asad Gate Bakshi Bazar College Gate Bakshi Bazar Shishu Mela Bakshi Bazar" +
                        "Bakshi Bazar Shyamoli Bakshi Bazar Kallayanpur Bakshi Bazar Gabtoli Bakshi Bazar Aminbazar Bakshi Bazar Hemayetpur Bakshi Bazar Nobinagar Bakshi Bazar Manikganj Bakshi Bazar" +
                        "Bakshi Bazar Paturia Bakshi Bazar" +
                        "Azimpur Nilkhet Azimpur New Market Azimpur" +
                        "Azimpur City College Azimpur Kalabagan Azimpur Dhanmondi 32 Azimpur Dhanmondi 27 Azimpur Asad Gate Azimpur College Gate Azimpur Shishu Mela Azimpur" +
                        "Azimpur Shyamoli Azimpur Kallayanpur Azimpur Gabtoli Azimpur Aminbazar Azimpur Hemayetpur Azimpur Nobinagar Azimpur Manikganj Azimpur" +
                        "Azimpur Paturia Azimpur" +
                        "Nilkhet New Market Nilkhet" +
                        "Nilkhet City College Nilkhet Kalabagan Nilkhet Dhanmondi 32 Nilkhet Dhanmondi 27 Nilkhet Asad Gate Nilkhet College Gate Nilkhet Shishu Mela Nilkhet" +
                        "Nilkhet Shyamoli Nilkhet Kallayanpur Nilkhet Gabtoli Nilkhet Aminbazar Nilkhet Hemayetpur Nilkhet Nobinagar Nilkhet Manikganj Nilkhet" +
                        "Nilkhet Paturia Nilkhet" +
                        "New Market City College New Market Kalabagan New Market Dhanmondi 32 New Market Dhanmondi 27 New Market Asad Gate New Market College Gate New Market Shishu Mela New Market" +
                        "New Market Shyamoli New Market Kallayanpur New Market Gabtoli New Market Aminbazar New Market Hemayetpur New Market Nobinagar New Market Manikganj New Market" +
                        "New Market Paturia New Market" +
                        "City College Kalabagan City College Dhanmondi 32 City College Dhanmondi 27 City College Asad Gate City College College Gate City College Shishu Mela City College" +
                        "City College Shyamoli City College Kallayanpur City College Gabtoli City College Aminbazar City College Hemayetpur City College Nobinagar City College Manikganj City College" +
                        "City College Paturia City College" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad Gate Kalabagan College Gate Kalabagan Shishu Mela Kalabagan" +
                        "Kalabagan Shyamoli Kalabagan Kallayanpur Kalabagan Gabtoli Kalabagan Aminbazar Kalabagan Hemayetpur Kalabagan Nobinagar Kalabagan Manikganj Kalabagan" +
                        "Kalabagan Paturia Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad Gate Dhanmondi 32 College Gate Dhanmondi 32 Shishu Mela Dhanmondi 32" +
                        "Dhanmondi 32 Shyamoli Dhanmondi 32 Kallayanpur Dhanmondi 32 Gabtoli Dhanmondi 32 Aminbazar Dhanmondi 32 Hemayetpur Dhanmondi 32 Nobinagar Dhanmondi 32 Manikganj Dhanmondi 32" +
                        "Dhanmondi 32 Paturia Dhanmondi 32" +
                        "Dhanmondi 27 Asad Gate Dhanmondi 27 College Gate Dhanmondi 27 Shishu Mela Dhanmondi 27" +
                        "Dhanmondi 27 Shyamoli Dhanmondi 27 Kallayanpur Dhanmondi 27 Gabtoli Dhanmondi 27 Aminbazar Dhanmondi 27 Hemayetpur Dhanmondi 27 Nobinagar Dhanmondi 27 Manikganj Dhanmondi 27" +
                        "Dhanmondi 27 Paturia Dhanmondi 27" +
                        "Asad Gate College Gate Asad Gate Shishu Mela Asad Gate" +
                        "Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Gabtoli Asad Gate Aminbazar Asad Gate Hemayetpur Asad Gate Nobinagar Asad Gate Manikganj Asad Gate" +
                        "Asad Gate Paturia Asad Gate" +
                        "College Gate Shishu Mela College Gate" +
                        "College Gate Shyamoli College Gate Kallayanpur College Gate Gabtoli College Gate Aminbazar College Gate Hemayetpur College Gate Nobinagar College Gate Manikganj College Gate" +
                        "College Gate Paturia College Gate" +
                        "Shishu Mela Shyamoli Shishu Mela Kallayanpur Shishu Mela Gabtoli Shishu Mela Aminbazar Shishu Mela Hemayetpur Shishu Mela Nobinagar Shishu Mela Manikganj Shishu Mela" +
                        "Shishu Mela Paturia Shishu Mela" +
                        "Shyamoli Kallayanpur Shyamoli Gabtoli Shyamoli Aminbazar Shyamoli Hemayetpur Shyamoli Nobinagar Shyamoli Manikganj Shyamoli" +
                        "Shyamoli Paturia Shyamoli" +
                        "Kallayanpur Gabtoli Kallayanpur Aminbazar Kallayanpur Hemayetpur Kallayanpur Nobinagar Kallayanpur Manikganj Kallayanpur" +
                        "Kallayanpur Paturia Kallayanpur" +
                        "Gabtoli Aminbazar Gabtoli Hemayetpur Gabtoli Nobinagar Gabtoli Manikganj Gabtoli" +
                        "Gabtoli Paturia Gabtoli" +
                        "Aminbazar Hemayetpur Aminbazar Nobinagar Aminbazar Manikganj Aminbazar" +
                        "Aminbazar Paturia Aminbazar" +
                        "Hemayetpur Nobinagar Hemayetpur Manikganj Hemayetpur" +
                        "Hemayetpur Paturia Hemayetpur" +
                        "Nobinagar Manikganj Nobinagar" +
                        "Nobinagar Paturia Nobinagar" +
                        "Manikganj Paturia Manikganj"));


        buses.add(new Bus(R.drawable.logo,"Nobokoli Paribahan",
                "Chiriakhana Mirpur 1 Chiriakhana Ansar Camp Chiriakhana Technical Chiriakhana Kallayanpur Chiriakhana Shyamoli Chiriakhana Shishu Mela Chiriakhana" +
                        "Chiriakhana College Gate Chiriakhana Asad Gate Chiriakhana Dhanmondi 27 Chiriakhana Dhanmondi 32 Chiriakhana Kalabagan Chiriakhana " +
                        "Chiriakhana Science Lab Chiriakhana Katabon Chiriakhana Shahbag Chiriakhana High Court Chiriakhana Fulbaria Chiriakhana Naya Bazar Chiriakhana" +
                        "Chiriakhana Babu Bazar Chiriakhana Keraniganj Chiriakhana" +
                        "Mirpur 1 Ansar Camp Mirpur 1 Technical Mirpur 1 Kallayanpur Mirpur 1 Shyamoli Mirpur 1 Shishu Mela Mirpur 1" +
                        "Mirpur 1 College Gate Mirpur 1 Asad Gate Mirpur 1 Dhanmondi 27 Mirpur 1 Dhanmondi 32 Mirpur 1 Kalabagan Mirpur 1 " +
                        "Mirpur 1 Science Lab Mirpur 1 Katabon Mirpur 1 Shahbag Mirpur 1 High Court Mirpur 1 Fulbaria Mirpur 1 Naya Bazar Mirpur 1" +
                        "Mirpur 1 Babu Bazar Mirpur 1 Keraniganj Mirpur 1" +
                        "Ansar Camp Technical Ansar Camp Kallayanpur Ansar Camp Shyamoli Ansar Camp Shishu Mela Ansar Camp" +
                        "Ansar Camp College Gate Ansar Camp Asad Gate Ansar Camp Dhanmondi 27 Ansar Camp Dhanmondi 32 Ansar Camp Kalabagan Ansar Camp " +
                        "Ansar Camp Science Lab Ansar Camp Katabon Ansar Camp Shahbag Ansar Camp High Court Ansar Camp Fulbaria Ansar Camp Naya Bazar Ansar Camp" +
                        "Ansar Camp Babu Bazar Ansar Camp Keraniganj Ansar Camp" +
                        "Technical Kallayanpur Technical Shyamoli Technical Shishu Mela Technical" +
                        "Technical College Gate Technical Asad Gate Technical Dhanmondi 27 Technical Dhanmondi 32 Technical Kalabagan Technical " +
                        "Technical Science Lab Technical Katabon Technical Shahbag Technical High Court Technical Fulbaria Technical Naya Bazar Technical" +
                        "Technical Babu Bazar Technical Keraniganj Technical" +
                        "Kallayanpur Shyamoli Kallayanpur Shishu Mela Kallayanpur" +
                        "Kallayanpur College Gate Kallayanpur Asad Gate Kallayanpur Dhanmondi 27 Kallayanpur Dhanmondi 32 Kallayanpur Kalabagan Kallayanpur " +
                        "Kallayanpur Science Lab Kallayanpur Katabon Kallayanpur Shahbag Kallayanpur High Court Kallayanpur Fulbaria Kallayanpur Naya Bazar Kallayanpur" +
                        "Kallayanpur Babu Bazar Kallayanpur Keraniganj Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli" +
                        "Shyamoli College Gate Shyamoli Asad Gate Shyamoli Dhanmondi 27 Shyamoli Dhanmondi 32 Shyamoli Kalabagan Shyamoli " +
                        "Shyamoli Science Lab Shyamoli Katabon Shyamoli Shahbag Shyamoli High Court Shyamoli Fulbaria Shyamoli Naya Bazar Shyamoli" +
                        "Shyamoli Babu Bazar Shyamoli Keraniganj Shyamoli" +
                        "Shishu Mela College Gate Shishu Mela Asad Gate Shishu Mela Dhanmondi 27 Shishu Mela Dhanmondi 32 Shishu Mela Kalabagan Shishu Mela " +
                        "Shishu Mela Science Lab Shishu Mela Katabon Shishu Mela Shahbag Shishu Mela High Court Shishu Mela Fulbaria Shishu Mela Naya Bazar Shishu Mela" +
                        "Shishu Mela Babu Bazar Shishu Mela Keraniganj Shishu Mela" +
                        "College Gate Asad Gate College Gate Dhanmondi 27 College Gate Dhanmondi 32 College Gate Kalabagan College Gate " +
                        "College Gate Science Lab College Gate Katabon College Gate Shahbag College Gate High Court College Gate Fulbaria College Gate Naya Bazar College Gate" +
                        "College Gate Babu Bazar College Gate Keraniganj College Gate" +
                        "Asad Gate Dhanmondi 27 Asad Gate Dhanmondi 32 Asad Gate Kalabagan Asad Gate " +
                        "Asad Gate Science Lab Asad Gate Katabon Asad Gate Shahbag Asad Gate High Court Asad Gate Fulbaria Asad Gate Naya Bazar Asad Gate" +
                        "Asad Gate Babu Bazar Asad Gate Keraniganj Asad Gate" +
                        "Dhanmondi 27 Dhanmondi 32 Dhanmondi 27 Kalabagan Dhanmondi 27 " +
                        "Dhanmondi 27 Science Lab Dhanmondi 27 Katabon Dhanmondi 27 Shahbag Dhanmondi 27 High Court Dhanmondi 27 Fulbaria Dhanmondi 27 Naya Bazar Dhanmondi 27" +
                        "Dhanmondi 27 Babu Bazar Dhanmondi 27 Keraniganj Dhanmondi 27" +
                        "Dhanmondi 32 Kalabagan Dhanmondi 32 " +
                        "Dhanmondi 32 Science Lab Dhanmondi 32 Katabon Dhanmondi 32 Shahbag Dhanmondi 32 High Court Dhanmondi 32 Fulbaria Dhanmondi 32 Naya Bazar Dhanmondi 32" +
                        "Dhanmondi 32 Babu Bazar Dhanmondi 32 Keraniganj Dhanmondi 32" +
                        "Kalabagan Science Lab Kalabagan Katabon Kalabagan Shahbag Kalabagan High Court Kalabagan Fulbaria Kalabagan Naya Bazar Kalabagan" +
                        "Kalabagan Babu Bazar Kalabagan Keraniganj Kalabagan" +
                        "Science Lab Katabon Science Lab Shahbag Science Lab High Court Science Lab Fulbaria Science Lab Naya Bazar Science Lab" +
                        "Science Lab Babu Bazar Science Lab Keraniganj Science Lab" +
                        "Katabon Shahbag Katabon High Court Katabon Fulbaria Katabon Naya Bazar Katabon" +
                        "Katabon Babu Bazar Katabon Keraniganj Katabon" +
                        "Shahbag High Court Shahbag Fulbaria Shahbag Naya Bazar Shahbag" +
                        "Shahbag Babu Bazar Shahbag Keraniganj Shahbag" +
                        "High Court Fulbaria High Court Naya Bazar High Court" +
                        "High Court Babu Bazar High Court Keraniganj High Court" +
                        "Fulbaria Naya Bazar Fulbaria" +
                        "Fulbaria Babu Bazar Fulbaria Keraniganj Fulbaria" +
                        "Naya Bazar Babu Bazar Naya Bazar Keraniganj Naya Bazar" +
                        "Babu Bazar Keraniganj Babu Bazar"));


        buses.add(new Bus(R.drawable.logo,"Nur E Mokka Paribahan",
                "Chiriakhana Sony Hall Chiriakhana Mirpur 2 Chiriakhana Mirpur 10 Chiriakhana Mirpur 11 Chiriakhana Purobi Chiriakhana Kalshi Chiriakhana" +
                        "Chiriakhana ECB Square Chiriakhana MES Chiriakhana Shewra Chiriakhana Kuril Bishwa Road Chiriakhana Bashundhara Chiriakhana Nadda Chiriakhana" +
                        "Chiriakhana Natun Bazar Chiriakhana Bashtola Chiriakhana Shahjadpur Chiriakhana Uttar Badda Bazar Chiriakhana Badda Chiriakhana" +
                        "Chiriakhana Madhya Badda Chiriakhana Merul Chiriakhana Rampura Bridge Chiriakhana" +
                        "Chiriakhana Aftab Nagar Chiriakhana" +
                        "Sony Hall Mirpur 2 Sony Hall Mirpur 10 Sony Hall Mirpur 11 Sony Hall Purobi Sony Hall Kalshi Sony Hall" +
                        "Sony Hall ECB Square Sony Hall MES Sony Hall Shewra Sony Hall Kuril Bishwa Road Sony Hall Bashundhara Sony Hall Nadda Sony Hall" +
                        "Sony Hall Natun Bazar Sony Hall Bashtola Sony Hall Shahjadpur Sony Hall Uttar Badda Bazar Sony Hall Badda Sony Hall" +
                        "Sony Hall Madhya Badda Sony Hall Merul Sony Hall Rampura Bridge Sony Hall" +
                        "Sony Hall Aftab Nagar Sony Hall" +
                        "Mirpur 2 Mirpur 10 Mirpur 2 Mirpur 11 Mirpur 2 Purobi Mirpur 2 Kalshi Mirpur 2" +
                        "Mirpur 2 ECB Square Mirpur 2 MES Mirpur 2 Shewra Mirpur 2 Kuril Bishwa Road Mirpur 2 Bashundhara Mirpur 2 Nadda Mirpur 2" +
                        "Mirpur 2 Natun Bazar Mirpur 2 Bashtola Mirpur 2 Shahjadpur Mirpur 2 Uttar Badda Bazar Mirpur 2 Badda Mirpur 2" +
                        "Mirpur 2 Madhya Badda Mirpur 2 Merul Mirpur 2 Rampura Bridge Mirpur 2" +
                        "Mirpur 2 Aftab Nagar Mirpur 2" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10" +
                        "Mirpur 10 ECB Square Mirpur 10 MES Mirpur 10 Shewra Mirpur 10 Kuril Bishwa Road Mirpur 10 Bashundhara Mirpur 10 Nadda Mirpur 10" +
                        "Mirpur 10 Natun Bazar Mirpur 10 Bashtola Mirpur 10 Shahjadpur Mirpur 10 Uttar Badda Bazar Mirpur 10 Badda Mirpur 10" +
                        "Mirpur 10 Madhya Badda Mirpur 10 Merul Mirpur 10 Rampura Bridge Mirpur 10" +
                        "Mirpur 10 Aftab Nagar Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Kalshi Mirpur 11" +
                        "Mirpur 11 ECB Square Mirpur 11 MES Mirpur 11 Shewra Mirpur 11 Kuril Bishwa Road Mirpur 11 Bashundhara Mirpur 11 Nadda Mirpur 11" +
                        "Mirpur 11 Natun Bazar Mirpur 11 Bashtola Mirpur 11 Shahjadpur Mirpur 11 Uttar Badda Bazar Mirpur 11 Badda Mirpur 11" +
                        "Mirpur 11 Madhya Badda Mirpur 11 Merul Mirpur 11 Rampura Bridge Mirpur 11" +
                        "Mirpur 11 Aftab Nagar Mirpur 11" +
                        "Purobi Kalshi Purobi" +
                        "Purobi ECB Square Purobi MES Purobi Shewra Purobi Kuril Bishwa Road Purobi Bashundhara Purobi Nadda Purobi" +
                        "Purobi Natun Bazar Purobi Bashtola Purobi Shahjadpur Purobi Uttar Badda Bazar Purobi Badda Purobi" +
                        "Purobi Madhya Badda Purobi Merul Purobi Rampura Bridge Purobi" +
                        "Purobi Aftab Nagar Purobi" +
                        "Kalshi ECB Square Kalshi MES Kalshi Shewra Kalshi Kuril Bishwa Road Kalshi Bashundhara Kalshi Nadda Kalshi" +
                        "Kalshi Natun Bazar Kalshi Bashtola Kalshi Shahjadpur Kalshi Uttar Badda Bazar Kalshi Badda Kalshi" +
                        "Kalshi Madhya Badda Kalshi Merul Kalshi Rampura Bridge Kalshi" +
                        "Kalshi Aftab Nagar Kalshi" +
                        "ECB Square MES ECB Square Shewra ECB Square Kuril Bishwa Road ECB Square Bashundhara ECB Square Nadda ECB Square" +
                        "ECB Square Natun Bazar ECB Square Bashtola ECB Square Shahjadpur ECB Square Uttar Badda Bazar ECB Square Badda ECB Square" +
                        "ECB Square Madhya Badda ECB Square Merul ECB Square Rampura Bridge ECB Square" +
                        "ECB Square Aftab Nagar ECB Square" +
                        "MES Shewra MES Kuril Bishwa Road MES Bashundhara MES Nadda MES" +
                        "MES Natun Bazar MES Bashtola MES Shahjadpur MES Uttar Badda Bazar MES Badda MES" +
                        "MES Madhya Badda MES Merul MES Rampura Bridge MES" +
                        "MES Aftab Nagar MES" +
                        "Shewra Kuril Bishwa Road Shewra Bashundhara Shewra Nadda Shewra" +
                        "Shewra Natun Bazar Shewra Bashtola Shewra Shahjadpur Shewra Uttar Badda Bazar Shewra Badda Shewra" +
                        "Shewra Madhya Badda Shewra Merul Shewra Rampura Bridge Shewra" +
                        "Shewra Aftab Nagar Shewra" +
                        "Kuril Bishwa Road Bashundhara Kuril Bishwa Road Nadda Kuril Bishwa Road" +
                        "Kuril Bishwa Road Natun Bazar Kuril Bishwa Road Bashtola Kuril Bishwa Road Shahjadpur Kuril Bishwa Road Uttar Badda Bazar Kuril Bishwa Road Badda Kuril Bishwa Road" +
                        "Kuril Bishwa Road Madhya Badda Kuril Bishwa Road Merul Kuril Bishwa Road Rampura Bridge Kuril Bishwa Road" +
                        "Kuril Bishwa Road Aftab Nagar Kuril Bishwa Road" +
                        "Bashundhara Nadda Bashundhara" +
                        "Bashundhara Natun Bazar Bashundhara Bashtola Bashundhara Shahjadpur Bashundhara Uttar Badda Bazar Bashundhara Badda Bashundhara" +
                        "Bashundhara Madhya Badda Bashundhara Merul Bashundhara Rampura Bridge Bashundhara" +
                        "Bashundhara Aftab Nagar Bashundhara" +
                        "Nadda Natun Bazar Nadda Bashtola Nadda Shahjadpur Nadda Uttar Badda Bazar Nadda Badda Nadda" +
                        "Nadda Madhya Badda Nadda Merul Nadda Rampura Bridge Nadda" +
                        "Nadda Aftab Nagar Nadda" +
                        "Natun Bazar Bashtola Natun Bazar Shahjadpur Natun Bazar Uttar Badda Bazar Natun Bazar Badda Natun Bazar" +
                        "Natun Bazar Madhya Badda Natun Bazar Merul Natun Bazar Rampura Bridge Natun Bazar" +
                        "Natun Bazar Aftab Nagar Natun Bazar" +
                        "Bashtola Shahjadpur Bashtola Uttar Badda Bazar Bashtola Badda Bashtola" +
                        "Bashtola Madhya Badda Bashtola Merul Bashtola Rampura Bridge Bashtola" +
                        "Bashtola Aftab Nagar Bashtola" +
                        "Shahjadpur Uttar Badda Bazar Shahjadpur Badda Shahjadpur" +
                        "Shahjadpur Madhya Badda Shahjadpur Merul Shahjadpur Rampura Bridge Shahjadpur" +
                        "Shahjadpur Aftab Nagar Shahjadpur" +
                        "Uttar Badda Bazar Badda Uttar Badda Bazar" +
                        "Uttar Badda Bazar Madhya Badda Uttar Badda Bazar Merul Uttar Badda Bazar Rampura Bridge Uttar Badda Bazar" +
                        "Uttar Badda Bazar Aftab Nagar Uttar Badda Bazar" +
                        "Badda Madhya Badda Badda Merul Badda Rampura Bridge Badda" +
                        "Badda Aftab Nagar Badda" +
                        "Madhya Badda Merul Madhya Badda Rampura Bridge Madhya Badda" +
                        "Madhya Badda Aftab Nagar Madhya Badda" +
                        "Merul Rampura Bridge Merul" +
                        "Merul Aftab Nagar Merul" +
                        "Rampura Bridge Aftab Nagar Rampura Bridge"));


        buses.add(new Bus(R.drawable.logo,"Omama International",
                "Motijheel Gulisthan Motijheel GPO Motijheel Paltan Motijheel Press Club Motijheel High Court Motijheel Shahbag Motijheel" +
                        "Motijheel Bangla Motor Motijheel Kawran Bazar Motijheel Farmgate Motijheel Jahangir Gate Motijheel Mohakhali Motijheel" +
                        "Motijheel Chairman Bari Motijheel Kakoli Motijheel Banani Motijheel Staff Road Motijheel Shewra Motijheel Kuril Bishwa Road Motijheel" +
                        "Motijheel Khilkhet Motijheel Airport Motijheel"+
                        "Gulisthan GPO Gulisthan Paltan Gulisthan Press Club Gulisthan High Court Gulisthan Shahbag Gulisthan" +
                        "Gulisthan Bangla Motor Gulisthan Kawran Bazar Gulisthan Farmgate Gulisthan Jahangir Gate Gulisthan Mohakhali Gulisthan" +
                        "Gulisthan Chairman Bari Gulisthan Kakoli Gulisthan Banani Gulisthan Staff Road Gulisthan Shewra Gulisthan Kuril Bishwa Road Gulisthan" +
                        "Gulisthan Khilkhet Gulisthan Airport Gulisthan" +
                        "GPO Paltan GPO Press Club GPO High Court GPO Shahbag GPO" +
                        "GPO Bangla Motor GPO Kawran Bazar GPO Farmgate GPO Jahangir Gate GPO Mohakhali GPO" +
                        "GPO Chairman Bari GPO Kakoli GPO Banani GPO Staff Road GPO Shewra GPO Kuril Bishwa Road GPO" +
                        "GPO Khilkhet GPO Airport GPO" +
                        "Paltan Press Club Paltan High Court Paltan Shahbag Paltan" +
                        "Paltan Bangla Motor Paltan Kawran Bazar Paltan Farmgate Paltan Jahangir Gate Paltan Mohakhali Paltan" +
                        "Paltan Chairman Bari Paltan Kakoli Paltan Banani Paltan Staff Road Paltan Shewra Paltan Kuril Bishwa Road Paltan" +
                        "Paltan Khilkhet Paltan Airport Paltan" +
                        "Press Club High Court Press Club Shahbag Press Club" +
                        "Press Club Bangla Motor Press Club Kawran Bazar Press Club Farmgate Press Club Jahangir Gate Press Club Mohakhali Press Club" +
                        "Press Club Chairman Bari Press Club Kakoli Press Club Banani Press Club Staff Road Press Club Shewra Press Club Kuril Bishwa Road Press Club" +
                        "Press Club Khilkhet Press Club Airport Press Club" +
                        "High Court Shahbag High Court" +
                        "High Court Bangla Motor High Court Kawran Bazar High Court Farmgate High Court Jahangir Gate High Court Mohakhali High Court" +
                        "High Court Chairman Bari High Court Kakoli High Court Banani High Court Staff Road High Court Shewra High Court Kuril Bishwa Road High Court" +
                        "High Court Khilkhet High Court Airport High Court" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag Farmgate Shahbag Jahangir Gate Shahbag Mohakhali Shahbag" +
                        "Shahbag Chairman Bari Shahbag Kakoli Shahbag Banani Shahbag Staff Road Shahbag Shewra Shahbag Kuril Bishwa Road Shahbag" +
                        "Shahbag Khilkhet Shahbag Airport Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Jahangir Gate Bangla Motor Mohakhali Bangla Motor" +
                        "Bangla Motor Chairman Bari Bangla Motor Kakoli Bangla Motor Banani Bangla Motor Staff Road Bangla Motor Shewra Bangla Motor Kuril Bishwa Road Bangla Motor" +
                        "Bangla Motor Khilkhet Bangla Motor Airport Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Jahangir Gate Kawran Bazar Mohakhali Kawran Bazar" +
                        "Kawran Bazar Chairman Bari Kawran Bazar Kakoli Kawran Bazar Banani Kawran Bazar Staff Road Kawran Bazar Shewra Kawran Bazar Kuril Bishwa Road Kawran Bazar" +
                        "Kawran Bazar Khilkhet Kawran Bazar Airport Kawran Bazar" +
                        "Farmgate Jahangir Gate Farmgate Mohakhali Farmgate" +
                        "Farmgate Chairman Bari Farmgate Kakoli Farmgate Banani Farmgate Staff Road Farmgate Shewra Farmgate Kuril Bishwa Road Farmgate" +
                        "Farmgate Khilkhet Farmgate Airport Farmgate" +
                        "Jahangir Gate Mohakhali Jahangir Gate" +
                        "Jahangir Gate Chairman Bari Jahangir Gate Kakoli Jahangir Gate Banani Jahangir Gate Staff Road Jahangir Gate Shewra Jahangir Gate Kuril Bishwa Road Jahangir Gate" +
                        "Jahangir Gate Khilkhet Jahangir Gate Airport Jahangir Gate" +
                        "Mohakhali Chairman Bari Mohakhali Kakoli Mohakhali Banani Mohakhali Staff Road Mohakhali Shewra Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Mohakhali Khilkhet Mohakhali Airport Mohakhali" +
                        "Chairman Bari Kakoli Chairman Bari Banani Chairman Bari Staff Road Chairman Bari Shewra Chairman Bari Kuril Bishwa Road Chairman Bari" +
                        "Chairman Bari Khilkhet Chairman Bari Airport Chairman Bari" +
                        "Kakoli Banani Kakoli Staff Road Kakoli Shewra Kakoli Kuril Bishwa Road Kakoli" +
                        "Kakoli Khilkhet Kakoli Airport Kakoli" +
                        "Banani Staff Road Banani Shewra Banani Kuril Bishwa Road Banani" +
                        "Banani Khilkhet Banani Airport Banani" +
                        "Staff Road Shewra Staff Road Kuril Bishwa Road Staff Road" +
                        "Staff Road Khilkhet Staff Road Airport Staff Road" +
                        "Shewra Kuril Bishwa Road Shewra" +
                        "Shewra Khilkhet Shewra Airport Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet"));

        buses.add(new Bus(R.drawable.logo,"One Transport",
                "Nandan Park Zirani Bazar Nandan Park Baipayl Nandan Park Nobinagar Nandan Park Savar Nandan Park" +
                        "Nandan Park Hemayetpur Nandan Park Aminbazar Nandan Park Gabtoli Nandan Park Technical Nandan Park Kallayanpur Nandan Park" +
                        "Nandan Park Shyamoli Nandan Park Shishu Mela Nandan Park College Gate Nandan Park Asad Gate Nandan Park" +
                        "Nandan Park Khamarbari Nandan Park Farmgate Nandan Park Kawran Bazar Nandan Park Bangla Motor Nandan Park Shahbag Nandan Park" +
                        "Nandan Park High Court Nandan Park Press Club Nandan Park Paltan Nandan Park GPO Nandan Park Gulisthan Nandan Park" +
                        "Nandan Park Motijheel Nandan Park" +
                        "Zirani Bazar Baipayl Zirani Bazar Nobinagar Zirani Bazar Savar Zirani Bazar" +
                        "Zirani Bazar Hemayetpur Zirani Bazar Aminbazar Zirani Bazar Gabtoli Zirani Bazar Technical Zirani Bazar Kallayanpur Zirani Bazar" +
                        "Zirani Bazar Shyamoli Zirani Bazar Shishu Mela Zirani Bazar College Gate Zirani Bazar Asad Gate Zirani Bazar" +
                        "Zirani Bazar Khamarbari Zirani Bazar Farmgate Zirani Bazar Kawran Bazar Zirani Bazar Bangla Motor Zirani Bazar Shahbag Zirani Bazar" +
                        "Zirani Bazar High Court Zirani Bazar Press Club Zirani Bazar Paltan Zirani Bazar GPO Zirani Bazar Gulisthan Zirani Bazar" +
                        "Zirani Bazar Motijheel Zirani Bazar" +
                        "Baipayl Nobinagar Baipayl Savar Baipayl" +
                        "Baipayl Hemayetpur Baipayl Aminbazar Baipayl Gabtoli Baipayl Technical Baipayl Kallayanpur Baipayl" +
                        "Baipayl Shyamoli Baipayl Shishu Mela Baipayl College Gate Baipayl Asad Gate Baipayl" +
                        "Baipayl Khamarbari Baipayl Farmgate Baipayl Kawran Bazar Baipayl Bangla Motor Baipayl Shahbag Baipayl" +
                        "Baipayl High Court Baipayl Press Club Baipayl Paltan Baipayl GPO Baipayl Gulisthan Baipayl" +
                        "Baipayl Motijheel Baipayl" +
                        "Nobinagar Savar Nobinagar" +
                        "Nobinagar Hemayetpur Nobinagar Aminbazar Nobinagar Gabtoli Nobinagar Technical Nobinagar Kallayanpur Nobinagar" +
                        "Nobinagar Shyamoli Nobinagar Shishu Mela Nobinagar College Gate Nobinagar Asad Gate Nobinagar" +
                        "Nobinagar Khamarbari Nobinagar Farmgate Nobinagar Kawran Bazar Nobinagar Bangla Motor Nobinagar Shahbag Nobinagar" +
                        "Nobinagar High Court Nobinagar Press Club Nobinagar Paltan Nobinagar GPO Nobinagar Gulisthan Nobinagar" +
                        "Nobinagar Motijheel Nobinagar" +
                        "Hemayetpur Aminbazar Hemayetpur Gabtoli Hemayetpur Technical Hemayetpur Kallayanpur Hemayetpur" +
                        "Hemayetpur Shyamoli Hemayetpur Shishu Mela Hemayetpur College Gate Hemayetpur Asad Gate Hemayetpur" +
                        "Hemayetpur Khamarbari Hemayetpur Farmgate Hemayetpur Kawran Bazar Hemayetpur Bangla Motor Hemayetpur Shahbag Hemayetpur" +
                        "Hemayetpur High Court Hemayetpur Press Club Hemayetpur Paltan Hemayetpur GPO Hemayetpur Gulisthan Hemayetpur" +
                        "Hemayetpur Motijheel Hemayetpur" +
                        "Aminbazar Gabtoli Aminbazar Technical Aminbazar Kallayanpur Aminbazar" +
                        "Aminbazar Shyamoli Aminbazar Shishu Mela Aminbazar College Gate Aminbazar Asad Gate Aminbazar" +
                        "Aminbazar Khamarbari Aminbazar Farmgate Aminbazar Kawran Bazar Aminbazar Bangla Motor Aminbazar Shahbag Aminbazar" +
                        "Aminbazar High Court Aminbazar Press Club Aminbazar Paltan Aminbazar GPO Aminbazar Gulisthan Aminbazar" +
                        "Aminbazar Motijheel Aminbazar" +
                        "Shyamoli Shishu Mela Shyamoli College Gate Shyamoli Asad Gate Shyamoli" +
                        "Shyamoli Khamarbari Shyamoli Farmgate Shyamoli Kawran Bazar Shyamoli Bangla Motor Shyamoli Shahbag Shyamoli" +
                        "Shyamoli High Court Shyamoli Press Club Shyamoli Paltan Shyamoli GPO Shyamoli Gulisthan Shyamoli" +
                        "Shyamoli Motijheel Shyamoli" +
                        "Shishu Mela College Gate Shishu Mela Asad Gate Shishu Mela" +
                        "Shishu Mela Khamarbari Shishu Mela Farmgate Shishu Mela Kawran Bazar Shishu Mela Bangla Motor Shishu Mela Shahbag Shishu Mela" +
                        "Shishu Mela High Court Shishu Mela Press Club Shishu Mela Paltan Shishu Mela GPO Shishu Mela Gulisthan Shishu Mela" +
                        "Shishu Mela Motijheel Shishu Mela" +
                        "College Gate Asad Gate College Gate" +
                        "College Gate Khamarbari College Gate Farmgate College Gate Kawran Bazar College Gate Bangla Motor College Gate Shahbag College Gate" +
                        "College Gate High Court College Gate Press Club College Gate Paltan College Gate GPO College Gate Gulisthan College Gate" +
                        "College Gate Motijheel College Gate" +
                        "Asad Gate Khamarbari Asad Gate Farmgate Asad Gate Kawran Bazar Asad Gate Bangla Motor Asad Gate Shahbag Asad Gate" +
                        "Asad Gate High Court Asad Gate Press Club Asad Gate Paltan Asad Gate GPO Asad Gate Gulisthan Asad Gate" +
                        "Asad Gate Motijheel Asad Gate" +
                        "Khamarbari Farmgate Khamarbari Kawran Bazar Khamarbari Bangla Motor Khamarbari Shahbag Khamarbari" +
                        "Khamarbari High Court Khamarbari Press Club Khamarbari Paltan Khamarbari GPO Khamarbari Gulisthan Khamarbari" +
                        "Khamarbari Motijheel Khamarbari" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate Shahbag Farmgate" +
                        "Farmgate High Court Farmgate Press Club Farmgate Paltan Farmgate GPO Farmgate Gulisthan Farmgate" +
                        "Farmgate Motijheel Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar Shahbag Kawran Bazar" +
                        "Kawran Bazar High Court Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar GPO Kawran Bazar Gulisthan Kawran Bazar" +
                        "Kawran Bazar Motijheel Kawran Bazar Kamalapur" +
                        "Bangla Motor Shahbag Bangla Motor" +
                        "Bangla Motor High Court Bangla Motor Press Club Bangla Motor Paltan Bangla Motor GPO Bangla Motor Gulisthan Bangla Motor" +
                        "Bangla Motor Motijheel Bangla Motor" +
                        "Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag GPO Shahbag Gulisthan Shahbag" +
                        "Shahbag Motijheel Shahbag" +
                        "High Court Press Club High Court Paltan High Court GPO High Court Gulisthan High Court" +
                        "High Court Motijheel High Court" +
                        "Press Club Paltan Press Club GPO Press Club Gulisthan Press Club" +
                        "Press Club Motijheel Press Club" +
                        "Paltan GPO Paltan Gulisthan Paltan" +
                        "Paltan Motijheel Paltan" +
                        "GPO Gulisthan GPO" +
                        "GPO Motijheel GPO" +
                        "Gulisthan Motijheel Gulistan"));

        buses.add(new Bus(R.drawable.logo,"Pallabi Super Service",
                "Gabtoli Technical Gabtoli Ansar Camp Gabtoli Mirpur 1 Gabtoli Mirpur 10 Gabtoli Mirpur 11 Gabtoli Purobi Gabtoli Kalshi Gabtoli" +
                        "Gabtoli ECB Square Gabtoli MES Gabtoli Shewra Gabtoli Kuril Bishwa Road Gabtoli Khilkhet Gabtoli Airport Gabtoli Jasimuddin Gabtoli" +
                        "Gabtoli Azampur Gabtoli House Building Gabtoli" +
                        "Gabtoli Abdullahpur Gabtoli Kamarpara Gabtoli" +
                        "Technical Ansar Camp Technical Mirpur 1 Technical Mirpur 10 Technical Mirpur 11 Technical Purobi Technical Kalshi Technical" +
                        "Technical ECB Square Technical MES Technical Shewra Technical Kuril Bishwa Road Technical Khilkhet Technical Airport Technical Jasimuddin Technical" +
                        "Technical Azampur Technical House Building Technical" +
                        "Technical Abdullahpur Technical Kamarpara Technical" +
                        "Ansar Camp Mirpur 1 Ansar Camp Mirpur 10 Ansar Camp Mirpur 11 Ansar Camp Purobi Ansar Camp Kalshi Ansar Camp" +
                        "Ansar Camp ECB Square Ansar Camp MES Ansar Camp Shewra Ansar Camp Kuril Bishwa Road Ansar Camp Khilkhet Ansar Camp Airport Ansar Camp Jasimuddin Ansar Camp" +
                        "Ansar Camp Azampur Ansar Camp House Building Ansar Camp" +
                        "Ansar Camp Abdullahpur Ansar Camp Kamarpara Ansar Camp" +
                        "Mirpur 1 Mirpur 10 Mirpur 1 Mirpur 11 Mirpur 1 Purobi Mirpur 1 Kalshi Mirpur 1" +
                        "Mirpur 1 ECB Square Mirpur 1 MES Mirpur 1 Shewra Mirpur 1 Kuril Bishwa Road Mirpur 1 Khilkhet Mirpur 1 Airport Mirpur 1 Jasimuddin Mirpur 1" +
                        "Mirpur 1 Azampur Mirpur 1 House Building Mirpur 1" +
                        "Mirpur 1 Abdullahpur Mirpur 1 Kamarpara Mirpur 1" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10" +
                        "Mirpur 10 ECB Square Mirpur 10 MES Mirpur 10 Shewra Mirpur 10 Kuril Bishwa Road Mirpur 10 Khilkhet Mirpur 10 Airport Mirpur 10 Jasimuddin Mirpur 10" +
                        "Mirpur 10 Azampur Mirpur 10 House Building Mirpur 10" +
                        "Mirpur 10 Abdullahpur Mirpur 10 Kamarpara Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Kalshi Mirpur 11" +
                        "Mirpur 11 ECB Square Mirpur 11 MES Mirpur 11 Shewra Mirpur 11 Kuril Bishwa Road Mirpur 11 Khilkhet Mirpur 11 Airport Mirpur 11 Jasimuddin Mirpur 11" +
                        "Mirpur 11 Azampur Mirpur 11 House Building Mirpur 11" +
                        "Mirpur 11 Abdullahpur Mirpur 11 Kamarpara Mirpur 11" +
                        "Purobi Kalshi Purobi" +
                        "Purobi ECB Square Purobi MES Purobi Shewra Purobi Kuril Bishwa Road Purobi Khilkhet Purobi Airport Purobi Jasimuddin Purobi" +
                        "Purobi Azampur Purobi House Building Purobi" +
                        "Purobi Abdullahpur Purobi Kamarpara Purobi" +
                        "Kalshi ECB Square Kalshi MES Kalshi Shewra Kalshi Kuril Bishwa Road Kalshi Khilkhet Kalshi Airport Kalshi Jasimuddin Kalshi" +
                        "Kalshi Azampur Kalshi House Building Kalshi" +
                        "Kalshi Abdullahpur Kalshi Kamarpara Kalshi" +
                        "ECB Square MES ECB Square Shewra ECB Square Kuril Bishwa Road ECB Square Khilkhet ECB Square Airport ECB Square Jasimuddin ECB Square" +
                        "ECB Square Azampur ECB Square House Building ECB Square" +
                        "ECB Square Abdullahpur ECB Square Kamarpara ECB Square" +
                        "MES Shewra MES Kuril Bishwa Road MES Khilkhet MES Airport MES Jasimuddin MES" +
                        "MES Azampur MES House Building MES" +
                        "MES Abdullahpur MES Kamarpara MES" +
                        "Shewra Kuril Bishwa Road Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra" +
                        "Shewra Azampur Shewra House Building Shewra" +
                        "Shewra Abdullahpur Shewra Kamarpara Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road" +
                        "Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road Kamarpara Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet" +
                        "Khilkhet Azampur Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet Kamarpara Khilkhet" +
                        "Airport Jasimuddin Airport" +
                        "Airport Azampur Airport House Building Airport" +
                        "Airport Abdullahpur Airport Kamarpara Airport" +
                        "Jasimuddin Azampur Jasimuddin House Building Jasimuddin" +
                        "Jasimuddin Abdullahpur Jasimuddin Kamarpara Jasimuddin" +
                        "Azampur House Building Azampur" +
                        "Azampur Abdullahpur Azampur Kamarpara Azampur" +
                        "House Building Abdullahpur House Building Kamarpara House Building" +
                        "Abdullahpur Kamarpara Abdullahpur"));

        buses.add(new Bus(R.drawable.logo,"Paristhan Paribahan",
                "Bosila Mohammadpur Bosila Asad Gate Bosila College Gate Bosila Shyamoli Bosila Kallayanpur Bosila Darussalam Bosila" +
                        "Bosila Technical Bosila Ansar Camp Bosila Mirpur 1 Bosila Mirpur 10 Bosila Mirpur 11 Bosila Purobi Bosila Kalshi Bosila" +
                        "Bosila ECB Square Bosila MES Bosila Shewra Bosila Kuril Bishwa Road Bosila Khilkhet Bosila Airport Bosila Jasimuddin Bosila" +
                        "Bosila Azampur Bosila House Building Bosila" +
                        "Bosila Abdullahpur Bosila" +
                        "Mohammadpur Asad Gate Mohammadpur College Gate Mohammadpur Shyamoli Mohammadpur Kallayanpur Mohammadpur Darussalam Mohammadpur" +
                        "Mohammadpur Technical Mohammadpur Ansar Camp Mohammadpur Mirpur 1 Mohammadpur Mirpur 10 Mohammadpur Mirpur 11 Mohammadpur Purobi Mohammadpur Kalshi Mohammadpur" +
                        "Mohammadpur ECB Square Mohammadpur MES Mohammadpur Shewra Mohammadpur Kuril Bishwa Road Mohammadpur Khilkhet Mohammadpur Airport Mohammadpur Jasimuddin Mohammadpur" +
                        "Mohammadpur Azampur Mohammadpur House Building Mohammadpur" +
                        "Mohammadpur Abdullahpur Mohammadpur" +
                        "Asad Gate College Gate Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Darussalam Asad Gate" +
                        "Asad Gate Technical Asad Gate Ansar Camp Asad Gate Mirpur 1 Asad Gate Mirpur 10 Asad Gate Mirpur 11 Asad Gate Purobi Asad Gate Kalshi Asad Gate" +
                        "Asad Gate ECB Square Asad Gate MES Asad Gate Shewra Asad Gate Kuril Bishwa Road Asad Gate Khilkhet Asad Gate Airport Asad Gate Jasimuddin Asad Gate" +
                        "Asad Gate Azampur Asad Gate House Building Asad Gate" +
                        "Asad Gate Abdullahpur Asad Gate" +
                        "College Gate Shyamoli College Gate Kallayanpur College Gate Darussalam College Gate" +
                        "College Gate Technical College Gate Ansar Camp College Gate Mirpur 1 College Gate Mirpur 10 College Gate Mirpur 11 College Gate Purobi College Gate Kalshi College Gate" +
                        "College Gate ECB Square College Gate MES College Gate Shewra College Gate Kuril Bishwa Road College Gate Khilkhet College Gate Airport College Gate Jasimuddin College Gate" +
                        "College Gate Azampur College Gate House Building College Gate" +
                        "College Gate Abdullahpur College Gate" +
                        "Shyamoli Kallayanpur Shyamoli Darussalam Shyamoli" +
                        "Shyamoli Technical Shyamoli Ansar Camp Shyamoli Mirpur 1 Shyamoli Mirpur 10 Shyamoli Mirpur 11 Shyamoli Purobi Shyamoli Kalshi Shyamoli" +
                        "Shyamoli ECB Square Shyamoli MES Shyamoli Shewra Shyamoli Kuril Bishwa Road Shyamoli Khilkhet Shyamoli Airport Shyamoli Jasimuddin Shyamoli" +
                        "Shyamoli Azampur Shyamoli House Building Shyamoli" +
                        "Shyamoli Abdullahpur Shyamoli" +
                        "Kallayanpur Darussalam Kallayanpur" +
                        "Kallayanpur Technical Kallayanpur Ansar Camp Kallayanpur Mirpur 1 Kallayanpur Mirpur 10 Kallayanpur Mirpur 11 Kallayanpur Purobi Kallayanpur Kalshi Kallayanpur" +
                        "Kallayanpur ECB Square Kallayanpur MES Kallayanpur Shewra Kallayanpur Kuril Bishwa Road Kallayanpur Khilkhet Kallayanpur Airport Kallayanpur Jasimuddin Kallayanpur" +
                        "Kallayanpur Azampur Kallayanpur House Building Kallayanpur" +
                        "Kallayanpur Abdullahpur Kallayanpur" +
                        "Darussalam Technical Darussalam Ansar Camp Darussalam Mirpur 1 Darussalam Mirpur 10 Darussalam Mirpur 11 Darussalam Purobi Darussalam Kalshi Darussalam" +
                        "Darussalam ECB Square Darussalam MES Darussalam Shewra Darussalam Kuril Bishwa Road Darussalam Khilkhet Darussalam Airport Darussalam Jasimuddin Darussalam" +
                        "Darussalam Azampur Darussalam House Building Darussalam" +
                        "Darussalam Abdullahpur Darussalam" +
                        "Technical Ansar Camp Technical Mirpur 1 Technical Mirpur 10 Technical Mirpur 11 Technical Purobi Technical Kalshi Technical" +
                        "Technical ECB Square Technical MES Technical Shewra Technical Kuril Bishwa Road Technical Khilkhet Technical Airport Technical Jasimuddin Technical" +
                        "Technical Azampur Technical House Building Technical" +
                        "Technical Abdullahpur Technical" +
                        "Ansar Camp Mirpur 1 Ansar Camp Mirpur 10 Ansar Camp Mirpur 11 Ansar Camp Purobi Ansar Camp Kalshi Ansar Camp" +
                        "Ansar Camp ECB Square Ansar Camp MES Ansar Camp Shewra Ansar Camp Kuril Bishwa Road Ansar Camp Khilkhet Ansar Camp Airport Ansar Camp Jasimuddin Ansar Camp" +
                        "Ansar Camp Azampur Ansar Camp House Building Ansar Camp" +
                        "Ansar Camp Abdullahpur Ansar Camp" +
                        "Mirpur 1 Mirpur 10 Mirpur 1 Mirpur 11 Mirpur 1 Purobi Mirpur 1 Kalshi Mirpur 1" +
                        "Mirpur 1 ECB Square Mirpur 1 MES Mirpur 1 Shewra Mirpur 1 Kuril Bishwa Road Mirpur 1 Khilkhet Mirpur 1 Airport Mirpur 1 Jasimuddin Mirpur 1" +
                        "Mirpur 1 Azampur Mirpur 1 House Building Mirpur 1" +
                        "Mirpur 1 Abdullahpur Mirpur 1" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10" +
                        "Mirpur 10 ECB Square Mirpur 10 MES Mirpur 10 Shewra Mirpur 10 Kuril Bishwa Road Mirpur 10 Khilkhet Mirpur 10 Airport Mirpur 10 Jasimuddin Mirpur 10" +
                        "Mirpur 10 Azampur Mirpur 10 House Building Mirpur 10" +
                        "Mirpur 10 Abdullahpur Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Kalshi Mirpur 11" +
                        "Mirpur 11 ECB Square Mirpur 11 MES Mirpur 11 Shewra Mirpur 11 Kuril Bishwa Road Mirpur 11 Khilkhet Mirpur 11 Airport Mirpur 11 Jasimuddin Mirpur 11" +
                        "Mirpur 11 Azampur Mirpur 11 House Building Mirpur 11" +
                        "Mirpur 11 Abdullahpur Mirpur 11" +
                        "Purobi Kalshi Purobi" +
                        "Purobi ECB Square Purobi MES Purobi Shewra Purobi Kuril Bishwa Road Purobi Khilkhet Purobi Airport Purobi Jasimuddin Purobi" +
                        "Purobi Azampur Purobi House Building Purobi" +
                        "Purobi Abdullahpur Purobi" +
                        "Kalshi ECB Square Kalshi MES Kalshi Shewra Kalshi Kuril Bishwa Road Kalshi Khilkhet Kalshi Airport Kalshi Jasimuddin Kalshi" +
                        "Kalshi Azampur Kalshi House Building Kalshi" +
                        "Kalshi Abdullahpur Kalshi" +
                        "ECB Square MES ECB Square Shewra ECB Square Kuril Bishwa Road ECB Square Khilkhet ECB Square Airport ECB Square Jasimuddin ECB Square" +
                        "ECB Square Azampur ECB Square House Building ECB Square" +
                        "ECB Square Abdullahpur ECB Square" +
                        "MES Shewra MES Kuril Bishwa Road MES Khilkhet MES Airport MES Jasimuddin MES" +
                        "MES Azampur MES House Building MES" +
                        "MES Abdullahpur MES" +
                        "Shewra Kuril Bishwa Road Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra" +
                        "Shewra Azampur Shewra House Building Shewra" +
                        "Shewra Abdullahpur Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road" +
                        "Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet" +
                        "Khilkhet Azampur Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet" +
                        "Airport Jasimuddin Airport" +
                        "Airport Azampur Airport House Building Airport" +
                        "Airport Abdullahpur Airport" +
                        "Jasimuddin Azampur Jasimuddin House Building Jasimuddin" +
                        "Jasimuddin Abdullahpur Jasimuddin" +
                        "Azampur House Building Azampur" +
                        "Azampur Abdullahpur Azampur" +
                        "House Building Abdullahpur House Building"));


        buses.add(new Bus(R.drawable.logo,"Prattay",
                "Gabtoli Beribadh Gabtoli Rayer Bazar Gabtoli Sikder Medical Gabtoli Hazaribag Gabtoli Nawabganj Gabtoli Kamrangirchar Gabtoli" +
                        "Gabtoli Showari Ghat Gabtoli Mitford Ghat Gabtoli" +
                        "Gabtoli Babu Bazar Gabtoli" +
                        "Beribadh Rayer Bazar Beribadh Sikder Medical Beribadh Hazaribag Beribadh Nawabganj Beribadh Kamrangirchar Beribadh" +
                        "Beribadh Showari Ghat Beribadh Mitford Ghat Beribadh" +
                        "Beribadh Babu Bazar Beribadh" +
                        "Rayer Bazar Sikder Medical Rayer Bazar Hazaribag Rayer Bazar Nawabganj Rayer Bazar Kamrangirchar Rayer Bazar" +
                        "Rayer Bazar Showari Ghat Rayer Bazar Mitford Ghat Rayer Bazar" +
                        "Rayer Bazar Babu Bazar Rayer Bazar" +
                        "Sikder Medical Hazaribag Sikder Medical Nawabganj Sikder Medical Kamrangirchar Sikder Medical" +
                        "Sikder Medical Showari Ghat Sikder Medical Mitford Ghat Sikder Medical" +
                        "Sikder Medical Babu Bazar Sikder Medical" +
                        "Hazaribag Nawabganj Hazaribag Kamrangirchar Hazaribag" +
                        "Hazaribag Showari Ghat Hazaribag Mitford Ghat Hazaribag" +
                        "Hazaribag Babu Bazar Hazaribag" +
                        "Nawabganj Kamrangirchar Nawabganj" +
                        "Nawabganj Showari Ghat Nawabganj Mitford Ghat Nawabganj" +
                        "Nawabganj Babu Bazar Nawabganj" +
                        "Kamrangirchar Showari Ghat Kamrangirchar Mitford Ghat Kamrangirchar" +
                        "Kamrangirchar Babu Bazar Kamrangirchar" +
                        "Showari Ghat Mitford Ghat Showari Ghat" +
                        "Showari Ghat Babu Bazar Showari Ghat" +
                        "Mitford Ghat Babu Bazar Mitford Ghat"));


        buses.add(new Bus(R.drawable.logo,"Pravati Banasree Paribahan",
                "Fulbaria Golap Shah Mazar Fulbaria Paltan Fulbaria Kakrail Fulbaria Shantinagar Fulbaria Malibagh Mor Fulbaria Mouchak Fulbaria Moghbazar Fulbaria" +
                        "Fulbaria Nabisco Fulbaria Mohakhali Fulbaria Banani Fulbaria Kakoli Fulbaria MES Fulbaria Shewra Fulbaria Kuril Bishwa Road Fulbaria" +
                        "Fulbaria Khilkhet Fulbaria Airport Fulbaria Jasimuddin Fulbaria Rajlakshmi Fulbaria Azampur Fulbaria House Building Fulbaria Abdullahpur Fulbaria" +
                        "Fulbaria Tongi Fulbaria Station Road Fulbaria Board Bazar Fulbaria Gazipur Fulbaria Joydevpur Fulbaria Sreepur Fulbaria" +
                        "Fulbaria Barmi Fulbaria" +
                        "Golap Shah Mazar Paltan Gulisthan Kakrail Golap Shah Mazar Shantinagar Golap Shah Mazar Malibagh Mor Golap Shah Mazar Mouchak Golap Shah Mazar Moghbazar Golap Shah Mazar" +
                        "Golap Shah Mazar Nabisco Golap Shah Mazar Mohakhali Golap Shah Mazar Banani Golap Shah Mazar Kakoli Golap Shah Mazar MES Golap Shah Mazar Shewra Golap Shah Mazar Kuril Bishwa Road Golap Shah Mazar" +
                        "Golap Shah Mazar Khilkhet Golap Shah Mazar Airport Golap Shah Mazar Jasimuddin Golap Shah Mazar Rajlakshmi Golap Shah Mazar Azampur Golap Shah Mazar House Building Golap Shah Mazar Abdullahpur Golap Shah Mazar" +
                        "Golap Shah Mazar Tongi Golap Shah Mazar Station Road Golap Shah Mazar Board Bazar Golap Shah Mazar Gazipur Golap Shah Mazar Joydevpur Golap Shah Mazar Sreepur Golap Shah Mazar" +
                        "Golap Shah Mazar Barmi Golap Shah Mazar" +
                        "GPO Paltan GPO Kakrail GPO Shantinagar GPO Malibagh Mor GPO Mouchak GPO Moghbazar GPO" +
                        "GPO Nabisco GPO Mohakhali GPO Banani GPO Kakoli GPO MES GPO Shewra GPO Kuril Bishwa Road GPO" +
                        "GPO Khilkhet GPO Airport GPO Jasimuddin GPO Rajlakshmi GPO Azampur GPO House Building GPO Abdullahpur GPO" +
                        "GPO Tongi GPO Station Road GPO Board Bazar GPO Gazipur GPO Joydevpur GPO Sreepur GPO" +
                        "GPO Barmi GPO" +
                        "Paltan Kakrail Paltan Shantinagar Paltan Malibagh Mor Paltan Mouchak Paltan Moghbazar Paltan" +
                        "Paltan Nabisco Paltan Mohakhali Paltan Banani Paltan Kakoli Paltan MES Paltan Shewra Paltan Kuril Bishwa Road Paltan" +
                        "Paltan Khilkhet Paltan Airport Paltan Jasimuddin Paltan Rajlakshmi Paltan Azampur Paltan House Building Paltan Abdullahpur Paltan" +
                        "Paltan Tongi Paltan Station Road Paltan Board Bazar Paltan Gazipur Paltan Joydevpur Paltan Sreepur Paltan" +
                        "Paltan Barmi Paltan" +
                        "Kakrail Shantinagar Kakrail Malibagh Mor Kakrail Mouchak Kakrail Moghbazar Kakrail" +
                        "Kakrail Nabisco Kakrail Mohakhali Kakrail Banani Kakrail Kakoli Kakrail MES Kakrail Shewra Kakrail Kuril Bishwa Road Kakrail" +
                        "Kakrail Khilkhet Kakrail Airport Kakrail Jasimuddin Kakrail Rajlakshmi Kakrail Azampur Kakrail House Building Kakrail Abdullahpur Kakrail" +
                        "Kakrail Tongi Kakrail Station Road Kakrail Board Bazar Kakrail Gazipur Kakrail Joydevpur Kakrail Sreepur Kakrail" +
                        "Kakrail Barmi Kakrail" +
                        "Shantinagar Malibagh Mor Shantinagar Mouchak Shantinagar Moghbazar Shantinagar" +
                        "Shantinagar Nabisco Shantinagar Mohakhali Shantinagar Banani Shantinagar Kakoli Shantinagar MES Shantinagar Shewra Shantinagar Kuril Bishwa Road Shantinagar" +
                        "Shantinagar Khilkhet Shantinagar Airport Shantinagar Jasimuddin Shantinagar Rajlakshmi Shantinagar Azampur Shantinagar House Building Shantinagar Abdullahpur Shantinagar" +
                        "Shantinagar Tongi Shantinagar Station Road Shantinagar Board Bazar Shantinagar Gazipur Shantinagar Joydevpur Shantinagar Sreepur Shantinagar" +
                        "Shantinagar Barmi Shantinagar" +
                        "Malibagh Mor Mouchak Malibagh Mor Moghbazar Malibagh Mor" +
                        "Malibagh Mor Nabisco Malibagh Mor Mohakhali Malibagh Mor Banani Malibagh Mor Kakoli Malibagh Mor MES Malibagh Mor Shewra Malibagh Mor Kuril Bishwa Road Malibagh Mor" +
                        "Malibagh Mor Khilkhet Malibagh Mor Airport Malibagh Mor Jasimuddin Malibagh Mor Rajlakshmi Malibagh Mor Azampur Malibagh Mor House Building Malibagh Mor Abdullahpur Malibagh Mor" +
                        "Malibagh Mor Tongi Malibagh Mor Station Road Malibagh Mor Board Bazar Malibagh Mor Gazipur Malibagh Mor Joydevpur Malibagh Mor Sreepur Malibagh Mor" +
                        "Malibagh Mor Barmi Malibagh Mor" +
                        "Mouchak Moghbazar Mouchak" +
                        "Mouchak Nabisco Mouchak Mohakhali Mouchak Banani Mouchak Kakoli Mouchak MES Mouchak Shewra Mouchak Kuril Bishwa Road Mouchak" +
                        "Mouchak Khilkhet Mouchak Airport Mouchak Jasimuddin Mouchak Rajlakshmi Mouchak Azampur Mouchak House Building Mouchak Abdullahpur Mouchak" +
                        "Mouchak Tongi Mouchak Station Road Mouchak Board Bazar Mouchak Gazipur Mouchak Joydevpur Mouchak Sreepur Mouchak" +
                        "Mouchak Barmi Mouchak" +
                        "Moghbazar Nabisco Moghbazar Mohakhali Moghbazar Banani Moghbazar Kakoli Moghbazar MES Moghbazar Shewra Moghbazar Kuril Bishwa Road Moghbazar" +
                        "Moghbazar Khilkhet Moghbazar Airport Moghbazar Jasimuddin Moghbazar Rajlakshmi Moghbazar Azampur Moghbazar House Building Moghbazar Abdullahpur Moghbazar" +
                        "Moghbazar Tongi Moghbazar Station Road Moghbazar Board Bazar Moghbazar Gazipur Moghbazar Joydevpur Moghbazar Sreepur Moghbazar" +
                        "Moghbazar Barmi Moghbazar" +
                        "Nabisco Mohakhali Nabisco Banani Nabisco Kakoli Nabisco MES Nabisco Shewra Nabisco Kuril Bishwa Road Nabisco" +
                        "Nabisco Khilkhet Nabisco Airport Nabisco Jasimuddin Nabisco Rajlakshmi Nabisco Azampur Nabisco House Building Nabisco Abdullahpur Nabisco" +
                        "Nabisco Tongi Nabisco Station Road Nabisco Board Bazar Nabisco Gazipur Nabisco Joydevpur Nabisco Sreepur Nabisco" +
                        "Nabisco Barmi Nabisco" +
                        "Mohakhali Banani Mohakhali Kakoli Mohakhali MES Mohakhali Shewra Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Mohakhali Khilkhet Mohakhali Airport Mohakhali Jasimuddin Mohakhali Rajlakshmi Mohakhali Azampur Mohakhali House Building Mohakhali Abdullahpur Mohakhali" +
                        "Mohakhali Tongi Mohakhali Station Road Mohakhali Board Bazar Mohakhali Gazipur Mohakhali Joydevpur Mohakhali Sreepur Mohakhali" +
                        "Mohakhali Barmi Mohakhali" +
                        "Banani Kakoli Banani MES Banani Shewra Banani Kuril Bishwa Road Banani" +
                        "Banani Khilkhet Banani Airport Banani Jasimuddin Banani Rajlakshmi Banani Azampur Banani House Building Banani Abdullahpur Banani" +
                        "Banani Tongi Banani Station Road Banani Board Bazar Banani Gazipur Banani Joydevpur Banani Sreepur Banani" +
                        "Banani Barmi Banani" +
                        "Kakoli MES Kakoli Shewra Kakoli Kuril Bishwa Road Kakoli" +
                        "Kakoli Khilkhet Kakoli Airport Kakoli Jasimuddin Kakoli Rajlakshmi Kakoli Azampur Kakoli House Building Kakoli Abdullahpur Kakoli" +
                        "Kakoli Tongi Kakoli Station Road Kakoli Board Bazar Kakoli Gazipur Kakoli Joydevpur Kakoli Sreepur Kakoli" +
                        "Kakoli Barmi Kakoli" +
                        "MES Shewra MES Kuril Bishwa Road MES" +
                        "MES Khilkhet MES Airport MES Jasimuddin MES Rajlakshmi MES Azampur MES House Building MES Abdullahpur MES" +
                        "MES Tongi MES Station Road MES Board Bazar MES Gazipur MES Joydevpur MES Sreepur MES" +
                        "MES Barmi MES" +
                        "Shewra Kuril Bishwa Road Shewra" +
                        "Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra Rajlakshmi Shewra Azampur Shewra House Building Shewra Abdullahpur Shewra" +
                        "Shewra Tongi Shewra Station Road Shewra Board Bazar Shewra Gazipur Shewra Joydevpur Shewra Sreepur Shewra" +
                        "Shewra Barmi Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Kuril Bishwa Road Tongi Kuril Bishwa Road Station Road Kuril Bishwa Road Board Bazar Kuril Bishwa Road Gazipur Kuril Bishwa Road Joydevpur Kuril Bishwa Road Sreepur Kuril Bishwa Road" +
                        "Kuril Bishwa Road Barmi Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet Rajlakshmi Khilkhet Azampur Khilkhet House Building Khilkhet Abdullahpur Khilkhet" +
                        "Khilkhet Tongi Khilkhet Station Road Khilkhet Board Bazar Khilkhet Gazipur Khilkhet Joydevpur Khilkhet Sreepur Khilkhet" +
                        "Khilkhet Barmi Khilkhet" +
                        "Airport Jasimuddin Airport Rajlakshmi Airport Azampur Airport House Building Airport Abdullahpur Airport" +
                        "Airport Tongi Airport Station Road Airport Board Bazar Airport Gazipur Airport Joydevpur Airport Sreepur Airport" +
                        "Airport Barmi Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin Azampur Jasimuddin House Building Jasimuddin Abdullahpur Jasimuddin" +
                        "Jasimuddin Tongi Jasimuddin Station Road Jasimuddin Board Bazar Jasimuddin Gazipur Jasimuddin Joydevpur Jasimuddin Sreepur Jasimuddin" +
                        "Jasimuddin Barmi Jasimuddin" +
                        "Rajlakshmi Azampur Rajlakshmi House Building Rajlakshmi Abdullahpur Rajlakshmi" +
                        "Rajlakshmi Tongi Rajlakshmi Station Road Rajlakshmi Board Bazar Rajlakshmi Gazipur Rajlakshmi Joydevpur Rajlakshmi Sreepur Rajlakshmi" +
                        "Rajlakshmi Barmi Rajlakshmi" +
                        "Azampur House Building Azampur Abdullahpur Azampur" +
                        "Azampur Tongi Azampur Station Road Azampur Board Bazar Azampur Gazipur Azampur Joydevpur Azampur Sreepur Azampur" +
                        "Azampur Barmi Azampur" +
                        "House Building Abdullahpur House Building" +
                        "House Building Tongi House Building Station Road House Building Board Bazar House Building Gazipur House Building Joydevpur House Building Sreepur House Building" +
                        "House Building Barmi House Building" +
                        "Abdullahpur Tongi Abdullahpur Station Road Abdullahpur Board Bazar Abdullahpur Gazipur Abdullahpur Joydevpur Abdullahpur Sreepur Abdullahpur" +
                        "Abdullahpur Barmi Abdullahpur" +
                        "Tongi Station Road Tongi Board Bazar Tongi Gazipur Tongi Joydevpur Tongi Sreepur Tongi" +
                        "Tongi Barmi Tongi" +
                        "Station Road Board Bazar Station Road Gazipur Station Road Joydevpur Station Road Sreepur Station Road" +
                        "Station Road Barmi Station Road" +
                        "Board Bazar Gazipur Board Bazar Joydevpur Board Bazar Sreepur Board Bazar" +
                        "Board Bazar Barmi Board Bazar" +
                        ""));


        buses.add(new Bus(R.drawable.logo,"Prochesta",
                "Mawa Keraniganj Mawa Babu Bazar Mawa Naya Bazar Mawa Golap Shah Mazar Mawa GPO Mawa Paltan Mawa" +
                        "Mawa Kakrail Mawa Malibagh Mor Mawa Mouchak Mawa Moghbazar Mawa Satrasta Mawa" +
                        "Mawa Nabisco Mawa Mohakhali Mawa Banani Mawa Kakoli Mawa Kuril Bishwa Road Mawa" +
                        "Mawa Khilkhet Mawa Airport Mawa Jasimuddin Mawa Rajlakshmi Mawa Azampur Mawa House Building Mawa" +
                        "Mawa Abdullahpur Mawa" +
                        "Keraniganj Babu Bazar Keraniganj Naya Bazar Keraniganj Golap Shah Mazar Keraniganj GPO Keraniganj Paltan Keraniganj" +
                        "Keraniganj Kakrail Keraniganj Malibagh Mor Keraniganj Mouchak Keraniganj Moghbazar Keraniganj Satrasta Keraniganj" +
                        "Keraniganj Nabisco Keraniganj Mohakhali Keraniganj Banani Keraniganj Kakoli Keraniganj Kuril Bishwa Road Keraniganj" +
                        "Keraniganj Khilkhet Keraniganj Airport Keraniganj Jasimuddin Keraniganj Rajlakshmi Keraniganj Azampur Keraniganj House Building Keraniganj" +
                        "Keraniganj Abdullahpur Keraniganj" +
                        "Babu Bazar Naya Bazar Babu Bazar Golap Shah Mazar Babu Bazar GPO Babu Bazar Paltan Babu Bazar" +
                        "Babu Bazar Kakrail Babu Bazar Malibagh Mor Babu Bazar Mouchak Babu Bazar Moghbazar Babu Bazar Satrasta Babu Bazar" +
                        "Babu Bazar Nabisco Babu Bazar Mohakhali Babu Bazar Banani Babu Bazar Kakoli Babu Bazar Kuril Bishwa Road Babu Bazar" +
                        "Babu Bazar Khilkhet Babu Bazar Airport Babu Bazar Jasimuddin Babu Bazar Rajlakshmi Babu Bazar Azampur Babu Bazar House Building Babu Bazar" +
                        "Babu Bazar Abdullahpur Babu Bazar" +
                        "Naya Bazar Golap Shah Mazar Naya Bazar GPO Naya Bazar Paltan Naya Bazar" +
                        "Naya Bazar Kakrail Naya Bazar Malibagh Mor Naya Bazar Mouchak Naya Bazar Moghbazar Naya Bazar Satrasta Naya Bazar" +
                        "Naya Bazar Nabisco Naya Bazar Mohakhali Naya Bazar Banani Naya Bazar Kakoli Naya Bazar Kuril Bishwa Road Naya Bazar" +
                        "Naya Bazar Khilkhet Naya Bazar Airport Naya Bazar Jasimuddin Naya Bazar Rajlakshmi Naya Bazar Azampur Naya Bazar House Building Naya Bazar" +
                        "Naya Bazar Abdullahpur Naya Bazar" +
                        "Golap Shah Mazar GPO Golap Shah Mazar Paltan Golap Shah Mazar" +
                        "Golap Shah Mazar Kakrail Golap Shah Mazar Malibagh Mor Golap Shah Mazar Mouchak Golap Shah Mazar Moghbazar Golap Shah Mazar Satrasta Golap Shah Mazar" +
                        "Golap Shah Mazar Nabisco Golap Shah Mazar Mohakhali Golap Shah Mazar Banani Golap Shah Mazar Kakoli Golap Shah Mazar Kuril Bishwa Road Golap Shah Mazar" +
                        "Golap Shah Mazar Khilkhet Golap Shah Mazar Airport Golap Shah Mazar Jasimuddin Golap Shah Mazar Rajlakshmi Golap Shah Mazar Azampur Golap Shah Mazar House Building Golap Shah Mazar" +
                        "Golap Shah Mazar Abdullahpur Golap Shah Mazar" +
                        "GPO Paltan GPO" +
                        "GPO Kakrail GPO Malibagh Mor GPO Mouchak GPO Moghbazar GPO Satrasta GPO" +
                        "GPO Nabisco GPO Mohakhali GPO Banani GPO Kakoli GPO Kuril Bishwa Road GPO" +
                        "GPO Khilkhet GPO Airport GPO Jasimuddin GPO Rajlakshmi GPO Azampur GPO House Building GPO" +
                        "GPO Abdullahpur GPO" +
                        "Paltan Kakrail Paltan Malibagh Mor Paltan Mouchak Paltan Moghbazar Paltan Satrasta Paltan" +
                        "Paltan Nabisco Paltan Mohakhali Paltan Banani Paltan Kakoli Paltan Kuril Bishwa Road Paltan" +
                        "Paltan Khilkhet Paltan Airport Paltan Jasimuddin Paltan Rajlakshmi Paltan Azampur Paltan House Building Paltan" +
                        "Paltan Abdullahpur Paltan" +
                        "Kakrail Malibagh Mor Kakrail Mouchak Kakrail Moghbazar Kakrail Satrasta Kakrail" +
                        "Kakrail Nabisco Kakrail Mohakhali Kakrail Banani Kakrail Kakoli Kakrail Kuril Bishwa Road Kakrail" +
                        "Kakrail Khilkhet Kakrail Airport Kakrail Jasimuddin Kakrail Rajlakshmi Kakrail Azampur Kakrail House Building Kakrail" +
                        "Kakrail Abdullahpur Kakrail" +
                        "Malibagh Mor Mouchak Malibagh Mor Moghbazar Malibagh Mor Satrasta Malibagh Mor" +
                        "Malibagh Mor Nabisco Malibagh Mor Mohakhali Malibagh Mor Banani Malibagh Mor Kakoli Malibagh Mor Kuril Bishwa Road Malibagh Mor" +
                        "Malibagh Mor Khilkhet Malibagh Mor Airport Malibagh Mor Jasimuddin Malibagh Mor Rajlakshmi Malibagh Mor Azampur Malibagh Mor House Building Malibagh Mor" +
                        "Malibagh Mor Abdullahpur Malibagh Mor" +
                        "Mouchak Moghbazar Mouchak Satrasta Mouchak" +
                        "Mouchak Nabisco Mouchak Mohakhali Mouchak Banani Mouchak Kakoli Mouchak Kuril Bishwa Road Mouchak" +
                        "Mouchak Khilkhet Mouchak Airport Mouchak Jasimuddin Mouchak Rajlakshmi Mouchak Azampur Mouchak House Building Mouchak" +
                        "Mouchak Abdullahpur Mouchak" +
                        "Moghbazar Satrasta Moghbazar" +
                        "Moghbazar Nabisco Moghbazar Mohakhali Moghbazar Banani Moghbazar Kakoli Moghbazar Kuril Bishwa Road Moghbazar" +
                        "Moghbazar Khilkhet Moghbazar Airport Moghbazar Jasimuddin Moghbazar Rajlakshmi Moghbazar Azampur Moghbazar House Building Moghbazar" +
                        "Moghbazar Abdullahpur Moghbazar" +
                        "Satrasta Nabisco Satrasta Mohakhali Satrasta Banani Satrasta Kakoli Satrasta Kuril Bishwa Road Satrasta" +
                        "Satrasta Khilkhet Satrasta Airport Satrasta Jasimuddin Satrasta Rajlakshmi Satrasta Azampur Satrasta House Building Satrasta" +
                        "Satrasta Abdullahpur Satrasta" +
                        "Nabisco Mohakhali Nabisco Banani Nabisco Kakoli Nabisco Kuril Bishwa Road Nabisco" +
                        "Nabisco Khilkhet Nabisco Airport Nabisco Jasimuddin Nabisco Rajlakshmi Nabisco Azampur Nabisco House Building Nabisco" +
                        "Nabisco Abdullahpur Nabisco" +
                        "Mohakhali Banani Mohakhali Kakoli Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Mohakhali Khilkhet Mohakhali Airport Mohakhali Jasimuddin Mohakhali Rajlakshmi Mohakhali Azampur Mohakhali House Building Mohakhali" +
                        "Mohakhali Abdullahpur Mohakhali" +
                        "Banani Kakoli Banani Kuril Bishwa Road Banani" +
                        "Banani Khilkhet Banani Airport Banani Jasimuddin Banani Rajlakshmi Banani Azampur Banani House Building Banani" +
                        "Banani Abdullahpur Banani" +
                        "Kakoli Kuril Bishwa Road Kakoli" +
                        "Kakoli Khilkhet Kakoli Airport Kakoli Jasimuddin Kakoli Rajlakshmi Kakoli Azampur Kakoli House Building Kakoli" +
                        "Kakoli Abdullahpur Kakoli" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet Rajlakshmi Khilkhet Azampur Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet" +
                        "Airport Jasimuddin Airport Rajlakshmi Airport Azampur Airport House Building Airport" +
                        "Airport Abdullahpur Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin Azampur Jasimuddin House Building Jasimuddin" +
                        "Jasimuddin Abdullahpur Jasimuddin" +
                        "Rajlakshmi Azampur Rajlakshmi House Building Rajlakshmi" +
                        "Rajlakshmi Abdullahpur Rajlakshmi" +
                        "Azampur House Building Azampur" +
                        "Azampur Abdullahpur Azampur" +
                        "House Building Abdullahpur House Building"));



        buses.add(new Bus(R.drawable.logo,"Projapoti Paribahan",
                "Bosila Mohammadpur Bosila Asad Gate Bosila College Gate Bosila Shyamoli Bosila Kallayanpur Bosila Darussalam Bosila" +
                        "Bosila Technical Bosila Ansar Camp Bosila Mirpur 1 Bosila Mirpur 10 Bosila Mirpur 11 Bosila Purobi Bosila Kalshi Bosila" +
                        "Bosila ECB Square Bosila MES Bosila Shewra Bosila Kuril Bishwa Road Bosila Khilkhet Bosila Airport Bosila Jasimuddin Bosila" +
                        "Bosila Azampur Bosila House Building Bosila" +
                        "Bosila Abdullahpur Bosila Kamarpara Bosila" +
                        "Mohammadpur Asad Gate Mohammadpur College Gate Mohammadpur Shyamoli Mohammadpur Kallayanpur Mohammadpur Darussalam Mohammadpur" +
                        "Mohammadpur Technical Mohammadpur Ansar Camp Mohammadpur Mirpur 1 Mohammadpur Mirpur 10 Mohammadpur Mirpur 11 Mohammadpur Purobi Mohammadpur Kalshi Mohammadpur" +
                        "Mohammadpur ECB Square Mohammadpur MES Mohammadpur Shewra Mohammadpur Kuril Bishwa Road Mohammadpur Khilkhet Mohammadpur Airport Mohammadpur Jasimuddin Mohammadpur" +
                        "Mohammadpur Azampur Mohammadpur House Building Mohammadpur" +
                        "Mohammadpur Abdullahpur Mohammadpur Kamarpara Mohammadpur" +
                        "Asad Gate College Gate Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Darussalam Asad Gate" +
                        "Asad Gate Technical Asad Gate Ansar Camp Asad Gate Mirpur 1 Asad Gate Mirpur 10 Asad Gate Mirpur 11 Asad Gate Purobi Asad Gate Kalshi Asad Gate" +
                        "Asad Gate ECB Square Asad Gate MES Asad Gate Shewra Asad Gate Kuril Bishwa Road Asad Gate Khilkhet Asad Gate Airport Asad Gate Jasimuddin Asad Gate" +
                        "Asad Gate Azampur Asad Gate House Building Asad Gate" +
                        "Asad Gate Abdullahpur Asad Gate Kamarpara Asad Gate" +
                        "College Gate Shyamoli College Gate Kallayanpur College Gate Darussalam College Gate" +
                        "College Gate Technical College Gate Ansar Camp College Gate Mirpur 1 College Gate Mirpur 10 College Gate Mirpur 11 College Gate Purobi College Gate Kalshi College Gate" +
                        "College Gate ECB Square College Gate MES College Gate Shewra College Gate Kuril Bishwa Road College Gate Khilkhet College Gate Airport College Gate Jasimuddin College Gate" +
                        "College Gate Azampur College Gate House Building College Gate" +
                        "College Gate Abdullahpur College Gate Kamarpara College Gate" +
                        "Shyamoli Kallayanpur Shyamoli Darussalam Shyamoli" +
                        "Shyamoli Technical Shyamoli Ansar Camp Shyamoli Mirpur 1 Shyamoli Mirpur 10 Shyamoli Mirpur 11 Shyamoli Purobi Shyamoli Kalshi Shyamoli" +
                        "Shyamoli ECB Square Shyamoli MES Shyamoli Shewra Shyamoli Kuril Bishwa Road Shyamoli Khilkhet Shyamoli Airport Shyamoli Jasimuddin Shyamoli" +
                        "Shyamoli Azampur Shyamoli House Building Shyamoli" +
                        "Shyamoli Abdullahpur Shyamoli Kamarpara Shyamoli" +
                        "Kallayanpur Darussalam Kallayanpur " +
                        "Kallayanpur Technical Kallayanpur Ansar Camp Kallayanpur Mirpur 1 Kallayanpur Mirpur 10 Kallayanpur Mirpur 11 Kallayanpur Purobi Kallayanpur Kalshi Kallayanpur" +
                        "Kallayanpur ECB Square Kallayanpur MES Kallayanpur Shewra Kallayanpur Kuril Bishwa Road Kallayanpur Khilkhet Kallayanpur Airport Kallayanpur Jasimuddin Kallayanpur" +
                        "Kallayanpur Azampur Kallayanpur House Building Kallayanpur" +
                        "Kallayanpur Abdullahpur Kallayanpur Kamarpara Kallayanpur" +
                        "Darussalam Technical Darussalam Ansar Camp Darussalam Mirpur 1 Darussalam Mirpur 10 Darussalam Mirpur 11 Darussalam Purobi Darussalam Kalshi Darussalam" +
                        "Darussalam ECB Square Darussalam MES Darussalam Shewra Darussalam Kuril Bishwa Road Darussalam Khilkhet Darussalam Airport Darussalam Jasimuddin Darussalam" +
                        "Darussalam Azampur Darussalam House Building Darussalam" +
                        "Darussalam Abdullahpur Darussalam Kamarpara Darussalam" +
                        "Technical Ansar Camp Technical Mirpur 1 Technical Mirpur 10 Technical Mirpur 11 Technical Purobi Technical Kalshi Technical" +
                        "Technical ECB Square Technical MES Technical Shewra Technical Kuril Bishwa Road Technical Khilkhet Technical Airport Technical Jasimuddin Technical" +
                        "Technical Azampur Technical House Building Technical" +
                        "Technical Abdullahpur Technical Kamarpara Technical" +
                        "Ansar Camp Mirpur 1 Ansar Camp Mirpur 10 Ansar Camp Mirpur 11 Ansar Camp Purobi Ansar Camp Kalshi Ansar Camp" +
                        "Ansar Camp ECB Square Ansar Camp MES Ansar Camp Shewra Ansar Camp Kuril Bishwa Road Ansar Camp Khilkhet Ansar Camp Airport Ansar Camp Jasimuddin Ansar Camp" +
                        "Ansar Camp Azampur Ansar Camp House Building Ansar Camp" +
                        "Ansar Camp Abdullahpur Ansar Camp Kamarpara Ansar Camp" +
                        "Mirpur 1 Mirpur 10 Mirpur 1 Mirpur 11 Mirpur 1 Purobi Mirpur 1 Kalshi Mirpur 1" +
                        "Mirpur 1 ECB Square Mirpur 1 MES Mirpur 1 Shewra Mirpur 1 Kuril Bishwa Road Mirpur 1 Khilkhet Mirpur 1 Airport Mirpur 1 Jasimuddin Mirpur 1" +
                        "Mirpur 1 Azampur Mirpur 1 House Building Mirpur 1" +
                        "Mirpur 1 Abdullahpur Mirpur 1 Kamarpara Mirpur 1" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10" +
                        "Mirpur 10 ECB Square Mirpur 10 MES Mirpur 10 Shewra Mirpur 10 Kuril Bishwa Road Mirpur 10 Khilkhet Mirpur 10 Airport Mirpur 10 Jasimuddin Mirpur 10" +
                        "Mirpur 10 Azampur Mirpur 10 House Building Mirpur 10" +
                        "Mirpur 10 Abdullahpur Mirpur 10 Kamarpara Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Kalshi Mirpur 11" +
                        "Mirpur 11 ECB Square Mirpur 11 MES Mirpur 11 Shewra Mirpur 11 Kuril Bishwa Road Mirpur 11 Khilkhet Mirpur 11 Airport Mirpur 11 Jasimuddin Mirpur 11" +
                        "Mirpur 11 Azampur Mirpur 11 House Building Mirpur 11" +
                        "Mirpur 11 Abdullahpur Mirpur 11 Kamarpara Mirpur 11" +
                        "Purobi Kalshi Purobi" +
                        "Purobi ECB Square Purobi MES Purobi Shewra Purobi Kuril Bishwa Road Purobi Khilkhet Purobi Airport Purobi Jasimuddin Purobi" +
                        "Purobi Azampur Purobi House Building Purobi" +
                        "Purobi Abdullahpur Purobi Kamarpara Purobi" +
                        "Kalshi ECB Square Kalshi MES Kalshi Shewra Kalshi Kuril Bishwa Road Kalshi Khilkhet Kalshi Airport Kalshi Jasimuddin Kalshi" +
                        "Kalshi Azampur Kalshi House Building Kalshi" +
                        "Kalshi Abdullahpur Kalshi Kamarpara Kalshi" +
                        "ECB Square MES ECB Square Shewra ECB Square Kuril Bishwa Road ECB Square Khilkhet ECB Square Airport ECB Square Jasimuddin ECB Square" +
                        "ECB Square Azampur ECB Square House Building ECB Square" +
                        "ECB Square Abdullahpur ECB Square Kamarpara ECB Square" +
                        "MES Shewra MES Kuril Bishwa Road MES Khilkhet MES Airport MES Jasimuddin MES" +
                        "MES Azampur MES House Building MES" +
                        "MES Abdullahpur MES Kamarpara MES" +
                        "Shewra Kuril Bishwa Road Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra" +
                        "Shewra Azampur Shewra House Building Shewra" +
                        "Shewra Abdullahpur Shewra Kamarpara Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road" +
                        "Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road Kamarpara Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet" +
                        "Khilkhet Azampur Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet Kamarpara Khilkhet" +
                        "Airport Jasimuddin Airport" +
                        "Airport Azampur Airport House Building Airport" +
                        "Airport Abdullahpur Airport Kamarpara Airport" +
                        "Jasimuddin Azampur Jasimuddin House Building Jasimuddin" +
                        "Jasimuddin Abdullahpur Jasimuddin Kamarpara Jasimuddin" +
                        "Azampur House Building Azampur" +
                        "Azampur Abdullahpur Azampur Kamarpara Azampur" +
                        "House Building Abdullahpur House Building Kamarpara House Building" +
                        "Abdullahpur Kamarpara Abdullahpur"));


        buses.add(new Bus(R.drawable.logo,"Rabrab Paribahan",
                "Gabtoli Technical Gabtoli Ansar Camp Gabtoli Mirpur 1 Gabtoli Mirpur 2 Gabtoli Mirpur 10 Gabtoli Purobi Gabtoli Kalshi Gabtoli" +
                        "Gabtoli ECB Square Gabtoli MES Gabtoli Banani Gabtoli Kakoli Gabtoli Chairman Bari Gabtoli Wireless Mor Gabtoli Gulshan Bridge Gabtoli" +
                        "Gabtoli Gulshan 1 Gabtoli Badda Gabtoli Rampura Bridge Gabtoli" +
                        "Gabtoli Banasree Gabtoli" +
                        "Technical Ansar Camp Technical Mirpur 1 Technical Mirpur 2 Technical Mirpur 10 Technical Purobi Technical Kalshi Technical" +
                        "Technical ECB Square Technical MES Technical Banani Technical Kakoli Technical Chairman Bari Technical Wireless Mor Technical Gulshan Bridge Technical" +
                        "Technical Gulshan 1 Technical Badda Technical Rampura Bridge Technical" +
                        "Technical Banasree Technical" +
                        "Ansar Camp Mirpur 1 Ansar Camp Mirpur 2 Ansar Camp Mirpur 10 Ansar Camp Purobi Ansar Camp Kalshi Ansar Camp" +
                        "Ansar Camp ECB Square Ansar Camp MES Ansar Camp Banani Ansar Camp Kakoli Ansar Camp Chairman Bari Ansar Camp Wireless Mor Ansar Camp Gulshan Bridge Ansar Camp" +
                        "Ansar Camp Gulshan 1 Ansar Camp Badda Ansar Camp Rampura Bridge Ansar Camp" +
                        "Ansar Camp Banasree Ansar Camp" +
                        "Mirpur 1 Mirpur 2 Mirpur 1 Mirpur 10 Mirpur 1 Purobi Mirpur 1 Kalshi Mirpur 1" +
                        "Mirpur 1 ECB Square Mirpur 1 MES Mirpur 1 Banani Mirpur 1 Kakoli Mirpur 1 Chairman Bari Mirpur 1 Wireless Mor Mirpur 1 Gulshan Bridge Mirpur 1" +
                        "Mirpur 1 Gulshan 1 Mirpur 1 Badda Mirpur 1 Rampura Bridge Mirpur 1" +
                        "Mirpur 1 Banasree Mirpur 1" +
                        "Mirpur 2 Mirpur 10 Mirpur 2 Purobi Mirpur 2 Kalshi Mirpur 2" +
                        "Mirpur 2 ECB Square Mirpur 2 MES Mirpur 2 Banani Mirpur 2 Kakoli Mirpur 2 Chairman Bari Mirpur 2 Wireless Mor Mirpur 2 Gulshan Bridge Mirpur 2" +
                        "Mirpur 2 Gulshan 1 Mirpur 2 Badda Mirpur 2 Rampura Bridge Mirpur 2" +
                        "Mirpur 2 Banasree Mirpur 2" +
                        "Mirpur 10 Purobi Mirpur 10 Kalshi Mirpur 10" +
                        "Mirpur 10 ECB Square Mirpur 10 MES Mirpur 10 Banani Mirpur 10 Kakoli Mirpur 10 Chairman Bari Mirpur 10 Wireless Mor Mirpur 10 Gulshan Bridge Mirpur 10" +
                        "Mirpur 10 Gulshan 1 Mirpur 10 Badda Mirpur 10 Rampura Bridge Mirpur 10" +
                        "Mirpur 10 Banasree Mirpur 10" +
                        "Purobi Kalshi Purobi" +
                        "Purobi ECB Square Purobi MES Purobi Banani Purobi Kakoli Purobi Chairman Bari Purobi Wireless Mor Purobi Gulshan Bridge Purobi" +
                        "Purobi Gulshan 1 Purobi Badda Purobi Rampura Bridge Purobi" +
                        "Purobi Banasree Purobi" +
                        "Kalshi ECB Square Kalshi MES Kalshi Banani Kalshi Kakoli Kalshi Chairman Bari Kalshi Wireless Mor Kalshi Gulshan Bridge Kalshi" +
                        "Kalshi Gulshan 1 Kalshi Badda Kalshi Rampura Bridge Kalshi" +
                        "Kalshi Banasree Kalshi" +
                        "ECB Square MES ECB Square Banani ECB Square Kakoli ECB Square Chairman Bari ECB Square Wireless Mor ECB Square Gulshan Bridge ECB Square" +
                        "ECB Square Gulshan 1 ECB Square Badda ECB Square Rampura Bridge ECB Square" +
                        "ECB Square Banasree ECB Square" +
                        "MES Banani MES Kakoli MES Chairman Bari MES Wireless Mor MES Gulshan Bridge MES" +
                        "MES Gulshan 1 MES Badda MES Rampura Bridge MES" +
                        "MES Banasree MES" +
                        "Banani Kakoli Banani Chairman Bari Banani Wireless Mor Banani Gulshan Bridge Banani" +
                        "Banani Gulshan 1 Banani Badda Banani Rampura Bridge Banani" +
                        "Banani Banasree Banani" +
                        "Kakoli Chairman Bari Kakoli Wireless Mor Kakoli Gulshan Bridge Kakoli" +
                        "Kakoli Gulshan 1 Kakoli Badda Kakoli Rampura Bridge Kakoli" +
                        "Kakoli Banasree Kakoli" +
                        "Chairman Bari Wireless Mor Chairman Bari Gulshan Bridge Chairman Bari" +
                        "Chairman Bari Gulshan 1 Chairman Bari Badda Chairman Bari Rampura Bridge Chairman Bari" +
                        "Chairman Bari Banasree Chairman Bari" +
                        "Wireless Mor Gulshan Bridge Wireless Mor" +
                        "Wireless Mor Gulshan 1 Wireless Mor Badda Wireless Mor Rampura Bridge Wireless Mor" +
                        "Wireless Mor Banasree Wireless Mor" +
                        "Gulshan Bridge Gulshan 1 Gulshan Bridge Badda Gulshan Bridge Rampura Bridge Gulshan Bridge" +
                        "Gulshan Bridge Banasree Gulshan Bridge" +
                        "Gulshan 1 Badda Gulshan 1 Rampura Bridge Gulshan 1" +
                        "Gulshan 1 Banasree Gulshan 1" +
                        "Badda Rampura Bridge Badda" +
                        "Badda Banasree Badda" +
                        "Rampura Bridge Banasree Rampura Bridge"));


        buses.add(new Bus(R.drawable.logo,"Raida",
                "Postogola Dholaipar Postogola Jatrabari Postogola Sayedabad Postogola Mugdapara Postogola Basabo Postogola Khilgaon Postogola Malibagh Postogola" +
                        "Postogola Rampura Postogola Merul Postogola Badda Postogola Natun Bazar Postogola Nadda Postogola Kuril Bishwa Road Postogola Khilkhet Postogola" +
                        "Postogola Airport Postogola House Building Postogola" +
                        "Postogola Diabari Postogola" +
                        "Dholaipar Jatrabari Dholaipar Sayedabad Dholaipar Mugdapara Dholaipar Basabo Dholaipar Khilgaon Dholaipar Malibagh Dholaipar" +
                        "Dholaipar Rampura Dholaipar Merul Dholaipar Badda Dholaipar Natun Bazar Dholaipar Nadda Dholaipar Kuril Bishwa Road Dholaipar Khilkhet Dholaipar" +
                        "Dholaipar Airport Dholaipar House Building Dholaipar" +
                        "Dholaipar Diabari Dholaipar" +
                        "Jatrabari Sayedabad Jatrabari Mugdapara Jatrabari Basabo Jatrabari Khilgaon Jatrabari Malibagh Jatrabari" +
                        "Jatrabari Rampura Jatrabari Merul Jatrabari Badda Jatrabari Natun Bazar Jatrabari Nadda Jatrabari Kuril Bishwa Road Jatrabari Khilkhet Jatrabari" +
                        "Jatrabari Airport Jatrabari House Building Jatrabari" +
                        "Jatrabari Diabari Jatrabari" +
                        "Sayedabad Mugdapara Sayedabad Basabo Sayedabad Khilgaon Sayedabad Malibagh Sayedabad" +
                        "Sayedabad Rampura Sayedabad Merul Sayedabad Badda Sayedabad Natun Bazar Sayedabad Nadda Sayedabad Kuril Bishwa Road Sayedabad Khilkhet Sayedabad" +
                        "Sayedabad Airport Sayedabad House Building Sayedabad" +
                        "Sayedabad Diabari Sayedabad" +
                        "Mugdapara Basabo Mugdapara Khilgaon Mugdapara Malibagh Mugdapara" +
                        "Mugdapara Rampura Mugdapara Merul Mugdapara Badda Mugdapara Natun Bazar Mugdapara Nadda Mugdapara Kuril Bishwa Road Mugdapara Khilkhet Mugdapara" +
                        "Mugdapara Airport Mugdapara House Building Mugdapara" +
                        "Mugdapara Diabari Mugdapara" +
                        "Basabo Khilgaon Basabo Malibagh Basabo" +
                        "Basabo Rampura Basabo Merul Basabo Badda Basabo Natun Bazar Basabo Nadda Basabo Kuril Bishwa Road Basabo Khilkhet Basabo" +
                        "Basabo Airport Basabo House Building Basabo" +
                        "Basabo Diabari Basabo" +
                        "Khilgaon Malibagh Khilgaon" +
                        "Khilgaon Rampura Khilgaon Merul Khilgaon Badda Khilgaon Natun Bazar Khilgaon Nadda Khilgaon Kuril Bishwa Road Khilgaon Khilkhet Khilgaon" +
                        "Khilgaon Airport Khilgaon House Building Khilgaon" +
                        "Khilgaon Diabari Khilgaon" +
                        "Malibagh Rampura Malibagh Merul Malibagh Badda Malibagh Natun Bazar Malibagh Nadda Malibagh Kuril Bishwa Road Malibagh Khilkhet Malibagh" +
                        "Malibagh Airport Malibagh House Building Malibagh" +
                        "Malibagh Diabari Malibagh" +
                        "Rampura Merul Rampura Badda Rampura Natun Bazar Rampura Nadda Rampura Kuril Bishwa Road Rampura Khilkhet Rampura" +
                        "Rampura Airport Rampura House Building Rampura" +
                        "Rampura Diabari Rampura" +
                        "Merul Badda Merul Natun Bazar Merul Nadda Merul Kuril Bishwa Road Merul Khilkhet Merul" +
                        "Merul Airport Merul House Building Merul" +
                        "Merul Diabari Merul" +
                        "Badda Natun Bazar Badda Nadda Badda Kuril Bishwa Road Badda Khilkhet Badda" +
                        "Badda Airport Badda House Building Badda" +
                        "Badda Diabari Badda" +
                        "Natun Bazar Nadda Natun Bazar Kuril Bishwa Road Natun Bazar Khilkhet Natun Bazar" +
                        "Natun Bazar Airport Natun Bazar House Building Natun Bazar" +
                        "Natun Bazar Diabari Natun Bazar" +
                        "Nadda Kuril Bishwa Road Nadda Khilkhet Nadda" +
                        "Nadda Airport Nadda House Building Nadda" +
                        "Nadda Diabari Nadda" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road" +
                        "Kuril Bishwa Road Airport Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Diabari Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet House Building Khilkhet" +
                        "Khilkhet Diabari Khilkhet" +
                        "Airport House Building Airport" +
                        "Airport Diabari Airport" +
                        "House Building Diabari House Building"));


        buses.add(new Bus(R.drawable.logo,"Rajanigandha",
                "Meghna Ghat Mograpara Meghna Ghat Madanpur Meghna Ghat Kanchpur Meghna Ghat Chittagang Road Meghna Ghat Sign Board Meghna Ghat Shonir Akhra Meghna Ghat" +
                        "Meghna Ghat Jatrabari Meghna Ghat Sayedabad Meghna Ghat Gulisthan Meghna Ghat GPO Meghna Ghat Press Club Meghna Ghat Shahbag Meghna Ghat" +
                        "Meghna Ghat Science Lab Meghna Ghat Jigatola Meghna Ghat Dhanmondi 15 Meghna Ghat Star Kabab Meghna Ghat Shankar Meghna Ghat" +
                        "Meghna Ghat Mohammadpur Meghna Ghat" +
                        "Mograpara Madanpur Mograpara Kanchpur Mograpara Chittagang Road Mograpara Sign Board Mograpara Shonir Akhra Mograpara" +
                        "Mograpara Jatrabari Mograpara Sayedabad Mograpara Gulisthan Mograpara GPO Mograpara Press Club Mograpara Shahbag Mograpara" +
                        "Mograpara Science Lab Mograpara Jigatola Mograpara Dhanmondi 15 Mograpara Star Kabab Mograpara Shankar Mograpara" +
                        "Mograpara Mohammadpur Mograpara" +
                        "Madanpur Kanchpur Madanpur Chittagang Road Madanpur Sign Board Madanpur Shonir Akhra Madanpur" +
                        "Madanpur Jatrabari Madanpur Sayedabad Madanpur Gulisthan Madanpur GPO Madanpur Press Club Madanpur Shahbag Madanpur" +
                        "Madanpur Science Lab Madanpur Jigatola Madanpur Dhanmondi 15 Madanpur Star Kabab Madanpur Shankar Madanpur" +
                        "Madanpur Mohammadpur Madanpur" +
                        "Kanchpur Chittagang Road Kanchpur Sign Board Kanchpur Shonir Akhra Kanchpur" +
                        "Kanchpur Jatrabari Kanchpur Sayedabad Kanchpur Gulisthan Kanchpur GPO Kanchpur Press Club Kanchpur Shahbag Kanchpur" +
                        "Kanchpur Science Lab Kanchpur Jigatola Kanchpur Dhanmondi 15 Kanchpur Star Kabab Kanchpur Shankar Kanchpur" +
                        "Kanchpur Mohammadpur Kanchpur" +
                        "Chittagang Road Sign Board Chittagang Road Shonir Akhra Chittagang Road" +
                        "Chittagang Road Jatrabari Chittagang Road Sayedabad Chittagang Road Gulisthan Chittagang Road GPO Chittagang Road Press Club Chittagang Road Shahbag Chittagang Road" +
                        "Chittagang Road Science Lab Chittagang Road Jigatola Chittagang Road Dhanmondi 15 Chittagang Road Star Kabab Chittagang Road Shankar Chittagang Road" +
                        "Chittagang Road Mohammadpur Chittagang Road" +
                        "Sign Board Shonir Akhra Sign Board" +
                        "Sign Board Jatrabari Sign Board Sayedabad Sign Board Gulisthan Sign Board GPO Sign Board Press Club Sign Board Shahbag Sign Board" +
                        "Sign Board Science Lab Sign Board Jigatola Sign Board Dhanmondi 15 Sign Board Star Kabab Sign Board Shankar Sign Board" +
                        "Sign Board Mohammadpur Sign Board" +
                        "Shonir Akhra Jatrabari Shonir Akhra Sayedabad Shonir Akhra Gulisthan Shonir Akhra GPO Shonir Akhra Press Club Shonir Akhra Shahbag Shonir Akhra" +
                        "Shonir Akhra Science Lab Shonir Akhra Jigatola Shonir Akhra Dhanmondi 15 Shonir Akhra Star Kabab Shonir Akhra Shankar Shonir Akhra" +
                        "Shonir Akhra Mohammadpur Shonir Akhra" +
                        "Jatrabari Sayedabad Jatrabari Gulisthan Jatrabari GPO Jatrabari Press Club Jatrabari Shahbag Jatrabari" +
                        "Jatrabari Science Lab Jatrabari Jigatola Jatrabari Dhanmondi 15 Jatrabari Star Kabab Jatrabari Shankar Jatrabari" +
                        "Jatrabari Mohammadpur Jatrabari" +
                        "Sayedabad Gulisthan Sayedabad GPO Sayedabad Press Club Sayedabad Shahbag Sayedabad" +
                        "Sayedabad Science Lab Sayedabad Jigatola Sayedabad Dhanmondi 15 Sayedabad Star Kabab Sayedabad Shankar Sayedabad" +
                        "Sayedabad Mohammadpur Sayedabad" +
                        "Gulisthan GPO Gulisthan Press Club Gulisthan Shahbag Gulisthan" +
                        "Gulisthan Science Lab Gulisthan Jigatola Gulisthan Dhanmondi 15 Gulisthan Star Kabab Gulisthan Shankar Gulisthan" +
                        "Gulisthan Mohammadpur Gulisthan" +
                        "GPO Press Club GPO Shahbag GPO" +
                        "GPO Science Lab GPO Jigatola GPO Dhanmondi 15 GPO Star Kabab GPO Shankar GPO" +
                        "GPO Mohammadpur GPO" +
                        "Press Club Shahbag Press Club" +
                        "Press Club Science Lab Press Club Jigatola Press Club Dhanmondi 15 Press Club Star Kabab Press Club Shankar Press Club" +
                        "Press Club Mohammadpur Press Club" +
                        "Shahbag Science Lab Shahbag Jigatola Shahbag Dhanmondi 15 Shahbag Star Kabab Shahbag Shankar Shahbag" +
                        "Shahbag Mohammadpur Shahbag" +
                        "Science Lab Jigatola Science Lab Dhanmondi 15 Science Lab Star Kabab Science Lab Shankar Science Lab" +
                        "Science Lab Mohammadpur Science Lab" +
                        "Jigatola Dhanmondi 15 Jigatola Star Kabab Jigatola Shankar Jigatola" +
                        "Jigatola Mohammadpur Jigatola" +
                        "Dhanmondi 15 Star Kabab Dhanmondi 15 Shankar Dhanmondi 15" +
                        "Dhanmondi 15 Mohammadpur Dhanmondi 15" +
                        "Star Kabab Shankar Star Kabab" +
                        "Star Kabab Mohammadpur Star Kabab" +
                        "Shankar Mohammadpur Shankar"));


        buses.add(new Bus(R.drawable.logo,"Rajdhani Super Service",
                "Mirpur 12 Pallabi Mirpur 12 Purobi Mirpur 12 Mirpur 11 Mirpur 12 Mirpur 10 Mirpur 12 Mirpur 2 Mirpur 12 Sony Hall Mirpur 12 Mirpur 1 Mirpur 12" +
                        "Mirpur 12 Ansar Camp Mirpur 12 Technical Mirpur 12 Gabtoli Mirpur 12 Aminbazar Mirpur 12 Hemayetpur Mirpur 12 Savar Mirpur 12 Nobinagar Mirpur 12" +
                        "Mirpur 12 Baipayl Mirpur 12 Nandan Park Mirpur 12" +
                        "Mirpur 12 Chandra Mirpur 12" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Mirpur 2 Pallabi Sony Hall Pallabi Mirpur 1 Pallabi" +
                        "Pallabi Ansar Camp Pallabi Technical Pallabi Gabtoli Pallabi Aminbazar Pallabi Hemayetpur Pallabi Savar Pallabi Nobinagar Pallabi" +
                        "Pallabi Baipayl Pallabi Nandan Park Pallabi" +
                        "Pallabi Chandra Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Mirpur 2 Purobi Sony Hall Purobi Mirpur 1 Purobi" +
                        "Purobi Ansar Camp Purobi Technical Purobi Gabtoli Purobi Aminbazar Purobi Hemayetpur Purobi Savar Purobi Nobinagar Purobi" +
                        "Purobi Baipayl Purobi Nandan Park Purobi" +
                        "Purobi Chandra Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Mirpur 2 Mirpur 11 Sony Hall Mirpur 11 Mirpur 1 Mirpur 11" +
                        "Mirpur 11 Ansar Camp Mirpur 11 Technical Mirpur 11 Gabtoli Mirpur 11 Aminbazar Mirpur 11 Hemayetpur Mirpur 11 Savar Mirpur 11 Nobinagar Mirpur 11" +
                        "Mirpur 11 Baipayl Mirpur 11 Nandan Park Mirpur 11" +
                        "Mirpur 11 Chandra Mirpur 11" +
                        "Mirpur 10 Mirpur 2 Mirpur 10 Sony Hall Mirpur 10 Mirpur 1 Mirpur 10" +
                        "Mirpur 10 Ansar Camp Mirpur 10 Technical Mirpur 10 Gabtoli Mirpur 10 Aminbazar Mirpur 10 Hemayetpur Mirpur 10 Savar Mirpur 10 Nobinagar Mirpur 10" +
                        "Mirpur 10 Baipayl Mirpur 10 Nandan Park Mirpur 10" +
                        "Mirpur 10 Chandra Mirpur 10" +
                        "Mirpur 2 Sony Hall Mirpur 2 Mirpur 1 Mirpur 2" +
                        "Mirpur 2 Ansar Camp Mirpur 2 Technical Mirpur 2 Gabtoli Mirpur 2 Aminbazar Mirpur 2 Hemayetpur Mirpur 2 Savar Mirpur 2 Nobinagar Mirpur 2" +
                        "Mirpur 2 Baipayl Mirpur 2 Nandan Park Mirpur 2" +
                        "Mirpur 2 Chandra Mirpur 2" +
                        "Sony Hall Mirpur 1 Sony Hall" +
                        "Sony Hall Ansar Camp Sony Hall Technical Sony Hall Gabtoli Sony Hall Aminbazar Sony Hall Hemayetpur Sony Hall Savar Sony Hall Nobinagar Sony Hall" +
                        "Sony Hall Baipayl Sony Hall Nandan Park Sony Hall" +
                        "Sony Hall Chandra Sony Hall" +
                        "Mirpur 1 Ansar Camp Mirpur 1 Technical Mirpur 1 Gabtoli Mirpur 1 Aminbazar Mirpur 1 Hemayetpur Mirpur 1 Savar Mirpur 1 Nobinagar Mirpur 1" +
                        "Mirpur 1 Baipayl Mirpur 1 Nandan Park Mirpur 1" +
                        "Mirpur 1 Chandra Mirpur 1" +
                        "Ansar Camp Technical Ansar Camp Gabtoli Ansar Camp Aminbazar Ansar Camp Hemayetpur Ansar Camp Savar Ansar Camp Nobinagar Ansar Camp" +
                        "Ansar Camp Baipayl Ansar Camp Nandan Park Ansar Camp" +
                        "Ansar Camp Chandra Ansar Camp" +
                        "Technical Gabtoli Technical Aminbazar Technical Hemayetpur Technical Savar Technical Nobinagar Technical" +
                        "Technical Baipayl Technical Nandan Park Technical" +
                        "Technical Chandra Technical" +
                        "Gabtoli Aminbazar Gabtoli Hemayetpur Gabtoli Savar Gabtoli Nobinagar Gabtoli" +
                        "Gabtoli Baipayl Gabtoli Nandan Park Gabtoli" +
                        "Gabtoli Chandra Gabtoli" +
                        "Aminbazar Hemayetpur Aminbazar Savar Aminbazar Nobinagar Aminbazar" +
                        "Aminbazar Baipayl Aminbazar Nandan Park Aminbazar" +
                        "Aminbazar Chandra Aminbazar" +
                        "Hemayetpur Savar Hemayetpur Nobinagar Hemayetpur" +
                        "Hemayetpur Baipayl Hemayetpur Nandan Park Hemayetpur" +
                        "Hemayetpur Chandra Hemayetpur" +
                        "Savar Nobinagar Savar" +
                        "Savar Baipayl Savar Nandan Park Savar" +
                        "Savar Chandra Savar" +
                        "Nobinagar Baipayl Nobinagar Nandan Park Nobinagar" +
                        "Nobinagar Chandra Nobinagar" +
                        "Baipayl Nandan Park Baipayl" +
                        "Baipayl Chandra Baipayl" +
                        "Nandan Park Chandra Nandan Park"));


        buses.add(new Bus(R.drawable.logo,"Rangdhonu Paribahan",
                "Japan Garden City Adabor Japan Garden City Shyamoli Japan Garden City Shishu Mela Japan Garden City College Gate Japan Garden City Asad Gate Japan Garden City Dhanmondi 27 Japan Garden City Dhanmondi 32 Japan Garden City Kalabagan Japan Garden City" +
                        "Japan Garden City Science Lab Japan Garden City Bata Signal Japan Garden City Shahbag Japan Garden City Motsho Bhobon Japan Garden City Kakrail Japan Garden City Fakirapul Japan Garden City" +
                        "Japan Garden City Arambag Japan Garden City Motijheel Japan Garden City Ittefaq Japan Garden City Tikatuli Japan Garden City Dayaganj Japan Garden City Gandaria Japan Garden City" +
                        "Japan Garden City Jurain Japan Garden City" +
                        "Adabor Shyamoli Adabor Shishu Mela Adabor College Gate Adabor Asad Gate Adabor Dhanmondi 27 Adabor Dhanmondi 32 Adabor Kalabagan Adabor" +
                        "Adabor Science Lab Adabor Bata Signal Adabor Shahbag Adabor Motsho Bhobon Adabor Kakrail Adabor Fakirapul Adabor" +
                        "Adabor Arambag Adabor Motijheel Adabor Ittefaq Adabor Tikatuli Adabor Dayaganj Adabor Gandaria Adabor" +
                        "Adabor Jurain Adabor" +
                        "Shyamoli Shishu Mela Shyamoli College Gate Shyamoli Asad Gate Shyamoli Dhanmondi 27 Shyamoli Dhanmondi 32 Shyamoli Kalabagan Shyamoli" +
                        "Shyamoli Science Lab Shyamoli Bata Signal Shyamoli Shahbag Shyamoli Motsho Bhobon Shyamoli Kakrail Shyamoli Fakirapul Shyamoli" +
                        "Shyamoli Arambag Shyamoli Motijheel Shyamoli Ittefaq Shyamoli Tikatuli Shyamoli Dayaganj Shyamoli Gandaria Shyamoli" +
                        "Shyamoli Jurain Shyamoli" +
                        "Shishu Mela College Gate Shishu Mela Asad Gate Shishu Mela Dhanmondi 27 Shishu Mela Dhanmondi 32 Shishu Mela Kalabagan Shishu Mela" +
                        "Shishu Mela Science Lab Shishu Mela Bata Signal Shishu Mela Shahbag Shishu Mela Motsho Bhobon Shishu Mela Kakrail Shishu Mela Fakirapul Shishu Mela" +
                        "Shishu Mela Arambag Shishu Mela Motijheel Shishu Mela Ittefaq Shishu Mela Tikatuli Shishu Mela Dayaganj Shishu Mela Gandaria Shishu Mela" +
                        "Shishu Mela Jurain Shishu Mela" +
                        "College Gate Asad Gate College Gate Dhanmondi 27 College Gate Dhanmondi 32 College Gate Kalabagan College Gate" +
                        "College Gate Science Lab College Gate Bata Signal College Gate Shahbag College Gate Motsho Bhobon College Gate Kakrail College Gate Fakirapul College Gate" +
                        "College Gate Arambag College Gate Motijheel College Gate Ittefaq College Gate Tikatuli College Gate Dayaganj College Gate Gandaria College Gate" +
                        "College Gate Jurain College Gate" +
                        "Asad Gate Dhanmondi 27 Asad Gate Dhanmondi 32 Asad Gate Kalabagan Asad Gate" +
                        "Asad Gate Science Lab Asad Gate Bata Signal Asad Gate Shahbag Asad Gate Motsho Bhobon Asad Gate Kakrail Asad Gate Fakirapul Asad Gate" +
                        "Asad Gate Arambag Asad Gate Motijheel Asad Gate Ittefaq Asad Gate Tikatuli Asad Gate Dayaganj Asad Gate Gandaria Asad Gate" +
                        "Asad Gate Jurain Asad Gate" +
                        "Dhanmondi 27 Dhanmondi 32 Dhanmondi 27 Kalabagan Dhanmondi 27" +
                        "Dhanmondi 27 Science Lab Dhanmondi 27 Bata Signal Dhanmondi 27 Shahbag Dhanmondi 27 Motsho Bhobon Dhanmondi 27 Kakrail Dhanmondi 27 Fakirapul Dhanmondi 27" +
                        "Dhanmondi 27 Arambag Dhanmondi 27 Motijheel Dhanmondi 27 Ittefaq Dhanmondi 27 Tikatuli Dhanmondi 27 Dayaganj Dhanmondi 27 Gandaria Dhanmondi 27" +
                        "Dhanmondi 27 Jurain Dhanmondi 27" +
                        "Dhanmondi 32 Kalabagan Dhanmondi 32" +
                        "Dhanmondi 32 Science Lab Dhanmondi 32 Bata Signal Dhanmondi 32 Shahbag Dhanmondi 32 Motsho Bhobon Dhanmondi 32 Kakrail Dhanmondi 32 Fakirapul Dhanmondi 32" +
                        "Dhanmondi 32 Arambag Dhanmondi 32 Motijheel Dhanmondi 32 Ittefaq Dhanmondi 32 Tikatuli Dhanmondi 32 Dayaganj Dhanmondi 32 Gandaria Dhanmondi 32" +
                        "Dhanmondi 32 Jurain Dhanmondi 32" +
                        "Kalabagan Science Lab Kalabagan Bata Signal Kalabagan Shahbag Kalabagan Motsho Bhobon Kalabagan Kakrail Kalabagan Fakirapul Kalabagan" +
                        "Kalabagan Arambag Kalabagan Motijheel Kalabagan Ittefaq Kalabagan Tikatuli Kalabagan Dayaganj Kalabagan Gandaria Kalabagan" +
                        "Kalabagan Jurain Kalabagan" +
                        "Science Lab Bata Signal Science Lab Shahbag Science Lab Motsho Bhobon Science Lab Kakrail Science Lab Fakirapul Science Lab" +
                        "Science Lab Arambag Science Lab Motijheel Science Lab Ittefaq Science Lab Tikatuli Science Lab Dayaganj Science Lab Gandaria Science Lab" +
                        "Science Lab Jurain Science Lab" +
                        "Bata Signal Shahbag Bata Signal Motsho Bhobon Bata Signal Kakrail Bata Signal Fakirapul Bata Signal" +
                        "Bata Signal Arambag Bata Signal Motijheel Bata Signal Ittefaq Bata Signal Tikatuli Bata Signal Dayaganj Bata Signal Gandaria Bata Signal" +
                        "Bata Signal Jurain Bata Signal" +
                        "Shahbag Motsho Bhobon Shahbag Kakrail Shahbag Fakirapul Shahbag" +
                        "Shahbag Arambag Shahbag Motijheel Shahbag Ittefaq Shahbag Tikatuli Shahbag Dayaganj Shahbag Gandaria Shahbag" +
                        "Shahbag Jurain Shahbag" +
                        "Motsho Bhobon Kakrail Motsho Bhobon Fakirapul Motsho Bhobon" +
                        "Motsho Bhobon Arambag Motsho Bhobon Motijheel Motsho Bhobon Ittefaq Motsho Bhobon Tikatuli Motsho Bhobon Dayaganj Motsho Bhobon Gandaria Motsho Bhobon" +
                        "Motsho Bhobon Jurain Motsho Bhobon" +
                        "Kakrail Fakirapul Kakrail" +
                        "Kakrail Arambag Kakrail Motijheel Kakrail Ittefaq Kakrail Tikatuli Kakrail Dayaganj Kakrail Gandaria Kakrail" +
                        "Kakrail Jurain Kakrail" +
                        "Arambag Motijheel Arambag Ittefaq Arambag Tikatuli Arambag Dayaganj Arambag Gandaria Arambag" +
                        "Arambag Jurain Arambag" +
                        "Motijheel Ittefaq Motijheel Tikatuli Motijheel Dayaganj Motijheel Gandaria Motijheel" +
                        "Motijheel Jurain Motijheel" +
                        "Ittefaq Tikatuli Ittefaq Dayaganj Ittefaq Gandaria Ittefaq" +
                        "Ittefaq Jurain Ittefaq" +
                        "Tikatuli Dayaganj Tikatuli Gandaria Tikatuli" +
                        "Tikatuli Jurain Tikatuli" +
                        "Dayaganj Gandaria Dayaganj" +
                        "Dayaganj Jurain Dayaganj" +
                        "Gandaria Jurain Gandaria"));



        buses.add(new Bus(R.drawable.logo,"Roich",
                "Gabtoli Technical Gabtoli Kallayanpur Gabtoli" +
                        "Gabtoli Shyamoli Gabtoli Shishu Mela Gabtoli Agargaon Gabtoli Bijoy Sarani Gabtoli Jahangir Gate Gabtoli " +
                        "Gabtoli Mohakhali Gabtoli Wireless Mor Gabtoli Gulshan 1 Gabtoli Badda Gabtoli" +
                        "Gabtoli Shahjadpur Gabtoli Bashtola Gabtoli Natun Bazar Gabtoli" +
                        "Technical Kallayanpur Technical" +
                        "Technical Shyamoli Technical Shishu Mela Technical Agargaon Technical Bijoy Sarani Technical Jahangir Gate Technical " +
                        "Technical Mohakhali Technical Wireless Mor Technical Gulshan 1 Technical Badda Technical" +
                        "Technical Shahjadpur Technical Bashtola Technical Natun Bazar Technical" +
                        "Kallayanpur Shyamoli Kallayanpur Shishu Mela Kallayanpur Agargaon Kallayanpur Bijoy Sarani Kallayanpur Jahangir Gate Kallayanpur " +
                        "Kallayanpur Mohakhali Kallayanpur Wireless Mor Kallayanpur Gulshan 1 Kallayanpur Badda Kallayanpur" +
                        "Kallayanpur Shahjadpur Kallayanpur Bashtola Kallayanpur Natun Bazar Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli Agargaon Shyamoli Bijoy Sarani Shyamoli Jahangir Gate Shyamoli " +
                        "Shyamoli Mohakhali Shyamoli Wireless Mor Shyamoli Gulshan 1 Shyamoli Badda Shyamoli" +
                        "Shyamoli Shahjadpur Shyamoli Bashtola Shyamoli Natun Bazar Shyamoli" +
                        "Shishu Mela Agargaon Shishu Mela Bijoy Sarani Shishu Mela Jahangir Gate Shishu Mela " +
                        "Shishu Mela Mohakhali Shishu Mela Wireless Mor Shishu Mela Gulshan 1 Shishu Mela Badda Shishu Mela" +
                        "Shishu Mela Shahjadpur Shishu Mela Bashtola Shishu Mela Natun Bazar Shishu Mela" +
                        "Agargaon Bijoy Sarani Agargaon Jahangir Gate Agargaon " +
                        "Agargaon Mohakhali Agargaon Wireless Mor Agargaon Gulshan 1 Agargaon Badda Agargaon" +
                        "Agargaon Shahjadpur Agargaon Bashtola Agargaon Natun Bazar Agargaon" +
                        "Bijoy Sarani Jahangir Gate Bijoy Sarani " +
                        "Bijoy Sarani Mohakhali Bijoy Sarani Wireless Mor Bijoy Sarani Gulshan 1 Bijoy Sarani Badda Bijoy Sarani" +
                        "Bijoy Sarani Shahjadpur Bijoy Sarani Bashtola Bijoy Sarani Natun Bazar Bijoy Sarani" +
                        "Jahangir Gate Mohakhali Jahangir Gate Wireless Mor Jahangir Gate Gulshan 1 Jahangir Gate Badda Jahangir Gate" +
                        "Jahangir Gate Shahjadpur Jahangir Gate Bashtola Jahangir Gate Natun Bazar Jahangir Gate" +
                        "Mohakhali Wireless Mor Mohakhali Gulshan 1 Mohakhali Badda Mohakhali" +
                        "Mohakhali Shahjadpur Mohakhali Bashtola Mohakhali Natun Bazar Mohakhali" +
                        "Wireless Mor Gulshan 1 Wireless Mor Badda Wireless Mor" +
                        "Wireless Mor Shahjadpur Wireless Mor Bashtola Wireless Mor Natun Bazar Wireless Mor" +
                        "Gulshan 1 Badda Gulshan 1" +
                        "Gulshan 1 Shahjadpur Gulshan 1 Bashtola Gulshan 1 Natun Bazar Gulshan 1" +
                        "Badda Shahjadpur Badda Bashtola Badda Natun Bazar Badda" +
                        "Shahjadpur Bashtola Shahjadpur Natun Bazar Shahjadpur" +
                        "Bashtola Natun Bazar Bashtola"));


        buses.add(new Bus(R.drawable.logo,"Ramjan",
                "Azimpur Nilkhet Azimpur New Market Azimpur Science Lab Azimpur Bata Signal Azimpur Katabon Azimpur Shahbag Azimpur Motsho Bhobon Azimpur" +
                        "Azimpur Kakrail Azimpur Shantinagar Azimpur Mouchak Azimpur Malibagh Azimpur Rampura Azimpur" +
                        "Azimpur Banasree Azimpur" +
                        "Nilkhet New Market Nilkhet Science Lab Nilkhet Bata Signal Nilkhet Katabon Nilkhet Shahbag Nilkhet Motsho Bhobon Nilkhet" +
                        "Nilkhet Kakrail Nilkhet Shantinagar Nilkhet Mouchak Nilkhet Malibagh Nilkhet Rampura Nilkhet" +
                        "Nilkhet Banasree Nilkhet" +
                        "New Market Science Lab New Market Bata Signal New Market Katabon New Market Shahbag New Market Motsho Bhobon New Market" +
                        "New Market Kakrail New Market Shantinagar New Market Mouchak New Market Malibagh New Market Rampura New Market" +
                        "New Market Banasree New Market" +
                        "Science Lab Bata Signal Science Lab Katabon Science Lab Shahbag Science Lab Motsho Bhobon Science Lab" +
                        "Science Lab Kakrail Science Lab Shantinagar Science Lab Mouchak Science Lab Malibagh Science Lab Rampura Science Lab" +
                        "Science Lab Banasree Science Lab" +
                        "Bata Signal Katabon Bata Signal Shahbag Bata Signal Motsho Bhobon Bata Signal" +
                        "Bata Signal Kakrail Bata Signal Shantinagar Bata Signal Mouchak Bata Signal Malibagh Bata Signal Rampura Bata Signal" +
                        "Bata Signal Banasree Bata Signal" +
                        "Katabon Shahbag Katabon Motsho Bhobon Katabon" +
                        "Katabon Kakrail Katabon Shantinagar Katabon Mouchak Katabon Malibagh Katabon Rampura Katabon" +
                        "Katabon Banasree Katabon" +
                        "Shahbag Motsho Bhobon Shahbag" +
                        "Shahbag Kakrail Shahbag Shantinagar Shahbag Mouchak Shahbag Malibagh Shahbag Rampura Shahbag" +
                        "Shahbag Banasree Shahbag" +
                        "Motsho Bhobon Kakrail Motsho Bhobon Shantinagar Motsho Bhobon Mouchak Motsho Bhobon Malibagh Motsho Bhobon Rampura Motsho Bhobon" +
                        "Motsho Bhobon Banasree Motsho Bhobon" +
                        "Kakrail Shantinagar Kakrail Mouchak Kakrail Malibagh Kakrail Rampura Kakrail" +
                        "Kakrail Banasree Kakrail" +
                        "Shantinagar Mouchak Shantinagar Malibagh Shantinagar Rampura Shantinagar" +
                        "Shantinagar Banasree Shantinagar" +
                        "Mouchak Malibagh Mouchak Rampura Mouchak" +
                        "Mouchak Banasree Mouchak" +
                        "Malibagh Rampura Malibagh" +
                        "Malibagh Banasree Malibagh" +
                        "Banasree Banasree Banasree"));


        buses.add(new Bus(R.drawable.logo,"Runway Express",
                "Keraniganj Kodomtoli Keraniganj Babu Bazar Keraniganj Naya Bazar Keraniganj Golap Shah Mazar Keraniganj GPO Keraniganj Paltan Keraniganj" +
                        "Keraniganj Press Club Keraniganj Shahbag Keraniganj Bangla Motor Keraniganj Kawran Bazar Keraniganj Farmgate Keraniganj Agargaon Keraniganj" +
                        "Keraniganj Taltola Keraniganj Shewrapara Keraniganj Kazipara Keraniganj Mirpur 10 Keraniganj Mirpur 11 Keraniganj Mirpur 12 Keraniganj" +
                        "Keraniganj ECB Square Keraniganj" +
                        "Kodomtoli Babu Bazar Kodomtoli Naya Bazar Kodomtoli Golap Shah Mazar Kodomtoli GPO Kodomtoli Paltan Kodomtoli" +
                        "Kodomtoli Press Club Kodomtoli Shahbag Kodomtoli Bangla Motor Kodomtoli Kawran Bazar Kodomtoli Farmgate Kodomtoli Agargaon Kodomtoli" +
                        "Kodomtoli Taltola Kodomtoli Shewrapara Kodomtoli Kazipara Kodomtoli Mirpur 10 Kodomtoli Mirpur 11 Kodomtoli Mirpur 12 Kodomtoli" +
                        "Kodomtoli ECB Square Kodomtoli" +
                        "Babu Bazar Naya Bazar Babu Bazar Golap Shah Mazar Babu Bazar GPO Babu Bazar Paltan Babu Bazar" +
                        "Babu Bazar Press Club Babu Bazar Shahbag Babu Bazar Bangla Motor Babu Bazar Kawran Bazar Babu Bazar Farmgate Babu Bazar Agargaon Babu Bazar" +
                        "Babu Bazar Taltola Babu Bazar Shewrapara Babu Bazar Kazipara Babu Bazar Mirpur 10 Babu Bazar Mirpur 11 Babu Bazar Mirpur 12 Babu Bazar" +
                        "Babu Bazar ECB Square Babu Bazar" +
                        "Naya Bazar Golap Shah Mazar Naya Bazar GPO Naya Bazar Paltan Naya Bazar" +
                        "Naya Bazar Press Club Naya Bazar Shahbag Naya Bazar Bangla Motor Naya Bazar Kawran Bazar Naya Bazar Farmgate Naya Bazar Agargaon Naya Bazar" +
                        "Naya Bazar Taltola Naya Bazar Shewrapara Naya Bazar Kazipara Naya Bazar Mirpur 10 Naya Bazar Mirpur 11 Naya Bazar Mirpur 12 Naya Bazar" +
                        "Naya Bazar ECB Square Naya Bazar" +
                        "Golap Shah Mazar GPO Golap Shah Mazar Paltan Golap Shah Mazar" +
                        "Golap Shah Mazar Press Club Golap Shah Mazar Shahbag Golap Shah Mazar Bangla Motor Golap Shah Mazar Kawran Bazar Golap Shah Mazar Farmgate Golap Shah Mazar Agargaon Golap Shah Mazar" +
                        "Golap Shah Mazar Taltola Golap Shah Mazar Shewrapara Golap Shah Mazar Kazipara Golap Shah Mazar Mirpur 10 Golap Shah Mazar Mirpur 11 Golap Shah Mazar Mirpur 12 Golap Shah Mazar" +
                        "Golap Shah Mazar ECB Square Golap Shah Mazar" +
                        "GPO Paltan GPO" +
                        "GPO Press Club GPO Shahbag GPO Bangla Motor GPO Kawran Bazar GPO Farmgate GPO Agargaon GPO" +
                        "GPO Taltola GPO Shewrapara GPO Kazipara GPO Mirpur 10 GPO Mirpur 11 GPO Mirpur 12 GPO" +
                        "GPO ECB Square GPO" +
                        "Paltan Press Club Paltan Shahbag Paltan Bangla Motor Paltan Kawran Bazar Paltan Farmgate Paltan Agargaon Paltan" +
                        "Paltan Taltola Paltan Shewrapara Paltan Kazipara Paltan Mirpur 10 Paltan Mirpur 11 Paltan Mirpur 12 Paltan" +
                        "Paltan ECB Square Paltan" +
                        "Press Club Shahbag Press Club Bangla Motor Press Club Kawran Bazar Press Club Farmgate Press Club Agargaon Press Club" +
                        "Press Club Taltola Press Club Shewrapara Press Club Kazipara Press Club Mirpur 10 Press Club Mirpur 11 Press Club Mirpur 12 Press Club" +
                        "Press Club ECB Square Press Club" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag Farmgate Shahbag Agargaon Shahbag" +
                        "Shahbag Taltola Shahbag Shewrapara Shahbag Kazipara Shahbag Mirpur 10 Shahbag Mirpur 11 Shahbag Mirpur 12 Shahbag" +
                        "Shahbag ECB Square Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Agargaon Bangla Motor" +
                        "Bangla Motor Taltola Bangla Motor Shewrapara Bangla Motor Kazipara Bangla Motor Mirpur 10 Bangla Motor Mirpur 11 Bangla Motor Mirpur 12 Bangla Motor" +
                        "Bangla Motor ECB Square Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Agargaon Kawran Bazar" +
                        "Kawran Bazar Taltola Kawran Bazar Shewrapara Kawran Bazar Kazipara Kawran Bazar Mirpur 10 Kawran Bazar Mirpur 11 Kawran Bazar Mirpur 12 Kawran Bazar" +
                        "Kawran Bazar ECB Square Kawran Bazar" +
                        "Farmgate Agargaon Farmgate" +
                        "Farmgate Taltola Farmgate Shewrapara Farmgate Kazipara Farmgate Mirpur 10 Farmgate Mirpur 11 Farmgate Mirpur 12 Farmgate" +
                        "Farmgate ECB Square Farmgate" +
                        "Agargaon Taltola Agargaon Shewrapara Agargaon Kazipara Agargaon Mirpur 10 Agargaon Mirpur 11 Agargaon Mirpur 12 Agargaon" +
                        "Agargaon ECB Square Agargaon" +
                        "Taltola Shewrapara Taltola Kazipara Taltola Mirpur 10 Taltola Mirpur 11 Taltola Mirpur 12 Taltola" +
                        "Taltola ECB Square Taltola" +
                        "Shewrapara Kazipara Shewrapara Mirpur 10 Shewrapara Mirpur 11 Shewrapara Mirpur 12 Shewrapara" +
                        "Shewrapara ECB Square Shewrapara" +
                        "Kazipara Mirpur 10 Kazipara Mirpur 11 Kazipara Mirpur 12 Kazipara" +
                        "Kazipara ECB Square Kazipara" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Mirpur 12 Mirpur 10" +
                        "Mirpur 10 ECB Square Mirpur 10" +
                        "Mirpur 11 Mirpur 12 Mirpur 11" +
                        "Mirpur 11 ECB Square Mirpur 11" +
                        "Mirpur 12 ECB Square Mirpur 12"));


        buses.add(new Bus(R.drawable.logo,"Rupa Paribahan",
                "Bhashantek Mirpur 14 Bhashantek Mirpur 10 Bhashantek Mirpur 2 Bhashantek Sony Hall Bhashantek Mirpur 1 Bhashantek" +
                        "Bhashantek Ansar Camp Bhashantek Technical Bhashantek" +
                        "Bhashantek Gabtoli Bhashantek" +
                        "Mirpur 14 Mirpur 10 Mirpur 14 Mirpur 2 Mirpur 14 Sony Hall Mirpur 14 Mirpur 1 Mirpur 14" +
                        "Mirpur 14 Ansar Camp Mirpur 14 Technical Mirpur 14" +
                        "Mirpur 14 Gabtoli Mirpur 14" +
                        "Mirpur 10 Mirpur 2 Mirpur 10 Sony Hall Mirpur 10 Mirpur 1 Mirpur 10" +
                        "Mirpur 10Mirpur 10 Ansar Camp Mirpur 10 Technical Mirpur 10" +
                        "Mirpur 10 Gabtoli Mirpur 10" +
                        "Mirpur 2 Sony Hall Mirpur 2 Mirpur 1 Mirpur 2" +
                        "Mirpur 2 Ansar Camp Mirpur 2 Technical Mirpur 2" +
                        "Mirpur 2 Gabtoli Mirpur 2" +
                        "Sony Hall Mirpur 1 Sony Hall" +
                        "Sony Hall Ansar Camp Sony Hall Technical Sony Hall" +
                        "Sony Hall Gabtoli Sony Hall" +
                        "Mirpur 1 Ansar Camp Mirpur 1 Technical Mirpur 1" +
                        "Mirpur 1 Gabtoli Mirpur 1" +
                        "Ansar Camp Technical Ansar Camp" +
                        "Ansar Camp Gabtoli Ansar Camp" +
                        "Technical Gabtoli Technical"));


        buses.add(new Bus(R.drawable.logo,"Rupkotha Paribahan",
                "Savar Hemayetpur Savar Gabtoli Savar Technical Savar Kallayanpur Savar Shyamoli Savar Shishu Mela Savar Agargaon Savar Bijoy Sarani Savar" +
                        "Savar Mohakhali Savar Banani Savar MES Savar Kuril Bishwa Road Savar Khilkhet Savar Airport Savar House Building Savar" +
                        "Savar Abdullahpur Savar" +
                        "Hemayetpur Gabtoli Hemayetpur Technical Hemayetpur Kallayanpur Hemayetpur Shyamoli Hemayetpur Shishu Mela Hemayetpur Agargaon Hemayetpur Bijoy Sarani Hemayetpur" +
                        "Hemayetpur Mohakhali Hemayetpur Banani Hemayetpur MES Hemayetpur Kuril Bishwa Road Hemayetpur Khilkhet Hemayetpur Airport Hemayetpur House Building Hemayetpur" +
                        "Hemayetpur Abdullahpur Hemayetpur" +
                        "Gabtoli Technical Gabtoli Kallayanpur Gabtoli Shyamoli Gabtoli Shishu Mela Gabtoli Agargaon Gabtoli Bijoy Sarani Gabtoli" +
                        "Gabtoli Mohakhali Gabtoli Banani Gabtoli MES Gabtoli Kuril Bishwa Road Gabtoli Khilkhet Gabtoli Airport Gabtoli House Building Gabtoli" +
                        "Gabtoli Abdullahpur Gabtoli" +
                        "Technical Kallayanpur Technical Shyamoli Technical Shishu Mela Technical Agargaon Technical Bijoy Sarani Technical" +
                        "Technical Mohakhali Technical Banani Technical MES Technical Kuril Bishwa Road Technical Khilkhet Technical Airport Technical House Building Technical" +
                        "Technical Abdullahpur Technical" +
                        "Kallayanpur Shyamoli Kallayanpur Shishu Mela Kallayanpur Agargaon Kallayanpur Bijoy Sarani Kallayanpur" +
                        "Kallayanpur Mohakhali Kallayanpur Banani Kallayanpur MES Kallayanpur Kuril Bishwa Road Kallayanpur Khilkhet Kallayanpur Airport Kallayanpur House Building Kallayanpur" +
                        "Kallayanpur Abdullahpur Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli Agargaon Shyamoli Bijoy Sarani Shyamoli" +
                        "Shyamoli Mohakhali Shyamoli Banani Shyamoli MES Shyamoli Kuril Bishwa Road Shyamoli Khilkhet Shyamoli Airport Shyamoli House Building Shyamoli" +
                        "Shyamoli Abdullahpur Shyamoli" +
                        "Shishu Mela Agargaon Shishu Mela Bijoy Sarani Shishu Mela" +
                        "Shishu Mela Mohakhali Shishu Mela Banani Shishu Mela MES Shishu Mela Kuril Bishwa Road Shishu Mela Khilkhet Shishu Mela Airport Shishu Mela House Building Shishu Mela" +
                        "Shishu Mela Abdullahpur Shishu Mela" +
                        "Shishu Mela Agargaon Shishu Mela Bijoy Sarani Shishu Mela" +
                        "Shishu Mela Mohakhali Shishu Mela Banani Shishu Mela MES Shishu Mela Kuril Bishwa Road Shishu Mela Khilkhet Shishu Mela Airport Shishu Mela House Building Shishu Mela" +
                        "Shishu Mela Abdullahpur Shishu Mela" +
                        "Agargaon Bijoy Sarani Agargaon" +
                        "Agargaon Mohakhali Agargaon Banani Agargaon MES Agargaon Kuril Bishwa Road Agargaon Khilkhet Agargaon Airport Agargaon House Building Agargaon" +
                        "Agargaon Abdullahpur Agargaon" +
                        "Bijoy Sarani Mohakhali Bijoy Sarani Banani Bijoy Sarani MES Bijoy Sarani Kuril Bishwa Road Bijoy Sarani Khilkhet Bijoy Sarani Airport Bijoy Sarani House Building Bijoy Sarani" +
                        "Bijoy Sarani Abdullahpur Bijoy Sarani" +
                        "Mohakhali Banani Mohakhali MES Mohakhali Kuril Bishwa Road Mohakhali Khilkhet Mohakhali Airport Mohakhali House Building Mohakhali" +
                        "Mohakhali Abdullahpur Mohakhali" +
                        "Banani MES Banani Kuril Bishwa Road Banani Khilkhet Banani Airport Banani House Building Banani" +
                        "Banani Abdullahpur Banani" +
                        "MES Kuril Bishwa Road MES Khilkhet MES Airport MES House Building MES" +
                        "MES Abdullahpur MES" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet" +
                        "Airport House Building Airport" +
                        "Airport Abdullahpur Airport" +
                        "House Building Abdullahpur House Building"));


        buses.add(new Bus(R.drawable.logo,"Safety Enterprise",
                "Mirpur 12 Pallabi Mirpur 12 Purobi Mirpur 12 Mirpur 11 Mirpur 12 Mirpur 10 Mirpur 12 Kazipara Mirpur 12 Shewrapara Mirpur 12" +
                        "Mirpur 12 Taltola Mirpur 12 Agargaon Mirpur 12 Khamarbari Mirpur 12 Dhanmondi 27 Mirpur 12 Dhanmondi 32 Mirpur 12 Kalabagan Mirpur 12" +
                        "Mirpur 12 City College Mirpur 12 Science Lab Mirpur 12 New Market Mirpur 12 Nilkhet Mirpur 12 Azimpur Mirpur 12" +
                        "Mirpur 12 Dhakeshwari Mirpur 12" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Khamarbari Pallabi Dhanmondi 27 Pallabi Dhanmondi 32 Pallabi Kalabagan Pallabi" +
                        "Pallabi City College Pallabi Science Lab Pallabi New Market Pallabi Nilkhet Pallabi Azimpur Pallabi" +
                        "Pallabi Dhakeshwari Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Khamarbari Purobi Dhanmondi 27 Purobi Dhanmondi 32 Purobi Kalabagan Purobi" +
                        "Purobi City College Purobi Science Lab Purobi New Market Purobi Nilkhet Purobi Azimpur Purobi" +
                        "Purobi Dhakeshwari Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Khamarbari Mirpur 11 Dhanmondi 27 Mirpur 11 Dhanmondi 32 Mirpur 11 Kalabagan Mirpur 11" +
                        "Mirpur 11 City College Mirpur 11 Science Lab Mirpur 11 New Market Mirpur 11 Nilkhet Mirpur 11 Azimpur Mirpur 11" +
                        "Mirpur 11 Dhakeshwari Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Khamarbari Mirpur 10 Dhanmondi 27 Mirpur 10 Dhanmondi 32 Mirpur 10 Kalabagan Mirpur 10" +
                        "Mirpur 10 City College Mirpur 10 Science Lab Mirpur 10 New Market Mirpur 10 Nilkhet Mirpur 10 Azimpur Mirpur 10" +
                        "Mirpur 10 Dhakeshwari Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Khamarbari Kazipara Dhanmondi 27 Kazipara Dhanmondi 32 Kazipara Kalabagan Kazipara" +
                        "Kazipara City College Kazipara Science Lab Kazipara New Market Kazipara Nilkhet Kazipara Azimpur Kazipara" +
                        "Kazipara Dhakeshwari Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Khamarbari Shewrapara Dhanmondi 27 Shewrapara Dhanmondi 32 Shewrapara Kalabagan Shewrapara" +
                        "Shewrapara City College Shewrapara Science Lab Shewrapara New Market Shewrapara Nilkhet Shewrapara Azimpur Shewrapara" +
                        "Shewrapara Dhakeshwari Shewrapara" +
                        "Taltola Agargaon Taltola Khamarbari Taltola Dhanmondi 27 Taltola Dhanmondi 32 Taltola Kalabagan Taltola" +
                        "Taltola City College Taltola Science Lab Taltola New Market Taltola Nilkhet Taltola Azimpur Taltola" +
                        "Taltola Dhakeshwari Taltola" +
                        "Agargaon Khamarbari Agargaon Dhanmondi 27 Agargaon Dhanmondi 32 Agargaon Kalabagan Agargaon" +
                        "Agargaon City College Agargaon Science Lab Agargaon New Market Agargaon Nilkhet Agargaon Azimpur Agargaon" +
                        "Agargaon Dhakeshwari Agargaon" +
                        "Khamarbari Dhanmondi 27 Khamarbari Dhanmondi 32 Khamarbari Kalabagan Khamarbari" +
                        "Khamarbari City College Khamarbari Science Lab Khamarbari New Market Khamarbari Nilkhet Khamarbari Azimpur Khamarbari" +
                        "Khamarbari Dhakeshwari Khamarbari" +
                        "Dhanmondi 27 Dhanmondi 32 Dhanmondi 27 Kalabagan Dhanmondi 27" +
                        "Dhanmondi 27 City College Dhanmondi 27 Science Lab Dhanmondi 27 New Market Dhanmondi 27 Nilkhet Dhanmondi 27 Azimpur Dhanmondi 27" +
                        "Dhanmondi 27 Dhakeshwari Dhanmondi 27" +
                        "Dhanmondi 32 Kalabagan Dhanmondi 32" +
                        "Dhanmondi 32 City College Dhanmondi 32 Science Lab Dhanmondi 32 New Market Dhanmondi 32 Nilkhet Dhanmondi 32 Azimpur Dhanmondi 32" +
                        "Dhanmondi 32 Dhakeshwari Dhanmondi 32" +
                        "Kalabagan City College Kalabagan Science Lab Kalabagan New Market Kalabagan Nilkhet Kalabagan Azimpur Kalabagan" +
                        "Kalabagan Dhakeshwari Kalabagan" +
                        "City College Science Lab City College New Market City College Nilkhet City College Azimpur City College" +
                        "City College Dhakeshwari City College" +
                        "Science Lab New Market Science Lab Nilkhet Science Lab Azimpur Science Lab" +
                        "Science Lab Dhakeshwari Science Lab" +
                        "New Market Nilkhet New Market Azimpur New Market" +
                        "New Market Dhakeshwari New Market" +
                        "Nilkhet Azimpur Nilkhet" +
                        "Nilkhet Dhakeshwari Nilkhet" +
                        "Azimpur Dhakeshwari Azimpur"));


        buses.add(new Bus(R.drawable.logo,"Salsabil",
                "Postogola Dholaipar Postogola Jatrabari Postogola Sayedabad Postogola Mugdapara Postogola Basabo Postogola" +
                        "Postogola Khilgaon Postogola Malibagh Postogola Rampura Postogola Merul Postogola Badda Postogola Natun Bazar Postogola" +
                        "Postogola Nadda Postogola Kuril Bishwa Road Postogola Khilkhet Postogola Airport Postogola House Building Postogola" +
                        "Postogola Abdullahpur Postogola Tongi Postogola Gazipur Postogola" +
                        "Dhoilaipar Jatrabari Dhoilaipar Sayedabad Dhoilaipar Mugdapara Dhoilaipar Basabo Dhoilaipar" +
                        "Dhoilaipar Khilgaon Dhoilaipar Malibagh Dhoilaipar Rampura Dhoilaipar Merul Dhoilaipar Badda Dhoilaipar Natun Bazar Dhoilaipar" +
                        "Dhoilaipar Nadda Dhoilaipar Kuril Bishwa Road Dhoilaipar Khilkhet Dhoilaipar Airport Dhoilaipar House Building Dhoilaipar" +
                        "Dhoilaipar Abdullahpur Dhoilaipar Tongi Dhoilaipar Gazipur Dhoilaipar" +
                        "Jatrabari Sayedabad Jatrabari Mugdapara Jatrabari Basabo Jatrabari" +
                        "Jatrabari Khilgaon Jatrabari Malibagh Jatrabari Rampura Jatrabari Merul Jatrabari Badda Jatrabari Natun Bazar Jatrabari" +
                        "Jatrabari Nadda Jatrabari Kuril Bishwa Road Jatrabari Khilkhet Jatrabari Airport Jatrabari House Building Jatrabari" +
                        "Jatrabari Abdullahpur Jatrabari Tongi Jatrabari Gazipur Jatrabari" +
                        "Sayedabad Mugdapara Sayedabad Basabo Sayedabad" +
                        "Sayedabad Khilgaon Sayedabad Malibagh Sayedabad Rampura Sayedabad Merul Sayedabad Badda Sayedabad Natun Bazar Sayedabad" +
                        "Sayedabad Nadda Sayedabad Kuril Bishwa Road Sayedabad Khilkhet Sayedabad Airport Sayedabad House Building Sayedabad" +
                        "Sayedabad Abdullahpur Sayedabad Tongi Sayedabad Gazipur Sayedabad" +
                        "Mugdapara Basabo Mugdapara" +
                        "Mugdapara Khilgaon Mugdapara Malibagh Mugdapara Rampura Mugdapara Merul Mugdapara Badda Mugdapara Natun Bazar Mugdapara" +
                        "Mugdapara Nadda Mugdapara Kuril Bishwa Road Mugdapara Khilkhet Mugdapara Airport Mugdapara House Building Mugdapara" +
                        "Mugdapara Abdullahpur Mugdapara Tongi Mugdapara Gazipur Mugdapara" +
                        "Basabo Khilgaon Basabo Malibagh Basabo Rampura Basabo Merul Basabo Badda Basabo Natun Bazar Basabo" +
                        "Basabo Nadda Basabo Kuril Bishwa Road Basabo Khilkhet Basabo Airport Basabo House Building Basabo" +
                        "Basabo Abdullahpur Basabo Tongi Basabo Gazipur Basabo" +
                        "Khilgaon Malibagh Khilgaon Rampura Khilgaon Merul Khilgaon Badda Khilgaon Natun Bazar Khilgaon" +
                        "Khilgaon Nadda Khilgaon Kuril Bishwa Road Khilgaon Khilkhet Khilgaon Airport Khilgaon House Building Khilgaon" +
                        "Khilgaon Abdullahpur Khilgaon Tongi Khilgaon Gazipur Khilgaon" +
                        "Malibagh Rampura Malibagh Merul Malibagh Badda Malibagh Natun Bazar Malibagh" +
                        "Malibagh Nadda Malibagh Kuril Bishwa Road Malibagh Khilkhet Malibagh Airport Malibagh House Building Malibagh" +
                        "Malibagh Abdullahpur Malibagh Tongi Malibagh Gazipur Malibagh" +
                        "Rampura Merul Rampura Badda Rampura Natun Bazar Rampura" +
                        "Rampura Nadda Rampura Kuril Bishwa Road Rampura Khilkhet Rampura Airport Rampura House Building Rampura" +
                        "Rampura Abdullahpur Rampura Tongi Rampura Gazipur Rampura" +
                        "Merul Badda Merul Natun Bazar Merul" +
                        "Merul Nadda Merul Kuril Bishwa Road Merul Khilkhet Merul Airport Merul House Building Merul" +
                        "Merul Abdullahpur Merul Tongi Merul Gazipur Merul" +
                        "Badda Natun Bazar Badda" +
                        "Badda Nadda Badda Kuril Bishwa Road Badda Khilkhet Badda Airport Badda House Building Badda" +
                        "Badda Abdullahpur Badda Tongi Badda Gazipur Badda" +
                        "Natun Bazar Nadda Natun Bazar Kuril Bishwa Road Natun Bazar Khilkhet Natun Bazar Airport Badda House Building Natun Bazar" +
                        "Natun Bazar Abdullahpur Natun Bazar Tongi Natun Bazar Gazipur Natun Bazar" +
                        "Nadda Kuril Bishwa Road Nadda Khilkhet Nadda Airport Nadda House Building Nadda" +
                        "Nadda Abdullahpur Nadda Tongi Nadda Gazipur Nadda" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road Tongi Kuril Bishwa Road Gazipur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet Tongi Khilkhet Gazipur Khilkhet" +
                        "Airport House Building Airport" +
                        "Airport Abdullahpur Airport Tongi Airport Gazipur Airport" +
                        "House Building Abdullahpur House Building Tongi House Building Gazipur" +
                        "Abdullahpur Tongi AbdullahpurJatrabari Sayedabad Jatrabari Mugdapara Jatrabari Basabo Jatrabari" +
                        "Jatrabari Khilgaon Jatrabari Malibagh Jatrabari Rampura Jatrabari Merul Jatrabari Badda Jatrabari Natun Bazar Jatrabari" +
                        "Jatrabari Nadda Jatrabari Kuril Bishwa Road Jatrabari Khilkhet Jatrabari Airport Jatrabari House Building Jatrabari" +
                        "Jatrabari Abdullahpur Jatrabari Tongi Jatrabari Gazipur" +
                        "Sayedabad Mugdapara Sayedabad Basabo Sayedabad" +
                        "Sayedabad Khilgaon Sayedabad Malibagh Sayedabad Rampura Sayedabad Merul Sayedabad Badda Sayedabad Natun Bazar Sayedabad" +
                        "Sayedabad Nadda Sayedabad Kuril Bishwa Road Sayedabad Khilkhet Sayedabad Airport Sayedabad House Building Sayedabad" +
                        "Sayedabad Abdullahpur Sayedabad Tongi Sayedabad Gazipur" +
                        "Mugdapara Basabo Mugdapara" +
                        "Mugdapara Khilgaon Mugdapara Malibagh Mugdapara Rampura Mugdapara Merul Mugdapara Badda Mugdapara Natun Bazar Mugdapara" +
                        "Mugdapara Nadda Mugdapara Kuril Bishwa Road Mugdapara Khilkhet Mugdapara Airport Mugdapara House Building Mugdapara" +
                        "Mugdapara Abdullahpur Mugdapara Tongi Mugdapara Gazipur" +
                        "Basabo Khilgaon Basabo Malibagh Basabo Rampura Basabo Merul Basabo Badda Basabo Natun Bazar Basabo" +
                        "Basabo Nadda Basabo Kuril Bishwa Road Basabo Khilkhet Basabo Airport Basabo House Building Basabo" +
                        "Basabo Abdullahpur Basabo Tongi Basabo Gazipur" +
                        "Khilgaon Malibagh Khilgaon Rampura Khilgaon Merul Khilgaon Badda Khilgaon Natun Bazar Khilgaon" +
                        "Khilgaon Nadda Khilgaon Kuril Bishwa Road Khilgaon Khilkhet Khilgaon Airport Khilgaon House Building Khilgaon" +
                        "Khilgaon Abdullahpur Khilgaon Tongi Khilgaon Gazipur" +
                        "Malibagh Rampura Malibagh Merul Malibagh Badda Malibagh Natun Bazar Malibagh" +
                        "Malibagh Nadda Malibagh Kuril Bishwa Road Malibagh Khilkhet Malibagh Airport Malibagh House Building Malibagh" +
                        "Malibagh Abdullahpur Malibagh Tongi Malibagh Gazipur" +
                        "Rampura Merul Rampura Badda Rampura Natun Bazar Rampura" +
                        "Rampura Nadda Rampura Kuril Bishwa Road Rampura Khilkhet Rampura Airport Rampura House Building Rampura" +
                        "Rampura Abdullahpur Rampura Tongi Rampura Gazipur" +
                        "Merul Badda Merul Natun Bazar Merul" +
                        "Merul Nadda Merul Kuril Bishwa Road Merul Khilkhet Merul Airport Merul House Building Merul" +
                        "Merul Abdullahpur Merul Tongi Merul Gazipur" +
                        "Badda Natun Bazar Badda" +
                        "Badda Nadda Badda Kuril Bishwa Road Badda Khilkhet Badda Airport Badda House Building Badda" +
                        "Badda Abdullahpur Badda Tongi Badda Gazipur" +
                        "Natun Bazar Nadda Natun Bazar Kuril Bishwa Road Natun Bazar Khilkhet Natun Bazar Airport Badda House Building Natun Bazar" +
                        "Natun Bazar Abdullahpur Natun Bazar Tongi Natun Bazar Gazipur" +
                        "Nadda Kuril Bishwa Road Nadda Khilkhet Nadda Airport Nadda House Building Nadda" +
                        "Nadda Abdullahpur Nadda Tongi Nadda Gazipur" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road House Building Kuril Bishwa Road" +
                        "Kuril Bishwa Road Abdullahpur Kuril Bishwa Road Tongi Kuril Bishwa Road Gazipur" +
                        "Khilkhet Airport Khilkhet House Building Khilkhet" +
                        "Khilkhet Abdullahpur Khilkhet Tongi Khilkhet Gazipur" +
                        "Airport House Building Airport" +
                        "Airport Abdullahpur Airport Tongi Airport Gazipur Airport" +
                        "House Building Abdullahpur House Building Tongi House Building Gazipur House Building" +
                        "Abdullahpur Tongi Abdullahpur Gazipur Abdullahpur" +
                        "Tongi Gazipur Tongi"));


        buses.add(new Bus(R.drawable.logo,"Savar Paribahan",
                "Sadarghat Golap Shah Mazar Sadarghat GPO Sadarghat Press CLub Sadarghat High Court Sadarghat Shahbag Sadarghat Science Lab Sadarghat" +
                        "Sadarghat Kalabagan Sadarghat Dhanmondi 32 Sadarghat Dhanmondi 27 Sadarghat Asad Gate Sadarghat College Gate Sadarghat Shishu Mela Sadarghat" +
                        "Sadarghat Shyamoli Sadarghat Kallayanpur Sadarghat Technical Sadarghat Gabtoli Sadarghat Aminbazar Sadarghat Hemayetpur Sadarghat" +
                        "Sadarghat Savar Sadarghat Baipayl Sadarghat Zirani Bazar Sadarghat" +
                        "Sadarghat Nandan Park Sadarghat" +
                        "Golap Shah Mazar GPO Golap Shah Mazar Press CLub Golap Shah Mazar High Court Golap Shah Mazar Shahbag Golap Shah Mazar Science Lab Golap Shah Mazar" +
                        "Golap Shah Mazar Kalabagan Golap Shah Mazar Dhanmondi 32 Golap Shah Mazar Dhanmondi 27 Golap Shah Mazar Asad Gate Golap Shah Mazar College Gate Golap Shah Mazar Shishu Mela Golap Shah Mazar" +
                        "Golap Shah Mazar Shyamoli Golap Shah Mazar Kallayanpur Golap Shah Mazar Technical Golap Shah Mazar Gabtoli Golap Shah Mazar Aminbazar Golap Shah Mazar Hemayetpur Golap Shah Mazar" +
                        "Golap Shah Mazar Savar Golap Shah Mazar Baipayl Golap Shah Mazar Zirani Bazar Golap Shah Mazar" +
                        "Golap Shah Mazar Nandan Park Golap Shah Mazar" +
                        "GPO Press CLub GPO High Court GPO Shahbag GPO Science Lab GPO" +
                        "GPO Kalabagan GPO Dhanmondi 32 GPO Dhanmondi 27 GPO Asad Gate GPO College Gate GPO Shishu Mela GPO" +
                        "GPO Shyamoli GPO Kallayanpur GPO Technical GPO Gabtoli GPO Aminbazar GPO Hemayetpur GPO" +
                        "GPO Savar GPO Baipayl GPO Zirani Bazar GPO" +
                        "GPO Nandan Park GPO" +
                        "Press CLub High Court Press CLub Shahbag Press CLub Science Lab Press CLub" +
                        "Press CLub Kalabagan Press CLub Dhanmondi 32 Press CLub Dhanmondi 27 Press CLub Asad Gate Press CLub College Gate Press CLub Shishu Mela Press CLub" +
                        "Press CLub Shyamoli Press CLub Kallayanpur Press CLub Technical Press CLub Gabtoli Press CLub Aminbazar Press CLub Hemayetpur Press CLub" +
                        "Press CLub Savar Press CLub Baipayl Press CLub Zirani Bazar Press CLub" +
                        "Press CLub Nandan Park Press CLub" +
                        "High Court Shahbag High Court Science Lab High Court" +
                        "High Court Kalabagan High Court Dhanmondi 32 High Court Dhanmondi 27 High Court Asad Gate High Court College Gate High Court Shishu Mela High Court" +
                        "High Court Shyamoli High Court Kallayanpur High Court Technical High Court Gabtoli High Court Aminbazar High Court Hemayetpur High Court" +
                        "High Court Savar High Court Baipayl High Court Zirani Bazar High Court" +
                        "High Court Nandan Park High Court" +
                        "Shahbag Science Lab Shahbag" +
                        "Shahbag Kalabagan Shahbag Dhanmondi 32 Shahbag Dhanmondi 27 Shahbag Asad Gate Shahbag College Gate Shahbag Shishu Mela Shahbag" +
                        "Shahbag Shyamoli Shahbag Kallayanpur Shahbag Technical Shahbag Gabtoli Shahbag Aminbazar Shahbag Hemayetpur Shahbag" +
                        "Shahbag Savar Shahbag Baipayl Shahbag Zirani Bazar Shahbag" +
                        "Shahbag Nandan Park Shahbag" +
                        "Science Lab Kalabagan Science Lab Dhanmondi 32 Science Lab Dhanmondi 27 Science Lab Asad Gate Science Lab College Gate Science Lab Shishu Mela Science Lab" +
                        "Science Lab Shyamoli Science Lab Kallayanpur Science Lab Technical Science Lab Gabtoli Science Lab Aminbazar Science Lab Hemayetpur Science Lab" +
                        "Science Lab Savar Science Lab Baipayl Science Lab Zirani Bazar Science Lab" +
                        "Science Lab Nandan Park Science Lab" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad Gate Kalabagan College Gate Kalabagan Shishu Mela Kalabagan" +
                        "Kalabagan Shyamoli Kalabagan Kallayanpur Kalabagan Technical Kalabagan Gabtoli Kalabagan Aminbazar Kalabagan Hemayetpur Kalabagan" +
                        "Kalabagan Savar Kalabagan Baipayl Kalabagan Zirani Bazar Kalabagan" +
                        "Kalabagan Nandan Park Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad Gate Dhanmondi 32 College Gate Dhanmondi 32 Shishu Mela Dhanmondi 32" +
                        "Dhanmondi 32 Shyamoli Dhanmondi 32 Kallayanpur Dhanmondi 32 Technical Dhanmondi 32 Gabtoli Dhanmondi 32 Aminbazar Dhanmondi 32 Hemayetpur Dhanmondi 32" +
                        "Dhanmondi 32 Savar Dhanmondi 32 Baipayl Dhanmondi 32 Zirani Bazar Dhanmondi 32" +
                        "Dhanmondi 32 Nandan Park Dhanmondi 32" +
                        "Dhanmondi 27 Asad Gate Dhanmondi 27 College Gate Dhanmondi 27 Shishu Mela Dhanmondi 27" +
                        "Dhanmondi 27 Shyamoli Dhanmondi 27 Kallayanpur Dhanmondi 27 Technical Dhanmondi 27 Gabtoli Dhanmondi 27 Aminbazar Dhanmondi 27 Hemayetpur Dhanmondi 27" +
                        "Dhanmondi 27 Savar Dhanmondi 27 Baipayl Dhanmondi 27 Zirani Bazar Dhanmondi 27" +
                        "Dhanmondi 27 Nandan Park Dhanmondi 27" +
                        "Asad Gate College Gate Asad Gate Shishu Mela Asad Gate" +
                        "Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Technical Asad Gate Gabtoli Asad Gate Aminbazar Asad Gate Hemayetpur Asad Gate" +
                        "Asad Gate Savar Asad Gate Baipayl Asad Gate Zirani Bazar Asad Gate" +
                        "Asad Gate Nandan Park Asad Gate" +
                        "College Gate Shishu Mela College Gate" +
                        "College Gate Shyamoli College Gate Kallayanpur College Gate Technical College Gate Gabtoli College Gate Aminbazar College Gate Hemayetpur College Gate" +
                        "College Gate Savar College Gate Baipayl College Gate Zirani Bazar College Gate" +
                        "College Gate Nandan Park College Gate" +
                        "Shishu Mela Shyamoli Shishu Mela Kallayanpur Shishu Mela Technical Shishu Mela Gabtoli Shishu Mela Aminbazar Shishu Mela Hemayetpur Shishu Mela" +
                        "Shishu Mela Savar Shishu Mela Baipayl Shishu Mela Zirani Bazar Shishu Mela" +
                        "Shishu Mela Nandan Park Shishu Mela" +
                        "Shyamoli Kallayanpur Shyamoli Technical Shyamoli Gabtoli Shyamoli Aminbazar Shyamoli Hemayetpur Shyamoli" +
                        "Shyamoli Savar Shyamoli Baipayl Shyamoli Zirani Bazar Shyamoli" +
                        "Shyamoli Nandan Park Shyamoli" +
                        "Kallayanpur Technical Kallayanpur Gabtoli Kallayanpur Aminbazar Kallayanpur Hemayetpur Kallayanpur" +
                        "Kallayanpur Savar Kallayanpur Baipayl Kallayanpur Zirani Bazar Kallayanpur" +
                        "Kallayanpur Nandan Park Kallayanpur" +
                        "Technical Gabtoli Technical Aminbazar Technical Hemayetpur Technical" +
                        "Technical Savar Technical Baipayl Technical Zirani Bazar Technical" +
                        "Technical Nandan Park Technical" +
                        "Gabtoli Aminbazar Gabtoli Hemayetpur Gabtoli" +
                        "Gabtoli Savar Gabtoli Baipayl Gabtoli Zirani Bazar Gabtoli" +
                        "Gabtoli Nandan Park Gabtoli" +
                        "Aminbazar Hemayetpur Aminbazar" +
                        "Aminbazar Savar Aminbazar Baipayl Aminbazar Zirani Bazar Aminbazar" +
                        "Aminbazar Nandan Park Aminbazar" +
                        "Hemayetpur Savar Hemayetpur Baipayl Hemayetpur Zirani Bazar Hemayetpur" +
                        "Hemayetpur Nandan Park Hemayetpur" +
                        "Savar Baipayl Savar Zirani Bazar Savar" +
                        "Savar Nandan Park Savar" +
                        "Baipayl Zirani Bazar Baipayl" +
                        "Baipayl Nandan Park Baipayl" +
                        "Zirani Bazar Nandan Park Zirani Bazar"));



        buses.add(new Bus(R.drawable.logo,"Shadhin",
                "Bosila Mohammadpur Bosila Asad Gate Bosila Khamarbari Bosila Farmgate Bosila Kawran Bazar Bosila Bangla Motor Bosila Moghbazar Bosila" +
                        "Bosila Mouchak Bosila Malibagh Bosila Rampura Bosila Banasree Bosila Demra Bosila" +
                        "Bosila Staff Quarter Bosila" +
                        "Mohammadpur Asad Gate Mohammadpur Khamarbari Mohammadpur Farmgate Mohammadpur Kawran Bazar Mohammadpur Bangla Motor Mohammadpur Moghbazar Mohammadpur" +
                        "Mohammadpur Mouchak Mohammadpur Malibagh Mohammadpur Rampura Mohammadpur Banasree Mohammadpur Demra Mohammadpur" +
                        "Mohammadpur Staff Quarter Mohammadpur" +
                        "Asad Gate Khamarbari Asad Gate Farmgate Asad Gate Kawran Bazar Asad Gate Bangla Motor Asad Gate Moghbazar Asad Gate" +
                        "Asad Gate Mouchak Asad Gate Malibagh Asad Gate Rampura Asad Gate Banasree Asad Gate Demra Asad Gate" +
                        "Asad Gate Staff Quarter Asad Gate" +
                        "Khamarbari Farmgate Khamarbari Kawran Bazar Khamarbari Bangla Motor Khamarbari Moghbazar Khamarbari" +
                        "Khamarbari Mouchak Khamarbari Malibagh Khamarbari Rampura Khamarbari Banasree Khamarbari Demra Khamarbari" +
                        "Khamarbari Staff Quarter Khamarbari" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate Moghbazar Farmgate" +
                        "Farmgate Mouchak Farmgate Malibagh Farmgate Rampura Farmgate Banasree Farmgate Demra Farmgate" +
                        "Farmgate Staff Quarter Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar Moghbazar Kawran Bazar" +
                        "Kawran Bazar Mouchak Kawran Bazar Malibagh Kawran Bazar Rampura Kawran Bazar Banasree Kawran Bazar Demra Kawran Bazar" +
                        "Kawran Bazar Staff Quarter Kawran Bazar" +
                        "Bangla Motor Moghbazar Bangla Motor" +
                        "Bangla Motor Mouchak Bangla Motor Malibagh Bangla Motor Rampura Bangla Motor Banasree Bangla Motor Demra Bangla Motor" +
                        "Bangla Motor Staff Quarter Bangla Motor" +
                        "Moghbazar Mouchak Moghbazar Malibagh Moghbazar Rampura Moghbazar Banasree Moghbazar Demra Moghbazar" +
                        "Moghbazar Staff Quarter Moghbazar" +
                        "Mouchak Malibagh Mouchak Rampura Mouchak Banasree Mouchak Demra Mouchak" +
                        "Mouchak Staff Quarter Mouchak" +
                        "Malibagh Rampura Malibagh Banasree Malibagh Demra Malibagh" +
                        "Malibagh Staff Quarter Malibagh" +
                        "Rampura Banasree Rampura Demra Rampura" +
                        "Rampura Staff Quarter Rampura" +
                        "Banasree Demra Banasree" +
                        "Banasree Staff Quarter Banasree" +
                        "Demra Staff Quarter Demra"));


        buses.add(new Bus(R.drawable.logo,"Shadhin Express",
                "Mawa Keraniganj Mawa Babu Bazar Mawa Naya Bazar Mawa Golap Shah Mazar Mawa Paltan Mawa Press Club Mawa High Court Mawa Motsho Bhobon Mawa" +
                        "Mawa Shahbag Mawa Bangla Motor Mawa Kawran Bazar Mawa Farmgate Mawa Khamarbari Mawa" +
                        "Mawa Agargaon Mawa Taltola Mawa Shewrapara Mawa Kazipara Mawa Mirpur 10 Mawa" +
                        "Mawa Mirpur 11 Mawa Purobi Mawa Pallabi Mawa" +
                        "Mawa Mirpur 12 Mawa" +
                        "Keraniganj Babu Bazar Keraniganj Naya Bazar Keraniganj Golap Shah Mazar Keraniganj Paltan Keraniganj Press Club Keraniganj High Court Keraniganj Motsho Bhobon Keraniganj" +
                        "Keraniganj Shahbag Keraniganj Bangla Motor Keraniganj Kawran Bazar Keraniganj Farmgate Keraniganj Khamarbari Keraniganj" +
                        "Keraniganj Agargaon Keraniganj Taltola Keraniganj Shewrapara Keraniganj Kazipara Keraniganj Mirpur 10 Keraniganj" +
                        "Keraniganj Mirpur 11 Keraniganj Purobi Keraniganj Pallabi Keraniganj" +
                        "Keraniganj Mirpur 12 Keraniganj" +
                        "Babu Bazar Naya Bazar Babu Bazar Golap Shah Mazar Babu Bazar Paltan Babu Bazar Press Club Babu Bazar High Court Babu Bazar Motsho Bhobon Babu Bazar" +
                        "Babu Bazar Shahbag Babu Bazar Bangla Motor Babu Bazar Kawran Bazar Babu Bazar Farmgate Babu Bazar Khamarbari Babu Bazar" +
                        "Babu Bazar Agargaon Babu Bazar Taltola Babu Bazar Shewrapara Babu Bazar Kazipara Babu Bazar Mirpur 10 Babu Bazar" +
                        "Babu Bazar Mirpur 11 Babu Bazar Purobi Babu Bazar Pallabi Babu Bazar" +
                        "Babu Bazar Mirpur 12 Babu Bazar" +
                        "Naya Bazar Golap Shah Mazar Naya Bazar Paltan Naya Bazar Press Club Naya Bazar High Court Naya Bazar Motsho Bhobon Naya Bazar" +
                        "Naya Bazar Shahbag Naya Bazar Bangla Motor Naya Bazar Kawran Bazar Naya Bazar Farmgate Naya Bazar Khamarbari Naya Bazar" +
                        "Naya Bazar Agargaon Naya Bazar Taltola Naya Bazar Shewrapara Naya Bazar Kazipara Naya Bazar Mirpur 10 Naya Bazar" +
                        "Naya Bazar Mirpur 11 Naya Bazar Purobi Naya Bazar Pallabi Naya Bazar" +
                        "Naya Bazar Mirpur 12 Naya Bazar" +
                        "Golap Shah Mazar GPO Golap Shah Mazar Paltan Golap Shah Mazar Press Club Golap Shah Mazar High Court Golap Shah Mazar Motsho Bhobon Golap Shah Mazar" +
                        "Golap Shah Mazar Shahbag Golap Shah Mazar Bangla Motor Golap Shah Mazar Kawran Bazar Golap Shah Mazar Farmgate Golap Shah Mazar Khamarbari Golap Shah Mazar" +
                        "Golap Shah Mazar Agargaon Golap Shah Mazar Taltola Golap Shah Mazar Shewrapara Golap Shah Mazar Kazipara Golap Shah Mazar Mirpur 10 Golap Shah Mazar" +
                        "Golap Shah Mazar Mirpur 11 Golap Shah Mazar Purobi Golap Shah Mazar Pallabi Golap Shah Mazar" +
                        "Golap Shah Mazar Mirpur 12 Golap Shah Mazar" +
                        "GPO Paltan GPO Press Club GPO High Court GPO Motsho Bhobon GPO" +
                        "GPO Shahbag GPO Bangla Motor GPO Kawran Bazar GPO Farmgate GPO Khamarbari GPO" +
                        "GPO Agargaon GPO Taltola GPO Shewrapara GPO Kazipara GPO Mirpur 10 GPO" +
                        "GPO Mirpur 11 GPO Purobi GPO Pallabi GPO" +
                        "GPO Mirpur 12 GPO" +
                        "Paltan Press Club Paltan High Court Paltan Motsho Bhobon Paltan" +
                        "Paltan Shahbag Paltan Bangla Motor Paltan Kawran Bazar Paltan Farmgate Paltan Khamarbari Paltan" +
                        "Paltan Agargaon Paltan Taltola Paltan Shewrapara Paltan Kazipara Paltan Mirpur 10 Paltan" +
                        "Paltan Mirpur 11 Paltan Purobi Paltan Pallabi Paltan" +
                        "Paltan Mirpur 12 Paltan" +
                        "Press Club High Court Press Club Motsho Bhobon Press Club" +
                        "Press Club Shahbag Press Club Bangla Motor Press Club Kawran Bazar Press Club Farmgate Press Club Khamarbari Press Club" +
                        "Press Club Agargaon Press Club Taltola Press Club Shewrapara Press Club Kazipara Press Club Mirpur 10 Press Club" +
                        "Press Club Mirpur 11 Press Club Purobi Press Club Pallabi Press Club" +
                        "Press Club Mirpur 12 Press Club" +
                        "High Court Motsho Bhobon High Court" +
                        "High Court Shahbag High Court Bangla Motor High Court Kawran Bazar High Court Farmgate High Court Khamarbari High Court" +
                        "High Court Agargaon High Court Taltola High Court Shewrapara High Court Kazipara High Court Mirpur 10 High Court" +
                        "High Court Mirpur 11 High Court Purobi High Court Pallabi High Court" +
                        "High Court Mirpur 12 High Court" +
                        "Motsho Bhobon Shahbag Motsho Bhobon Bangla Motor Motsho Bhobon Kawran Bazar Motsho Bhobon Farmgate Motsho Bhobon Khamarbari Motsho Bhobon" +
                        "Motsho Bhobon Agargaon Motsho Bhobon Taltola Motsho Bhobon Shewrapara Motsho Bhobon Kazipara Motsho Bhobon Mirpur 10 Motsho Bhobon" +
                        "Motsho Bhobon Mirpur 11 Motsho Bhobon Purobi Motsho Bhobon Pallabi Motsho Bhobon" +
                        "Motsho Bhobon Mirpur 12 Motsho Bhobon" +
                        "Shahbag Bangla Motor Shahbag Kawran Bazar Shahbag Farmgate Shahbag Khamarbari Shahbag" +
                        "Shahbag Agargaon Shahbag Taltola Shahbag Shewrapara Shahbag Kazipara Shahbag Mirpur 10 Shahbag" +
                        "Shahbag Mirpur 11 Shahbag Purobi Shahbag Pallabi Shahbag" +
                        "Shahbag Mirpur 12 Shahbag" +
                        "Bangla Motor Kawran Bazar Bangla Motor Farmgate Bangla Motor Khamarbari Bangla Motor" +
                        "Bangla Motor Agargaon Bangla Motor Taltola Bangla Motor Shewrapara Bangla Motor Kazipara Bangla Motor Mirpur 10 Bangla Motor" +
                        "Bangla Motor Mirpur 11 Bangla Motor Purobi Bangla Motor Pallabi Bangla Motor" +
                        "Bangla Motor Mirpur 12 Bangla Motor" +
                        "Kawran Bazar Farmgate Kawran Bazar Khamarbari Kawran Bazar" +
                        "Kawran Bazar Agargaon Kawran Bazar Taltola Kawran Bazar Shewrapara Kawran Bazar Kazipara Kawran Bazar Mirpur 10 Kawran Bazar" +
                        "Kawran Bazar Mirpur 11 Kawran Bazar Purobi Kawran Bazar Pallabi Kawran Bazar" +
                        "Kawran Bazar Mirpur 12 Kawran Bazar" +
                        "Farmgate Khamarbari Farmgate" +
                        "Farmgate Agargaon Farmgate Taltola Farmgate Shewrapara Farmgate Kazipara Farmgate Mirpur 10 Farmgate" +
                        "Farmgate Mirpur 11 Farmgate Purobi Farmgate Pallabi Farmgate" +
                        "Farmgate Mirpur 12 Farmgate" +
                        "Khamarbari Agargaon Khamarbari Taltola Khamarbari Shewrapara Khamarbari Kazipara Khamarbari Mirpur 10 Khamarbari" +
                        "Khamarbari Mirpur 11 Khamarbari Purobi Khamarbari Pallabi Khamarbari" +
                        "Khamarbari Mirpur 12 Khamarbari" +
                        "Agargaon Taltola Agargaon Shewrapara Agargaon Kazipara Agargaon Mirpur 10 Agargaon" +
                        "Agargaon Mirpur 11 Agargaon Purobi Agargaon Pallabi Agargaon" +
                        "Agargaon Mirpur 12 Agargaon" +
                        "Taltola Shewrapara Taltola Kazipara Taltola Mirpur 10 Taltola" +
                        "Taltola Mirpur 11 Taltola Purobi Taltola Pallabi Taltola" +
                        "Taltola Mirpur 12 Taltola" +
                        "Shewrapara Kazipara Shewrapara Mirpur 10 Shewrapara" +
                        "Shewrapara Mirpur 11 Shewrapara Purobi Shewrapara Pallabi Shewrapara" +
                        "Shewrapara Mirpur 12 Shewrapara" +
                        "Kazipara Mirpur 10 Kazipara" +
                        "Kazipara Mirpur 11 Kazipara Purobi Kazipara Pallabi Kazipara" +
                        "Kazipara Mirpur 12 Kazipara" +
                        "Mirpur 10 Mirpur 11 Mirpur 10 Purobi Mirpur 10 Pallabi Mirpur 10" +
                        "Mirpur 10 Mirpur 12 Mirpur 10" +
                        "Mirpur 11 Purobi Mirpur 11 Pallabi Mirpur 11" +
                        "Mirpur 11 Mirpur 12 Mirpur 11" +
                        "Purobi Pallabi Purobi" +
                        "Purobi Mirpur 12 Purobi" +
                        "Pallabi Mirpur 12 Pallabi"));



        buses.add(new Bus(R.drawable.logo,"Shahria Enterprise",
                "Gabtoli Technical Gabtoli Kallayanpur Gabtoli Shyamoli Gabtoli Shishu Mela Gabtoli College Gate Gabtoli Asad Gate Gabtoli" +
                        "Gabtoli Dhanmondi 27 Gabtoli Dhanmondi 32 Gabtoli Kalabagan Gabtoli Science Lab Gabtoli Katabon Gabtoli Shahbag Gabtoli" +
                        "Gabtoli Motsho Bhobon Gabtoli Kakrail Gabtoli Fakirapul Gabtoli Arambag Gabtoli Motijheel Gabtoli Ittefaq Gabtoli Tikatuli Gabtoli" +
                        "Gabtoli Dayaganj Gabtoli Gandaria Gabtoli Jurain Gabtoli" +
                        "Gabtoli Postogola Gabtoli" +
                        "Technical Kallayanpur Technical Shyamoli Technical Shishu Mela Technical College Gate Technical Asad Gate Technical" +
                        "Technical Dhanmondi 27 Technical Dhanmondi 32 Technical Kalabagan Technical Science Lab Technical Katabon Technical Shahbag Technical" +
                        "Technical Motsho Bhobon Technical Kakrail Technical Fakirapul Technical Arambag Technical Motijheel Technical Ittefaq Technical Tikatuli Technical" +
                        "Technical Dayaganj Technical Gandaria Technical Jurain Technical" +
                        "Technical Postogola Technical" +
                        "Kallayanpur Shyamoli Kallayanpur Shishu Mela Kallayanpur College Gate Kallayanpur Asad Gate Kallayanpur" +
                        "Kallayanpur Dhanmondi 27 Kallayanpur Dhanmondi 32 Kallayanpur Kalabagan Kallayanpur Science Lab Kallayanpur Katabon Kallayanpur Shahbag Kallayanpur" +
                        "Kallayanpur Motsho Bhobon Kallayanpur Kakrail Kallayanpur Fakirapul Kallayanpur Arambag Kallayanpur Motijheel Kallayanpur Ittefaq Kallayanpur Tikatuli Kallayanpur" +
                        "Kallayanpur Dayaganj Kallayanpur Gandaria Kallayanpur Jurain Kallayanpur" +
                        "Kallayanpur Postogola Kallayanpur" +
                        "Shyamoli Shishu Mela Shyamoli College Gate Shyamoli Asad Gate Shyamoli" +
                        "Shyamoli Dhanmondi 27 Shyamoli Dhanmondi 32 Shyamoli Kalabagan Shyamoli Science Lab Shyamoli Katabon Shyamoli Shahbag Shyamoli" +
                        "Shyamoli Motsho Bhobon Shyamoli Kakrail Shyamoli Fakirapul Shyamoli Arambag Shyamoli Motijheel Shyamoli Ittefaq Shyamoli Tikatuli Shyamoli" +
                        "Shyamoli Dayaganj Shyamoli Gandaria Shyamoli Jurain Shyamoli" +
                        "Shyamoli Postogola Shyamoli" +
                        "Shishu Mela College Gate Shishu Mela Asad Gate Shishu Mela" +
                        "Shishu Mela Dhanmondi 27 Shishu Mela Dhanmondi 32 Shishu Mela Kalabagan Shishu Mela Science Lab Shishu Mela Katabon Shishu Mela Shahbag Shishu Mela" +
                        "Shishu Mela Motsho Bhobon Shishu Mela Kakrail Shishu Mela Fakirapul Shishu Mela Arambag Shishu Mela Motijheel Shishu Mela Ittefaq Shishu Mela Tikatuli Shishu Mela" +
                        "Shishu Mela Dayaganj Shishu Mela Gandaria Shishu Mela Jurain Shishu Mela" +
                        "Shishu Mela Postogola Shishu Mela" +
                        "College Gate Asad Gate College Gate" +
                        "College Gate Dhanmondi 27 College Gate Dhanmondi 32 College Gate Kalabagan College Gate Science Lab College Gate Katabon College Gate Shahbag College Gate" +
                        "College Gate Motsho Bhobon College Gate Kakrail College Gate Fakirapul College Gate Arambag College Gate Motijheel College Gate Ittefaq College Gate Tikatuli College Gate" +
                        "College Gate Dayaganj College Gate Gandaria College Gate Jurain College Gate" +
                        "College Gate Postogola College Gate" +
                        "Asad Gate Dhanmondi 27 Asad Gate Dhanmondi 32 Asad Gate Kalabagan Asad Gate Science Lab Asad Gate Katabon Asad Gate Shahbag Asad Gate" +
                        "Asad Gate Motsho Bhobon Asad Gate Kakrail Asad Gate Fakirapul Asad Gate Arambag Asad Gate Motijheel Asad Gate Ittefaq Asad Gate Tikatuli Asad Gate" +
                        "Asad Gate Dayaganj Asad Gate Gandaria Asad Gate Jurain Asad Gate" +
                        "Asad Gate Postogola Asad Gate" +
                        "Dhanmondi 27 Dhanmondi 32 Dhanmondi 27 Kalabagan Dhanmondi 27 Science Lab Dhanmondi 27 Katabon Dhanmondi 27 Shahbag Dhanmondi 27" +
                        "Dhanmondi 27 Motsho Bhobon Dhanmondi 27 Kakrail Dhanmondi 27 Fakirapul Dhanmondi 27 Arambag Dhanmondi 27 Motijheel Dhanmondi 27 Ittefaq Dhanmondi 27 Tikatuli Dhanmondi 27" +
                        "Dhanmondi 27 Dayaganj Dhanmondi 27 Gandaria Dhanmondi 27 Jurain Dhanmondi 27" +
                        "Dhanmondi 27 Postogola Dhanmondi 27" +
                        "Dhanmondi 32 Kalabagan Dhanmondi 32 Science Lab Dhanmondi 32 Katabon Dhanmondi 32 Shahbag Dhanmondi 32" +
                        "Dhanmondi 32 Motsho Bhobon Dhanmondi 32 Kakrail Dhanmondi 32 Fakirapul Dhanmondi 32 Arambag Dhanmondi 32 Motijheel Dhanmondi 32 Ittefaq Dhanmondi 32 Tikatuli Dhanmondi 32" +
                        "Dhanmondi 32 Dayaganj Dhanmondi 32 Gandaria Dhanmondi 32 Jurain Dhanmondi 32" +
                        "Dhanmondi 32 Postogola Dhanmondi 32" +
                        "Kalabagan Science Lab Kalabagan Katabon Kalabagan Shahbag Kalabagan" +
                        "Kalabagan Motsho Bhobon Kalabagan Kakrail Kalabagan Fakirapul Kalabagan Arambag Kalabagan Motijheel Kalabagan Ittefaq Kalabagan Tikatuli Kalabagan" +
                        "Kalabagan Dayaganj Kalabagan Gandaria Kalabagan Jurain Kalabagan" +
                        "Kalabagan Postogola Kalabagan" +
                        "Science Lab Katabon Science Lab Shahbag Science Lab" +
                        "Science Lab Motsho Bhobon Science Lab Kakrail Science Lab Fakirapul Science Lab Arambag Science Lab Motijheel Science Lab Ittefaq Science Lab Tikatuli Science Lab" +
                        "Science Lab Dayaganj Science Lab Gandaria Science Lab Jurain Science Lab" +
                        "Science Lab Postogola Science Lab" +
                        "Katabon Shahbag Katabon" +
                        "Katabon Motsho Bhobon Katabon Kakrail Katabon Fakirapul Katabon Arambag Katabon Motijheel Katabon Ittefaq Katabon Tikatuli Katabon" +
                        "Katabon Dayaganj Katabon Gandaria Katabon Jurain Katabon" +
                        "Katabon Postogola Katabon" +
                        "Shahbag Motsho Bhobon Shahbag Kakrail Shahbag Fakirapul Shahbag Arambag Shahbag Motijheel Shahbag Ittefaq Shahbag Tikatuli Shahbag" +
                        "Shahbag Dayaganj Shahbag Gandaria Shahbag Jurain Shahbag" +
                        "Shahbag Postogola Shahbag" +
                        "Motsho Bhobon Kakrail Motsho Bhobon Fakirapul Motsho Bhobon Arambag Motsho Bhobon Motijheel Motsho Bhobon Ittefaq Motsho Bhobon Tikatuli Motsho Bhobon" +
                        "Motsho Bhobon Dayaganj Motsho Bhobon Gandaria Motsho Bhobon Jurain Motsho Bhobon" +
                        "Motsho Bhobon Postogola Motsho Bhobon" +
                        "Kakrail Fakirapul Kakrail Arambag Kakrail Motijheel Kakrail Ittefaq Kakrail Tikatuli Kakrail" +
                        "Kakrail Dayaganj Kakrail Gandaria Kakrail Jurain Kakrail" +
                        "Kakrail Postogola Kakrail" +
                        "Fakirapul Arambag Fakirapul Motijheel Fakirapul Ittefaq Fakirapul Tikatuli Fakirapul" +
                        "Fakirapul Dayaganj Fakirapul Gandaria Fakirapul Jurain Fakirapul" +
                        "Fakirapul Postogola Fakirapul" +
                        "Arambag Motijheel Arambag Ittefaq Arambag Tikatuli Arambag" +
                        "Arambag Dayaganj Arambag Gandaria Arambag Jurain Arambag" +
                        "Arambag Postogola Arambag" +
                        "Motijheel Ittefaq Motijheel Tikatuli Motijheel" +
                        "Motijheel Dayaganj Motijheel Gandaria Motijheel Jurain Motijheel" +
                        "Motijheel Postogola Motijheel" +
                        "Ittefaq Tikatuli Ittefaq" +
                        "Ittefaq Dayaganj Ittefaq Gandaria Ittefaq Jurain Ittefaq" +
                        "Ittefaq Postogola Ittefaq" +
                        "Tikatuli Dayaganj Tikatuli Gandaria Tikatuli Jurain Tikatuli" +
                        "Tikatuli Postogola Tikatuli" +
                        "Dayaganj Gandaria Dayaganj Jurain Dayaganj" +
                        "Dayaganj Postogola Dayaganj" +
                        "Gandaria Jurain Gandaria" +
                        "Gandaria Postogola Gandaria" +
                        "Jurain Postogola Jurain"));


        buses.add(new Bus(R.drawable.logo,"Shatabdi Transport",
                "Motijheel Paltan Motijheel Kakrail Motijheel Shantinagar Motijheel Malibagh Mor Motijheel Mouchak Motijheel Moghbazar Motijheel" +
                        "Motijheel Nabisco Motijheel Mohakhali Motijheel Banani Motijheel Kakoli Motijheel MES Motijheel Shewra Motijheel Kuril Bishwa Road Motijheel" +
                        "Motijheel Khilkhet Motijheel Airport Motijheel Jasimuddin Motijheel Rajlakshmi Motijheel Azampur Motijheel House Building Motijheel Abdullahpur Motijheel" +
                        "Motijheel Kamarpara Motijheel" +
                        "Paltan Kakrail Paltan Shantinagar Paltan Malibagh Mor Paltan Mouchak Paltan Moghbazar Paltan" +
                        "Paltan Nabisco Paltan Mohakhali Paltan Banani Paltan Kakoli Paltan MES Paltan Shewra Paltan Kuril Bishwa Road Paltan" +
                        "Paltan Khilkhet Paltan Airport Paltan Jasimuddin Paltan Rajlakshmi Paltan Azampur Paltan House Building Paltan Abdullahpur Paltan" +
                        "Paltan Kamarpara Paltan" +
                        "Kakrail Shantinagar Kakrail Malibagh Mor Kakrail Mouchak Kakrail Moghbazar Kakrail" +
                        "Kakrail Nabisco Kakrail Mohakhali Kakrail Banani Kakrail Kakoli Kakrail MES Kakrail Shewra Kakrail Kuril Bishwa Road Kakrail" +
                        "Kakrail Khilkhet Kakrail Airport Kakrail Jasimuddin Kakrail Rajlakshmi Kakrail Azampur Kakrail House Building Kakrail Abdullahpur Kakrail" +
                        "Kakrail Kamarpara Kakrail" +
                        "Shantinagar Malibagh Mor Shantinagar Mouchak Shantinagar Moghbazar Shantinagar" +
                        "Shantinagar Nabisco Shantinagar Mohakhali Shantinagar Banani Shantinagar Kakoli Shantinagar MES Shantinagar Shewra Shantinagar Kuril Bishwa Road Shantinagar" +
                        "Shantinagar Khilkhet Shantinagar Airport Shantinagar Jasimuddin Shantinagar Rajlakshmi Shantinagar Azampur Shantinagar House Building Shantinagar Abdullahpur Shantinagar" +
                        "Shantinagar Kamarpara Shantinagar" +
                        "Malibagh Mor Mouchak Malibagh Mor Moghbazar Malibagh Mor" +
                        "Malibagh Mor Nabisco Malibagh Mor Mohakhali Malibagh Mor Banani Malibagh Mor Kakoli Malibagh Mor MES Malibagh Mor Shewra Malibagh Mor Kuril Bishwa Road Malibagh Mor" +
                        "Malibagh Mor Khilkhet Malibagh Mor Airport Malibagh Mor Jasimuddin Malibagh Mor Rajlakshmi Malibagh Mor Azampur Malibagh Mor House Building Malibagh Mor Abdullahpur Malibagh Mor" +
                        "Malibagh Mor Kamarpara Malibagh Mor" +
                        "Mouchak Moghbazar Mouchak" +
                        "Mouchak Nabisco Mouchak Mohakhali Mouchak Banani Mouchak Kakoli Mouchak MES Mouchak Shewra Mouchak Kuril Bishwa Road Mouchak" +
                        "Mouchak Khilkhet Mouchak Airport Mouchak Jasimuddin Mouchak Rajlakshmi Mouchak Azampur Mouchak House Building Mouchak Abdullahpur Mouchak" +
                        "Mouchak Kamarpara Mouchak" +
                        "Moghbazar Nabisco Moghbazar Mohakhali Moghbazar Banani Moghbazar Kakoli Moghbazar MES Moghbazar Shewra Moghbazar Kuril Bishwa Road Moghbazar" +
                        "Moghbazar Khilkhet Moghbazar Airport Moghbazar Jasimuddin Moghbazar Rajlakshmi Moghbazar Azampur Moghbazar House Building Moghbazar Abdullahpur Moghbazar" +
                        "Moghbazar Kamarpara Moghbazar" +
                        "Nabisco Mohakhali Nabisco Banani Nabisco Kakoli Nabisco MES Nabisco Shewra Nabisco Kuril Bishwa Road Nabisco" +
                        "Nabisco Khilkhet Nabisco Airport Nabisco Jasimuddin Nabisco Rajlakshmi Nabisco Azampur Nabisco House Building Nabisco Abdullahpur Nabisco" +
                        "Nabisco Kamarpara Nabisco" +
                        "Mohakhali Banani Mohakhali Kakoli Mohakhali MES Mohakhali Shewra Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Mohakhali Khilkhet Mohakhali Airport Mohakhali Jasimuddin Mohakhali Rajlakshmi Mohakhali Azampur Mohakhali House Building Mohakhali Abdullahpur Mohakhali" +
                        "Mohakhali Kamarpara Mohakhali" +
                        "Banani Kakoli Banani MES Banani Shewra Banani Kuril Bishwa Road Banani" +
                        "Banani Khilkhet Banani Airport Banani Jasimuddin Banani Rajlakshmi Banani Azampur Banani House Building Banani Abdullahpur Banani" +
                        "Banani Kamarpara Banani" +
                        "Kakoli MES Kakoli Shewra Kakoli Kuril Bishwa Road Kakoli" +
                        "Kakoli Khilkhet Kakoli Airport Kakoli Jasimuddin Kakoli Rajlakshmi Kakoli Azampur Kakoli House Building Kakoli Abdullahpur Kakoli" +
                        "Kakoli Kamarpara Kakoli" +
                        "MES Shewra MES Kuril Bishwa Road MES" +
                        "MES Khilkhet MES Airport MES Jasimuddin MES Rajlakshmi MES Azampur MES House Building MES Abdullahpur MES" +
                        "MES Kamarpara MES" +
                        "Shewra Kuril Bishwa Road Shewra" +
                        "Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra Rajlakshmi Shewra Azampur Shewra House Building Shewra Abdullahpur Shewra" +
                        "Shewra Kamarpara Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Kuril Bishwa Road Kamarpara Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet Rajlakshmi Khilkhet Azampur Khilkhet House Building Khilkhet Abdullahpur Khilkhet" +
                        "Khilkhet Kamarpara Khilkhet" +
                        "Airport Jasimuddin Airport Rajlakshmi Airport Azampur Airport House Building Airport Abdullahpur Airport" +
                        "Airport Kamarpara Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin Azampur Jasimuddin House Building Jasimuddin Abdullahpur Jasimuddin" +
                        "Jasimuddin Kamarpara Jasimuddin" +
                        "Rajlakshmi Azampur Rajlakshmi House Building Rajlakshmi Abdullahpur Rajlakshmi" +
                        "Rajlakshmi Kamarpara Rajlakshmi" +
                        "Azampur House Building Azampur Abdullahpur Azampur" +
                        "Kamarpara" +
                        "House Building Abdullahpur House Building" +
                        "House Building Kamarpara House Building"));



        buses.add(new Bus(R.drawable.logo,"Shikhar Paribahan",
                "Mirpur 12 Pallabi Mirpur 12 Purobi Mirpur 12 Mirpur 11 Mirpur 12 Mirpur 10 Mirpur 12 Kazipara Mirpur 12 Shewrapara Mirpur 12" +
                        "Mirpur 12 Taltola Mirpur 12 Agargaon Mirpur 12 Bijoy Sarani Mirpur 12 Farmgate Mirpur 12 Kawran Bazar Mirpur 12 Bangla Motor Mirpur 12" +
                        "Mirpur 12 Shahbag Mirpur 12 Motsho Bhobon Mirpur 12 High Court Mirpur 12 Press Club Mirpur 12 Paltan Mirpur 12 Gulisthan Mirpur 12" +
                        "Mirpur 12 Jatrabari Mirpur 12" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Bijoy Sarani Pallabi Farmgate Pallabi Kawran Bazar Pallabi Bangla Motor Pallabi" +
                        "Pallabi Shahbag Pallabi Motsho Bhobon Pallabi High Court Pallabi Press Club Pallabi Paltan Pallabi Gulisthan Pallabi" +
                        "Pallabi Jatrabari Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Bijoy Sarani Purobi Farmgate Purobi Kawran Bazar Purobi Bangla Motor Purobi" +
                        "Purobi Shahbag Purobi Motsho Bhobon Purobi High Court Purobi Press Club Purobi Paltan Purobi Gulisthan Purobi" +
                        "Purobi Jatrabari Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Bijoy Sarani Mirpur 11 Farmgate Mirpur 11 Kawran Bazar Mirpur 11 Bangla Motor Mirpur 11" +
                        "Mirpur 11 Shahbag Mirpur 11 Motsho Bhobon Mirpur 11 High Court Mirpur 11 Press Club Mirpur 11 Paltan Mirpur 11 Gulisthan Mirpur 11" +
                        "Mirpur 11 Jatrabari Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Bijoy Sarani Mirpur 10 Farmgate Mirpur 10 Kawran Bazar Mirpur 10 Bangla Motor Mirpur 10" +
                        "Mirpur 10 Shahbag Mirpur 10 Motsho Bhobon Mirpur 10 High Court Mirpur 10 Press Club Mirpur 10 Paltan Mirpur 10 Gulisthan Mirpur 10" +
                        "Mirpur 10 Jatrabari Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Bijoy Sarani Kazipara Farmgate Kazipara Kawran Bazar Kazipara Bangla Motor Kazipara" +
                        "Kazipara Shahbag Kazipara Motsho Bhobon Kazipara High Court Kazipara Press Club Kazipara Paltan Kazipara Gulisthan Kazipara" +
                        "Kazipara Jatrabari Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Bijoy Sarani Shewrapara Farmgate Shewrapara Kawran Bazar Shewrapara Bangla Motor Shewrapara" +
                        "Shewrapara Shahbag Shewrapara Motsho Bhobon Shewrapara High Court Shewrapara Press Club Shewrapara Paltan Shewrapara Gulisthan Shewrapara" +
                        "Shewrapara Jatrabari Shewrapara" +
                        "Taltola Agargaon Taltola Bijoy Sarani Taltola Farmgate Taltola Kawran Bazar Taltola Bangla Motor Taltola" +
                        "Taltola Shahbag Taltola Motsho Bhobon Taltola High Court Taltola Press Club Taltola Paltan Taltola Gulisthan Taltola" +
                        "Taltola Jatrabari Taltola" +
                        "Agargaon Bijoy Sarani Agargaon Farmgate Agargaon Kawran Bazar Agargaon Bangla Motor Agargaon" +
                        "Agargaon Shahbag Agargaon Motsho Bhobon Agargaon High Court Agargaon Press Club Agargaon Paltan Agargaon Gulisthan Agargaon" +
                        "Agargaon Jatrabari Agargaon" +
                        "Bijoy Sarani Farmgate Bijoy Sarani Kawran Bazar Bijoy Sarani Bangla Motor Bijoy Sarani" +
                        "Bijoy Sarani Shahbag Bijoy Sarani Motsho Bhobon Bijoy Sarani High Court Bijoy Sarani Press Club Bijoy Sarani Paltan Bijoy Sarani Gulisthan Bijoy Sarani" +
                        "Bijoy Sarani Jatrabari Bijoy Sarani" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate" +
                        "Farmgate Shahbag Farmgate Motsho Bhobon Farmgate High Court Farmgate Press Club Farmgate Paltan Farmgate Gulisthan Farmgate" +
                        "Farmgate Jatrabari Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar" +
                        "Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar High Court Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar Gulisthan Kawran Bazar" +
                        "Kawran Bazar Jatrabari Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor High Court Bangla Motor Press Club Bangla Motor Paltan Bangla Motor Gulisthan Bangla Motor" +
                        "Bangla Motor Jatrabari Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag Gulisthan Shahbag" +
                        "Shahbag Jatrabari Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon Paltan Motsho Bhobon Gulisthan Motsho Bhobon" +
                        "Motsho Bhobon Jatrabari Motsho Bhobon" +
                        "High Court Press Club High Court Paltan High Court Gulisthan High Court" +
                        "High Court Jatrabari High Court" +
                        "Press Club Paltan Press Club Gulisthan Press Club" +
                        "Press Club Jatrabari Press Club" +
                        "Paltan Gulisthan Paltan" +
                        "Paltan Jatrabari Paltan" +
                        "Gulisthan Jatrabari Gulisthan"));


        buses.add(new Bus(R.drawable.logo,"Shikor Paribahan",
                "Mirpur 12 Pallabi Mirpur 12 Purobi Mirpur 12 Mirpur 11 Mirpur 12 Mirpur 10 Mirpur 12 Kazipara Mirpur 12 Shewrapara Mirpur 12" +
                        "Mirpur 12 Taltola Mirpur 12 Agargaon Mirpur 12 Bijoy Sarani Mirpur 12 Farmgate Mirpur 12 Kawran Bazar Mirpur 12 Bangla Motor Mirpur 12" +
                        "Mirpur 12 Shahbag Mirpur 12 Motsho Bhobon Mirpur 12 High Court Mirpur 12 Press Club Mirpur 12 Paltan Mirpur 12 Gulisthan Mirpur 12" +
                        "Mirpur 12 Sayedabad Mirpur 12 Jatrabari Mirpur 12" +
                        "Pallabi Purobi Pallabi Mirpur 11 Pallabi Mirpur 10 Pallabi Kazipara Pallabi Shewrapara Pallabi" +
                        "Pallabi Taltola Pallabi Agargaon Pallabi Bijoy Sarani Pallabi Farmgate Pallabi Kawran Bazar Pallabi Bangla Motor Pallabi" +
                        "Pallabi Shahbag Pallabi Motsho Bhobon Pallabi High Court Pallabi Press Club Pallabi Paltan Pallabi Gulisthan Pallabi" +
                        "Pallabi Sayedabad Pallabi Jatrabari Pallabi" +
                        "Purobi Mirpur 11 Purobi Mirpur 10 Purobi Kazipara Purobi Shewrapara Purobi" +
                        "Purobi Taltola Purobi Agargaon Purobi Bijoy Sarani Purobi Farmgate Purobi Kawran Bazar Purobi Bangla Motor Purobi" +
                        "Purobi Shahbag Purobi Motsho Bhobon Purobi High Court Purobi Press Club Purobi Paltan Purobi Gulisthan Purobi" +
                        "Purobi Sayedabad Purobi Jatrabari Purobi" +
                        "Mirpur 11 Mirpur 10 Mirpur 11 Kazipara Mirpur 11 Shewrapara Mirpur 11" +
                        "Mirpur 11 Taltola Mirpur 11 Agargaon Mirpur 11 Bijoy Sarani Mirpur 11 Farmgate Mirpur 11 Kawran Bazar Mirpur 11 Bangla Motor Mirpur 11" +
                        "Mirpur 11 Shahbag Mirpur 11 Motsho Bhobon Mirpur 11 High Court Mirpur 11 Press Club Mirpur 11 Paltan Mirpur 11 Gulisthan Mirpur 11" +
                        "Mirpur 11 Sayedabad Mirpur 11 Jatrabari Mirpur 11" +
                        "Mirpur 10 Kazipara Mirpur 10 Shewrapara Mirpur 10" +
                        "Mirpur 10 Taltola Mirpur 10 Agargaon Mirpur 10 Bijoy Sarani Mirpur 10 Farmgate Mirpur 10 Kawran Bazar Mirpur 10 Bangla Motor Mirpur 10" +
                        "Mirpur 10 Shahbag Mirpur 10 Motsho Bhobon Mirpur 10 High Court Mirpur 10 Press Club Mirpur 10 Paltan Mirpur 10 Gulisthan Mirpur 10" +
                        "Mirpur 10 Sayedabad Mirpur 10 Jatrabari Mirpur 10" +
                        "Kazipara Shewrapara Kazipara" +
                        "Kazipara Taltola Kazipara Agargaon Kazipara Bijoy Sarani Kazipara Farmgate Kazipara Kawran Bazar Kazipara Bangla Motor Kazipara" +
                        "Kazipara Shahbag Kazipara Motsho Bhobon Kazipara High Court Kazipara Press Club Kazipara Paltan Kazipara Gulisthan Kazipara" +
                        "Kazipara Sayedabad Kazipara Jatrabari Kazipara" +
                        "Shewrapara Taltola Shewrapara Agargaon Shewrapara Bijoy Sarani Shewrapara Farmgate Shewrapara Kawran Bazar Shewrapara Bangla Motor Shewrapara" +
                        "Shewrapara Shahbag Shewrapara Motsho Bhobon Shewrapara High Court Shewrapara Press Club Shewrapara Paltan Shewrapara Gulisthan Shewrapara" +
                        "Shewrapara Sayedabad Shewrapara Jatrabari Shewrapara" +
                        "Taltola Agargaon Taltola Bijoy Sarani Taltola Farmgate Taltola Kawran Bazar Taltola Bangla Motor Taltola" +
                        "Taltola Shahbag Taltola Motsho Bhobon Taltola High Court Taltola Press Club Taltola Paltan Taltola Gulisthan Taltola" +
                        "Taltola Sayedabad Taltola Jatrabari Taltola" +
                        "Agargaon Bijoy Sarani Agargaon Farmgate Agargaon Kawran Bazar Agargaon Bangla Motor Agargaon" +
                        "Agargaon Shahbag Agargaon Motsho Bhobon Agargaon High Court Agargaon Press Club Agargaon Paltan Agargaon Gulisthan Agargaon" +
                        "Agargaon Sayedabad Agargaon Jatrabari Agargaon" +
                        "Bijoy Sarani Farmgate Bijoy Sarani Kawran Bazar Bijoy Sarani Bangla Motor Bijoy Sarani" +
                        "Bijoy Sarani Shahbag Bijoy Sarani Motsho Bhobon Bijoy Sarani High Court Bijoy Sarani Press Club Bijoy Sarani Paltan Bijoy Sarani Gulisthan Bijoy Sarani" +
                        "Bijoy Sarani Sayedabad Bijoy Sarani Jatrabari Bijoy Sarani" +
                        "Farmgate Kawran Bazar Farmgate Bangla Motor Farmgate" +
                        "Farmgate Shahbag Farmgate Motsho Bhobon Farmgate High Court Farmgate Press Club Farmgate Paltan Farmgate Gulisthan Farmgate" +
                        "Farmgate Sayedabad Farmgate Jatrabari Farmgate" +
                        "Kawran Bazar Bangla Motor Kawran Bazar" +
                        "Kawran Bazar Shahbag Kawran Bazar Motsho Bhobon Kawran Bazar High Court Kawran Bazar Press Club Kawran Bazar Paltan Kawran Bazar Gulisthan Kawran Bazar" +
                        "Kawran Bazar Sayedabad Kawran Bazar Jatrabari Kawran Bazar" +
                        "Bangla Motor Shahbag Bangla Motor Motsho Bhobon Bangla Motor High Court Bangla Motor Press Club Bangla Motor Paltan Bangla Motor Gulisthan Bangla Motor" +
                        "Bangla Motor Sayedabad Bangla Motor Jatrabari Bangla Motor" +
                        "Shahbag Motsho Bhobon Shahbag High Court Shahbag Press Club Shahbag Paltan Shahbag Gulisthan Shahbag" +
                        "Shahbag Sayedabad Shahbag Jatrabari Shahbag" +
                        "Motsho Bhobon High Court Motsho Bhobon Press Club Motsho Bhobon Paltan Motsho Bhobon Gulisthan Motsho Bhobon" +
                        "Motsho Bhobon Sayedabad Motsho Bhobon Jatrabari Motsho Bhobon" +
                        "High Court Press Club High Court Paltan High Court Gulisthan High Court" +
                        "High Court Sayedabad High Court Jatrabari High Court" +
                        "Press Club Paltan Press Club Gulisthan Press Club" +
                        "Press Club Sayedabad Mirpur 12 Jatrabari Mirpur 12" +
                        "Paltan Gulisthan Paltan" +
                        "Paltan Sayedabad Paltan Jatrabari Paltan" +
                        "Gulisthan Sayedabad Gulisthan Jatrabari Gulisthan" +
                        "Sayedabad Jatrabari Sayedabad"));



        buses.add(new Bus(R.drawable.logo,"Shubheccha",
                "Dhakeshwari Azimpur Dhakeshwari Nilkhet Dhakeshwari New Market Dhakeshwari Science Lab Dhakeshwari" +
                        "Dhakeshwari City College Dhakeshwari Kalabagan Dhakeshwari Dhanmondi 32 Dhakeshwari Dhanmondi 27 Dhakeshwari Asad Gate Dhakeshwari College Gate Dhakeshwari" +
                        "Dhakeshwari Shishu Mela Dhakeshwari Shyamoli Dhakeshwari Kallayanpur Dhakeshwari Technical Dhakeshwari Gabtoli Dhakeshwari Aminbazar Dhakeshwari" +
                        "Dhakeshwari Hemayetpur Dhakeshwari Savar Dhakeshwari" +
                        "Dhakeshwari Baipayl Dhakeshwari Zirani Bazar Dhakeshwari Nandan Park Dhakeshwari" +
                        "Dhakeshwari Chandra Dhakeshwari" +
                        "Azimpur Nilkhet Azimpur New Market Azimpur Science Lab Azimpur" +
                        "Azimpur City College Azimpur Kalabagan Azimpur Dhanmondi 32 Azimpur Dhanmondi 27 Azimpur Asad Gate Azimpur College Gate Azimpur" +
                        "Azimpur Shishu Mela Azimpur Shyamoli Azimpur Kallayanpur Azimpur Technical Azimpur Gabtoli Azimpur Aminbazar Azimpur" +
                        "Azimpur Hemayetpur Azimpur Savar Azimpur" +
                        "Azimpur Baipayl Azimpur Zirani Bazar Azimpur Nandan Park Azimpur" +
                        "Azimpur Chandra Azimpur" +
                        "Nilkhet New Market Nilkhet Science Lab Nilkhet" +
                        "Nilkhet City College Nilkhet Kalabagan Nilkhet Dhanmondi 32 Nilkhet Dhanmondi 27 Nilkhet Asad Gate Nilkhet College Gate Nilkhet" +
                        "Nilkhet Shishu Mela Nilkhet Shyamoli Nilkhet Kallayanpur Nilkhet Technical Nilkhet Gabtoli Nilkhet Aminbazar Nilkhet" +
                        "Nilkhet Hemayetpur Nilkhet Savar Nilkhet" +
                        "Nilkhet Baipayl Nilkhet Zirani Bazar Nilkhet Nandan Park Nilkhet" +
                        "Nilkhet Chandra Nilkhet" +
                        "New Market Science Lab New Market" +
                        "New Market City College New Market Kalabagan New Market Dhanmondi 32 New Market Dhanmondi 27 New Market Asad Gate New Market College Gate New Market" +
                        "New Market Shishu Mela New Market Shyamoli New Market Kallayanpur New Market Technical New Market Gabtoli New Market Aminbazar New Market" +
                        "New Market Hemayetpur New Market Savar New Market" +
                        "New Market Baipayl New Market Zirani Bazar New Market Nandan Park New Market" +
                        "New Market Chandra New Market" +
                        "Science Lab City College Science Lab Kalabagan Science Lab Dhanmondi 32 Science Lab Dhanmondi 27 Science Lab Asad Gate Science Lab College Gate Science Lab" +
                        "Science Lab Shishu Mela Science Lab Shyamoli Science Lab Kallayanpur Science Lab Technical Science Lab Gabtoli Science Lab Aminbazar Science Lab" +
                        "Science Lab Hemayetpur Science Lab Savar Science Lab" +
                        "Science Lab Baipayl Science Lab Zirani Bazar Science Lab Nandan Park Science Lab" +
                        "Science Lab Chandra Science Lab" +
                        "City College Kalabagan City College Dhanmondi 32 City College Dhanmondi 27 City College Asad Gate City College College Gate City College" +
                        "City College Shishu Mela City College Shyamoli City College Kallayanpur City College Technical City College Gabtoli City College Aminbazar City College" +
                        "City College Hemayetpur City College Savar City College" +
                        "City College Baipayl City College Zirani Bazar City College Nandan Park City College" +
                        "City College Chandra City College" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad Gate Kalabagan College Gate Kalabagan" +
                        "Kalabagan Shishu Mela Kalabagan Shyamoli Kalabagan Kallayanpur Kalabagan Technical Kalabagan Gabtoli Kalabagan Aminbazar Kalabagan" +
                        "Kalabagan Hemayetpur Kalabagan Savar Kalabagan" +
                        "Kalabagan Baipayl Kalabagan Zirani Bazar Kalabagan Nandan Park Kalabagan" +
                        "Kalabagan Chandra Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad Gate Dhanmondi 32 College Gate Dhanmondi 32" +
                        "Dhanmondi 32 Shishu Mela Dhanmondi 32 Shyamoli Dhanmondi 32 Kallayanpur Dhanmondi 32 Technical Dhanmondi 32 Gabtoli Dhanmondi 32 Aminbazar Dhanmondi 32" +
                        "Dhanmondi 32 Hemayetpur Dhanmondi 32 Savar Dhanmondi 32" +
                        "Dhanmondi 32 Baipayl Dhanmondi 32 Zirani Bazar Dhanmondi 32 Nandan Park Dhanmondi 32" +
                        "Dhanmondi 32 Chandra Dhanmondi 32" +
                        "Dhanmondi 27 Asad Gate Dhanmondi 27 College Gate Dhanmondi 27" +
                        "Dhanmondi 27 Shishu Mela Dhanmondi 27 Shyamoli Dhanmondi 27 Kallayanpur Dhanmondi 27 Technical Dhanmondi 27 Gabtoli Dhanmondi 27 Aminbazar Dhanmondi 27" +
                        "Dhanmondi 27 Hemayetpur Dhanmondi 27 Savar Dhanmondi 27" +
                        "Dhanmondi 27 Baipayl Dhanmondi 27 Zirani Bazar Dhanmondi 27 Nandan Park Dhanmondi 27" +
                        "Dhanmondi 27 Chandra Dhanmondi 27" +
                        "Asad Gate College Gate Asad Gate" +
                        "Asad Gate Shishu Mela Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Technical Asad Gate Gabtoli Asad Gate Aminbazar Asad Gate" +
                        "Asad Gate Hemayetpur Asad Gate Savar Asad Gate" +
                        "Asad Gate Baipayl Asad Gate Zirani Bazar Asad Gate Nandan Park Asad Gate" +
                        "Asad Gate Chandra Asad Gate" +
                        "College Gate Shishu Mela College Gate Shyamoli College Gate Kallayanpur College Gate Technical College Gate Gabtoli College Gate Aminbazar College Gate" +
                        "College Gate Hemayetpur College Gate Savar College Gate" +
                        "College Gate Baipayl College Gate Zirani Bazar College Gate Nandan Park College Gate" +
                        "College Gate Chandra College Gate" +
                        "Shishu Mela Shyamoli Shishu Mela Kallayanpur Shishu Mela Technical Shishu Mela Gabtoli Shishu Mela Aminbazar Shishu Mela" +
                        "Shishu Mela Hemayetpur Shishu Mela Savar Shishu Mela" +
                        "Shishu Mela Baipayl Shishu Mela Zirani Bazar Shishu Mela Nandan Park Shishu Mela" +
                        "Shishu Mela Chandra Shishu Mela" +
                        "Shyamoli Kallayanpur Shyamoli Technical Shyamoli Gabtoli Shyamoli Aminbazar Shyamoli" +
                        "Shyamoli Hemayetpur Shyamoli Savar Shyamoli" +
                        "Shyamoli Baipayl Shyamoli Zirani Bazar Shyamoli Nandan Park Shyamoli" +
                        "Shyamoli Chandra Shyamoli" +
                        "Kallayanpur Technical Kallayanpur Gabtoli Kallayanpur Aminbazar Kallayanpur" +
                        "Kallayanpur Hemayetpur Kallayanpur Savar Kallayanpur" +
                        "Kallayanpur Baipayl Kallayanpur Zirani Bazar Kallayanpur Nandan Park Kallayanpur" +
                        "Kallayanpur Chandra Kallayanpur" +
                        "Technical Gabtoli Technical Aminbazar Technical" +
                        "Technical Hemayetpur Technical Savar Technical" +
                        "Technical Baipayl Technical Zirani Bazar Technical Nandan Park Technical" +
                        "Technical Chandra Technical" +
                        "Gabtoli Aminbazar Gabtoli" +
                        "Gabtoli Hemayetpur Gabtoli Savar Gabtoli" +
                        "Gabtoli Baipayl Gabtoli Zirani Bazar Gabtoli Nandan Park Gabtoli" +
                        "Gabtoli Chandra Gabtoli" +
                        "Aminbazar Hemayetpur Aminbazar Savar Aminbazar" +
                        "Aminbazar Baipayl Aminbazar Zirani Bazar Aminbazar Nandan Park Aminbazar" +
                        "Aminbazar Chandra Aminbazar" +
                        "Hemayetpur Savar Hemayetpur" +
                        "Hemayetpur Baipayl Hemayetpur Zirani Bazar Hemayetpur Nandan Park Hemayetpur" +
                        "Hemayetpur Chandra Hemayetpur" +
                        "Savar Baipayl Savar Zirani Bazar Savar Nandan Park Savar" +
                        "Savar Chandra Savar" +
                        "Baipayl Zirani Bazar Baipayl Nandan Park Baipayl" +
                        "Baipayl Chandra Baipayl" +
                        "Zirani Bazar Nandan Park Zirani Bazar" +
                        "Zirani Bazar Chandra Zirani Bazar" +
                        "Nandan Park Chandra Nandan Park"));


        buses.add(new Bus(R.drawable.logo,"Shuvojatra",
                "Fulbaria Golap Shah Mazar Fulbaria GPO Fulbaria Press Club Fulbaria High Court Fulbaria Shahbag Fulbaria Science Lab Fulbaria" +
                        "Fulbaria Kalabagan Fulbaria Dhanmondi 32 Fulbaria Dhanmondi 27 Fulbaria Asad Gate Fulbaria College Gate Fulbaria Shishu Mela Fulbaria" +
                        "Fulbaria Shyamoli Fulbaria Kallayanpur Fulbaria Technical Fulbaria Gabtoli Fulbaria Aminbazar Fulbaria Hemayetpur Fulbaria" +
                        "Fulbaria Manikganj Fulbaria" +
                        "Golap Shah Mazar GPO Golap Shah Mazar Press Club Golap Shah Mazar High Court Golap Shah Mazar Shahbag Golap Shah Mazar Science Lab Golap Shah Mazar" +
                        "Golap Shah Mazar Kalabagan Golap Shah Mazar Dhanmondi 32 Golap Shah Mazar Dhanmondi 27 Golap Shah Mazar Asad Gate Golap Shah Mazar College Gate Golap Shah Mazar Shishu Mela Golap Shah Mazar" +
                        "Golap Shah Mazar Shyamoli Golap Shah Mazar Kallayanpur Golap Shah Mazar Technical Golap Shah Mazar Gabtoli Golap Shah Mazar Aminbazar Golap Shah Mazar Hemayetpur Golap Shah Mazar" +
                        "Golap Shah Mazar Manikganj Golap Shah Mazar" +
                        "GPO Press Club GPO High Court GPO Shahbag GPO Science Lab GPO" +
                        "GPO Kalabagan GPO Dhanmondi 32 GPO Dhanmondi 27 GPO Asad Gate GPO College Gate GPO Shishu Mela GPO" +
                        "GPO Shyamoli GPO Kallayanpur GPO Technical GPO Gabtoli GPO Aminbazar GPO Hemayetpur GPO" +
                        "GPO Manikganj GPO" +
                        "Press Club High Court Press Club Shahbag Press Club Science Lab Press Club" +
                        "Press Club Kalabagan Press Club Dhanmondi 32 Press Club Dhanmondi 27 Press Club Asad Gate Press Club College Gate Press Club Shishu Mela Press Club" +
                        "Press Club Shyamoli Press Club Kallayanpur Press Club Technical Press Club Gabtoli Press Club Aminbazar Press Club Hemayetpur Press Club" +
                        "Press Club Manikganj Press Club" +
                        "High Court Shahbag High Court Science Lab High Court" +
                        "High Court Kalabagan High Court Dhanmondi 32 High Court Dhanmondi 27 High Court Asad Gate High Court College Gate High Court Shishu Mela High Court" +
                        "High Court Shyamoli High Court Kallayanpur High Court Technical High Court Gabtoli High Court Aminbazar High Court Hemayetpur High Court" +
                        "High Court Manikganj High Court" +
                        "Shahbag Science Lab Shahbag" +
                        "Shahbag Kalabagan Shahbag Dhanmondi 32 Shahbag Dhanmondi 27 Shahbag Asad Gate Shahbag College Gate Shahbag Shishu Mela Shahbag" +
                        "Shahbag Shyamoli Shahbag Kallayanpur Shahbag Technical Shahbag Gabtoli Shahbag Aminbazar Shahbag Hemayetpur Shahbag" +
                        "Shahbag Manikganj Shahbag" +
                        "Science Lab Kalabagan Science Lab Dhanmondi 32 Science Lab Dhanmondi 27 Science Lab Asad Gate Science Lab College Gate Science Lab Shishu Mela Science Lab" +
                        "Science Lab Shyamoli Science Lab Kallayanpur Science Lab Technical Science Lab Gabtoli Science Lab Aminbazar Science Lab Hemayetpur Science Lab" +
                        "Science Lab Manikganj Science Lab" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad Gate Kalabagan College Gate Kalabagan Shishu Mela Kalabagan" +
                        "Kalabagan Shyamoli Kalabagan Kallayanpur Kalabagan Technical Kalabagan Gabtoli Kalabagan Aminbazar Kalabagan Hemayetpur Kalabagan" +
                        "Kalabagan Manikganj Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad Gate Dhanmondi 32 College Gate Dhanmondi 32 Shishu Mela Dhanmondi 32" +
                        "Dhanmondi 32 Shyamoli Dhanmondi 32 Kallayanpur Dhanmondi 32 Technical Dhanmondi 32 Gabtoli Dhanmondi 32 Aminbazar Dhanmondi 32 Hemayetpur Dhanmondi 32" +
                        "Dhanmondi 32 Manikganj Dhanmondi 32" +
                        "Dhanmondi 27 Asad Gate Dhanmondi 27 College Gate Dhanmondi 27 Shishu Mela Dhanmondi 27" +
                        "Dhanmondi 27 Shyamoli Dhanmondi 27 Kallayanpur Dhanmondi 27 Technical Dhanmondi 27 Gabtoli Dhanmondi 27 Aminbazar Dhanmondi 27 Hemayetpur Dhanmondi 27" +
                        "Dhanmondi 27 Manikganj Dhanmondi 27" +
                        "Asad Gate College Gate Asad Gate Shishu Mela Asad Gate" +
                        "Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Technical Asad Gate Gabtoli Asad Gate Aminbazar Asad Gate Hemayetpur Asad Gate" +
                        "Asad Gate Manikganj Asad Gate" +
                        "College Gate Shishu Mela College Gate" +
                        "College Gate Shyamoli College Gate Kallayanpur College Gate Technical College Gate Gabtoli College Gate Aminbazar College Gate Hemayetpur College Gate" +
                        "College Gate Manikganj College Gate" +
                        "Shishu Mela Shyamoli Shishu Mela Kallayanpur Shishu Mela Technical Shishu Mela Gabtoli Shishu Mela Aminbazar Shishu Mela Hemayetpur Shishu Mela" +
                        "Shishu Mela Manikganj Shishu Mela" +
                        "Shyamoli Kallayanpur Shyamoli Technical Shyamoli Gabtoli Shyamoli Aminbazar Shyamoli Hemayetpur Shyamoli" +
                        "Shyamoli Manikganj Shyamoli" +
                        "Kallayanpur Technical Kallayanpur Gabtoli Kallayanpur Aminbazar Kallayanpur Hemayetpur Kallayanpur" +
                        "Kallayanpur Manikganj Kallayanpur" +
                        "Technical Gabtoli Technical Aminbazar Technical Hemayetpur Technical" +
                        "Technical Manikganj Technical" +
                        "Gabtoli Aminbazar Gabtoli Hemayetpur Gabtoli" +
                        "Gabtoli Manikganj Gabtoli" +
                        "Aminbazar Hemayetpur Aminbazar" +
                        "Aminbazar Manikganj Aminbazar" +
                        "Hemayetpur Manikganj Hemayetpur"));



        buses.add(new Bus(R.drawable.logo,"Skyline",
                "Sadarghat Ray Shaheb Bazar Sadarghat Naya Bazar Sadarghat GPO Sadarghat Paltan GPO Kakrail Sadarghat Shantinagar Sadarghat Malibagh Mor Sadarghat Mouchak Sadarghat Moghbazar Sadarghat" +
                        "Sadarghat Nabisco Sadarghat Mohakhali Sadarghat Banani Sadarghat Kakoli Sadarghat MES Sadarghat Shewra Sadarghat Kuril Bishwa Road Sadarghat" +
                        "Sadarghat Khilkhet Sadarghat Airport Sadarghat Jasimuddin Sadarghat Rajlakshmi Sadarghat Azampur Sadarghat House Building Sadarghat Abdullahpur Sadarghat" +
                        "Sadarghat Tongi Sadarghat Station Road Sadarghat Board Bazar Sadarghat Gazipur Sadarghat" +
                        "Ray Shaheb Bazar Naya Bazar Ray Shaheb Bazar GPO Ray Shaheb Bazar Paltan Ray Shaheb Bazar Kakrail Ray Shaheb Bazar Shantinagar Ray Shaheb Bazar Malibagh Mor Ray Shaheb Bazar Mouchak Ray Shaheb Bazar Moghbazar Ray Shaheb Bazar" +
                        "Ray Shaheb Bazar Nabisco Ray Shaheb Bazar Mohakhali Ray Shaheb Bazar Banani Ray Shaheb Bazar Kakoli Ray Shaheb Bazar MES Ray Shaheb Bazar Shewra Ray Shaheb Bazar Kuril Bishwa Road Ray Shaheb Bazar" +
                        "Ray Shaheb Bazar Khilkhet Ray Shaheb Bazar Airport Ray Shaheb Bazar Jasimuddin Ray Shaheb Bazar Rajlakshmi Ray Shaheb Bazar Azampur Ray Shaheb Bazar House Building Ray Shaheb Bazar Abdullahpur Ray Shaheb Bazar" +
                        "Ray Shaheb Bazar Tongi Ray Shaheb Bazar Station Road Ray Shaheb Bazar Board Bazar Ray Shaheb Bazar Gazipur Ray Shaheb Bazar" +
                        "Naya Bazar GPO Naya Bazar Paltan Naya Bazar Kakrail Naya Bazar Shantinagar Naya Bazar Malibagh Mor Naya Bazar Mouchak Naya Bazar Moghbazar Naya Bazar" +
                        "Naya Bazar Nabisco Naya Bazar Mohakhali Naya Bazar Banani Naya Bazar Kakoli Naya Bazar MES Naya Bazar Shewra Naya Bazar Kuril Bishwa Road Naya Bazar" +
                        "Naya Bazar Khilkhet Naya Bazar Airport Naya Bazar Jasimuddin Naya Bazar Rajlakshmi Naya Bazar Azampur Naya Bazar House Building Naya Bazar Abdullahpur Naya Bazar" +
                        "Naya Bazar Tongi Naya Bazar Station Road Naya Bazar Board Bazar Naya Bazar Gazipur Naya Bazar" +
                        "GPO Paltan GPO Kakrail GPO Shantinagar GPO Malibagh Mor GPO Mouchak GPO Moghbazar GPO" +
                        "GPO Nabisco GPO Mohakhali GPO Banani GPO Kakoli GPO MES GPO Shewra GPO Kuril Bishwa Road GPO" +
                        "GPO Khilkhet GPO Airport GPO Jasimuddin GPO Rajlakshmi GPO Azampur GPO House Building GPO Abdullahpur GPO" +
                        "GPO Tongi GPO Station Road GPO Board Bazar GPO Gazipur GPO" +
                        "Paltan Kakrail Paltan Shantinagar Paltan Malibagh Mor Paltan Mouchak Paltan Moghbazar Paltan" +
                        "Paltan Nabisco Paltan Mohakhali Paltan Banani Paltan Kakoli Paltan MES Paltan Shewra Paltan Kuril Bishwa Road Paltan" +
                        "Paltan Khilkhet Paltan Airport Paltan Jasimuddin Paltan Rajlakshmi Paltan Azampur Paltan House Building Paltan Abdullahpur Paltan" +
                        "Paltan Tongi Paltan Station Road Paltan Board Bazar Paltan Gazipur Paltan" +
                        "Kakrail Shantinagar Kakrail Malibagh Mor Kakrail Mouchak Kakrail Moghbazar Kakrail" +
                        "Kakrail Nabisco Kakrail Mohakhali Kakrail Banani Kakrail Kakoli Kakrail MES Kakrail Shewra Kakrail Kuril Bishwa Road Kakrail" +
                        "Kakrail Khilkhet Kakrail Airport Kakrail Jasimuddin Kakrail Rajlakshmi Kakrail Azampur Kakrail House Building Kakrail Abdullahpur Kakrail" +
                        "Kakrail Tongi Kakrail Station Road Kakrail Board Bazar Kakrail Gazipur Kakrail" +
                        "Shantinagar Malibagh Mor Shantinagar Mouchak Shantinagar Moghbazar Shantinagar" +
                        "Shantinagar Nabisco Shantinagar Mohakhali Shantinagar Banani Shantinagar Kakoli Shantinagar MES Shantinagar Shewra Shantinagar Kuril Bishwa Road Shantinagar" +
                        "Shantinagar Khilkhet Shantinagar Airport Shantinagar Jasimuddin Shantinagar Rajlakshmi Shantinagar Azampur Shantinagar House Building Shantinagar Abdullahpur Shantinagar" +
                        "Shantinagar Tongi Shantinagar Station Road Shantinagar Board Bazar Shantinagar Gazipur Shantinagar" +
                        "Malibagh Mor Mouchak Malibagh Mor Moghbazar Malibagh Mor" +
                        "Malibagh Mor Nabisco Malibagh Mor Mohakhali Malibagh Mor Banani Malibagh Mor Kakoli Malibagh Mor MES Malibagh Mor Shewra Malibagh Mor Kuril Bishwa Road Malibagh Mor" +
                        "Malibagh Mor Khilkhet Malibagh Mor Airport Malibagh Mor Jasimuddin Malibagh Mor Rajlakshmi Malibagh Mor Azampur Malibagh Mor House Building Malibagh Mor Abdullahpur Malibagh Mor" +
                        "Malibagh Mor Tongi Malibagh Mor Station Road Malibagh Mor Board Bazar Malibagh Mor Gazipur Malibagh Mor" +
                        "Mouchak Moghbazar Mouchak" +
                        "Mouchak Nabisco Mouchak Mohakhali Mouchak Banani Mouchak Kakoli Mouchak MES Mouchak Shewra Mouchak Kuril Bishwa Road Mouchak" +
                        "Mouchak Khilkhet Mouchak Airport Mouchak Jasimuddin Mouchak Rajlakshmi Mouchak Azampur Mouchak House Building Mouchak Abdullahpur Mouchak" +
                        "Mouchak Tongi Mouchak Station Road Mouchak Board Bazar Mouchak Gazipur Mouchak" +
                        "Moghbazar Nabisco Moghbazar Mohakhali Moghbazar Banani Moghbazar Kakoli Moghbazar MES Moghbazar Shewra Moghbazar Kuril Bishwa Road Moghbazar" +
                        "Moghbazar Khilkhet Moghbazar Airport Moghbazar Jasimuddin Moghbazar Rajlakshmi Moghbazar Azampur Moghbazar House Building Moghbazar Abdullahpur Moghbazar" +
                        "Moghbazar Tongi Moghbazar Station Road Moghbazar Board Bazar Moghbazar Gazipur Moghbazar" +
                        "Nabisco Mohakhali Nabisco Banani Nabisco Kakoli Nabisco MES Nabisco Shewra Nabisco Kuril Bishwa Road Nabisco" +
                        "Nabisco Khilkhet Nabisco Airport Nabisco Jasimuddin Nabisco Rajlakshmi Nabisco Azampur Nabisco House Building Nabisco Abdullahpur Nabisco" +
                        "Nabisco Tongi Nabisco Station Road Nabisco Board Bazar Nabisco Gazipur Nabisco" +
                        "Mohakhali Banani Mohakhali Kakoli Mohakhali MES Mohakhali Shewra Mohakhali Kuril Bishwa Road Mohakhali" +
                        "Mohakhali Khilkhet Mohakhali Airport Mohakhali Jasimuddin Mohakhali Rajlakshmi Mohakhali Azampur Mohakhali House Building Mohakhali Abdullahpur Mohakhali" +
                        "Mohakhali Tongi Mohakhali Station Road Mohakhali Board Bazar Mohakhali Gazipur Mohakhali" +
                        "Banani Kakoli Banani MES Banani Shewra Banani Kuril Bishwa Road Banani" +
                        "Banani Khilkhet Banani Airport Banani Jasimuddin Banani Rajlakshmi Banani Azampur Banani House Building Banani Abdullahpur Banani" +
                        "Banani Tongi Banani Station Road Banani Board Bazar Banani Gazipur Banani" +
                        "Kakoli MES Kakoli Shewra Kakoli Kuril Bishwa Road Kakoli" +
                        "Kakoli Khilkhet Kakoli Airport Kakoli Jasimuddin Kakoli Rajlakshmi Kakoli Azampur Kakoli House Building Kakoli Abdullahpur Kakoli" +
                        "Kakoli Tongi Kakoli Station Road Kakoli Board Bazar Kakoli Gazipur Kakoli" +
                        "MES Shewra MES Kuril Bishwa Road MES" +
                        "MES Khilkhet MES Airport MES Jasimuddin MES Rajlakshmi MES Azampur MES House Building MES Abdullahpur MES" +
                        "MES Tongi MES Station Road MES Board Bazar MES Gazipur MES" +
                        "Shewra Kuril Bishwa Road Shewra" +
                        "Shewra Khilkhet Shewra Airport Shewra Jasimuddin Shewra Rajlakshmi Shewra Azampur Shewra House Building Shewra Abdullahpur Shewra" +
                        "Shewra Tongi Shewra Station Road Shewra Board Bazar Shewra Gazipur Shewra" +
                        "Kuril Bishwa Road Khilkhet Kuril Bishwa Road Airport Kuril Bishwa Road Jasimuddin Kuril Bishwa Road Rajlakshmi Kuril Bishwa Road Azampur Kuril Bishwa Road House Building Kuril Bishwa Road Abdullahpur Kuril Bishwa Road" +
                        "Kuril Bishwa Road Tongi Kuril Bishwa Road Station Road Kuril Bishwa Road Board Bazar Kuril Bishwa Road Gazipur Kuril Bishwa Road" +
                        "Khilkhet Airport Khilkhet Jasimuddin Khilkhet Rajlakshmi Khilkhet Azampur Khilkhet House Building Khilkhet Abdullahpur Khilkhet" +
                        "Khilkhet Tongi Khilkhet Station Road Khilkhet Board Bazar Khilkhet Gazipur Khilkhet" +
                        "Airport Jasimuddin Airport Rajlakshmi Airport Azampur Airport House Building Airport Abdullahpur Airport" +
                        "Airport Tongi Airport Station Road Airport Board Bazar Airport Gazipur Airport" +
                        "Jasimuddin Rajlakshmi Jasimuddin Azampur Jasimuddin House Building Jasimuddin Abdullahpur Jasimuddin" +
                        "Jasimuddin Tongi Jasimuddin Station Road Jasimuddin Board Bazar Jasimuddin Gazipur Jasimuddin" +
                        "Rajlakshmi Azampur Rajlakshmi House Building Rajlakshmi Abdullahpur Rajlakshmi" +
                        "Rajlakshmi Tongi Rajlakshmi Station Road Rajlakshmi Board Bazar Rajlakshmi Gazipur Rajlakshmi" +
                        "Azampur House Building Azampur Abdullahpur Azampur" +
                        "Azampur Tongi Azampur Station Road Azampur Board Bazar Azampur Gazipur Azampur" +
                        "House Building Abdullahpur House Building" +
                        "House Building Tongi House Building Station Road House Building Board Bazar House Building Gazipur House Building" +
                        "Abdullahpur Tongi Abdullahpur Station Road Abdullahpur Board Bazar Abdullahpur Gazipur Abdullahpur" +
                        "Tongi Station Road Tongi Board Bazar Tongi Gazipur Tongi" +
                        "Station Road Board Bazar Station Road Gazipur Station Road" +
                        "Board Bazar Gazipur Board Bazar"));


        buses.add(new Bus(R.drawable.logo,"Somota Paribahan",
                "Chittagang Road Sign Board Chittagang Road Matuail Chittagang Road Rayerbag Chittagang Road Shonir Akhra Chittagang Road Jatrabari Chittagang Road" +
                        "Chittagang Road Sayedabad Chittagang Road Gulisthan Chittagang Road Chankhar Pul Chittagang Road Bakshi Bazar Chittagang Road Azimpur Chittagang Road Nilkhet Chittagang Road New Market Chittagang Road" +
                        "Chittagang Road City College Chittagang Road Kalabagan Chittagang Road Dhanmondi 32 Chittagang Road Dhanmondi 27 Chittagang Road Asad Gate Chittagang Road College Gate Chittagang Road Shishu Mela Chittagang Road" +
                        "Chittagang Road Shyamoli Chittagang Road Kallayanpur Chittagang Road Technical Chittagang Road Ansar Camp Chittagang Road Mirpur 1 Chittagang Road" +
                        "Chittagang Road Chiriakhana Chittagang Road" +
                        "Sign Board Matuail Sign Board Rayerbag Sign Board Shonir Akhra Sign Board Jatrabari Sign Board" +
                        "Sign Board Sayedabad Sign Board Gulisthan Sign Board Chankhar Pul Sign Board Bakshi Bazar Sign Board Azimpur Sign Board Nilkhet Sign Board New Market Sign Board" +
                        "Sign Board City College Sign Board Kalabagan Sign Board Dhanmondi 32 Sign Board Dhanmondi 27 Sign Board Asad Gate Sign Board College Gate Sign Board Shishu Mela Sign Board" +
                        "Sign Board Shyamoli Sign Board Kallayanpur Sign Board Technical Sign Board Ansar Camp Sign Board Mirpur 1 Sign Board" +
                        "Sign Board Chiriakhana Sign Board" +
                        "Matuail Rayerbag Matuail Shonir Akhra Matuail Jatrabari Matuail" +
                        "Matuail Sayedabad Matuail Gulisthan Matuail Chankhar Pul Matuail Bakshi Bazar Matuail Azimpur Matuail Nilkhet Matuail New Market Matuail" +
                        "Matuail City College Matuail Kalabagan Matuail Dhanmondi 32 Matuail Dhanmondi 27 Matuail Asad Gate Matuail College Gate Matuail Shishu Mela Matuail" +
                        "Matuail Shyamoli Matuail Kallayanpur Matuail Technical Matuail Ansar Camp Matuail Mirpur 1 Matuail" +
                        "Matuail Chiriakhana Matuail" +
                        "Rayerbag Shonir Akhra Rayerbag Jatrabari Rayerbag" +
                        "Rayerbag Sayedabad Rayerbag Gulisthan Rayerbag Chankhar Pul Rayerbag Bakshi Bazar Rayerbag Azimpur Rayerbag Nilkhet Rayerbag New Market Rayerbag" +
                        "Rayerbag City College Rayerbag Kalabagan Rayerbag Dhanmondi 32 Rayerbag Dhanmondi 27 Rayerbag Asad Gate Rayerbag College Gate Rayerbag Shishu Mela Rayerbag" +
                        "Rayerbag Shyamoli Rayerbag Kallayanpur Rayerbag Technical Rayerbag Ansar Camp Rayerbag Mirpur 1 Rayerbag" +
                        "Rayerbag Chiriakhana Rayerbag" +
                        "Shonir Akhra Jatrabari Shonir Akhra" +
                        "Shonir Akhra Sayedabad Shonir Akhra Gulisthan Shonir Akhra Chankhar Pul Shonir Akhra Bakshi Bazar Shonir Akhra Azimpur Shonir Akhra Nilkhet Shonir Akhra New Market Shonir Akhra" +
                        "Shonir Akhra City College Shonir Akhra Kalabagan Shonir Akhra Dhanmondi 32 Shonir Akhra Dhanmondi 27 Shonir Akhra Asad Gate Shonir Akhra College Gate Shonir Akhra Shishu Mela Shonir Akhra" +
                        "Shonir Akhra Shyamoli Shonir Akhra Kallayanpur Shonir Akhra Technical Shonir Akhra Ansar Camp Shonir Akhra Mirpur 1 Shonir Akhra" +
                        "Shonir Akhra Chiriakhana Shonir Akhra" +
                        "Jatrabari Sayedabad Jatrabari Gulisthan Jatrabari Chankhar Pul Jatrabari Bakshi Bazar Jatrabari Azimpur Jatrabari Nilkhet Jatrabari New Market Jatrabari" +
                        "Jatrabari City College Jatrabari Kalabagan Jatrabari Dhanmondi 32 Jatrabari Dhanmondi 27 Jatrabari Asad Gate Jatrabari College Gate Jatrabari Shishu Mela Jatrabari" +
                        "Jatrabari Shyamoli Jatrabari Kallayanpur Jatrabari Technical Jatrabari Ansar Camp Jatrabari Mirpur 1 Jatrabari" +
                        "Jatrabari Chiriakhana Jatrabari" +
                        "Sayedabad Gulisthan Sayedabad Chankhar Pul Sayedabad Bakshi Bazar Sayedabad Azimpur Sayedabad Nilkhet Sayedabad New Market Sayedabad" +
                        "Sayedabad City College Sayedabad Kalabagan Sayedabad Dhanmondi 32 Sayedabad Dhanmondi 27 Sayedabad Asad Gate Sayedabad College Gate Sayedabad Shishu Mela Sayedabad" +
                        "Sayedabad Shyamoli Sayedabad Kallayanpur Sayedabad Technical Sayedabad Ansar Camp Sayedabad Mirpur 1 Sayedabad" +
                        "Sayedabad Chiriakhana Sayedabad" +
                        "Gulisthan Chankhar Pul Gulisthan Bakshi Bazar Gulisthan Azimpur Gulisthan Nilkhet Gulisthan New Market Gulisthan" +
                        "Gulisthan City College Gulisthan Kalabagan Gulisthan Dhanmondi 32 Gulisthan Dhanmondi 27 Gulisthan Asad Gate Gulisthan College Gate Gulisthan Shishu Mela Gulisthan" +
                        "Gulisthan Shyamoli Gulisthan Kallayanpur Gulisthan Technical Gulisthan Ansar Camp Gulisthan Mirpur 1 Gulisthan" +
                        "Gulisthan Chiriakhana Gulisthan" +
                        "Chankhar Pul Bakshi Bazar Chankhar Pul Azimpur Chankhar Pul Nilkhet Chankhar Pul New Market Chankhar Pul" +
                        "Chankhar Pul City College Chankhar Pul Kalabagan Chankhar Pul Dhanmondi 32 Chankhar Pul Dhanmondi 27 Chankhar Pul Asad Gate Chankhar Pul College Gate Chankhar Pul Shishu Mela Chankhar Pul" +
                        "Chankhar Pul Shyamoli Chankhar Pul Kallayanpur Chankhar Pul Technical Chankhar Pul Ansar Camp Chankhar Pul Mirpur 1 Chankhar Pul" +
                        "Chankhar Pul Chiriakhana Chankhar Pul" +
                        "Bakshi Bazar Azimpur Bakshi Bazar Nilkhet Bakshi Bazar New Market Bakshi Bazar" +
                        "Bakshi Bazar City College Bakshi Bazar Kalabagan Bakshi Bazar Dhanmondi 32 Bakshi Bazar Dhanmondi 27 Bakshi Bazar Asad Gate Bakshi Bazar College Gate Bakshi Bazar Shishu Mela Bakshi Bazar" +
                        "Bakshi Bazar Shyamoli Bakshi Bazar Kallayanpur Bakshi Bazar Technical Bakshi Bazar Ansar Camp Bakshi Bazar Mirpur 1 Bakshi Bazar" +
                        "Bakshi Bazar Chiriakhana Bakshi Bazar" +
                        "Azimpur Nilkhet Azimpur New Market Azimpur" +
                        "Azimpur City College Azimpur Kalabagan Azimpur Dhanmondi 32 Azimpur Dhanmondi 27 Azimpur Asad Gate Azimpur College Gate Azimpur Shishu Mela Azimpur" +
                        "Azimpur Shyamoli Azimpur Kallayanpur Azimpur Technical Azimpur Ansar Camp Azimpur Mirpur 1 Azimpur" +
                        "Azimpur Chiriakhana Azimpur" +
                        "Nilkhet New Market Nilkhet" +
                        "Nilkhet City College Nilkhet Kalabagan Nilkhet Dhanmondi 32 Nilkhet Dhanmondi 27 Nilkhet Asad Gate Nilkhet College Gate Nilkhet Shishu Mela Nilkhet" +
                        "Nilkhet Shyamoli Nilkhet Kallayanpur Nilkhet Technical Nilkhet Ansar Camp Nilkhet Mirpur 1 Nilkhet" +
                        "Nilkhet Chiriakhana Nilkhet" +
                        "New Market City College New Market Kalabagan New Market Dhanmondi 32 New Market Dhanmondi 27 New Market Asad Gate New Market College Gate New Market Shishu Mela New Market" +
                        "New Market Shyamoli New Market Kallayanpur New Market Technical New Market Ansar Camp New Market Mirpur 1 New Market" +
                        "New Market Chiriakhana New Market" +
                        "City College Kalabagan City College Dhanmondi 32 City College Dhanmondi 27 City College Asad Gate City College College Gate City College Shishu Mela City College" +
                        "City College Shyamoli City College Kallayanpur City College Technical City College Ansar Camp City College Mirpur 1 City College" +
                        "City College Chiriakhana City College" +
                        "Kalabagan Dhanmondi 32 Kalabagan Dhanmondi 27 Kalabagan Asad Gate Kalabagan College Gate Kalabagan Shishu Mela Kalabagan" +
                        "Kalabagan Shyamoli Kalabagan Kallayanpur Kalabagan Technical Kalabagan Ansar Camp Kalabagan Mirpur 1 Kalabagan" +
                        "Kalabagan Chiriakhana Kalabagan" +
                        "Dhanmondi 32 Dhanmondi 27 Dhanmondi 32 Asad Gate Dhanmondi 32 College Gate Dhanmondi 32 Shishu Mela Dhanmondi 32" +
                        "Dhanmondi 32 Shyamoli Dhanmondi 32 Kallayanpur Dhanmondi 32 Technical Dhanmondi 32 Ansar Camp Dhanmondi 32 Mirpur 1 Dhanmondi 32" +
                        "Dhanmondi 32 Chiriakhana Dhanmondi 32" +
                        "Dhanmondi 27 Asad Gate Dhanmondi 27 College Gate Dhanmondi 27 Shishu Mela Dhanmondi 27" +
                        "Dhanmondi 27 Shyamoli Dhanmondi 27 Kallayanpur Dhanmondi 27 Technical Dhanmondi 27 Ansar Camp Dhanmondi 27 Mirpur 1 Dhanmondi 27" +
                        "Dhanmondi 27 Chiriakhana Dhanmondi 27" +
                        "Asad Gate College Gate Asad Gate Shishu Mela Asad Gate" +
                        "Asad Gate Shyamoli Asad Gate Kallayanpur Asad Gate Technical Asad Gate Ansar Camp Asad Gate Mirpur 1 Asad Gate" +
                        "Asad Gate Chiriakhana Asad Gate" +
                        "College Gate Shishu Mela College Gate" +
                        "College Gate Shyamoli College Gate Kallayanpur College Gate Technical College Gate Ansar Camp College Gate Mirpur 1 College Gate" +
                        "College Gate Chiriakhana College Gate" +
                        "Shishu Mela Shyamoli Shishu Mela Kallayanpur Shishu Mela Technical Shishu Mela Ansar Camp Shishu Mela Mirpur 1 Shishu Mela" +
                        "Shishu Mela Chiriakhana Shishu Mela" +
                        "Shyamoli Kallayanpur Shyamoli Technical Shyamoli Ansar Camp Shyamoli Mirpur 1 Shyamoli" +
                        "Shyamoli Chiriakhana Shyamoli" +
                        "Kallayanpur Technical Kallayanpur Ansar Camp Kallayanpur Mirpur 1 Kallayanpur" +
                        "Kallayanpur Chiriakhana Kallayanpur" +
                        ""));


        buses.add(new Bus(R.drawable.logo,"Dipon", "Tajmahal"));

        return buses;
    }



}