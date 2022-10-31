
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class myCustomSet{
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Shaswot",33));
        studentSet.add(new Student("Ankit",11));
        studentSet.add(new Student("Amrit",22));
        studentSet.add(new Student("Shaswot",33));
        System.out.println(studentSet);

    }


}

public class Student{
    String Name;
    int RollNo;

    public Student(String name , int roll){
        this.Name = name;
        this.RollNo = roll;


    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", RollNo=" + RollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return RollNo == student.RollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(RollNo);
    }
}