public class Student {
    int rno;
    String name;
    float marks;


    void display(){
        System.out.println("My name is" + this.name + " and my rno is " + this.rno);
    }

    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1);
    }

}


