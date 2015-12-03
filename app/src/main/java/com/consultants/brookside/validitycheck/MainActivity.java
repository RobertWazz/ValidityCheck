package com.consultants.brookside.validitycheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mValidateRegistrationButton;

    private String mFirstName;
    private String mLastName;
    private String mAddress;
    private String mCity;
    private String mBirthYear;
    private Integer mCount;

    private EditText mFirstNameEditText;
    private EditText mLastNameEditText;
    private EditText mAddressEditText;
    private EditText mCityEditText;
    private EditText mBirthYearEditText;
    private TextView mFirstNameView;
    private TextView mLastNameView;
    private TextView mAddressView;
    private TextView mCityView;
    private TextView mBirthYearView;
    private TextView mCountView;


    private static final String TAG = "QuizActivity";
    private static final String KEY_INDEX = "Index";

    private static final String KEY_FirstName = "FirstName";
    private static final String KEY_LastName = "LastName";
    private static final String KEY_Address = "Address";
    private static final String KEY_City = "City";
    private static final String KEY_BirthYear = "BirthYear";
    private static final String KEY_Count = "Count";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mValidateRegistrationButton = (Button) findViewById(R.id.valid_registration_button);

        mValidateRegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.find_valid_registraion, Toast.LENGTH_SHORT).show();
            }
        });

        mFirstNameEditText = (EditText) findViewById(R.id.editFirstName);
        mLastNameEditText = (EditText) findViewById(R.id.editLastName);
        mCityEditText = (EditText) findViewById(R.id.editAddress);
        mAddressEditText = (EditText) findViewById(R.id.editCity);
        mBirthYearEditText = (EditText) findViewById(R.id.editBirthYear);
        mFirstNameView = (TextView) findViewById(R.id.viewFirstName);
        mLastNameView = (TextView) findViewById(R.id.viewLastName);
        mCityView = (TextView) findViewById(R.id.viewAddress);
        mAddressView = (TextView) findViewById(R.id.viewCity);
        mBirthYearView = (TextView) findViewById(R.id.viewBirthYear);
        mCountView = (TextView) findViewById(R.id.count_view);


        if (savedInstanceState != null) {
            mLastName = savedInstanceState.getString(KEY_LastName, "Enter Last Name");
            mLastNameEditText.setText(mLastName);
            mLastNameView.setText(mLastName);
            mCount = savedInstanceState.getInt(KEY_Count,0);
            mCountView = (TextView) findViewById(R.id.count_view);
            mCount++;
            mCountView.setText(mCount.toString());
            // A Change
        } else
        {
            mCount = 0;
            mCountView.setText(mCount.toString());
        }

        AddTextChageListeners();


        }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSaveInstanceState");
//        savedInstanceState.putInt(KEY_INDEX, mCurrentIndex);
        savedInstanceState.putString(KEY_LastName, mLastName);

        savedInstanceState.putInt(KEY_Count,mCount.intValue() );

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    void AddTextChageListeners() {
        mFirstNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFirstName = s.toString();
                mFirstNameView.setText(mFirstName);
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        mLastNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mLastName = s.toString();
                mLastNameView.setText(mLastName);
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        mAddressEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mAddress = s.toString();
                mAddressView.setText(mAddress);
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        mCityEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCity = s.toString();
                mCityView.setText(mCity);
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        mBirthYearEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mBirthYear = s.toString();
                mBirthYearView.setText(mBirthYear);
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}

