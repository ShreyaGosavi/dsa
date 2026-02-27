public class CipherText_2075 {

    public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 0) return "";

        StringBuilder sb = new StringBuilder();

        int cols = encodedText.length() / rows;

        for(int i = 0; i < cols; i++){
            int r = 0;
            int c = i;

            while(r < rows && c < cols){
                sb.append(encodedText.charAt(r * cols + c));
                r++;
                c++;
            }
        }
        return sb.toString().stripTrailing();
    }
}
