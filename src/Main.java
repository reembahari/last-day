public class Main {
    public static void main(String[] args) {
        Person p1=new Person("reem","hattin");
        System.out.println(p1.getAddress());
        System.out.println(p1.getName());
        Student s1=new Student("reem","hattin","program",2023,4.00);
        System.out.println(s1.getPrograming());
        System.out.println(s1.getYaer());
        System.out.println(s1.getFee());


    }
}