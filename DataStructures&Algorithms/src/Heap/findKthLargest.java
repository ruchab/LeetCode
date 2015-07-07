package Heap;

/**
 * Created by Rucha on 7/5/15.
 */
public class findKthLargest {

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        heapSort(nums,n);
        return nums[n-k];
    }

    public void heapSort(int[] nums,int n){
        //create first heap
        for(int i = n/2-1;i>=0;i--){
            reheap(nums,i,n-1);
        }
        swap(nums,0,n-1);
        for(int lastIndex = n-2;lastIndex>0;lastIndex--){
            reheap(nums,0,lastIndex);
            swap(nums,0,lastIndex);
        }
    }

    public void swap(int[] nums,int left,int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void reheap(int[] heap,int rootIndex,int lastIndex){
        int orphan = heap[rootIndex];
        int leftIndex = rootIndex*2 + 1;
        boolean done = false;
        while(!done && leftIndex <=lastIndex){
            int largerIndex = leftIndex;//assume leftIndex in larger
            int rightIndex = leftIndex+1;
            if(rightIndex<=lastIndex && heap[rightIndex] > heap[largerIndex]){
                largerIndex = rightIndex;
            }
            if(orphan < heap[largerIndex]){
                heap[rootIndex] = heap[largerIndex];
                rootIndex = largerIndex;
                leftIndex = 2*rootIndex + 1;
            }else{
                done = true;
            }
        }
        heap[rootIndex] = orphan;
    }
}
