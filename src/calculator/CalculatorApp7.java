package calculator;

import java.util.Scanner;

//例外発生防止のためtry-catchとhasNextInt()を使用する
//小数に対応するためにdouble型に変更
//変数名変更



public class CalculatorApp7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // --- 1つ目の整数入力 ---
                double firstNum = inputDouble(scanner, "1つ目の整数を入力してください: ");

                // --- 2つ目の整数入力 ---
                double secondNum = inputDouble(scanner, "2つ目の整数を入力してください: ");

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
                        result = add(firstNum, secondNum);
                        break;
                    case 2:
                        result = subtract(firstNum, secondNum);
                        break;
                    case 3:
                        result = multiply(firstNum, secondNum);
                        break;
                    case 4:
                        result = divide(firstNum, secondNum);
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
    public static double add(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public static double subtract(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public static double multiply(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    public static double divide(double firstNum, double secondNum) {
        if (secondNum == 0) {
            throw new ArithmeticException("0 で割ることはできません。");
        }
        return firstNum / secondNum;
    }
}

