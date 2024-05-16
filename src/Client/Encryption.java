package Client;

class Encryption
{

    public String Encrypt(String msg)
    {
        String str,Newstr="";
        str = msg;
        try {

            for (int i=0;i<str.length();i++)
            {
                char ch = str.charAt(i);
                Newstr = switch (ch) {
                    case 'A'-> Newstr +"D";
                    case 'B'-> Newstr +"E";
                    case 'C'-> Newstr +"F";
                    case 'D'-> Newstr +"G";
                    case 'E'-> Newstr +"H";
                    case 'F'-> Newstr +"I";
                    case 'G'-> Newstr +"J";
                    case 'H'-> Newstr +"K";
                    case 'I'-> Newstr +"L";
                    case 'J'-> Newstr +"M";
                    case 'K'-> Newstr +"N";
                    case 'L'-> Newstr +"O";
                    case 'M'-> Newstr +"P";
                    case 'N'-> Newstr +"Q";
                    case 'O'-> Newstr +"R";
                    case 'P'-> Newstr +"S";
                    case 'Q'-> Newstr +"T";
                    case 'R'-> Newstr +"U";
                    case 'S'-> Newstr +"W";
                    case 'T'-> Newstr +"X";
                    case 'U'-> Newstr +"Y";
                    case 'W'-> Newstr +"Z";
                    case 'X'-> Newstr +"A";
                    case 'Y'-> Newstr +"B";
                    case 'Z'-> Newstr +"C";
                    case 'a' -> Newstr + "{";
                    case 'b' -> Newstr + "}";
                    case 'c' -> Newstr + "#";
                    case 'd' -> Newstr + "~";
                    case 'e' -> Newstr + "+";
                    case 'f' -> Newstr + "-";
                    case 'g' -> Newstr + "*";
                    case 'h' -> Newstr + "@";
                    case 'i' -> Newstr + "/";
                    case 'j' -> Newstr + "\\";
                    case 'k' -> Newstr + "?";
                    case 'l' -> Newstr + "$";
                    case 'm' -> Newstr + "!";
                    case 'n' -> Newstr + "^";
                    case 'o' -> Newstr + "(";
                    case 'p' -> Newstr + ")";
                    case 'q' -> Newstr + "<";
                    case 'r' -> Newstr + ">";
                    case 's' -> Newstr + "=";
                    case 't' -> Newstr + ";";
                    case 'u' -> Newstr + ",";
                    case 'v' -> Newstr + "_";
                    case 'w' -> Newstr + "[";
                    case 'x' -> Newstr + "]";
                    case 'y' -> Newstr + ":";
                    case 'z' -> Newstr + "\"";
                    case ' ' -> Newstr + " ";
                    case '.' -> Newstr + '3';
                    case ',' -> Newstr + "1";
                    case ':' -> Newstr + "a";
                    case ';' -> Newstr + "c";
                    case '(' -> Newstr + '4';
                    case '\"' -> Newstr + '5';
                    case ')' -> Newstr + "7";
                    case '?' -> Newstr + "2";
                    case '!' -> Newstr + "8";
                    case '-' -> Newstr + "6";
                    case '%' -> Newstr + "9";
                    case '1' -> Newstr + "r";
                    case '2' -> Newstr + "k";
                    case '3' -> Newstr + "b";
                    case '4' -> Newstr + "e";
                    case '5' -> Newstr + "q";
                    case '6' -> Newstr + "h";
                    case '7' -> Newstr + "u";
                    case '8' -> Newstr + "y";
                    case '9' -> Newstr + "w";
                    case '0' -> Newstr + "z";
                    default -> Newstr + ch;
                };
            }
        }
        catch(Exception ioe)
        {
            ioe.printStackTrace();
        }
        return Newstr;
    }

    public String Decrypt(String msg)
    {
        String str,Newstr="";
        str = msg;
        try {

            for (int i=0;i<str.length();i++)
            {
                char ch = str.charAt(i);
                Newstr = switch (ch) {
                    case 'A'-> Newstr +"X";
                    case 'B'-> Newstr +"Y";
                    case 'C'-> Newstr +"Z";
                    case 'D'-> Newstr +"A";
                    case 'E'-> Newstr +"B";
                    case 'F'-> Newstr +"C";
                    case 'G'-> Newstr +"D";
                    case 'H'-> Newstr +"E";
                    case 'I'-> Newstr +"F";
                    case 'J'-> Newstr +"G";
                    case 'K'-> Newstr +"H";
                    case 'L'-> Newstr +"I";
                    case 'M'-> Newstr +"J";
                    case 'N'-> Newstr +"K";
                    case 'O'-> Newstr +"L";
                    case 'P'-> Newstr +"M";
                    case 'Q'-> Newstr +"N";
                    case 'R'-> Newstr +"O";
                    case 'S'-> Newstr +"P";
                    case 'T'-> Newstr +"Q";
                    case 'U'-> Newstr +"R";
                    case 'W'-> Newstr +"S";
                    case 'X'-> Newstr +"T";
                    case 'Y'-> Newstr +"U";
                    case 'Z'-> Newstr +"W";
                    case '{' -> Newstr + "a";
                    case '}' -> Newstr + "b";
                    case '#' -> Newstr + "c";
                    case '~' -> Newstr + "d";
                    case '+' -> Newstr + "e";
                    case '-' -> Newstr + "f";
                    case '*' -> Newstr + "g";
                    case '@' -> Newstr + "h";
                    case '/' -> Newstr + "i";
                    case '\\' -> Newstr + "j";
                    case '?' -> Newstr + "k";
                    case '$' -> Newstr + "l";
                    case '!' -> Newstr + "m";
                    case '^' -> Newstr + "n";
                    case '(' -> Newstr + "o";
                    case ')' -> Newstr + "p";
                    case '<' -> Newstr + "q";
                    case '>' -> Newstr + "r";
                    case '=' -> Newstr + "s";
                    case ';' -> Newstr + "t";
                    case ',' -> Newstr + "u";
                    case '_' -> Newstr + "v";
                    case '[' -> Newstr + "w";
                    case ']' -> Newstr + "x";
                    case ':' -> Newstr + "y";
                    case '\"' -> Newstr + "z";
                    case ' ' -> Newstr + " ";
                    case '3' -> Newstr + '.';
                    case '1' -> Newstr + ",";
                    case '4' -> Newstr + '(';
                    case '5' -> Newstr + '\"';
                    case '7' -> Newstr + ")";
                    case '2' -> Newstr + "?";
                    case '8' -> Newstr + "!";
                    case '6' -> Newstr + "-";
                    case '9' -> Newstr + "%";
                    case 'r' -> Newstr + "1";
                    case 'k' -> Newstr + "2";
                    case 'b' -> Newstr + "3";
                    case 'e' -> Newstr + "4";
                    case 'q' -> Newstr + "5";
                    case 'h' -> Newstr + "6";
                    case 'u' -> Newstr + "7";
                    case 'y' -> Newstr + "8";
                    case 'w' -> Newstr + "9";
                    case 'z' -> Newstr + "0";
                    case 'a' -> Newstr + ":";
                    case 'c' -> Newstr + ";";
                    default -> Newstr + ch;
                };
            }
        }
        catch(Exception ioe)
        {
            ioe.printStackTrace();
        }
        return Newstr;
    }
}  