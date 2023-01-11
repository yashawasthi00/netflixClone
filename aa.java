class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        boolean check=false;
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(num*2==arr[j])
                {
                    check=true;
                    break;
                }
                if(num*2>arr[j])
                {
                    break;
                }
            }
            if(check==true)
            {
                break;
            }
        }
        return check;
    }
}
