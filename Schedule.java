import java.util.HashMap;
import java.util.Vector;

public class Schedule {
    private HashMap<Integer, Vector<Tasks>> DatesMap;
    private Vector<RecurringTasks> RecurringVector;

    public Schedule() {
        DatesMap = new HashMap<>();
        RecurringVector = new Vector<>();
    }

    private boolean addToMap(Tasks exampleTask, int startDate)
    {
        if(DatesMap.containsKey(startDate))
        {
            Vector<Tasks> day = DatesMap.get(startDate);
            day.add(exampleTask);
            DatesMap.put(startDate, day);
        } else {
            Vector<Tasks> day = new Vector<>();
            day.add(exampleTask);
            DatesMap.put(startDate, day);
        }
        return true;
    }

    public Tasks createTransientTask(String name, Float startTime, 
                                        Float duration, int startDate)
    {
        Tasks exampleTask = new TransientTasks(name, startTime, duration, startDate);
        addToMap(exampleTask, startDate);
        System.out.println(DatesMap.keySet());
        return exampleTask;
    }

    public boolean createRecurringTask(String name, int startDate,
                                             Float startTime, Float duration,
                                             int endDate, int frequency)
    {

        return true;
    }

    public boolean createAntiTask(String name, int date,
                                             Float startTime, Float duration)
    {
        return true;
    }

    public boolean editTask(String name)
    {
        return true;
    }

    public boolean deleteTask(String name)
    {
        return true;
    }

    public Tasks findTask(String name)
    {
        Tasks exampleTask = new RecurringTasks();
        return exampleTask;
    }

    public Vector<Vector<Tasks>> getTaskList(int startDate, int endDate, float startTime, 
                                    float endTime)
    {
        Vector<Vector<Tasks>> exampleVector = new Vector<Vector<Tasks>>();
        return exampleVector;
    }
}
