import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("Добро пожаловать\n" + info());

        while (true) {
            try {
                while (true) {
                    int n = scanner.nextInt();
                    if (n == 4){break;}
                    switch (n) {
                        case 1:
                            while(true) {
                                System.out.print("Сколько денег хотите положить: ");
                                double a = scanner.nextDouble();
                                if (a < 60000 && a > 0) {
                                    bankAccount.deposit(a);
                                    break;
                                } else {
                                    System.out.println("Должны быть больше \"0\" и меньше \"60000\"");
                                }
                            } break;

                        case 2:
                            System.out.println("Остaток на счёте: " + bankAccount.getAmount());
                            break;

                        case 3:
                            while(true) {
                                System.out.print("Сколько денег хотите снять: ");
                                int b = scanner.nextInt();
                                if (b < 55000 && b > 0) {
                                    bankAccount.withDraw(b);
                                    break;
                                } else {
                                    System.out.println("Должны быть больше \"0\" и меньше \"55000\"");
                                }
                            } break;

                        default:
                            System.out.println("Вы должны набрать \"1\", \"2\" или \"3\"");
                            continue;
                    }
                    System.out.println(info());
                } break;
            } catch (Exception e){
                System.out.println("Вы должны набрать \"1\", \"2\" или \"3\"");
            }
        }
    }
    public static String info(){
        String mess = "Наберите \"1\" чтобы положить деньги на счёт\nНаберите \"2\" чтобы увидеть баланс счёта\nНаберите \"3\" для снятия денег \nНаберите \"4\" для выхода";
        return mess;
    }
}