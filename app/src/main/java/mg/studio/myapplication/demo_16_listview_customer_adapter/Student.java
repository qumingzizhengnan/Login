package mg.studio.myapplication.demo_16_listview_customer_adapter;

/**
 * Created by echo on 2018/4/18.
 */

class Student {
    private String name;
    private int studentId;

    //Setters
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }


}
