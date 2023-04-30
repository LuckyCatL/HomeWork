package homework;

public class test {
    public static void main(String[] args) {
        /**
         * 输出1900到2023年之间所有的闰年(每够10个年份，换一行)
         */
        int count = 0;
        for (int i = 1900;i<=2023;i++){
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                System.out.print(i+"\t");
                count++;
            }
            if(count==10){
                System.out.print("\n");
                count=0;
            }
        }
    }
}
