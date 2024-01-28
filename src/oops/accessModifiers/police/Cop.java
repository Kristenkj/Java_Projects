package src.oops.accessModifiers.police;

public class Cop {
    public int gun;// modifier return name_variable


    //Constructor
    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Of-course, Shoot");//This function should be protected so anyone in the folder can access
                                                //without security concerns
    }

}
