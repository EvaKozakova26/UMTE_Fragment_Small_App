package cz.uhk.fim.kozakev1.fragmentsmallapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SubjectFragment extends Fragment {


    public SubjectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_subject, container, false);
        TextView txtSubjects = view.findViewById(R.id.txtViewSubjects);
        // Inflate the layout for this fragment

        if (getArguments().getInt("type") == R.id.btnSubjectKIKM) {
            txtSubjects.setText("predmety kikm");
        }
        if (getArguments().getInt("type") == R.id.btnSubjectsKIT) {
            txtSubjects.setText("predmety kit");
        }
        if (getArguments().getInt("type") == R.id.btnSubjectKAL) {
            txtSubjects.setText("predmety kal");
        }

        return view;
    }

}
