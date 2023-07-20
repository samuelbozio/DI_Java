import java.util.ArrayList;
import java.util.List;

public class TaskManager{

    private TaskRepository taskRepository;

    public TaskManager(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }



    public void addTask(String task) {
        taskRepository.addTask(task);
    }


    public void getAllTask() {
        taskRepository.getAllTask();
    }


    public void removeTask(String task) {
        taskRepository.removeTask(task);
    }
}
