public class InheritenceDemo {
    
    public static void main(String[] args){

        // Calc calc = new Calc();
        // System.out.println(calc.add(2, 4));
        // System.out.println(calc.sub(2, 1));

        AdvCalc advCalc = new AdvCalc();
        int r1 = advCalc.add(2, 5);
        int r2 = advCalc.sub(2, 5);
        int r3 = advCalc.multi(2, 5);
        int r4 = advCalc.div(2, 5);

        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4);



    }

}
