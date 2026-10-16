class ExceptionDemo{

    public static void main(String[] args){

        //int i = 4; --> Normal statement
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        }
        catch(Exception e){
            System.out.println();
            System.out.println("Something went wrong! " + e);
        }

        System.out.println(j);

        System.out.println("Bye");

    }

}