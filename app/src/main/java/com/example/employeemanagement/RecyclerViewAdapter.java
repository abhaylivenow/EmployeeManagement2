package com.example.employeemanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.EmployeeHolder>{

    private Context mContext;
    private List<Employee> mTaskList;
    private onClickListener mOnClickListener;

    public RecyclerViewAdapter(Context context, List<Employee> taskList, onClickListener onClickListener){
        mContext = context;
        mTaskList = taskList;
        this.mOnClickListener = onClickListener;
    }

    @NonNull
    @Override
    public EmployeeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        return new EmployeeHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.EmployeeHolder holder, int position) {

//        Employee currentTask = mTaskList.get(position);
//
//        holder.task_heading.setText(currentTask.getHeading());
//        holder.task_description.setText(currentTask.getDescription());
//        holder.task_priority.setText(currentTask.getPriority());

    }

    @Override
    public int getItemCount() {
        return mTaskList.size();
    }

    class EmployeeHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView task_heading, task_description, task_priority;

        public EmployeeHolder(@NonNull View itemView) {
            super(itemView);

//            task_heading = itemView.findViewById(R.id.task_heading);
//            task_description = itemView.findViewById(R.id.task_description);
//            task_priority = itemView.findViewById(R.id.task_priority);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mOnClickListener.onProductCLick(getAdapterPosition());
        }
    }

    public interface onClickListener{
        void onProductCLick(int position);
    }
}
