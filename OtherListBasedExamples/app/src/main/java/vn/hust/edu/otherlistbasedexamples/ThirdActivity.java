package vn.hust.edu.otherlistbasedexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    List<ContactModel> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        contacts = new ArrayList<>();
        contacts.add(new ContactModel("Gmail 1", R.drawable.thumb1, true));
        contacts.add(new ContactModel("Gmail 2", R.drawable.thumb2, true));
        contacts.add(new ContactModel("Gmail 3", R.drawable.thumb3, false));
        contacts.add(new ContactModel("Gmail 4", R.drawable.thumb4, true));
        contacts.add(new ContactModel("Gmail 5", R.drawable.thumb5, false));
        contacts.add(new ContactModel("Gmail 6", R.drawable.thumb6, false));
        contacts.add(new ContactModel("Gmail 7", R.drawable.thumb7, false));
        contacts.add(new ContactModel("Gmail 8", R.drawable.thumb8, true));
        contacts.add(new ContactModel("Gmail 9", R.drawable.thumb9, false));
        contacts.add(new ContactModel("Gmail 10", R.drawable.thumb10, true));
        contacts.add(new ContactModel("Gmail 11", R.drawable.thumb11, false));
        contacts.add(new ContactModel("Gmail 12", R.drawable.thumb12, true));
        contacts.add(new ContactModel("Gmail 13", R.drawable.thumb13, false));
        contacts.add(new ContactModel("Gmail 14", R.drawable.thumb14, false));
        contacts.add(new ContactModel("Gmail 15", R.drawable.thumb15, true));

        ContactAdapter adapter = new ContactAdapter(contacts);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
