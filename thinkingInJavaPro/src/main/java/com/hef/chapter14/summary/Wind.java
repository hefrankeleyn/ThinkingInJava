package com.hef.chapter14.summary;

/**
 * @author lifei
 * @since 2020/9/10
 */
public class Wind implements Instrument{
    @Override
    public void play() {
        System.out.println("wind");
    }

    public void clearSpitValue(){
        System.out.println("clear Spit");
    }
}
