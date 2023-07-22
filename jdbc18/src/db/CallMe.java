package db;
public class CallMe {
    public static void main(String[] args) {
    //    String msg = Admin.addUser("babu", "pintu@", "9211223344","babu@gmail.com");
    //    System.out.println(msg);
    //    String msg = Admin.checkId("babuaa", "pintu@");
    //    System.out.println(msg);
        String msg = Admin.forgetpass("babu");
        System.out.println(msg);
        String ar[] = msg.split(":");
        System.out.println("pass - "+ar[0]);
        System.out.println("mobile - "+ar[1]);
        System.out.println("Mail Id - "+ar[2]);
        
    
    }
    
}
