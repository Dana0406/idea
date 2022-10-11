package mainclass;

import hum.Patient;

import static hum.Patient.averageAge;

public class Main {
    public static void main(String[] args){

        Patient[] patients=new Patient[3];

        patients[0] = new Patient("Gil", 18,"female");
        patients[1]= new Patient("Nevar", 41,"female");
        patients[2] = new Patient("Gil", 12,"male");

        patients[0].printPatient();
        System.out.println("\n");
        patients[1].printPatient();
        System.out.println("\n");
        patients[2].printPatient();
        System.out.println("\n");

        averageAge();
    }
}