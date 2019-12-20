package com.company;

public class Main {

    public void main(String[] args) {

        // build object
        Student mark = new Student();
        Student tontan = new Student();
        Student dream = new Student();

        // input data to object
        mark.name = "X Mark";
        mark.id = "001";
        mark.major = "CIS";
        tontan.name = "Ton Tan";
        tontan.id = "002";
        tontan.major = "CIS";
        dream.name = "Dream";
        dream.id = "003";
        dream.major = "NY";

        // get data from object
        System.out.println("1. " + mark.name + " " + mark.id + " " + mark.major);
        System.out.println("2. " + tontan.name + " " + tontan.id + " " + tontan.major);
        System.out.println("3. " + dream.name + " " + dream.id + " " + dream.major);

        // array index
        Student[] oopStudents = {mark, tontan, dream};

        //
        System.out.println("1. " + oopStudents[0].name);
        System.out.println("2. " + oopStudents[1].name);
        System.out.println("3. " + oopStudents[2].name);

        find_CIS_Student(oopStudents);
    }

    // to find CIS student
    public void find_CIS_Student(Student[] students) {

        // loop all students
        for (int i = 0; i < students.length; i++){

            // check student major
            if (students[i].major == "CIS"){
                System.out.println(i+1 + ". " + students[i].name);
            }
        }
    }
}
