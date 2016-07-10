// automatically generated, do not modify

package battlecode.schema;

/**
 * The possible types of things that can exist.
 */
public final class BodyType {
  private BodyType() { }
  /**
   * Archons are the mobile equivalent of a HQ whose sole purpose is to hire
   * gardeners to maintain the land.
   */
  public static final byte ARCHON = 0;
  /**
   * Gardeners are caretakers of the land, planting and watering Bullet Trees
   * while also cultivating all other player robots.
   */
  public static final byte GARDENER = 1;
  /**
   * Lumberjacks are melee units equipped for felling trees.
   */
  public static final byte LUMBERJACK = 2;
  /**
   * Recruits are all-around units with a tricky shot.
   */
  public static final byte RECRUIT = 3;
  /**
   * Soldiers are all-around units with a tricky shot. But different.
   */
  public static final byte SOLDIER = 4;
  /**
   * Tanks are large, slow units with powerful bullets.
   */
  public static final byte TANK = 5;
  /**
   * Scouts are fast units that move around without obstruction.
   */
  public static final byte SCOUT = 6;
  /**
   * A bullet that moves in a perfectly straight line.
   * Note: bullet location updates are not sent; a bullet is defined to be
   * in position loc + dt * vel after dt seconds.
   * This allows us some significant space savings, since there are lots
   * of bullets, and we don't need to send position updates.
   * The event stream will say if a bullet has been destroyed.
   */
  public static final byte BULLET = 7;
  /**
   * A tree that does not belong to a team and may contain objects.
   */
  public static final byte TREE_NEUTRAL = 8;
  /**
   * A tree that belongs to a team and produces bullets.
   */
  public static final byte TREE_BULLET = 9;

  private static final String[] names = { "ARCHON", "GARDENER", "LUMBERJACK", "RECRUIT", "SOLDIER", "TANK", "SCOUT", "BULLET", "TREE_NEUTRAL", "TREE_BULLET", };

  public static String name(int e) { return names[e]; }
};
