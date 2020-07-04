package com.example.nabda;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Dialog extends AppCompatDialogFragment {
    private EditText editTextweight;
    private EditText editTextLength;
    private EditText editTextage;
    private EditText editTextchronicdisease;
    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog, null);
        builder.setView(view);
        builder.setTitle("Login");
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent=new Intent(getActivity(),cardd.class);
                startActivity(intent);

            }
        });
        editTextweight=view.findViewById(R.id.edit_weight);
        editTextLength=view.findViewById(R.id.edit_Length);
        editTextchronicdisease=view.findViewById(R.id.edit_chronicdisease);
        editTextage=view.findViewById(R.id.edit_age);



        return builder.create();
    }
}
