package cz.uhk.fim.kozakev1.fragmentsmallapp;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class OptionsFragment extends Fragment {


    public OptionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_options, container, false);

        final EditText textLogin = view.findViewById(R.id.editTextLogin);
        final EditText textPassword = view.findViewById(R.id.editTextPassword);
        Button btnSave = view.findViewById(R.id.btnSave);
       final SharedPreferences sharedPreferences = getActivity().getSharedPreferences("settings", Context.MODE_PRIVATE);

        textLogin.setText(sharedPreferences.getString("login", ""));
        textPassword.setText(sharedPreferences.getString("pass", ""));

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = textLogin.getText().toString();
                String pass = textPassword.getText().toString();

                Toast.makeText(getContext(), login + pass, Toast.LENGTH_SHORT).show();


                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("login", login);
                editor.putString("pass", pass);
                editor.commit();

            }
        });


        return view;
    }

}
