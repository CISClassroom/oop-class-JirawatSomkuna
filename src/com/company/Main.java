package com.company;

public class Main {

    public static void main(String[] args) {
        Student jacky = new Student();
        jacky.name= "Jirawat  Somkuna";
        jacky.id= "623410068-0";
        jacky.major= "CIS";

        System.out.println("1."+ jacky.name +" "+ jacky.major);

        Student[] oopStudents = {jacky,};

        System.out.println("1."+oopStudents[0].name);

        find_CIS_student(oopStudents);
    }

    private void find_CIS_student(Student[] oopStudents) {
    }

    public void  find_CIS_Student(Student[] students){
        for(int i = 0; i < students.length; i++){
            if (students[i].major.equals("CIS")){
                System.out.println(i+1 + ". "+ students[i].name);
            }
        }

    }
}
