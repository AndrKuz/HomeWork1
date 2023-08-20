public class Test {
    public static void main(String[] args) {
//        не могу создать меч из пластика
//        Plastic plastic = new Plastic();
//        Sword sword = new Sword(plastic);

        Steel steel = new Steel();
        Sword sword = new Sword(steel);
        System.out.println(sword.checkEndurance());
    }
}