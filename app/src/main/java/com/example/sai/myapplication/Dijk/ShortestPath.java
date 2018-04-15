package com.example.sai.myapplication.Dijk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sai.myapplication.MainActivity;
import com.example.sai.myapplication.R;

/**
 * Created by Sai on 28-Oct-17.
 */

public class ShortestPath extends Activity {
    public static String ans="";
    public static String finalans="";

    int answer[] = new int[V];
    static final int V=7;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int minDistance(int dist[], Boolean sptSet[])
    {
        int min = Integer.MAX_VALUE, min_index=-1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }


    void printSolution(int dist[], int n,int pres[],int src,int dest)
    {
       // int answer[] = new int[V];
        Log.d("shree",src+"");
        Log.d("shree",dest+"");
        Log.d("shreya","Vertex   Distance from Source");

        for (int i = 0; i < V; i++)
        {

            Log.d("shreya",i+""+"tt"+dist[i]+"");
        }

        int g=dest;

        ans=g+"-->";
        if(g==0)
        {
            finalans+="Nashik<--";
        }
        else if(g==1)
        {
            finalans+="Mumbai<--";
        }

        else if(g==2)
        {
            finalans+="Chennai<--";
        }

        else if(g==3)
        {
            finalans+="Surat<--";
        }

        else if(g==4)
        {
            finalans+="Bangalore<--";
        }

        else if(g==5)
        {
            finalans+="Nagpur<--";
        }

        else if(g==6)
        {
            finalans+="Goa<--";
        }
            int current;
            int i=0;
   //     String temp=g+"";

        Log.d("shrey","path:::");
            current=g;
            Log.d("shrey",(g)+"");
            do {

                String a=String.valueOf(pres[current]);

                if(a.equals("1"))
                {
                    finalans+="Mumbai<--";
                }
                else if(a.equals("2"))
                {
                    finalans+="Chennai<--";
                }

                else if(a.equals("3"))
                {
                    finalans+="Surat<--";
                }

                else if(a.equals("4"))
                {
                    finalans+="Bangalore<--";
                }

                else if(a.equals("5"))
                {
                    finalans+="Nagpur<--";
                }

                else if(a.equals("6"))
                {
                    finalans+="Goa<--";
                }

                else if(a.equals("0"))
                {
                    finalans+="Nashik<--";
                }

                ans=ans+"<--"+a;
                answer[i]=pres[current];
                i++;
                current=pres[current];
            }while(current!=src);

        Log.d("shrey",ans);
        //Intent intent=new Intent(this, MainActivity.class);
        //intent.putExtra("ans",ans);
        //startActivity(intent);



    }





    void dijkstra(int graph[][], int src,int dest)
    {
        int dist[] = new int[V];
        int pres[]=new int[V];
        Boolean sptSet[] = new Boolean[V];


        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[src] = 0;
        pres[src]=src;

        for (int count = 0; count < V-1; count++)
        {
            int u = minDistance(dist, sptSet);

            sptSet[u] = true;

            for (int v = 0; v < V; v++)

                if (!sptSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    pres[v]=u;
                }
        }


        printSolution(dist, V,pres,src,dest);
    }



}
