package com.example.employeemanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class EmployeeTaskTable extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private String mPriority,mCurrentStatus,mFinalState,mEmpName;
    private EditText mtaskProject;
    private EditText mtaskID;
    private EditText mtaskAssignDate;
    private EditText mtaskAssignByKey;
    private EditText mtaskAssignToKey;

    private TextView mtaskAssignEmpName;
    private Spinner mtaskSpinnerEmpName;
    private EditText mtaskAssignEmpMobile;
    private EditText mtaskAssignEmpEmail;

    private EditText mtaskManagerName;
    private EditText mtaskManagerMobile;
    private EditText mtaskManagerEmail;

    private EditText mtaskHeading;
    private EditText mtaskDescription;
    private TextView mtaskPriority;
    private Spinner mtaskSpinnerPriority;

    private EditText mtaskExpectedStartDateTime;
    private EditText mtaskExpectedEndDateTime;
    private EditText mtaskAllottedHours;
    private TextView mtaskCurrentStatus;
    private Spinner mtaskSpinnerCurrentStatus;

    private EditText mtaskActualStartDateTime;
    private EditText mtaskActualEndDateTime;
    private EditText mtaskHours;
    private EditText mtaskLateStart;
    private TextView mtaskFinalState;
    private Spinner mtaskSpinnerFinalState;
    private EditText mtaskRating;

    private Button submitButtonOfTaskTable;

    private Query query;
    ArrayList<String> employeeList;
    ArrayAdapter<String> arrayAdapterEmployeeList;

    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_task_table);

        mtaskProject=findViewById(R.id.taskProject);
        mtaskID=findViewById(R.id.taskId);
        mtaskAssignDate=findViewById(R.id.taskAssignDate);
        mtaskAssignByKey=findViewById(R.id.taskAssignByKey);
        mtaskAssignToKey=findViewById(R.id.taskAssignToKey);

        mtaskAssignEmpName=findViewById(R.id.taskAssignEmpName);
        mtaskSpinnerEmpName=findViewById(R.id.taskSpinnerEmpName);
        mtaskAssignEmpMobile=findViewById(R.id.taskAssignEmpMobile);
        mtaskAssignEmpEmail=findViewById(R.id.taskAssignEmpEmail);

        mtaskManagerName=findViewById(R.id.taskManagerName);
        mtaskManagerMobile=findViewById(R.id.taskManagerMobile);
        mtaskManagerEmail=findViewById(R.id.taskManagerEmail);

        mtaskHeading=findViewById(R.id.taskHeading);
        mtaskDescription=findViewById(R.id.taskDescription);
        mtaskPriority=findViewById(R.id.taskPriority);
        mtaskSpinnerPriority=findViewById(R.id.taskSpinnerPriority);

        mtaskExpectedStartDateTime=findViewById(R.id.taskExpectedStartDateTime);
        mtaskExpectedEndDateTime=findViewById(R.id.taskExpectedEndDateTime);
        mtaskAllottedHours=findViewById(R.id.taskAllotedHours);
        mtaskCurrentStatus=findViewById(R.id.taskCurrentStatus);
        mtaskSpinnerCurrentStatus=findViewById(R.id.taskSpinnerCurrentStatus);

        mtaskActualStartDateTime=findViewById(R.id.taskActualStartDateTime);
        mtaskActualEndDateTime=findViewById(R.id.taskActualEndDateTime);
        mtaskHours=findViewById(R.id.taskHours);
        mtaskLateStart=findViewById(R.id.taskLateStart);
        mtaskFinalState=findViewById(R.id.taskFinalState);
        mtaskSpinnerFinalState=findViewById(R.id.taskSpinnerFinalStatus);
        mtaskRating=findViewById(R.id.taskRating);

        submitButtonOfTaskTable=findViewById(R.id.submitButtonofTaskTable);

        // Spinner click listener
        mtaskSpinnerPriority.setOnItemSelectedListener(this);
        mtaskSpinnerCurrentStatus.setOnItemSelectedListener(this);
        mtaskSpinnerEmpName.setOnItemSelectedListener(this);
        mtaskSpinnerFinalState.setOnItemSelectedListener(this);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Priority, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        mtaskSpinnerPriority.setAdapter(adapter);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> status = ArrayAdapter.createFromResource(this,
                R.array.TaskCurrentStatus, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        status.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        mtaskSpinnerCurrentStatus.setAdapter(status);



        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> finalState = ArrayAdapter.createFromResource(this,
                R.array.TaskFinalState, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        finalState.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        mtaskSpinnerFinalState.setAdapter(finalState);

        // Array for employees
        query=FirebaseDatabase.getInstance().getReference("employees");
        employeeList= new ArrayList<>();

        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                for(DataSnapshot employee : snapshot.getChildren()){
                    Employee employee1 =employee.getValue(Employee.class);
                    employeeList.add(employee1.getName());
                    arrayAdapterEmployeeList.notifyDataSetChanged();
                }
            }
            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
        arrayAdapterEmployeeList=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,
                employeeList);

        // Specify the layout to use when the list of choices appears
        arrayAdapterEmployeeList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        mtaskSpinnerEmpName.setAdapter(arrayAdapterEmployeeList);



