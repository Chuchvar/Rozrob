public class Second {
    public static void main(String[] args) {
        double cat1, cat2,per,gip,plo;;
        cat1=3;
        cat2=4;
        gip=Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
        plo=(cat1*cat2)*0.5;
        per=cat1+cat2+gip;
        System.out.println("Площа:"+plo);
        System.out.println("Периметр:"+per);
        System.out.println("Гіпотенуза:"+gip);
    }
}
