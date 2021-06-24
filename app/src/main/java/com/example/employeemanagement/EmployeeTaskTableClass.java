package com.example.employeemanagement;

public class EmployeeTaskTableClass {
    private String taskProject;
    private String taskID;
    private String taskAssignDate;
    private String taskAssignByKey;
    private String taskAssignToKey;

    private String taskAssignEmpName;
    private String taskAssignEmpMobile;
    private String taskAssignEmpEmail;

    private String taskManagerName;
    private String taskManagerMobile;
    private String taskManagerEmail;

    private String taskHeading;
    private String taskDescription;
    private String taskPriority;

    private String taskExpectedStartDateTime;
    private String taskExpectedEndDateTime;
    private String taskAllottedHours;
    private String taskCurrentStatus;

    private String taskActualStartDateTime;
    private String taskActualEndDateTime;
    private String taskHours;
    private String taskLateStart;
    private String taskFinalState;
    private String taskRating;

    public EmployeeTaskTableClass() {
    }

    public EmployeeTaskTableClass(String taskProject, String taskID, String taskAssignDate, String taskAssignByKey,
                             String taskAssignToKey, String taskAssignEmpName, String taskAssignEmpMobile,
                             String taskAssignEmpEmail, String taskManagerName, String taskManagerMobile,
                             String taskManagerEmail, String taskHeading, String taskDescription, String taskPriority,
                             String taskExpectedStartDateTime, String taskExpectedEndDateTime, String taskAllottedHours,
                             String taskCurrentStatus, String taskActualStartDateTime, String taskActualEndDateTime,
                             String taskHours, String taskLateStart, String taskFinalState, String taskRating) {
        this.taskProject = taskProject;
        this.taskID = taskID;
        this.taskAssignDate = taskAssignDate;
        this.taskAssignByKey = taskAssignByKey;
        this.taskAssignToKey = taskAssignToKey;
        this.taskAssignEmpName = taskAssignEmpName;
        this.taskAssignEmpMobile = taskAssignEmpMobile;
        this.taskAssignEmpEmail = taskAssignEmpEmail;
        this.taskManagerName = taskManagerName;
        this.taskManagerMobile = taskManagerMobile;
        this.taskManagerEmail = taskManagerEmail;
        this.taskHeading = taskHeading;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
        this.taskExpectedStartDateTime = taskExpectedStartDateTime;
        this.taskExpectedEndDateTime = taskExpectedEndDateTime;
        this.taskAllottedHours = taskAllottedHours;
        this.taskCurrentStatus = taskCurrentStatus;
        this.taskActualStartDateTime = taskActualStartDateTime;
        this.taskActualEndDateTime = taskActualEndDateTime;
        this.taskHours = taskHours;
        this.taskLateStart = taskLateStart;
        this.taskFinalState = taskFinalState;
        this.taskRating = taskRating;
    }



    //Setters
    public void setTaskProject(String taskProject) {
        this.taskProject = taskProject;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public void setTaskAssignDate(String taskAssignDate) {
        this.taskAssignDate = taskAssignDate;
    }

    public void setTaskAssignByKey(String taskAssignByKey) {
        this.taskAssignByKey = taskAssignByKey;
    }

    public void setTaskAssignToKey(String taskAssignToKey) {
        this.taskAssignToKey = taskAssignToKey;
    }

    public void setTaskAssignEmpName(String taskAssignEmpName) {
        this.taskAssignEmpName = taskAssignEmpName;
    }

    public void setTaskAssignEmpMobile(String taskAssignEmpMobile) {
        this.taskAssignEmpMobile = taskAssignEmpMobile;
    }

    public void setTaskAssignEmpEmail(String taskAssignEmpEmail) {
        this.taskAssignEmpEmail = taskAssignEmpEmail;
    }

    public void setTaskManagerName(String taskManagerName) {
        this.taskManagerName = taskManagerName;
    }

    public void setTaskManagerMobile(String taskManagerMobile) {
        this.taskManagerMobile = taskManagerMobile;
    }

    public void setTaskManagerEmail(String taskManagerEmail) {
        this.taskManagerEmail = taskManagerEmail;
    }

    public void setTaskHeading(String taskHeading) {
        this.taskHeading = taskHeading;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    public void setTaskExpectedStartDateTime(String taskExpectedStartDateTime) {
        this.taskExpectedStartDateTime = taskExpectedStartDateTime;
    }

    public void setTaskExpectedEndDateTime(String taskExpectedEndDateTime) {
        this.taskExpectedEndDateTime = taskExpectedEndDateTime;
    }

    public void setTaskAllottedHours(String taskAllottedHours) {
        this.taskAllottedHours = taskAllottedHours;
    }

    public void setTaskCurrentStatus(String taskCurrentStatus) {
        //By Default todo
        if(taskCurrentStatus.isEmpty()){
            this.taskCurrentStatus="Todo";
        }else{
            this.taskCurrentStatus = taskCurrentStatus;
        }

    }

    public void setTaskActualStartDateTime(String taskActualStartDateTime) {
        this.taskActualStartDateTime = taskActualStartDateTime;
    }

    public void setTaskActualEndDateTime(String taskActualEndDateTime) {
        this.taskActualEndDateTime = taskActualEndDateTime;
    }

    public void setTaskHours(String taskHours) {
        this.taskHours = taskHours;
    }

    public void setTaskLateStart(String taskLateStart) {
        this.taskLateStart = taskLateStart;
    }

    public void setTaskFinalState(String taskFinalState) {
        this.taskFinalState = taskFinalState;
    }

    public void setTaskRating(String taskRating) {
        this.taskRating = taskRating;
    }



    // Getters
    public String getTaskProject() {
        return taskProject;
    }

    public String getTaskID() {
        return taskID;
    }

    public String getTaskAssignDate() {
        return taskAssignDate;
    }

    public String getTaskAssignByKey() {
        return taskAssignByKey;
    }

    public String getTaskAssignToKey() {
        return taskAssignToKey;
    }

    public String getTaskAssignEmpName() {
        return taskAssignEmpName;
    }

    public String getTaskAssignEmpMobile() {
        return taskAssignEmpMobile;
    }

    public String getTaskAssignEmpEmail() {
        return taskAssignEmpEmail;
    }

    public String getTaskManagerName() {
        return taskManagerName;
    }

    public String getTaskManagerMobile() {
        return taskManagerMobile;
    }

    public String getTaskManagerEmail() {
        return taskManagerEmail;
    }

    public String getTaskHeading() {
        return taskHeading;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public String getTaskExpectedStartDateTime() {
        return taskExpectedStartDateTime;
    }

    public String getTaskExpectedEndDateTime() {
        return taskExpectedEndDateTime;
    }

    public String getTaskAllottedHours() {
        return taskAllottedHours;
    }

    public String getTaskCurrentStatus() {
        return taskCurrentStatus;
    }

    public String getTaskActualStartDateTime() {
        return taskActualStartDateTime;
    }

    public String getTaskActualEndDateTime() {
        return taskActualEndDateTime;
    }

    public String getTaskHours() {
        return taskHours;
    }

    public String getTaskLateStart() {
        return taskLateStart;
    }

    public String getTaskFinalState() {
        return taskFinalState;
    }

    public String getTaskRating() {
        return taskRating;
    }




}


