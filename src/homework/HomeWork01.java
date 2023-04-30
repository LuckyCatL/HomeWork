package homework;


import java.util.Arrays;
import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * 猴子吃桃子
         */
        int sum = 1;
        for (int i = 1; i <= 9; i++) {
            sum = (sum + 1) * 2;
        }
        System.out.println(sum);

        /**
         *  鸡兔同笼
         */
        for (int i = 1; i <= 36; i++) {
            if ((i * 2) + (36 - i) * 4 == 94) {
                System.out.println("鸡:" + i + ", 兔子:" + (36 - i));
            }

        }


        /**
         * 三个整数排序
         */
        int[] arr = new int[3];
        System.out.println("请输入数字");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int item : arr) {
            System.out.println(item);
        }


        /**
         *  成绩判断
         */
        System.out.println("请输入一个成绩");
        int score = scanner.nextInt();
        System.out.println(score >= 60 ? "合格" : "不合格");

        /**
         *  判断哪一天
         */
        //年份输入
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        //月份输入
        System.out.println("请输入月份");
        int mouth = scanner.nextInt();
        //日期输入
        System.out.println("请输入日期");
        int day = scanner.nextInt();
        int sumDay = 0;

        switch (mouth - 1) {
            case 11:
                sumDay += 30;
            case 10:
                sumDay += 31;
            case 9:
                sumDay += 30;
            case 8:
                sumDay += 31;
            case 7:
                sumDay += 31;
            case 6:
                sumDay += 30;
            case 5:
                sumDay += 31;
            case 4:
                sumDay += 30;
            case 3:
                sumDay += 31;
            case 2:
                if (year % 4 == 0 && year % 10 != 0 || year % 400 == 0) {
                    sumDay += 29;
                } else {
                    sumDay += 28;
                }
            case 1:
                sumDay += 31;
            case 0:
                break;
            default:
                System.out.println("请输入正确月份");
        }

        switch (mouth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 0 && day <= 31) {
                    System.out.println("是" + year + "的第" + (sumDay + day) + "天");
                } else {
                    System.out.println("请输入正确日期");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 0 && day <= 30) {
                    System.out.println("是" + year + "的第" + (sumDay + day) + "天");
                } else {
                    System.out.println("请输入正确日期");
                }
                break;
            case 2:
                if (year % 4 == 0 && year % 10 != 0 || year % 400 == 0) {
                    if (day > 0 && day <= 29) {
                        System.out.println("是" + year + "的" + "第" + (sumDay + day) + "天");
                    } else {
                        System.out.println("请输入正确日期");
                    }
                } else {
                    if (day > 0 && day <= 28) {
                        System.out.println("是" + year + "的第" + (sumDay + day) + "天");
                    } else {
                        System.out.println("请输入正确日期");
                    }
                }
        }

        /**
         * 判断三角形
         */
        int[] arrTriangle = new int[3];
        System.out.println("请分别输入三角形的三条边");
        for (int i = 0; i < arrTriangle.length; i++) {
            arrTriangle[i] = scanner.nextInt();
        }
        Arrays.sort(arrTriangle);
        if (arrTriangle[0] + arrTriangle[1] > arrTriangle[2]) {
            System.out.println("周长是：" + (arrTriangle[0] + arrTriangle[1] + arrTriangle[2]));
        } else {
            System.out.println("非法三角形");
        }

        /**
         * 输出图形
         *  *
         *  **
         *  ***
         *  ****
         *  *****
         */
        for (int i = 1; i <= 5; i++) {
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        /**
         * 输出图形
         * *****
         * ****
         * ***
         * **
         * *
         */
        for (int i = 5; i >= 1; i--) {
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        /**
         * 输出图形
         *  *
         *  **
         *  ***
         *  ****
         *  *****
         *  ******
         *  *****
         *  ****
         *  ***
         *  **
         *  *
         */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        /**
         *               *
         *              * *
         *             * * *
         *            * * * *
         *           * * * * *
         */
        for (int k = 1; k <= 5; k++) {
            for (int i = 1; i <= 5 - k; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");

        }
        for (int k = 4; k >= 1; k--) {
            System.out.print(" ");
            for (int i = 1; i <= 4 - k; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");

        }


    }
}
