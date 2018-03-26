package cz.uhk.fim.kozakev1.fragmentsmallapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListFragment.OnMenuItemSelectedInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // udalosti volam z aktivity, ne z fragmentu
       ListFragment fragmentList = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentList);
       fragmentList.setOnMenuItemSelectedInterface(this);

    }

    public void onMenuItemSelected(View view) {
        switch (view.getId()) {
            case R.id.btnExams:
                ExamFragment examFragment = new ExamFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, examFragment) // kam to chci a co
                        .commit();

                break;
            case R.id.btnTeachers:
                TeacherFragment teacherFragment = new TeacherFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, teacherFragment) // kam to chci a co
                        .commit();
                break;
            case R.id.btnSubjects:
                // TODO - detail fragment s predmetem
                SubjectFragment subjectFragment = new SubjectFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, subjectFragment) // kam to chci a co
                        .commit();
                break;
            case R.id.btnOptions:
                OptionsFragment optionsFragment = new OptionsFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, optionsFragment) // kam to chci a co
                        .commit();
                break;
        }
    }
}
