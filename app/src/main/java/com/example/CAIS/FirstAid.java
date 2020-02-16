package com.example.CAIS;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FirstAid extends AppCompatActivity {


    ListView listView;
    String mTitle[]={"Allergic Reaction","Asthma Attack","Burns","Chest Pain","Choking","Diabetic Emergency"};
    String mDescription[]={"Allergic Reaction Description","Asthma Attack Description","Burns Description","Chest Pain Description","Choking Description","Diabetic Emergency Description"};
    int images[]={R.drawable.allergic};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);
        listView=findViewById(R.id.first_aid);
        MyAdapter adapter=new MyAdapter(c.this,mTitle,mDescription,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Toast.makeText(FirstAid.this,"Allergic Reaction Description",Toast.LENGTH_SHORT).show();
                }
                if(position==0)
                {
                    Toast.makeText(FirstAid.this,"Asthma Attack Description",Toast.LENGTH_SHORT).show();
                }
                if(position==0)
                {
                    Toast.makeText(FirstAid.this,"Burns Description",Toast.LENGTH_SHORT).show();
                }
                if(position==0)
                {
                    Toast.makeText(FirstAid.this,"Chest Pain Description",Toast.LENGTH_SHORT).show();
                }
                if(position==0)
                {
                    Toast.makeText(FirstAid.this,"Choking Description",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];
        MyAdapter(Context c,String title[],String description[],int imgs[]){
            super(c,R.layout.row,R.id.textview1,title);
            this.context=c;
            this.rTitle=title;
            this.rDescription=description;
            this.rImgs=imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textview1);
            TextView myDescription = row.findViewById(R.id.textview2);
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            return row;
        }
    }
}
