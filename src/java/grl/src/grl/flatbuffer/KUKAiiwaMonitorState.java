// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class KUKAiiwaMonitorState extends Table {
  public static KUKAiiwaMonitorState getRootAsKUKAiiwaMonitorState(ByteBuffer _bb) { return getRootAsKUKAiiwaMonitorState(_bb, new KUKAiiwaMonitorState()); }
  public static KUKAiiwaMonitorState getRootAsKUKAiiwaMonitorState(ByteBuffer _bb, KUKAiiwaMonitorState obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public KUKAiiwaMonitorState __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public grl.flatbuffer.JointState measuredState() { return measuredState(new grl.flatbuffer.JointState()); }
  public grl.flatbuffer.JointState measuredState(grl.flatbuffer.JointState obj) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public grl.flatbuffer.Pose cartesianFlangePose() { return cartesianFlangePose(new grl.flatbuffer.Pose()); }
  public grl.flatbuffer.Pose cartesianFlangePose(grl.flatbuffer.Pose obj) { int o = __offset(6); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  public grl.flatbuffer.JointState jointStateReal() { return jointStateReal(new grl.flatbuffer.JointState()); }
  public grl.flatbuffer.JointState jointStateReal(grl.flatbuffer.JointState obj) { int o = __offset(8); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  /**
   * FRI can adjust the java commanded position. "Interpolated" is the original Java commanded position.
   */
  public grl.flatbuffer.JointState jointStateInterpolated() { return jointStateInterpolated(new grl.flatbuffer.JointState()); }
  public grl.flatbuffer.JointState jointStateInterpolated(grl.flatbuffer.JointState obj) { int o = __offset(10); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  /**
   * The state of the arm as calculated by kuka after
   * subtracting the known weights of the arm
   * and any attachments configured to be present.
   *
   * Most likely only contains torque.
   */
  public grl.flatbuffer.JointState externalState() { return externalState(new grl.flatbuffer.JointState()); }
  public grl.flatbuffer.JointState externalState(grl.flatbuffer.JointState obj) { int o = __offset(12); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public byte operationMode() { int o = __offset(14); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public grl.flatbuffer.Wrench CartesianWrench() { return CartesianWrench(new grl.flatbuffer.Wrench()); }
  public grl.flatbuffer.Wrench CartesianWrench(grl.flatbuffer.Wrench obj) { int o = __offset(16); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }

  public static void startKUKAiiwaMonitorState(FlatBufferBuilder builder) { builder.startObject(7); }
  public static void addMeasuredState(FlatBufferBuilder builder, int measuredStateOffset) { builder.addOffset(0, measuredStateOffset, 0); }
  public static void addCartesianFlangePose(FlatBufferBuilder builder, int cartesianFlangePoseOffset) { builder.addStruct(1, cartesianFlangePoseOffset, 0); }
  public static void addJointStateReal(FlatBufferBuilder builder, int jointStateRealOffset) { builder.addOffset(2, jointStateRealOffset, 0); }
  public static void addJointStateInterpolated(FlatBufferBuilder builder, int jointStateInterpolatedOffset) { builder.addOffset(3, jointStateInterpolatedOffset, 0); }
  public static void addExternalState(FlatBufferBuilder builder, int externalStateOffset) { builder.addOffset(4, externalStateOffset, 0); }
  public static void addOperationMode(FlatBufferBuilder builder, byte operationMode) { builder.addByte(5, operationMode, 0); }
  public static void addCartesianWrench(FlatBufferBuilder builder, int CartesianWrenchOffset) { builder.addStruct(6, CartesianWrenchOffset, 0); }
  public static int endKUKAiiwaMonitorState(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

