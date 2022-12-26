import java.util.*;
public class HeroesOfCodeAndLogicVII {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int n=Integer.parseInt(scanner.nextLine());
            Map<String, List<Integer>> heroesMap=new LinkedHashMap<>();

            for (int i = 0; i < n; i++) {
                String[] heroesInfo=scanner.nextLine().split(" ");
                String heroName=heroesInfo[0];
                int hp=Integer.parseInt(heroesInfo[1]);
                int mp=Integer.parseInt(heroesInfo[2]);

                heroesMap.putIfAbsent(heroName,new ArrayList<>());
                heroesMap.get(heroName).add(0,hp);
                heroesMap.get(heroName).add(1,mp);

            }
            String input= scanner.nextLine();

            while (!input.equals("End")){
                String[] command=input.split(" - ");
                String action=command[0];
                String hero=command[1];

                switch (action){
                    case "CastSpell":
                        int currentMP=Integer.parseInt(command[2]);
                        String spellName=command[3];
                        int mp=heroesMap.get(hero).get(1);

                        if (mp>=currentMP){
                            mp-=currentMP;
                            heroesMap.get(hero).set(1,mp);
                            System.out.printf("%s has successfully cast %s and now has %d MP!%n",hero,spellName,mp);
                        } else {
                            System.out.printf("%s does not have enough MP to cast %s!%n",hero,spellName);
                        }
                        break;
                    case "TakeDamage":
                        int damage=Integer.parseInt(command[2]);
                        String attacker=command[3];
                        int hp=heroesMap.get(hero).get(0);
                        if (hp-damage>0){
                            hp-=damage;
                            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",hero,damage,attacker,hp);
                            heroesMap.get(hero).set(0,hp);
                        } else {
                            heroesMap.remove(hero);
                            System.out.printf("%s has been killed by %s!%n",hero,attacker);
                        }
                        break;
                    case "Recharge":
                        int amount=Integer.parseInt(command[2]);
                        int mP=heroesMap.get(hero).get(1);
                        if (mP+amount>200){
                            amount=200-mP;
                            mP=200;
                        } else {
                            mP+=amount;
                        }
                        heroesMap.get(hero).set(1,mP);
                        System.out.printf("%s recharged for %d MP!%n",hero,amount);
                        break;
                    case "Heal":
                        int healAmount=Integer.parseInt(command[2]);
                        int hP=heroesMap.get(hero).get(0);
                        if (hP+healAmount>100){
                            healAmount=100-hP;
                            hP=100;
                        } else {
                            hP+=healAmount;
                        }
                        heroesMap.get(hero).set(0,hP);
                        System.out.printf("%s healed for %d HP!%n",hero,healAmount);

                        break;
                    default:break;
                }

                input= scanner.nextLine();
            }
            for (Map.Entry<String,List<Integer>> item:heroesMap.entrySet()){
                System.out.println(item.getKey());
                System.out.println("  HP: "+item.getValue().get(0));
                System.out.println("  MP: "+item.getValue().get(1));
            }
        }
}
