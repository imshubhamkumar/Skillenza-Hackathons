package com.chhotaloan.ui.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.chhotaloan.R;

public class HistoryFragment extends Fragment {

   // private HistoryViewModel recyclerView = ViewModelProviders.of(this).get(HistoryViewModel.class);

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_history, container, false);


        return root;
    }
}