public class MyArrays {

    // https://en.wikipedia.org/wiki/Insertion_sort

    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            int k = a[i];
            int j = i - 1;
            while (j > -1 && a[j] > k) {
                a[j + 1] = a[j];
                --j;
            }
            a[j + 1] = k;
        }
    }

    public static void insertSort(Object[] a) {
        for (int i = 1; i < a.length; ++i) {
            Object k = a[i];
            int j = i - 1;
            while (j > -1 && ((MyComparable)a[j]).compareTo(k) > 0) {
                a[j + 1] = a[j];
                --j;
            }
            a[j + 1] = k;
        }
    }

    public static void insertSort(Object[] a, MyComparator cmp) {
        for (int i = 1; i < a.length; ++i) {
            Object k = a[i];
            int j = i - 1;
            while (j > -1 && cmp.compare(a[j], k) > 0) {
                a[j + 1] = a[j];
                --j;
            }
            a[j + 1] = k;
        }
    }
}
