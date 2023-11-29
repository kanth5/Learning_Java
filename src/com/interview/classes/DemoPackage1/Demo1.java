package com.interview.classes.DemoPackage1;

import com.interview.classes.DemoPackage2.Demo3;

public class Demo1 {

    public static void main(String[] args) {

        // Public class belonging to this package is accessible here

        PublicClassDP1 pcdp1 = new PublicClassDP1();

        pcdp1.getNameDP1();

        // Package Private or Default class of this package is accessible within this package

        DefaultClassDP1 dcdp1 = new DefaultClassDP1();

        dcdp1.getNameDCDP1();

        // Protected members from a class in this package are also accessible here

        DP1ProtectedVar dp1pv = new DP1ProtectedVar();

        dp1pv.getDP1ProtectedName();
    }
}

//    Marked   | Visible | Visible | Visible  | Visible |
//    with     | Within  | within  | within   | within  |
//    Modifier | Class   | Package | Subclass | World   |

//    public	 yes	     yes	   yes	     yes
//   protected	 yes	     yes	   yes	     no
//    default	 yes	     yes	   no	     no    (package-private)
//    private	 yes	     no	       no	     no

