public class Student implements Prototype {
    public int age;
    public String name;
    private int roll;
   
    
    Student(int age, String name, int roll) {
        this.age=age;
        this.name=name;
        this.roll=roll;
    }
    @Override
    public String toString(){
        return "Student Details: Age="+age+", Name="+name+", Roll="+roll;
    }


    public Prototype clone(){
        return new Student(age, name,roll);
    }
}
