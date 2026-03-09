class emplyoee{
    float salary=40000;
}

class programer extends emplyoee{
    int bonus=10000;
}
public class inhertance {
    public static void main(String[] args) {
        programer p= new programer();
        System.out.println("programer salry is:"+p.salary);
        System.out.println("bonus of programer is:"+p.bonus);
    }
}
/*
programer salry is:40000.0
bonus of programer is:10000 */