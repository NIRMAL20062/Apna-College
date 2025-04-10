import java.util.Scanner;

public class DatingFlow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anyone dating you? (yes/no): ");
        String datingStatus = sc.nextLine().trim().toLowerCase();

        if (datingStatus.equals("yes")) {
            System.out.println("Okay chill . I wish you both a happy toxic-free life .");
        } else if (datingStatus.equals("no")) {
            System.out.println("Do you want to date someone and haven't dated yet? (yes/no): ");
            String wantsToDate = sc.nextLine().trim().toLowerCase();

            if (wantsToDate.equals("no")) {
                System.out.println("Would you say yes if I ask you for a date? (yes/no): ");
                String dateRequest = sc.nextLine().trim().toLowerCase();

                if (dateRequest.equals("no")) {
                    System.out.println("Okay chill . We move on like professionals.");
                } else if (dateRequest.equals("yes")) {
                    System.out.println("Are you free tomorrow? (yes/no): ");
                    String freeTomorrow = sc.nextLine().trim().toLowerCase();

                    if (freeTomorrow.equals("yes")) {
                        System.out.println("Let's meet in Crown Mall. Can we? (yes/no): ");
                        String meetPermission = sc.nextLine().trim().toLowerCase();

                        if (meetPermission.equals("yes")) {
                            System.out.println("Awesome! I'll call you tonight . Thanks, looking forward to it! ");
                        } else {
                            System.out.println("Aww, no problem. We'll reschedule or vibe online .");
                        }
                    } else {
                        System.out.println("No worries. Time is luxury, and we both are premium .");
                    }
                } else {
                    System.out.println("Not sure what that means, but you seem interesting already. ");
                }

            } else {
                System.out.println("Nice! Shoot your shot, the universe loves bold moves .");
                System.out.println("Is the guy from our class? (yes/no): ");
                String fromClass = sc.nextLine().trim().toLowerCase();

                if (fromClass.equals("yes")) {
                    System.out.print("What's his name? Type the full name: ");
                    String guyName = sc.nextLine().trim().toLowerCase();

                    if (guyName.equals("nirmal")) {
                        System.out.println("Would you like to date him tomorrow? (yes/no): ");
                        String dateNirmal = sc.nextLine().trim().toLowerCase();

                        if (dateNirmal.equals("yes")) {
                            System.out.println("Sweet! I will call you tonight .");
                        } else {
                            System.out.println("Alright, maybe another time. Respecting your vibe .");
                        }
                    } else {
                        System.out.println("Aww, ok cool ");
                    }
                } else {
                    System.out.println("Okay, mysterious crush detected . Manifest that love!");
                }
            }

        } else {
            System.out.println("Hmm... you kinda dodged that. Respectfully mysterious .");
        }

        sc.close();
    }
}
