/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package lcmtypes;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class state_estimator_sim2real implements lcm.lcm.LCMEncodable
{
    public float p[];
    public float vWorld[];
    public float vBody[];
    public float rpy[];
    public float omegaBody[];
    public float omegaWorld[];
    public float quat[];
    public float contact_estimate[];
    public float aBody[];
    public float aWorld[];
    public long timestamp_us;
    public long id;
    public long robot_id;
 
    public state_estimator_sim2real()
    {
        p = new float[3];
        vWorld = new float[3];
        vBody = new float[3];
        rpy = new float[3];
        omegaBody = new float[3];
        omegaWorld = new float[3];
        quat = new float[4];
        contact_estimate = new float[4];
        aBody = new float[3];
        aWorld = new float[3];
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xea87c8282effe5b6L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(lcmtypes.state_estimator_sim2real.class))
            return 0L;
 
        classes.add(lcmtypes.state_estimator_sim2real.class);
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
        for (int a = 0; a < 3; a++) {
            outs.writeFloat(this.p[a]); 
        }
 
        for (int a = 0; a < 3; a++) {
            outs.writeFloat(this.vWorld[a]); 
        }
 
        for (int a = 0; a < 3; a++) {
            outs.writeFloat(this.vBody[a]); 
        }
 
        for (int a = 0; a < 3; a++) {
            outs.writeFloat(this.rpy[a]); 
        }
 
        for (int a = 0; a < 3; a++) {
            outs.writeFloat(this.omegaBody[a]); 
        }
 
        for (int a = 0; a < 3; a++) {
            outs.writeFloat(this.omegaWorld[a]); 
        }
 
        for (int a = 0; a < 4; a++) {
            outs.writeFloat(this.quat[a]); 
        }
 
        for (int a = 0; a < 4; a++) {
            outs.writeFloat(this.contact_estimate[a]); 
        }
 
        for (int a = 0; a < 3; a++) {
            outs.writeFloat(this.aBody[a]); 
        }
 
        for (int a = 0; a < 3; a++) {
            outs.writeFloat(this.aWorld[a]); 
        }
 
        outs.writeLong(this.timestamp_us); 
 
        outs.writeLong(this.id); 
 
        outs.writeLong(this.robot_id); 
 
    }
 
    public state_estimator_sim2real(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public state_estimator_sim2real(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static lcmtypes.state_estimator_sim2real _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        lcmtypes.state_estimator_sim2real o = new lcmtypes.state_estimator_sim2real();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.p = new float[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.p[a] = ins.readFloat();
        }
 
        this.vWorld = new float[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.vWorld[a] = ins.readFloat();
        }
 
        this.vBody = new float[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.vBody[a] = ins.readFloat();
        }
 
        this.rpy = new float[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.rpy[a] = ins.readFloat();
        }
 
        this.omegaBody = new float[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.omegaBody[a] = ins.readFloat();
        }
 
        this.omegaWorld = new float[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.omegaWorld[a] = ins.readFloat();
        }
 
        this.quat = new float[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.quat[a] = ins.readFloat();
        }
 
        this.contact_estimate = new float[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.contact_estimate[a] = ins.readFloat();
        }
 
        this.aBody = new float[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.aBody[a] = ins.readFloat();
        }
 
        this.aWorld = new float[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.aWorld[a] = ins.readFloat();
        }
 
        this.timestamp_us = ins.readLong();
 
        this.id = ins.readLong();
 
        this.robot_id = ins.readLong();
 
    }
 
    public lcmtypes.state_estimator_sim2real copy()
    {
        lcmtypes.state_estimator_sim2real outobj = new lcmtypes.state_estimator_sim2real();
        outobj.p = new float[(int) 3];
        System.arraycopy(this.p, 0, outobj.p, 0, 3); 
        outobj.vWorld = new float[(int) 3];
        System.arraycopy(this.vWorld, 0, outobj.vWorld, 0, 3); 
        outobj.vBody = new float[(int) 3];
        System.arraycopy(this.vBody, 0, outobj.vBody, 0, 3); 
        outobj.rpy = new float[(int) 3];
        System.arraycopy(this.rpy, 0, outobj.rpy, 0, 3); 
        outobj.omegaBody = new float[(int) 3];
        System.arraycopy(this.omegaBody, 0, outobj.omegaBody, 0, 3); 
        outobj.omegaWorld = new float[(int) 3];
        System.arraycopy(this.omegaWorld, 0, outobj.omegaWorld, 0, 3); 
        outobj.quat = new float[(int) 4];
        System.arraycopy(this.quat, 0, outobj.quat, 0, 4); 
        outobj.contact_estimate = new float[(int) 4];
        System.arraycopy(this.contact_estimate, 0, outobj.contact_estimate, 0, 4); 
        outobj.aBody = new float[(int) 3];
        System.arraycopy(this.aBody, 0, outobj.aBody, 0, 3); 
        outobj.aWorld = new float[(int) 3];
        System.arraycopy(this.aWorld, 0, outobj.aWorld, 0, 3); 
        outobj.timestamp_us = this.timestamp_us;
 
        outobj.id = this.id;
 
        outobj.robot_id = this.robot_id;
 
        return outobj;
    }
 
}

