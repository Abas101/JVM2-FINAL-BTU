package saba.kikvidze.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saba.kikvidze.dto.*;
import saba.kikvidze.model.Task;
import saba.kikvidze.repository.TaskRepo;
import saba.kikvidze.service.TaskService;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepo taskRepo;

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setStartDate(addTaskInput.getStartDate());
        task.setEndDate(addTaskInput.getEndDate());

        taskRepo.save(task);
        AddTaskOutput addTaskOutput = new AddTaskOutput();
        addTaskOutput.setMsg("Successfully added!");
        return addTaskOutput;

    }

    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        Task task = taskRepo.getById(deleteTaskInput.getTaskId());
        taskRepo.delete(task);

        DeleteTaskOutput deleteTaskOutput = new DeleteTaskOutput();
        deleteTaskOutput.setMsg("Successfully Deleted!");
        return deleteTaskOutput;
    }

    @Override
    public GetTasksOutput getTasks(GetTasksInput getTasksInput) {
        List<Task> taskList = taskRepo.findAll();
        GetTasksOutput getTasksOutput = new GetTasksOutput();

        List<TaskDTO> taskDTOS = new ArrayList<>();

        for (Task task: taskList) {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setStartDate(task.getStartDate());
            taskDTO.setEndDate(task.getEndDate());
        }

        getTasksOutput.setTasks(taskDTOS);
        return getTasksOutput;
    }
}
