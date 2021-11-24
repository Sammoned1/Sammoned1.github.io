import java.lang.*;

public class Student implements Comparable<Student>{
    int iD;
    Student(int iD){
        this.iD = iD;
    }
    int getiD(){
        return this.iD;
    }
    @Override
    public int compareTo(Student o) {
        if(this.iD > o.iD)
            return 1;
        else if(this.iD == o.iD){
            return 0;
        }
        else
            return -1;
    }
}
