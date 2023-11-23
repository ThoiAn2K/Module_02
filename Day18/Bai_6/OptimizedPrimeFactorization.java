class OptimizedPrimeFactorization implements Runnable {
    private static final int LIMIT = 10;

    @Override
     public synchronized void run() {
        int number = 2;
        int count = 0;
        while (count < LIMIT) {
            if (isPrime(number)) {
                System.out.println("OptimizedPrimeFactorization: Found prime number - " + number);
                count++;
            }
            number++;
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}