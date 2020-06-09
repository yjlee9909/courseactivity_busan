package com.example.mytrip_test.ui.mytrip;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mytrip_test.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MyTripFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_mytrip, container, false);

        FloatingActionButton add = root.findViewById(R.id.fab_add);
        add.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), AddNewTripActivity.class);
            startActivity(intent);
        });

        return root;
    }
}