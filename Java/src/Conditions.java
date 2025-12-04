public class Conditions {
    static void main() {
        boolean raining = true;

        if(raining){
            System.out.println("Take the umbrella");
        }else{
            System.out.println("Don't take the umbrella");
        }


        boolean homework_completed = false;
        if(homework_completed) {
            System.out.println("Yes, you can play video games");
        } else {
            System.out.println("No, you can't play video games");
        }


        int current_temperature = 19;

        if (current_temperature <= 10) {
            System.out.println("Take very warm jacket");
        }else if (current_temperature <= 18) {
            System.out.println("Take good jacket");
        }else if (current_temperature >=18 && current_temperature <= 28) {
            System.out.println("Take light jacket");
        } else {
            System.out.println("No any jacket is required");
        }

        double marks_percentage = 89.99;

        if (marks_percentage >=60) {
            System.out.println("1st Division");
        }else if (marks_percentage >=50) {
            System.out.println("2nd Division");
        }else if (marks_percentage >=30) {
            System.out.println("3rd Division");
        }else {
            System.out.println("Fail");
        }

    }
}
