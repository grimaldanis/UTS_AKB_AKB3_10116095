package com.example.tugasuts;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


public class fragment_teman extends Fragment  {
   // ListView lv;
   // ArrayAdapter<String> adapter;
   // crud crud  =new crud();
   // FragmentActivity listener;

    //Dialog d = new Dialog ();


  /*  public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Activity){
            this.listener  = (FragmentActivity) context;
        }
    }*/
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teman, container, false);
       /* Toolbar toolbar = (Toolbar)  view.findViewById(R.id.toolbar2);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        lv= (ListView) view.findViewById(R.id.lv);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(d != null) {
                    if(!d.isShowing())
                    {

                        displayInputDialog(i);
                    }else
                    {
                        d.dismiss();
                    }
                }
            }
        });

        final FloatingActionButton fab =  view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayInputDialog(-1);
            }
        });*/



        return view;
    }


    /*private void displayInputDialog(final int pos)
    {
        d.setTitle("LISTVIEW CRUD");
        d.setContentView(R.layout.inputdialog);

        final EditText nameEditTxt= d.findViewById(R.id.nameEditText);
        Button addBtn=  d.findViewById(R.id.addBtn);
        Button updateBtn=  d.findViewById(R.id.updateBtn);
        Button deleteBtn=  d.findViewById(R.id.deleteBtn);

        if(pos== -1)
        {
            addBtn.setEnabled(true);
            updateBtn.setEnabled(false);
            deleteBtn.setEnabled(false);
        }else
        {
            addBtn.setEnabled(true);
            updateBtn.setEnabled(true);
            deleteBtn.setEnabled(true);
            nameEditTxt.setText(crud.getNames().get(pos));
        }

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //GET DATA
                String name=nameEditTxt.getText().toString();

                //VALIDATE
                if(name.length()>0 && name != null)
                {
                    //save
                    crud.save(name);
                    nameEditTxt.setText("");
                    adapter=new ArrayAdapter<String>(listener,android.R.layout.simple_list_item_1,crud.getNames());
                    lv.setAdapter(adapter);

                }else
                {
                    Toast.makeText(listener, "Name cannot be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //GET DATA
                String newName=nameEditTxt.getText().toString();

                //VALIDATE
                if(newName.length()>0 && newName != null)
                {
                    //save
                    if(crud.update(pos,newName))
                    {
                        nameEditTxt.setText(newName);
                        adapter=new ArrayAdapter<String>(listener,android.R.layout.simple_list_item_1,crud.getNames());
                        lv.setAdapter(adapter);
                    }

                }else
                {
                    Toast.makeText(listener, "Name cannot be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //DELETE
                if( crud.delete(pos))
                {
                    nameEditTxt.setText("");
                    adapter=new ArrayAdapter<String>(listener,android.R.layout.simple_list_item_1,crud.getNames());
                    lv.setAdapter(adapter);
                }
            }
        });

        d.show();
    }

    @Override
    public void onClick(View v) {

    }*/
}
