package edu.eci.arsw.math;

public class PiDigitsThreads extends Thread {
    private int start;
    private int numPlusOne;
    private byte[] num;
    private PiDigitsThreads prime;

    public PiDigitsThreads(int start, int numPlusOne) {
        this.start = start;
        this.numPlusOne = numPlusOne;
    }

    public void run(){
        this.prime = new PiDigitsThreads(start, numPlusOne);
    }

    public void getNum(byte[] num){
        getNum(num);
    }
}