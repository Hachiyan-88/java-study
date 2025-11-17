package calculator;

import java.util.Scanner;

//例外発生防止のためtry-catchとhasNextInt()を使用する
//小数に対応するためにdouble型に変更


public class CalculatorApp8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // --- 1つ目の整数入力 ---
                double a = inputDouble(scanner, "1つ目の整数を入力してください: ");

                // --- 2つ目の整数入力 ---
                double b = inputDouble(scanner, "2つ目の整数を入力してください: ");

                // --- 計算方法の選択 ---
                System.out.println("\n計算方法を選んでください:");
                System.out.println("1: 足し算");
                System.out.println("2: 引き算");
                System.out.println("3: 掛け算");
                System.out.println("4: 割り算");

                int choice = inputInt(scanner, "→ ");

                double result = 0.0;
                boolean valid = true;

                switch (choice) {
                    case 1:
                        result = add(a, b);
                        break;
                    case 2:
                        result = subtract(a, b);
                        break;
                    case 3:
                        result = multiply(a, b);
                        break;
                    case 4:
                        result = divide(a, b);
                        break;
                    default:
                        System.out.println("無効な選択です。");
                        valid = false;
                }

                if (valid) {
                    System.out.println("結果: " + result);
                }

            } catch (ArithmeticException e) {
                System.out.println("⚠️ 計算エラー: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("⚠️ 予期せぬエラーが発生しました: " + e.getMessage());
            }

            // --- 繰り返し確認 ---
            System.out.print("\nもう一度計算しますか？ (y/n): ");
            String again = scanner.next();

            if (!again.equalsIgnoreCase("y")) {
                System.out.println("終了します。お疲れさまでした！");
                break;
            }

            System.out.println();
        }

        scanner.close();
    }

    // --- 整数入力メソッド（メニュー選択用） ---
    public static int inputInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("⚠️ エラー: 整数を入力してください。");
                scanner.next(); // 誤入力を読み捨て
            }
        }
    }
    
    
    // --- 小数入力用メソッド ---
    public static double inputDouble(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                return scanner.nextDouble();
            } else {
                System.out.println("⚠️ エラー: 整数を入力してください。");
                scanner.next(); // 誤入力を読み捨てる
            }
        }
    }

    // --- 計算メソッド ---
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("0 で割ることはできません。");
        }
        return a / b;
    }
}

