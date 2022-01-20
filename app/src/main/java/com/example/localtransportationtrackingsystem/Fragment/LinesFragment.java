package com.example.localtransportationtrackingsystem.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.localtransportationtrackingsystem.R;
import com.example.localtransportationtrackingsystem.RouteDetails;

public class LinesFragment extends Fragment {

  private String[] busitems= {"13 No","6 No","7 No","8 No","Achim Paribahan","Agradut","Airport Bangabandhu Avenue","Akik Paribahan",
          "Al Modina Plus One","Al Mokka Transport","Alif Enterprise","Alif Enterprise 2","Alif Enterprise 3","Alike",
          "Anabil","Ashirbad Paribahan","Ashulia Classic","Asmani Paribahan","Ayat","Azmery Glory","BRTC","BRTC 2","BRTC 3","BRTC 4","BRTC 5","BRTC 6",
          "Bahon","Balaka Paribahan","Basumati Transport","Best Transport","Bhuiyan Paribahan","Bihango Paribahan","Bihango Paribahan 2",
          "Bikalpo Auto Service","Bikalpo City Super Service","Bikash Parihaban","Boishakhi Paripahan","Bondhu Paribahan","Bornomala Paribahan",
          "Brothers","Cantonment Mini Service","Champion","D Link","D One Transport","Dewan","Dhaka Paribahan","Dhakar Chaka","Dipon",
          "Dishari Paribahan","Druti Paribahan","ETC Transport","Everest Paribahan","FTCL","First Ten","Galaxy Line","Gazipur Paribahan",
          "Grameen","Grameen Shubheccha","Green Dhaka","Haji Transport","Himachol","Intercity","Itihas Paribahan","Itihas Paribahan 2",
          "J M Super Paribahan","Jabale Nur Paribahan","Jabale Nur Paribahan 2","Janjabil","Kanak","Khajababa Paribahan","Labbaik",
          "Lams Paribahan","MTCL 2","Malancha Transport","Manjil Express","Meghla Transport","Meshkat Transport","Midway","Mirpur Link",
          "Mirpur Link 2","Mirpur Metro Service","Mirpur United Service","Modhumoti Paribahan","Mohona","Moitri","Moumita Transport",
          "Nilachol","Nobokoli Paribahan","Nur E Mokka Paribahan","Omama International","One Transport","Pallabi Super Service",
          "Paristhan Paribahan","Prattay","Pravati Banasree Paribahan","Prochesta","Projapoti Paribahan","Rabrab Paribahan","Raida",
          "Raja City","Rajanigandha","Rajdhani Super Service","Rangdhonu Paribahan","Roich","Ramjan","Runway Express","Rupa Paribahan",
          "Rupkotha Paribahan","Safety Enterprise","Salsabil","Savar Paribahan","Shadhin","Shadhin Express","Shahria Enterprise",
          "Shatabdi Transport","Shikhar Paribahan","Shikor Paribahan","Shubheccha","Shuvojatra","Skyline","Somota Paribahan","Somoy",
          "Somoy Niyantran","Supravat Special Service","Swajan Paribahan","Tanjil Paribahan","Taranga Plus","Tetuliya Paribahan",
          "The New Vision","Thikana","Trans Silva","Trust Transport Service","Trust Transport Service 2","Turag","VIP 27","Victor Classic",
          "Victor Paribahan","Welcome","Winner Transport Co","Zarif"

  };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_lines, container, false);
        final ListView listView= (ListView) view.findViewById(R.id.allBusListView);

        ArrayAdapter<String> listViewAdapter;
        listViewAdapter = new ArrayAdapter<String>(
                getContext(), R.layout.single_bus_row, R.id.busTextView, busitems
        );

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent= new Intent(getActivity(), RouteDetails.class);
                intent.putExtra("Bus Name", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

        listView.setAdapter(listViewAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}