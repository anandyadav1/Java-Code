package Oops;

class Account{
    public String name;
    public String email;
    public  String password;

    //getter & setter
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password=pass;
    }

}

public class Oops_java_1_3{
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="G L Bajaj";
        account1.email="G L Bajaj@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
        
    }
}
