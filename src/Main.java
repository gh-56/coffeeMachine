import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean run = true;
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("커피 머신이 가동되었습니다.");
        System.out.println("현재 커피머신 상태: ");
        coffeeMachine.coffeeMachineState();
        while(run) {
            System.out.println("==========================");
            System.out.println("옵션을 선택하세요");
            System.out.println("1. 구매 | 2. 채우기 | 3. 가져가기 | 4. 종료");
            System.out.print("> ");
            int select = Integer.parseInt(scanner.nextLine());
            System.out.println("==========================");

            if(select == 1){
                coffeeMachine.buy();
            } else if(select == 2) {
                coffeeMachine.fill();
            } else if(select == 3){
                coffeeMachine.take();
            } else if(select == 4) {
                System.out.println("커피머신이 종료되었습니다.");
                run = false;
            }
        }
    }
}