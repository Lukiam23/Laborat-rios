class Main{
        public static void main(String arg[]){
                Expression op1, op2, op3, op4, op5;

                op1 = new Operando(45);
                op2 = new Seno(op1);

                System.out.println(op2.calcular());
        }
}
