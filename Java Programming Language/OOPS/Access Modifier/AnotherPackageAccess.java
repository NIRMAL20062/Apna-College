import mypackage.AccessModifiersExample;

public class AnotherPackageAccess extends AccessModifiersExample {
    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();

        // System.out.println(obj.privateVar);   // ❌ Not accessible
        // System.out.println(obj.defaultVar);   // ❌ Not accessible
        // System.out.println(obj.protectedVar); // ❌ Not accessible directly
        System.out.println(obj.publicVar);       // ✅ Accessible

        // Accessing protected via subclass reference
        AnotherPackageAccess subclassObj = new AnotherPackageAccess();
        System.out.println(subclassObj.protectedVar); // ✅ Accessible through inheritance
    }
}
