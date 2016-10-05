package edu.kvcc.cis298.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        // >Get the current fragment from the frame layout. When the
        // >app starts there is no fragment in the frame layout so
        // >it will return null.
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        // >If the fragment is null, make a new crime fragment. Add that
        // >fragment to the container.
        if (fragment == null) {
            fragment = new CrimeFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }


    }


}
