package pckg_col_2;

public class Robot {
    private int id;
    private String desc;
    private static int cntID = 100;

    public Robot(String desc){
        this.id = cntID++;
        this.desc = desc;
    }
    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                '}';
    }
}
