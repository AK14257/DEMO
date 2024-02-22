

class StringChecker extends Exception{
    StringChecker(){
        super("not a valid string");
    }
    StringChecker(String Message){
        super(Message);
    }
}

public class Checker {

    public static void main(String[] args) {
        String str = "helloworldeii";
        try {
            if (str.length()>10) {
                throw new StringChecker("not a valid string");
            }
        } catch (StringChecker e) {
            e.printStackTrace();
        }
    }
}
