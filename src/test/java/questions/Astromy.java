package questions;

import java.util.Scanner;

public class Astromy {

        public static void main(String [] args){
            runAstroQuestions();
        }

    public static void runAstroQuestions() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n(1) When is a Star considered to be a star?" +
                "\n-->(a)When there are planets around it." +
                "\n-->(b)When the core of the star is hot enough to generate Nuclear Fusion." +
                "\n-->(c)When the star gets it Sun Licence." +
                "\nAnswer---> ");

        String answer = input.next();
        switch (answer) {
            case "a":
            case "c":
                System.out.println("Wrong!!! The Correct Answer is:" +
                        "\n(B)When the core of the star is hot enough to generate Nuclear Fusion.");
                break;
            case "b":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid Value...");
        }
        System.out.print("\n(2)What is a Supernova?" +
                "\n-->(a)The death of a Star." +
                "\n-->(b)The core of the Star." +
                "\n-->(c)The Stars Surface." +
                "\nAnswer---> ");

        String answer2 = input.next();
        switch (answer2) {
            case "b":
            case "c":
                System.out.println("Wrong!!! The Correct Answer is:" +
                        "\nThe death of a Star..");
                break;
            case "a":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid Value...");
        }
        System.out.print("\n(3)What is a Singularity?" +
                "\n-->(a)A gravitational force that becomes infinite in density." +
                "\n-->(b)When atoms split." +
                "\n-->(c)When 2 atoms merge." +
                "\nAnswer---> ");

        String answer3 = input.next();
        switch (answer3) {
            case "b":
            case "c":
                System.out.println("Wrong!!! The Correct Answer is:" +
                        "\n(a)A gravitational force that becomes infinite in density.");
                break;
            case "a":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid Value...");
        }
        System.out.print("\n(4)How many atoms does an element need to exist in nature?" +
                "\n-->(a)12." +
                "\n-->(b)4." +
                "\n-->(c)2." +
                "\nAnswer---> ");

        String answer4 = input.next();
        switch (answer4) {
            case "a":
            case "b":
                System.out.println("Wrong!!! The Correct Answer is:" +
                        "\n.(c)2");
                break;
            case "c":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid Value...");
        }
        System.out.print("\n(5)What is the most Harmful type of radiation?" +
                "\n-->(a)Solar Radiation." +
                "\n-->(b)Gamma Rays." +
                "\n-->(c)X-rays." +
                "\nAnswer---> ");

        String answer5 = input.next();
        switch (answer5) {
            case "a":
            case "c":
                System.out.println("Wrong!!! The Correct Answer is:" +
                        "\n(b)Gamma Rays.");
                break;
            case "b":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid Value...");
        }
        System.out.print("\n(6)What is a cluster of dust and gas called?" +
                "\n-->(a)A Gas Station." +
                "\n-->(b)Hypernova." +
                "\n-->(c)Nebula." +
                "\nAnswer---> ");

        String answer6 = input.next();
        switch (answer6) {
            case "a":
            case "b":
                System.out.println("Wrong!!! The Correct Answer is:" +
                        "\n(c)Nebula.");
                break;
            case "c":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid Value...");
        }
        System.out.print("\n(7)Which Direction does a Comets tail always face?" +
                "\n-->(a)In the direction of the Star it orbits." +
                "\n-->(b)It faces all directions." +
                "\n-->(c)In the opposite direction of the Star it orbits." +
                "\nAnswer---> ");

        String answer7 = input.next();
        switch (answer7) {
            case "a":
            case "b":
                System.out.println("Wrong!!! The Correct Answer is:" +
                        "\n(c)In the opposite direction of the Star it orbits.");
                break;
            case "c":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid Value...");
        }
        System.out.print("\n(8)What is an Event Horizon?" +
                "\n-->(a)It is a boundary where events can not affect an observer." +
                "\n-->(b)The Outta Atmosphere of a planet." +
                "\n-->(c)A floating jar of jam." +
                "\nAnswer---> ");

        String answer8 = input.next();
        switch (answer8) {
            case "b":
            case "c":
                System.out.println("Wrong!!! The Correct Answer is:" +
                        "\n(a)It is a boundary where events can not affect an observer.");
                break;
            case "a":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid Value...");
        }
        System.out.print("\n(9)What is a Quasar?" +
                "\n-->(a)It is when a white dwarf suddenly gets a major serge of energy." +
                "\n-->(b)When a Super Massive Black hole emits plasma like energy throughout space." +
                "\n-->(c)When a Stars core cracks." +
                "\nAnswer---> ");

        String answer9 = input.next();
        switch (answer9) {
            case "a":
            case "c":
                System.out.println("Wrong!!! The Correct Answer is:" +
                        "\n(b)When a Super Massive Black hole emits plasma like energy throughout space.");
                break;
            case "b":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid Value...");
        }
        System.out.print("\n(10)What kind of celestial body has a gravitational force strong enough that light" +
                " can not escape it?" +
                "\n-->(a)A Neutron Star." +
                "\n-->(b)A Magnetar." +
                "\n-->(c)A Black Hole." +
                "\nAnswer---> ");

        String answer10 = input.next();
        switch (answer10) {
            case "a":
            case "b":
                System.out.println("Wrong!!! The Correct Answer is:" +
                        "\n(c)A Black Hole.");
                break;
            case "c":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid Value...");
        }
    }
}
