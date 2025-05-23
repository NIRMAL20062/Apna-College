package mypackage;

public class SamePackageAccess {
    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();
        obj.display(); // Access through public method

        // Accessing variables directly:
        // System.out.println(obj.privateVar); // ❌ Not accessible
        System.out.println(obj.defaultVar);     // ✅ Accessible
        System.out.println(obj.protectedVar);   // ✅ Accessible
        System.out.println(obj.publicVar);      // ✅ Accessible
    }
}
