import java.util.ArrayList;
import java.util.List;

public class MemoryTaskRepository implements TaskRepository {

    private List<String> tasks = new ArrayList<>();

    @Override
    public void addTask(String task) {
        tasks.add(task);
    }

    @Override
    public void getAllTask() {

        for (String task : tasks) {
            System.out.println(task);
        }

    }

    @Override
    public void removeTask(String task) {
            tasks.remove(task);
    }
}
