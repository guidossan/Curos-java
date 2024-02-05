package sessaoSet.fixacao;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Program2 {
    public static void main(String[] args){
        Set<Student> a = new HashSet<>();
        Set<Student> b = new HashSet<>();
        Set<Student> c = new HashSet<>();       
        Scanner sc = new Scanner(System.in);
        System.out.print("how many students for course A:");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++){
            Student student = new Student(sc.nextInt());
            a.add(student);
        }
        System.out.print("how many students for course B:");
        int num2 = sc.nextInt();
        for (int i = 0; i <= num2; i++){
            Student student = new Student(sc.nextInt());
            b.add(student);
        }
        System.out.print("how many students for course C:");
        int num3 = sc.nextInt();
        for (int i = 0; i <= num3; i++){
            Student student = new Student(sc.nextInt());
            c.add(student);
        }
        Set<Student> d = new HashSet<>();
        d.addAll(a);
        d.addAll(b);
        d.addAll(c);
        Integer size = d.size();
        System.out.println(size);
        for (Student p : d) {
            if (d.contains(p)){
                size -=1;
            }
        }
        sc.close();
    }
}
