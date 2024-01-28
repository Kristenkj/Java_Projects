package src.oops.Encapsulation;

public class Lab150 {
    public static void main(String[] args) {

        // Hidden
        vwoLoginFixed vwoLogin = new vwoLoginFixed("admin","admin");
        // Hidden

        boolean check = vwoLogin.isLoggedIn("admin","password");
        String u = vwoLogin.getUsername();
//        String u = vwoLogin.getPassword(); Not possible to change because of encapsulation
//        vwoLogin.password = "?";
        System.out.println(u);
        System.out.println(check);

        /// vwoLogin.pramod();

    }
}

class vwoLoginFixed{

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private void pramod(){
        System.out.println("I am private");
    }

    private String username;//No one can access private variables from the outside unless getter setter is provided
    private String password;//No one can access private variables from the outside

    vwoLoginFixed(String u, String p){
        this.password = p;
        this.username = u;
    }

    boolean isLoggedIn(String username, String password){

        pramod();

        if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged IN!!");
            return true;
        }
        else {
            System.out.println("Not Logged in");
            return false;
        }

    }
}
