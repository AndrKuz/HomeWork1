public class Sword<T extends Metal> {

    private T material;

    public Sword(T material) {
        this.material = material;
    }

    public boolean checkEndurance() {
        if (this.material.getEndurance() > 49) {
            return true;
        }
        return false;
    }
}
