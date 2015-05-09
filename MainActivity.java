package brigade.baka.testproject;
import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.app.Activity;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.R.id;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends ActionBarActivity {

    private EditText listVar;
    private TextView textOut;
    private Button button;
    private ListView movie;
    private List<String> savedArray = new ArrayList<String>();
  //  private String[] useArray = {};
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
   // private List<Movie> myMovies = new ArrayList<Movie>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,savedArray);
        ListView myList=(ListView)
        findViewById(R.id.movie);
        myList.setAdapter(myAdapter);
    }
    public void getInfo(View v){
        listVar = (EditText) findViewById(R.id.editText);
        textOut= (TextView) findViewById(R.id.textOutput);
        savedArray.add(listVar.getText().toString());
    }


    public boolean redButtonOnClick(View v){
        Button button=(Button) v;
        ((Button) v).setText("You died");
        return true;
    }
    public boolean blueButtonOnClick(View v){
        Button button=(Button) v;
        ((Button) v).setText("You still died.");
        return true;
    }

   //GOOD ONE
   public void listOnClick(View v){
        listVar = (EditText) findViewById(R.id.editText);
        textOut= (TextView) findViewById(R.id.textOutput);
        textOut.setText("Welcome to heaven "+listVar.getText());
        getInfo(v);
   //     addList(v, listVar.getText());
    }
    //Test reading file
  /* public void addWord(View v){
    //   listVar = (EditText) findViewById(R.id.editText);
     //  textOut= (TextView) findViewById(R.id.textOutput);
       textOut.setText("Welcome to heaven "+ readFile());
   }
*/


 /*    public void changeScreen(View v){
         Intent intent = new Intent(this,DisplayMessageActivity.class);
         EditText editText = (EditText) findViewById(R.id.edit_message);
         String message = editText.getText().toString();
         intent.putExtra(EXTRA_MESSAGE, message);
         startActivity(intent);
     }
    public String readFile(){
        Scanner in = new Scanner(("list.txt"));
        String word;
        word = in.next();
        return word;
    }

*/

/*    public void addList(View v, android.text.Editable a){
        int length = savedArray.length;
        System.arraycopy(savedArray,0, useArray, 0, savedArray.length + 1);
        useArray[savedArray.length] = a;

    }
*/


   /* public void readFile(View v) throws IOException, JSONException {
        FileInputStream fis =openFileInput("list");
        BufferedInputStream bis = new BufferedInputStream(fis);
        StringBuffer b = new StringBuffer();
        while(bis.available() != 0){
            char c = (char) bis.read();
            b.append(c);
        }
        bis.close();
        fis.close();
        JSONArray data = new JSONArray(b.toString());
        StringBuffer toursBuffer = new StringBuffer();
        for(int i =0; i<data.length();i++){
            String tour = data.getJSONObject(i).getString("tour");
            toursBuffer.append(tour+"\n");

        }
        UIHelper.displayText(this, R.id.fileText, toursBuffer.toString());
   */ //}
/**    public void enterList(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listVar=(EditText) findViewById(R.id.);
        textOut=(TextView) findViewById(R.id.textOut);
        button=(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                textOut.setText("You have added " +listVar);
            }
        }
    }**/


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
}
