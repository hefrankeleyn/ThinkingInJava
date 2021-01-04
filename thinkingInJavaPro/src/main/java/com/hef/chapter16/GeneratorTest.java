package com.hef.chapter16;

/**
 * @author lifei
 * @since 2020/9/22
 */
public class GeneratorTest {

    public static int size = 10;
    public static void test(Class<?> surroundingClass){
        // getClasses() 方法 可以生成所有的嵌套类
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.print(type.getSimpleName() + ": ");
            try {
                Generator<?> g = (Generator<?>)type.newInstance();
                for (int i = 0; i < size; i++) {
                    System.out.print(g.next() + " ");
                }
                System.out.println();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
    }
}
