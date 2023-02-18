public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(500,20);
        boss.setDamage(20);
        boss.setHealth(500);
        boss.weapon.setTypeOfWeapon(WeaponType.Kalashnikov);
        boss.weapon.setNameOfWeapon("Hatsan 125");
        System.out.println(boss.info());
        Sceleton sceleton = new Sceleton(250,50,10);
        sceleton.weapon.setNameOfWeapon("AUG");
        sceleton.weapon.setTypeOfWeapon(WeaponType.AUG);
        System.out.println(sceleton.info());
        Sceleton sceleton1 = new Sceleton(300,35,15);
        sceleton1.weapon.setNameOfWeapon("AWP");
        sceleton1.weapon.setTypeOfWeapon(WeaponType.AWP);
        System.out.println(sceleton1.info());
    }
}