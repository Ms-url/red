package cn.lian.xi;

import java.util.Arrays;

public class lianxi4 {
    public static void main(String[] args) {

        int[][] i = {{24, 8}, {35, 9}, {15, 10}, {17, 8}, {20, 7}, {49, 14}, {50, 16}, {98, 16}};
        int[][] h = {{3, 8}, {5, 9}, {2, 17}, {45, 8}, {13, 7}, {99, 14}, {175, 16}, {151, 9999}};

        //合并数组
        int[][] ii = new int[i.length + h.length][2];
        System.arraycopy(i, 0, ii, 0, i.length);
        System.arraycopy(h, 0, ii, i.length, h.length);

        Arrays.sort(ii, ((o1, o2) -> o1[0] - o2[0]));
        for (int a = 0; a < ii.length; a++) { //遍历二维数组，遍历出来的每一个元素是一个一维数组
            // for(int j = 0; j < ii[a].length; j++){ //遍历对应位置上的一维数组
            System.out.print(ii[a][0] + ",");
            System.out.println(ii[a][1]);
            // }
        }
        System.out.println("---------------------------------");
        int[][] f = {{24, 8}, {35, 9}, {15, 10}, {17, 8}, {20, 7}, {49, 14}, {50, 16}, {98, 16}};
        for (int ji = 0; ji < f.length; ji++) {
            for (int k = 0; k < f.length; k++) {
                if (f[ji][0] < f[k][0]) {
                    int a = f[ji][0];
                    f[ji][0] = f[k][0];
                    f[k][0] = a;
                }
            }
        }
        for (int m = 0; m < f.length; m++) {
            System.out.println(f[m][0] + "," + f[m][1]);
        }



      /*  int[] g = {24, 8, 35, 9, 15, 10, 17, 8, 20, 7, 49, 14, 50, 16, 98, 16};
        int[] k = {248, 359, 15, 10, 178, 207, 4914, 5016, 9816};
        int[] u = new int[g.length + h.length];
        System.arraycopy(g, 0, u, 0, g.length);
      //  System.arraycopy(k, 0, u,k.length,0);


        //打印二维数组
        System.out.println(Arrays.deepToString(ii));
        //打印一维数组
        System.out.println(Arrays.toString(g));
        //拷贝数组
        int[] f = Arrays.copyOf(g, g.length);

        System.out.println(Arrays.toString(u));
*/

    }
}
