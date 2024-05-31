public class Employee {
    private String name = "";
    private int id = -1;
    private boolean win = false;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    //getter
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public boolean getStatus(){
        return this.win;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setStatus(boolean win){
        this.win = win;
    }
}
