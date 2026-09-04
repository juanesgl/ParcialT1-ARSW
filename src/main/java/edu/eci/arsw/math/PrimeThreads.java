package edu.eci.arsw.math;

public class PrimeThreads extends Thread {
    private int start;
    private int numPlusOne;
    private byte[] num;
    private PrimeThreads prime;

    public PrimeThreads(int start, int numPlusOne) {
        this.start = start;
        this.numPlusOne = numPlusOne;
    }

    public void run(){
        this.prime = new PrimeThreads(start, numPlusOne);
    }

    public void getNum(byte[] num){
        getNum(num);
    }
}
