package com.inwar2006.bookshelf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_book);
    }

    public void onClickFindBook(View view){
        TextView kinds = (TextView) findViewById(R.id.kind);
        Spinner type = (Spinner) findViewById(R.id.directions);
        String bookType = String.valueOf(type.getSelectedItem());
        kinds.setText(bookType);
    }
}
