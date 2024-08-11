class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
      int i=0;
      int j=people.length - 1;
      int count = 0;

      while(i <= j) {
        count++;
        //agar dono ka sum limit ko satisfy kar raha hai to i aur j 
        //dono push honge
        if(people[i] + people[j] <= limit) {
            i++;
        }

        //nahi to j to jyega hi
        j--;
      }  
      return count;
    }
}
