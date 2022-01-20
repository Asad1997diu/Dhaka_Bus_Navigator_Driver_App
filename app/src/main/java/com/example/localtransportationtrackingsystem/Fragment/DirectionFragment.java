package com.example.localtransportationtrackingsystem.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.localtransportationtrackingsystem.AfterSearchActivity;
import com.example.localtransportationtrackingsystem.R;

public class DirectionFragment extends Fragment {
    private static final String[] Routes= new String[]{
            "Airport","Azampur","Abdullahpur","Aminbazar","Asad Gate","Ansar Camp","Aarong","Agargaon","Azimpur",
            "Arambag","Adabor","Adamjee College","Ashulia","Ashulia Bazar",
            "Bangla Motor","Banani","Bangla College","Bata Signal","Badda","Bashtola","Bijoy Sarani",
            "Bhulta","Bakshi Bazar","Babu Bazar","Barmi","Banasree","Baipayl","Bosila",
            "Basabo","Bashundhara","Bhashantek","Bashundhara R/A","Birulia","Beribadh",
            "Chairman Bari","College Gate","City College","Chiriakhana","Chandra","Chashara","Chankhar Pul","Chittagang Road",
            "CMH","Darussalam","Dayaganj Road","Dhanmondi 27","Dhanmondi 32","Dhamrai",
            "Dhanmondi 15","Dhakeshwari","Duaripara","Daynik Bangla Mor","Demra","Demra Staff Quarter","Dholaipar","Diabari","Dhour",
            "Dania","ECB Chattar","Elephant Road","Farmgate","Fulbaria","Fakirapul","Fantasy Kingdom","300 Feet",
            "Gulisthan","GPO","Gabtoli","Golap Shah Mazar","Gazipur","Gulshan Bridge","Gulshan 1","Gulshan 2",
            "Gandaria","Golapbag","Garrison","High Court","House Building","Hemayetpur","Hazaribag","Hatir Jheel",
            "Ittefaq","Jasimuddin","Jahangir Gate","Jamuna Future Park","Jatrabari","Jonopath","Jalkuri","Jigatola","Joydevpur",
            "Japan Garden City","Jurain","Jamgora","Kawran Bazar","Kuril Bishwa Road","Khilkhet","Kakoli",
            "Kallayanpur","Khamarbari","Kakrail","Kalshi","Katabon","Konabari","Kazipara","Kalabagan","Kamalapur",
            "Kanchpur","Khilgaon","Khilgaon Flyover","Kamarpara","Kodomtoli","Keraniganj",
            "Kochukhet","Kalampur","Kazla","Konabari","Kamrangirchar","Mazar Road","Motijheel","Motsho Bhobon",
            "Mohakhali","MES","Mirpur 1","Mirpur 2","Mirpur 10", "Mirpur 12","Mirpur 11","Mirpur 14","Moghbazar",
            "Mouchak","Malibagh Mor","Merul","Madhya Badda","Malibagh","Mohammadpur","Madanpur","Manik Nagar","Mirpur DOHS",
            "Mugdapara","Mill Gate","Manik Nagar","Mawa","Mograpara","Meghna Ghat","Matikata Road","Mirpur Cantonment","Mirpur 13","Matuail",
            "Mitford Ghat","Nabisko","Naya Bazar","Natun Bazar","Nadda","Nilkhet","New Market","Nobinagar","Nandan Park","Narayonganj",
            "Nawabganj","Paltan","Press Club","Postogola","Purobi","Pallabi",
            "Panthapath","Proshika Mor","Paturia","Rajlakshmi","Ray Shaheb Bazar","Rampura","Rampura Bridge",
            "Rajarbagh","Ring Road","Rupnagar","Rayerbag","Rayer Bazar","Rupnagar Abashik Mor","Shahbag","Shaheen College","Staff Road",
            "Station Road","Shibbari","Shainik Club","Savar","Shyamoli","Shishu mela","Sony Hall","Satrasta","Shantinagar",
            "Science Lab","Sadarghat","Shahjadpur","Sara 11","Shewrapara","Sayedabad","Shibu Market","Sign Board","Shonir Akhra",
            "Shankar","Star kabab","Sreepur","Shia Masjid","Sreepur","Signal","Saddam Market","Sikdar Medical","Section",
            "Showari Ghat","Shiyal Bari","Tongi","Technical","Tolarbag","Taltola","Tajmalahal Road",
            "Tikatuli","TT para","Uttar Badda Bazar","Wireless Mor","Workshop","Ziya Uddan","Zirabo"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_direction, container, false);


        Button button= (Button) view.findViewById(R.id.searchbutton);
        final AutoCompleteTextView sourceACTV =(AutoCompleteTextView) view.findViewById(R.id.sourceedittext);
        final AutoCompleteTextView destinationACTV=(AutoCompleteTextView) view.findViewById(R.id.destinationedittext);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line,Routes);
        sourceACTV.setAdapter(adapter);
        destinationACTV.setAdapter(adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et = sourceACTV.getText().toString() + " " + destinationACTV.getText().toString();
                String srcet = sourceACTV.getText().toString();
                String dstet = destinationACTV.getText().toString();


                if((srcet.length() ==2 ) || (dstet.length() == 2))
                {
                    Toast.makeText(getActivity(), "Please enter correct source and destination", Toast.LENGTH_SHORT).show();
                }
                else if((srcet.length() ==1 ) || (dstet.length() == 1))

                {
                    Toast.makeText(getActivity(), "Please enter correct source and destination", Toast.LENGTH_SHORT).show();
                }

                else if (srcet.isEmpty() || dstet.isEmpty())
                {
                    Toast.makeText(getActivity(), "Please enter your source and destination", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(getActivity(), AfterSearchActivity.class);
                    intent.putExtra("InputedET", et);
                    intent.putExtra("sACTV", srcet);
                    intent.putExtra("dACTV", dstet);
                    startActivity(intent);
                }
            }
        });

        return view;
    }

    protected void setupParent(View view){
        if(!(view instanceof EditText)){
            view.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    hidekeyboard(view);
                    return false;
                }
            });
        }
    }



    public void hidekeyboard(View view) {
        InputMethodManager inputMethodManager= (InputMethodManager)getActivity().getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(),0);
    }


}