class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int d= Integer.MAX_VALUE;
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            int sta=i+1;
            int end=nums.length-1;
            while(sta<end)
            {
                int s=nums[i]+nums[sta]+nums[end];
                if(s==target)
                return s;
                if(Math.abs(s-target)<d)
                {
                    d=Math.abs(s-target);
                    c=s;
                }
                if(target>s)
                {
                    sta++;
                }
                else
                {
                    end--;
                }
            }
        }
        return c;
    }
}