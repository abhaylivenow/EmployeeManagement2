package com.example.employeemanagement;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.employeemanagement.ui.Today_task.TodayTaskActivity;
import com.example.employeemanagement.ui.assign_task.AssignTaskActivity;
import com.example.employeemanagement.ui.employee_detail.EmployeeDetailActivity;
import com.example.employeemanagement.ui.employee_task.EmployeeTaskActivity;
import com.example.employeemanagement.ui.manage_call.ManageCallActivity;
import com.example.employeemanagement.ui.my_account.MyAccountActivity;
import com.example.employeemanagement.ui.show_all.ShowAllActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
}