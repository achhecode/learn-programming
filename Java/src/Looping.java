public class Looping {
    static void main() {


        // FOR loop

//        String message = "Good morning";
//
//        for(int i=1; i<=100; i++){
//            if(i==1){
//                System.out.System.out.printlnln(message +" "+ (i) + "st person");
//            }else if (i==2){
//                System.out.System.out.printlnln(message +" "+ (i) + "nd person");
//            }else if (i==3){
//                System.out.System.out.printlnln(message +" "+ (i) + "rd person");
//            }else{
//                System.out.System.out.printlnln(message +" "+ (i) + "th person");
//            }
//        }


//        for(int i=2; i<=500; i+=2){
//            System.out.System.out.printlnln(i);
//        }



//        boolean tired = false;
//        int count = 0;
//        while(!tired){
//            System.out.System.out.printlnln("I'm Jumping");
//            count += 1;
//            if (count > 100){
//                System.out.System.out.printlnln("I'm tired after " + (count) + " jumps");
//                tired = true;
//            }
//        }

//        boolean hungry = false;
//
//        int count = 0;
//        do{
//            count++;
//            System.out.System.out.printlnln("I'm eating slice of pizza");
//            if(count==10){
//                hungry=false;
//            }
//        }while (hungry);

        

        for(int i=2; i<=100; i+=3){
            if(i==5 || i==8 || i==11){
                continue;
            }
            System.out.println(i);
        }



        boolean pen_found = false;

        for(int i=0; i<100; i++){
            System.out.println("Finding in drawer "+(i+1));

            if (i==4){
                pen_found = true;
                System.out.println("Pen found in drawer "+(i+1));
                break;
            }
            System.out.println("Pen not found yet");
        }



        int no_of_chocolates = 10;

        for(int i=0; i<10; i++){
            if (i==4 || i==5 || i==6){
                System.out.println("Friend "+(i+1)+" already have chocolates");
                continue;
            }
            System.out.println("Giving chocolate to friend "+(i+1));
        }













    }
}
