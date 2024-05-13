import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в формате: число оператор число");
        int result;
        try {
            // Считываем выражение
            String input = scanner.nextLine();

            // Разбиваем строку на операнды и оператор
            String[] tokens = input.split(" ");
            if (tokens.length != 3) {
                throw new IllegalArgumentException("Неверный формат выражения");
            }

            // Парсим операнды
            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[2]);

            // Выполняем операцию
          if ("+".equals(tokens[1])) {
              result = a + b;
          } else if ("-".equals(tokens[1])) {
              result = a - b;
          } else if ("*".equals(tokens[1])) {
              result = a * b;
          } else if ("/".equals(tokens[1])) {
              if (b == 0) {
                  throw new ArithmeticException("Деление на ноль");
              }
              result = a / b;
          } else {
              throw new IllegalArgumentException("Неверный оператор");
          }

            // Выводим результат
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.err.println("Ошибка: Неправильный формат числа");
        }
            
        scanner.close();
    }
}
