package pckg_exceptions_1;

public class MyException extends Exception{
    public String msg;
    public MyException(String msg){
        this.msg = msg;
    }

    public void provideInfo(){
        System.out.println(msg);
    }

    //nije dobro

}
