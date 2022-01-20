package com.example.localtransportationtrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class RouteDetails extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private TextView brtextView;
    private ListView listView;
    private Button imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_details);
        textView = (TextView) findViewById(R.id.busNametextview);
        brtextView = (TextView) findViewById(R.id.busroutetextview);
        listView = (ListView) findViewById(R.id.busRouteLV);
        Intent intent = getIntent();
        if(intent.hasExtra("Bus Name")){
            String busName = intent.getStringExtra("Bus Name");
            textView.setText(busName);
            switch (busName) {
                case "Bahon":
                    ArrayAdapter<String> bahonAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BahonRoute));
                    listView.setAdapter(bahonAdapter);
                    brtextView.setText("Mirpur 14 - Khilgaon");

                    break;
                case "13 No":
                    ArrayAdapter<String> no13Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.no13Route));
                    listView.setAdapter(no13Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "6 No":
                    ArrayAdapter<String> no6Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.no6Route));
                    listView.setAdapter(no6Adapter);
                    brtextView.setText("Kamalapur - Natun Bazar");
                    break;

                case "7 No":
                    ArrayAdapter<String> no7Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.no7Route));
                    listView.setAdapter(no7Adapter);
                    brtextView.setText("Sadarghat - Gabtoli");
                    break; case "8 No":
                    ArrayAdapter<String> no8Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.no8Route));
                    listView.setAdapter(no8Adapter);
                    brtextView.setText("Jatrabari - Gabtoli");
                    break; case "Achim Paribahan":
                    ArrayAdapter<String>achimAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.achimRoute));
                    listView.setAdapter(achimAdapter);
                    brtextView.setText("Gabtoli - Demra Staff Quarter");
                    break; case "Agradut":
                    ArrayAdapter<String> agradutAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.agradutROute));
                    listView.setAdapter(agradutAdapter);
                    brtextView.setText("Savar - Natun Bazar");
                    break; case "Airport Bangabandhu Avenue":
                    ArrayAdapter<String> airportAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.airportBARoute));
                    listView.setAdapter(airportAdapter);
                    brtextView.setText("Fulbaria - Abdullahpur");
                    break; case "Akik Paribahan":
                    ArrayAdapter<String> akikAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.akikRoute));
                    listView.setAdapter(akikAdapter);
                    brtextView.setText("Ansar Camp - Natun Bazar");
                    break; case "Al Modina Plus One":
                    ArrayAdapter<String> almodinaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.almodinaRoute));
                    listView.setAdapter(almodinaAdapter);
                    brtextView.setText("Nandan Park - Kamalapur");
                    break; case "Al Mokka Transport":
                    ArrayAdapter<String> almokkaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.almokkaROute));
                    listView.setAdapter(almokkaAdapter);
                    brtextView.setText("Motijheel - Mirpur 1");
                    break; case "Alif Enterprise":
                    ArrayAdapter<String> alifAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.alifRoute));
                    listView.setAdapter(alifAdapter);
                    brtextView.setText("Mirpur 1 - Banasree");
                    break; case "Alif Enterprise 2":
                    ArrayAdapter<String> alif2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.alif2Route));
                    listView.setAdapter(alif2Adapter);
                    brtextView.setText("Shia Mosjid - Banasree");
                    break; case "Alif Enterprise 3":
                    ArrayAdapter<String> alif3Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.alif3Route));
                    listView.setAdapter(alif3Adapter);
                    brtextView.setText("Mirpur 14 - Fantasy Kingdom");
                    break;
                case "Alike":
                    ArrayAdapter<String> alikeAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.alikeRoute));
                    listView.setAdapter(alikeAdapter);
                    brtextView.setText("Balughat - Shahbag");
                    break; case "Anabil":
                    ArrayAdapter<String> anabilAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.anabilRoute));
                    listView.setAdapter(anabilAdapter);
                    brtextView.setText("Sign Board - Gazipur");
                    break; case "Ashirbad Paribahan":
                    ArrayAdapter<String> ashirbadAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.AshirbadRoute));
                    listView.setAdapter(ashirbadAdapter);
                    brtextView.setText("Azimpur - Duaripara");
                    break; case "BRTC":
                    ArrayAdapter<String> brtcAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTCRoute));
                    listView.setAdapter(brtcAdapter);
                    brtextView.setText("Madanpur - Savar");
                    break; case "Ashulia Classic":
                    ArrayAdapter<String> ashuliaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ashuliaRoute));
                    listView.setAdapter(ashuliaAdapter);
                    brtextView.setText("Nobinagar - Mohakhali");
                    break; case "Asmani Paribahan":
                    ArrayAdapter<String> asmaniAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.asmaniRoute));
                    listView.setAdapter(asmaniAdapter);
                    brtextView.setText("Dhour - Madanpur");
                    break; case "Ayat":
                    ArrayAdapter<String> ayatAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ayatRoute));
                    listView.setAdapter(ayatAdapter);
                    brtextView.setText("Chiriakhana - Kamalapur");
                    break; case "Azmery Glory":
                    ArrayAdapter<String> azmeriAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.azmeriRoute));
                    listView.setAdapter(azmeriAdapter);
                    brtextView.setText("Sadarghat - Chandra");
                    break; case "BRTC 2":
                    ArrayAdapter<String> brtc2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTC2Route));
                    listView.setAdapter(brtc2Adapter);
                    brtextView.setText("Motijheel - Tongi");
                    break; case "BRTC 3":
                    ArrayAdapter<String> brtc3Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTC3Route));
                    listView.setAdapter(brtc3Adapter);
                    brtextView.setText("Motijheel - Chandra");
                    break; case "BRTC 4":
                    ArrayAdapter<String> brtc4Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTC4Route));
                    listView.setAdapter(brtc4Adapter);
                    brtextView.setText("Mohammadpur - Kuril Bishwa Road");
                    break; case "BRTC 5":
                    ArrayAdapter<String> brtc5Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTC5Route));
                    listView.setAdapter(brtc5Adapter);
                    brtextView.setText("Kamalapur - Kuril Bishwa Road");
                    break; case "BRTC 6":
                    ArrayAdapter<String> brtc6Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTC6Route));
                    listView.setAdapter(brtc6Adapter);
                    brtextView.setText("Bhulta - Kuril Bishwa Road");
                    break; case "Balaka Paribahan":
                    ArrayAdapter<String> balakaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BalakaRoute));
                    listView.setAdapter(balakaAdapter);
                    brtextView.setText("Sayedabad - Abdullahpur");
                    break; case "Basumati Transport":
                    ArrayAdapter<String> basumatiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BasumatiRoute));
                    listView.setAdapter(basumatiAdapter);
                    brtextView.setText("Gabtoli - Gazipur");
                    break; case "Best Transport":
                    ArrayAdapter<String> bestAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BestRoute));
                    listView.setAdapter(bestAdapter);
                    brtextView.setText("Jatrabari - Mirpur 10");
                    break; case "Bhuiyan Paribahan":
                    ArrayAdapter<String> bhuiyanAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BhuiyanRoute));
                    listView.setAdapter(bhuiyanAdapter);
                    brtextView.setText("Japan Garden City - Abdullahpur");
                    break; case "Bihango Paribahan":
                    ArrayAdapter<String> bihangaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BihangaRoute));
                    listView.setAdapter(bihangaAdapter);
                    brtextView.setText("Sadarghat - Duaripara");
                    break; case "Bihango Paribahan 2":
                    ArrayAdapter<String> bihanga2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.Bihanga2Route));
                    listView.setAdapter(bihanga2Adapter);
                    brtextView.setText("Azimpur - Rupnagar");
                    break; case "Bikalpo Auto Service":
                    ArrayAdapter<String> bikalpaautoAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BikalpoautoRoute));
                    listView.setAdapter(bikalpaautoAdapter);
                    brtextView.setText("Motijheel - Mirpur 12");
                    break; case "Bikalpo City Super Service":
                    ArrayAdapter<String> bikalpacityAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BikalpocityRoute));
                    listView.setAdapter(bikalpacityAdapter);
                    brtextView.setText("Dhakeshwari - Mirpur 12");
                    break; case "Bikash Parihaban":
                    ArrayAdapter<String> bikashAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BikashRoute));
                    listView.setAdapter(bikashAdapter);
                    brtextView.setText("Azimpur - Dhour");
                    break; case "Boishakhi Paripahan":
                    ArrayAdapter<String> boishakhiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BoishakhiRoute));
                    listView.setAdapter(boishakhiAdapter);
                    brtextView.setText("Savar - Natun Bazar");
                    break;

                case "Bondhu Paribahan":
                    ArrayAdapter<String> bondhuAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BondhuRoute));
                    listView.setAdapter(bondhuAdapter);
                    brtextView.setText("Gulisthan - Natun Bazar");
                    break;

                case "Bornomala Paribahan":
                    ArrayAdapter<String> bornomalaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BornomalaRoute));
                    listView.setAdapter(bornomalaAdapter);
                    brtextView.setText("Azimpur - Banasree");
                    break;

                case "Brothers":
                    ArrayAdapter<String> brothersAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BrothersRoute));
                    listView.setAdapter(brothersAdapter);
                    brtextView.setText("Gabtoli - Babu Bazar");
                    break;

                case "Cantonment Mini Service":
                    ArrayAdapter<String> cantonmentAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.CantonmentRoute));
                    listView.setAdapter(cantonmentAdapter);
                    brtextView.setText("Mirpur 14 - Kakoli");
                    break; case "Champion":
                    ArrayAdapter<String> championAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ChampionRoute));
                    listView.setAdapter(championAdapter);
                    brtextView.setText("Bhasantek - Gabtoli");
                    break; case "D Link":
                    ArrayAdapter<String> dlinkAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DlinkRoute));
                    listView.setAdapter(dlinkAdapter);
                    brtextView.setText("Gulisthan - Dhamrai");
                    break; case "D One Transport":
                    ArrayAdapter<String> doneAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DoneRoute));
                    listView.setAdapter(doneAdapter);
                    brtextView.setText("Motijheel - Kalampur");
                    break; case "Dewan":
                    ArrayAdapter<String> dewanAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DewanRoute));
                    listView.setAdapter(dewanAdapter);
                    brtextView.setText("Azimpur - Kuril Bishwa Road");
                    break; case "Dhaka Paribahan":
                    ArrayAdapter<String> dhakapbAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DhakaparibahanRoute));
                    listView.setAdapter(dhakapbAdapter);
                    brtextView.setText("Motijheel - Shibbari");
                    break; case "Dhakar Chaka":
                    ArrayAdapter<String> dhakarchakaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DhakarchakaRoute));
                    listView.setAdapter(dhakarchakaAdapter);
                    brtextView.setText("Hatirjheel - Natun Bazar");
                    break; case "Dipon":
                    ArrayAdapter<String> diponAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DiponRoute));
                    listView.setAdapter(diponAdapter);
                    brtextView.setText("Arambag - Tajmahal Road");
                    break; case "Dishari Paribahan":
                    ArrayAdapter<String> dishariAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DishariRoute));
                    listView.setAdapter(dishariAdapter);
                    brtextView.setText("Chiriakhana - Keraniganj");
                    break; case "Druti Paribahan":
                    ArrayAdapter<String> drutiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DrutiRoute));
                    listView.setAdapter(drutiAdapter);
                    brtextView.setText("Dhakeshwari - Pallabi");
                    break; case "ETC Transport":
                    ArrayAdapter<String> etcAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ETCRoute));
                    listView.setAdapter(etcAdapter);
                    brtextView.setText("Gulisthan - Mirpur 12");
                    break; case "Everest Paribahan":
                    ArrayAdapter<String> everestAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.EverestRoute));
                    listView.setAdapter(everestAdapter);
                    brtextView.setText("Keraniganj - Chiriakhana");
                    break; case "FTCL":
                    ArrayAdapter<String> ftclAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.FTCLRoute));
                    listView.setAdapter(ftclAdapter);
                    brtextView.setText("Arambag - Mohammadpur");
                    break; case "First Ten":
                    ArrayAdapter<String> firsttenAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.FirsttenRoute));
                    listView.setAdapter(firsttenAdapter);
                    brtextView.setText("Bhasantek - Gabtoli");
                    break; case "Galaxy Line":
                    ArrayAdapter<String> galaxyAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.GalaxyRoute));
                    listView.setAdapter(galaxyAdapter);
                    brtextView.setText("Ansar Camp - Demra Staff Quarter");
                    break; case "Gazipur Paribahan":
                    ArrayAdapter<String> gazipurpbAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.GazipurparibahanRoute));
                    listView.setAdapter(gazipurpbAdapter);
                    brtextView.setText("Motijheel - Gazipur");
                    break; case "Grameen":
                    ArrayAdapter<String> grameenAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.GrameenRoute));
                    listView.setAdapter(grameenAdapter);
                    brtextView.setText("Mirpur 14 - Gabtoli");
                    break; case "Grameen Shubheccha":
                    ArrayAdapter<String> grameenSuvecchaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.grameensubecchaRoute));
                    listView.setAdapter(grameenSuvecchaAdapter);
                    brtextView.setText("Fulbaria - Chandra");
                    break; case "Green Dhaka":
                    ArrayAdapter<String> greendhakaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.greendhakaRoute));
                    listView.setAdapter(greendhakaAdapter);
                    brtextView.setText("Motijheel - Abdullahpur");
                    break;


                case "Haji Transport":
                    ArrayAdapter<String> hajiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.HajiRoute));
                    listView.setAdapter(hajiAdapter);
                    brtextView.setText("Mirpur 12 - Motijheel");
                    break;
                case "Himachol":
                    ArrayAdapter<String> himacholAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.HimacholRoute));
                    listView.setAdapter(himacholAdapter);
                    brtextView.setText("Narayanganj - Mirpur 12");
                    break;
                case "Intercity":
                    ArrayAdapter<String> intercityAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.intercityRoute));
                    listView.setAdapter(intercityAdapter);
                    brtextView.setText("Abdullahpur - Chandra");
                    break;
                case "Itihas Paribahan":
                    ArrayAdapter<String> itihasAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ItehashRoute));
                    listView.setAdapter(itihasAdapter);
                    brtextView.setText("Postogola - Savar");
                    break;
                case "Itihas Paribahan 2":
                    ArrayAdapter<String> itihas2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.itehash2Route));
                    listView.setAdapter(itihas2Adapter);
                    brtextView.setText("Mirpur 14 - Zirani Bazar");
                    break;
                case "J M Super Paribahan":
                    ArrayAdapter<String> jmsuperAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.JMsuperRoute));
                    listView.setAdapter(jmsuperAdapter);
                    brtextView.setText("Jatrabari - Tongi");
                    break;
                case "Jabale Nur Paribahan":
                    ArrayAdapter<String> jabalenurAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.JabalenurRoute));
                    listView.setAdapter(jabalenurAdapter);
                    brtextView.setText("Ansar Camp - Natun Bazar");
                    break;
                case "Jabale Nur Paribahan 2":
                    ArrayAdapter<String> jabalenur2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.jabalenur2Route));
                    listView.setAdapter(jabalenur2Adapter);
                    brtextView.setText("Agargaon - Abdullahpur");
                    break;
                case "Janjabil":
                    ArrayAdapter<String>janjabilAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.JanjabilRoute));
                    listView.setAdapter(janjabilAdapter);
                    brtextView.setText("Gabtoli - Babu Bazar");
                    break;
                case "Kanak":
                    ArrayAdapter<String> kanakAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.KanakRoute));
                    listView.setAdapter(kanakAdapter);
                    brtextView.setText("Mirpur 1 - Abdullahpur");
                    break;
                case "Khajababa Paribahan":
                    ArrayAdapter<String> khajababaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.KhajababaRoute));
                    listView.setAdapter(khajababaAdapter);
                    brtextView.setText("Jatrabari - Mirpur 12");
                    break;
                case "Labbaik":
                    ArrayAdapter<String> labbaikAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.LabbaikRoute));
                    listView.setAdapter(labbaikAdapter);
                    brtextView.setText("Sign Board - Savar EPZ");
                    break;
                case "Lams Paribahan":
                    ArrayAdapter<String> lamsAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.LamsRoute));
                    listView.setAdapter(lamsAdapter);
                    brtextView.setText("Motijheel - Mirpur 12");
                    break;
                case "MTCL 2":
                    ArrayAdapter<String> mtcl2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MTCL2Route));
                    listView.setAdapter(mtcl2Adapter);
                    brtextView.setText("Arambag - Mohammadpur");
                    break;
                case "Malancha Transport":
                    ArrayAdapter<String> malanchaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MalanchaRoute));
                    listView.setAdapter(malanchaAdapter);
                    brtextView.setText("Dhupkhola - Mohammadpur");
                    break;
                case "Manjil Express":
                    ArrayAdapter<String> manjilAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ManjilRoute));
                    listView.setAdapter(manjilAdapter);
                    brtextView.setText("Chittagang Road - Abdullahpur");
                    break;
                case "Meghla Transport":
                    ArrayAdapter<String> meghlaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MeghlaRoute));
                    listView.setAdapter(meghlaAdapter);
                    brtextView.setText("Kalabagan - Bhulta");
                    break;
                case "Meshkat Transport":
                    ArrayAdapter<String> meshkatAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MeshkatRoute));
                    listView.setAdapter(meshkatAdapter);
                    brtextView.setText("Chittagang Road - Mohammadpur");
                    break;
                case "Midway":
                    ArrayAdapter<String> midwayAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MidwayRoute));
                    listView.setAdapter(midwayAdapter);
                    brtextView.setText("Khilgaon - Mohammadpur");
                    break;
                case "Mirpur Link":
                    ArrayAdapter<String> mirpurlinkAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MirpurlinkRoute));
                    listView.setAdapter(mirpurlinkAdapter);
                    brtextView.setText("Dhakeshwari - Mirpur 12");
                    break;

                case "Mirpur Link 2":
                    ArrayAdapter<String> mirpurlink2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.Mirpurlink2Route));
                    listView.setAdapter(mirpurlink2Adapter);
                    brtextView.setText("Azimpur - ECB Square");
                    break;
                case "Mirpur Metro Service":
                    ArrayAdapter<String> mirpurmetroAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MirpurmetroRoute));
                    listView.setAdapter(mirpurmetroAdapter);
                    brtextView.setText("Azimpur - Mirpur 1");
                    break;
                case "Mirpur United Service":
                    ArrayAdapter<String> mirpurunitedAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MirpurunitedRoute));
                    listView.setAdapter(mirpurunitedAdapter);
                    brtextView.setText("Sadarghat - Mirpur 12");
                    break;
                case "Modhumoti Paribahan":
                    ArrayAdapter<String> modhumotiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ModhumotiRoute));
                    listView.setAdapter(modhumotiAdapter);
                    brtextView.setText("Baipayl - Kamarpara");
                    break;
                case "Mohona":
                    ArrayAdapter<String> mohonaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MohonaRoute));
                    listView.setAdapter(mohonaAdapter);
                    brtextView.setText("Mirpur 14 - Fantasy Kingdom");
                    break;
                case "Moitri":
                    ArrayAdapter<String> moitriAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MoitriRoute));
                    listView.setAdapter(moitriAdapter);
                    brtextView.setText("Arambag - Mohammadpur");
                    break;
                case "Moumita Transport":
                    ArrayAdapter<String> moumitaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MoumitaRoute));
                    listView.setAdapter(moumitaAdapter);
                    brtextView.setText("Chasara - Chandra");
                    break;
                case "Nilachol":
                    ArrayAdapter<String> nilacholAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.NilacholRoute));
                    listView.setAdapter(nilacholAdapter);
                    brtextView.setText("Chittagang Road - Paturia");
                    break;
                case "Nobokoli Paribahan":
                    ArrayAdapter<String> nobokoliAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.NobokoliRoute));
                    listView.setAdapter(nobokoliAdapter);
                    brtextView.setText("Chiriakhana - keraniganj");
                    break;
                case "Nur E Mokka Paribahan":
                    ArrayAdapter<String> nuremokkaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.NuremokkaRoute));
                    listView.setAdapter(nuremokkaAdapter);
                    brtextView.setText("Chiriakhana - Aftab Nagar");
                    break;

                case "Omama International":
                    ArrayAdapter<String> omamaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.OmamaRoute));
                    listView.setAdapter(omamaAdapter);
                    brtextView.setText("Motijheel - Airport");
                    break;
                case "One Transport":
                    ArrayAdapter<String> onetAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.OneTransportRoute));
                    listView.setAdapter(onetAdapter);
                    brtextView.setText("Motijheel - Nandan Park");
                    break;
                case "Pallabi Super Service":
                    ArrayAdapter<String> pallabissAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.PallabiSuperRoute));
                    listView.setAdapter(pallabissAdapter);
                    brtextView.setText("Gabtoli - Kamarpara");
                    break;
                case "Paristhan Paribahan":
                    ArrayAdapter<String> paristhanAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ParisthanRoute));
                    listView.setAdapter(paristhanAdapter);
                    brtextView.setText("Bosila - Abdullahpur");
                    break;
                case "Prattay":
                    ArrayAdapter<String>prattayAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.PrattayRoute));
                    listView.setAdapter(prattayAdapter);
                    brtextView.setText("Gabtoli - Babu Bazar");
                    break;
                case "Pravati Banasree Paribahan":
                    ArrayAdapter<String> pravatibsAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.PravatibsRoute));
                    listView.setAdapter(pravatibsAdapter);
                    brtextView.setText("Gulisthan - Barmi");
                    break;
                case "Prochesta":
                    ArrayAdapter<String> prochestaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ProchestaRoute));
                    listView.setAdapter(prochestaAdapter);
                    brtextView.setText("Mawa - Abdullahpur");
                    break;
                case "Projapoti Paribahan":
                    ArrayAdapter<String> prajapotiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ProjapotiRoute));
                    listView.setAdapter(prajapotiAdapter);
                    brtextView.setText("Bosila - Kamarpara");
                    break;
                case "Rabrab Paribahan":
                    ArrayAdapter<String> rabrabAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RabrabRoute));
                    listView.setAdapter(rabrabAdapter);
                    brtextView.setText("Gabtoli - Banasree");
                    break;


                case "Raida":
                    ArrayAdapter<String> raidaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RaidaRoute));
                    listView.setAdapter(raidaAdapter);
                    brtextView.setText("Postogola - Dia Bari");
                    break;

                case "Raja City":
                    ArrayAdapter<String> rajacityAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RajacityRoute));
                    listView.setAdapter(rajacityAdapter);
                    brtextView.setText("Arambag - Mohammadpur");
                    break;

                case "Rajanigandha":
                    ArrayAdapter<String> rajanigandhaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RajanigandhaRoute));
                    listView.setAdapter(rajanigandhaAdapter);
                    brtextView.setText("Meghna Ghat - Mohammadpur");
                    break;
                case "Rajdhani Super Service":
                    ArrayAdapter<String> rajdhaniAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RajdhaniRoute));
                    listView.setAdapter(rajdhaniAdapter);
                    brtextView.setText("Mirpur 12 - Chandra");
                    break;
                case "Rangdhonu Paribahan":
                    ArrayAdapter<String> rangdhonuAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RangdhonuRoute));
                    listView.setAdapter(rangdhonuAdapter);
                    brtextView.setText("Japan Garden City - Jurain");
                    break;
                case "Roich":
                    ArrayAdapter<String> roichAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RoichRoute));
                    listView.setAdapter(roichAdapter);
                    brtextView.setText("Gabtoli - Natun Bazar");
                    break;
                case "Ramjan":
                    ArrayAdapter<String> ramjanAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RamjanRoute));
                    listView.setAdapter(ramjanAdapter);
                    brtextView.setText("Azimpur - Banasree");
                    break;
                case "Runway Express":
                    ArrayAdapter<String> runwayAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RunwayRoute));
                    listView.setAdapter(runwayAdapter);
                    brtextView.setText("Keraniganj - ECB Square");
                    break;
                case "Rupa Paribahan":
                    ArrayAdapter<String> rupaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RupaRoute));
                    listView.setAdapter(rupaAdapter);
                    brtextView.setText("Gabtoli - Bhasantek");
                    break;
                case "Rupkotha Paribahan":
                    ArrayAdapter<String> rupkothaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RupkothaRoute));
                    listView.setAdapter(rupkothaAdapter);
                    brtextView.setText("Savar - Abdullahpur");
                    break;
                case "Safety Enterprise":
                    ArrayAdapter<String> safetyAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SafetyRoute));
                    listView.setAdapter(safetyAdapter);
                    brtextView.setText("Dhakeshwari - Mirpur 12");
                    break;
                case "Salsabil":
                    ArrayAdapter<String> salsabilAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SalsabilRoute));
                    listView.setAdapter(salsabilAdapter);
                    brtextView.setText("Postogola - Gazipur");
                    break;
                case "Savar Paribahan":
                    ArrayAdapter<String> savarAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SavarPBRoute));
                    listView.setAdapter(savarAdapter);
                    brtextView.setText("Sadarghat - Nandan Park");
                    break;
                case "Shadhin":
                    ArrayAdapter<String> shadhinAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShadhinRoute));
                    listView.setAdapter(shadhinAdapter);
                    brtextView.setText("Bosila - Demra Staff Quarter");
                    break;

                case "Shadhin Express":
                    ArrayAdapter<String> shadhinExAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShadhinexpressRoute));
                    listView.setAdapter(shadhinExAdapter);
                    brtextView.setText("Mawa - Mirpur 12");
                    break;


                case "Shahria Enterprise":
                    ArrayAdapter<String> shahriaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShahriaRoute));
                    listView.setAdapter(shahriaAdapter);
                    brtextView.setText("Gabtoli - Postogola");
                    break;


                case "Shatabdi Transport":
                    ArrayAdapter<String> shatabdiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShatabdiRoute));
                    listView.setAdapter(shatabdiAdapter);
                    brtextView.setText("Motijheel - Kamarpara");
                    break;


                case "Shikhar Paribahan":
                    ArrayAdapter<String>shikharAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShikharRoute));
                    listView.setAdapter(shikharAdapter);
                    brtextView.setText("Jatrabari - Pallabi");
                    break;


                case "Shikor Paribahan":
                    ArrayAdapter<String> shikorAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShikorRoute));
                    listView.setAdapter(shikorAdapter);
                    brtextView.setText("Jatrabari - Mirpur 12");
                    break;

                case "Shubheccha":
                    ArrayAdapter<String> subhecchaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShubhecchaRoute));
                    listView.setAdapter(subhecchaAdapter);
                    brtextView.setText("Dhakeshwari - Chandra");
                    break;

                case "Shuvojatra":
                    ArrayAdapter<String> shuvojatraAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShuvojatraRoute));
                    listView.setAdapter(shuvojatraAdapter);
                    brtextView.setText("Fulbaria - Manikganj");
                    break;

                case "Skyline":
                    ArrayAdapter<String> skylineAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SkylineRoute));
                    listView.setAdapter(skylineAdapter);
                    brtextView.setText("Sadarghat - Gazipur");
                    break;

                case "Somota Paribahan":
                    ArrayAdapter<String> somotaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SomotaRoute));
                    listView.setAdapter(somotaAdapter);
                    brtextView.setText("Chittagang Road - Chiriakhana");
                    break;

                case "Somoy":
                    ArrayAdapter<String> somoyAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SomoyRoute));
                    listView.setAdapter(somoyAdapter);
                    brtextView.setText("Sign Board - Mirpur 12");
                    break;

                case "Somoy Niyantran":
                    ArrayAdapter<String> somoyntrnAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SomoyniyantranRoute));
                    listView.setAdapter(somoyntrnAdapter);
                    brtextView.setText("Babu Bazar - Mirpur 12");
                    break;

                case "Supravat Special Service":
                    ArrayAdapter<String> supravatAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SupravatspRoute));
                    listView.setAdapter(supravatAdapter);
                    brtextView.setText("Sadarghat - Gazipur");
                    break;
                case "Swajan Paribahan":
                    ArrayAdapter<String>swajanAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SwajanRoute));
                    listView.setAdapter(swajanAdapter);
                    brtextView.setText("Sadarghat - Savar");
                    break;
                case "Tanjil Paribahan":
                    ArrayAdapter<String> tanjilAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TanjilRoute));
                    listView.setAdapter(tanjilAdapter);
                    brtextView.setText("Sadarghat - Chiriakhana");
                    break;
                case "Taranga Plus":
                    ArrayAdapter<String> tarangaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TarangaplusRoute));
                    listView.setAdapter(tarangaAdapter);
                    brtextView.setText("Banasree - Mohammadpur");
                    break;
                case "Tetuliya Paribahan":
                    ArrayAdapter<String> tetuliaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TetuliaRoute));
                    listView.setAdapter(tetuliaAdapter);
                    brtextView.setText("Shia Mosjid - Abdullahpur");
                    break;
                case "The New Vision":
                    ArrayAdapter<String> thenewvisionAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ThenewvisionRoute));
                    listView.setAdapter(thenewvisionAdapter);
                    brtextView.setText("Chiriakhana - Sayedabad");
                    break;
                case "Thikana":
                    ArrayAdapter<String> thikanaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ThikanaRoute));
                    listView.setAdapter(thikanaAdapter);
                    brtextView.setText("Sign Board - Chandra");
                    break;
                case "Trans Silva":
                    ArrayAdapter<String> transsilvaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TranssilvaRoute));
                    listView.setAdapter(transsilvaAdapter);
                    brtextView.setText("Jatrabari - Mirpur 1");
                    break;
                case "Trust Transport Service":
                    ArrayAdapter<String> trusttsAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TrustTSRoute));
                    listView.setAdapter(trusttsAdapter);
                    brtextView.setText("Mirpur DOHS - GPO");
                    break;
                case "Trust Transport Service 2":
                    ArrayAdapter<String> trustts2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TrustTS2Route));
                    listView.setAdapter(trustts2Adapter);
                    brtextView.setText("Mirpur 10 - Banani");
                    break;
                case "Turag":
                    ArrayAdapter<String>turagAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TuragRoute));
                    listView.setAdapter(turagAdapter);
                    brtextView.setText("Jatrabari - Tongi");
                    break;
                case "VIP 27":
                    ArrayAdapter<String> vipAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.VIP27Route));
                    listView.setAdapter(vipAdapter);
                    brtextView.setText("Azimpur - Gazipur");
                    break;
                case "Victor Classic":
                    ArrayAdapter<String>victorclassicAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.VictorclassicRoute));
                    listView.setAdapter(victorclassicAdapter);
                    brtextView.setText("Sadarghat - Dia Bari");
                    break;
                case "Victor Paribahan":
                    ArrayAdapter<String> victorpbAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.VictorPBRoute));
                    listView.setAdapter(victorpbAdapter);
                    brtextView.setText("Sadarghat - Kuril Bishwa Road");
                    break;
                case "Welcome":
                    ArrayAdapter<String> welcomeAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.WelcomeRoute));
                    listView.setAdapter(welcomeAdapter);
                    brtextView.setText("Motijheel - Nandan Park");
                    break;
                case "Winner Transport Co":
                    ArrayAdapter<String> winnerAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.WinnerRoute));
                    listView.setAdapter(winnerAdapter);
                    brtextView.setText("Azimpur - Kuril Bishwa Road");
                    break;
                case "Zarif":
                    ArrayAdapter<String>zarifAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ZarifRoute));
                    listView.setAdapter(zarifAdapter);
                    brtextView.setText("Kamalapur - Mirpur 14");
                    break;







            }
        }
        if(intent.hasExtra("rvbusname")){
            String rcvbname = intent.getStringExtra("rvbusname");
            textView.setText(rcvbname);
            switch (rcvbname) {
                case "Bahon":
                    ArrayAdapter<String> bahonAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BahonRoute));
                    listView.setAdapter(bahonAdapter);
                    brtextView.setText("Mirpur 14 - Khilgaon");

                    break;
                case "13 No":
                    ArrayAdapter<String> no13Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.no13Route));
                    listView.setAdapter(no13Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "6 No":
                    ArrayAdapter<String> no6Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.no6Route));
                    listView.setAdapter(no6Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "7 No":
                    ArrayAdapter<String> no7Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.no7Route));
                    listView.setAdapter(no7Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "8 No":
                    ArrayAdapter<String> no8Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.no8Route));
                    listView.setAdapter(no8Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Achim Paribahan":
                    ArrayAdapter<String>achimAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.achimRoute));
                    listView.setAdapter(achimAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Agradut":
                    ArrayAdapter<String> agradutAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.agradutROute));
                    listView.setAdapter(agradutAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Airport Bangabandhu Avenue":
                    ArrayAdapter<String> airportAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.airportBARoute));
                    listView.setAdapter(airportAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Akik Paribahan":
                    ArrayAdapter<String> akikAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.akikRoute));
                    listView.setAdapter(akikAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Al Modina Plus One":
                    ArrayAdapter<String> almodinaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.almodinaRoute));
                    listView.setAdapter(almodinaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Al Mokka Transport":
                    ArrayAdapter<String> almokkaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.almokkaROute));
                    listView.setAdapter(almokkaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Alif Enterprise":
                    ArrayAdapter<String> alifAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.alifRoute));
                    listView.setAdapter(alifAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Alif Enterprise 2":
                    ArrayAdapter<String> alif2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.alif2Route));
                    listView.setAdapter(alif2Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Alif Enterprise 3":
                    ArrayAdapter<String> alif3Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.alif3Route));
                    listView.setAdapter(alif3Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Alike":
                    ArrayAdapter<String> alikeAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.alikeRoute));
                    listView.setAdapter(alikeAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Anabil":
                    ArrayAdapter<String> anabilAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.anabilRoute));
                    listView.setAdapter(anabilAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Ashirbad Paribahan":
                    ArrayAdapter<String> ashirbadAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.AshirbadRoute));
                    listView.setAdapter(ashirbadAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "BRTC":
                    ArrayAdapter<String> brtcAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTCRoute));
                    listView.setAdapter(brtcAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Ashulia Classic":
                    ArrayAdapter<String> ashuliaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ashuliaRoute));
                    listView.setAdapter(ashuliaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Asmani Paribahan":
                    ArrayAdapter<String> asmaniAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.asmaniRoute));
                    listView.setAdapter(asmaniAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Ayat":
                    ArrayAdapter<String> ayatAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ayatRoute));
                    listView.setAdapter(ayatAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Azmery Glory":
                    ArrayAdapter<String> azmeriAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.azmeriRoute));
                    listView.setAdapter(azmeriAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "BRTC 2":
                    ArrayAdapter<String> brtc2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTC2Route));
                    listView.setAdapter(brtc2Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "BRTC 3":
                    ArrayAdapter<String> brtc3Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTC3Route));
                    listView.setAdapter(brtc3Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "BRTC 4":
                    ArrayAdapter<String> brtc4Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTC4Route));
                    listView.setAdapter(brtc4Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "BRTC 5":
                    ArrayAdapter<String> brtc5Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTC5Route));
                    listView.setAdapter(brtc5Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "BRTC 6":
                    ArrayAdapter<String> brtc6Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BRTC6Route));
                    listView.setAdapter(brtc6Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Balaka Paribahan":
                    ArrayAdapter<String> balakaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BalakaRoute));
                    listView.setAdapter(balakaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Basumati Transport":
                    ArrayAdapter<String> basumatiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BasumatiRoute));
                    listView.setAdapter(basumatiAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Best Transport":
                    ArrayAdapter<String> bestAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BestRoute));
                    listView.setAdapter(bestAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Bhuiyan Paribahan":
                    ArrayAdapter<String> bhuiyanAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BhuiyanRoute));
                    listView.setAdapter(bhuiyanAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Bihango Paribahan":
                    ArrayAdapter<String> bihangaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BihangaRoute));
                    listView.setAdapter(bihangaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Bihango Paribahan 2":
                    ArrayAdapter<String> bihanga2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.Bihanga2Route));
                    listView.setAdapter(bihanga2Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Bikalpo Auto Service":
                    ArrayAdapter<String> bikalpaautoAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BikalpoautoRoute));
                    listView.setAdapter(bikalpaautoAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Bikalpo City Super Service":
                    ArrayAdapter<String> bikalpacityAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BikalpocityRoute));
                    listView.setAdapter(bikalpacityAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Bikash Parihaban":
                    ArrayAdapter<String> bikashAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BikashRoute));
                    listView.setAdapter(bikashAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Boishakhi Paripahan":
                    ArrayAdapter<String> boishakhiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BoishakhiRoute));
                    listView.setAdapter(boishakhiAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Bondhu Paribahan":
                    ArrayAdapter<String> bondhuAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BondhuRoute));
                    listView.setAdapter(bondhuAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Bornomala Paribahan":
                    ArrayAdapter<String> bornomalaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BornomalaRoute));
                    listView.setAdapter(bornomalaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Brothers":
                    ArrayAdapter<String> brothersAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.BrothersRoute));
                    listView.setAdapter(brothersAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Cantonment Mini Service":
                    ArrayAdapter<String> cantonmentAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.CantonmentRoute));
                    listView.setAdapter(cantonmentAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Champion":
                    ArrayAdapter<String> championAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ChampionRoute));
                    listView.setAdapter(championAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "D Link":
                    ArrayAdapter<String> dlinkAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DlinkRoute));
                    listView.setAdapter(dlinkAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "D One Transport":
                    ArrayAdapter<String> doneAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DoneRoute));
                    listView.setAdapter(doneAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Dewan":
                    ArrayAdapter<String> dewanAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DewanRoute));
                    listView.setAdapter(dewanAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Dhaka Paribahan":
                    ArrayAdapter<String> dhakapbAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DhakaparibahanRoute));
                    listView.setAdapter(dhakapbAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Dhakar Chaka":
                    ArrayAdapter<String> dhakarchakaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DhakarchakaRoute));
                    listView.setAdapter(dhakarchakaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Dipon":
                    ArrayAdapter<String> diponAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DiponRoute));
                    listView.setAdapter(diponAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Dishari Paribahan":
                    ArrayAdapter<String> dishariAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DishariRoute));
                    listView.setAdapter(dishariAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Druti Paribahan":
                    ArrayAdapter<String> drutiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.DrutiRoute));
                    listView.setAdapter(drutiAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "ETC Transport":
                    ArrayAdapter<String> etcAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ETCRoute));
                    listView.setAdapter(etcAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Everest Paribahan":
                    ArrayAdapter<String> everestAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.EverestRoute));
                    listView.setAdapter(everestAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "FTCL":
                    ArrayAdapter<String> ftclAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.FTCLRoute));
                    listView.setAdapter(ftclAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "First Ten":
                    ArrayAdapter<String> firsttenAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.FirsttenRoute));
                    listView.setAdapter(firsttenAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Galaxy Line":
                    ArrayAdapter<String> galaxyAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.GalaxyRoute));
                    listView.setAdapter(galaxyAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Gazipur Paribahan":
                    ArrayAdapter<String> gazipurpbAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.GazipurparibahanRoute));
                    listView.setAdapter(gazipurpbAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Grameen":
                    ArrayAdapter<String> grameenAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.GrameenRoute));
                    listView.setAdapter(grameenAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Grameen Shubheccha":
                    ArrayAdapter<String> grameenSuvecchaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.grameensubecchaRoute));
                    listView.setAdapter(grameenSuvecchaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break; case "Green Dhaka":
                    ArrayAdapter<String> greendhakaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.greendhakaRoute));
                    listView.setAdapter(greendhakaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;


                case "Haji Transport":
                    ArrayAdapter<String> hajiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.HajiRoute));
                    listView.setAdapter(hajiAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Himachol":
                    ArrayAdapter<String> himacholAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.HimacholRoute));
                    listView.setAdapter(himacholAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Intercity":
                    ArrayAdapter<String> intercityAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.intercityRoute));
                    listView.setAdapter(intercityAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Itihas Paribahan":
                    ArrayAdapter<String> itihasAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ItehashRoute));
                    listView.setAdapter(itihasAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Itihas Paribahan 2":
                    ArrayAdapter<String> itihas2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.itehash2Route));
                    listView.setAdapter(itihas2Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "J M Super Paribahan":
                    ArrayAdapter<String> jmsuperAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.JMsuperRoute));
                    listView.setAdapter(jmsuperAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Jabale Nur Paribahan":
                    ArrayAdapter<String> jabalenurAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.JabalenurRoute));
                    listView.setAdapter(jabalenurAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Jabale Nur Paribahan 2":
                    ArrayAdapter<String> jabalenur2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.jabalenur2Route));
                    listView.setAdapter(jabalenur2Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Janjabil":
                    ArrayAdapter<String>janjabilAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.JanjabilRoute));
                    listView.setAdapter(janjabilAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Kanak":
                    ArrayAdapter<String> kanakAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.KanakRoute));
                    listView.setAdapter(kanakAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Khajababa Paribahan":
                    ArrayAdapter<String> khajababaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.KhajababaRoute));
                    listView.setAdapter(khajababaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Labbaik":
                    ArrayAdapter<String> labbaikAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.LabbaikRoute));
                    listView.setAdapter(labbaikAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Lams Paribahan":
                    ArrayAdapter<String> lamsAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.LamsRoute));
                    listView.setAdapter(lamsAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "MTCL 2":
                    ArrayAdapter<String> mtcl2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MTCL2Route));
                    listView.setAdapter(mtcl2Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Malancha Transport":
                    ArrayAdapter<String> malanchaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MalanchaRoute));
                    listView.setAdapter(malanchaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Manjil Express":
                    ArrayAdapter<String> manjilAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ManjilRoute));
                    listView.setAdapter(manjilAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Meghla Transport":
                    ArrayAdapter<String> meghlaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MeghlaRoute));
                    listView.setAdapter(meghlaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Meshkat Transport":
                    ArrayAdapter<String> meshkatAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MeshkatRoute));
                    listView.setAdapter(meshkatAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Midway":
                    ArrayAdapter<String> midwayAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MidwayRoute));
                    listView.setAdapter(midwayAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Mirpur Link":
                    ArrayAdapter<String> mirpurlinkAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MirpurlinkRoute));
                    listView.setAdapter(mirpurlinkAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Mirpur Link 2":
                    ArrayAdapter<String> mirpurlink2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.Mirpurlink2Route));
                    listView.setAdapter(mirpurlink2Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Mirpur Metro Service":
                    ArrayAdapter<String> mirpurmetroAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MirpurmetroRoute));
                    listView.setAdapter(mirpurmetroAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Mirpur United Service":
                    ArrayAdapter<String> mirpurunitedAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MirpurunitedRoute));
                    listView.setAdapter(mirpurunitedAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Modhumoti Paribahan":
                    ArrayAdapter<String> modhumotiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ModhumotiRoute));
                    listView.setAdapter(modhumotiAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Mohona":
                    ArrayAdapter<String> mohonaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MohonaRoute));
                    listView.setAdapter(mohonaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Moitri":
                    ArrayAdapter<String> moitriAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MoitriRoute));
                    listView.setAdapter(moitriAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Moumita Transport":
                    ArrayAdapter<String> moumitaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.MoumitaRoute));
                    listView.setAdapter(moumitaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Nilachol":
                    ArrayAdapter<String> nilacholAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.NilacholRoute));
                    listView.setAdapter(nilacholAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Nobokoli Paribahan":
                    ArrayAdapter<String> nobokoliAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.NobokoliRoute));
                    listView.setAdapter(nobokoliAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Nur E Mokka Paribahan":
                    ArrayAdapter<String> nuremokkaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.NuremokkaRoute));
                    listView.setAdapter(nuremokkaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Omama International":
                    ArrayAdapter<String> omamaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.OmamaRoute));
                    listView.setAdapter(omamaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "One Transport":
                    ArrayAdapter<String> onetAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.OneTransportRoute));
                    listView.setAdapter(onetAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Pallabi Super Service":
                    ArrayAdapter<String> pallabissAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.PallabiSuperRoute));
                    listView.setAdapter(pallabissAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Paristhan Paribahan":
                    ArrayAdapter<String> paristhanAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ParisthanRoute));
                    listView.setAdapter(paristhanAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Prattay":
                    ArrayAdapter<String>prattayAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.PrattayRoute));
                    listView.setAdapter(prattayAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Pravati Banasree Paribahan":
                    ArrayAdapter<String> pravatibsAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.PravatibsRoute));
                    listView.setAdapter(pravatibsAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Prochesta":
                    ArrayAdapter<String> prochestaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ProchestaRoute));
                    listView.setAdapter(prochestaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Projapoti Paribahan":
                    ArrayAdapter<String> prajapotiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ProjapotiRoute));
                    listView.setAdapter(prajapotiAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Rabrab Paribahan":
                    ArrayAdapter<String> rabrabAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RabrabRoute));
                    listView.setAdapter(rabrabAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;


                case "Raida":
                    ArrayAdapter<String> raidaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RaidaRoute));
                    listView.setAdapter(raidaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Raja City":
                    ArrayAdapter<String> rajacityAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RajacityRoute));
                    listView.setAdapter(rajacityAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Rajanigandha":
                    ArrayAdapter<String> rajanigandhaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RajanigandhaRoute));
                    listView.setAdapter(rajanigandhaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Rajdhani Super Service":
                    ArrayAdapter<String> rajdhaniAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RajdhaniRoute));
                    listView.setAdapter(rajdhaniAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Rangdhonu Paribahan":
                    ArrayAdapter<String> rangdhonuAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RangdhonuRoute));
                    listView.setAdapter(rangdhonuAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Roich":
                    ArrayAdapter<String> roichAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RoichRoute));
                    listView.setAdapter(roichAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Ramjan":
                    ArrayAdapter<String> ramjanAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RamjanRoute));
                    listView.setAdapter(ramjanAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Runway Express":
                    ArrayAdapter<String> runwayAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RunwayRoute));
                    listView.setAdapter(runwayAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Rupa Paribahan":
                    ArrayAdapter<String> rupaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RupaRoute));
                    listView.setAdapter(rupaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Rupkotha Paribahan":
                    ArrayAdapter<String> rupkothaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.RupkothaRoute));
                    listView.setAdapter(rupkothaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Safety Enterprise":
                    ArrayAdapter<String> safetyAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SafetyRoute));
                    listView.setAdapter(safetyAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Salsabil":
                    ArrayAdapter<String> salsabilAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SalsabilRoute));
                    listView.setAdapter(salsabilAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Savar Paribahan":
                    ArrayAdapter<String> savarAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SavarPBRoute));
                    listView.setAdapter(savarAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Shadhin":
                    ArrayAdapter<String> shadhinAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShadhinRoute));
                    listView.setAdapter(shadhinAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Shadhin Express":
                    ArrayAdapter<String> shadhinExAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShadhinexpressRoute));
                    listView.setAdapter(shadhinExAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;


                case "Shahria Enterprise":
                    ArrayAdapter<String> shahriaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShahriaRoute));
                    listView.setAdapter(shahriaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;


                case "Shatabdi Transport":
                    ArrayAdapter<String> shatabdiAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShatabdiRoute));
                    listView.setAdapter(shatabdiAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;


                case "Shikhar Paribahan":
                    ArrayAdapter<String>shikharAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShikharRoute));
                    listView.setAdapter(shikharAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;


                case "Shikor Paribahan":
                    ArrayAdapter<String> shikorAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShikorRoute));
                    listView.setAdapter(shikorAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Shubheccha":
                    ArrayAdapter<String> subhecchaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShubhecchaRoute));
                    listView.setAdapter(subhecchaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Shuvojatra":
                    ArrayAdapter<String> shuvojatraAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ShuvojatraRoute));
                    listView.setAdapter(shuvojatraAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Skyline":
                    ArrayAdapter<String> skylineAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SkylineRoute));
                    listView.setAdapter(skylineAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Somota Paribahan":
                    ArrayAdapter<String> somotaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SomotaRoute));
                    listView.setAdapter(somotaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Somoy":
                    ArrayAdapter<String> somoyAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SomoyRoute));
                    listView.setAdapter(somoyAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Somoy Niyantran":
                    ArrayAdapter<String> somoyntrnAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SomoyniyantranRoute));
                    listView.setAdapter(somoyntrnAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;

                case "Supravat Special Service":
                    ArrayAdapter<String> supravatAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SupravatspRoute));
                    listView.setAdapter(supravatAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Swajan Paribahan":
                    ArrayAdapter<String>swajanAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.SwajanRoute));
                    listView.setAdapter(swajanAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Tanjil Paribahan":
                    ArrayAdapter<String> tanjilAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TanjilRoute));
                    listView.setAdapter(tanjilAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Taranga Plus":
                    ArrayAdapter<String> tarangaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TarangaplusRoute));
                    listView.setAdapter(tarangaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Tetuliya Paribahan":
                    ArrayAdapter<String> tetuliaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TetuliaRoute));
                    listView.setAdapter(tetuliaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "The New Vision":
                    ArrayAdapter<String> thenewvisionAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ThenewvisionRoute));
                    listView.setAdapter(thenewvisionAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Thikana":
                    ArrayAdapter<String> thikanaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ThikanaRoute));
                    listView.setAdapter(thikanaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Trans Silva":
                    ArrayAdapter<String> transsilvaAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TranssilvaRoute));
                    listView.setAdapter(transsilvaAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Trust Transport Service":
                    ArrayAdapter<String> trusttsAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TrustTSRoute));
                    listView.setAdapter(trusttsAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Trust Transport Service 2":
                    ArrayAdapter<String> trustts2Adapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TrustTS2Route));
                    listView.setAdapter(trustts2Adapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Turag":
                    ArrayAdapter<String>turagAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.TuragRoute));
                    listView.setAdapter(turagAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "VIP 27":
                    ArrayAdapter<String> vipAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.VIP27Route));
                    listView.setAdapter(vipAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Victor Classic":
                    ArrayAdapter<String>victorclassicAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.VictorclassicRoute));
                    listView.setAdapter(victorclassicAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Victor Paribahan":
                    ArrayAdapter<String> victorpbAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.VictorPBRoute));
                    listView.setAdapter(victorpbAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Welcome":
                    ArrayAdapter<String> welcomeAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.WelcomeRoute));
                    listView.setAdapter(welcomeAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Winner Transport Co":
                    ArrayAdapter<String> winnerAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.WinnerRoute));
                    listView.setAdapter(winnerAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
                case "Zarif":
                    ArrayAdapter<String>zarifAdapter = new ArrayAdapter<String>(RouteDetails.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ZarifRoute));
                    listView.setAdapter(zarifAdapter);
                    brtextView.setText("Mohammadpur - Azimpur");
                    break;
            }
        }


    }

    @Override
    public void onClick(View v) {
        
    }
}