import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
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