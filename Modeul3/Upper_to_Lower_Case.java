public class Upper_to_Lower_Case {
    public static void main(String[] args) {
        upperToLower("HeLLoSETKayCHale");
    }

    public static void upperToLower(String st){
         char[]s=st.toCharArray();


         for(int i=0;i<s.length;i++){
            char ch=s[i];

            if(ch>='A'&& ch<='Z'){
                char ansch=(char)(ch-'A'+'a');
                s[i]=ansch;
            }

         }


         for (char c : s) {
            System.out.print(c);
         }
         
    }
}
