class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int index1 = 0;
        int index2 = 0;
        int[] nums3 = new int[total];
    
        for(int i=0; i<total; i++){
            if(index1 < nums1.length && index2 < nums2.length){
                if(nums1[index1]<nums2[index2]){
                    nums3[i] = nums1[index1];
                    index1++;
                } else{
                    nums3[i] = nums2[index2];
                    index2++;
                   } 
            }
            else if(index1 < nums1.length){
                nums3[i] = nums1[index1];
                index1++;
            } else{
                nums3[i] = nums2[index2];
                index2++;
            }
        }
        
        if(total%2==0){
            return (nums3[(total/2) -1 ] + nums3[total/2])/2d;
        }
        return  nums3[total/2];
    }    
}
