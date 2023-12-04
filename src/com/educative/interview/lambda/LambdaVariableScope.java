package com.educative.interview.lambda;

class LambdaVariableScope {
    public static void main( String args[] ) {

        System.out.println(new LambdaVariableCapture().getInstVar());
        System.out.println(LambdaVariableCapture.getStaticVar());
        Work w = (new LambdaVariableCapture()).captureVariables();
        w.work();
    }
}
class LambdaVariableCapture {

    private static String staticVar = "static variable";
    private String instVar = "instance variable";

    public static String getStaticVar() {
        return staticVar;
    }

    public String getInstVar() {
        return instVar;
    }

    public Work captureVariables() {

        int i = 0;
        Work w = () -> {
            // int i; declaring i would result in compile error.

            String instVar = "lambda variable";
            System.out.println("i = " + i);
            System.out.println(staticVar);
            System.out.println(this.instVar);
            System.out.println(instVar);

            // Let's check what is this pointing to
            System.out.println(this.getClass());
        };

        staticVar = "changed static var";
        instVar = "changed instance var";

        return w;
    }
}

interface Work {

    void work();

}