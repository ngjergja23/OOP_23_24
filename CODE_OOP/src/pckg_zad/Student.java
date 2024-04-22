package pckg_zad;

import java.text.DateFormat;
import java.util.Date;

abstract public class Student {
    private static final DateFormat DATE_FORMAT = null;
    protected Date enrolmentDate;
    protected String name;
    protected int idStudent;
    protected static int cntStudents = 0;

    protected abstract void setEnrolmentDate();

    protected abstract void infoStudent();

    protected abstract void completedStudy(int grade);


}
