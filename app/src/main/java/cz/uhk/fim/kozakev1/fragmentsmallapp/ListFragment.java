package cz.uhk.fim.kozakev1.fragmentsmallapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment implements View.OnClickListener {

    // main activita, do které potřebuju propojit muj interface (resp. metodu)
    private OnMenuItemSelectedInterface onMenutemSelectedInterface;

    public ListFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        // obecna onLCokc metoda, kde rozlisuju ID
        view.findViewById(R.id.btnExams).setOnClickListener(this);
        view.findViewById(R.id.btnTeachers).setOnClickListener(this);
        view.findViewById(R.id.btnOptions).setOnClickListener(this);
        view.findViewById(R.id.btnSubjectKIKM).setOnClickListener(this);
        view.findViewById(R.id.btnSubjectsKIT).setOnClickListener(this);
        view.findViewById(R.id.btnSubjectKAL).setOnClickListener(this);



        return view;
    }


    public void setOnMenuItemSelectedInterface(OnMenuItemSelectedInterface onMenutemSelectedInterface) {
        this.onMenutemSelectedInterface = onMenutemSelectedInterface;
    }

    @Override
    public void onClick(View view) {
    onMenutemSelectedInterface.onMenuItemSelected(view);

        //TODO - propasovat do aktivity - komunikace z fr do act  - pomocí interface

    }

    public interface OnMenuItemSelectedInterface {
        void onMenuItemSelected(View view);

    }
}
