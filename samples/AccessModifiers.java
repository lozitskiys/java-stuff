
/**
 * Demo usage of "private" and "protected" modifiers.
 * In some cases, private and protected methods can be applied to objects (rather than in other languages).
 */
public class AccessModifiers {

    public static void main(String[] args) {
        InnerClass inner = new InnerClass();
        // valid
        inner.protectedMethod();
        // valid
        inner.privateMethod();

        StandaloneClass standalone = new StandaloneClass();
        // valid
        standalone.protectedMethod();
        // invalid
        //standalone.privateMethod();
    }

    static class InnerClass {
        private void privateMethod() {
            System.out.println("Inner class private method");
        }

        protected void protectedMethod() {
            System.out.println("Inner class protected method");
        }
    }
}

class StandaloneClass {
    private void privateMethod() {
        System.out.println("Standalone class private method");
    }

    protected void protectedMethod() {
        System.out.println("Standalone class protected method");
    }
}