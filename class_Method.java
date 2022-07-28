public class class_Method {
    String name;
    int age;
    int roll;
    void setInformation(String name,int age,int roll){
        this.name=name;
        this.age=age;
        this.roll=roll;
    }

    void  displayInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll);

    }
   String country;
    String capital;
    int rank;
    class_Method(String country,String capital,int rank){
        this.country=country;
        this.capital=capital;
        this.rank=rank;
    }
    void DISP(){
        System.out.println(country);
        System.out.println(capital);
        System.out.println(rank);
    }

    public static void main(String[] args) {
        class_Method a=new class_Method("Bangladesh","Dhaka",12);
      //  a.setInformation("sohag",20,5486);
        a.DISP();
    }
}
