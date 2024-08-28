class Main{
    public static void main(String[] args) {
        Student oldStudent=new Student(12,"bhaskar",12);
        Prototype newStudent=oldStudent.clone();
        System.out.println("New Student Details:"+newStudent.toString());
    }
}
