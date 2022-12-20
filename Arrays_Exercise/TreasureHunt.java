import java.util.Scanner;
public class TreasureHunt {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] loot = scanner.nextLine().split("\\|");
            boolean isFound = false;
            String[] stealLoot = new String[loot.length];

            String[] command = scanner.nextLine().split(" ");

            while (!command[0].equals("Yohoho!")) {
                switch (command[0]) {
                    case "Loot":
                        for (int index = 1; index <= command.length - 1; index++) {
                            for (int lootIndex = 0; lootIndex <= loot.length - 1; lootIndex++) {
                                if (!(loot[lootIndex].equals(command[index]))) {
                                    isFound = false;
                                } else {
                                    isFound = true;
                                    break;
                                }
                            }
                            if (!isFound) {
                                String[] tempLoot = new String[loot.length + 1];
                                tempLoot[0] = command[index];
                                for (int i = 1; i <= tempLoot.length - 1; i++) {
                                    tempLoot[i] = loot[i - 1];
                                }
                                loot = tempLoot.clone();
                            }
                        }
                        break;
                    case "Drop":
                        int dropIndex = Integer.parseInt(command[1]);
                        if (dropIndex < 0 || dropIndex >= loot.length - 1) {

                            break;
                        }
                        String swapLoot = loot[dropIndex];
                        for (int index = dropIndex; index < loot.length - 1; index++) {
                            loot[index] = loot[index + 1];
                        }
                        loot[loot.length - 1] = swapLoot;

                        break;
                    case "Steal":
                        int stealIndex = Integer.parseInt(command[1]);
                        if (stealIndex > loot.length) {
                            stealIndex = loot.length;
                        }
                        stealLoot = new String[stealIndex];
                        for (int index = loot.length - stealIndex; index < loot.length; index++) {
                            stealLoot[index - loot.length + stealIndex] = loot[index];
                        }
                        String[] tempLoot = new String[loot.length - stealIndex];
                        for (int index = 0; index < loot.length - stealIndex; index++) {
                            tempLoot[index] = loot[index];
                        }
                        loot = tempLoot.clone();
                        for (int index = 0; index < stealLoot.length-1; index++) {
                            System.out.print(stealLoot[index] + ", ");
                        }
                        System.out.print(stealLoot[stealLoot.length - 1]);
                        System.out.println();

                        break;
                }
                command = scanner.nextLine().split(" ");
            }
            if (loot.length == 0) {
                System.out.println("Failed treasure hunt.");
            } else {

                int sum = 0;
                for (int index = 0; index <= loot.length - 1; index++) {
                    String currentElement = loot[index];
                    int chars = currentElement.length();
                    sum += chars;
                }
                double average = sum * 1.0 / loot.length;
                System.out.printf("Average treasure gain: %.2f pirate credits.", average);
            }


        }
}
