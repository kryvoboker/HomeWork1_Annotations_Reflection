package ru.live.kamaz_cs;

public class Tester {
    public static int job(int... ls) {
        int sum = 0;
        for (int l : ls) {
            sum += l;
        }
        return sum;
    }

    @Test(a = 2, b = 5)
    public void test() {
        int sum = job(2, 5);
        System.out.println("Tester: " + sum);
    }
}

