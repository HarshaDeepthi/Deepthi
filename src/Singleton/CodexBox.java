package Singleton;

public class CodexBox {
    public static CodexBox o;

    private CodexBox() {
    }

    public static CodexBox getInstance() {
        if (o == null) {
            o = new CodexBox();
        }
        return o;
    }

    public void getConnection() {
        System.out.println("You are now connected to the CodexBox Company");

    }
}
class Main{
    public static void main(String[] args){
        CodexBox cb1;
        cb1=CodexBox.getInstance();
        cb1.getConnection();

            }
}










