package cn.itcast.demo;

import java.util.Arrays;
import java.util.Comparator;

public class level3 {
    public static void main(String[] args) {
        int [] [] su1={{24,8},{35,9},{15,10},{17,8},{20,7},{49,14},{50,16},{98,16}};
        int [] [] su2={{3,8},{5,9},{2,17},{45,8},{13,7},{99,14},{175,16},{151,9999}};

        //合并数组  System.arraycopy
        int[][] su3 = new int[su1.length + su2.length][2];
        System.arraycopy(su1, 0, su3, 0, su1.length);
        System.arraycopy(su2, 0, su3, su1.length, su2.length);

        //按列排序
        Arrays.sort(su3, new Comparator<int[]>() {
            @Override
            public int compare(int[] t0, int[] t1) {
                if(t0[0] == t1[0]){
                    return 0;
                }
                return t0[0] - t1[0];
            }
        });
        System.out.println(' ');
        showArray(su3);
    }

    private static void showArray(int[][] su3) {
        for(int[] row:su3){
            System.out.println(Arrays.toString(row));
        }
    }


    //定义合并数组的方法
    static String[] concat(String[] a, String[] b) {

        String[] c= new String[a.length+b.length];

        System.arraycopy(a, 0, c, 0, a.length);

        System.arraycopy(b, 0, c, a.length, b.length);

        return c;

    }
    //合并数组并排序 顺序
    public  static  int[]  getNewArray(int arr1[],int arr2[]){
        int[] newArray=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            newArray[i]=arr1[i];

        }for(int j=0;j<arr2.length;j++){
            newArray[arr1.length+j]=arr2[j];
        }
        //对新数组 进行排序
        Arrays.sort(newArray);// Arrays.sort类 对数组进行排序
        return newArray;
    }

}
