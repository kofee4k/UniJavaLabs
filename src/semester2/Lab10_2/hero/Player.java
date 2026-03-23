package semester2.Lab10_2.hero;

public interface Player extends Healthy{

    String getUsername();

    int damage(int incomingDamage);

    boolean fight(Player target, int distance);
}
