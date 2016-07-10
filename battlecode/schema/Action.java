// automatically generated, do not modify

package battlecode.schema;

/**
 * Actions that can be performed.
 * Purely aesthetic; have no actual effect on simulation.
 * Actions may have 'targets', which are the units on which
 * the actions were performed.
 */
public final class Action {
  private Action() { }
  /**
   * Fire a bullet.
   * Target: spawned bullet.
   */
  public static final byte FIRE = 0;
  /**
   * Fire three bullets.
   * Target: spawned bullets.
   */
  public static final byte FIRE_TRIAD = 1;
  /**
   * Fire five bullets.
   * Target: spawned bullets.
   */
  public static final byte FIRE_PENTAD = 2;
  /**
   * Perform a lumberjack-chop.
   * Target: none
   */
  public static final byte CHOP = 3;
  /**
   * Shake a tree.
   * Target: tree
   */
  public static final byte SHAKE_TREE = 4;
  /**
   * Plant a tree.
   * Target: tree
   */
  public static final byte PLANT_TREE = 5;
  /**
   * Water a tree.
   * Target: tree
   */
  public static final byte WATER_TREE = 6;
  /**
   * Build a unit.
   * Target: spawned unit
   */
  public static final byte SPAWN_UNIT = 7;
  /**
   * Die due to an uncaught exception
   * Target: none
   */
  public static final byte DIE_EXCEPTION = 8;
  /**
   * Die due to suicide.
   * Target: none
   */
  public static final byte DIE_SUICIDE = 9;

  private static final String[] names = { "FIRE", "FIRE_TRIAD", "FIRE_PENTAD", "CHOP", "SHAKE_TREE", "PLANT_TREE", "WATER_TREE", "SPAWN_UNIT", "DIE_EXCEPTION", "DIE_SUICIDE", };

  public static String name(int e) { return names[e]; }
};
