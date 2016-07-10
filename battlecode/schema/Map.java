// automatically generated, do not modify

package battlecode.schema;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * The map a round is played on.
 */
public final class Map extends Table {
  public static Map getRootAsMap(ByteBuffer _bb) { return getRootAsMap(_bb, new Map()); }
  public static Map getRootAsMap(ByteBuffer _bb, Map obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Map __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  /**
   * The name of a map.
   */
  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  /**
   * The bottom corner of the map.
   */
  public Vec minCorner() { return minCorner(new Vec()); }
  public Vec minCorner(Vec obj) { int o = __offset(6); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  /**
   * The top corner of the map.
   */
  public Vec maxCorner() { return maxCorner(new Vec()); }
  public Vec maxCorner(Vec obj) { int o = __offset(8); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  /**
   * The bodies on the map.
   */
  public SpawnedBody bodies(int j) { return bodies(new SpawnedBody(), j); }
  public SpawnedBody bodies(SpawnedBody obj, int j) { int o = __offset(10); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int bodiesLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }

  public static void startMap(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addMinCorner(FlatBufferBuilder builder, int minCornerOffset) { builder.addStruct(1, minCornerOffset, 0); }
  public static void addMaxCorner(FlatBufferBuilder builder, int maxCornerOffset) { builder.addStruct(2, maxCornerOffset, 0); }
  public static void addBodies(FlatBufferBuilder builder, int bodiesOffset) { builder.addOffset(3, bodiesOffset, 0); }
  public static int createBodiesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startBodiesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMap(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

