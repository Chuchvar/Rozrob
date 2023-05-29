public class Three {
    public static void main(String[] args) {
        int randn,sum=0;
        randn=(int)(Math.random()*101);
        if (randn/100>=1){
            sum++;
        }
        if (randn/10>=1){
            sum++;
        }
        if (randn>=1){
            sum++;
        }
        System.out.println(randn+" "+sum);
    }
}
