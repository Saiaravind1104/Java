import java.util.Scanner;

public class comb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int sum = 0;
        int pro = 1;
        boolean status = false;
        for (int i = m; i <= n; i++) {
            sum += i;
            pro += i;
        }
        int permanent = sum;
        int sqrneo = sum * sum;
        int total = 0;
        for (int i = sum; i != 0; i /= 10) {
            int last = i % 10;
            total += last;
        }
        if (total == permanent) {
            System.out.println("Neo number = " + permanent);
            for (int i = 1; i < sum; i++) {
                if (sum % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Not a neo number = " + permanent);
        }
        int perfectSum = 0;
        for (int i = 1; i < sum; i++) {
            if (sum % i == 0) {
                perfectSum += i;
            }
        }
        if (perfectSum == sum) {
            System.out.println("Perfect number = " + sum);
            for (int i = 1; i < sum; i++) {
                if (sum % i == 0) {
                    System.out.println(i);
                }

            }
        }else{
            System.out.println("Not a perfect number = " + sum);
        }

            boolean sqrStus = false;
            for (int i = 1; i <= sum; i++) {
                int sqr1 = i * i;
                if (sum == sqr1) {
                    sqrStus = true;
                }
            }
            if (sqrStus) {
                System.out.println("Perfect square = " + sum);

                for (int i = 1; i < sum; i++) {
                    if (sum % i == 0) {
                        System.out.println(i);
                    }

                }
            } else {
                System.out.println("Not a perfect square = " + sum);
            }
            boolean primeStstus = false;
            for (int i = 1; i <= sum; i++) {
                int count = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    if (i == sum) {
                        primeStstus = true;
                    }
                }
            }
            if (primeStstus) {
                System.out.println("Prime number = " + sum);

                for (int i = 1; i < sum; i++) {
                    if (sum % i == 0) {
                        System.out.println(i);
                    }

                }
            } else {
                System.out.println("not a prime number = " + sum);
            }
            if (permanent == pro) {
                System.out.println("Spy number = " + sum);

                for (int i = 1; i < sum; i++) {
                    if (sum % i == 0) {
                        System.out.println(i);
                    }

                }
            } else {
                System.out.println("Not a Spy number = " + sum);
            }
            int totalCount = 0;
            for (int i = sum; i != 0; i /= 10) {
                int last = sum % 10;
                int lastCount = 0;
                for (int j = 1; j < last; j++) {
                    if (last % j == 0) {
                        lastCount += j;
                    }
                }
                totalCount += lastCount;
            }
            if (permanent == totalCount) {
                System.out.println("Strong number = " + sum);

                for (int i = 1; i < sum; i++) {
                    if (sum % i == 0) {
                        System.out.println(i);
                    }

                }
            } else {
                System.out.println("Not a strong number = " + sum);
            }

            int num = permanent + 1;
            boolean numStus = false;
            for (int i = 1; i <= num; i++) {
                int sqr1 = i * i;
                if (permanent == sqr1) {
                    numStus = true;
                }
            }
            if (numStus) {
                System.out.println("Perfect square = " + sum);

                for (int i = 1; i < permanent; i++) {
                    if (sum % i == 0) {
                        System.out.println(i);
                    }

                }
            } else {
                System.out.println("Not a perfect square = " + sum);
            }
            boolean bool = false;
            int sunny = permanent + 1;
            for (int i = 1; i <= sunny; i++) {
                int j = i * i;
                if (sunny == j) {
                    bool = true;
                }
            }
            if (bool) {
                System.out.print("Sunny number = " + sum);
                for (int i = 1; i < permanent; i++) {
                    if (sum % i == 0) {
                        System.out.println(i);
                    }

                }
            } else {
                System.out.println("Not a sunny number");
            }

        }
    }

