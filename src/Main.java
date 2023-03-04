public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(20,generateRandomAge()));
        System.out.println(ageAndTemperature(15,generateRandomAge()));
        System.out.println(ageAndTemperature(10,generateRandomAge()));
        System.out.println(ageAndTemperature(28,generateRandomAge()));
        System.out.println(ageAndTemperature(35,generateRandomAge()));
    }
    public static String ageAndTemperature(int temperature, int age){
        if(age>20&&age<45&&temperature>-20&&temperature<30||age<20&&temperature>0&&temperature<28||age>45&&temperature>-10&&temperature<25){
            return "Можно идти гулять!";
        }else{
            return "Оставайтесь дома!";
        }
    }
    public static int generateRandomAge(){
        int rand = (int) (Math.random()*(45+1));
        return rand;
    }
}
