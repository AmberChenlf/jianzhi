/**
 * 数组长度为n
 * 数值为0-n-1;如果有超出，则返回-1；
 * 返回相同的数
 *
 * 例子：【1,2,1,4,5,7,6,3】，则返回1
 */

public class findSameNumber {
    public int find(int[] array){
        int len = array.length;
        for(int i:array){
           if(i<0||i>=len)return -1;
        }
        for(int j=0;j<len;j++){
            while(array[j]!=j && array[array[j]]!=array[j]){
                int k = array[j];
                array[j]=array[array[j]];
                array[k] = k;
            }
            if(array[j]!=j && array[array[j]]==array[j]){
                return array[j];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array={2,1,4,3,-5,4};
        findSameNumber fn = new findSameNumber();
        int num = fn.find(array);
        System.out.println(num);
    }
}
