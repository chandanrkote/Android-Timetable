package com.example.chandanrkote.chandanpro;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import javax.security.auth.Subject;

import static android.os.Build.VERSION_CODES.O;

public class Mainsub extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsub);

        setupUIViews();
        initToolbar();
        setupListView();
    }


    private void setupUIViews() {
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.ToolbarSub);
        listView = (ListView) findViewById(R.id.lvSub);
    }

    private void initToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Subjects");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private void setupListView(){
        String[] subject=getResources().getStringArray(R.array.Subject);

        SubAdapter adapter=new SubAdapter(this,R.layout.subactivitysingleitem, subject);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:break;
                    case 5:break;
                    default:break;

                }
            }
        });
    }


    public class  SubAdapter extends ArrayAdapter{

        private int resource;
        private LayoutInflater layoutInflater;
        private  String[] subject=new String[]{};

        public SubAdapter(Context context, int resource, String[] objects) {
            super(context, resource,objects);
            this.resource=resource;
            this.subject=objects;
            layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public View getView(int position, View convertView,  ViewGroup parent) {
             ViewHolder holder;
             if(convertView==null){
                 holder=new ViewHolder();
                 convertView=layoutInflater.inflate(resource,null);
                 holder.ivLogo=(LetterImageView)convertView.findViewById(R.id.ivLetter2);
                 holder.tvSub=(TextView)convertView.findViewById(R.id.tvSub);
                 convertView.setTag(holder);
             }else {
                 holder=(ViewHolder)convertView.getTag();
             }

             holder.ivLogo.setOval(true);
             holder.ivLogo.setLetter(subject[position].charAt(0));
             holder.tvSub.setText(subject[position]);


             return convertView;
        }



        class ViewHolder{
            private LetterImageView ivLogo;
            private TextView tvSub;
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home : {
                onBackPressed();
            }
        }
        return super.onOptionsItemSelected(item);
    }

}

