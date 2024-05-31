import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        for(int i = 0; i <= 19; i++){
            employeeList.add(new Employee("Employee_" + i, i));
        }

        Random random = new Random();
        int count = 0;
        int bound = 20;
        while(count < 6){
            int winnerId = random.nextInt(bound);
            String winner = employeeList.get(winnerId).getName();
            employeeList.remove(winnerId);
            System.out.println(winner + " won the prize!");
            bound--;
            count++;
        }
    }
}
