// automatically generated, do not modify

package battlecode.schema;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * Sent to end a match.
 */
public final class MatchFooter extends Table {
  public static MatchFooter getRootAsMatchFooter(ByteBuffer _bb) { return getRootAsMatchFooter(_bb, new MatchFooter()); }
  public static MatchFooter getRootAsMatchFooter(ByteBuffer _bb, MatchFooter obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public MatchFooter __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public byte winner() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public int totalRounds() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createMatchFooter(FlatBufferBuilder builder,
      byte winner,
      int totalRounds) {
    builder.startObject(2);
    MatchFooter.addTotalRounds(builder, totalRounds);
    MatchFooter.addWinner(builder, winner);
    return MatchFooter.endMatchFooter(builder);
  }

  public static void startMatchFooter(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addWinner(FlatBufferBuilder builder, byte winner) { builder.addByte(0, winner, 0); }
  public static void addTotalRounds(FlatBufferBuilder builder, int totalRounds) { builder.addInt(1, totalRounds, 0); }
  public static int endMatchFooter(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

