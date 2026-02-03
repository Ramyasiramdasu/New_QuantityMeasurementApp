package org.example;

import java.util.Scanner;

public class New_QuantityMeasurementApp {

    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            Feet other = (Feet) obj;

            return Double.compare(this.value, other.value) == 0;
        }
    }

    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            Inches other = (Inches) obj;

            return Double.compare(this.value, other.value) == 0;
        }
    }

    static void CheckFeetEquality (double v1, double v2){
        Feet f1 = new Feet(v1);
        Feet f2 = new Feet(v2);

        if(f1.equals(f2)){
            System.out.println("Feet values are equal");
        }
        else{
            System.out.println("Feet values are not equal");
        }
    }

    static void CheckInchesEquality(double v1, double v2){
        Inches i1 = new Inches(v1);
        Inches i2 = new Inches(v2);

        if(i1.equals(i2)){
            System.out.println("Inches values are equal");
        }
        else{
            System.out.println("Inches values are not equal");
        }

    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter first value:");
//        double v1 = sc.nextDouble();
//        System.out.println("Enter unit (FEET or INCH):");
//        Length.LengthUnit u1 = Length.LengthUnit.valueOf(sc.next().toUpperCase());
//
//        System.out.println("Enter second value:");
//        double v2 = sc.nextDouble();
//        System.out.println("Enter unit (FEET or INCH):");
//        Length.LengthUnit u2 = Length.LengthUnit.valueOf(sc.next().toUpperCase());
//
//        Length.QuantityLength q1 = new Length.QuantityLength(v1, u1);
//        Length.QuantityLength q2 = new Length.QuantityLength(v2, u2);
//
//        System.out.println("Are both values equal? " + q1.equals(q2));
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value:");
        double v1 = sc.nextDouble();

        System.out.println("Enter first unit (FEET / INCHES / YARDS / CMS):");
        Length.Unit u1 = Length.Unit.valueOf(sc.next().toUpperCase());

        System.out.println("Enter second value:");
        double v2 = sc.nextDouble();

        System.out.println("Enter second unit (FEET / INCHES / YARDS / CMS):");
        Length.Unit u2 = Length.Unit.valueOf(sc.next().toUpperCase());

        Length l1 = new Length(v1, u1);
        Length l2 = new Length(v2, u2);

        System.out.println("Equal : " + l1.equals(l2));
    }
}