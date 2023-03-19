

    
        public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = smallest;

    for (int i = 1; i < s.length() - k + 1; i++){
        if (smallest.compareTo(s.substring(i, i +k)) > 0){
            smallest = s.substring(i, i + k);
        }
        else if (largest.compareTo(s.substring(i, i + k)) < 0){
            largest = s.substring(i, i + k);
        }
    }

    

        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

