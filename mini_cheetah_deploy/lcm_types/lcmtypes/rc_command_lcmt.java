/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package lcmtypes;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class rc_command_lcmt implements lcm.lcm.LCMEncodable
{
    public short mode;
    public float left_stick[];
    public float right_stick[];
    public float knobs[];
    public short left_upper_switch;
    public short left_lower_left_switch;
    public short left_lower_right_switch;
    public short right_upper_switch;
    public short right_lower_left_switch;
    public short right_lower_right_switch;
 
    public rc_command_lcmt()
    {
        left_stick = new float[2];
        right_stick = new float[2];
        knobs = new float[2];
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xc7726b02ec3e7de2L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(lcmtypes.rc_command_lcmt.class))
            return 0L;
 
        classes.add(lcmtypes.rc_command_lcmt.class);
        long hash = LCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeShort(this.mode); 
 
        for (int a = 0; a < 2; a++) {
            outs.writeFloat(this.left_stick[a]); 
        }
 
        for (int a = 0; a < 2; a++) {
            outs.writeFloat(this.right_stick[a]); 
        }
 
        for (int a = 0; a < 2; a++) {
            outs.writeFloat(this.knobs[a]); 
        }
 
        outs.writeShort(this.left_upper_switch); 
 
        outs.writeShort(this.left_lower_left_switch); 
 
        outs.writeShort(this.left_lower_right_switch); 
 
        outs.writeShort(this.right_upper_switch); 
 
        outs.writeShort(this.right_lower_left_switch); 
 
        outs.writeShort(this.right_lower_right_switch); 
 
    }
 
    public rc_command_lcmt(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public rc_command_lcmt(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static lcmtypes.rc_command_lcmt _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        lcmtypes.rc_command_lcmt o = new lcmtypes.rc_command_lcmt();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.mode = ins.readShort();
 
        this.left_stick = new float[(int) 2];
        for (int a = 0; a < 2; a++) {
            this.left_stick[a] = ins.readFloat();
        }
 
        this.right_stick = new float[(int) 2];
        for (int a = 0; a < 2; a++) {
            this.right_stick[a] = ins.readFloat();
        }
 
        this.knobs = new float[(int) 2];
        for (int a = 0; a < 2; a++) {
            this.knobs[a] = ins.readFloat();
        }
 
        this.left_upper_switch = ins.readShort();
 
        this.left_lower_left_switch = ins.readShort();
 
        this.left_lower_right_switch = ins.readShort();
 
        this.right_upper_switch = ins.readShort();
 
        this.right_lower_left_switch = ins.readShort();
 
        this.right_lower_right_switch = ins.readShort();
 
    }
 
    public lcmtypes.rc_command_lcmt copy()
    {
        lcmtypes.rc_command_lcmt outobj = new lcmtypes.rc_command_lcmt();
        outobj.mode = this.mode;
 
        outobj.left_stick = new float[(int) 2];
        System.arraycopy(this.left_stick, 0, outobj.left_stick, 0, 2); 
        outobj.right_stick = new float[(int) 2];
        System.arraycopy(this.right_stick, 0, outobj.right_stick, 0, 2); 
        outobj.knobs = new float[(int) 2];
        System.arraycopy(this.knobs, 0, outobj.knobs, 0, 2); 
        outobj.left_upper_switch = this.left_upper_switch;
 
        outobj.left_lower_left_switch = this.left_lower_left_switch;
 
        outobj.left_lower_right_switch = this.left_lower_right_switch;
 
        outobj.right_upper_switch = this.right_upper_switch;
 
        outobj.right_lower_left_switch = this.right_lower_left_switch;
 
        outobj.right_lower_right_switch = this.right_lower_right_switch;
 
        return outobj;
    }
 
}

