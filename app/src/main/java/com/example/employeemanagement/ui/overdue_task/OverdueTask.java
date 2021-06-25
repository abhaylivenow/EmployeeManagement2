package com.example.employeemanagement.ui.overdue_task;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.employeemanagement.R;

import org.jetbrains.annotations.NotNull;

public class OverdueTask extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_overdue_task, container, false);
    }
}
