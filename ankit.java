class student{
    int roll,marks;
    String name;
    void input(){
        System.out.println("Enter your Name,Roll No.,marks");
    }
}
public class ankit extends student{
    void disp(){
        name=  "Ankit gautam";
        roll=1;
        marks= 92;
        System.out.println(name+", "+roll+", "+marks);
    }
    public static void main(String args[]){
        ankit r = new ankit();
        r.input();
        r.disp();
    }
}


