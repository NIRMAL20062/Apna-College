package mypackage;

public class AccessModifiersExample {
    private String privateVar = "Private Variable";
    String defaultVar = "Default (Package-private) Variable";
    protected String protectedVar = "Protected Variable";
    public String publicVar = "Public Variable";

    public void display() {
        System.out.println("Inside AccessModifiersExample class:");
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}
