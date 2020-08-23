import java.util.Arrays;

public class BubbleSort {

	/**
	 * 冒泡排序
	 * @param sourceArray
	 * @param sortType 0 升序，其他降序
	 * @return 排序后的数组
	 */
	public static int[]sort(int[]sourceArray,int sortType){
		//一个长度为length的数组，需要排序length-1次
		for(int i=0;i<sourceArray.length-1;i++) {
			//每次从开头开始对比，但结尾的序号最开始是length-1，后面递减
			for(int pointer=0,tail=sourceArray.length-i;pointer<tail;pointer++) {
				int nextPointer = pointer+1;
				if(nextPointer==tail) {
//					System.out.println("break;"+pointer);
					break;
				}
				
			 boolean changeWhen=sortType==0?(sourceArray[pointer]>sourceArray[nextPointer]?true:false):(sourceArray[pointer]>sourceArray[nextPointer]?false:true);
			 
				if(changeWhen) {
					//交换
					sourceArray[pointer]=sourceArray[pointer]+sourceArray[nextPointer];
					sourceArray[nextPointer]=sourceArray[pointer]-sourceArray[nextPointer];
					sourceArray[pointer]=sourceArray[pointer]-sourceArray[nextPointer];
				}
			}
		}
		return sourceArray;
	}
			
	
	
	public static void main(String[] args) {
		int []array = new int[] {100,2,99,89,123,100000,1,0,-1,-9,-2};	
		System.out.println(Arrays.toString(sort(array,-1)));
		
	}
	
	
	
}
