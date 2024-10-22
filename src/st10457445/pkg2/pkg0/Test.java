
package st10457445.pkg2.pkg0;

import java.util.ArrayList;
import java.util.List;
public class Test
{
  

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task getTaskByNumber(int taskNumber) {
        for (Task task : tasks) {
            if (task.getTaskNumber() == taskNumber) {
                return task;
            }
        }
        return null;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}  
}
