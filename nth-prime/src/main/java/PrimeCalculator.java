class PrimeCalculator {

    int nth(int nth) {

        if(nth < 1){
            throw  new IllegalArgumentException();
        }

        int currentPosition = 1;
        int currentNumber = 2;

        while(true){
            int divisor=2;
            for(; divisor<=currentNumber/2; divisor++){
                if((currentNumber % divisor) == 0){
                    break;
                }
            }
            if(divisor>currentNumber/2){
                if(currentPosition == nth){
                    break;
                }
                currentPosition++;
            }
            currentNumber++;
        }

        return currentNumber;
    }
}
