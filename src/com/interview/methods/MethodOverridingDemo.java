package com.interview.methods;

// In case of an overridden method, the correct version to invoke is decided at runtime contrary to overloaded methods. The method to
// invoke is decided on the runtime type of the object rather than compile time type. This is opposite to what happens in the case
// of overloaded methods.

class MethodOverridingDemo {
    public static void main( String args[] ) {
        IamDerived derivedObj = new IamDerived();
        IamSuper superObj = derivedObj;
        superObj.sayMyName();
    }
}

class IamSuper {

    void sayMyName() {
        System.out.println("I am the super class.");
    }
}

class IamDerived extends IamSuper {

    @Override
    void sayMyName() {
        System.out.println("I am the derived class.");
    }
}
