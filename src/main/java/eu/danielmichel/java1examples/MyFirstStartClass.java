package eu.danielmichel.java1examples;

class MyFirstStartClass {

    public static void main(String[] args) {
        String output = "";

        for(int i = 1; i<=100; i++){
            if (i%5 == 0){
                output = output.concat("Fitz");
            }
            if(i%7 == 0){
                output = output.concat("Quark");
            }
            if(output.equals("")){
                System.out.println(i);
            }
            else{
                System.out.println(output);
                output = "";
            }
        }

    }

}

