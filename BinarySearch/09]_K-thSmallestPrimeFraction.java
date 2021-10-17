class KSmallestPrimeFraction {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        /*
           We are making a bucket of fraction limit and counting the no of fractions less than or equal to
           the bucket -:
           
           -if count > k then we reduce the size of bucket 
           -if count < k then we increase the size of bucket
           
           we basically want count = k so that ans = max value of the elements inside bucket
       */  
        
        double low = 0.0;
        double high = 1.0;
        
        int [] a = new int [2];
        
        while(low<=high)
        {
            
            double mid = low + (high-low)/2.0 ;
            
            int numerator = 0;
            int denominator = 1;
            
            // now basically counting the number of fractions inside the bucket of limit = mid
            int i=0;
            int j=arr.length-2;
            int count =0;
            
            while(i<arr.length-1 && j>=0 )
            {
                
                while(j>=0 && arr[i] > mid * arr[arr.length-1-j])
                {
                    j--;
                }
                
                count+= (j+1);
                
                if(arr.length-1-j < arr.length && numerator * arr[arr.length-1-j] < denominator * arr[i])
                {
                    numerator = arr[i];
                    denominator = arr[arr.length-j-1];
                }
                
                i++;
            }
            
            
            if(count > k)
            {
                // reduce the limit of bucket 
                high = mid;
            }
            else if(count < k)
            {
                // increase the limit of bucket
                low = mid;
            }
            
            else{
                
                a[0] = numerator;
                a[1] = denominator;
                break;
                
            }
            
        }
        return a;
        
    }    
}
