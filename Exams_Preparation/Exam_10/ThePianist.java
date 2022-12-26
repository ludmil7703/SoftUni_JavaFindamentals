import java.util.*;
public class ThePianist {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            Map<String, List<String>> pieceMap=new LinkedHashMap<>();

            int n=Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                String[] input=scanner.nextLine().split("\\|");

                String pieceName=input[0];
                String composer=input[1];
                String tone=input[2];

                List<String> pieceInfo=new ArrayList<>();
                pieceInfo.add(composer);
                pieceInfo.add(tone);

                pieceMap.put(pieceName,pieceInfo );
            }
            String command= scanner.nextLine();

            while (!command.equals("Stop")){
                String[] tokens=command.split("\\|");
                switch (tokens[0]){
                    case "Add":
                        String pieceName=tokens[1];
                        String composer=tokens[2];
                        String tone=tokens[3];
                        if(pieceMap.containsKey(pieceName)){
                            System.out.printf("%s is already in the collection!%n",pieceName);
                        } else {
                            List<String> info=new ArrayList<>();
                            info.add(composer);
                            info.add(tone);
                            pieceMap.put(pieceName,info);
                            System.out.printf("%s by %s in %s added to the collection!%n",pieceName,composer,tone);
                        }

                        break;
                    case "Remove":
                        String piece=tokens[1];
                        if (pieceMap.containsKey(piece)){
                            pieceMap.remove(piece);
                            System.out.println("Successfully removed "+piece+"!");
                        } else {
                            System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                        }

                        break;
                    case "ChangeKey":
                        String pieceChange=tokens[1];
                        String newKey=tokens[2];
                        if (pieceMap.containsKey(pieceChange)){

                            List<String> currentInfo=pieceMap.get(pieceChange);
                            currentInfo.remove(1);
                            currentInfo.add(newKey);
                            pieceMap.put(pieceChange,currentInfo);
                            System.out.printf("Changed the key of %s to %s!%n",pieceChange,newKey);
                        } else {
                            System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceChange);
                        }


                        break;
                    default:break;

                }
                command= scanner.nextLine();
            }
            pieceMap.entrySet().forEach(entry-> System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));
        }
}
