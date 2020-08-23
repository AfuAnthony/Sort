import java.util.Arrays;

public class BubbleSort {

	/**
	 * ð������
	 * @param sourceArray
	 * @param sortType 0 ������������
	 * @return ����������
	 */
	public static int[]sort(int[]sourceArray,int sortType){
		//һ������Ϊlength�����飬��Ҫ����length-1��
		for(int i=0;i<sourceArray.length-1;i++) {
			//ÿ�δӿ�ͷ��ʼ�Աȣ�����β������ʼ��length-1������ݼ�
			for(int pointer=0,tail=sourceArray.length-i;pointer<tail;pointer++) {
				int nextPointer = pointer+1;
				if(nextPointer==tail) {
//					System.out.println("break;"+pointer);
					break;
				}
				
			 boolean changeWhen=sortType==0?(sourceArray[pointer]>sourceArray[nextPointer]?true:false):(sourceArray[pointer]>sourceArray[nextPointer]?false:true);
			 
				if(changeWhen) {
					//����
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
