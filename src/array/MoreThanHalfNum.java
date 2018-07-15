package array;

import java.util.Arrays;

/**
 * @author lijianliang
 * @date 2018/7/15.
 */
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution1(int [] array) {
        Arrays.sort(array);
        int index = array.length / 2;
        int count = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == array[index]) {
                count++;
            }
        }
        return count > index ? array[index] : 0;
    }

    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null|| array.length<=0){
            return 0;
        }
        int length=array.length;

        if(length==1){
            return array[0];
        }

        int[] tempArray=new int[length];
        for(int i=0;i<length;i++){
            tempArray[i]=array[i];
        }

        for(int i=0;i<length;i++){
            //后面需要用零来代表抹除数字，所以对0时做特殊处理
            if(tempArray[i]==0){
                continue;
            }

            for(int j=i+1;j<length;j++){
                if(tempArray[i]!=tempArray[j]&&tempArray[j]!=0){
                    tempArray[i]=0;//此处用0代表抹去该数字
                    tempArray[j]=0;
                    break;
                }

            }
        }

        for(int i=0;i<length;i++){
            System.out.println(tempArray[i]);
        }

        //找出未被抹去的数字
        int result=0;
        for(int i=0;i<length;i++){
            if(tempArray[i]!=0){
                result=tempArray[i];
                break;
            }
        }

        int times=0;
        for(int i=0;i<length;i++){
            if(result==array[i]){

                times++;
            }
        }

        if(times*2<length){
            result=0;
        }
        return result;
    }

}
