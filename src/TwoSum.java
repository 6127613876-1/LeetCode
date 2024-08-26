import java.util.HashMap;

public class TwoSum
{
    public int[] two(int[] nums, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int c = target-nums[i];
            if(map.containsKey(c))
            {
                return new int[]{map.get(c),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int t = 9;
        TwoSum ta = new TwoSum();
        int[] aa =ta.two(nums,t);
        System.out.println(aa[0]+""+aa[1]) ;
    }
}
