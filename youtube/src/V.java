class Name{
    public String name1;
    public String name2;
    public String name3;

    Name(String name1,String name2){

        this.name1=name1;
        this.name2=name2;
    }

    Name(String name3){
        this.name3=name3;
    }

    public void display(){
        System.out.println("Name 1 : "+name1);
        System.out.println("Name 2 : "+name2);
        System.out.println("Name 3 : "+name3);
    }
}

public class V {
    public static void main(String[] args) {
        Name n1=new Name("Sai","Aravind");
        n1.display();
    }
}
