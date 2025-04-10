System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
        isPrime = false;
        break;
        }
        }
        if (isPrime) {
        System.out.println(num + " is a prime number.");
        } else {
         System.out.println(num + " is not a prime number.");
         }
         sc.close(); 