//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//
//        myRef.setValue("Hello, World!");
        databaseReference= FirebaseDatabase.getInstance().getReference("EmployeeTaskTable");

        submitButtonOfTaskTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmployeeTaskTableClass employeeTaskTable=new EmployeeTaskTableClass(mtaskProject.getText().toString(),
                        mtaskID.getText().toString(), mtaskAssignDate.getText().toString(),mtaskAssignByKey.getText().toString(),
                        mtaskAssignToKey.getText().toString(),mEmpName,mtaskAssignEmpMobile.getText().toString(),
                        mtaskAssignEmpEmail.getText().toString(),mtaskManagerName.getText().toString(),mtaskManagerMobile.getText().toString(),
                        mtaskManagerEmail.getText().toString(),mtaskHeading.getText().toString(),mtaskDescription.getText().toString(),mPriority,
                        mtaskExpectedStartDateTime.getText().toString(),mtaskExpectedEndDateTime.getText().toString(),mtaskAllottedHours.getText().toString(),
                        mCurrentStatus,mtaskActualStartDateTime.getText().toString(),mtaskActualEndDateTime.getText().toString(),
                        mtaskHours.getText().toString(),mtaskLateStart.getText().toString(),mFinalState,mtaskRating.getText().toString());

                databaseReference.push().setValue(employeeTaskTable);

                toast("Data added...");

            }
        });
    }
    private  void toast(String message){
        Toast.makeText(EmployeeTaskTable.this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
        switch (parent.getId()){
            case R.id.taskSpinnerPriority:
                mPriority=item;
                break;

            case R.id.taskSpinnerCurrentStatus:
                mCurrentStatus=item;
                break;

            case R.id.taskSpinnerFinalStatus:
                mFinalState=item;
                break;
            case R.id.taskSpinnerEmpName:
                 mEmpName = item;
                Query query=FirebaseDatabase.getInstance().getReference("employees");
                query.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                        for (DataSnapshot employee:snapshot.getChildren()){

                            Employee employeeDetail =employee.getValue(Employee.class);

                            if (employeeDetail.getName().equals(item)){
                                toast(employeeDetail.getEmail());
                                mtaskAssignEmpMobile.setText(employeeDetail.getEmail());
                                mtaskAssignEmpEmail.setText(employeeDetail.getMobile());
                                break;

                            }
                            arrayAdapterEmployeeList.notifyDataSetChanged();
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull @NotNull DatabaseError error) {

                    }
                });
                break;

            default:toast("Something Else");

        }


        toast("Selected Iteam : "+item);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}