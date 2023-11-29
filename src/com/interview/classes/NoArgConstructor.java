package com.interview.classes;

// The below code will not compile because the parent class doesn't define a no-argument default constructor.
// We could either invoke the parent’s one parameter constructor within the child’s constructor or
// add a default constructor to the parent. Also note that if the parent defined no constructor at all,
// the snippet would compile because the compiler would supply a no-argument constructor in the absence
// of any user-defined constructors.

public class NoArgConstructor {
    public class ParentClass {

        protected int counter;

        public ParentClass(int val) {
            this.counter = val;
        }

        public ParentClass() {
        }

    }

    public class EmptyChildClass extends ParentClass {

        public EmptyChildClass() {

        }
    }

}


