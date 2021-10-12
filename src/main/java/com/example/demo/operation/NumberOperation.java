package com.example.demo.operation;

public class NumberOperation {
    private int number;//数字
    private static NumberOperation numberOperation = new NumberOperation();//接口
    private NumberOperation(){

    }

    /**
     * 返回接口
     * @return
     */
    public static NumberOperation getNumberOperation() {
        return numberOperation;
    }

    /**
     * 设置新的数字
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * 返回数字
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * 对数字进行相加
     * @param n
     */
    public synchronized void add(int n){
        this.number+=n;
    }

    /**
     * 初始化数字
     */
    public void init(){
        this.number=0;
    }
}
