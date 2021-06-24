package com.example.employeemanagement;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.employeemanagement.ui.Today_task.TodayTaskFragment;
import com.example.employeemanagement.ui.Todo_task.TodoTask;
import com.example.employeemanagement.ui.assign_task.AssignTaskActivity;
import com.example.employeemanagement.ui.completed_task.CompletedFragment;
import com.example.employeemanagement.ui.employee_detail.EmployeeDetailActivity;
import com.example.employeemanagement.ui.employee_task.EmployeeTaskActivity;
import com.example.employeemanagement.ui.manage_call.ManageCallActivity;
import com.example.employeemanagement.ui.my_account.MyAccountActivity;
import com.example.employeemanagement.ui.overdue_task.OverdueTask;
import com.example.employeemanagement.ui.progress_chart.ProgressChart;
import com.example.employeemanagement.ui.show_all.ShowAllActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setFragment(new TodayTaskFragment());
        mBottomNavigationView.setOnNavigationItemSelectedListener(listener);
    }

    private void initView() {
        mBottomNavigationView = findViewById(R.id.bottom_navigation_container);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_manage_call:
                Intent newManageCallActivity = new Intent(this, ManageCallActivity.class);
                startActivity(newManageCallActivity);
                return true;
            case R.id.action_show_all:
                Intent newShowAllActivity = new Intent(this, ShowAllActivity.class);
                startActivity(newShowAllActivity);
                return true;
            case R.id.action_my_account:
                Intent newMyAccountActivity = new Intent(this, MyAccountActivity.class);
                startActivity(newMyAccountActivity);
                return true;
            case R.id.action_assign_task:
                Intent newAssignTaskActivity = new Intent(this, AssignTaskActivity.class);
                startActivity(newAssignTaskActivity);
                return true;
            case R.id.action_employee_detail:
                Intent EmployeeDetailActivity = new Intent(this, EmployeeDetailActivity.class);
                startActivity(EmployeeDetailActivity);
                return true;
            case R.id.action_employee_task:
                Intent newEmployeeTaskActivity = new Intent(this, EmployeeTaskActivity.class);
                startActivity(newEmployeeTaskActivity);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @SuppressLint("NonConstantResourceId")
    private final BottomNavigationView.OnNavigationItemSelectedListener listener = item -> {
        switch (item.getItemId()) {
            case R.id.bottom_action_today:
                setFragment(new TodayTaskFragment());
                return true;
            case R.id.bottom_action_completed:
                setFragment(new CompletedFragment());
                return true;
            case R.id.bottom_action_todo:
                setFragment(new TodoTask());
                return true;
            case R.id.bottom_action_in_progress:
                setFragment(new ProgressChart());
                return true;
            case R.id.bottom_action_overdue:
                setFragment(new OverdueTask());
                return true;
            default:
                return false;
        }
    };

    private void setFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }

}