import java.util.Scanner;
public class CoffeeMachine{
    Scanner scanner = new Scanner(System.in);
    Ingredient ingredient = new Ingredient();

    int espressoMoney = 4000;
    int latteMoney = 7000;
    int cappuccinoMoney = 6000;
    int espressoWater = 250;
    int latteWater = 350;
    int cappuccinoWater = 200;
    int espressoCoffeeBeans = 16;
    int latteCoffeeBeans = 20;
    int cappuccinoCoffeeBeans = 12;
    int latteMilk = 75;
    int cappuccinoMilk = 100;
    void buy(){
        System.out.println("어떤 커피를 구매하시겠습니까?");
        System.out.println("1. 에스프레소 (가격 : 4000원)");
        System.out.println("2. 라떼 (가격 : 7000원)");
        System.out.println("3. 카푸치노 (가격 : 6000원)");
        System.out.print("> ");
        int buySelect = Integer.parseInt(scanner.nextLine());
        if(buySelect == 1){
            if((ingredient.getWater() - espressoWater) < 0 || (ingredient.getCoffeeBeans() - espressoCoffeeBeans) < 0){
                coffeeMachineState();
                return;
            }else {
                System.out.println("커피를 구매하였습니다. 감사합니다.");
                ingredient.setMoney(ingredient.getMoney() + espressoMoney);
                ingredient.setWater(ingredient.getWater() - espressoWater);
                ingredient.setCoffeeBeans(ingredient.getCoffeeBeans() - espressoCoffeeBeans);
                System.out.println("에스프레소가 준비되었습니다. 맛있게 드세요.");
            }
        } else if(buySelect == 2){
            if((ingredient.getWater() - latteWater) < 0 || (ingredient.getMilk() - latteMilk) < 0 || (ingredient.getCoffeeBeans() - latteCoffeeBeans) < 0){
                coffeeMachineState();
                return;
            } else {
                ingredient.setMoney(ingredient.getMoney() + latteMoney);
                ingredient.setWater(ingredient.getWater() - latteWater);
                ingredient.setMilk(ingredient.getMilk() - latteMilk);
                ingredient.setCoffeeBeans(ingredient.getCoffeeBeans() - latteCoffeeBeans);
                System.out.println("라떼가 준비되었습니다. 맛있게 드세요.");
            }
        } else if(buySelect == 3) {
            if((ingredient.getWater() - cappuccinoWater) < 0 || (ingredient.getMilk() - cappuccinoMilk) < 0 || (ingredient.getCoffeeBeans() - cappuccinoCoffeeBeans) < 0){
                coffeeMachineState();
                return;
            } else {
                ingredient.setMoney(ingredient.getMoney() + cappuccinoMoney);
                ingredient.setWater(ingredient.getWater() - cappuccinoWater);
                ingredient.setMilk(ingredient.getMilk() - cappuccinoMilk);
                ingredient.setCoffeeBeans(ingredient.getCoffeeBeans() - cappuccinoCoffeeBeans);
                System.out.println("카푸치노가 준비되었습니다. 맛있게 드세요.");
            }
        }
        ingredient.setDisposableCup(ingredient.getDisposableCup() - 1);
        coffeeMachineState();
    }

    void fill(){
        System.out.println("추가할 물의 양을 입력하세요 :");
        int addWater = Integer.parseInt(scanner.nextLine());
        ingredient.setWater(ingredient.getWater() + addWater);
        System.out.println("추가할 우유의 양을 입력하세요 :");
        int addMilk = Integer.parseInt(scanner.nextLine());
        ingredient.setMilk(ingredient.getMilk() + addMilk);
        System.out.println("추가할 원두의 양을 입력하세요 :");
        int addCoffeeBeans = Integer.parseInt(scanner.nextLine());
        ingredient.setCoffeeBeans(ingredient.getCoffeeBeans() + addCoffeeBeans);
        System.out.println("추가할 일회용 컵의 양을 입력하세요 :");
        int addDisposableCup = Integer.parseInt(scanner.nextLine());
        ingredient.setDisposableCup(ingredient.getDisposableCup() + addDisposableCup);

        coffeeMachineState();
    }

    void take(){
        System.out.println("돈을 꺼내기 : " + ingredient.getMoney());
        ingredient.setMoney(0);
        coffeeMachineState();
    }

    void coffeeMachineState() {
        System.out.println("남은 재료와 돈 상태: ");
        System.out.println("물 : " + ingredient.getWater() + "ml");
        System.out.println("우유 : " + ingredient.getMilk() + "ml");
        System.out.println("원두 : " + ingredient.getCoffeeBeans() + "g");
        System.out.println("일회용 컵 : " + ingredient.getDisposableCup() + "개");
        System.out.println("돈 : " + ingredient.getMoney() + "원");
    }
}
