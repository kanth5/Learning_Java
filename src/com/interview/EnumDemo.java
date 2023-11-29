package com.interview;

class EnumDemo {
    public static void main( String args[] ) {
        // Invoking the method for Superheroes
        ApplySuperpowers(Superheroes.values());

        // Invoking the same method for IndianSuperheroes
        ApplySuperpowers(IndianSuperheroes.values());
    }

    static void ApplySuperpowers(Hero... heroes) {
        for (Hero hero : heroes) {
            hero.applySuperpower();
        }
    }
}

interface Hero {
    void applySuperpower();
}

enum IndianSuperheroes implements Hero {
    Shaktimaan {
        public void applySuperpower() {
            System.out.println("seven chakras of kundalini");
        }
    },

    Aryamaan {
        public void applySuperpower() {
            System.out.println("chandrahaas");
        }
    },
    Captain_Vyom {
        public void applySuperpower() {
            System.out.println("yoga");
        }
    }
}

enum Superheroes implements Hero {
    Superman {
        public void applySuperpower() {
            System.out.println("fly away");
        }
    },
    Batman {
        public void applySuperpower() {
            System.out.println("fight crime");
        }
    },
    Flash {
        public void applySuperpower() {
            System.out.println("sprint ");
        }
    }
}