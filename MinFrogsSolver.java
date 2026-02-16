class MinFrogsSolver{
    public static void main(String [] args){
    	MinFrogsSolver mn = new MinFrogsSolver();
        String str1 = "croakcroak";
        String str2 = "crcoakroak";
        String str3 = "croakcrook";
        String str4 = "croakcroa";
        System.out.println(mn.minNumberOfFrogs(str1));
        System.out.println(mn.minNumberOfFrogs(str2));
        System.out.println(mn.minNumberOfFrogs(str3));
        System.out.println(mn.minNumberOfFrogs(str4));

    }
    
    public int minNumberOfFrogs(String croakOfFrogs) {
        int c = 0, r = 0, o = 0, a = 0;
        int active = 0;
        int maxFrogs = 0;

        for (char ch : croakOfFrogs.toCharArray()) {
            if (ch == 'c') {
                c++;
                active++;
                maxFrogs = Math.max(maxFrogs, active);
            } 
            else if (ch == 'r') {
                if (c == 0) return -1;
                c--;
                r++;
            } 
            else if (ch == 'o') {
                if (r == 0) return -1;
                r--;
                o++;
            } 
            else if (ch == 'a') {
                if (o == 0) return -1;
                o--;
                a++;
            } 
            else if (ch == 'k') {
                if (a == 0) return -1;
                a--;
                active--;
            }
        }

        if (c != 0 || r != 0 || o != 0 || a != 0)
            return -1;

        return maxFrogs;
    }
}
