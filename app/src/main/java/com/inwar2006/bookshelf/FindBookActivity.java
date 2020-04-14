package com.inwar2006.bookshelf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBookActivity extends AppCompatActivity {

    private BookExpert bookExpert = new BookExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_book);
    }

    public void onClickFindBook(View view){
        TextView bookMonitor = (TextView) findViewById(R.id.monitor);
        Spinner type = (Spinner) findViewById(R.id.directions);
        String bookType = String.valueOf(type.getSelectedItem());
        List<String> typeList = bookExpert.getTypes(bookType);
        StringBuilder typesFormatted = new StringBuilder();
        for(String book: typeList){
            typesFormatted.append(book).append('\n');
        }
        bookMonitor.setText(typesFormatted);
    }
}
