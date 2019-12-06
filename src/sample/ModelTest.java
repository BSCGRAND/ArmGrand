package sample;

public class ModelTest {
    private int Id;
    private String Fullname;
    private String Oilfield;

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getOilfield() {
        return Oilfield;
    }

    public void setOilfield(String oilfield) {
        Oilfield = oilfield;
    }

    public int getId() {
        return Id;
    }

    public ModelTest(String fullname, String oilfield) {
        Fullname = fullname;
        Oilfield = oilfield;
    }

    public ModelTest() {
    }

    @Override
    public String toString() {
        return "ModelTest{" +
                "Id=" + Id +
                ", Fullname='" + Fullname + '\'' +
                ", Oilfield='" + Oilfield + '\'' +
                '}';
    }
}
