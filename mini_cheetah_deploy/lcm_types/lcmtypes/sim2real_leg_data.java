/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package lcmtypes;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class sim2real_leg_data implements lcm.lcm.LCMEncodable
{
    public float q[];
    public float qd[];
    public float p[];
    public float v[];
    public float tau_est[];
    public long timestamp_us;
    public long id;
    public long robot_id;
 
    public sim2real_leg_data()
    {
        q = new float[12];
        qd = new float[12];
        p = new float[12];
        v = new float[12];
        tau_est = new float[12];
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xa9a928b534bfc487L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(lcmtypes.sim2real_leg_data.class))
            return 0L;
 
        classes.add(lcmtypes.sim2real_leg_data.class);
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
        for (int a = 0; a < 12; a++) {
            outs.writeFloat(this.q[a]); 
        }
 
        for (int a = 0; a < 12; a++) {
            outs.writeFloat(this.qd[a]); 
        }
 
        for (int a = 0; a < 12; a++) {
            outs.writeFloat(this.p[a]); 
        }
 
        for (int a = 0; a < 12; a++) {
            outs.writeFloat(this.v[a]); 
        }
 
        for (int a = 0; a < 12; a++) {
            outs.writeFloat(this.tau_est[a]); 
        }
 
        outs.writeLong(this.timestamp_us); 
 
        outs.writeLong(this.id); 
 
        outs.writeLong(this.robot_id); 
 
    }
 
    public sim2real_leg_data(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public sim2real_leg_data(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static lcmtypes.sim2real_leg_data _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        lcmtypes.sim2real_leg_data o = new lcmtypes.sim2real_leg_data();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.q = new float[(int) 12];
        for (int a = 0; a < 12; a++) {
            this.q[a] = ins.readFloat();
        }
 
        this.qd = new float[(int) 12];
        for (int a = 0; a < 12; a++) {
            this.qd[a] = ins.readFloat();
        }
 
        this.p = new float[(int) 12];
        for (int a = 0; a < 12; a++) {
            this.p[a] = ins.readFloat();
        }
 
        this.v = new float[(int) 12];
        for (int a = 0; a < 12; a++) {
            this.v[a] = ins.readFloat();
        }
 
        this.tau_est = new float[(int) 12];
        for (int a = 0; a < 12; a++) {
            this.tau_est[a] = ins.readFloat();
        }
 
        this.timestamp_us = ins.readLong();
 
        this.id = ins.readLong();
 
        this.robot_id = ins.readLong();
 
    }
 
    public lcmtypes.sim2real_leg_data copy()
    {
        lcmtypes.sim2real_leg_data outobj = new lcmtypes.sim2real_leg_data();
        outobj.q = new float[(int) 12];
        System.arraycopy(this.q, 0, outobj.q, 0, 12); 
        outobj.qd = new float[(int) 12];
        System.arraycopy(this.qd, 0, outobj.qd, 0, 12); 
        outobj.p = new float[(int) 12];
        System.arraycopy(this.p, 0, outobj.p, 0, 12); 
        outobj.v = new float[(int) 12];
        System.arraycopy(this.v, 0, outobj.v, 0, 12); 
        outobj.tau_est = new float[(int) 12];
        System.arraycopy(this.tau_est, 0, outobj.tau_est, 0, 12); 
        outobj.timestamp_us = this.timestamp_us;
 
        outobj.id = this.id;
 
        outobj.robot_id = this.robot_id;
 
        return outobj;
    }
 
}

