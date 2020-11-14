package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	int value = 2;
//	if(value == 1){
//        System.out.println("value was 1");
//    } else if(value ==2){
//        System.out.println("value was 2");
//    } else {
//        System.out.println("value was not 1 or 2");
//    }

// INT SWITCH ==
	int switchValue = 4;

	switch(switchValue){
        case 1:
	        System.out.println("value was 1 (switch)");
	        break;
        case 2:
            System.out.println("value was 2 (switch)");
	        break;
        case 3: case 4: case 5:
            System.out.println("was a 3 or a 4 or a 5");
            break;

        default:
            System.out.println("was not 1 or 2 (switch)");
        }

//CHAR SWITCH ==
        char singleCharacter = 'D';
        switch(singleCharacter){
            case'A': case 'B': case'C' : case 'D': case 'E':{
                System.out.println(singleCharacter + " was found");
                break;
            }
            default:
                System.out.println("Neither A,B,C,D or E was found.");
        }
// STRING SWITCH ==
        String month = "janUary";

        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "febuary":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            default:
                System.out.println("Neither January, Febuary or March was the date.");
                break;
        }
    }
}
