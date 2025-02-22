package extends1.access.parent;

import extends1.access.child.Child;

public class ExtendAccessMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }
}
