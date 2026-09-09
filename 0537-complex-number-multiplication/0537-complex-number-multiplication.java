class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        num1 =  num1.replace("i","");
        num2 = num2.replace("i","");
        String st[] = num1.split("\\+");
        String sp[] = num2.split("\\+");
        int real1 = Integer.parseInt(st[0])*Integer.parseInt(sp[0]);
        int real2 = Integer.parseInt(st[1])*Integer.parseInt(sp[1]);
        int real = real1-real2;
        int img1 = Integer.parseInt(sp[0])*Integer.parseInt(st[1]);
        int img2 = Integer.parseInt(st[0])*Integer.parseInt(sp[1]);
        int img = img1+img2;
        return real+"+"+img+"i";
    }
}

//(a+bi)(c+id) = (ac-bd)+i(bc+ad)