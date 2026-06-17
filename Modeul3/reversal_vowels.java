public class reversal_vowels {
    public static void main(String[] args) {
        reversalVowels("youcandoit");
    }

    public static void reversalVowels(String st){
        
        int i=0;
        int j=st.length()-1;

        char[] s=st.toCharArray();

        while (i<j) {
            while (s[i]!='a'&&s[i]!='i'&&s[i]!='u'&&s[i]!='o'&&s[i]!='e') {
                i++;
            }
            while (s[j]!='a'&&s[j]!='i'&&s[j]!='u'&&s[j]!='o'&&s[j]!='e') {
                j--;
            }

            char ch=s[i];
            s[i]=s[j];
            s[j]=ch;

            while (i<=j) {
                break;
            }

            i++;
            j--;
        }

        for (char c : s) {
            System.out.print(c);
        }



    }
}
