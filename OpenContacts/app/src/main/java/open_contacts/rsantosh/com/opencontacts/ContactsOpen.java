package open_contacts.rsantosh.com.opencontacts;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.service.voice.VoiceInteractionSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactsOpen extends AppCompatActivity implements View.OnClickListener {

    //Declaration of variables.
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_open);

        //Initialisation of variables.
        mButton= (Button) findViewById(R.id.contacts_open);

        //Setting click listener to the button.
        mButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        //Switch case.
        switch(view.getId()){

            //This case has been written to open the contacts from the phone using intent.
            case R.id.contacts_open:

                Intent iContacts = new Intent(Intent.ACTION_PICK ,  ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(iContacts.createChooser(iContacts,"CONTACT_NUMBER"),1 );
                break;

        }
    }
}
