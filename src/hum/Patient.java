package hum;

public class Patient {

    public String surname;
    protected int age;
    public String gender;

    static int sum=0;
    static int kolvo=0;

    public Patient(String surname,int age,String gender){
        this.surname=surname;
        this.age=age;
        this.gender=gender;

        if(this.gender=="female"){
            kolvo++;
            sum+=age;
        }
    }

    public Patient(){
        this.surname="Underfind";
        this.age=0;
        this.gender="Underfind";
    }

    public int getAge(){ return this.age; }

    public void setAge(int age){
        this.age=age;
    }

    public void printPatient(){
        System.out.println("Surname of our patient: "+ surname);
        System.out.println("Age of our patient: "+ age);
        System.out.println("Gender of our patient: "+ gender);
    }

    public static void averageAge(){
        System.out.println("Average age: "+sum/kolvo);
    }
}
