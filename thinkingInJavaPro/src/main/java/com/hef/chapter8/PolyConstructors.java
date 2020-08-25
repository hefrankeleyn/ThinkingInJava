package com.hef.chapter8;


class Glyph{
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
    void draw(){
        System.out.println("Glyph.draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(). radius = " + radius);
    }
}

/**
 * @author lifei
 * @since 2020/8/25
 */
public class PolyConstructors {

    /*
    Glyph() before draw()
RoundGlyph.draw(). radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
     */
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}


