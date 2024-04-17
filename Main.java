public class Main {
    public static void main(String[] args) {

        int[] arr = {2,2,1,1,3,3,8};

        Main o = new Main();

        System.out.println(o.singleNumber(arr));


    }
    public int singleNumber(int[] nums) {
        int s = nums[0];
        for(int i=1; i<nums.length; i++){
            s = s ^ nums[i];
            }
        return s;
        }
    }

//        public int singleNumber(int[] nums) {
//            int[] c = new int[10];
//
//            for (int i = 0; i < nums.length; i++) {
//                c[nums[i]]++;
//            }
//
//            for(int k=0; k<c.length; k++){
//                if(c[k]==1){
//                    return k;
//                }
//            }
//
//            return 0;
//
//        }


