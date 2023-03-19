package o_o_p_composition;

// composition can be described like "has a" relationship
//e.g. Human has a brain. Book has a page. .....


public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Jan Kot ");
        student.setDateOfBirth("29/03/1982");
        student.setHasStudentHousing(false);
        student.setCourse(new Course());

        student.getCourse().setTitle("Computer Science");   //this line do exactly the same like lines 20 plus 21
        student.getCourse().setLevel("Undergraduate");      //this line do exactly the same like lines 20 plus 22
        student.getCourse().setStartDate("01/09/2010");     //this line do exactly the same like lines 20 plus 23

        Course c = student.getCourse(); // it depends on you which way you choose
        c.setTitle("Computer Science");
        c.setLevel("Undergraduate");
        c.setStartDate("01/09/2010");


        System.out.println("name: " + student.getName());
        System.out.println("date of birth: " + student.getDateOfBirth());
        System.out.println("housing: " + (student.getHasStudentHousing() ? "yes" : "no"));
        System.out.println("course: " + student.getCourse().getTitle());
        System.out.println("course level: " + student.getCourse().getLevel());
        System.out.println("course start date: " + student.getCourse().getStartDate());

    }


}