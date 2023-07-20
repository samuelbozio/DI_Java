import java.util.List;

public interface TaskRepository {

    void addTask(String task);
    void getAllTask();
    void removeTask(String task);
}
