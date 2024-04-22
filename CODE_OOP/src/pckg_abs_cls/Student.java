package pckg_abs_cls;

public class Student extends Person{
    private String university;
    private String studyProgram;
    protected Student(String name, String sname,String uni, String studyProgram) {
        super(name, sname);
        this.university = uni;
        this.studyProgram = studyProgram;
        System.out.println("constructore: " + this.getClass().getSimpleName());

    }

    @Override
    public void getInfo() {
//        super.getInfo();
        System.out.println(super.toString());
        System.out.println(this);
    }
//    @Override
//    public String toString() {
//        return "Student{" +
//                "university='" + university + '\'' +
//                ", studyProgram='" + studyProgram + '\'' +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                '}';
//    }

    @Override
    protected void getSignature() {
        System.out.println(getClass().getSimpleName() + "name: " + this.name + "signed!");
    }

    public boolean passedExam(String course, int grade){
        boolean pass = false;                                    //treba izbjegavati visestruke returne
        if (grade>1){
            pass = true;
            System.out.println("Passed exam in course: " + course);
        }
        return pass;
    }

}
