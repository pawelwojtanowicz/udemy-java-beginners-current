package o_o_p_composition;

public class Student {
    private String name;
    private String dateOfBirth;
    private boolean hasStudentHousing;

    private Course course;

    //right click --> Generate --> ..... e.g. get & set automatically

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean getHasStudentHousing() {
        return hasStudentHousing;
    }

    public void setHasStudentHousing(boolean hasStudentHousing) {
        this.hasStudentHousing = hasStudentHousing;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }
}