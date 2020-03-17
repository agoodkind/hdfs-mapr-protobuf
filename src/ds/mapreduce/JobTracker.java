package ds.mapreduce;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.ArrayList;

import ds.mapreduce.maprformat.JobSubmitRequest;
import ds.mapreduce.maprformat.DataNodeLocation;
import ds.mapreduce.maprformat.HeartBeatRequest;
import ds.mapreduce.maprformat.JobStatusRequest;
import ds.mapreduce.maprformat.JobStatusResponse;
import ds.mapreduce.maprformat.JobSubmitResponse;
import ds.mapreduce.maprformat.MapTaskInfo;
import ds.mapreduce.maprformat.ReducerTaskInfo;

public class JobTracker implements IJobTracker{

    protected Registry serverRegistry;

    public JobTracker(String addr,int p, String nn)
    {
        ip = addr;
        port = p;
        name = nn;
    }

    public class Job
    {
    }

    public class TaskData
    {
        int tid,jid;
    }

    public class MapTask extends TaskData
    {
    }

    public class ReduceTask extends TaskData
    {
    }

    public class DataNode
    {
    }

    private boolean findJobInQueue(ArrayList<Job> qt,int num)
    {
        return false;
    }

    private boolean findTaskInQueue(ArrayList<? extends TaskData> qt,int num)
    {
        return false;
    }

    private String printTaskId(ArrayList<? extends TaskData> qt)
    {
    }

    private String printList(ArrayList<String> qt)
    {
    }

    private boolean checkChunksForEmptyLocations(BlockLocationResponse blocresponse)
    {
        return true;
    }

    /* JobSubmitResponse jobSubmit(JobSubmitRequest) */
    public byte[] jobSubmit(byte[] inpdata) throws RemoteException
    {
        try
        {

        }catch(Exception e)
        {
            System.out.println("Error " + e.toString());
            e.printStackTrace();
            response.setStatus(-1);
        }		

        return response.build().toByteArray();
    }

    /* JobStatusResponse getJobStatus(JobStatusRequest) */
    public byte[] getJobStatus(byte[] inpdata) throws RemoteException
    {
        try
        {
            response.setStatus(1);

        }
        catch(Exception e)
        {
            System.out.println("Error " + e.toString());
            e.printStackTrace();
            response.setStatus(-1);
        }

        return response.build().toByteArray();
    }

    /* HeartBeatResponse heartBeat(HeartBeatRequest) */
    public byte[] heartBeat(byte[] inpdata) throws RemoteException
    {
        try
        {

        }catch(Exception e)
        {
            System.out.println("Error " + e.toString());
            e.printStackTrace();
            response.setStatus(-1);
        }

        return response.build().toByteArray();
    }

    public static void main(String[] args) throws NumberFormatException, IOException
    {
        //Add your things here
    }
}
