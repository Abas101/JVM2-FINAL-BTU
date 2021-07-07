package saba.kikvidze.service;

import saba.kikvidze.dto.*;

public interface TaskService {
    AddTaskOutput addTask(AddTaskInput addTaskInput);
    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);
    GetTasksOutput getTasks(GetTasksInput getTasksInput);
}
