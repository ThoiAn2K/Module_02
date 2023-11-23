class LazyPrimeFactorization implements Runnable {
    private static final int LIMIT = 10;

    @Override
    public void run() {
        int number = 2;
        int count = 0;
        while (count < LIMIT) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorization: Found prime number - " + number);
                count++;
            }
            number++;
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
