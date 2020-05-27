public class Main {
    public static void main(String[] args) {
        int[] a = {4, 1, 2, 6, 8, 4};

        MyArrays.insertSort(a);

        for (int e: a) {
            System.out.print(" " + e);
        }
        System.out.println();

        System.out.println("---");

        Student[] a2 = {
                new Student("StudentC", 3.5, 2000),
                new Student("StudentA", 4.0, 2001),
                new Student("StudentD", 2.5, 1998),
                new Student("StudentB", 3.0, 2001)
        };

        CmpByName cmpByName = new CmpByName();
        MyArrays.insertSort(a2, cmpByName);

        for (Student e: a2) {
            System.out.println(e);
        }

        System.out.println("---");

        Rational[] a3 = {
                Rational.parse("1/2"),
                Rational.parse("1/3"),
                Rational.parse("7/2"),
                Rational.parse("5/7"),
                Rational.parse("2/3")
        };

        MyArrays.insertSort(a3);

        for (Rational e: a3) {
            System.out.print(" " + e);
        }
        System.out.println();

    }
}

class CmpByName implements MyComparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        return s1.name.compareTo(s2.name);
    }
}

