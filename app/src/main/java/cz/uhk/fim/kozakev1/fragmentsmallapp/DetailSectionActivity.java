package cz.uhk.fim.kozakev1.fragmentsmallapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DetailSectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_section);

       int section = getIntent().getIntExtra("section", 0);

        switch (section) {
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
            case R.id.btnOptions:
                OptionsFragment optionsFragment = new OptionsFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, optionsFragment) // kam to chci a co
                        .commit();
                break;
            case R.id.btnSubjectKIKM:
            case R.id.btnSubjectsKIT:
            case R.id.btnSubjectKAL:
                SubjectFragment subjectFragment = new SubjectFragment();


                Bundle bundle = new Bundle();
                bundle.putInt("type", section); // vezme id tlacitka
                subjectFragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, subjectFragment) // kam to chci a co
                        .commit();
                break;
        }

    }
}
