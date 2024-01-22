public class Employeer {
    int id;
    String name;
    Double salary;

    public Employeer(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void aumento(double percent){
        double porcent = percent / 100;
        double aux = salary*porcent;
        this.salary +=aux;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String toString(){
        return id + "," + name + "," + salary;
    }
}
