import java.util.Calendar;

public class Person {
    String id;
    int yearOfBirth;
    String address;

    public Person(String id, int yearOfBirth, String address){
        this.id=id;
        this.yearOfBirth=yearOfBirth;
        this.address=address;
    }
    public void SayHello(){
        System.out.println(id+" says hello");
    }
    public int howOld()
    {
        return Calendar.getInstance().get(Calendar.YEAR)-yearOfBirth;//yay google
    }
}
