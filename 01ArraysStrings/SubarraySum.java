package com.buddhadeb.arraysstrings;

import java.util.HashMap;

public class SubarraySum {
   public static void demo() {
      int[] nums = { 9, 4, 0, 20, 3, 10, 5 };
      int k = 13;
      // int result = bruteForce(nums, k);
      // System.out.println("Number of subarrays summing to " + k + ": " + result);
      System.out.println(subarraySum(nums, k));
   }

   // brute force approach
   // static int bruteForce(int[] nums, int k) {
   // int n = nums.length;
   // int count = 0;

   // for (int i = 0; i < n; i++) {
   // int sum = 0;
   // for (int j = i; j < n; j++) {
   // sum += nums[j];
   // if (sum == k) {
   // count++;
   // }
   // }
   // }

   // return count;
   // }

   // prefix sum
   // subarraysum[i,j] = ps[j] - ps[i-1]
   // ps[i-1] = ps[j] - subarraysum[i,j]
   // my condition is k need to match with the subarray sum so we can se
   // k = ps[j] - ps[i-1]
   // ps[i-1] = ps[j] - k

   /*
    * shudo code
    * first we create a array name of prefix sum
    * nums = {9,4,20,3,10,5}
    * prefix sum array that will be n number of elesment
    * [9,13,32,36,46,51] sum of n number of elm
    * starting point of loop -> ps[0] = nums[0]
    * then spinn a loop of i=1 to length of nums
    * ps[i] = ps[i-1]+ nums[i]
    * 
    * now we have our prefix sum array now we need the formula that is:
    * ps[i-1] = ps[j] - k
    * 
    * first we set the j in the nums[0] and then we check the left boundarys of i
    * whwre
    * it will stay
    */

   // CASE 1

   /*
    * EXAMPLE :
    * [9,4,20,3,10,5] and k = 33
    * this is prefix sum array that allredy calculated [9,13,32,36,46,51]
    * for example j is pointing to 10 index 4
    * ps[i-1] = ps[j]-k
    * here ps[i-1] =43-33 = 13
    * 
    * now we need to find i<j and how many time comming 13 left boundary of ps[j]
    * now we see i have 13 one time in the 1 index of the ps[1] this mean
    * i-1 = 1 ; i =2
    */

   // CASE 2
   /*
    * if ps[j] == k increase the count ++
    * if the given nums like this [9,4,0,20,3,10,5] and k = 33
    * the subarray sum will be [9,13,13,32,36,46,51]
    * 
    * in this case the i-1 may be nums[1] or nums[2] because i get 2 times when j
    * is pointing to index 4
    * 
    * for this tracking how many time this subarray sum prefix comming thats why
    * need to use map -> prefix sum and the freq will be store like for 13 store 2s
    */

   // STEPS : summary of the code
   /*
    * spinn a loop i=0 to n
    * ps[j] == k -> count ++
    * if not then the value that you get ps[i-1] = ps[j] - k
    * need to find the value ps[i-1] in the hash table
    * if the first time in the hash table then start with 1 otherwise ++
    * if this value exist then update my final answer
    * if not then just eat five star and do nothing
    */

   static int subarraySum(int[] nums, int k) {
      int n = nums.length;
      int count = 0;
      int[] prefixSum = new int[n];
      HashMap<Integer, Integer> map = new HashMap<>();
      map.put(0, 1); // Initialize for subarrays starting at index 0

      prefixSum[0] = nums[0];
      for (int i = 1; i < n; i++) {
         prefixSum[i] = prefixSum[i - 1] + nums[i];
      }

      for (int j = 0; j < n; j++) {
         int target = prefixSum[j] - k;
         if (map.containsKey(target)) {
            count += map.get(target);
         }
         map.put(prefixSum[j], map.getOrDefault(prefixSum[j], 0) + 1);
      }

      return count;
   }

}
