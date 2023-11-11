public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 'Калькулятор' :");
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1); // в примере  "1-1" будет b = 0. На 0 делить нельзя.
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
//        /////////////////////////////////////////////////
        System.out.println("Задание 'Воркер' :");
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}