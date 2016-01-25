
package files;
public class CodirovkaRazcodirovkaCezarya {
    char[] Letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] upLetter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    char[] symvol = {'.', ' ', ',', ';', ':', '!', '?', '-','[',']','{','}','=','\'',};

    public String codCezarya(String Text ) {
        int k=3 ;
        StringBuilder outText = new StringBuilder();

        for (int i = 0; i < Text.length(); i++) {
            char inTextLetter = Text.charAt(i);
            for (int j = 0; j < Letter.length; j++) {
                if (inTextLetter == Letter[j]) {
                    int index = (j + k) % 26;
                    outText.append(Letter[index]);
                    break;
                }
            }
            for (int l = 0; l < upLetter.length; l++) {
                if (inTextLetter == upLetter[l]) {
                    int index1 = (l + k) % 26;
                    outText.append(upLetter[index1]);

                    break;
                }
            }
            for (int m = 0; m < numbers.length; m++) {
                if (inTextLetter == numbers[m]) {
                    int index1 = (m + k) % 10;
                    outText.append(numbers[index1]);

                    break;
                }
            }

            for (int b = 0; b < symvol.length; b++) {
                if (inTextLetter == symvol[b]) {
                    int index = b;
                    outText.append(symvol[index]);
                }
            }


        }
        return outText.toString();
    }
    public String razcodCezarya(String Text){
        int k=3 ;
        StringBuilder outText = new StringBuilder();


        for (int i = 0; i < Text.length(); i++) {
            char inTextLetter = Text.charAt(i);
            for (int j = 0; j < Letter.length; j++) {
                if (inTextLetter == Letter[j]) {
                    int index1= (j - k+26) % 26;
                    outText.append(Letter[index1]);
                    break;
                }
            }
            for (int l = 0; l < upLetter.length; l++) {
                if (inTextLetter == upLetter[l]) {
                    int index1 = (l - k+26)% 26 ;
                    outText.append(upLetter[index1]);

                    break;
                }
            }
            for (int m = 0; m < numbers.length; m++) {
                if (inTextLetter == numbers[m]) {
                    int index1 = (m - k+10) % 10;
                    outText.append(numbers[index1]);

                    break;
                }
            }

            for (int b = 0; b < symvol.length; b++) {
                if (inTextLetter == symvol[b]) {
                    int index = b;
                    outText.append(symvol[index]);
                }
            }


        }
        return outText.toString();




    }



}