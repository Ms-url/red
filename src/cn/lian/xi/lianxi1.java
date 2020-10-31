package cn.lian.xi;

public class lianxi1
{
    public static void main(String[] args)
    {
        for(int i=1; i<99; i++)
        {
            if(i%10==7||i/10%10==7||i%7==0)//排除含7和能被7整除的整数
            {
                System.out.println("无");
                continue;
            }
            System.out.println(i);
        }

        //while语句
        int count = 0;
        int a=1;
        while(a<99)
        {
            count =count+1;
            a++;
        }
        System.out.println("count="+count);

        int num=4;
        for(int x=0; x<num; x++)
        {
            for(int j=0; j<num-x-1; j++)
            {
                System.out.print(' ');
            }
            System.out.println('*');
        }


    }
}
